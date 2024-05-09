package jp.houlab.mochidsuki.tad_character_engineer;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class TAD_Character_Engineer extends JavaPlugin {

    public static Plugin plugin;
    @Override
    public void onEnable() {
        // Plugin startup logic

        //Event
        getServer().getPluginManager().registerEvents(new Listener(),this);
        plugin = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
