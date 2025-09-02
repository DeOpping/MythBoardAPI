package me.mantice.mythboard.addons;

import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public interface AddonManager {

    /**
     * Check if a specific addon is enabled
     * @param addonId {@link String}
     * @return <code>true</code> if enabled, <code>false</code> if disabled or not registered
     */
    boolean isAddonEnabled(final @NotNull String addonId);

    /**
     * Get the author of any registered addon
     * @param addonId {@link String}
     * @return {@link String}
     */
    @NotNull String getAddonAuthor(final @NotNull String addonId);

    /**
     * Manually register an addon to the {@link AddonManager} from YOUR plugin!<br>
     * This means you're creating an addon inside your own plugin, not just a simple addon jar.<br><br>
     * Addons placed inside MythBoard's addons folder are registered automatically and DO NOT need to call this method.
     * @param addon The {@link MythBoardAddon} to register
     * @param plugin The {@link JavaPlugin} providing the addon, can be <code>null</code>
     * @return <code>true</code> if the addon was registered successfully, <code>false</code> if there was already an addon with that ID
     */
    boolean register(final @NotNull MythBoardAddon addon, final @NotNull JavaPlugin plugin);

}
