package sepls.seplsunderpressure;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import sepls.seplsunderpressure.init.BlockInit;
import sepls.seplsunderpressure.init.ItemInit;

@Mod(SEPLSUnderPressure.MODID)

public class SEPLSUnderPressure {
    public static final String MODID = "seplsunderpressure";

    public SEPLSUnderPressure(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);
    }
}
