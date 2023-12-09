package lemon_juice.better_spikes.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

/**
 * A "Safe For Life" version of the <code>AbstractSpikeBlock</code> that does not kill <code>Entity</code>s
 */
public class SFLSpikeBlock extends AbstractSpikeBlock{
    public SFLSpikeBlock(Properties properties) {
        super(properties);
    }

    public void entityInside(BlockState blockState, Level level, BlockPos blockPos, Entity entity) {
        // This for some reason works, because everything is broken up into smaller steps.
        // To Do: Look for a way to make this slightly more concise.
        if(entity instanceof LivingEntity) {
            LivingEntity livingEntity = (LivingEntity) entity;
            float livingEntityHealth = livingEntity.getHealth();
            boolean entityCanReceiveDamage = true;
            if (livingEntityHealth <= 1.0F) entityCanReceiveDamage = false;
            if(entityCanReceiveDamage) livingEntity.hurt(level.damageSources().cactus(), 1.0F);
        }

        // This only accounts for players for some reason
        //if(entity instanceof LivingEntity livingEntity && livingEntity.getHealth() >= 1){
        //    entity.hurt(level.damageSources().cactus(), 1.0F);
        //}
    }
}
