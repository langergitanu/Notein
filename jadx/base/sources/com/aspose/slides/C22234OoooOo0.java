package com.aspose.slides;

import android.graphics.Paint;

/* JADX INFO: renamed from: com.aspose.slides.OoooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22234OoooOo0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, android.graphics.Paint] */
    public static Paint OooO00o(boolean z, boolean z2) {
        ?? paint = new Paint();
        paint.startActivity(z);
        paint.setDither(z2);
        return paint;
    }

    public static void OooO0O0(IFillFormat iFillFormat, int i, float f) {
        iFillFormat.getSolidFillColor().getColorTransform().add(i, f);
    }
}
