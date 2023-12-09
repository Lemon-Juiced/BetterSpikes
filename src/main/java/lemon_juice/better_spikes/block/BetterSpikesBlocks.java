package lemon_juice.better_spikes.block;

import lemon_juice.better_spikes.BetterSpikes;
import lemon_juice.better_spikes.block.custom.AbstractSpikeBlock;
import lemon_juice.better_spikes.block.custom.SFLSpikeBlock;
import lemon_juice.better_spikes.item.blockitem.AbstractSpikeBlockItem;
import lemon_juice.better_spikes.spiketype.SpikeType;
import lemon_juice.better_spikes.spiketype.SpikeTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static lemon_juice.better_spikes.item.BetterSpikesItems.ITEMS;

public class BetterSpikesBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(BetterSpikes.MOD_ID);

    public static final DeferredBlock<Block> OAK_SPIKE = registerSpikeBlock("oak_spike", SpikeTypes.WOOD_SPIKE, () -> new SFLSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> SPRUCE_SPIKE = registerSpikeBlock("spruce_spike", SpikeTypes.WOOD_SPIKE, () -> new SFLSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BIRCH_SPIKE = registerSpikeBlock("birch_spike", SpikeTypes.WOOD_SPIKE,  () -> new SFLSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> JUNGLE_SPIKE = registerSpikeBlock("jungle_spike", SpikeTypes.WOOD_SPIKE,  () -> new SFLSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> ACACIA_SPIKE = registerSpikeBlock("acacia_spike", SpikeTypes.WOOD_SPIKE,  () -> new SFLSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> DARK_OAK_SPIKE = registerSpikeBlock("dark_oak_spike", SpikeTypes.WOOD_SPIKE,  () -> new SFLSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> MANGROVE_SPIKE = registerSpikeBlock("mangrove_spike", SpikeTypes.WOOD_SPIKE,  () -> new SFLSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHERRY_SPIKE = registerSpikeBlock("cherry_spike", SpikeTypes.WOOD_SPIKE,  () -> new SFLSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> BAMBOO_SPIKE = registerSpikeBlock("bamboo_spike", SpikeTypes.WOOD_SPIKE,  () -> new SFLSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> CRIMSON_SPIKE = registerSpikeBlock("crimson_spike", SpikeTypes.WOOD_SPIKE,  () -> new SFLSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> WARPED_SPIKE = registerSpikeBlock("warped_spike", SpikeTypes.WOOD_SPIKE,  () -> new SFLSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD)));



    // Registry
    public static <T extends Block> DeferredBlock<Block> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<Block> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> DeferredBlock<Block> registerSpikeBlock(String name, SpikeType spikeType, Supplier<T> block) {
        DeferredBlock<Block> toReturn = BLOCKS.register(name, block);
        registerSpikeBlockItem(name, toReturn, spikeType);
        return toReturn;
    }

    private static <T extends Block> DeferredBlock<Block> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> DeferredItem<BlockItem> registerBlockItem(String name, DeferredBlock<Block> block) {
        return ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> DeferredItem<BlockItem> registerSpikeBlockItem(String name, DeferredBlock<Block> block, SpikeType spikeType) {
        return ITEMS.register(name, () -> new AbstractSpikeBlockItem(block.get(), new Item.Properties(), spikeType));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
