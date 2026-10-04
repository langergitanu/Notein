package o00ooOO0;

import java.util.Collections;
import kotlin.jvm.internal.OooOOO0;
import o00o0Ooo.C25429OooO0o0;
import o00oo.C25638OooO0oO;
import o00oo0O.C25654OooO0Oo;

/* JADX INFO: renamed from: o00ooOO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25777OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C25429OooO0o0<Integer> f87948OooO00o;

    static {
        C25429OooO0o0<Integer> c25429OooO0o0 = new C25429OooO0o0<>(4);
        Collections.addAll(c25429OooO0o0, 2, 7, 4, 5);
        f87948OooO00o = c25429OooO0o0;
    }

    public static final int OooO00o(C25638OooO0oO encodedImage, C25654OooO0Oo c25654OooO0Oo) {
        OooOOO0.OooO0oO(encodedImage, "encodedImage");
        encodedImage.ooOO();
        Integer numValueOf = Integer.valueOf(encodedImage.f87503OooOoO);
        C25429OooO0o0<Integer> c25429OooO0o0 = f87948OooO00o;
        int iIndexOf = c25429OooO0o0.indexOf(numValueOf);
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("Only accepts inverted exif orientations");
        }
        Integer num = c25429OooO0o0.get(iIndexOf % c25429OooO0o0.size());
        OooOOO0.OooO0o(num, "get(...)");
        return num.intValue();
    }

    public static final int OooO0O0(C25638OooO0oO encodedImage, C25654OooO0Oo rotationOptions) {
        OooOOO0.OooO0oO(rotationOptions, "rotationOptions");
        OooOOO0.OooO0oO(encodedImage, "encodedImage");
        encodedImage.ooOO();
        int i = encodedImage.f87504OooOoO0;
        if (i != 90 && i != 180 && i != 270) {
            return 0;
        }
        encodedImage.ooOO();
        return encodedImage.f87504OooOoO0;
    }
}
