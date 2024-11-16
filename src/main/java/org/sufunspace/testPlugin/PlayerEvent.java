package org.sufunspace.testPlugin;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerEvent implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent playerJoinEvent){
        String name = playerJoinEvent.getPlayer().getName();
        Component welcome = Component.text("热烈欢迎 ")
                .append(Component.text(name, NamedTextColor.RED))
                .append(Component.text(" 进入服务器!"));
        playerJoinEvent.joinMessage(welcome);
    }
}
