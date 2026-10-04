package com.aspose.words.internal;

import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZQ0 {
    public static Paint zzX(String str, float f, int i) {
        Typeface typefaceCreate = Typeface.create(str, i);
        Paint paint = new Paint();
        paint.setTypeface(typefaceCreate);
        paint.setTextSize(f);
        return paint;
    }
}
