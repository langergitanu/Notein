package o00oo00O;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.facebook.animated.webp.WebPFrame;
import kotlin.jvm.internal.OooOOO0;
import o00oOoo0.C25627OooO0O0;
import o00oOoo0.C25629OooO0Oo;
import o00oOoo0.InterfaceC25626OooO00o;
import o00oOoo0.InterfaceC25628OooO0OO;
import o00oo0.C25641OooO00o;

/* JADX INFO: renamed from: o00oo00O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25647OooO00o implements InterfaceC25626OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25641OooO00o f87535OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25629OooO0Oo f87536OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC25628OooO0OO f87537OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Rect f87538OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f87539OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int[] f87540OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C25627OooO0O0[] f87541OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f87543OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Paint f87544OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Bitmap f87545OooOO0o;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Rect f87542OooO0oo = new Rect();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Rect f87534OooO = new Rect();

    public C25647OooO00o(C25641OooO00o c25641OooO00o, C25629OooO0Oo c25629OooO0Oo, Rect rect, boolean z) {
        this.f87535OooO00o = c25641OooO00o;
        this.f87536OooO0O0 = c25629OooO0Oo;
        InterfaceC25628OooO0OO interfaceC25628OooO0OO = c25629OooO0Oo.f87474OooO00o;
        this.f87537OooO0OO = interfaceC25628OooO0OO;
        int[] frameDurationMs = interfaceC25628OooO0OO.OooO();
        this.f87540OooO0o0 = frameDurationMs;
        c25641OooO00o.getClass();
        OooOOO0.OooO0oO(frameDurationMs, "frameDurationMs");
        int length = frameDurationMs.length;
        for (int i = 0; i < length; i++) {
            if (frameDurationMs[i] < 11) {
                frameDurationMs[i] = 100;
            }
        }
        C25641OooO00o c25641OooO00o2 = this.f87535OooO00o;
        int[] frameDurationMs2 = this.f87540OooO0o0;
        c25641OooO00o2.getClass();
        OooOOO0.OooO0oO(frameDurationMs2, "frameDurationMs");
        int i2 = 0;
        for (int i3 : frameDurationMs2) {
            i2 += i3;
        }
        this.f87539OooO0o = i2;
        C25641OooO00o c25641OooO00o3 = this.f87535OooO00o;
        int[] frameDurationsMs = this.f87540OooO0o0;
        c25641OooO00o3.getClass();
        OooOOO0.OooO0oO(frameDurationsMs, "frameDurationsMs");
        int[] iArr = new int[frameDurationsMs.length];
        int length2 = frameDurationsMs.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length2; i5++) {
            iArr[i5] = i4;
            i4 += frameDurationsMs[i5];
        }
        this.f87538OooO0Oo = OooO00o(this.f87537OooO0OO, rect);
        this.f87543OooOO0 = z;
        this.f87541OooO0oO = new C25627OooO0O0[this.f87537OooO0OO.OooO0O0()];
        for (int i6 = 0; i6 < this.f87537OooO0OO.OooO0O0(); i6++) {
            this.f87541OooO0oO[i6] = this.f87537OooO0OO.OooO0oO(i6);
        }
        Paint paint = new Paint();
        this.f87544OooOO0O = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static Rect OooO00o(InterfaceC25628OooO0OO interfaceC25628OooO0OO, Rect rect) {
        return rect == null ? new Rect(0, 0, interfaceC25628OooO0OO.getWidth(), interfaceC25628OooO0OO.getHeight()) : new Rect(0, 0, Math.min(rect.width(), interfaceC25628OooO0OO.getWidth()), Math.min(rect.height(), interfaceC25628OooO0OO.getHeight()));
    }

    public final synchronized Bitmap OooO0O0(int i, int i2) {
        try {
            Bitmap bitmap = this.f87545OooOO0o;
            if (bitmap != null && (bitmap.getWidth() < i || this.f87545OooOO0o.getHeight() < i2)) {
                synchronized (this) {
                    Bitmap bitmap2 = this.f87545OooOO0o;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        this.f87545OooOO0o = null;
                    }
                }
            }
            if (this.f87545OooOO0o == null) {
                this.f87545OooOO0o = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            }
            this.f87545OooOO0o.eraseColor(0);
        } catch (Throwable th) {
            throw th;
        }
        return this.f87545OooOO0o;
    }

    public final void OooO0OO(Canvas canvas, int i) {
        WebPFrame webPFrameOooO0o = this.f87537OooO0OO.OooO0o(i);
        try {
            if (webPFrameOooO0o.OooO0OO() > 0 && webPFrameOooO0o.OooO0O0() > 0) {
                OooO0Oo(canvas, webPFrameOooO0o);
            }
        } finally {
            webPFrameOooO0o.OooO00o();
        }
    }

    public final void OooO0Oo(Canvas canvas, WebPFrame webPFrame) {
        double dWidth = ((double) this.f87538OooO0Oo.width()) / ((double) this.f87537OooO0OO.getWidth());
        double dHeight = ((double) this.f87538OooO0Oo.height()) / ((double) this.f87537OooO0OO.getHeight());
        int iRound = (int) Math.round(((double) webPFrame.OooO0OO()) * dWidth);
        int iRound2 = (int) Math.round(((double) webPFrame.OooO0O0()) * dHeight);
        int iOooO0Oo = (int) (((double) webPFrame.OooO0Oo()) * dWidth);
        int iOooO0o0 = (int) (((double) webPFrame.OooO0o0()) * dHeight);
        synchronized (this) {
            try {
                int iWidth = this.f87538OooO0Oo.width();
                int iHeight = this.f87538OooO0Oo.height();
                OooO0O0(iWidth, iHeight);
                Bitmap bitmap = this.f87545OooOO0o;
                if (bitmap != null) {
                    webPFrame.OooO0oO(iRound, iRound2, bitmap);
                }
                this.f87542OooO0oo.set(0, 0, iWidth, iHeight);
                this.f87534OooO.set(iOooO0Oo, iOooO0o0, iWidth + iOooO0Oo, iHeight + iOooO0o0);
                Bitmap bitmap2 = this.f87545OooOO0o;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, this.f87542OooO0oo, this.f87534OooO, (Paint) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0o0(Canvas canvas, WebPFrame webPFrame, C25627OooO0O0 c25627OooO0O0, C25627OooO0O0 c25627OooO0O02) {
        float f;
        float f2;
        float f3;
        float f4;
        int width = this.f87537OooO0OO.getWidth();
        int height = this.f87537OooO0OO.getHeight();
        float f5 = width;
        float f6 = height;
        int iOooO0OO = webPFrame.OooO0OO();
        int iOooO0O0 = webPFrame.OooO0O0();
        int iOooO0Oo = webPFrame.OooO0Oo();
        int iOooO0o0 = webPFrame.OooO0o0();
        if (f5 > canvas.getWidth() || f6 > canvas.getHeight()) {
            int iMin = Math.min(canvas.getWidth(), width);
            int iMin2 = Math.min(canvas.getHeight(), height);
            float f7 = f5 / f6;
            if (iMin > iMin2) {
                f2 = iMin;
                f = f2 / f7;
            } else {
                f = iMin2;
                f2 = f * f7;
            }
            f3 = f2 / f5;
            f4 = f / f6;
            iOooO0OO = (int) Math.ceil(webPFrame.OooO0OO() * f3);
            iOooO0O0 = (int) Math.ceil(webPFrame.OooO0O0() * f4);
            iOooO0Oo = (int) Math.ceil(webPFrame.OooO0Oo() * f3);
            iOooO0o0 = (int) Math.ceil(webPFrame.OooO0o0() * f4);
        } else {
            f3 = 1.0f;
            f4 = 1.0f;
        }
        Rect rect = new Rect(0, 0, iOooO0OO, iOooO0O0);
        Rect rect2 = new Rect(iOooO0Oo, iOooO0o0, iOooO0Oo + iOooO0OO, iOooO0o0 + iOooO0O0);
        if (c25627OooO0O02 != null && c25627OooO0O02.f87465OooO0o == C25627OooO0O0.EnumC19713OooO0O0.f87470OooOo) {
            int iCeil = (int) Math.ceil(c25627OooO0O02.f87463OooO0OO * f3);
            int iCeil2 = (int) Math.ceil(c25627OooO0O02.f87464OooO0Oo * f4);
            int iCeil3 = (int) Math.ceil(c25627OooO0O02.f87461OooO00o * f3);
            int iCeil4 = (int) Math.ceil(c25627OooO0O02.f87462OooO0O0 * f4);
            canvas.drawRect(new Rect(iCeil3, iCeil4, iCeil + iCeil3, iCeil2 + iCeil4), this.f87544OooOO0O);
        }
        if (c25627OooO0O0.f87466OooO0o0 == C25627OooO0O0.OooO00o.f87467OooOo) {
            canvas.drawRect(rect2, this.f87544OooOO0O);
        }
        synchronized (this) {
            Bitmap bitmapOooO0O0 = OooO0O0(iOooO0OO, iOooO0O0);
            webPFrame.OooO0oO(iOooO0OO, iOooO0O0, bitmapOooO0O0);
            canvas.drawBitmap(bitmapOooO0O0, rect, rect2, (Paint) null);
        }
    }
}
