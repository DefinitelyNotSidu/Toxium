package me.DefinitelyNotSidu.Toxium;

import me.DefinitelyNotSidu.Toxium.EventHandler.JoinEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import me.DefinitelyNotSidu.Toxium.Items.ToxiumSword;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new JoinEvent(), this);
        Bukkit.addRecipe(ToxiumSword.sword());
        //recka nie działa, jeszcze to poprawię XD bo się pierdolę żeby to zrobić w oddzielnych plikach xD
    }
    @Override
    public void onDisable() {

    }




}
