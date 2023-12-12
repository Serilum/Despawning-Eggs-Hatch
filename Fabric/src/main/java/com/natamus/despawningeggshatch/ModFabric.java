package com.natamus.despawningeggshatch;

import com.natamus.collective.check.RegisterMod;
import com.natamus.collective.fabric.callbacks.CollectiveItemEvents;
import com.natamus.despawningeggshatch.events.EggEvent;
import com.natamus.despawningeggshatch.util.Reference;
import net.fabricmc.api.ModInitializer;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;

public class ModFabric implements ModInitializer {
	
	@Override
	public void onInitialize() {
		setGlobalConstants();
		ModCommon.init();

		loadEvents();

		RegisterMod.register(Reference.NAME, Reference.MOD_ID, Reference.VERSION, Reference.ACCEPTED_VERSIONS);
	}

	private void loadEvents() {
		CollectiveItemEvents.ON_ITEM_EXPIRE.register((ItemEntity itemEntity, ItemStack itemStack) -> {
			EggEvent.onItemExpire(itemEntity, itemStack);
		});
	}

	private static void setGlobalConstants() {

	}
}
