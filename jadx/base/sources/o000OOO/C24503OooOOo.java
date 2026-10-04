package o000OOO;

/* JADX INFO: renamed from: o000OOO.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24503OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final double f82859OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final double f82860OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final double f82861OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final double f82862OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final double f82863OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final double f82864OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final double f82865OooO0oO;

    public C24503OooOOo(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.f82859OooO00o = d;
        this.f82860OooO0O0 = d2;
        this.f82861OooO0OO = d3;
        this.f82862OooO0Oo = d4;
        this.f82864OooO0o0 = d5;
        this.f82863OooO0o = d6;
        this.f82865OooO0oO = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d == -2.0d || d == -3.0d) {
            return;
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
        if (!(obj instanceof C24503OooOOo)) {
            return false;
        }
        C24503OooOOo c24503OooOOo = (C24503OooOOo) obj;
        return Double.compare(this.f82859OooO00o, c24503OooOOo.f82859OooO00o) == 0 && Double.compare(this.f82860OooO0O0, c24503OooOOo.f82860OooO0O0) == 0 && Double.compare(this.f82861OooO0OO, c24503OooOOo.f82861OooO0OO) == 0 && Double.compare(this.f82862OooO0Oo, c24503OooOOo.f82862OooO0Oo) == 0 && Double.compare(this.f82864OooO0o0, c24503OooOOo.f82864OooO0o0) == 0 && Double.compare(this.f82863OooO0o, c24503OooOOo.f82863OooO0o) == 0 && Double.compare(this.f82865OooO0oO, c24503OooOOo.f82865OooO0oO) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f82865OooO0oO) + ((Double.hashCode(this.f82863OooO0o) + ((Double.hashCode(this.f82864OooO0o0) + ((Double.hashCode(this.f82862OooO0Oo) + ((Double.hashCode(this.f82861OooO0OO) + ((Double.hashCode(this.f82860OooO0O0) + (Double.hashCode(this.f82859OooO00o) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f82859OooO00o + ", a=" + this.f82860OooO0O0 + ", b=" + this.f82861OooO0OO + ", c=" + this.f82862OooO0Oo + ", d=" + this.f82864OooO0o0 + ", e=" + this.f82863OooO0o + ", f=" + this.f82865OooO0oO + ")";
    }

    public /* synthetic */ C24503OooOOo(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
