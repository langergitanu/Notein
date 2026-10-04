package o00o000o;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import com.huawei.hms.framework.common.C22823OooO0Oo;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.InterfaceC25121OooOO0O;
import o00OooO.InterfaceC25145OooOo0o;
import o00OooOO.C25159OooO0oO;
import o00o0000.C25238OooO00o;
import o00o0O0.C25308OooO00o;
import o00o0O0.C25316OooOO0o;

/* JADX INFO: renamed from: o00o000o.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25246OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f85965OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C25159OooO0oO f85966OooO0O0;

    /* JADX INFO: renamed from: o00o000o.OooO0Oo$OooO00o */
    public static final class OooO00o implements InterfaceC25145OooOo0o<Drawable> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final AnimatedImageDrawable f85967OooOo0o;

        public OooO00o(AnimatedImageDrawable animatedImageDrawable) {
            this.f85967OooOo0o = animatedImageDrawable;
        }

        @Override // o00OooO.InterfaceC25145OooOo0o
        public final Class<Drawable> OooO00o() {
            return Drawable.class;
        }

        @Override // o00OooO.InterfaceC25145OooOo0o
        public final Drawable get() {
            return this.f85967OooOo0o;
        }

        @Override // o00OooO.InterfaceC25145OooOo0o
        public final int getSize() {
            return C25316OooOO0o.OooO0Oo(Bitmap.Config.ARGB_8888) * this.f85967OooOo0o.getIntrinsicHeight() * this.f85967OooOo0o.getIntrinsicWidth() * 2;
        }

        @Override // o00OooO.InterfaceC25145OooOo0o
        public final void recycle() {
            this.f85967OooOo0o.stop();
            this.f85967OooOo0o.clearAnimationCallbacks();
        }
    }

    /* JADX INFO: renamed from: o00o000o.OooO0Oo$OooO0O0 */
    public static final class OooO0O0 implements InterfaceC25121OooOO0O<ByteBuffer, Drawable> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C25246OooO0Oo f85968OooO00o;

        public OooO0O0(C25246OooO0Oo c25246OooO0Oo) {
            this.f85968OooO00o = c25246OooO0Oo;
        }

        @Override // o00Ooo0o.InterfaceC25121OooOO0O
        public final InterfaceC25145OooOo0o<Drawable> OooO00o(ByteBuffer byteBuffer, int i, int i2, C25111OooO c25111OooO) throws IOException {
            return C25246OooO0Oo.OooO00o(ImageDecoder.createSource(byteBuffer), i, i2, c25111OooO);
        }

        @Override // o00Ooo0o.InterfaceC25121OooOO0O
        public final boolean OooO0O0(ByteBuffer byteBuffer, C25111OooO c25111OooO) throws IOException {
            ImageHeaderParser.ImageType imageTypeOooO0OO = com.bumptech.glide.load.OooO00o.OooO0OO(this.f85968OooO00o.f85965OooO00o, byteBuffer);
            if (imageTypeOooO0OO != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && imageTypeOooO0OO == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: o00o000o.OooO0Oo$OooO0OO */
    public static final class OooO0OO implements InterfaceC25121OooOO0O<InputStream, Drawable> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final C25246OooO0Oo f85969OooO00o;

        public OooO0OO(C25246OooO0Oo c25246OooO0Oo) {
            this.f85969OooO00o = c25246OooO0Oo;
        }

        @Override // o00Ooo0o.InterfaceC25121OooOO0O
        public final InterfaceC25145OooOo0o<Drawable> OooO00o(InputStream inputStream, int i, int i2, C25111OooO c25111OooO) throws IOException {
            return C25246OooO0Oo.OooO00o(ImageDecoder.createSource(C25308OooO00o.OooO0O0(inputStream)), i, i2, c25111OooO);
        }

        @Override // o00Ooo0o.InterfaceC25121OooOO0O
        public final boolean OooO0O0(InputStream inputStream, C25111OooO c25111OooO) throws IOException {
            C25246OooO0Oo c25246OooO0Oo = this.f85969OooO00o;
            ImageHeaderParser.ImageType imageTypeOooO0O0 = com.bumptech.glide.load.OooO00o.OooO0O0(c25246OooO0Oo.f85965OooO00o, inputStream, c25246OooO0Oo.f85966OooO0O0);
            if (imageTypeOooO0O0 != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && imageTypeOooO0O0 == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }
    }

    public C25246OooO0Oo(ArrayList arrayList, C25159OooO0oO c25159OooO0oO) {
        this.f85965OooO00o = arrayList;
        this.f85966OooO0O0 = c25159OooO0oO;
    }

    public static OooO00o OooO00o(ImageDecoder.Source source, int i, int i2, C25111OooO c25111OooO) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new C25238OooO00o(i, i2, c25111OooO));
        if (C25244OooO0O0.OooO00o(drawableDecodeDrawable)) {
            return new OooO00o(C22823OooO0Oo.OooO00o(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }
}
