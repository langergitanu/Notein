package com.facebook.imagepipeline.nativecode;

import OooOoo0.OooOo00;
import android.graphics.ColorSpace;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.OooOOO0;
import o00o0Ooo.C25425OooO0O0;
import o00o0Ooo.C25429OooO0o0;
import o00o0o0o.AbstractC25442OooO;
import o00oOoOo.C25622OooO0O0;
import o00oOoOo.C25623OooO0OO;
import o00oo.C25638OooO0oO;
import o00oo0O.C25654OooO0Oo;
import o00ooOO0.C25772OooO00o;
import o00ooOO0.C25773OooO0O0;
import o00ooOO0.C25777OooO0o0;
import o00ooOO0.InterfaceC25774OooO0OO;

/* JADX INFO: loaded from: classes5.dex */
public class NativeJpegTranscoder implements InterfaceC25774OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f67264OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f67265OooO0O0;

    public static void OooO0Oo(InputStream inputStream, AbstractC25442OooO abstractC25442OooO, int i, int i2, int i3) throws IOException {
        OooO0O0.OooO00o();
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException();
        }
        if (!(i2 <= 16)) {
            throw new IllegalArgumentException();
        }
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i3 <= 100)) {
            throw new IllegalArgumentException();
        }
        C25429OooO0o0<Integer> c25429OooO0o0 = C25777OooO0o0.f87948OooO00o;
        if (!(i >= 0 && i <= 270 && i % 90 == 0)) {
            throw new IllegalArgumentException();
        }
        OooOo00.OooO0OO((i2 == 8 && i == 0) ? false : true, "no transformation requested");
        abstractC25442OooO.getClass();
        nativeTranscodeJpeg(inputStream, abstractC25442OooO, i, i2, i3);
    }

    public static void OooO0o0(InputStream inputStream, AbstractC25442OooO abstractC25442OooO, int i, int i2, int i3) throws IOException {
        boolean z;
        OooO0O0.OooO00o();
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException();
        }
        if (!(i2 <= 16)) {
            throw new IllegalArgumentException();
        }
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i3 <= 100)) {
            throw new IllegalArgumentException();
        }
        C25429OooO0o0<Integer> c25429OooO0o0 = C25777OooO0o0.f87948OooO00o;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            throw new IllegalArgumentException();
        }
        OooOo00.OooO0OO((i2 == 8 && i == 1) ? false : true, "no transformation requested");
        abstractC25442OooO.getClass();
        nativeTranscodeJpegWithExifOrientation(inputStream, abstractC25442OooO, i, i2, i3);
    }

    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @Override // o00ooOO0.InterfaceC25774OooO0OO
    public final boolean OooO00o(C25638OooO0oO encodedImage, C25654OooO0Oo c25654OooO0Oo) {
        C25429OooO0o0<Integer> c25429OooO0o0 = C25777OooO0o0.f87948OooO00o;
        OooOOO0.OooO0oO(encodedImage, "encodedImage");
        return false;
    }

    @Override // o00ooOO0.InterfaceC25774OooO0OO
    public final C25773OooO0O0 OooO0O0(C25638OooO0oO c25638OooO0oO, AbstractC25442OooO abstractC25442OooO, C25654OooO0Oo c25654OooO0Oo, ColorSpace colorSpace) throws IOException {
        Integer num = 85;
        if (c25654OooO0Oo == null) {
            c25654OooO0Oo = C25654OooO0Oo.f87571OooO0O0;
        }
        int iOooO00o = C25772OooO00o.OooO00o(c25654OooO0Oo, c25638OooO0oO, this.f67264OooO00o);
        try {
            C25429OooO0o0<Integer> c25429OooO0o0 = C25777OooO0o0.f87948OooO00o;
            int iMax = this.f67265OooO0O0 ? Math.max(1, 8 / iOooO00o) : 8;
            InputStream inputStreamOooOOoo = c25638OooO0oO.OooOOoo();
            C25429OooO0o0<Integer> c25429OooO0o02 = C25777OooO0o0.f87948OooO00o;
            c25638OooO0oO.ooOO();
            if (c25429OooO0o02.contains(Integer.valueOf(c25638OooO0oO.f87503OooOoO))) {
                int iOooO00o2 = C25777OooO0o0.OooO00o(c25638OooO0oO, c25654OooO0Oo);
                OooOo00.OooO0o0(inputStreamOooOOoo, "Cannot transcode from null input stream!");
                OooO0o0(inputStreamOooOOoo, abstractC25442OooO, iOooO00o2, iMax, num.intValue());
            } else {
                int iOooO0O0 = C25777OooO0o0.OooO0O0(c25638OooO0oO, c25654OooO0Oo);
                OooOo00.OooO0o0(inputStreamOooOOoo, "Cannot transcode from null input stream!");
                OooO0Oo(inputStreamOooOOoo, abstractC25442OooO, iOooO0O0, iMax, num.intValue());
            }
            C25425OooO0O0.OooO0O0(inputStreamOooOOoo);
            return new C25773OooO0O0(iOooO00o != 1 ? 0 : 1);
        } catch (Throwable th) {
            C25425OooO0O0.OooO0O0(null);
            throw th;
        }
    }

    @Override // o00ooOO0.InterfaceC25774OooO0OO
    public final boolean OooO0OO(C25623OooO0OO c25623OooO0OO) {
        return c25623OooO0OO == C25622OooO0O0.f87441OooO00o;
    }

    @Override // o00ooOO0.InterfaceC25774OooO0OO
    public final String getIdentifier() {
        return "NativeJpegTranscoder";
    }
}
