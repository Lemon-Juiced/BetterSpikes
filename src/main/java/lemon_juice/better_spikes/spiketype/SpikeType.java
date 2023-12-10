package lemon_juice.better_spikes.spiketype;

/**
 * A <code>record</code> to keep track of types of Spikes with similar qualities for re-use, stored in SpikeTypes
 *
 * @param sfl true if the Spike is "Safe For Life" (a.k.a. it does not kill), false otherwise
 * @param tier A numerical representation of the tier of the spike
 * @param damageBonus The bonus added to the damage applied by the spike
 * @param speed The speed at which the spike applies damage
 */
public record SpikeType(boolean sfl, int tier, int damageBonus, float speed) {}
