
package net.mcreator.test.item;

import net.minecraft.sounds.SoundEvent;

public abstract class HulkArmorItem extends ArmorItem {

	public HulkArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 40;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{5, 8, 10, 5}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.EMERALD));
			}

			@Override
			public String getName() {
				return "hulk_armor";
			}

			@Override
			public float getToughness() {
				return 1f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.3f;
			}
		}, slot, properties);
	}

	public static class Helmet extends HulkArmorItem {

		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));

			setRegistryName("hulk_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "test_:textures/models/armor/hulk_test_layer_1.png";
		}

	}

	public static class Chestplate extends HulkArmorItem {

		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));

			setRegistryName("hulk_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "test_:textures/models/armor/hulk_test_layer_1.png";
		}

	}

	public static class Leggings extends HulkArmorItem {

		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));

			setRegistryName("hulk_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "test_:textures/models/armor/hulk_test_layer_2.png";
		}

	}

	public static class Boots extends HulkArmorItem {

		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));

			setRegistryName("hulk_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "test_:textures/models/armor/hulk_test_layer_1.png";
		}

	}

}
