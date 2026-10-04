package com.aspose.slides.internal.p497xc;

import android.graphics.Bitmap;
import com.orion.ni_render_engine.impl.ink.BrushFamilyProvider;
import o000OO00.o000oOoO;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class OooO00o implements o000oOoO {
    public static int OooO00o(int i, int i2, int i3, int i4) {
        return ((i - i2) * i3) / i4;
    }

    public static int OooO0O0(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    @Override // o000OO00.o000oOoO
    public Bitmap get(String str) {
        return BrushFamilyProvider.dumpBrushFamilyFile$lambda$5$lambda$4(str);
    }
}
