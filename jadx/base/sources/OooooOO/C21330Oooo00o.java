package OooooOO;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: OooooOO.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21330Oooo00o {
    public static final Bitmap OooO00o(InterfaceC21352Oooooo interfaceC21352Oooooo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC21352Oooooo, "<this>");
        if (interfaceC21352Oooooo instanceof C21329Oooo00O) {
            return ((C21329Oooo00O) interfaceC21352Oooooo).f61739OooO00o;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final Bitmap.Config OooO0O0(int i) {
        return i == 0 ? Bitmap.Config.ARGB_8888 : i == 1 ? Bitmap.Config.ALPHA_8 : i == 2 ? Bitmap.Config.RGB_565 : i == 3 ? Bitmap.Config.RGBA_F16 : i == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }
}
