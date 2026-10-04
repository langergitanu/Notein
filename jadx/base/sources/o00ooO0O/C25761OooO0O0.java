package o00ooO0O;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import o00ooOO.C25767OooO0OO;

/* JADX INFO: renamed from: o00ooO0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25761OooO0O0 extends AbstractC25760OooO00o {
    @Override // o00ooO0O.AbstractC25760OooO00o
    public final int OooO0Oo(int i, int i2, BitmapFactory.Options options) {
        Bitmap.Config config = options.outConfig;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return C25767OooO0OO.OooO0OO(i, i2, config);
    }
}
