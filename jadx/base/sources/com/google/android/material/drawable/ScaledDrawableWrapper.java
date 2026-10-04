package com.google.android.material.drawable;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public class ScaledDrawableWrapper extends OooOO0.OooO00o {
    private final int height;
    private final int width;

    public ScaledDrawableWrapper(Drawable drawable, int i, int i2) {
        super(drawable);
        this.width = i;
        this.height = i2;
    }

    @Override // OooOO0.OooO00o, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.height;
    }

    @Override // OooOO0.OooO00o, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.width;
    }
}
