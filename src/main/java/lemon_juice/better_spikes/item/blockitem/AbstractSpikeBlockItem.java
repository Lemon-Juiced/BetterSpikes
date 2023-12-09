package lemon_juice.better_spikes.item.blockitem;

import lemon_juice.better_spikes.spiketype.SpikeType;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AbstractSpikeBlockItem extends BlockItem {
    private SpikeType spikeType;

    public AbstractSpikeBlockItem(Block block, Properties properties, SpikeType spikeType) {
        super(block, properties);
        this.spikeType = spikeType;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        // Lethality
        if(spikeType.sfl()) components.add(Component.translatable("tooltip.better_spikes.sfl"));
        else components.add(Component.translatable("tooltip.better_spikes.nsfl"));

        // Tier
        components.add(Component.translatable("tooltip.better_spikes.tier").append(String.valueOf(spikeType.tier())));

        // Damage Bonus
        components.add(Component.translatable("tooltip.better_spikes.damage_bonus").append(String.valueOf(spikeType.damageBonus())));

        // Speed
        components.add(Component.translatable("tooltip.better_spikes.speed").append(String.valueOf(spikeType.speed())));

        super.appendHoverText(itemStack, level, components, flag);
    }
}
