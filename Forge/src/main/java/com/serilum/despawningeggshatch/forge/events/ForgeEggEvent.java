package com.serilum.despawningeggshatch.forge.events;

import com.serilum.despawningeggshatch.events.EggEvent;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraftforge.event.entity.item.ItemExpireEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeEggEvent {
	@SubscribeEvent
	public static void onItemExpire(ItemExpireEvent e) {
		ItemEntity itemEntity = e.getEntity();
		EggEvent.onItemExpire(itemEntity, itemEntity.getItem());
	}
}
