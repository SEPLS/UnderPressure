package sepls.seplsunderpressure.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import sepls.seplsunderpressure.SEPLSUnderPressure;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SEPLSUnderPressure.MODID);

    public static final RegistryObject<Block> TIN_ORE = register("tin_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).friction(0.5f)),
                new Item.Properties().tab(CreativeModeTab.TAB_SEARCH));
    public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).friction(0.5f)));
    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).friction(0.5f)));
    public static final RegistryObject<Block> BLOCK_OF_LEAD = BLOCKS.register("block_of_lead", () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).friction(1f)));

    private static <T extends  Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemInit.ITEMS.register(name,() -> new BlockItem(block.get(),properties));
        return block;
    }

}
