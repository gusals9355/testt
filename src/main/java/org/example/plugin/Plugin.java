package org.example.plugin;


import org.bukkit.plugin.java.JavaPlugin;

import java.awt.print.Paper;

public class Plugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("test success");
    }

}
