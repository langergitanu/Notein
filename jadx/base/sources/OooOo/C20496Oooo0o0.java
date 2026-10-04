package OooOo;

import OooOoO.C20509OooO0oo;
import OooooOO.C21348Ooooo0o;
import OooooOO.C21350OooooOO;
import OooooOo.AbstractC21374OooO0OO;
import OooooOo.C21373OooO0O0;
import OooooOo.C21376OooO0o;
import OooooOo.C21382OooOO0o;
import OooooOo.C21383OooOOO;
import OooooOo.C21391OooOo0;
import androidx.core.view.ViewCompat;
import com.huawei.hms.network.embedded.C18177fb;
import o00000oO.C24121OooO00o;

/* JADX INFO: renamed from: OooOo.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20496Oooo0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f58554OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f58555OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f58556OooO0OO = 0;

    public static final C20495Oooo0OO OooO(Oooo0 oooo0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooo0, "<this>");
        return new C20495Oooo0OO(oooo0);
    }

    public static final long OooO00o(float f, float f2, float f3, float f4, AbstractC21374OooO0OO colorSpace) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(colorSpace, "colorSpace");
        float fOooO0OO = colorSpace.OooO0OO(0);
        if (f <= colorSpace.OooO0O0(0) && fOooO0OO <= f) {
            float fOooO0OO2 = colorSpace.OooO0OO(1);
            if (f2 <= colorSpace.OooO0O0(1) && fOooO0OO2 <= f2) {
                float fOooO0OO3 = colorSpace.OooO0OO(2);
                if (f3 <= colorSpace.OooO0O0(2) && fOooO0OO3 <= f3 && 0.0f <= f4 && f4 <= 1.0f) {
                    if (colorSpace.OooO0Oo()) {
                        long j = (((long) ((((((int) ((f * 255.0f) + 0.5f)) << 16) | (((int) ((f4 * 255.0f) + 0.5f)) << 24)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((f3 * 255.0f) + 0.5f)))) & 4294967295L) << 32;
                        int i = C21348Ooooo0o.f61767OooO0oo;
                        return j;
                    }
                    int i2 = C21373OooO0O0.f61826OooO0o0;
                    if (((int) (colorSpace.f61828OooO0O0 >> 32)) != 3) {
                        throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
                    }
                    int i3 = colorSpace.f61829OooO0OO;
                    if (i3 == -1) {
                        throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
                    }
                    short sOooO00o = C21350OooooOO.OooO00o(f);
                    short sOooO00o2 = C21350OooooOO.OooO00o(f2);
                    short sOooO00o3 = C21350OooooOO.OooO00o(f3);
                    int iMax = (int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f);
                    long j2 = ((((long) sOooO00o2) & C18177fb.f54859s) << 32) | ((((long) sOooO00o) & C18177fb.f54859s) << 48) | ((((long) sOooO00o3) & C18177fb.f54859s) << 16) | ((((long) iMax) & 1023) << 6) | (((long) i3) & 63);
                    int i4 = C21348Ooooo0o.f61767OooO0oo;
                    return j2;
                }
            }
        }
        StringBuilder sbOooO0Oo = C20509OooO0oo.OooO0Oo("red = ", f, ", green = ", f2, ", blue = ");
        sbOooO0Oo.append(f3);
        sbOooO0Oo.append(", alpha = ");
        sbOooO0Oo.append(f4);
        sbOooO0Oo.append(" outside the range for ");
        sbOooO0Oo.append(colorSpace);
        throw new IllegalArgumentException(sbOooO0Oo.toString().toString());
    }

    public static final long OooO0O0(int i) {
        long j = ((long) i) << 32;
        int i2 = C21348Ooooo0o.f61767OooO0oo;
        return j;
    }

    public static final long OooO0OO(long j) {
        long j2 = (j & 4294967295L) << 32;
        int i = C21348Ooooo0o.f61767OooO0oo;
        return j2;
    }

    public static long OooO0Oo(int i, int i2, int i3) {
        return OooO0O0(((i & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final long OooO0o(long j, long j2, float f) {
        C21382OooOO0o c21382OooOO0o = C21376OooO0o.f61850OooOo00;
        long jOooO00o = C21348Ooooo0o.OooO00o(j, c21382OooOO0o);
        long jOooO00o2 = C21348Ooooo0o.OooO00o(j2, c21382OooOO0o);
        float fOooO0Oo = C21348Ooooo0o.OooO0Oo(jOooO00o);
        float fOooO0oo = C21348Ooooo0o.OooO0oo(jOooO00o);
        float fOooO0oO = C21348Ooooo0o.OooO0oO(jOooO00o);
        float fOooO0o0 = C21348Ooooo0o.OooO0o0(jOooO00o);
        float fOooO0Oo2 = C21348Ooooo0o.OooO0Oo(jOooO00o2);
        float fOooO0oo2 = C21348Ooooo0o.OooO0oo(jOooO00o2);
        float fOooO0oO2 = C21348Ooooo0o.OooO0oO(jOooO00o2);
        float fOooO0o02 = C21348Ooooo0o.OooO0o0(jOooO00o2);
        return C21348Ooooo0o.OooO00o(OooO00o(C24121OooO00o.OooO00o(fOooO0oo, fOooO0oo2, f), C24121OooO00o.OooO00o(fOooO0oO, fOooO0oO2, f), C24121OooO00o.OooO00o(fOooO0o0, fOooO0o02, f), C24121OooO00o.OooO00o(fOooO0Oo, fOooO0Oo2, f), c21382OooOO0o), C21348Ooooo0o.OooO0o(j2));
    }

    public static final long OooO0o0(long j, long j2) {
        float f;
        float f2;
        long jOooO00o = C21348Ooooo0o.OooO00o(j, C21348Ooooo0o.OooO0o(j2));
        float fOooO0Oo = C21348Ooooo0o.OooO0Oo(j2);
        float fOooO0Oo2 = C21348Ooooo0o.OooO0Oo(jOooO00o);
        float f3 = 1.0f - fOooO0Oo2;
        float f4 = (fOooO0Oo * f3) + fOooO0Oo2;
        float fOooO0oo = C21348Ooooo0o.OooO0oo(jOooO00o);
        float fOooO0oo2 = C21348Ooooo0o.OooO0oo(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((fOooO0oo2 * fOooO0Oo) * f3) + (fOooO0oo * fOooO0Oo2)) / f4;
        }
        float fOooO0oO = C21348Ooooo0o.OooO0oO(jOooO00o);
        float fOooO0oO2 = C21348Ooooo0o.OooO0oO(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fOooO0oO2 * fOooO0Oo) * f3) + (fOooO0oO * fOooO0Oo2)) / f4;
        }
        float fOooO0o0 = C21348Ooooo0o.OooO0o0(jOooO00o);
        float fOooO0o02 = C21348Ooooo0o.OooO0o0(j2);
        if (f4 != 0.0f) {
            f5 = (((fOooO0o02 * fOooO0Oo) * f3) + (fOooO0o0 * fOooO0Oo2)) / f4;
        }
        return OooO00o(f, f2, f5, f4, C21348Ooooo0o.OooO0o(j2));
    }

    public static final float OooO0oO(long j) {
        AbstractC21374OooO0OO abstractC21374OooO0OOOooO0o = C21348Ooooo0o.OooO0o(j);
        if (!C21373OooO0O0.OooO00o(abstractC21374OooO0OOOooO0o.f61828OooO0O0, C21373OooO0O0.f61822OooO00o)) {
            throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) C21373OooO0O0.OooO0O0(abstractC21374OooO0OOOooO0o.f61828OooO0O0))).toString());
        }
        double dOooO0oo = C21348Ooooo0o.OooO0oo(j);
        C21383OooOOO c21383OooOOO = ((C21391OooOo0) abstractC21374OooO0OOOooO0o).f61886OooOOO;
        double dOooO00o = c21383OooOOO.OooO00o(dOooO0oo);
        float fOooO00o = (float) ((c21383OooOOO.OooO00o(C21348Ooooo0o.OooO0o0(j)) * 0.0722d) + (c21383OooOOO.OooO00o(C21348Ooooo0o.OooO0oO(j)) * 0.7152d) + (dOooO00o * 0.2126d));
        if (fOooO00o <= 0.0f) {
            return 0.0f;
        }
        if (fOooO00o >= 1.0f) {
            return 1.0f;
        }
        return fOooO00o;
    }

    public static final int OooO0oo(long j) {
        float[] fArr = C21376OooO0o.f61831OooO00o;
        return (int) (C21348Ooooo0o.OooO00o(j, C21376OooO0o.f61833OooO0OO) >>> 32);
    }
}
