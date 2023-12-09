package lemon_juice.better_spikes.item;

import lemon_juice.better_spikes.BetterSpikes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BetterSpikesItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BetterSpikes.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
