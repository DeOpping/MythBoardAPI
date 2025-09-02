package me.mantice.mythboard;

import me.mantice.mythboard.criteria.CriteriaManager;
import org.bukkit.Bukkit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface MythBoardAPI {

    /**
     * Get MythBoard's implementation of the {@link MythBoardAPI}
     * @return {@link MythBoardAPI}
     * @throws IllegalStateException if the API is not registered. Typically, this only happens if the MythBoard plugin is not enabled yet
     */
    static @NotNull MythBoardAPI getApi() {
        final MythBoardAPI api = Bukkit.getServicesManager().load(MythBoardAPI.class);
        if (api == null) {
            throw new IllegalStateException("MythBoardAPI is not registered. Please ensure the plugin is enabled!");
        }

        return api;
    }

    /**
     * Get MythBoard's implementation of the {@link CriteriaManager}
     * @return {@link CriteriaManager}
     */
    @Nullable CriteriaManager getCriteriaManager();

}
