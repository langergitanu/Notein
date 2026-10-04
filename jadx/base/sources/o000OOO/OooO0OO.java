package o000OOO;

import OooOoo0.C20703o000000o;
import OooooO0.C21292OooO0oo;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f82825OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f82826OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f82827OooO0OO;

    public OooO0OO(String str, long j, int i) {
        this.f82825OooO00o = str;
        this.f82826OooO0O0 = j;
        this.f82827OooO0OO = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float[] OooO00o(float[] fArr);

    public abstract float OooO0O0(int i);

    public abstract float OooO0OO(int i);

    public boolean OooO0Oo() {
        return false;
    }

    public abstract float[] OooO0o(float[] fArr);

    public long OooO0o0(float f, float f2, float f3) {
        float[] fArrOooO0o = OooO0o(new float[]{f, f2, f3});
        return (((long) Float.floatToRawIntBits(fArrOooO0o[0])) << 32) | (((long) Float.floatToRawIntBits(fArrOooO0o[1])) & 4294967295L);
    }

    public float OooO0oO(float f, float f2, float f3) {
        return OooO0o(new float[]{f, f2, f3})[2];
    }

    public long OooO0oo(float f, float f2, float f3, float f4, OooO0OO colorSpace) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(colorSpace, "colorSpace");
        int i = OooO0O0.f82824OooO0o0;
        float[] fArr = new float[(int) (this.f82826OooO0O0 >> 32)];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        float[] fArrOooO00o = OooO00o(fArr);
        return C21292OooO0oo.OooO00o(fArrOooO00o[0], fArrOooO00o[1], fArrOooO00o[2], f4, colorSpace);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OooO0OO oooO0OO = (OooO0OO) obj;
        if (this.f82827OooO0OO == oooO0OO.f82827OooO0OO && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f82825OooO00o, oooO0OO.f82825OooO00o)) {
            return OooO0O0.OooO00o(this.f82826OooO0O0, oooO0OO.f82826OooO0O0);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f82825OooO00o.hashCode() * 31;
        int i = OooO0O0.f82824OooO0o0;
        return C20703o000000o.OooO0O0(iHashCode, 31, this.f82826OooO0O0) + this.f82827OooO0OO;
    }

    public final String toString() {
        long j = OooO0O0.f82820OooO00o;
        long j2 = this.f82826OooO0O0;
        return this.f82825OooO00o + " (id=" + this.f82827OooO0OO + ", model=" + (OooO0O0.OooO00o(j2, j) ? "Rgb" : OooO0O0.OooO00o(j2, OooO0O0.f82821OooO0O0) ? "Xyz" : OooO0O0.OooO00o(j2, OooO0O0.f82822OooO0OO) ? "Lab" : OooO0O0.OooO00o(j2, OooO0O0.f82823OooO0Oo) ? "Cmyk" : "Unknown") + ")";
    }
}
