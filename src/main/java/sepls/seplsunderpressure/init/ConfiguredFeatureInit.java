package sepls.seplsunderpressure.init;

import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import sepls.seplsunderpressure.SEPLSUnderPressure;

import java.util.List;
import java.util.function.Supplier;

public class ConfiguredFeatureInit {
    public static final DeferredRegister <ConfiguredFeature<?, ?>>  CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, SEPLSUnderPressure.MODID);

    private static final Supplier<List<OreConfiguration.TargetBlockState>> TIN_OVERWORLD_REPLACEMENT = Suppliers.memoize(() ->
            List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, BlockInit.TIN_ORE.get().defaultBlockState()),
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, BlockInit.TIN_ORE.get().defaultBlockState()) // currently no deepslate block made provided normal tin
            )
    );

    public static final RegistryObject<ConfiguredFeature<?,?>> TIN_ORE = CONFIGURED_FEATURES.register("tin_ore" ,
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(TIN_OVERWORLD_REPLACEMENT.get(), 10)));

}
