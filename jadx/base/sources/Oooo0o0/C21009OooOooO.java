package Oooo0o0;

import android.graphics.Bitmap;
import com.aspose.slides.internal.p463vm.C11695to;
import com.orion.ni_render_engine.impl.ink.BrushFamilyProvider;
import java.util.HashMap;
import o000OO00.o000oOoO;

/* JADX INFO: renamed from: Oooo0o0.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21009OooOooO implements o000oOoO {
    public static float OooO00o(float f, float f2, float f3, float f4) {
        return ((f * f2) + f3) / f4;
    }

    public static Integer OooO0O0(int i, HashMap map, Integer num, int i2) {
        map.put(num, new C11695to(i));
        return Integer.valueOf(i2);
    }

    public static StringBuilder OooO0OO(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    @Override // o000OO00.o000oOoO
    public Bitmap get(String textureId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(textureId, "textureId");
        return BrushFamilyProvider.INSTANCE.getCustomTexture(textureId);
    }
}
