package lemon_juice.better_spikes.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

/**
 * An abstract representation of a SpikeBlock, having all the basic qualities of any spike block.
 */
public class AbstractSpikeBlock extends Block {
    private static final float HURT_SPEED_THRESHOLD = 0.003F;
    private static final VoxelShape SAPLING_SHAPE;

    public AbstractSpikeBlock(Properties properties) {
        super(properties);
    }

    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext context) {
        return SAPLING_SHAPE;
    }

    public void entityInside(BlockState blockState, Level level, BlockPos blockPos, Entity entity) {
        entity.hurt(level.damageSources().cactus(), 1.0F);
    }

    static {
        SAPLING_SHAPE = Block.box(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
    }
}
