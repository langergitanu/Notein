package o000OOO;

import OooOOOo.C20451OooO0Oo;
import OooOOOo.C20452OooO0o0;
import OooOOOo.C20453OooO0oO;
import OooOOOo.C20454OooO0oo;
import OooOoO.C20509OooO0oo;
import OooooO0.C21292OooO0oo;
import OooooOo.C21392OooOo00;
import androidx.appcompat.widget.C21532OooOOo;
import java.util.Arrays;

/* JADX INFO: renamed from: o000OOO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24504OooOOo0 extends OooO0OO {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final com.aspose.slides.OooOo00 f82866OooOOOo = new com.aspose.slides.OooOo00();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float[] f82867OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C24505OooOOoo f82868OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f82869OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f82870OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C24503OooOOo f82871OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float[] f82872OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final float[] f82873OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooO f82874OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final com.google.gson.internal.OooO0OO f82875OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final OooOOOO f82876OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final OooO f82877OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final boolean f82878OooOOOO;

    /* JADX INFO: renamed from: o000OOO.OooOOo0$OooO00o */
    public static final class OooO00o {
        public static float OooO00o(float[] fArr) {
            if (fArr.length < 6) {
                return 0.0f;
            }
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = fArr[3];
            float f5 = fArr[4];
            float f6 = fArr[5];
            float fOooO00o = C21392OooOo00.OooO00o(f, f6, (((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3), 0.5f);
            return fOooO00o < 0.0f ? -fOooO00o : fOooO00o;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C24504OooOOo0(String str, float[] fArr, C24505OooOOoo c24505OooOOoo, final C24503OooOOo c24503OooOOo, int i) {
        double d = c24503OooOOo.f82859OooO00o;
        boolean z = d == -3.0d;
        double d2 = c24503OooOOo.f82865OooO0oO;
        double d3 = c24503OooOOo.f82863OooO0o;
        this(str, fArr, c24505OooOOoo, null, z ? new com.google.gson.internal.OooO0o(c24503OooOOo) : d == -2.0d ? new C20451OooO0Oo(c24503OooOOo) : (d3 == 0.0d && d2 == 0.0d) ? new C20452OooO0o0(c24503OooOOo) : new OooOOOo.OooO0o(c24503OooOOo), d == -3.0d ? new C20453OooO0oO(c24503OooOOo) : d == -2.0d ? new C20454OooO0oo(c24503OooOOo) : (d3 == 0.0d && d2 == 0.0d) ? new OooOOOo.OooO(c24503OooOOo) : new OooO() { // from class: o000OOO.OooOOOo
            @Override // o000OOO.OooO
            public final double OooO00o(double d4) {
                C24503OooOOo c24503OooOOo2 = c24503OooOOo;
                return d4 >= c24503OooOOo2.f82864OooO0o0 ? Math.pow((c24503OooOOo2.f82860OooO0O0 * d4) + c24503OooOOo2.f82861OooO0OO, c24503OooOOo2.f82859OooO00o) + c24503OooOOo2.f82863OooO0o : (c24503OooOOo2.f82862OooO0Oo * d4) + c24503OooOOo2.f82865OooO0oO;
            }
        }, 0.0f, 1.0f, c24503OooOOo, i);
    }

    @Override // o000OOO.OooO0OO
    public final float[] OooO00o(float[] fArr) {
        C24497OooO0Oo.OooO0oO(this.f82873OooOO0, fArr);
        if (fArr.length < 3) {
            return fArr;
        }
        double d = fArr[0];
        com.google.gson.internal.OooO0OO oooO0OO = this.f82875OooOO0o;
        fArr[0] = (float) oooO0OO.OooO00o(d);
        fArr[1] = (float) oooO0OO.OooO00o(fArr[1]);
        fArr[2] = (float) oooO0OO.OooO00o(fArr[2]);
        return fArr;
    }

    @Override // o000OOO.OooO0OO
    public final float OooO0O0(int i) {
        return this.f82869OooO0o;
    }

    @Override // o000OOO.OooO0OO
    public final float OooO0OO(int i) {
        return this.f82870OooO0o0;
    }

    @Override // o000OOO.OooO0OO
    public final boolean OooO0Oo() {
        return this.f82878OooOOOO;
    }

    @Override // o000OOO.OooO0OO
    public final float[] OooO0o(float[] fArr) {
        if (fArr.length < 3) {
            return fArr;
        }
        double d = fArr[0];
        OooOOOO oooOOOO = this.f82876OooOOO;
        fArr[0] = (float) oooOOOO.OooO00o(d);
        fArr[1] = (float) oooOOOO.OooO00o(fArr[1]);
        fArr[2] = (float) oooOOOO.OooO00o(fArr[2]);
        C24497OooO0Oo.OooO0oO(this.f82867OooO, fArr);
        return fArr;
    }

    @Override // o000OOO.OooO0OO
    public final long OooO0o0(float f, float f2, float f3) {
        double d = f;
        OooOOOO oooOOOO = this.f82876OooOOO;
        float fOooO00o = (float) oooOOOO.OooO00o(d);
        float fOooO00o2 = (float) oooOOOO.OooO00o(f2);
        float fOooO00o3 = (float) oooOOOO.OooO00o(f3);
        float[] fArr = this.f82867OooO;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * fOooO00o3) + (fArr[3] * fOooO00o2) + (fArr[0] * fOooO00o);
        return (((long) Float.floatToRawIntBits((fArr[7] * fOooO00o3) + (fArr[4] * fOooO00o2) + (fArr[1] * fOooO00o))) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }

    @Override // o000OOO.OooO0OO
    public final float OooO0oO(float f, float f2, float f3) {
        double d = f;
        OooOOOO oooOOOO = this.f82876OooOOO;
        float fOooO00o = (float) oooOOOO.OooO00o(d);
        float fOooO00o2 = (float) oooOOOO.OooO00o(f2);
        float fOooO00o3 = (float) oooOOOO.OooO00o(f3);
        float[] fArr = this.f82867OooO;
        return (fArr[8] * fOooO00o3) + (fArr[5] * fOooO00o2) + (fArr[2] * fOooO00o);
    }

    @Override // o000OOO.OooO0OO
    public final long OooO0oo(float f, float f2, float f3, float f4, OooO0OO colorSpace) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(colorSpace, "colorSpace");
        float[] fArr = this.f82873OooOO0;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        com.google.gson.internal.OooO0OO oooO0OO = this.f82875OooOO0o;
        return C21292OooO0oo.OooO00o((float) oooO0OO.OooO00o(f5), (float) oooO0OO.OooO00o(f6), (float) oooO0OO.OooO00o(f7), f4, colorSpace);
    }

    @Override // o000OOO.OooO0OO
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C24504OooOOo0.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C24504OooOOo0 c24504OooOOo0 = (C24504OooOOo0) obj;
        if (Float.compare(c24504OooOOo0.f82870OooO0o0, this.f82870OooO0o0) != 0 || Float.compare(c24504OooOOo0.f82869OooO0o, this.f82869OooO0o) != 0 || !kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82868OooO0Oo, c24504OooOOo0.f82868OooO0Oo) || !Arrays.equals(this.f82872OooO0oo, c24504OooOOo0.f82872OooO0oo)) {
            return false;
        }
        C24503OooOOo c24503OooOOo = c24504OooOOo0.f82871OooO0oO;
        C24503OooOOo c24503OooOOo2 = this.f82871OooO0oO;
        if (c24503OooOOo2 != null) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(c24503OooOOo2, c24503OooOOo);
        }
        if (c24503OooOOo == null) {
            return true;
        }
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82874OooOO0O, c24504OooOOo0.f82874OooOO0O)) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82877OooOOO0, c24504OooOOo0.f82877OooOOO0);
        }
        return false;
    }

    @Override // o000OOO.OooO0OO
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f82872OooO0oo) + ((this.f82868OooO0Oo.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.f82870OooO0o0;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f82869OooO0o;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        C24503OooOOo c24503OooOOo = this.f82871OooO0oO;
        int iHashCode2 = iFloatToIntBits2 + (c24503OooOOo != null ? c24503OooOOo.hashCode() : 0);
        if (c24503OooOOo == null) {
            return this.f82877OooOOO0.hashCode() + ((this.f82874OooOO0O.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C24504OooOOo0(String str, float[] primaries, C24505OooOOoo c24505OooOOoo, float[] fArr, OooO oetf, OooO eotf, float f, float f2, C24503OooOOo c24503OooOOo, int i) {
        int i2;
        int i3;
        int i4;
        float f3;
        float f4;
        boolean z;
        double d;
        super(str, OooO0O0.f82820OooO00o, i);
        kotlin.jvm.internal.OooOOO0.OooO0oO(primaries, "primaries");
        kotlin.jvm.internal.OooOOO0.OooO0oO(oetf, "oetf");
        kotlin.jvm.internal.OooOOO0.OooO0oO(eotf, "eotf");
        this.f82868OooO0Oo = c24505OooOOoo;
        this.f82870OooO0o0 = f;
        this.f82869OooO0o = f2;
        this.f82871OooO0oO = c24503OooOOo;
        this.f82874OooOO0O = oetf;
        this.f82875OooOO0o = new com.google.gson.internal.OooO0OO(this);
        this.f82877OooOOO0 = eotf;
        this.f82876OooOOO = new OooOOOO(this);
        if (primaries.length != 6 && primaries.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f < f2) {
            float[] fArr2 = new float[6];
            if (primaries.length == 9) {
                float f5 = primaries[0];
                float f6 = primaries[1];
                float f7 = f5 + f6 + primaries[2];
                fArr2[0] = f5 / f7;
                fArr2[1] = f6 / f7;
                float f8 = primaries[3];
                float f9 = primaries[4];
                float f10 = f8 + f9 + primaries[5];
                fArr2[2] = f8 / f10;
                fArr2[3] = f9 / f10;
                float f11 = primaries[6];
                float f12 = primaries[7];
                float f13 = f11 + f12 + primaries[8];
                fArr2[4] = f11 / f13;
                fArr2[5] = f12 / f13;
            } else {
                System.arraycopy(primaries, 0, fArr2, 0, 6);
            }
            this.f82872OooO0oo = fArr2;
            if (fArr == null) {
                float f14 = fArr2[0];
                float f15 = fArr2[1];
                float f16 = fArr2[2];
                float f17 = fArr2[3];
                float f18 = fArr2[4];
                float f19 = fArr2[5];
                f3 = 1.0f;
                float f20 = 1;
                float f21 = (f20 - f14) / f15;
                float f22 = (f20 - f16) / f17;
                float f23 = (f20 - f18) / f19;
                i2 = 0;
                float f24 = c24505OooOOoo.f82879OooO00o;
                i4 = 1;
                float f25 = c24505OooOOoo.f82880OooO0O0;
                float f26 = (f20 - f24) / f25;
                float f27 = f14 / f15;
                float f28 = f24 / f25;
                float f29 = (f16 / f17) - f27;
                float f30 = f28 - f27;
                float f31 = f22 - f21;
                float f32 = ((f26 - f21) * f29) - (f30 * f31);
                float f33 = (f23 - f21) * f29;
                i3 = 6;
                float f34 = (f18 / f19) - f27;
                float f35 = f32 / (f33 - (f31 * f34));
                float fOooO0O0 = C20509OooO0oo.OooO0O0(f35, f34, f30, f29);
                float f36 = (1.0f - fOooO0O0) - f35;
                float f37 = f36 / f15;
                float f38 = fOooO0O0 / f17;
                float f39 = f35 / f19;
                this.f82867OooO = new float[]{f37 * f14, f36, ((1.0f - f14) - f15) * f37, f38 * f16, fOooO0O0, ((1.0f - f16) - f17) * f38, f39 * f18, f35, ((1.0f - f18) - f19) * f39};
            } else {
                i2 = 0;
                i3 = 6;
                i4 = 1;
                f3 = 1.0f;
                if (fArr.length == 9) {
                    this.f82867OooO = fArr;
                } else {
                    throw new IllegalArgumentException(C21532OooOOo.OooO0OO(fArr.length, "Transform must have 9 entries! Has "));
                }
            }
            this.f82873OooOO0 = C24497OooO0Oo.OooO0o0(this.f82867OooO);
            float fOooO00o = OooO00o.OooO00o(fArr2);
            float[] fArr3 = C24498OooO0o0.f82829OooO00o;
            if (fOooO00o / OooO00o.OooO00o(C24498OooO0o0.f82830OooO0O0) > 0.9f) {
                float[] fArr4 = C24498OooO0o0.f82829OooO00o;
                float f40 = fArr2[i2];
                float f41 = fArr4[i2];
                float f42 = fArr2[i4];
                float f43 = fArr4[i4];
                float f44 = fArr2[2];
                float f45 = fArr4[2];
                float f46 = fArr2[3];
                float f47 = fArr4[3];
                float f48 = fArr2[4];
                float f49 = fArr4[4];
                float f50 = fArr2[5];
                float f51 = fArr4[5];
                float f52 = f50 - f51;
                f4 = 0.0f;
                float[] fArr5 = new float[i3];
                fArr5[i2] = f40 - f41;
                fArr5[i4] = f42 - f43;
                fArr5[2] = f44 - f45;
                fArr5[3] = f46 - f47;
                fArr5[4] = f48 - f49;
                fArr5[5] = f52;
                float f53 = fArr5[i2];
                float f54 = fArr5[i4];
                if (((f43 - f51) * f53) - ((f41 - f49) * f54) >= 0.0f && ((f41 - f45) * f54) - ((f43 - f47) * f53) >= 0.0f) {
                    float f55 = fArr5[2];
                    float f56 = fArr5[3];
                    if (((f47 - f43) * f55) - ((f45 - f41) * f56) >= 0.0f && ((f45 - f49) * f56) - ((f47 - f51) * f55) >= 0.0f) {
                        float f57 = fArr5[4];
                        float f58 = fArr5[5];
                        if (((f51 - f47) * f57) - ((f49 - f45) * f58) < 0.0f || ((f49 - f41) * f58) - ((f51 - f43) * f57) < 0.0f) {
                        }
                    }
                }
                if (i != 0) {
                    float[] fArr6 = C24498OooO0o0.f82829OooO00o;
                    if (fArr2 == fArr6) {
                        if (C24497OooO0Oo.OooO0OO(c24505OooOOoo, OooOO0.f82849OooO0Oo) && f == f4 && f2 == f3) {
                            float[] fArr7 = C24498OooO0o0.f82829OooO00o;
                            C24504OooOOo0 c24504OooOOo0 = C24498OooO0o0.f82834OooO0o0;
                            for (d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                                if ((Math.abs(oetf.OooO00o(d) - c24504OooOOo0.f82874OooOO0O.OooO00o(d)) <= 0.001d ? i4 : i2) != 0) {
                                    if ((Math.abs(eotf.OooO00o(d) - c24504OooOOo0.f82877OooOOO0.OooO00o(d)) <= 0.001d ? i4 : i2) != 0) {
                                    }
                                }
                            }
                            z = i4;
                        }
                        z = i2;
                        break;
                    }
                    for (int i5 = i2; i5 < 6; i5++) {
                        if (Float.compare(fArr2[i5], fArr6[i5]) != 0 && Math.abs(fArr2[i5] - fArr6[i5]) > 0.001f) {
                            break;
                        }
                    }
                    if (C24497OooO0Oo.OooO0OO(c24505OooOOoo, OooOO0.f82849OooO0Oo)) {
                        float[] fArr72 = C24498OooO0o0.f82829OooO00o;
                        C24504OooOOo0 c24504OooOOo02 = C24498OooO0o0.f82834OooO0o0;
                        while (d <= 1.0d) {
                        }
                        z = i4;
                    }
                    z = i2;
                    break;
                }
                z = i4;
                this.f82878OooOOOO = z;
                return;
            }
            f4 = 0.0f;
            int i6 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
            if (i != 0) {
            }
            this.f82878OooOOOO = z;
            return;
        }
        throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C24504OooOOo0(String str, float[] fArr, C24505OooOOoo c24505OooOOoo, final double d, float f, float f2, int i) {
        OooO oooO = f82866OooOOOo;
        this(str, fArr, c24505OooOOoo, null, d == 1.0d ? oooO : new OooO() { // from class: o000OOO.OooOOO0
            @Override // o000OOO.OooO
            public final double OooO00o(double d2) {
                if (d2 < 0.0d) {
                    d2 = 0.0d;
                }
                return Math.pow(d2, 1.0d / d);
            }
        }, d != 1.0d ? new OooO() { // from class: o000OOO.OooOOO
            @Override // o000OOO.OooO
            public final double OooO00o(double d2) {
                if (d2 < 0.0d) {
                    d2 = 0.0d;
                }
                return Math.pow(d2, d);
            }
        } : oooO, f, f2, new C24503OooOOo(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
