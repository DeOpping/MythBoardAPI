package me.mantice.mythboard.criteria;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public interface CriteriaInstance {

    /**
     * Check if a {@link Player} meets this criteria
     * @param player {@link Player}
     * @return <code>true</code> if the {@link Player} meets the criteria, <code>false</code> otherwise
     */
    boolean meets(final @NotNull Player player);

}
