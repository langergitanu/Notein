package oOO00OO0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final double f123307OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final double f123308OooO0O0;

    public OooO0OO(double d, double d2) {
        this.f123307OooO00o = d;
        this.f123308OooO0O0 = d2;
    }

    public final Object clone() throws CloneNotSupportedException {
        return new OooO0OO(this.f123307OooO00o, this.f123308OooO0O0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0OO)) {
            return false;
        }
        OooO0OO oooO0OO = (OooO0OO) obj;
        return this.f123307OooO00o == oooO0OO.f123307OooO00o && this.f123308OooO0O0 == oooO0OO.f123308OooO0O0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f123307OooO00o);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f123308OooO0O0);
        return (i * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public final String toString() {
        return "{" + this.f123307OooO00o + ", " + this.f123308OooO0O0 + "}";
    }

    public OooO0OO() {
        this(0.0d, 0.0d);
    }
}
