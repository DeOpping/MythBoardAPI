package me.mantice.mythboard.criteria;

import org.jetbrains.annotations.NotNull;

import java.util.Map;

public interface CriteriaType {

    /**
     * Get the ID for this {@link CriteriaType}
     * @return {@link String}
     */
    @NotNull String getId();

    /**
     * Create an {@link CriteriaInstance} of this {@link CriteriaType}
     * @param options {@link Map}<{@link String}, {@link Object}>
     * @return {@link CriteriaInstance}
     */
    @NotNull CriteriaInstance create(final @NotNull Map<String, Object> options);

}
