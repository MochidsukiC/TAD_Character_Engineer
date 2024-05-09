package jp.houlab.mochidsuki.tad_character_engineer;

import org.bukkit.plugin.java.JavaPlugin;

public final class TAD_Character_Engineer extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        //Event
        getServer().getPluginManager().registerEvents(new Listener(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
