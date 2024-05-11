package jp.houlab.mochidsuki.tad_character_engineer;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;


public final class TAD_Character_Engineer extends JavaPlugin {

    public static Plugin plugin;
    public static FileConfiguration config;
    @Override
    public void onEnable() {
        // Plugin startup logic

        //Event
        getServer().getPluginManager().registerEvents(new Listener(),this);
        plugin = this;

        //config
        saveDefaultConfig();
        config = getConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
