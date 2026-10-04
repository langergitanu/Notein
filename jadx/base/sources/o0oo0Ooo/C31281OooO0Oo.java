package o0oo0Ooo;

import OooOoO.C20509OooO0oo;
import oO00ooO.C32442OooOO0o;
import oO0O00oo.OooOO0;

/* JADX INFO: renamed from: o0oo0Ooo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31281OooO0Oo {

    /* JADX INFO: renamed from: o0oo0Ooo.OooO0Oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f111691OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f111692OooO0O0;

        public OooO00o(float f, float f2) {
            this.f111691OooO00o = f;
            this.f111692OooO0O0 = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            oooO00o.getClass();
            return Float.compare(0.33333334f, 0.33333334f) == 0 && Float.compare(this.f111691OooO00o, oooO00o.f111691OooO00o) == 0 && Float.compare(0.6666667f, 0.6666667f) == 0 && Float.compare(this.f111692OooO0O0, oooO00o.f111692OooO0O0) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f111692OooO0O0) + C20509OooO0oo.OooO0OO(0.6666667f, C20509OooO0oo.OooO0OO(this.f111691OooO00o, Float.hashCode(0.33333334f) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Bezier(x1=0.33333334, y1=");
            sb.append(this.f111691OooO00o);
            sb.append(", x2=0.6666667, y2=");
            return Oooo00o.OooO0OO.OooO0OO(sb, this.f111692OooO0O0, ")");
        }
    }

    public static final OooO00o OooO00o(EnumC31282OooO0o0 enumC31282OooO0o0) {
        float f;
        int iOrdinal = enumC31282OooO0o0.ordinal();
        if (iOrdinal == 0) {
            f = 0.4f;
        } else {
            if (iOrdinal != 1) {
                throw new C32442OooOO0o();
            }
            f = 0.12f;
        }
        double d = f;
        return new OooO00o((float) Math.pow(0.33333334f, d), (float) Math.pow(0.6666667f, d));
    }

    public static final float OooO0O0(EnumC31282OooO0o0 enumC31282OooO0o0) {
        float f;
        float fOooO0o0 = OooOO0.OooO0o0(OooO0OO(enumC31282OooO0o0) / OooO0OO(enumC31282OooO0o0), 0.0f, 1.0f);
        int iOrdinal = enumC31282OooO0o0.ordinal();
        if (iOrdinal == 0) {
            f = 0.01f;
        } else {
            if (iOrdinal != 1) {
                throw new C32442OooOO0o();
            }
            f = 0.15f;
        }
        return 1.0f - ((1.0f - f) * OooO0Oo(fOooO0o0, enumC31282OooO0o0));
    }

    public static final float OooO0OO(EnumC31282OooO0o0 enumC31282OooO0o0) {
        int iOrdinal = enumC31282OooO0o0.ordinal();
        if (iOrdinal == 0) {
            return 120.0f;
        }
        if (iOrdinal == 1) {
            return 60.0f;
        }
        throw new C32442OooOO0o();
    }

    public static float OooO0Oo(float f, EnumC31282OooO0o0 enumC31282OooO0o0) {
        float fOooO0o0 = OooOO0.OooO0o0(f, 0.0f, 1.0f);
        OooO00o OooO00o2 = OooO00o(enumC31282OooO0o0);
        if (fOooO0o0 <= 0.0f) {
            return 0.0f;
        }
        if (fOooO0o0 >= 1.0f) {
            return 1.0f;
        }
        float f2 = OooO00o2.f111692OooO0O0 * 3.0f;
        float f3 = OooO00o2.f111691OooO00o;
        float f4 = 3.0f * f3;
        float f5 = (1.0f - f2) + f4;
        float f6 = f2 - (f3 * 6.0f);
        float f7 = fOooO0o0;
        for (int i = 0; i < 8; i++) {
            float f8 = (((0.0f * f7) + 0.0f) * f7) + 1.0f;
            float f9 = f8 * f7;
            if (f8 == 0.0f) {
                break;
            }
            float f10 = f9 - fOooO0o0;
            if (Math.abs(f10) < 1.0E-4f) {
                break;
            }
            f7 -= f10 / f8;
        }
        float f11 = 0.0f;
        float f12 = 1.0f;
        for (int i2 = 0; i2 < 10; i2++) {
            float f13 = ((((0.0f * f7) + 0.0f) * f7) + 1.0f) * f7;
            if (Math.abs(f13 - fOooO0o0) < 1.0E-4f) {
                break;
            }
            if (f13 > fOooO0o0) {
                f12 = f7;
            } else {
                f11 = f7;
            }
            f7 = (f11 + f12) * 0.5f;
        }
        return ((((f5 * f7) + f6) * f7) + f4) * f7;
    }
}
