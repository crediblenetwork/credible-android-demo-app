package io.smartpesa.credible.helper;

import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;

public class HomeMenuItem {

    public int id;
    @DrawableRes
    public int imgResId;
    @StringRes
    public int textResId;

    public HomeMenuItem(int id, @DrawableRes int imgResId, @StringRes int textResId) {
        this.id = id;
        this.imgResId = imgResId;
        this.textResId = textResId;
    }
}