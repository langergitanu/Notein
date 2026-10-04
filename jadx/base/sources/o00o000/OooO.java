package o00o000;

import OooooOo.C21392OooOo00;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
import o00Ooo0o.InterfaceC25116OooO0o;
import o00OooOO.InterfaceC25155OooO0O0;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO extends OooO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f85857OooO0O0 = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC25116OooO0o.f85383OooO00o);

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final void OooO00o(MessageDigest messageDigest) {
        messageDigest.update(f85857OooO0O0);
    }

    @Override // o00o000.OooO0o
    public final Bitmap OooO0OO(InterfaceC25155OooO0O0 interfaceC25155OooO0O0, Bitmap bitmap, int i, int i2) {
        float width;
        float fOooO00o;
        Paint paint = C25231OooOoo0.f85940OooO00o;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float fOooO00o2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            fOooO00o2 = C21392OooOo00.OooO00o(bitmap.getWidth(), width, i, 0.5f);
            fOooO00o = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            fOooO00o = C21392OooOo00.OooO00o(bitmap.getHeight(), width, i2, 0.5f);
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (fOooO00o2 + 0.5f), (int) (fOooO00o + 0.5f));
        Bitmap bitmapOooO0o0 = interfaceC25155OooO0O0.OooO0o0(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapOooO0o0.setHasAlpha(bitmap.hasAlpha());
        C25231OooOoo0.OooO00o(bitmap, bitmapOooO0o0, matrix);
        return bitmapOooO0o0;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final boolean equals(Object obj) {
        return obj instanceof OooO;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final int hashCode() {
        return -599754482;
    }
}
