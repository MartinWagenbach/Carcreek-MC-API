package de.carcreek;

import org.bukkit.plugin.java.JavaPlugin;

public class CarcreekMcApi extends JavaPlugin {

    private static CarcreekMcApi INSTANCE;
    
    public CarcreekMcApi getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public void onEnable() {
        INSTANCE = this;
    }
}
