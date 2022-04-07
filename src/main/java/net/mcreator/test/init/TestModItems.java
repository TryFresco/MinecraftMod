
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.test.item.ScoobysnaclItem;
import net.mcreator.test.item.HulkArmorItem;
import net.mcreator.test.item.BlackSquareItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TestModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item BLACK_SQUARE = register(new BlackSquareItem());
	public static final Item SCOOBYSNACK = register(new ScoobysnaclItem());
	public static final Item HULK_ARMOR_HELMET = register(new HulkArmorItem.Helmet());
	public static final Item HULK_ARMOR_CHESTPLATE = register(new HulkArmorItem.Chestplate());
	public static final Item HULK_ARMOR_LEGGINGS = register(new HulkArmorItem.Leggings());
	public static final Item HULK_ARMOR_BOOTS = register(new HulkArmorItem.Boots());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
