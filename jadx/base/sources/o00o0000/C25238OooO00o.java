package o00o0000;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import o00Ooo0o.C25111OooO;
import o00Ooo0o.C25119OooO0oo;
import o00Ooo0o.EnumC25113OooO0O0;
import o00Ooo0o.EnumC25120OooOO0;
import o00o000.C25223OooOOoo;
import o00o000.OooOOO;
import o00o000.OooOOO0;

/* JADX INFO: renamed from: o00o0000.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25238OooO00o implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C25223OooOOoo f85954OooO00o = C25223OooOOoo.OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f85955OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f85956OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final EnumC25113OooO0O0 f85957OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f85958OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOOO0 f85959OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final EnumC25120OooOO0 f85960OooO0oO;

    /* JADX INFO: renamed from: o00o0000.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C19689OooO00o implements ImageDecoder$OnPartialImageListener {
        public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public C25238OooO00o(int i, int i2, C25111OooO c25111OooO) {
        this.f85955OooO0O0 = i;
        this.f85956OooO0OO = i2;
        this.f85957OooO0Oo = (EnumC25113OooO0O0) c25111OooO.OooO0OO(OooOOO.f85877OooO0o);
        this.f85959OooO0o0 = (OooOOO0) c25111OooO.OooO0OO(OooOOO0.f85894OooO0o);
        C25119OooO0oo<Boolean> c25119OooO0oo = OooOOO.f85880OooOO0;
        this.f85958OooO0o = c25111OooO.OooO0OO(c25119OooO0oo) != null && ((Boolean) c25111OooO.OooO0OO(c25119OooO0oo)).booleanValue();
        this.f85960OooO0oO = (EnumC25120OooOO0) c25111OooO.OooO0OO(OooOOO.f85878OooO0oO);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f85954OooO00o.OooO0OO(this.f85955OooO0O0, this.f85956OooO0OO, this.f85958OooO0o, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f85957OooO0Oo == EnumC25113OooO0O0.f85375OooOo) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C19689OooO00o());
        Size size = imageInfo.getSize();
        int width = this.f85955OooO0O0;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f85956OooO0OO;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fOooO0O0 = this.f85959OooO0o0.OooO0O0(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fOooO0O0);
        int iRound2 = Math.round(size.getHeight() * fOooO0O0);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fOooO0O0);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        EnumC25120OooOO0 enumC25120OooOO0 = this.f85960OooO0oO;
        if (enumC25120OooOO0 != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((enumC25120OooOO0 == EnumC25120OooOO0.f85391OooOo0o && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
