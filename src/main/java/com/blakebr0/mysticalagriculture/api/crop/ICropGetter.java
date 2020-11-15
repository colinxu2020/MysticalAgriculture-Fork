package com.blakebr0.mysticalagriculture.api.crop;

/**
 * Used as an easy way to get the crop from an object
 */
// TODO: 1.17 rename to ICropProvider
public interface ICropGetter {
    /**
     * Gets the crop from this object
     * @return the crop
     */
    ICrop getCrop();
}
