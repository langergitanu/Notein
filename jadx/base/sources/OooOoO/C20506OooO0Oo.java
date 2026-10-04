package OooOoO;

/* JADX INFO: renamed from: OooOoO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20506OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final float[] f58567OooO00o;

    /* JADX INFO: renamed from: OooOoO.OooO0Oo$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f58568OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f58569OooO0O0;

        public OooO00o(float f, float f2) {
            this.f58568OooO00o = f;
            this.f58569OooO0O0 = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Float.compare(this.f58568OooO00o, oooO00o.f58568OooO00o) == 0 && Float.compare(this.f58569OooO0O0, oooO00o.f58569OooO0O0) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f58569OooO0O0) + (Float.hashCode(this.f58568OooO00o) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
            sb.append(this.f58568OooO00o);
            sb.append(", velocityCoefficient=");
            return C20505OooO0OO.OooO0O0(sb, this.f58569OooO0O0, ')');
        }
    }

    static {
        float f;
        float fOooO0O0;
        float f2;
        float f3;
        float f4;
        float f5;
        float fOooO0O02;
        float f6;
        float f7;
        float f8;
        float[] fArr = new float[101];
        f58567OooO00o = fArr;
        float[] fArr2 = new float[101];
        float f9 = 0.0f;
        int i = 0;
        float f10 = 0.0f;
        while (true) {
            float f11 = 1.0f;
            if (i >= 100) {
                fArr2[100] = 1.0f;
                fArr[100] = 1.0f;
                return;
            }
            float f12 = i / 100;
            float f13 = 1.0f;
            while (true) {
                f = 2.0f;
                fOooO0O0 = C20503OooO00o.OooO0O0(f13, f9, 2.0f, f9);
                f2 = f11 - fOooO0O0;
                f3 = fOooO0O0 * 3.0f * f2;
                f4 = fOooO0O0 * fOooO0O0 * fOooO0O0;
                float fOooO0O03 = C20504OooO0O0.OooO0O0(fOooO0O0, 0.35000002f, f2 * 0.175f, f3) + f4;
                f5 = f11;
                if (Math.abs(fOooO0O03 - f12) < 1.0E-5d) {
                    break;
                }
                if (fOooO0O03 > f12) {
                    f13 = fOooO0O0;
                } else {
                    f9 = fOooO0O0;
                }
                f11 = f5;
            }
            float f14 = 0.5f;
            fArr[i] = (((f2 * 0.5f) + fOooO0O0) * f3) + f4;
            float f15 = f5;
            while (true) {
                fOooO0O02 = C20503OooO00o.OooO0O0(f15, f10, f, f10);
                f6 = f5 - fOooO0O02;
                f7 = fOooO0O02 * 3.0f * f6;
                f8 = fOooO0O02 * fOooO0O02 * fOooO0O02;
                float fOooO0O04 = C20504OooO0O0.OooO0O0(f6, f14, fOooO0O02, f7) + f8;
                if (Math.abs(fOooO0O04 - f12) >= 1.0E-5d) {
                    if (fOooO0O04 > f12) {
                        f15 = fOooO0O02;
                    } else {
                        f10 = fOooO0O02;
                    }
                    f14 = 0.5f;
                    f = 2.0f;
                }
            }
            fArr2[i] = (((fOooO0O02 * 0.35000002f) + (f6 * 0.175f)) * f7) + f8;
            i++;
        }
    }

    public static OooO00o OooO00o(float f) {
        float fOooO0O0;
        float f2;
        float f3 = 100;
        int i = (int) (f3 * f);
        if (i < 100) {
            float f4 = i / f3;
            int i2 = i + 1;
            float f5 = i2 / f3;
            float[] fArr = f58567OooO00o;
            float f6 = fArr[i];
            f2 = (fArr[i2] - f6) / (f5 - f4);
            fOooO0O0 = OooOO0.OooO0OO.OooO0O0(f, f4, f2, f6);
        } else {
            fOooO0O0 = 1.0f;
            f2 = 0.0f;
        }
        return new OooO00o(fOooO0O0, f2);
    }
}
