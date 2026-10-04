package OooOoOO;

/* JADX INFO: renamed from: OooOoOO.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20556OoooO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f58726OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public double f58727OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f58728OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public double f58729OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public double f58730OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public double f58731OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f58732OooO0oO;

    public final long OooO00o(float f, float f2, long j) {
        double dCos;
        double dExp;
        if (!this.f58728OooO0OO) {
            if (this.f58726OooO00o == Float.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f3 = this.f58732OooO0oO;
            double d = f3;
            double d2 = d * d;
            if (f3 > 1.0f) {
                double d3 = this.f58727OooO0O0;
                double d4 = d2 - ((double) 1);
                this.f58729OooO0Oo = (Math.sqrt(d4) * d3) + (((double) (-f3)) * d3);
                double d5 = -this.f58732OooO0oO;
                double d6 = this.f58727OooO0O0;
                this.f58731OooO0o0 = (d5 * d6) - (Math.sqrt(d4) * d6);
            } else if (f3 >= 0.0f && f3 < 1.0f) {
                this.f58730OooO0o = Math.sqrt(((double) 1) - d2) * this.f58727OooO0O0;
            }
            this.f58728OooO0OO = true;
        }
        float f4 = f - this.f58726OooO00o;
        double d7 = j / 1000.0d;
        float f5 = this.f58732OooO0oO;
        if (f5 > 1.0f) {
            double d8 = f4;
            double d9 = this.f58731OooO0o0;
            double d10 = ((d9 * d8) - ((double) f2)) / (d9 - this.f58729OooO0Oo);
            double d11 = d8 - d10;
            dExp = (Math.exp(this.f58729OooO0Oo * d7) * d10) + (Math.exp(d9 * d7) * d11);
            double d12 = this.f58731OooO0o0;
            double dExp2 = Math.exp(d12 * d7) * d11 * d12;
            double d13 = this.f58729OooO0Oo;
            dCos = (Math.exp(d13 * d7) * d10 * d13) + dExp2;
        } else if (f5 == 1.0f) {
            double d14 = this.f58727OooO0O0;
            double d15 = f4;
            double d16 = (d14 * d15) + ((double) f2);
            double d17 = (d16 * d7) + d15;
            dExp = Math.exp((-d14) * d7) * d17;
            double dExp3 = Math.exp((-this.f58727OooO0O0) * d7) * d17;
            double d18 = -this.f58727OooO0O0;
            dCos = (dExp3 * d18) + (Math.exp(d18 * d7) * d16);
        } else {
            double d19 = ((double) 1) / this.f58730OooO0o;
            double d20 = this.f58727OooO0O0;
            double d21 = f4;
            double d22 = ((((double) f5) * d20 * d21) + ((double) f2)) * d19;
            double dExp4 = Math.exp(((double) (-f5)) * d20 * d7) * ((Math.sin(this.f58730OooO0o * d7) * d22) + (Math.cos(this.f58730OooO0o * d7) * d21));
            double d23 = this.f58727OooO0O0;
            float f6 = this.f58732OooO0oO;
            double d24 = (-d23) * dExp4 * ((double) f6);
            double dExp5 = Math.exp(((double) (-f6)) * d23 * d7);
            double d25 = this.f58730OooO0o;
            double dSin = Math.sin(d25 * d7) * (-d25) * d21;
            double d26 = this.f58730OooO0o;
            dCos = (((Math.cos(d26 * d7) * d22 * d26) + dSin) * dExp5) + d24;
            dExp = dExp4;
        }
        return (((long) Float.floatToIntBits((float) (dExp + ((double) this.f58726OooO00o)))) << 32) | (((long) Float.floatToIntBits((float) dCos)) & 4294967295L);
    }
}
