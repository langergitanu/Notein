package o00o000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
import o00Ooo0o.InterfaceC25116OooO0o;
import o00OooOO.InterfaceC25155OooO0O0;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOO0O extends OooO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f85871OooO0O0 = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(InterfaceC25116OooO0o.f85383OooO00o);

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final void OooO00o(MessageDigest messageDigest) {
        messageDigest.update(f85871OooO0O0);
    }

    @Override // o00o000.OooO0o
    public final Bitmap OooO0OO(InterfaceC25155OooO0O0 interfaceC25155OooO0O0, Bitmap bitmap, int i, int i2) {
        Paint paint = C25231OooOoo0.f85940OooO00o;
        int iMin = Math.min(i, i2);
        float f = iMin;
        float f2 = f / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f / width, f / height);
        float f3 = width * fMax;
        float f4 = fMax * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap bitmapOooO0OO = C25231OooOoo0.OooO0OO(bitmap, interfaceC25155OooO0O0);
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapOooO0o0 = interfaceC25155OooO0O0.OooO0o0(iMin, iMin, config);
        bitmapOooO0o0.setHasAlpha(true);
        Lock lock = C25231OooOoo0.f85943OooO0Oo;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapOooO0o0);
            canvas.drawCircle(f2, f2, f2, C25231OooOoo0.f85941OooO0O0);
            canvas.drawBitmap(bitmapOooO0OO, (Rect) null, rectF, C25231OooOoo0.f85942OooO0OO);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapOooO0OO.equals(bitmap)) {
                interfaceC25155OooO0O0.OooO00o(bitmapOooO0OO);
            }
            return bitmapOooO0o0;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final boolean equals(Object obj) {
        return obj instanceof OooOO0O;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final int hashCode() {
        return 1101716364;
    }
}
