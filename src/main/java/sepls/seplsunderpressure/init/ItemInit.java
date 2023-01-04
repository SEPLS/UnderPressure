package sepls.seplsunderpressure.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import sepls.seplsunderpressure.SEPLSUnderPressure;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SEPLSUnderPressure.MODID);

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_SEARCH)));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_SEARCH)));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_SEARCH)));
    public static final RegistryObject<Item> BRONZE_DUST = ITEMS.register("bronze_dust", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_SEARCH)));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_SEARCH)));
    public static final RegistryObject<Item> SILVER_DUST = ITEMS.register("silver_dust", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_SEARCH)));
    public static final RegistryObject<Item> LEAD_DUST = ITEMS.register("lead_dust", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_SEARCH)));
    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_SEARCH)));
    public static final RegistryObject<Item> TIN_DUST = ITEMS.register("tin_dust", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_SEARCH)));
    public static final RegistryObject<BlockItem> Tin_ore_item = ITEMS.register("tin_ore", () -> new BlockItem(BlockInit.TIN_ORE.get(),new Item.Properties().tab(CreativeModeTab.TAB_SEARCH)));



}
