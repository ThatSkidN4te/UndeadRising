package me.n4te.undeadrising;

import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import java.util.Random;

public class UndeadRising implements Listener {
    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        if (event.getEntity() instanceof Zombie) {
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
