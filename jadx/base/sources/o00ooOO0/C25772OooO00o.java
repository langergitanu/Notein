package o00ooOO0;

import kotlin.jvm.internal.OooOOO0;
import o00oOoOo.C25622OooO0O0;
import o00oOoOo.C25623OooO0OO;
import o00oo.C25638OooO0oO;
import o00oo0O.C25654OooO0Oo;

/* JADX INFO: renamed from: o00ooOO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25772OooO00o {
    public static final int OooO00o(C25654OooO0Oo c25654OooO0Oo, C25638OooO0oO encodedImage, int i) {
        OooOOO0.OooO0oO(encodedImage, "encodedImage");
        if (!C25638OooO0oO.Oooo00o(encodedImage)) {
            return 1;
        }
        if (!C25638OooO0oO.Oooo00o(encodedImage)) {
            throw new IllegalStateException("Check failed.");
        }
        encodedImage.ooOO();
        C25623OooO0OO c25623OooO0OO = C25622OooO0O0.f87441OooO00o;
        encodedImage.ooOO();
        int i2 = encodedImage.f87507OooOoo0;
        encodedImage.ooOO();
        int iMax = Math.max(i2, encodedImage.f87505OooOoOO);
        float f = i;
        int i3 = 1;
        while (iMax / i3 > f) {
            encodedImage.ooOO();
            i3 = encodedImage.f87501OooOo == C25622OooO0O0.f87441OooO00o ? i3 * 2 : i3 + 1;
        }
        return i3;
    }
}
