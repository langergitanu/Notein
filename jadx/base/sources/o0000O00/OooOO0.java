package o0000O00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public double f81402OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public double f81403OooO0o0;

    @Override // o0000O00.OooO0OO
    public final double OooO00o(double d) {
        double d2 = this.f81403OooO0o0;
        double d3 = this.f81402OooO0Oo;
        if (d < d2) {
            return (d2 * d) / (((d2 - d) * d3) + d);
        }
        return ((d - 1.0d) * (1.0d - d2)) / ((1.0d - d) - ((d2 - d) * d3));
    }
}
