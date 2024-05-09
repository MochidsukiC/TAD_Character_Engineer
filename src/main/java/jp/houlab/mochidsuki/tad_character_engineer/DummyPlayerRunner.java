package jp.houlab.mochidsuki.tad_character_engineer;

import jp.houlab.mochidsuki.toweraandd.TowerAandD;
import org.bukkit.Location;
import org.bukkit.entity.ItemDisplay;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;
import org.jetbrains.annotations.ApiStatus;

import static jp.houlab.mochidsuki.tad_character_engineer.TAD_Character_Engineer.plugin;
import static jp.houlab.mochidsuki.toweraandd.TowerAandD.config;

public class DummyPlayerRunner extends BukkitRunnable {

    ItemDisplay itemDisplay;
    Vector spawmVector;
    int times;

    public DummyPlayerRunner(ItemDisplay itemDisplay, Vector spawnVector){
        this.itemDisplay = itemDisplay;
        this.spawmVector = spawnVector;
    }

    @Override
    public void run() {
        //itemDisplay.teleport(spawmVector.setX(times).toLocation(plugin.getServer().getWorld(config.getString("World"))));
        itemDisplay.setRotation(90,times*18);
    times++;
    }
}
