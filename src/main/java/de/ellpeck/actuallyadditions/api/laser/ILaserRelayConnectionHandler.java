/*
 * This file ("ILaserRelayConnectionHandler.java") is part of the Actually Additions mod for Minecraft.
 * It is created and owned by Ellpeck and distributed
 * under the Actually Additions License to be found at
 * http://ellpeck.de/actaddlicense
 * View the source code at https://github.com/Ellpeck/ActuallyAdditions
 *
 * © 2015-2016 Ellpeck
 */

package de.ellpeck.actuallyadditions.api.laser;

import io.netty.util.internal.ConcurrentSet;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * This is the internal laser relay connection handler.
 * Use ActuallyAdditionsAPI.connectionHandler for calling
 * This is not supposed to be implemented.
 * <p>
 * The network system is built in a way that doesn't need the individual
 * positions to be Laser Relays, it relies only on BlockPos
 */
public interface ILaserRelayConnectionHandler{

    ConcurrentSet<ConnectionPair> getConnectionsFor(BlockPos relay, World world);

    void removeRelayFromNetwork(BlockPos relay, World world);

    Network getNetworkFor(BlockPos relay, World world);

    boolean addConnection(BlockPos firstRelay, BlockPos secondRelay, World world);

    boolean addConnection(BlockPos firstRelay, BlockPos secondRelay, World world, boolean suppressConnectionRender);
}
