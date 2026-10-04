package o00ooO0;

import android.graphics.Bitmap;
import o00o0o0o.C25446OooO0Oo;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOOO extends AbstractC25738OooO0oO<Bitmap> implements OooOO0 {
    public OooOOO(C25446OooO0Oo c25446OooO0Oo, Oooo000 oooo000, C25751OooOoo c25751OooOoo) {
        super(c25446OooO0Oo, oooo000, c25751OooOoo);
        c25446OooO0Oo.getClass();
        c25751OooOoo.getClass();
    }

    @Override // o00ooO0.AbstractC25738OooO0oO
    public final Bitmap OooO00o(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // o00ooO0.AbstractC25738OooO0oO
    public final void OooO0OO(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        bitmap2.getClass();
        bitmap2.recycle();
    }

    @Override // o00ooO0.AbstractC25738OooO0oO
    public final int OooO0o(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        bitmap2.getClass();
        return bitmap2.getAllocationByteCount();
    }

    @Override // o00ooO0.AbstractC25738OooO0oO
    public final int OooO0o0(int i) {
        return i;
    }

    @Override // o00ooO0.AbstractC25738OooO0oO
    public final int OooO0oO(int i) {
        return i;
    }

    @Override // o00ooO0.AbstractC25738OooO0oO
    public final Bitmap OooO0oo(C25740OooOO0o<Bitmap> c25740OooOO0o) {
        Bitmap bitmap = (Bitmap) super.OooO0oo(c25740OooOO0o);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    @Override // o00ooO0.AbstractC25738OooO0oO
    public final boolean OooOO0(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        bitmap2.getClass();
        return !bitmap2.isRecycled() && bitmap2.isMutable();
    }
}
