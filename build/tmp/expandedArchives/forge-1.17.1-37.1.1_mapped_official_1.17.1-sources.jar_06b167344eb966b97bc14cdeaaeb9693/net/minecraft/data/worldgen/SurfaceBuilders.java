package net.minecraft.data.worldgen;

import net.minecraft.data.BuiltinRegistries;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.level.levelgen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.level.levelgen.surfacebuilders.SurfaceBuilderBaseConfiguration;
import net.minecraft.world.level.levelgen.surfacebuilders.SurfaceBuilderConfiguration;

public class SurfaceBuilders {
   public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> BADLANDS = register("badlands", SurfaceBuilder.BADLANDS.configured(SurfaceBuilder.CONFIG_BADLANDS));
   public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> BASALT_DELTAS = register("basalt_deltas", SurfaceBuilder.BASALT_DELTAS.configured(SurfaceBuilder.CONFIG_BASALT_DELTAS));
   public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> CRIMSON_FOREST = register("crimson_forest", SurfaceBuilder.NETHER_FOREST.configured(SurfaceBuilder.CONFIG_CRIMSON_FOREST));
   public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> DESERT = register("desert", SurfaceBuilder.DEFAULT.configured(SurfaceBuilder.CONFIG_DESERT));
   public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> END = register("end", SurfaceBuilder.DEFAULT.configured(SurfaceBuilder.CONFIG_THEEND));
   public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> ERODED_BADLANDS = register("eroded_badlands", SurfaceBuilder.ERODED_BADLANDS.configured(SurfaceBuilder.CONFIG_BADLANDS));
   public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> FROZEN_OCEAN = register("frozen_ocean", SurfaceBuilder.FROZEN_OCEAN.configured(SurfaceBuilder.CONFIG_GRASS));
   public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> FULL_SAND = register("full_sand", SurfaceBuilder.DEFAULT.configured(SurfaceBuilder.CONFIG_FULL_SAND));
   public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> GIANT_TREE_TAIGA = register("giant_tree_taiga", SurfaceBuilder.GIANT_TREE_TAIGA.configured(SurfaceBuilder.CONFIG_GRASS));
   public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> GRASS = register("grass", SurfaceBuilder.DEFAULT.configured(SurfaceBuilder.CONFIG_GRASS));
   public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> GRAVELLY_MOUNTAIN = register("gravelly_mountain", SurfaceBuilder.GRAVELLY_MOUNTAIN.configured(SurfaceBuilder.CONFIG_GRASS));
   public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> ICE_SPIKES = register("ice_spikes", SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderBaseConfiguration(Blocks.SNOW_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState(), Blocks.GRAVEL.defaultBlockState())));
   public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> MOUNTAIN = register("mountain", SurfaceBuilder.MOUNTAIN.configured(SurfaceBuilder.CONFIG_GRASS));
   public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> MYCELIUM = register("mycelium", SurfaceBuilder.DEFAULT.configured(SurfaceBuilder.CONFIG_MYCELIUM));
   public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> NETHER = register("nether", SurfaceBuilder.NETHER.configured(SurfaceBuilder.CONFIG_HELL));
   public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> NOPE = register("nope", SurfaceBuilder.NOPE.configured(SurfaceBuilder.CONFIG_STONE));
   public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> OCEAN_SAND = register("ocean_sand", SurfaceBuilder.DEFAULT.configured(SurfaceBuilder.CONFIG_OCEAN_SAND));
   public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> SHATTERED_SAVANNA = register("shattered_savanna", SurfaceBuilder.SHATTERED_SAVANNA.configured(SurfaceBuilder.CONFIG_GRASS));
   public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> SOUL_SAND_VALLEY = register("soul_sand_valley", SurfaceBuilder.SOUL_SAND_VALLEY.configured(SurfaceBuilder.CONFIG_SOUL_SAND_VALLEY));
   public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> STONE = register("stone", SurfaceBuilder.DEFAULT.configured(SurfaceBuilder.CONFIG_STONE));
   public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> SWAMP = register("swamp", SurfaceBuilder.SWAMP.configured(SurfaceBuilder.CONFIG_GRASS));
   public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> WARPED_FOREST = register("warped_forest", SurfaceBuilder.NETHER_FOREST.configured(SurfaceBuilder.CONFIG_WARPED_FOREST));
   public static final ConfiguredSurfaceBuilder<SurfaceBuilderBaseConfiguration> WOODED_BADLANDS = register("wooded_badlands", SurfaceBuilder.WOODED_BADLANDS.configured(SurfaceBuilder.CONFIG_BADLANDS));

   private static <SC extends SurfaceBuilderConfiguration> ConfiguredSurfaceBuilder<SC> register(String p_127301_, ConfiguredSurfaceBuilder<SC> p_127302_) {
      return BuiltinRegistries.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, p_127301_, p_127302_);
   }
}