package com.natamus.despawningeggshatch.events;

import com.natamus.collective.data.GlobalVariables;
import com.natamus.despawningeggshatch.config.ConfigHandler;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Chicken;
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
		if (world.isClientSide) {
			return;
		}
		
		ItemStack itemstack = entityitem.getItem();
		if (!itemstack.getItem().equals(Items.EGG)) {
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
				
				Chicken chicken = new Chicken(EntityType.CHICKEN, world);
				chicken.setPos(iposvec.x, iposvec.y+1, iposvec.z);
				if (ConfigHandler.newHatchlingIsBaby) {
					chicken.setAge(-24000);
				}
				
				world.addFreshEntity(chicken);
				chickencount++;
			}
		}
	}
}
