package sepls.seplsunderpressure.init;

import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import sepls.seplsunderpressure.SEPLSUnderPressure;

import java.util.List;

public class PlacedFeatureInit {
    public  static final DeferredRegister <PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, SEPLSUnderPressure.MODID );

    public static final RegistryObject<PlacedFeature> TIN_ORE = PLACED_FEATURES.register("tin_ore",
            () -> new PlacedFeature(ConfiguredFeatureInit.TIN_ORE.getHolder().get(),
                    commonOrePlacement(40, HeightRangePlacement.triangle(
                            VerticalAnchor.bottom(),
                            VerticalAnchor.absolute(40))
                    )));

    private static List<PlacementModifier> commonOrePlacement(int countPerChunk, PlacementModifier height) {
        return orePlacement(CountPlacement.of(countPerChunk), height);
    }

    private static List<PlacementModifier> orePlacement(PlacementModifier count, PlacementModifier height) {
        return List.of(count, InSquarePlacement.spread(), height, BiomeFilter.biome());
    }



}
