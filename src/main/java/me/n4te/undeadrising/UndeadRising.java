package me.n4te.undeadrising;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

public class UndeadRising extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // register the listener
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("Plugin loaded.");
    }

    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        if (event.getEntityType() == EntityType.ZOMBIE) {
            Random rand = new Random();
            int chance = rand.nextInt(100);
            if (chance < 99) {
                Zombie zombie = (Zombie) event.getEntity();
                zombie.setCustomName("Infected");
                zombie.setCustomNameVisible(true);
            }
        }
    }
}
