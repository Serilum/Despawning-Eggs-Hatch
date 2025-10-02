package com.natamus.despawningeggshatch.forge.events;

import com.natamus.despawningeggshatch.events.EggEvent;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraftforge.event.entity.item.ItemExpireEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

import java.lang.invoke.MethodHandles;

public class ForgeEggEvent {
	public static void registerEventsInBus() {
		// BusGroup.DEFAULT.register(MethodHandles.lookup(), ForgeEggEvent.class);

		ItemExpireEvent.BUS.addListener(ForgeEggEvent::onItemExpire);
	}

	@SubscribeEvent
	public static void onItemExpire(ItemExpireEvent e) {
		ItemEntity itemEntity = e.getEntity();
		EggEvent.onItemExpire(itemEntity, itemEntity.getItem());
	}
}
