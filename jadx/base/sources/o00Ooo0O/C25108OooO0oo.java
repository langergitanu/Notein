package o00Ooo0O;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.LruCache;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.internal.p332p7.C22236OooO0Oo;
import com.bumptech.glide.integration.webp.WebpFrame;
import com.bumptech.glide.integration.webp.WebpImage;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import o00Ooo0.InterfaceC25097OooO00o;
import o00Ooo0O.C25109OooOO0o;

/* JADX INFO: renamed from: o00Ooo0O.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25108OooO0oo implements InterfaceC25097OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f85312OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public ByteBuffer f85313OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public WebpImage f85314OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC25097OooO00o.InterfaceC19675OooO00o f85315OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final com.bumptech.glide.integration.webp.OooO00o[] f85317OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int[] f85318OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f85319OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f85320OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Paint f85321OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final C25109OooOO0o f85322OooOO0O;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final OooO00o f85324OooOOO0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f85316OooO0Oo = -1;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Bitmap.Config f85323OooOO0o = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: o00Ooo0O.OooO0oo$OooO00o */
    public class OooO00o extends LruCache<Integer, Bitmap> {
        public OooO00o(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        public final void entryRemoved(boolean z, Integer num, Bitmap bitmap, Bitmap bitmap2) {
            Bitmap bitmap3 = bitmap;
            if (bitmap3 != null) {
                ((o00o00.OooO0O0) C25108OooO0oo.this.f85315OooO0OO).f85817OooO00o.OooO00o(bitmap3);
            }
        }
    }

    public C25108OooO0oo(InterfaceC25097OooO00o.InterfaceC19675OooO00o interfaceC19675OooO00o, WebpImage webpImage, ByteBuffer byteBuffer, int i, C25109OooOO0o c25109OooOO0o) {
        this.f85315OooO0OO = interfaceC19675OooO00o;
        this.f85314OooO0O0 = webpImage;
        this.f85318OooO0o0 = webpImage.getFrameDurations();
        this.f85317OooO0o = new com.bumptech.glide.integration.webp.OooO00o[webpImage.getFrameCount()];
        for (int i2 = 0; i2 < this.f85314OooO0O0.getFrameCount(); i2++) {
            this.f85317OooO0o[i2] = this.f85314OooO0O0.getFrameInfo(i2);
            if (Log.isLoggable("WebpDecoder", 3)) {
                Log.d("WebpDecoder", "mFrameInfos: " + this.f85317OooO0o[i2].toString());
            }
        }
        this.f85322OooOO0O = c25109OooOO0o;
        Paint paint = new Paint();
        this.f85321OooOO0 = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.f85324OooOOO0 = new OooO00o(c25109OooOO0o.f85339OooO00o == C25109OooOO0o.OooO00o.f85343OooOoO0 ? webpImage.getFrameCount() : Math.max(5, 0));
        new ArrayList();
        if (i <= 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Sample size must be >=0, not: "));
        }
        int iHighestOneBit = Integer.highestOneBit(i);
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f85313OooO00o = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f85319OooO0oO = iHighestOneBit;
        this.f85312OooO = this.f85314OooO0O0.getWidth() / iHighestOneBit;
        this.f85320OooO0oo = this.f85314OooO0O0.getHeight() / iHighestOneBit;
    }

    @Override // o00Ooo0.InterfaceC25097OooO00o
    public final Bitmap OooO00o() {
        int i;
        Bitmap bitmap;
        int i2 = this.f85316OooO0Oo;
        int i3 = this.f85312OooO;
        int i4 = this.f85320OooO0oo;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        o00o00.OooO0O0 oooO0O0 = (o00o00.OooO0O0) this.f85315OooO0OO;
        Bitmap bitmapOooO0O0 = oooO0O0.f85817OooO00o.OooO0O0(i3, i4, config);
        bitmapOooO0O0.eraseColor(0);
        bitmapOooO0O0.setDensity(DisplayMetrics.DENSITY_DEVICE_STABLE);
        Canvas canvas = new Canvas(bitmapOooO0O0);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        boolean z = this.f85322OooOO0O.f85339OooO00o == C25109OooOO0o.OooO00o.f85341OooOo0o;
        OooO00o oooO00o = this.f85324OooOOO0;
        if (!z && (bitmap = oooO00o.get(Integer.valueOf(i2))) != null) {
            if (Log.isLoggable("WebpDecoder", 3)) {
                C22236OooO0Oo.OooO00o(i2, "hit frame bitmap from memory cache, frameNumber=", "WebpDecoder");
            }
            bitmap.setDensity(canvas.getDensity());
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            return bitmapOooO0O0;
        }
        boolean zOooO0o = OooO0o(i2);
        com.bumptech.glide.integration.webp.OooO00o[] oooO00oArr = this.f85317OooO0o;
        if (zOooO0o) {
            i = i2;
        } else {
            i = i2 - 1;
            while (true) {
                if (i < 0) {
                    i = 0;
                    break;
                }
                com.bumptech.glide.integration.webp.OooO00o oooO00o2 = oooO00oArr[i];
                if (oooO00o2.f67177OooO0oo && OooO0o0(oooO00o2)) {
                    break;
                }
                Bitmap bitmap2 = oooO00o.get(Integer.valueOf(i));
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    bitmap2.setDensity(canvas.getDensity());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                    if (oooO00o2.f67177OooO0oo) {
                        OooO0Oo(canvas, oooO00o2);
                    }
                } else {
                    if (OooO0o(i)) {
                        break;
                    }
                    i--;
                }
            }
            i++;
        }
        if (Log.isLoggable("WebpDecoder", 3)) {
            Log.d("WebpDecoder", "frameNumber=" + i2 + ", nextIndex=" + i);
        }
        while (i < i2) {
            com.bumptech.glide.integration.webp.OooO00o oooO00o3 = oooO00oArr[i];
            if (!oooO00o3.f67176OooO0oO) {
                OooO0Oo(canvas, oooO00o3);
            }
            OooO0oO(canvas, i);
            boolean zIsLoggable = Log.isLoggable("WebpDecoder", 3);
            boolean z2 = oooO00o3.f67177OooO0oo;
            if (zIsLoggable) {
                StringBuilder sbOooO0OO = OooO0O0.OooO0o.OooO0OO(i, "renderFrame, index=", ", blend=");
                sbOooO0OO.append(oooO00o3.f67176OooO0oO);
                sbOooO0OO.append(", dispose=");
                sbOooO0OO.append(z2);
                Log.d("WebpDecoder", sbOooO0OO.toString());
            }
            if (z2) {
                OooO0Oo(canvas, oooO00o3);
            }
            i++;
        }
        com.bumptech.glide.integration.webp.OooO00o oooO00o4 = oooO00oArr[i2];
        if (!oooO00o4.f67176OooO0oO) {
            OooO0Oo(canvas, oooO00o4);
        }
        OooO0oO(canvas, i2);
        if (Log.isLoggable("WebpDecoder", 3)) {
            StringBuilder sbOooO0OO2 = OooO0O0.OooO0o.OooO0OO(i2, "renderFrame, index=", ", blend=");
            sbOooO0OO2.append(oooO00o4.f67176OooO0oO);
            sbOooO0OO2.append(", dispose=");
            sbOooO0OO2.append(oooO00o4.f67177OooO0oo);
            Log.d("WebpDecoder", sbOooO0OO2.toString());
        }
        oooO00o.remove(Integer.valueOf(i2));
        Bitmap bitmapOooO0O02 = oooO0O0.f85817OooO00o.OooO0O0(bitmapOooO0O0.getWidth(), bitmapOooO0O0.getHeight(), bitmapOooO0O0.getConfig());
        bitmapOooO0O02.eraseColor(0);
        bitmapOooO0O02.setDensity(bitmapOooO0O0.getDensity());
        Canvas canvas2 = new Canvas(bitmapOooO0O02);
        canvas2.drawColor(0, PorterDuff.Mode.SRC);
        canvas2.drawBitmap(bitmapOooO0O0, 0.0f, 0.0f, (Paint) null);
        oooO00o.put(Integer.valueOf(i2), bitmapOooO0O02);
        return bitmapOooO0O0;
    }

    public final void OooO0O0() {
        this.f85316OooO0Oo = (this.f85316OooO0Oo + 1) % this.f85314OooO0O0.getFrameCount();
    }

    public final void OooO0OO() {
        this.f85314OooO0O0.dispose();
        this.f85314OooO0O0 = null;
        this.f85324OooOOO0.evictAll();
        this.f85313OooO00o = null;
    }

    public final void OooO0Oo(Canvas canvas, com.bumptech.glide.integration.webp.OooO00o oooO00o) {
        int i = this.f85319OooO0oO;
        int i2 = oooO00o.f67171OooO0O0;
        int i3 = oooO00o.f67172OooO0OO;
        canvas.drawRect(i2 / i, i3 / i, (i2 + oooO00o.f67173OooO0Oo) / i, (i3 + oooO00o.f67175OooO0o0) / i, this.f85321OooOO0);
    }

    public final boolean OooO0o(int i) {
        if (i == 0) {
            return true;
        }
        com.bumptech.glide.integration.webp.OooO00o[] oooO00oArr = this.f85317OooO0o;
        com.bumptech.glide.integration.webp.OooO00o oooO00o = oooO00oArr[i];
        com.bumptech.glide.integration.webp.OooO00o oooO00o2 = oooO00oArr[i - 1];
        if (oooO00o.f67176OooO0oO || !OooO0o0(oooO00o)) {
            return oooO00o2.f67177OooO0oo && OooO0o0(oooO00o2);
        }
        return true;
    }

    public final boolean OooO0o0(com.bumptech.glide.integration.webp.OooO00o oooO00o) {
        if (oooO00o.f67171OooO0O0 != 0 || oooO00o.f67172OooO0OO != 0) {
            return false;
        }
        if (oooO00o.f67173OooO0Oo == this.f85314OooO0O0.getWidth()) {
            return oooO00o.f67175OooO0o0 == this.f85314OooO0O0.getHeight();
        }
        return false;
    }

    public final void OooO0oO(Canvas canvas, int i) {
        InterfaceC25097OooO00o.InterfaceC19675OooO00o interfaceC19675OooO00o = this.f85315OooO0OO;
        com.bumptech.glide.integration.webp.OooO00o oooO00o = this.f85317OooO0o[i];
        int i2 = oooO00o.f67173OooO0Oo;
        int i3 = this.f85319OooO0oO;
        int i4 = i2 / i3;
        int i5 = oooO00o.f67175OooO0o0 / i3;
        int i6 = oooO00o.f67171OooO0O0 / i3;
        int i7 = oooO00o.f67172OooO0OO / i3;
        if (i4 == 0 || i5 == 0) {
            return;
        }
        WebpFrame frame = this.f85314OooO0O0.getFrame(i);
        try {
            Bitmap bitmapOooO0O0 = ((o00o00.OooO0O0) interfaceC19675OooO00o).f85817OooO00o.OooO0O0(i4, i5, this.f85323OooOO0o);
            bitmapOooO0O0.eraseColor(0);
            bitmapOooO0O0.setDensity(canvas.getDensity());
            frame.renderFrame(i4, i5, bitmapOooO0O0);
            canvas.drawBitmap(bitmapOooO0O0, i6, i7, (Paint) null);
            ((o00o00.OooO0O0) interfaceC19675OooO00o).f85817OooO00o.OooO00o(bitmapOooO0O0);
        } catch (IllegalArgumentException | IllegalStateException unused) {
            Log.e("WebpDecoder", "Rendering of frame failed. Frame number: " + i);
        } finally {
            frame.dispose();
        }
    }
}
