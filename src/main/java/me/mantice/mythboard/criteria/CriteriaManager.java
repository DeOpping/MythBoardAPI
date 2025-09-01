package me.mantice.mythboard.criteria;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface CriteriaManager {

    /**
     * Register a criteria
     * @param criteria Your implementation of {@link CriteriaType}
     */
    void register(final @NotNull CriteriaType criteria);

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
