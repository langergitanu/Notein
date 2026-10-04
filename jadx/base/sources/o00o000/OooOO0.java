package o00o000;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;
import o00Ooo0o.InterfaceC25116OooO0o;
import o00OooOO.InterfaceC25155OooO0O0;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOO0 extends OooO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f85870OooO0O0 = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC25116OooO0o.f85383OooO00o);

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final void OooO00o(MessageDigest messageDigest) {
        messageDigest.update(f85870OooO0O0);
    }

    @Override // o00o000.OooO0o
    public final Bitmap OooO0OO(InterfaceC25155OooO0O0 interfaceC25155OooO0O0, Bitmap bitmap, int i, int i2) {
        Paint paint = C25231OooOoo0.f85940OooO00o;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return C25231OooOoo0.OooO0O0(interfaceC25155OooO0O0, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final boolean equals(Object obj) {
        return obj instanceof OooOO0;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final int hashCode() {
        return -670243078;
    }
}
