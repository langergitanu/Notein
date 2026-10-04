package com.aspose.slides;

import android.graphics.Bitmap;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.orion.ni_render_engine.impl.ink.BrushFamilyProvider;

/* JADX INFO: renamed from: com.aspose.slides.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C22229OoooO00 implements o000OO00.o000oOoO {
    public static void OooO00o(char c, Dictionary dictionary, String str, char c2, String str2) {
        dictionary.set_Item(str, Character.valueOf(c));
        dictionary.set_Item(str2, Character.valueOf(c2));
    }

    @Override // o000OO00.o000oOoO
    public Bitmap get(String textureId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(textureId, "textureId");
        return BrushFamilyProvider.INSTANCE.getCustomTexture(textureId);
    }
}
