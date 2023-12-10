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

    // Tier 1 SFL
    public static final DeferredBlock<Block> OAK_SPIKE = registerSpikeBlock("oak_spike", SpikeTypes.WOOD_SPIKE, () -> new SFLSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD), 0));
    public static final DeferredBlock<Block> SPRUCE_SPIKE = registerSpikeBlock("spruce_spike", SpikeTypes.WOOD_SPIKE, () -> new SFLSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD), 0));
    public static final DeferredBlock<Block> BIRCH_SPIKE = registerSpikeBlock("birch_spike", SpikeTypes.WOOD_SPIKE,  () -> new SFLSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD), 0));
    public static final DeferredBlock<Block> JUNGLE_SPIKE = registerSpikeBlock("jungle_spike", SpikeTypes.WOOD_SPIKE,  () -> new SFLSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD), 0));
    public static final DeferredBlock<Block> ACACIA_SPIKE = registerSpikeBlock("acacia_spike", SpikeTypes.WOOD_SPIKE,  () -> new SFLSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD), 0));
    public static final DeferredBlock<Block> DARK_OAK_SPIKE = registerSpikeBlock("dark_oak_spike", SpikeTypes.WOOD_SPIKE,  () -> new SFLSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD), 0));
    public static final DeferredBlock<Block> MANGROVE_SPIKE = registerSpikeBlock("mangrove_spike", SpikeTypes.WOOD_SPIKE,  () -> new SFLSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD), 0));
    public static final DeferredBlock<Block> CHERRY_SPIKE = registerSpikeBlock("cherry_spike", SpikeTypes.WOOD_SPIKE,  () -> new SFLSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD), 0));
    public static final DeferredBlock<Block> BAMBOO_SPIKE = registerSpikeBlock("bamboo_spike", SpikeTypes.WOOD_SPIKE,  () -> new SFLSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD), 0));

    public static final DeferredBlock<Block> CRIMSON_SPIKE = registerSpikeBlock("crimson_spike", SpikeTypes.WOOD_SPIKE,  () -> new SFLSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD), 0));
    public static final DeferredBlock<Block> WARPED_SPIKE = registerSpikeBlock("warped_spike", SpikeTypes.WOOD_SPIKE,  () -> new SFLSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD), 0));

    // Tier 1 NSFL
    public static final DeferredBlock<Block> STONE_SPIKE = registerSpikeBlock("stone_spike", SpikeTypes.STONE_SPIKE, () -> new AbstractSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 0));
    public static final DeferredBlock<Block> GRANITE_SPIKE = registerSpikeBlock("granite_spike", SpikeTypes.STONE_SPIKE, () -> new AbstractSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DIRT).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 0));
    public static final DeferredBlock<Block> DIORITE_SPIKE = registerSpikeBlock("diorite_spike", SpikeTypes.STONE_SPIKE,  () -> new AbstractSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.QUARTZ).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 0));
    public static final DeferredBlock<Block> ANDESITE_SPIKE = registerSpikeBlock("andesite_spike", SpikeTypes.STONE_SPIKE,  () -> new AbstractSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 0));
    public static final DeferredBlock<Block> DEEPSLATE_SPIKE = registerSpikeBlock("deepslate_spike", SpikeTypes.STONE_SPIKE,  () -> new AbstractSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.DEEPSLATE), 0));
    public static final DeferredBlock<Block> TUFF_SPIKE = registerSpikeBlock("tuff_spike", SpikeTypes.STONE_SPIKE,  () -> new AbstractSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_GRAY).instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.TUFF).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 0));

    public static final DeferredBlock<Block> NETHERRACK_SPIKE = registerSpikeBlock("netherrack_spike", SpikeTypes.STONE_SPIKE,  () -> new AbstractSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.NETHER).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(0.4F).sound(SoundType.NETHERRACK), 0));
    public static final DeferredBlock<Block> BASALT_SPIKE = registerSpikeBlock("basalt_spike", SpikeTypes.STONE_SPIKE,  () -> new AbstractSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.25F, 4.2F).sound(SoundType.BASALT), 0));
    public static final DeferredBlock<Block> BLACKSTONE_SPIKE = registerSpikeBlock("blackstone_spike", SpikeTypes.STONE_SPIKE,  () -> new AbstractSpikeBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 0));

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
