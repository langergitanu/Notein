package OooOoOO;

import OooOoO.C20509OooO0oo;

/* JADX INFO: renamed from: OooOoOO.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20534OooOo0 implements InterfaceC20539OooOoO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f58654OooO00o;

    public C20534OooOo0(float f) {
        this.f58654OooO00o = f;
        if (Float.isNaN(f) || Float.isNaN(0.0f) || Float.isNaN(0.2f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", 0.0, 0.2, 1.0.").toString());
        }
    }

    public static float OooO0O0(float f, float f2, float f3) {
        float f4 = 3;
        float f5 = 1 - f3;
        return (f3 * f3 * f3) + (f4 * f2 * f5 * f3 * f3) + (f * f4 * f5 * f5 * f3);
    }

    @Override // OooOoOO.InterfaceC20539OooOoO0
    public final float OooO00o(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            return f;
        }
        float f2 = 0.0f;
        float f3 = 1.0f;
        while (true) {
            float f4 = (f2 + f3) / 2;
            float fOooO0O0 = OooO0O0(this.f58654OooO00o, 0.2f, f4);
            if (Math.abs(f - fOooO0O0) < 0.001f) {
                return OooO0O0(0.0f, 1.0f, f4);
            }
            if (fOooO0O0 < f) {
                f2 = f4;
            } else {
                f3 = f4;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C20534OooOo0) {
            return this.f58654OooO00o == ((C20534OooOo0) obj).f58654OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + C20509OooO0oo.OooO0OO(0.2f, C20509OooO0oo.OooO0OO(0.0f, Float.hashCode(this.f58654OooO00o) * 31, 31), 31);
    }
}
