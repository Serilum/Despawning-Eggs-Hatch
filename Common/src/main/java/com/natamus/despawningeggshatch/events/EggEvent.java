package com.natamus.despawningeggshatch.events;

import com.natamus.collective.data.GlobalVariables;
import com.natamus.despawningeggshatch.config.ConfigHandler;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityTypes;
import net.minecraft.world.entity.animal.chicken.Chicken;
import net.minecraft.world.entity.animal.chicken.ChickenVariant;
import net.minecraft.world.entity.animal.chicken.ChickenVariants;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HayBlock;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class EggEvent {
	public static void onItemExpire(ItemEntity entityitem, ItemStack itemStack) {
		Level world = entityitem.level();
		if (world.isClientSide()) {
			return;
		}
		
		ItemStack itemstack = entityitem.getItem();
		if (!isHatchableEgg(itemstack)) {
			return;
		}
		
		if (ConfigHandler.eggOnlyHatchesWhenOnTopOfHayBlock) {
			BlockPos blockpos = entityitem.blockPosition();
			Block belowblock = world.getBlockState(blockpos.below()).getBlock();
			if (!(belowblock instanceof HayBlock)) {
				return;
			}
		}
		
		double num = GlobalVariables.random.nextDouble();
		if (num <= ConfigHandler.eggWillHatchChance) {
			int itemamount = itemstack.getCount();
			
			int moblimit = ConfigHandler.onlyHatchIfLessChickensAroundThan;
			Vec3 iposvec = entityitem.position();
			
			int r = ConfigHandler.radiusEntityLimiterCheck;
			int chickencount = 0;

			for (Entity ne : world.getEntities(entityitem, new AABB(iposvec.x() - r, iposvec.y() - r, iposvec.z() - r, iposvec.x() + r, iposvec.y() + r, iposvec.z() + r))) {
				if (ne instanceof Chicken) {
					chickencount++;
				}
			}
			
			for (int n = 1; n <= itemamount; n++) {
				if (chickencount > moblimit) {
					return;
				}
				
				Chicken chicken = new Chicken(EntityTypes.CHICKEN, world);
				Holder<ChickenVariant> chickenVariant = world.registryAccess().lookupOrThrow(Registries.CHICKEN_VARIANT).getOrThrow(ChickenVariants.TEMPERATE);
				if (itemstack.getItem().equals(Items.BLUE_EGG)) {
					chickenVariant = world.registryAccess().lookupOrThrow(Registries.CHICKEN_VARIANT).getOrThrow(ChickenVariants.COLD);
				} else if (itemstack.getItem().equals(Items.BROWN_EGG)) {
					chickenVariant = world.registryAccess().lookupOrThrow(Registries.CHICKEN_VARIANT).getOrThrow(ChickenVariants.WARM);
				}
				chicken.setVariant(chickenVariant);
				chicken.setPos(iposvec.x, iposvec.y+1, iposvec.z);
				if (ConfigHandler.newHatchlingIsBaby) {
					chicken.setAge(-24000);
				}
				
				world.addFreshEntity(chicken);
				chickencount++;
			}
		}
	}

	private static boolean isHatchableEgg(ItemStack itemstack) {
		return itemstack.getItem().equals(Items.EGG)
			|| itemstack.getItem().equals(Items.BLUE_EGG)
			|| itemstack.getItem().equals(Items.BROWN_EGG);
	}
}
