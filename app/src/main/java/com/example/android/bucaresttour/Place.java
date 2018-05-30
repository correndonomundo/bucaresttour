package com.example.android.bucaresttour;

public class Place {

    /** String resource ID for the default translation of the word */
    private int mPlaceNameId;

    /** String resource ID for the Miwok translation of the word */
    private int mShortDescriptionID;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;


    public Place(int placeNameId, int shortDescriptionId, int imageResourceId) {
        mPlaceNameId = placeNameId;
        mShortDescriptionID = shortDescriptionId;
        mImageResourceId = imageResourceId;

    }

    /**
     * Get the string resource ID for the default translation of the word.
     */
    public int getPlaceNameId() {
        return mPlaceNameId;
    }

    /**
     * Get the string resource ID for the Miwok translation of the word.
     */
    public int getShortDescriptionID() {
        return mShortDescriptionID;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}