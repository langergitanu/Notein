package o00o000;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.fragment.app.C21929Ooooo0o;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
import o00Ooo0o.InterfaceC25116OooO0o;
import o00OooOO.InterfaceC25155OooO0O0;
import o00o0O0.C25316OooOO0o;

/* JADX INFO: renamed from: o00o000.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25227OooOoO extends OooO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final byte[] f85931OooO0OO = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(InterfaceC25116OooO0o.f85383OooO00o);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f85932OooO0O0;

    public C25227OooOoO(int i) {
        C21929Ooooo0o.OooO00o(i > 0, "roundingRadius must be greater than 0.");
        this.f85932OooO0O0 = i;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final void OooO00o(MessageDigest messageDigest) {
        messageDigest.update(f85931OooO0OO);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f85932OooO0O0).array());
    }

    @Override // o00o000.OooO0o
    public final Bitmap OooO0OO(InterfaceC25155OooO0O0 interfaceC25155OooO0O0, Bitmap bitmap, int i, int i2) {
        Paint paint = C25231OooOoo0.f85940OooO00o;
        int i3 = this.f85932OooO0O0;
        C21929Ooooo0o.OooO00o(i3 > 0, "roundingRadius must be greater than 0.");
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapOooO0OO = C25231OooOoo0.OooO0OO(bitmap, interfaceC25155OooO0O0);
        Bitmap bitmapOooO0o0 = interfaceC25155OooO0O0.OooO0o0(bitmapOooO0OO.getWidth(), bitmapOooO0OO.getHeight(), config);
        bitmapOooO0o0.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapOooO0OO, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapOooO0o0.getWidth(), bitmapOooO0o0.getHeight());
        Lock lock = C25231OooOoo0.f85943OooO0Oo;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapOooO0o0);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = i3;
            canvas.drawRoundRect(rectF, f, f, paint2);
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
        return (obj instanceof C25227OooOoO) && this.f85932OooO0O0 == ((C25227OooOoO) obj).f85932OooO0O0;
    }

    @Override // o00Ooo0o.InterfaceC25116OooO0o
    public final int hashCode() {
        return C25316OooOO0o.OooO0oO(-569625254, C25316OooOO0o.OooO0oO(this.f85932OooO0O0, 17));
    }
}
