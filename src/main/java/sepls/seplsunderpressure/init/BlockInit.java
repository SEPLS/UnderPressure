package sepls.seplsunderpressure.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import sepls.seplsunderpressure.SEPLSUnderPressure;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SEPLSUnderPressure.MODID);

    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).friction(0.5f)));
    public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).friction(0.5f)));
    public static final RegistryObject<Block> BLOCK_OF_LEAD = BLOCKS.register("block_of_lead", () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).friction(1f)));
}
