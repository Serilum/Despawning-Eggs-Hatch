package com.natamus.despawningeggshatch.forge.events;

import com.natamus.despawningeggshatch.events.EggEvent;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraftforge.event.entity.item.ItemExpireEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ForgeEggEvent {
	@SubscribeEvent
	public void onItemExpire(ItemExpireEvent e) {
		ItemEntity itemEntity = e.getEntity();
		EggEvent.onItemExpire(itemEntity, itemEntity.getItem());
	}
}
