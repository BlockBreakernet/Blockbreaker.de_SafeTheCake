package de.blockbreaker.stc.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;

/**
 * Created by Janne on 14.05.2015.
 */
public class JoinListener implements Listener{

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();

        Bukkit.broadcastMessage("�a" + p + " �7m�chte �aKuchen �bessen�7!");


    }
}
