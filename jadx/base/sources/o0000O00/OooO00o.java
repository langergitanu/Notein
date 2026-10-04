package o0000O00;

import androidx.appcompat.widget.C21532OooOOo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C19602OooO00o[] f81347OooO00o;

    /* JADX INFO: renamed from: o0000O00.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C19602OooO00o {

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public static final double[] f81348OooOOoo = new double[91];

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public double f81349OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public double[] f81350OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public double f81351OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public double f81352OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public double f81353OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public double f81354OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public double f81355OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public double f81356OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public double f81357OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public double f81358OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public double f81359OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public double f81360OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public double f81361OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public double f81362OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public double f81363OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public double f81364OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public boolean f81365OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public boolean f81366OooOOo0;

        public final double OooO00o() {
            double d = this.f81358OooOO0 * this.f81364OooOOOo;
            double dHypot = this.f81361OooOOO / Math.hypot(d, (-this.f81359OooOO0O) * this.f81363OooOOOO);
            return this.f81366OooOOo0 ? (-d) * dHypot : d * dHypot;
        }

        public final double OooO0O0() {
            double d = this.f81358OooOO0 * this.f81364OooOOOo;
            double d2 = (-this.f81359OooOO0O) * this.f81363OooOOOO;
            double dHypot = this.f81361OooOOO / Math.hypot(d, d2);
            return this.f81366OooOOo0 ? (-d2) * dHypot : d2 * dHypot;
        }

        public final double OooO0OO(double d) {
            double d2 = (d - this.f81352OooO0OO) * this.f81349OooO;
            double d3 = this.f81354OooO0o;
            double d4 = this.f81355OooO0o0;
            return C21532OooOOo.OooO0O0(d3, d4, d2, d4);
        }

        public final double OooO0Oo(double d) {
            double d2 = (d - this.f81352OooO0OO) * this.f81349OooO;
            double d3 = this.f81357OooO0oo;
            double d4 = this.f81356OooO0oO;
            return C21532OooOOo.OooO0O0(d3, d4, d2, d4);
        }

        public final double OooO0o() {
            return (this.f81359OooOO0O * this.f81364OooOOOo) + this.f81362OooOOO0;
        }

        public final double OooO0o0() {
            return (this.f81358OooOO0 * this.f81363OooOOOO) + this.f81360OooOO0o;
        }

        public final void OooO0oO(double d) {
            double d2 = (this.f81366OooOOo0 ? this.f81353OooO0Oo - d : d - this.f81352OooO0OO) * this.f81349OooO;
            double dOooO0O0 = 0.0d;
            if (d2 > 0.0d) {
                dOooO0O0 = 1.0d;
                if (d2 < 1.0d) {
                    double[] dArr = this.f81350OooO00o;
                    double length = d2 * ((double) (dArr.length - 1));
                    int i = (int) length;
                    double d3 = dArr[i];
                    dOooO0O0 = C21532OooOOo.OooO0O0(dArr[i + 1], d3, length - ((double) i), d3);
                }
            }
            double d4 = dOooO0O0 * 1.5707963267948966d;
            this.f81363OooOOOO = Math.sin(d4);
            this.f81364OooOOOo = Math.cos(d4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o0000O00.OooO00o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OooO00o(int[] iArr, double[] dArr, double[][] dArr2) {
        double d;
        double d2;
        boolean z;
        int i;
        int i2;
        double[] dArr3;
        double[] dArr4 = dArr;
        ?? obj = new Object();
        int i3 = 1;
        obj.f81347OooO00o = new C19602OooO00o[dArr4.length - 1];
        char c = 0;
        int i4 = 0;
        int i5 = 1;
        int i6 = 1;
        OooO00o oooO00o = obj;
        while (true) {
            C19602OooO00o[] c19602OooO00oArr = oooO00o.f81347OooO00o;
            if (i4 >= c19602OooO00oArr.length) {
                return;
            }
            int i7 = iArr[i4];
            if (i7 == 0) {
                i6 = 3;
            } else if (i7 == i3) {
                i5 = i3;
                i6 = i5;
            } else {
                if (i7 != 2) {
                    if (i7 == 3) {
                        if (i5 == i3) {
                        }
                        i6 = i5;
                    } else if (i7 == 4) {
                        i6 = 4;
                    } else if (i7 == 5) {
                        i6 = 5;
                    }
                }
                i5 = 2;
                i6 = i5;
            }
            double d3 = dArr4[i4];
            int i8 = i4 + 1;
            double d4 = dArr4[i8];
            double[] dArr5 = dArr2[i4];
            double d5 = dArr5[c];
            int i9 = i3;
            int i10 = i4;
            double d6 = dArr5[i9];
            double[] dArr6 = dArr2[i8];
            boolean z2 = c;
            double d7 = dArr6[z2 ? 1 : 0];
            double d8 = dArr6[i9];
            C19602OooO00o c19602OooO00o = new C19602OooO00o();
            c19602OooO00o.f81365OooOOo = z2;
            int i11 = i5;
            double d9 = d7 - d5;
            double d10 = d8 - d6;
            boolean z3 = i9;
            if (i6 != z3) {
                if (i6 == 4) {
                    c19602OooO00o.f81366OooOOo0 = d10 > 0.0d;
                } else if (i6 != 5) {
                    c19602OooO00o.f81366OooOOo0 = false;
                } else {
                    c19602OooO00o.f81366OooOOo0 = d10 < 0.0d;
                }
                d = d9;
                d2 = d3;
                z = true;
            } else {
                c19602OooO00o.f81366OooOOo0 = z3;
                d = d9;
                d2 = d3;
                z = z3;
            }
            c19602OooO00o.f81352OooO0OO = d2;
            c19602OooO00o.f81353OooO0Oo = d4;
            double d11 = d4 - d2;
            double d12 = 1.0d / d11;
            c19602OooO00o.f81349OooO = d12;
            if (3 == i6) {
                c19602OooO00o.f81365OooOOo = z;
            }
            if (c19602OooO00o.f81365OooOOo || Math.abs(d) < 0.001d || Math.abs(d10) < 0.001d) {
                i = i6;
                i2 = 1;
                c19602OooO00o.f81365OooOOo = true;
                c19602OooO00o.f81355OooO0o0 = d5;
                c19602OooO00o.f81354OooO0o = d7;
                c19602OooO00o.f81356OooO0oO = d6;
                c19602OooO00o.f81357OooO0oo = d8;
                double d13 = d;
                double dHypot = Math.hypot(d10, d13);
                c19602OooO00o.f81351OooO0O0 = dHypot;
                c19602OooO00o.f81361OooOOO = dHypot * d12;
                c19602OooO00o.f81360OooOO0o = d13 / d11;
                c19602OooO00o.f81362OooOOO0 = d10 / d11;
            } else {
                c19602OooO00o.f81350OooO00o = new double[101];
                boolean z4 = c19602OooO00o.f81366OooOOo0;
                c19602OooO00o.f81358OooOO0 = ((double) (z4 ? -1 : 1)) * d;
                c19602OooO00o.f81359OooOO0O = d10 * ((double) (z4 ? 1 : -1));
                c19602OooO00o.f81360OooOO0o = z4 ? d7 : d5;
                c19602OooO00o.f81362OooOOO0 = z4 ? d6 : d8;
                double d14 = d6 - d8;
                double dHypot2 = 0.0d;
                double d15 = 0.0d;
                double d16 = 0.0d;
                int i12 = 0;
                while (true) {
                    dArr3 = C19602OooO00o.f81348OooOOoo;
                    if (i12 >= 91) {
                        break;
                    }
                    int i13 = i6;
                    double radians = Math.toRadians((((double) i12) * 90.0d) / ((double) 90));
                    double dSin = Math.sin(radians) * d;
                    double dCos = Math.cos(radians) * d14;
                    if (i12 > 0) {
                        dHypot2 += Math.hypot(dSin - d15, dCos - d16);
                        dArr3[i12] = dHypot2;
                    }
                    i12++;
                    d16 = dCos;
                    d15 = dSin;
                    i6 = i13;
                }
                i = i6;
                c19602OooO00o.f81351OooO0O0 = dHypot2;
                for (int i14 = 0; i14 < 91; i14++) {
                    dArr3[i14] = dArr3[i14] / dHypot2;
                }
                int i15 = 0;
                while (true) {
                    double[] dArr7 = c19602OooO00o.f81350OooO00o;
                    if (i15 >= dArr7.length) {
                        break;
                    }
                    double length = ((double) i15) / ((double) (dArr7.length - 1));
                    int iBinarySearch = Arrays.binarySearch(dArr3, length);
                    if (iBinarySearch >= 0) {
                        dArr7[i15] = ((double) iBinarySearch) / ((double) 90);
                    } else if (iBinarySearch == -1) {
                        dArr7[i15] = 0.0d;
                    } else {
                        int i16 = -iBinarySearch;
                        int i17 = i16 - 2;
                        double d17 = dArr3[i17];
                        dArr7[i15] = (((length - d17) / (dArr3[i16 - 1] - d17)) + ((double) i17)) / ((double) 90);
                    }
                    i15++;
                }
                c19602OooO00o.f81361OooOOO = c19602OooO00o.f81351OooO0O0 * c19602OooO00o.f81349OooO;
                i2 = 1;
            }
            c19602OooO00oArr[i10] = c19602OooO00o;
            oooO00o = this;
            dArr4 = dArr;
            i3 = i2;
            i4 = i8;
            i5 = i11;
            i6 = i;
            c = 0;
        }
    }

    @Override // o0000O00.OooO0O0
    public final double OooO0O0(double d) {
        C19602OooO00o[] c19602OooO00oArr = this.f81347OooO00o;
        C19602OooO00o c19602OooO00o = c19602OooO00oArr[0];
        double d2 = c19602OooO00o.f81352OooO0OO;
        if (d < d2) {
            double d3 = d - d2;
            if (c19602OooO00o.f81365OooOOo) {
                return (d3 * c19602OooO00oArr[0].f81360OooOO0o) + c19602OooO00o.OooO0OO(d2);
            }
            c19602OooO00o.OooO0oO(d2);
            return (c19602OooO00oArr[0].OooO00o() * d3) + c19602OooO00oArr[0].OooO0o0();
        }
        if (d > c19602OooO00oArr[c19602OooO00oArr.length - 1].f81353OooO0Oo) {
            double d4 = c19602OooO00oArr[c19602OooO00oArr.length - 1].f81353OooO0Oo;
            double d5 = d - d4;
            int length = c19602OooO00oArr.length - 1;
            return (d5 * c19602OooO00oArr[length].f81360OooOO0o) + c19602OooO00oArr[length].OooO0OO(d4);
        }
        for (int i = 0; i < c19602OooO00oArr.length; i++) {
            C19602OooO00o c19602OooO00o2 = c19602OooO00oArr[i];
            if (d <= c19602OooO00o2.f81353OooO0Oo) {
                if (c19602OooO00o2.f81365OooOOo) {
                    return c19602OooO00o2.OooO0OO(d);
                }
                c19602OooO00o2.OooO0oO(d);
                return c19602OooO00oArr[i].OooO0o0();
            }
        }
        return Double.NaN;
    }

    @Override // o0000O00.OooO0O0
    public final void OooO0OO(double d, double[] dArr) {
        C19602OooO00o[] c19602OooO00oArr = this.f81347OooO00o;
        C19602OooO00o c19602OooO00o = c19602OooO00oArr[0];
        double d2 = c19602OooO00o.f81352OooO0OO;
        if (d < d2) {
            double d3 = d - d2;
            if (c19602OooO00o.f81365OooOOo) {
                double dOooO0OO = c19602OooO00o.OooO0OO(d2);
                C19602OooO00o c19602OooO00o2 = c19602OooO00oArr[0];
                dArr[0] = (c19602OooO00o2.f81360OooOO0o * d3) + dOooO0OO;
                dArr[1] = (d3 * c19602OooO00oArr[0].f81362OooOOO0) + c19602OooO00o2.OooO0Oo(d2);
                return;
            }
            c19602OooO00o.OooO0oO(d2);
            dArr[0] = (c19602OooO00oArr[0].OooO00o() * d3) + c19602OooO00oArr[0].OooO0o0();
            dArr[1] = (c19602OooO00oArr[0].OooO0O0() * d3) + c19602OooO00oArr[0].OooO0o();
            return;
        }
        if (d <= c19602OooO00oArr[c19602OooO00oArr.length - 1].f81353OooO0Oo) {
            for (int i = 0; i < c19602OooO00oArr.length; i++) {
                C19602OooO00o c19602OooO00o3 = c19602OooO00oArr[i];
                if (d <= c19602OooO00o3.f81353OooO0Oo) {
                    if (c19602OooO00o3.f81365OooOOo) {
                        dArr[0] = c19602OooO00o3.OooO0OO(d);
                        dArr[1] = c19602OooO00oArr[i].OooO0Oo(d);
                        return;
                    } else {
                        c19602OooO00o3.OooO0oO(d);
                        dArr[0] = c19602OooO00oArr[i].OooO0o0();
                        dArr[1] = c19602OooO00oArr[i].OooO0o();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = c19602OooO00oArr[c19602OooO00oArr.length - 1].f81353OooO0Oo;
        double d5 = d - d4;
        int length = c19602OooO00oArr.length - 1;
        C19602OooO00o c19602OooO00o4 = c19602OooO00oArr[length];
        if (c19602OooO00o4.f81365OooOOo) {
            double dOooO0OO2 = c19602OooO00o4.OooO0OO(d4);
            C19602OooO00o c19602OooO00o5 = c19602OooO00oArr[length];
            dArr[0] = (c19602OooO00o5.f81360OooOO0o * d5) + dOooO0OO2;
            dArr[1] = (d5 * c19602OooO00oArr[length].f81362OooOOO0) + c19602OooO00o5.OooO0Oo(d4);
            return;
        }
        c19602OooO00o4.OooO0oO(d);
        dArr[0] = (c19602OooO00oArr[length].OooO00o() * d5) + c19602OooO00oArr[length].OooO0o0();
        dArr[1] = (c19602OooO00oArr[length].OooO0O0() * d5) + c19602OooO00oArr[length].OooO0o();
    }

    @Override // o0000O00.OooO0O0
    public final void OooO0Oo(double d, float[] fArr) {
        C19602OooO00o[] c19602OooO00oArr = this.f81347OooO00o;
        C19602OooO00o c19602OooO00o = c19602OooO00oArr[0];
        double d2 = c19602OooO00o.f81352OooO0OO;
        if (d < d2) {
            double d3 = d - d2;
            if (c19602OooO00o.f81365OooOOo) {
                double dOooO0OO = c19602OooO00o.OooO0OO(d2);
                C19602OooO00o c19602OooO00o2 = c19602OooO00oArr[0];
                fArr[0] = (float) ((c19602OooO00o2.f81360OooOO0o * d3) + dOooO0OO);
                fArr[1] = (float) ((d3 * c19602OooO00oArr[0].f81362OooOOO0) + c19602OooO00o2.OooO0Oo(d2));
                return;
            }
            c19602OooO00o.OooO0oO(d2);
            fArr[0] = (float) ((c19602OooO00oArr[0].OooO00o() * d3) + c19602OooO00oArr[0].OooO0o0());
            fArr[1] = (float) ((c19602OooO00oArr[0].OooO0O0() * d3) + c19602OooO00oArr[0].OooO0o());
            return;
        }
        if (d <= c19602OooO00oArr[c19602OooO00oArr.length - 1].f81353OooO0Oo) {
            for (int i = 0; i < c19602OooO00oArr.length; i++) {
                C19602OooO00o c19602OooO00o3 = c19602OooO00oArr[i];
                if (d <= c19602OooO00o3.f81353OooO0Oo) {
                    if (c19602OooO00o3.f81365OooOOo) {
                        fArr[0] = (float) c19602OooO00o3.OooO0OO(d);
                        fArr[1] = (float) c19602OooO00oArr[i].OooO0Oo(d);
                        return;
                    } else {
                        c19602OooO00o3.OooO0oO(d);
                        fArr[0] = (float) c19602OooO00oArr[i].OooO0o0();
                        fArr[1] = (float) c19602OooO00oArr[i].OooO0o();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = c19602OooO00oArr[c19602OooO00oArr.length - 1].f81353OooO0Oo;
        double d5 = d - d4;
        int length = c19602OooO00oArr.length - 1;
        C19602OooO00o c19602OooO00o4 = c19602OooO00oArr[length];
        if (!c19602OooO00o4.f81365OooOOo) {
            c19602OooO00o4.OooO0oO(d);
            fArr[0] = (float) c19602OooO00oArr[length].OooO0o0();
            fArr[1] = (float) c19602OooO00oArr[length].OooO0o();
        } else {
            double dOooO0OO2 = c19602OooO00o4.OooO0OO(d4);
            C19602OooO00o c19602OooO00o5 = c19602OooO00oArr[length];
            fArr[0] = (float) ((c19602OooO00o5.f81360OooOO0o * d5) + dOooO0OO2);
            fArr[1] = (float) ((d5 * c19602OooO00oArr[length].f81362OooOOO0) + c19602OooO00o5.OooO0Oo(d4));
        }
    }

    @Override // o0000O00.OooO0O0
    public final void OooO0o0(double d, double[] dArr) {
        C19602OooO00o[] c19602OooO00oArr = this.f81347OooO00o;
        double d2 = c19602OooO00oArr[0].f81352OooO0OO;
        if (d < d2) {
            d = d2;
        } else if (d > c19602OooO00oArr[c19602OooO00oArr.length - 1].f81353OooO0Oo) {
            d = c19602OooO00oArr[c19602OooO00oArr.length - 1].f81353OooO0Oo;
        }
        for (int i = 0; i < c19602OooO00oArr.length; i++) {
            C19602OooO00o c19602OooO00o = c19602OooO00oArr[i];
            if (d <= c19602OooO00o.f81353OooO0Oo) {
                if (c19602OooO00o.f81365OooOOo) {
                    dArr[0] = c19602OooO00o.f81360OooOO0o;
                    dArr[1] = c19602OooO00o.f81362OooOOO0;
                    return;
                } else {
                    c19602OooO00o.OooO0oO(d);
                    dArr[0] = c19602OooO00oArr[i].OooO00o();
                    dArr[1] = c19602OooO00oArr[i].OooO0O0();
                    return;
                }
            }
        }
    }
}
