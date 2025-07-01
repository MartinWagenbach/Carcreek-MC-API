package de.carcreek;

import java.util.UUID;

import org.bukkit.entity.Player;

public abstract class User {

    private final Player PLAYER;
    private final UUID UUID;

    public User(Player player) {
        this.PLAYER = player;
        this.UUID = player.getUniqueId();
    }

    public Player getPlayer() {
        return PLAYER;
    }

    public UUID getUuid() {
        return UUID;
    }
}
