package io.github.sefiraat.networks.events;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;

public class NetworkCraftEvent extends PlayerEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    private final SlimefunItem machine;
    private final ItemStack[] input;
    private ItemStack output;
    private boolean cancelled;

    public NetworkCraftEvent(Player p, SlimefunItem machine, ItemStack[] input, ItemStack output) {
        super(p);
        
        this.input = input;
        this.output = output;
        this.machine = machine;
    }

    public @Nonnull ItemStack[] getInput() {
        return this.input;
    }

    public @Nonnull ItemStack getOutput() {
        return this.output;
    }

    public @Nullable ItemStack setOutput(@Nullable ItemStack output) {
        ItemStack oldOutput = this.output;
        this.output = output;
        return oldOutput;
    }

    public SlimefunItem getMachine() {
        return this.machine;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    public static @Nonnull HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public HandlerList getHandlers() {
        return getHandlerList();
    }
}
