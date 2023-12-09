package lemon_juice.better_spikes.creativetab;

import lemon_juice.better_spikes.BetterSpikes;
import lemon_juice.better_spikes.block.BetterSpikesBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BetterSpikesCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterSpikes.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BETTER_SPIKES_TAB = CREATIVE_MODE_TABS.register("better_spikes", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.better_spikes"))
            .icon(() -> new ItemStack(BetterSpikesBlocks.OAK_SPIKE))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == BETTER_SPIKES_TAB.get()) {
            event.accept(BetterSpikesBlocks.OAK_SPIKE.get());
            event.accept(BetterSpikesBlocks.SPRUCE_SPIKE.get());
            event.accept(BetterSpikesBlocks.BIRCH_SPIKE.get());
            event.accept(BetterSpikesBlocks.JUNGLE_SPIKE.get());
            event.accept(BetterSpikesBlocks.ACACIA_SPIKE.get());
            event.accept(BetterSpikesBlocks.DARK_OAK_SPIKE.get());
            event.accept(BetterSpikesBlocks.MANGROVE_SPIKE.get());
            event.accept(BetterSpikesBlocks.CHERRY_SPIKE.get());
            event.accept(BetterSpikesBlocks.BAMBOO_SPIKE.get());
            event.accept(BetterSpikesBlocks.CRIMSON_SPIKE.get());
            event.accept(BetterSpikesBlocks.WARPED_SPIKE.get());
        }
    }

    // Registry
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
