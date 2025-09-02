package me.mantice.mythboard.criteria;

import me.mantice.mythboard.addons.MythBoardAddon;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface CriteriaManager {

    /**
     * Register a criteria
     * @param criteria Your {@link CriteriaType}
     * @param addon Your {@link MythBoardAddon}
     * @return <code>true</code> if registered, <code>false</code> if a criteria with that ID already exists
     */
    boolean register(final @NotNull CriteriaType criteria, final @NotNull MythBoardAddon addon);

    /**
     * Unregister a criteria by its ID
     * @param criteriaId Your {@link CriteriaType} ID
     * @param addon Your {@link MythBoardAddon}
     * @return <code>true</code> if unregistered, <code>false</code> if it was not present or from your addon
     */
    boolean unregister(final @NotNull String criteriaId, final @NotNull MythBoardAddon addon);

    /**
     * Unregister a criteria
     * @param criteria Your {@link CriteriaType}
     * @param addon Your {@link MythBoardAddon}
     * @return <code>true</code> if unregistered, <code>false</code> if it was not present or from your addon
     */
    default boolean unregister(final @NotNull CriteriaType criteria, final @NotNull MythBoardAddon addon) {
        return unregister(criteria.getId(), addon);
    }

    /**
     * Checks if a {@link CriteriaType} with this ID exists in the registry
     * @param id {@link String} ID of the {@link CriteriaType}
     * @return <code>true</code> if a {@link CriteriaType} exists in the registry, <code>false</code> if otherwise
     */
    boolean exists(final @NotNull String id);

    /**
     * Get a {@link CriteriaType} from the registry by its ID
     * @param id {@link String} ID for the {@link CriteriaType}
     * @return {@link CriteriaType} or <code>null</code> if it does not exist within the registry
     */
    @Nullable CriteriaType getCriteria(final @Nullable String id);

}
