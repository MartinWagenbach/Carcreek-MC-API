package de.carcreek;

import org.bukkit.plugin.java.JavaPlugin;

public class CarcreekMcApi extends JavaPlugin {

    private static CarcreekMcApi INSTANCE;

    public static CarcreekMcApi getInstance() {
        return INSTANCE;
    }

    @Override
    public void onEnable() {
        INSTANCE = this;
    }
}
