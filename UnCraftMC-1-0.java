package me.fuzzie.uncraftmc;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        // send message to console
        Bukkit.getLogger().info(ChatColor.GREEN + "MelonCrafter Has Been Enabled!");



        // melon crafting recipe

        ItemStack melons = new ItemStack(Material.MELON_SLICE, 9);

        ShapedRecipe melonSlices = new ShapedRecipe(melons);

        melonSlices.shape("*");

        melonSlices.setIngredient('*', Material.MELON);

        getServer().addRecipe(melonSlices);

        // nether wart block

        ItemStack nw = new ItemStack(Material.NETHER_WART, 9);

        ShapedRecipe nwb = new ShapedRecipe(nw);

        nwb.shape("*");

        nwb.setIngredient('*', Material.NETHER_WART_BLOCK);

        getServer().addRecipe(nwb);

        // glowstone block

        ItemStack glowStoneDust = new ItemStack(Material.GLOWSTONE_DUST, 4);

        ShapedRecipe glowStoneBlock = new ShapedRecipe(glowStoneDust);

        glowStoneBlock.shape("*");

        glowStoneBlock.setIngredient('*', Material.GLOWSTONE);

        getServer().addRecipe(glowStoneBlock);

    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info(ChatColor.GREEN + "MelonCrafter " + ChatColor.RED + "Has Been Disabled");
    }
}
