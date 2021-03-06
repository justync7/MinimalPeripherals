package dan200.computercraft.api.network.wired;

import dan200.computercraft.api.peripheral.IPeripheral;

import javax.annotation.Nonnull;
import java.util.Map;

/**
 * Represents a change to the network object.
 */
public interface INetworkChange
{
    /**
     * A set of peripherals which have been removed. Note that there may be entries with the same name
     * may be in the added and removed set, but with a different peripheral.
     *
     * @return The set of removed peripherals.
     */
    @Nonnull
    Map<String, IPeripheral> peripheralsRemoved();

    /**
     * A set of peripherals which have been added. Note that there may be entries with the same name
     * may be in the added and removed set, but with a different peripheral.
     *
     * @return The set of added peripherals.
     */
    @Nonnull
    Map<String, IPeripheral> peripheralsAdded();
}
