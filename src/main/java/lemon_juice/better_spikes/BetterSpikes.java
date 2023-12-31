package lemon_juice.better_spikes;

import lemon_juice.better_spikes.block.BetterSpikesBlocks;
import lemon_juice.better_spikes.creativetab.BetterSpikesCreativeTab;
import lemon_juice.better_spikes.item.BetterSpikesItems;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(BetterSpikes.MOD_ID)
public class BetterSpikes {
    public static final String MOD_ID = "better_spikes";

    public BetterSpikes(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);

        // Register Items
        BetterSpikesItems.register(modEventBus);
        BetterSpikesBlocks.register(modEventBus);

        // Register Creative Tab
        BetterSpikesCreativeTab.register(modEventBus);
        modEventBus.addListener(BetterSpikesCreativeTab::registerTabs);

        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event){}

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}
    }
}
