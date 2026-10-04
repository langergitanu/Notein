package OooooOo;

import OooOo.C20496Oooo0o0;
import OooOoo0.C20703o000000o;

/* JADX INFO: renamed from: OooooOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21374OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f61827OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f61828OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f61829OooO0OO;

    public AbstractC21374OooO0OO(String str, long j, int i) {
        this.f61827OooO00o = str;
        this.f61828OooO0O0 = j;
        this.f61829OooO0OO = i;
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
        return (((long) Float.floatToIntBits(fArrOooO0o[0])) << 32) | (((long) Float.floatToIntBits(fArrOooO0o[1])) & 4294967295L);
    }

    public float OooO0oO(float f, float f2, float f3) {
        return OooO0o(new float[]{f, f2, f3})[2];
    }

    public long OooO0oo(float f, float f2, float f3, float f4, AbstractC21374OooO0OO colorSpace) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(colorSpace, "colorSpace");
        int i = C21373OooO0O0.f61826OooO0o0;
        float[] fArr = new float[(int) (this.f61828OooO0O0 >> 32)];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        float[] fArrOooO00o = OooO00o(fArr);
        return C20496Oooo0o0.OooO00o(fArrOooO00o[0], fArrOooO00o[1], fArrOooO00o[2], f4, colorSpace);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC21374OooO0OO abstractC21374OooO0OO = (AbstractC21374OooO0OO) obj;
        if (this.f61829OooO0OO == abstractC21374OooO0OO.f61829OooO0OO && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f61827OooO00o, abstractC21374OooO0OO.f61827OooO00o)) {
            return C21373OooO0O0.OooO00o(this.f61828OooO0O0, abstractC21374OooO0OO.f61828OooO0O0);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f61827OooO00o.hashCode() * 31;
        int i = C21373OooO0O0.f61826OooO0o0;
        return C20703o000000o.OooO0O0(iHashCode, 31, this.f61828OooO0O0) + this.f61829OooO0OO;
    }

    public final String toString() {
        return this.f61827OooO00o + " (id=" + this.f61829OooO0OO + ", model=" + ((Object) C21373OooO0O0.OooO0O0(this.f61828OooO0O0)) + ')';
    }
}
