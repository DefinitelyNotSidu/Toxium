package me.DefinitelyNotSidu.Toxium.Items;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;


public class ToxiumSword extends JavaPlugin {

    public static ShapedRecipe sword() {
        ItemStack sword = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta meta = sword.getItemMeta();

        meta.setCustomModelData(6);
        meta.setDisplayName(ChatColor.RESET + "" + ChatColor.GREEN + "Toxium Sword");
        //TODO: damage
        sword.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(this, "toxium_sword");
        //to sie pierdoli, jak wrócę to zobaczę jak to obejść XD

        ShapedRecipe recipe = new ShapedRecipe(key, sword);

        recipe.shape(" I ", " I ", " S ");
        recipe.setIngredient('I', Material.IRON_INGOT);
        recipe.setIngredient('S', Material.STICK);



        return recipe;
    }


}
