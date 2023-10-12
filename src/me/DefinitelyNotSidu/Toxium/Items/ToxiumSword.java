package me.DefinitelyNotSidu.Toxium.Items;



import me.DefinitelyNotSidu.Toxium.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.UUID;


public class ToxiumSword  {
        private final Main plugin;
        ItemStack sword;

        public ToxiumSword(Main plugin) {
                this.plugin = plugin;
                setupSword();
        }

        private void setupSword() {
                sword = new ItemStack(Material.NETHERITE_SWORD);

                ItemMeta meta = sword.getItemMeta();
                assert meta != null;
                meta.setDisplayName(ChatColor.RESET + "" + ChatColor.GREEN + "Toxium Sword");
                meta.setCustomModelData(21371);


                /*
                ponizej rozpoczyna sie cos co moze sie jebac - obrazenia xD
                 */

                /*
                RECKA
                 */
                NamespacedKey key = new NamespacedKey(plugin, "toxium_sword");
                ShapedRecipe recipe = new ShapedRecipe(key, sword);

                recipe.shape(" T ", " T ", " R ");

                recipe.setIngredient('T', Material.DIAMOND_BLOCK);
                recipe.setIngredient('R', Material.STICK);

                plugin.getServer().addRecipe(recipe);

        }
        public ItemStack getSword() { return sword; }









}
