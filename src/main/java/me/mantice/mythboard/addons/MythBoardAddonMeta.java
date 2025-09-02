package me.mantice.mythboard.addons;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A wrapper of information regarding a {@link MythBoardAddon}
 */
public interface MythBoardAddonMeta {

    /**
     * Returns the addon's ID
     * @return {@link String}
     */
    @NotNull String getId();

    /**
     * Returns the addon's author
     * @return {@link String}
     */
    @NotNull String getAuthor();

    /**
     * Returns the addon's name
     * @return {@link String}
     */
    @NotNull String getName();

    /**
     * Returns the plugin that registered the addon (if any)
     * @return {@link String} plugin name, or <code>null</code> if no plugin registered the addon
     */
    @Nullable String getPluginName();

}
