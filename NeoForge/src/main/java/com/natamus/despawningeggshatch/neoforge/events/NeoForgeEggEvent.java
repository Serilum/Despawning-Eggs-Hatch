package com.natamus.despawningeggshatch.neoforge.events;

import com.natamus.despawningeggshatch.events.EggEvent;
import net.minecraft.world.entity.item.ItemEntity;
import net.neoforged.neoforge.event.entity.item.ItemExpireEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class NeoForgeEggEvent {
	@SubscribeEvent
	public static void onItemExpire(ItemExpireEvent e) {
		ItemEntity itemEntity = e.getEntity();
		EggEvent.onItemExpire(itemEntity, itemEntity.getItem());
	}
}
