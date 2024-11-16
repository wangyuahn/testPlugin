package org.sufunspace.testPlugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("MINECRAFT PLUGIN!");
        System.out.println("WRITER: SUDDEN");
        System.out.println("THANKS FOR YOU PLAYING");
        System.out.println("!!where the dream begins!!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}