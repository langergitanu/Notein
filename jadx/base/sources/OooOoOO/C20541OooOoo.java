package OooOoOO;

/* JADX INFO: renamed from: OooOoOO.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20541OooOoo implements InterfaceC20542OooOoo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f58669OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C20556OoooO00 f58670OooO0O0;

    /* JADX WARN: Illegal instructions before constructor call */
    public C20541OooOoo() {
        float f = 0.0f;
        this(f, f, 7);
    }

    @Override // OooOoOO.InterfaceC20542OooOoo0
    public final float OooO0O0(long j, float f, float f2, float f3) {
        C20556OoooO00 c20556OoooO00 = this.f58670OooO0O0;
        c20556OoooO00.f58726OooO00o = f2;
        return Float.intBitsToFloat((int) (c20556OoooO00.OooO00o(f, f3, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x028a  */
    @Override // OooOoOO.InterfaceC20542OooOoo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long OooO0OO(float f, float f2, float f3) {
        double d;
        double d2;
        C20535OooOo00 c20535OooOo00;
        C20550Oooo0o c20550Oooo0o;
        C20552Oooo0oO c20552Oooo0oO;
        double d3;
        int i;
        double dAbs;
        double dLog;
        long j;
        C20553Oooo0oo c20553Oooo0oo;
        C20556OoooO00 c20556OoooO00 = this.f58670OooO0O0;
        double d4 = c20556OoooO00.f58727OooO0O0;
        float f4 = c20556OoooO00.f58732OooO0oO;
        float f5 = this.f58669OooO00o;
        double d5 = (float) (d4 * d4);
        double d6 = f4;
        double d7 = f3 / f5;
        double d8 = (f - f2) / f5;
        double d9 = 1.0f;
        double dSqrt = d6 * 2.0d * Math.sqrt(d5);
        double d10 = -dSqrt;
        double d11 = (dSqrt * dSqrt) - (4.0d * d5);
        if (d11 < 0.0d) {
            d = d6;
            d2 = d8;
            c20535OooOo00 = new C20535OooOo00(0.0d, Math.sqrt(Math.abs(d11)));
        } else {
            d = d6;
            d2 = d8;
            c20535OooOo00 = new C20535OooOo00(Math.sqrt(d11), 0.0d);
        }
        c20535OooOo00.f58655OooO00o = (c20535OooOo00.f58655OooO00o + d10) / 2.0d;
        c20535OooOo00.f58656OooO0O0 /= 2.0d;
        C20535OooOo00 c20535OooOo002 = d11 < 0.0d ? new C20535OooOo00(0.0d, Math.sqrt(Math.abs(d11))) : new C20535OooOo00(Math.sqrt(d11), 0.0d);
        double d12 = -1;
        double d13 = c20535OooOo002.f58655OooO00o * d12;
        double d14 = c20535OooOo002.f58656OooO0O0 * d12;
        c20535OooOo002.f58655OooO00o = (d13 + d10) / 2.0d;
        c20535OooOo002.f58656OooO0O0 = d14 / 2.0d;
        if (d2 == 0.0d && d7 == 0.0d) {
            j = 0;
        } else {
            if (d2 < 0.0d) {
                d7 = -d7;
            }
            double dAbs2 = Math.abs(d2);
            if (d > 1.0d) {
                double d15 = c20535OooOo00.f58655OooO00o;
                double d16 = c20535OooOo002.f58655OooO00o;
                double d17 = d15 - d16;
                double d18 = ((d15 * dAbs2) - d7) / d17;
                double d19 = dAbs2 - d18;
                dLog = Math.log(Math.abs(d9 / d19)) / d15;
                double dLog2 = Math.log(Math.abs(d9 / d18)) / d16;
                if (Double.isInfinite(dLog) || Double.isNaN(dLog)) {
                    dLog = dLog2;
                } else if (!Double.isInfinite(dLog2) && !Double.isNaN(dLog2)) {
                    dLog = Math.max(dLog, dLog2);
                }
                double d20 = d19 * d15;
                double dLog3 = Math.log(d20 / ((-d18) * d16)) / (d16 - d15);
                if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
                    d9 = -d9;
                    c20553Oooo0oo = new C20553Oooo0oo(d19, d15, d18, d16, d9);
                    C20545Oooo c20545Oooo = new C20545Oooo(d19, d15, d18, d16);
                    if (Math.abs(((Number) c20553Oooo0oo.invoke(Double.valueOf(dLog))).doubleValue()) >= 1.0E-4d) {
                        d3 = dLog;
                        int i2 = 0;
                        double dAbs3 = Double.MAX_VALUE;
                        while (dAbs3 > 0.001d && i2 < 100) {
                            i2++;
                            double dDoubleValue = d3 - (((Number) c20553Oooo0oo.invoke(Double.valueOf(d3))).doubleValue() / ((Number) c20545Oooo.invoke(Double.valueOf(d3))).doubleValue());
                            dAbs3 = Math.abs(d3 - dDoubleValue);
                            d3 = dDoubleValue;
                        }
                        dLog = d3;
                    }
                    j = (long) (dLog * 1000.0d);
                } else {
                    if (dLog3 > 0.0d) {
                        if ((-((Math.exp(dLog3 * d16) * d18) + (Math.exp(d15 * dLog3) * d19))) < d9) {
                            if (d18 > 0.0d && d19 < 0.0d) {
                                dLog = 0.0d;
                            }
                            d9 = -d9;
                            c20553Oooo0oo = new C20553Oooo0oo(d19, d15, d18, d16, d9);
                            C20545Oooo c20545Oooo2 = new C20545Oooo(d19, d15, d18, d16);
                            if (Math.abs(((Number) c20553Oooo0oo.invoke(Double.valueOf(dLog))).doubleValue()) >= 1.0E-4d) {
                            }
                            j = (long) (dLog * 1000.0d);
                        }
                    }
                    dLog = Math.log((-((d18 * d16) * d16)) / (d20 * d15)) / d17;
                    c20553Oooo0oo = new C20553Oooo0oo(d19, d15, d18, d16, d9);
                    C20545Oooo c20545Oooo22 = new C20545Oooo(d19, d15, d18, d16);
                    if (Math.abs(((Number) c20553Oooo0oo.invoke(Double.valueOf(dLog))).doubleValue()) >= 1.0E-4d) {
                    }
                    j = (long) (dLog * 1000.0d);
                }
            } else {
                double d21 = d7;
                if (d < 1.0d) {
                    double d22 = c20535OooOo00.f58655OooO00o;
                    double d23 = (d21 - (d22 * dAbs2)) / c20535OooOo00.f58656OooO0O0;
                    dLog = Math.log(d9 / Math.sqrt((d23 * d23) + (dAbs2 * dAbs2))) / d22;
                    j = (long) (dLog * 1000.0d);
                } else {
                    double d24 = c20535OooOo00.f58655OooO00o;
                    double d25 = d24 * dAbs2;
                    double d26 = d21 - d25;
                    double dLog4 = Math.log(Math.abs(d9 / dAbs2)) / d24;
                    double dLog5 = Math.log(Math.abs(d9 / d26));
                    double dLog6 = dLog5;
                    for (int i3 = 0; i3 < 6; i3++) {
                        dLog6 = dLog5 - Math.log(Math.abs(dLog6 / d24));
                    }
                    double d27 = dLog6 / d24;
                    if (Double.isInfinite(dLog4) || Double.isNaN(dLog4)) {
                        dLog4 = d27;
                    } else if (!Double.isInfinite(d27) && !Double.isNaN(d27)) {
                        dLog4 = Math.max(dLog4, d27);
                    }
                    double d28 = (-(d25 + d26)) / (d24 * d26);
                    if (Double.isNaN(d28) || d28 <= 0.0d) {
                        d9 = -d9;
                        c20550Oooo0o = new C20550Oooo0o(dAbs2, d26, d24, d9);
                        c20552Oooo0oO = new C20552Oooo0oO(d26, d24, dAbs2);
                        d3 = dLog4;
                        i = 0;
                        dAbs = Double.MAX_VALUE;
                        while (dAbs > 0.001d && i < 100) {
                            i++;
                            double dDoubleValue2 = d3 - (((Number) c20550Oooo0o.invoke(Double.valueOf(d3))).doubleValue() / ((Number) c20552Oooo0oO.invoke(Double.valueOf(d3))).doubleValue());
                            dAbs = Math.abs(d3 - dDoubleValue2);
                            d3 = dDoubleValue2;
                        }
                        dLog = d3;
                        j = (long) (dLog * 1000.0d);
                    } else {
                        if (d28 > 0.0d) {
                            double d29 = d24 * d28;
                            if ((-((Math.exp(d29) * d28 * d26) + (Math.exp(d29) * dAbs2))) < d9) {
                                if (d26 < 0.0d && dAbs2 > 0.0d) {
                                    dLog4 = 0.0d;
                                }
                                d9 = -d9;
                                c20550Oooo0o = new C20550Oooo0o(dAbs2, d26, d24, d9);
                                c20552Oooo0oO = new C20552Oooo0oO(d26, d24, dAbs2);
                                d3 = dLog4;
                                i = 0;
                                dAbs = Double.MAX_VALUE;
                                while (dAbs > 0.001d) {
                                    i++;
                                    double dDoubleValue22 = d3 - (((Number) c20550Oooo0o.invoke(Double.valueOf(d3))).doubleValue() / ((Number) c20552Oooo0oO.invoke(Double.valueOf(d3))).doubleValue());
                                    dAbs = Math.abs(d3 - dDoubleValue22);
                                    d3 = dDoubleValue22;
                                }
                                dLog = d3;
                                j = (long) (dLog * 1000.0d);
                            }
                        }
                        dLog4 = (-(2.0d / d24)) - (dAbs2 / d26);
                        c20550Oooo0o = new C20550Oooo0o(dAbs2, d26, d24, d9);
                        c20552Oooo0oO = new C20552Oooo0oO(d26, d24, dAbs2);
                        d3 = dLog4;
                        i = 0;
                        dAbs = Double.MAX_VALUE;
                        while (dAbs > 0.001d) {
                        }
                        dLog = d3;
                        j = (long) (dLog * 1000.0d);
                    }
                }
            }
        }
        return j * 1000000;
    }

    @Override // OooOoOO.InterfaceC20542OooOoo0
    public final float OooO0Oo(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // OooOoOO.InterfaceC20542OooOoo0
    public final float OooO0o0(long j, float f, float f2, float f3) {
        C20556OoooO00 c20556OoooO00 = this.f58670OooO0O0;
        c20556OoooO00.f58726OooO00o = f2;
        return Float.intBitsToFloat((int) (c20556OoooO00.OooO00o(f, f3, j / 1000000) >> 32));
    }

    public C20541OooOoo(float f, float f2, float f3) {
        this.f58669OooO00o = f3;
        C20556OoooO00 c20556OoooO00 = new C20556OoooO00();
        c20556OoooO00.f58726OooO00o = 1.0f;
        double dSqrt = Math.sqrt(50.0d);
        c20556OoooO00.f58727OooO0O0 = dSqrt;
        c20556OoooO00.f58732OooO0oO = 1.0f;
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        c20556OoooO00.f58732OooO0oO = f;
        c20556OoooO00.f58728OooO0OO = false;
        if (((float) (dSqrt * dSqrt)) <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        c20556OoooO00.f58727OooO0O0 = Math.sqrt(f2);
        c20556OoooO00.f58728OooO0OO = false;
        this.f58670OooO0O0 = c20556OoooO00;
    }

    public /* synthetic */ C20541OooOoo(float f, float f2, int i) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, 0.01f);
    }
}
