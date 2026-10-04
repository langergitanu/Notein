package o00oo0O;

import android.graphics.Bitmap;
import o00o0Ooo.C25431OooO0oo;

/* JADX INFO: renamed from: o00oo0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25651OooO00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final C25651OooO00o f87562OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Bitmap.Config f87563OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Bitmap.Config f87564OooO0O0;

    static {
        C25652OooO0O0 c25652OooO0O0 = new C25652OooO0O0();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        c25652OooO0O0.f87565OooO00o = config;
        c25652OooO0O0.f87566OooO0O0 = config;
        f87562OooO0OO = new C25651OooO00o(c25652OooO0O0);
    }

    public C25651OooO00o(C25652OooO0O0 c25652OooO0O0) {
        this.f87563OooO00o = c25652OooO0O0.f87565OooO00o;
        this.f87564OooO0O0 = c25652OooO0O0.f87566OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C25651OooO00o.class != obj.getClass()) {
            return false;
        }
        C25651OooO00o c25651OooO00o = (C25651OooO00o) obj;
        return this.f87563OooO00o == c25651OooO00o.f87563OooO00o && this.f87564OooO0O0 == c25651OooO00o.f87564OooO0O0;
    }

    public final int hashCode() {
        int iOrdinal = (this.f87563OooO00o.ordinal() - 552645669) * 31;
        Bitmap.Config config = this.f87564OooO0O0;
        return (iOrdinal + (config != null ? config.ordinal() : 0)) * 29791;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageDecodeOptions{");
        C25431OooO0oo.OooO00o oooO00oOooO0O0 = C25431OooO0oo.OooO0O0(this);
        oooO00oOooO0O0.OooO00o("minDecodeIntervalMs", 100);
        oooO00oOooO0O0.OooO00o("maxDimensionPx", Integer.MAX_VALUE);
        oooO00oOooO0O0.OooO0O0("decodePreviewFrame", false);
        oooO00oOooO0O0.OooO0O0("useLastFrameForPreview", false);
        oooO00oOooO0O0.OooO0O0("useEncodedImageForPreview", false);
        oooO00oOooO0O0.OooO0O0("decodeAllFrames", false);
        oooO00oOooO0O0.OooO0O0("forceStaticImage", false);
        oooO00oOooO0O0.OooO0OO(this.f87563OooO00o.name(), "bitmapConfigName");
        oooO00oOooO0O0.OooO0OO(this.f87564OooO0O0.name(), "animatedBitmapConfigName");
        oooO00oOooO0O0.OooO0OO(null, "customImageDecoder");
        oooO00oOooO0O0.OooO0OO(null, "bitmapTransformation");
        oooO00oOooO0O0.OooO0OO(null, "colorSpace");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, oooO00oOooO0O0.toString(), "}");
    }
}
