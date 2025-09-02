package me.mantice.mythboard.addons;

import org.jetbrains.annotations.NotNull;

/**
 *
 * This defines a class as the main class of any addon.<br>
 * This class determines what happens when the addon is enabled or disabled.
 * <br><br>
 * When the MythBoard plugin is reloaded, the {@link MythBoardAddon#onDisable()} method<br>
 * is called, then {@link MythBoardAddon#onEnable()}, essentially restarting the addon.
 */
public interface MythBoardAddon {

    /**
     * Called when enabling the addon
     * @return <code>true</code> if the addon was enabled successfully, <code>false</code> if not
     */
    boolean onEnable();

    /**
     * Called when disabling the addon
     */
    void onDisable();

    /**
     * The ID of your addon, must be unique
     * @return {@link String}
     */
    @NotNull String getId();

    /**
     * The name of your addon
     * @return {@link String}
     */
    @NotNull String getName();

    /**
     * The author who made the addon
     * @return {@link String}
     */
    @NotNull String getAuthor();

}
