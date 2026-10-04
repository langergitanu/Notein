package o00ooO0;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: o00ooO0.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25742OooOOo implements OooOO0 {
    @Override // o00o0o0o.InterfaceC25448OooO0o0
    public final Bitmap get(int i) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
        kotlin.jvm.internal.OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    @Override // o00o0o.InterfaceC25436OooO0OO
    public final void release(Object obj) {
        Bitmap value = (Bitmap) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        value.recycle();
    }
}
