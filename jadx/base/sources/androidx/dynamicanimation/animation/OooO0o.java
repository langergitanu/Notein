package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public double f64690OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public double f64691OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public double f64692OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f64693OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public double f64694OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public double f64695OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public double f64696OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public double f64697OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public double f64698OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO0O0.C21858OooOOOo f64699OooOO0;

    public OooO0o() {
        this.f64691OooO00o = Math.sqrt(1500.0d);
        this.f64692OooO0O0 = 0.5d;
        this.f64693OooO0OO = false;
        this.f64690OooO = Double.MAX_VALUE;
        this.f64699OooOO0 = new OooO0O0.C21858OooOOOo();
    }

    public final void OooO00o(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f64691OooO00o = Math.sqrt(f);
        this.f64693OooO0OO = false;
    }

    public final OooO0O0.C21858OooOOOo OooO0O0(long j, double d, double d2) {
        double dSin;
        double dCos;
        if (!this.f64693OooO0OO) {
            if (this.f64690OooO == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d3 = this.f64692OooO0O0;
            if (d3 > 1.0d) {
                double d4 = this.f64691OooO00o;
                this.f64695OooO0o = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.f64692OooO0O0;
                double d6 = this.f64691OooO00o;
                this.f64697OooO0oO = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.f64698OooO0oo = Math.sqrt(1.0d - (d3 * d3)) * this.f64691OooO00o;
            }
            this.f64693OooO0OO = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.f64690OooO;
        double d9 = this.f64692OooO0O0;
        if (d9 > 1.0d) {
            double d10 = this.f64697OooO0oO;
            double d11 = ((d10 * d8) - d2) / (d10 - this.f64695OooO0o);
            double d12 = d8 - d11;
            dSin = (Math.pow(2.718281828459045d, this.f64695OooO0o * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.f64697OooO0oO;
            double dPow = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.f64695OooO0o;
            dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow;
        } else if (d9 == 1.0d) {
            double d15 = this.f64691OooO00o;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double dPow2 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f64691OooO00o) * d7) * d17;
            double d18 = -this.f64691OooO00o;
            dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow3 * d18);
            dSin = dPow2;
        } else {
            double d19 = 1.0d / this.f64698OooO0oo;
            double d20 = this.f64691OooO00o;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            dSin = ((Math.sin(this.f64698OooO0oo * d7) * d21) + (Math.cos(this.f64698OooO0oo * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.f64691OooO00o;
            double d23 = this.f64692OooO0O0;
            double d24 = (-d22) * dSin * d23;
            double dPow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.f64698OooO0oo;
            double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.f64698OooO0oo;
            dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow4) + d24;
        }
        float f = (float) (dSin + this.f64690OooO);
        OooO0O0.C21858OooOOOo c21858OooOOOo = this.f64699OooOO0;
        c21858OooOOOo.f64686OooO00o = f;
        c21858OooOOOo.f64687OooO0O0 = (float) dCos;
        return c21858OooOOOo;
    }

    public OooO0o(float f) {
        this.f64691OooO00o = Math.sqrt(1500.0d);
        this.f64692OooO0O0 = 0.5d;
        this.f64693OooO0OO = false;
        this.f64699OooOO0 = new OooO0O0.C21858OooOOOo();
        this.f64690OooO = f;
    }
}
