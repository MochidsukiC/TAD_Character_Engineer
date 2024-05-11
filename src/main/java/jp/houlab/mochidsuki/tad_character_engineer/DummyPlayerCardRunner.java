package jp.houlab.mochidsuki.tad_character_engineer;

import jp.houlab.mochidsuki.toweraandd.TowerAandD;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.ItemDisplay;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import static jp.houlab.mochidsuki.tad_character_engineer.TAD_Character_Engineer.plugin;
import static jp.houlab.mochidsuki.toweraandd.TowerAandD.config;
import static jp.houlab.mochidsuki.toweraandd.V.*;

public class DummyPlayerCardRunner extends BukkitRunnable {

    ItemDisplay itemDisplay;
    Vector spawmVector;
    int times;

    public DummyPlayerCardRunner(ItemDisplay itemDisplay, Vector spawnVector){
        this.itemDisplay = itemDisplay;
        this.spawmVector = spawnVector;
    }

    @Override
    public void run() {
        Location location = spawmVector.setX(times).toLocation(plugin.getServer().getWorld(config.getString("World")));
        //itemDisplay.teleport(location);
        itemDisplay.setRotation(90,times*18);
    times++;

        if(location.getWorld().getBlockAt(location).getBlockData().getMaterial() != Material.AIR){

            cancel();
        }
    }
}

class DummyPlayerSystem extends BukkitRunnable{
    public int times;
    public DummyPlayerSystem(){

    }

    @Override
    public void run() {
        for()


        times++;

        if(times > TAD_Character_Engineer.config.getInt("DummyPlayerLivingTime")*20){
            cancel();
        }
    }
}