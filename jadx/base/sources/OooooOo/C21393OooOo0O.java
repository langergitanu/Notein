package OooooOo;

/* JADX INFO: renamed from: OooooOo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21393OooOo0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final double f61891OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final double f61892OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final double f61893OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final double f61894OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final double f61895OooO0o0;

    public C21393OooOo0O(double d, double d2, double d3, double d4, double d5) {
        this.f61891OooO00o = d;
        this.f61892OooO0O0 = d2;
        this.f61893OooO0OO = d3;
        this.f61894OooO0Oo = d4;
        this.f61895OooO0o0 = d5;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(0.0d) || Double.isNaN(0.0d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d4 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d2 < 0.0d || d < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21393OooOo0O)) {
            return false;
        }
        C21393OooOo0O c21393OooOo0O = (C21393OooOo0O) obj;
        return Double.compare(this.f61891OooO00o, c21393OooOo0O.f61891OooO00o) == 0 && Double.compare(this.f61892OooO0O0, c21393OooOo0O.f61892OooO0O0) == 0 && Double.compare(this.f61893OooO0OO, c21393OooOo0O.f61893OooO0OO) == 0 && Double.compare(this.f61894OooO0Oo, c21393OooOo0O.f61894OooO0Oo) == 0 && Double.compare(this.f61895OooO0o0, c21393OooOo0O.f61895OooO0o0) == 0 && Double.compare(0.0d, 0.0d) == 0 && Double.compare(0.0d, 0.0d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(0.0d) + ((Double.hashCode(0.0d) + ((Double.hashCode(this.f61895OooO0o0) + ((Double.hashCode(this.f61894OooO0Oo) + ((Double.hashCode(this.f61893OooO0OO) + ((Double.hashCode(this.f61892OooO0O0) + (Double.hashCode(this.f61891OooO00o) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f61891OooO00o + ", a=" + this.f61892OooO0O0 + ", b=" + this.f61893OooO0OO + ", c=" + this.f61894OooO0Oo + ", d=" + this.f61895OooO0o0 + ", e=0.0, f=0.0)";
    }
}
