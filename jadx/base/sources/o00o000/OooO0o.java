package o00o000;

import Oooo0.C20856OooooOo;
import android.content.Context;
import android.graphics.Bitmap;
import o00Ooo0o.InterfaceC25123OooOOO0;
import o00OooO.InterfaceC25145OooOo0o;
import o00OooOO.InterfaceC25155OooO0O0;
import o00o0O0.C25316OooOO0o;

/* JADX INFO: loaded from: classes5.dex */
public abstract class OooO0o implements InterfaceC25123OooOOO0<Bitmap> {
    @Override // o00Ooo0o.InterfaceC25123OooOOO0
    public final InterfaceC25145OooOo0o<Bitmap> OooO0O0(Context context, InterfaceC25145OooOo0o<Bitmap> interfaceC25145OooOo0o, int i, int i2) {
        if (!C25316OooOO0o.OooO(i, i2)) {
            throw new IllegalArgumentException(C20856OooooOo.OooO0O0("Cannot apply transformation on width: ", i, " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL", i2));
        }
        InterfaceC25155OooO0O0 interfaceC25155OooO0O0 = com.bumptech.glide.OooO0OO.OooO00o(context).f67114OooOo0o;
        Bitmap bitmap = interfaceC25145OooOo0o.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapOooO0OO = OooO0OO(interfaceC25155OooO0O0, bitmap, i, i2);
        return bitmap.equals(bitmapOooO0OO) ? interfaceC25145OooOo0o : C25213OooO0o0.OooO0O0(bitmapOooO0OO, interfaceC25155OooO0O0);
    }

    public abstract Bitmap OooO0OO(InterfaceC25155OooO0O0 interfaceC25155OooO0O0, Bitmap bitmap, int i, int i2);
}
