package com.aspose.slides.internal.p156gw;

import com.aspose.slides.internal.p031aw.InterfaceC1565x1;
import com.aspose.slides.internal.p156gw.InterfaceC4413v4;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import java.util.Arrays;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.bv */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4391bv implements InterfaceC1565x1, Cloneable {

    /* JADX INFO: renamed from: k4 */
    public static final InterfaceC4413v4.k4 f11966k4 = InterfaceC4413v4.k4.WIND_EVEN_ODD;

    /* JADX INFO: renamed from: x1 */
    public static final InterfaceC4413v4.k4 f11967x1 = InterfaceC4413v4.k4.WIND_NON_ZERO;

    /* JADX INFO: renamed from: du */
    transient int f11968du;

    /* JADX INFO: renamed from: h4 */
    transient InterfaceC4413v4.k4 f11969h4;

    /* JADX INFO: renamed from: kk */
    transient byte[] f11970kk;

    /* JADX INFO: renamed from: to */
    transient int f11971to;

    /* JADX INFO: renamed from: com.aspose.slides.internal.gw.bv$k4 */
    public static class k4 extends AbstractC4391bv {

        /* JADX INFO: renamed from: m9 */
        transient double[] f11972m9;

        /* JADX INFO: renamed from: com.aspose.slides.internal.gw.bv$k4$k4, reason: collision with other inner class name */
        public static class C19059k4 extends kk {

            /* JADX INFO: renamed from: k4 */
            double[] f11973k4;

            public C19059k4(k4 k4Var) {
                super(k4Var);
                this.f11973k4 = k4Var.f11972m9;
            }

            @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
            /* JADX INFO: renamed from: k4 */
            public int mo17817k4(double[] dArr) {
                byte b = this.f11977du.f11970kk[this.f11978kk];
                int i = kk.f11976h4[b];
                if (i > 0) {
                    C4398ix.m17908k4(this.f11973k4, this.f11979to, dArr, 0, i);
                }
                return b;
            }

            @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
            /* JADX INFO: renamed from: k4 */
            public int mo17818k4(float[] fArr) {
                byte b = this.f11977du.f11970kk[this.f11978kk];
                int i = kk.f11976h4[b];
                if (i > 0) {
                    for (int i2 = 0; i2 < i; i2++) {
                        fArr[i2] = (float) this.f11973k4[this.f11979to + i2];
                    }
                }
                return b;
            }
        }

        /* JADX INFO: renamed from: com.aspose.slides.internal.gw.bv$k4$x1 */
        public static class x1 extends kk {

            /* JADX INFO: renamed from: k4 */
            double[] f11974k4;

            /* JADX INFO: renamed from: x1 */
            C11913yj f11975x1;

            public x1(k4 k4Var, C11913yj c11913yj) {
                super(k4Var);
                this.f11974k4 = k4Var.f11972m9;
                this.f11975x1 = c11913yj;
            }

            @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
            /* JADX INFO: renamed from: k4 */
            public int mo17817k4(double[] dArr) {
                byte b = this.f11977du.f11970kk[this.f11978kk];
                int i = kk.f11976h4[b];
                if (i > 0) {
                    this.f11975x1.m55770k4(this.f11974k4, this.f11979to, dArr, 0, i / 2);
                }
                return b;
            }

            @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
            /* JADX INFO: renamed from: k4 */
            public int mo17818k4(float[] fArr) {
                byte b = this.f11977du.f11970kk[this.f11978kk];
                int i = kk.f11976h4[b];
                if (i > 0) {
                    this.f11975x1.m55771k4(this.f11974k4, this.f11979to, fArr, 0, i / 2);
                }
                return b;
            }
        }

        public k4() {
            this(AbstractC4391bv.f11967x1, 20);
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        public final Object clone() {
            return new k4(this);
        }

        @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
        /* JADX INFO: renamed from: dy */
        public final synchronized C12007ix mo8355dy() {
            double d;
            double d2;
            double d3;
            double d4;
            try {
                int i = this.f11968du;
                if (i > 0) {
                    double[] dArr = this.f11972m9;
                    d = dArr[i - 1];
                    int i2 = i - 2;
                    d3 = dArr[i2];
                    d4 = d3;
                    d2 = d;
                    while (i2 > 0) {
                        double[] dArr2 = this.f11972m9;
                        double d5 = dArr2[i2 - 1];
                        i2 -= 2;
                        double d6 = dArr2[i2];
                        if (d6 < d4) {
                            d4 = d6;
                        }
                        if (d5 < d2) {
                            d2 = d5;
                        }
                        if (d6 > d3) {
                            d3 = d6;
                        }
                        if (d5 > d) {
                            d = d5;
                        }
                    }
                } else {
                    d = 0.0d;
                    d2 = 0.0d;
                    d3 = 0.0d;
                    d4 = 0.0d;
                }
            } catch (Throwable th) {
                throw th;
            }
            return new C12007ix((float) d4, (float) d2, (float) (d3 - d4), (float) (d - d2));
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: k4 */
        public C12025x6 mo17824k4(int i) {
            double[] dArr = this.f11972m9;
            return new C12025x6((float) dArr[i], (float) dArr[i + 1]);
        }

        @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
        /* JADX INFO: renamed from: kk */
        public final InterfaceC4413v4 mo8359kk(C11913yj c11913yj) {
            return c11913yj == null ? new C19059k4(this) : new x1(this, c11913yj);
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: to */
        public final synchronized void mo17836to(double d, double d2) {
            mo17830k4(true, 2);
            byte[] bArr = this.f11970kk;
            int i = this.f11971to;
            this.f11971to = i + 1;
            bArr[i] = 1;
            double[] dArr = this.f11972m9;
            int i2 = this.f11968du;
            int i3 = i2 + 1;
            this.f11968du = i3;
            dArr[i2] = d;
            this.f11968du = i2 + 2;
            dArr[i3] = d2;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: x1 */
        public int mo17838x1(double d, double d2) {
            double d3;
            double d4;
            double d5;
            double d6;
            double[] dArr = this.f11972m9;
            int iM17861k4 = 0;
            double d7 = dArr[0];
            double d8 = d7;
            double d9 = dArr[1];
            double d10 = d9;
            int i = 2;
            for (int i2 = 1; i2 < this.f11971to; i2++) {
                byte b = this.f11970kk[i2];
                if (b != 0) {
                    if (b == 1) {
                        d3 = d8;
                        d4 = d10;
                        int i3 = i + 1;
                        double d11 = dArr[i];
                        i += 2;
                        double d12 = dArr[i3];
                        iM17861k4 += AbstractC4393ck.m17861k4(d, d2, d7, d9, d11, d12);
                        d7 = d11;
                        d9 = d12;
                    } else if (b == 2) {
                        d3 = d8;
                        d4 = d10;
                        double d13 = dArr[i];
                        double d14 = dArr[i + 1];
                        int i4 = i + 3;
                        double d15 = dArr[i + 2];
                        i += 4;
                        double d16 = dArr[i4];
                        iM17861k4 += AbstractC4393ck.m17863k4(d, d2, d7, d9, d13, d14, d15, d16, 0);
                        d7 = d15;
                        d9 = d16;
                    } else if (b == 3) {
                        d3 = d8;
                        d4 = d10;
                        double d17 = dArr[i];
                        double d18 = dArr[i + 1];
                        double d19 = dArr[i + 2];
                        double d20 = dArr[i + 3];
                        int i5 = i + 5;
                        double d21 = dArr[i + 4];
                        i += 6;
                        double d22 = dArr[i5];
                        iM17861k4 += AbstractC4393ck.m17862k4(d, d2, d7, d9, d17, d18, d19, d20, d21, d22, 0);
                        d7 = d21;
                        d9 = d22;
                    } else if (b == 4) {
                        if (d9 != d10) {
                            d5 = d8;
                            d6 = d10;
                            iM17861k4 += AbstractC4393ck.m17861k4(d, d2, d7, d9, d8, d10);
                        } else {
                            d5 = d8;
                            d6 = d10;
                        }
                        d9 = d6;
                        d10 = d9;
                        d7 = d5;
                    }
                    d10 = d4;
                    d8 = d3;
                } else {
                    double d23 = d8;
                    double d24 = d10;
                    if (d9 != d24) {
                        iM17861k4 += AbstractC4393ck.m17861k4(d, d2, d7, d9, d23, d24);
                    }
                    int i6 = i + 1;
                    double d25 = dArr[i];
                    i += 2;
                    d9 = dArr[i6];
                    d10 = d9;
                    d7 = d25;
                }
                d8 = d7;
            }
            return d9 != d10 ? iM17861k4 + AbstractC4393ck.m17861k4(d, d2, d7, d9, d8, d10) : iM17861k4;
        }

        public k4(InterfaceC1565x1 interfaceC1565x1) {
            this(interfaceC1565x1, (C11913yj) null);
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: k4 */
        public final synchronized void mo17826k4(double d, double d2, double d3, double d4, double d5, double d6) {
            mo17830k4(true, 6);
            byte[] bArr = this.f11970kk;
            int i = this.f11971to;
            this.f11971to = i + 1;
            bArr[i] = 3;
            double[] dArr = this.f11972m9;
            int i2 = this.f11968du;
            int i3 = i2 + 1;
            this.f11968du = i3;
            dArr[i2] = d;
            int i4 = i2 + 2;
            this.f11968du = i4;
            dArr[i3] = d2;
            int i5 = i2 + 3;
            this.f11968du = i5;
            dArr[i4] = d3;
            int i6 = i2 + 4;
            this.f11968du = i6;
            dArr[i5] = d4;
            int i7 = i2 + 5;
            this.f11968du = i7;
            dArr[i6] = d5;
            this.f11968du = i2 + 6;
            dArr[i7] = d6;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: kk */
        public final synchronized void mo17833kk(double d, double d2) {
            try {
                int i = this.f11971to;
                if (i <= 0 || this.f11970kk[i - 1] != 0) {
                    mo17830k4(false, 2);
                    byte[] bArr = this.f11970kk;
                    int i2 = this.f11971to;
                    this.f11971to = i2 + 1;
                    bArr[i2] = 0;
                    double[] dArr = this.f11972m9;
                    int i3 = this.f11968du;
                    int i4 = i3 + 1;
                    this.f11968du = i4;
                    dArr[i3] = d;
                    this.f11968du = i3 + 2;
                    dArr[i4] = d2;
                } else {
                    double[] dArr2 = this.f11972m9;
                    int i5 = this.f11968du;
                    dArr2[i5 - 2] = d;
                    dArr2[i5 - 1] = d2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: to */
        public final void mo17837to(C11913yj c11913yj) {
            double[] dArr = this.f11972m9;
            c11913yj.m55770k4(dArr, 0, dArr, 0, this.f11968du / 2);
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: x1 */
        public int mo17839x1(double d, double d2, double d3, double d4) {
            double d5;
            double[] dArr = this.f11972m9;
            int iM17864k4 = 0;
            double d6 = dArr[0];
            double d7 = d6;
            double d8 = dArr[1];
            double d9 = d8;
            int i = 2;
            for (int i2 = 1; iM17864k4 != Integer.MIN_VALUE && i2 < this.f11971to; i2++) {
                byte b = this.f11970kk[i2];
                if (b != 0) {
                    if (b != 1) {
                        if (b == 2) {
                            double d10 = d7;
                            d5 = d9;
                            double d11 = dArr[i];
                            double d12 = dArr[i + 1];
                            int i3 = i + 3;
                            double d13 = dArr[i + 2];
                            i += 4;
                            double d14 = dArr[i3];
                            iM17864k4 = AbstractC4393ck.m17866k4(iM17864k4, d, d2, d3, d4, d6, d8, d11, d12, d13, d14, 0);
                            d7 = d10;
                            d6 = d13;
                            d8 = d14;
                        } else if (b == 3) {
                            double d15 = d7;
                            d5 = d9;
                            double d16 = dArr[i];
                            double d17 = dArr[i + 1];
                            double d18 = dArr[i + 2];
                            double d19 = dArr[i + 3];
                            int i4 = i + 5;
                            double d20 = dArr[i + 4];
                            i += 6;
                            double d21 = dArr[i4];
                            iM17864k4 = AbstractC4393ck.m17865k4(iM17864k4, d, d2, d3, d4, d6, d8, d16, d17, d18, d19, d20, d21, 0);
                            d7 = d15;
                            d6 = d20;
                            d8 = d21;
                        } else if (b == 4) {
                            if (d6 != d7 || d8 != d9) {
                                iM17864k4 = AbstractC4393ck.m17864k4(iM17864k4, d, d2, d3, d4, d6, d8, d7, d9);
                            }
                            d6 = d7;
                            d7 = d6;
                            d8 = d9;
                        }
                        d9 = d5;
                    } else {
                        double d22 = d7;
                        double d23 = d9;
                        int i5 = i + 1;
                        double d24 = dArr[i];
                        i += 2;
                        double d25 = dArr[i5];
                        iM17864k4 = AbstractC4393ck.m17864k4(iM17864k4, d, d2, d3, d4, d6, d8, d24, d25);
                        d6 = d24;
                        d8 = d25;
                        d9 = d23;
                        d7 = d22;
                    }
                } else {
                    double d26 = d7;
                    double d27 = d9;
                    if (d6 != d26 || d8 != d27) {
                        iM17864k4 = AbstractC4393ck.m17864k4(iM17864k4, d, d2, d3, d4, d6, d8, d26, d27);
                    }
                    int i6 = i + 1;
                    double d28 = dArr[i];
                    i += 2;
                    d6 = d28;
                    d7 = d6;
                    d8 = dArr[i6];
                }
                d9 = d8;
            }
            return (iM17864k4 == Integer.MIN_VALUE || (d6 == d7 && d8 == d9)) ? iM17864k4 : AbstractC4393ck.m17864k4(iM17864k4, d, d2, d3, d4, d6, d8, d7, d9);
        }

        public k4(InterfaceC1565x1 interfaceC1565x1, C11913yj c11913yj) {
            if (!(interfaceC1565x1 instanceof AbstractC4391bv)) {
                InterfaceC4413v4 interfaceC4413v4Mo8359kk = interfaceC1565x1.mo8359kk(c11913yj);
                m17828k4(interfaceC4413v4Mo8359kk.mo17819k4());
                this.f11970kk = new byte[20];
                this.f11972m9 = new double[40];
                mo17829k4(interfaceC4413v4Mo8359kk, false);
                return;
            }
            AbstractC4391bv abstractC4391bv = (AbstractC4391bv) interfaceC1565x1;
            m17828k4(abstractC4391bv.f11969h4);
            this.f11971to = abstractC4391bv.f11971to;
            byte[] bArr = abstractC4391bv.f11970kk;
            this.f11970kk = Arrays.copyOf(bArr, bArr.length);
            this.f11968du = abstractC4391bv.f11968du;
            this.f11972m9 = abstractC4391bv.mo17841x1(c11913yj);
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: k4 */
        public final void mo17829k4(InterfaceC4413v4 interfaceC4413v4, boolean z) {
            k4 k4Var;
            int i;
            int i2;
            double d;
            double d2;
            double[] dArr = new double[6];
            boolean z2 = z;
            while (!interfaceC4413v4.mo17821x1()) {
                int iMo17817k4 = interfaceC4413v4.mo17817k4(dArr);
                if (iMo17817k4 == 0) {
                    k4Var = this;
                    if (!z2 || (i = k4Var.f11971to) < 1 || (i2 = k4Var.f11968du) < 1) {
                        k4Var.mo17833kk(dArr[0], dArr[1]);
                    } else {
                        if (k4Var.f11970kk[i - 1] != 4) {
                            double[] dArr2 = k4Var.f11972m9;
                            if (dArr2[i2 - 2] == dArr[0] && dArr2[i2 - 1] == dArr[1]) {
                            }
                        }
                        d = dArr[0];
                        d2 = dArr[1];
                        k4Var.mo17836to(d, d2);
                    }
                } else if (iMo17817k4 == 1) {
                    k4Var = this;
                    d = dArr[0];
                    d2 = dArr[1];
                    k4Var.mo17836to(d, d2);
                } else if (iMo17817k4 == 2) {
                    mo17834kk(dArr[0], dArr[1], dArr[2], dArr[3]);
                } else if (iMo17817k4 == 3) {
                    mo17826k4(dArr[0], dArr[1], dArr[2], dArr[3], dArr[4], dArr[5]);
                } else if (iMo17817k4 == 4) {
                    m17825k4();
                }
                interfaceC4413v4.mo17820kk();
                z2 = false;
            }
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: kk */
        public final synchronized void mo17834kk(double d, double d2, double d3, double d4) {
            mo17830k4(true, 4);
            byte[] bArr = this.f11970kk;
            int i = this.f11971to;
            this.f11971to = i + 1;
            bArr[i] = 2;
            double[] dArr = this.f11972m9;
            int i2 = this.f11968du;
            int i3 = i2 + 1;
            this.f11968du = i3;
            dArr[i2] = d;
            int i4 = i2 + 2;
            this.f11968du = i4;
            dArr[i3] = d2;
            int i5 = i2 + 3;
            this.f11968du = i5;
            dArr[i4] = d3;
            this.f11968du = i2 + 4;
            dArr[i5] = d4;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: x1 */
        public double[] mo17841x1(C11913yj c11913yj) {
            if (c11913yj == null) {
                double[] dArr = this.f11972m9;
                return Arrays.copyOf(dArr, dArr.length);
            }
            double[] dArr2 = this.f11972m9;
            double[] dArr3 = new double[dArr2.length];
            c11913yj.m55770k4(dArr2, 0, dArr3, 0, this.f11968du / 2);
            return dArr3;
        }

        public k4(InterfaceC4413v4.k4 k4Var) {
            this(k4Var, 20);
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: k4 */
        public void mo17830k4(boolean z, int i) {
            if (z && this.f11971to == 0) {
                throw new IllegalStateException("missing initial moveto in path definition");
            }
            byte[] bArr = this.f11970kk;
            int length = bArr.length;
            if (this.f11971to >= length) {
                this.f11970kk = Arrays.copyOf(bArr, length + (length <= 500 ? length : 500));
            }
            double[] dArr = this.f11972m9;
            int length2 = dArr.length;
            if (this.f11968du + i > length2) {
                int i2 = length2 <= 1000 ? length2 : 1000;
                if (i2 >= i) {
                    i = i2;
                }
                this.f11972m9 = Arrays.copyOf(dArr, length2 + i);
            }
        }

        public k4(InterfaceC4413v4.k4 k4Var, int i) {
            super(k4Var, i);
            this.f11972m9 = new double[i * 2];
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: k4 */
        public float[] mo17831k4(C11913yj c11913yj) {
            double[] dArr = this.f11972m9;
            float[] fArr = new float[dArr.length];
            if (c11913yj != null) {
                c11913yj.m55771k4(dArr, 0, fArr, 0, this.f11968du / 2);
                return fArr;
            }
            for (int i = 0; i < this.f11968du; i++) {
                fArr[i] = (float) this.f11972m9[i];
            }
            return fArr;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.gw.bv$kk */
    public static abstract class kk implements InterfaceC4413v4 {

        /* JADX INFO: renamed from: h4 */
        static final int[] f11976h4 = {2, 2, 4, 6, 0};

        /* JADX INFO: renamed from: du */
        AbstractC4391bv f11977du;

        /* JADX INFO: renamed from: kk */
        int f11978kk;

        /* JADX INFO: renamed from: to */
        int f11979to;

        public kk(AbstractC4391bv abstractC4391bv) {
            this.f11977du = abstractC4391bv;
        }

        @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
        /* JADX INFO: renamed from: k4 */
        public InterfaceC4413v4.k4 mo17819k4() {
            return this.f11977du.m17840x1();
        }

        @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
        /* JADX INFO: renamed from: kk */
        public void mo17820kk() {
            byte[] bArr = this.f11977du.f11970kk;
            int i = this.f11978kk;
            this.f11978kk = i + 1;
            this.f11979to += f11976h4[bArr[i]];
        }

        @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
        /* JADX INFO: renamed from: x1 */
        public boolean mo17821x1() {
            return this.f11978kk >= this.f11977du.f11971to;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.gw.bv$x1 */
    public static class x1 extends AbstractC4391bv {

        /* JADX INFO: renamed from: m9 */
        transient float[] f11980m9;

        /* JADX INFO: renamed from: com.aspose.slides.internal.gw.bv$x1$k4 */
        public static class k4 extends kk {

            /* JADX INFO: renamed from: k4 */
            float[] f11981k4;

            public k4(x1 x1Var) {
                super(x1Var);
                this.f11981k4 = x1Var.f11980m9;
            }

            @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
            /* JADX INFO: renamed from: k4 */
            public int mo17817k4(double[] dArr) {
                byte b = this.f11977du.f11970kk[this.f11978kk];
                int i = kk.f11976h4[b];
                if (i > 0) {
                    for (int i2 = 0; i2 < i; i2++) {
                        dArr[i2] = this.f11981k4[this.f11979to + i2];
                    }
                }
                return b;
            }

            @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
            /* JADX INFO: renamed from: k4 */
            public int mo17818k4(float[] fArr) {
                byte b = this.f11977du.f11970kk[this.f11978kk];
                int i = kk.f11976h4[b];
                if (i > 0) {
                    C4398ix.m17909k4(this.f11981k4, this.f11979to, fArr, 0, i);
                }
                return b;
            }
        }

        /* JADX INFO: renamed from: com.aspose.slides.internal.gw.bv$x1$x1, reason: collision with other inner class name */
        public static class C19060x1 extends kk {

            /* JADX INFO: renamed from: k4 */
            float[] f11982k4;

            /* JADX INFO: renamed from: x1 */
            C11913yj f11983x1;

            public C19060x1(x1 x1Var, C11913yj c11913yj) {
                super(x1Var);
                this.f11982k4 = x1Var.f11980m9;
                this.f11983x1 = c11913yj;
            }

            @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
            /* JADX INFO: renamed from: k4 */
            public int mo17817k4(double[] dArr) {
                byte b = this.f11977du.f11970kk[this.f11978kk];
                int i = kk.f11976h4[b];
                if (i > 0) {
                    this.f11983x1.m55772k4(this.f11982k4, this.f11979to, dArr, 0, i / 2);
                }
                return b;
            }

            @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
            /* JADX INFO: renamed from: k4 */
            public int mo17818k4(float[] fArr) {
                byte b = this.f11977du.f11970kk[this.f11978kk];
                int i = kk.f11976h4[b];
                if (i > 0) {
                    this.f11983x1.m55773k4(this.f11982k4, this.f11979to, fArr, 0, i / 2);
                }
                return b;
            }
        }

        public x1() {
            this(AbstractC4391bv.f11967x1, 20);
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        public final Object clone() {
            return new x1(this);
        }

        @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
        /* JADX INFO: renamed from: dy */
        public final synchronized C12007ix mo8355dy() {
            float f;
            float f2;
            float f3;
            float f4;
            try {
                int i = this.f11968du;
                if (i > 0) {
                    float[] fArr = this.f11980m9;
                    float f5 = fArr[i - 1];
                    int i2 = i - 2;
                    f = fArr[i2];
                    f3 = f5;
                    f4 = f3;
                    f2 = f;
                    while (i2 > 0) {
                        float[] fArr2 = this.f11980m9;
                        float f6 = fArr2[i2 - 1];
                        i2 -= 2;
                        float f7 = fArr2[i2];
                        if (f7 < f2) {
                            f2 = f7;
                        }
                        if (f6 < f4) {
                            f4 = f6;
                        }
                        if (f7 > f) {
                            f = f7;
                        }
                        if (f6 > f3) {
                            f3 = f6;
                        }
                    }
                } else {
                    f = 0.0f;
                    f2 = 0.0f;
                    f3 = 0.0f;
                    f4 = 0.0f;
                }
            } catch (Throwable th) {
                throw th;
            }
            return new C12007ix(f2, f4, f - f2, f3 - f4);
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: k4 */
        public C12025x6 mo17824k4(int i) {
            float[] fArr = this.f11980m9;
            return new C12025x6(fArr[i], fArr[i + 1]);
        }

        @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
        /* JADX INFO: renamed from: kk */
        public final InterfaceC4413v4 mo8359kk(C11913yj c11913yj) {
            return c11913yj == null ? new k4(this) : new C19060x1(this, c11913yj);
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: to */
        public final synchronized void mo17836to(double d, double d2) {
            mo17830k4(true, 2);
            byte[] bArr = this.f11970kk;
            int i = this.f11971to;
            this.f11971to = i + 1;
            bArr[i] = 1;
            float[] fArr = this.f11980m9;
            int i2 = this.f11968du;
            int i3 = i2 + 1;
            this.f11968du = i3;
            fArr[i2] = (float) d;
            this.f11968du = i2 + 2;
            fArr[i3] = (float) d2;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: x1 */
        public int mo17838x1(double d, double d2) {
            float[] fArr;
            double d3;
            double d4;
            double d5;
            double d6;
            x1 x1Var = this;
            float[] fArr2 = x1Var.f11980m9;
            int iM17861k4 = 0;
            byte b = 1;
            byte b2 = 2;
            double d7 = fArr2[0];
            double d8 = d7;
            int i = 1;
            double d9 = fArr2[1];
            double d10 = d9;
            int i2 = 2;
            while (i < x1Var.f11971to) {
                byte b3 = x1Var.f11970kk[i];
                if (b3 != 0) {
                    if (b3 == b) {
                        fArr = fArr2;
                        d3 = d8;
                        d4 = d10;
                        int i3 = i2 + 1;
                        double d11 = fArr[i2];
                        i2 += 2;
                        double d12 = fArr[i3];
                        iM17861k4 += AbstractC4393ck.m17861k4(d, d2, d7, d9, d11, d12);
                        d7 = d11;
                        d9 = d12;
                    } else if (b3 == b2) {
                        fArr = fArr2;
                        d3 = d8;
                        d4 = d10;
                        double d13 = fArr[i2];
                        double d14 = fArr[i2 + 1];
                        int i4 = i2 + 3;
                        double d15 = fArr[i2 + 2];
                        i2 += 4;
                        double d16 = fArr[i4];
                        iM17861k4 += AbstractC4393ck.m17863k4(d, d2, d7, d9, d13, d14, d15, d16, 0);
                        d7 = d15;
                        d9 = d16;
                    } else if (b3 == 3) {
                        d3 = d8;
                        d4 = d10;
                        double d17 = fArr2[i2];
                        double d18 = fArr2[i2 + 1];
                        double d19 = fArr2[i2 + 2];
                        fArr = fArr2;
                        double d20 = fArr2[i2 + 3];
                        int i5 = i2 + 5;
                        double d21 = fArr[i2 + 4];
                        i2 += 6;
                        double d22 = fArr[i5];
                        iM17861k4 += AbstractC4393ck.m17862k4(d, d2, d7, d9, d17, d18, d19, d20, d21, d22, 0);
                        d7 = d21;
                        d9 = d22;
                    } else if (b3 != 4) {
                        fArr = fArr2;
                        i++;
                        x1Var = this;
                        fArr2 = fArr;
                        b = 1;
                        b2 = 2;
                    } else {
                        if (d9 != d10) {
                            d5 = d8;
                            d6 = d10;
                            iM17861k4 += AbstractC4393ck.m17861k4(d, d2, d7, d9, d8, d10);
                        } else {
                            d5 = d8;
                            d6 = d10;
                        }
                        fArr = fArr2;
                        d9 = d6;
                        d10 = d9;
                        d7 = d5;
                    }
                    d10 = d4;
                    d8 = d3;
                    i++;
                    x1Var = this;
                    fArr2 = fArr;
                    b = 1;
                    b2 = 2;
                } else {
                    fArr = fArr2;
                    double d23 = d8;
                    double d24 = d10;
                    if (d9 != d24) {
                        iM17861k4 += AbstractC4393ck.m17861k4(d, d2, d7, d9, d23, d24);
                    }
                    int i6 = i2 + 1;
                    double d25 = fArr[i2];
                    i2 += 2;
                    d9 = fArr[i6];
                    d10 = d9;
                    d7 = d25;
                }
                d8 = d7;
                i++;
                x1Var = this;
                fArr2 = fArr;
                b = 1;
                b2 = 2;
            }
            return d9 != d10 ? iM17861k4 + AbstractC4393ck.m17861k4(d, d2, d7, d9, d8, d10) : iM17861k4;
        }

        public x1(InterfaceC1565x1 interfaceC1565x1) {
            this(interfaceC1565x1, (C11913yj) null);
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: k4 */
        public final synchronized void mo17826k4(double d, double d2, double d3, double d4, double d5, double d6) {
            mo17830k4(true, 6);
            byte[] bArr = this.f11970kk;
            int i = this.f11971to;
            this.f11971to = i + 1;
            bArr[i] = 3;
            float[] fArr = this.f11980m9;
            int i2 = this.f11968du;
            int i3 = i2 + 1;
            this.f11968du = i3;
            fArr[i2] = (float) d;
            int i4 = i2 + 2;
            this.f11968du = i4;
            fArr[i3] = (float) d2;
            int i5 = i2 + 3;
            this.f11968du = i5;
            fArr[i4] = (float) d3;
            int i6 = i2 + 4;
            this.f11968du = i6;
            fArr[i5] = (float) d4;
            int i7 = i2 + 5;
            this.f11968du = i7;
            fArr[i6] = (float) d5;
            this.f11968du = i2 + 6;
            fArr[i7] = (float) d6;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: kk */
        public final synchronized void mo17833kk(double d, double d2) {
            try {
                int i = this.f11971to;
                if (i <= 0 || this.f11970kk[i - 1] != 0) {
                    mo17830k4(false, 2);
                    byte[] bArr = this.f11970kk;
                    int i2 = this.f11971to;
                    this.f11971to = i2 + 1;
                    bArr[i2] = 0;
                    float[] fArr = this.f11980m9;
                    int i3 = this.f11968du;
                    int i4 = i3 + 1;
                    this.f11968du = i4;
                    fArr[i3] = (float) d;
                    this.f11968du = i3 + 2;
                    fArr[i4] = (float) d2;
                } else {
                    float[] fArr2 = this.f11980m9;
                    int i5 = this.f11968du;
                    fArr2[i5 - 2] = (float) d;
                    fArr2[i5 - 1] = (float) d2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: to */
        public final void mo17837to(C11913yj c11913yj) {
            float[] fArr = this.f11980m9;
            c11913yj.m55773k4(fArr, 0, fArr, 0, this.f11968du / 2);
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: x1 */
        public int mo17839x1(double d, double d2, double d3, double d4) {
            float[] fArr;
            double d5;
            double d6;
            x1 x1Var = this;
            float[] fArr2 = x1Var.f11980m9;
            byte b = 1;
            byte b2 = 2;
            int iM17864k4 = 0;
            double d7 = fArr2[0];
            double d8 = d7;
            int i = 1;
            double d9 = fArr2[1];
            double d10 = d9;
            int i2 = 2;
            while (iM17864k4 != Integer.MIN_VALUE && i < x1Var.f11971to) {
                byte b3 = x1Var.f11970kk[i];
                if (b3 != 0) {
                    if (b3 == b) {
                        fArr = fArr2;
                        d5 = d8;
                        d6 = d10;
                        int i3 = i2 + 1;
                        double d11 = fArr[i2];
                        i2 += 2;
                        double d12 = fArr[i3];
                        iM17864k4 = AbstractC4393ck.m17864k4(iM17864k4, d, d2, d3, d4, d7, d9, d11, d12);
                        d7 = d11;
                        d9 = d12;
                    } else if (b3 == b2) {
                        fArr = fArr2;
                        d5 = d8;
                        d6 = d10;
                        double d13 = fArr[i2];
                        double d14 = fArr[i2 + 1];
                        int i4 = i2 + 3;
                        double d15 = fArr[i2 + 2];
                        i2 += 4;
                        double d16 = fArr[i4];
                        iM17864k4 = AbstractC4393ck.m17866k4(iM17864k4, d, d2, d3, d4, d7, d9, d13, d14, d15, d16, 0);
                        d7 = d15;
                        d9 = d16;
                    } else if (b3 == 3) {
                        d6 = d10;
                        double d17 = fArr2[i2];
                        double d18 = fArr2[i2 + 1];
                        d5 = d8;
                        double d19 = fArr2[i2 + 2];
                        double d20 = fArr2[i2 + 3];
                        int i5 = i2 + 5;
                        fArr = fArr2;
                        double d21 = fArr2[i2 + 4];
                        i2 += 6;
                        double d22 = fArr[i5];
                        iM17864k4 = AbstractC4393ck.m17865k4(iM17864k4, d, d2, d3, d4, d7, d9, d17, d18, d19, d20, d21, d22, 0);
                        d7 = d21;
                        d9 = d22;
                    } else if (b3 != 4) {
                        fArr = fArr2;
                    } else {
                        if (d7 != d8 || d9 != d10) {
                            iM17864k4 = AbstractC4393ck.m17864k4(iM17864k4, d, d2, d3, d4, d7, d9, d8, d10);
                        }
                        fArr = fArr2;
                        d7 = d8;
                        d8 = d7;
                        d9 = d10;
                        d10 = d9;
                    }
                    d10 = d6;
                    d8 = d5;
                } else {
                    fArr = fArr2;
                    double d23 = d8;
                    double d24 = d10;
                    if (d7 != d23 || d9 != d24) {
                        iM17864k4 = AbstractC4393ck.m17864k4(iM17864k4, d, d2, d3, d4, d7, d9, d23, d24);
                    }
                    int i6 = i2 + 1;
                    double d25 = fArr[i2];
                    i2 += 2;
                    d9 = fArr[i6];
                    d10 = d9;
                    d7 = d25;
                    d8 = d7;
                }
                i++;
                x1Var = this;
                fArr2 = fArr;
                b = 1;
                b2 = 2;
            }
            return (iM17864k4 == Integer.MIN_VALUE || (d7 == d8 && d9 == d10)) ? iM17864k4 : AbstractC4393ck.m17864k4(iM17864k4, d, d2, d3, d4, d7, d9, d8, d10);
        }

        public x1(InterfaceC1565x1 interfaceC1565x1, C11913yj c11913yj) {
            if (!(interfaceC1565x1 instanceof AbstractC4391bv)) {
                InterfaceC4413v4 interfaceC4413v4Mo8359kk = interfaceC1565x1.mo8359kk(c11913yj);
                m17828k4(interfaceC4413v4Mo8359kk.mo17819k4());
                this.f11970kk = new byte[20];
                this.f11980m9 = new float[40];
                mo17829k4(interfaceC4413v4Mo8359kk, false);
                return;
            }
            AbstractC4391bv abstractC4391bv = (AbstractC4391bv) interfaceC1565x1;
            m17828k4(abstractC4391bv.f11969h4);
            this.f11971to = abstractC4391bv.f11971to;
            byte[] bArr = abstractC4391bv.f11970kk;
            this.f11970kk = Arrays.copyOf(bArr, bArr.length);
            this.f11968du = abstractC4391bv.f11968du;
            this.f11980m9 = abstractC4391bv.mo17831k4(c11913yj);
        }

        /* JADX INFO: renamed from: k4 */
        public final synchronized void m17842k4(float f, float f2) {
            try {
                int i = this.f11971to;
                if (i <= 0 || this.f11970kk[i - 1] != 0) {
                    mo17830k4(false, 2);
                    byte[] bArr = this.f11970kk;
                    int i2 = this.f11971to;
                    this.f11971to = i2 + 1;
                    bArr[i2] = 0;
                    float[] fArr = this.f11980m9;
                    int i3 = this.f11968du;
                    int i4 = i3 + 1;
                    this.f11968du = i4;
                    fArr[i3] = f;
                    this.f11968du = i3 + 2;
                    fArr[i4] = f2;
                } else {
                    float[] fArr2 = this.f11980m9;
                    int i5 = this.f11968du;
                    fArr2[i5 - 2] = f;
                    fArr2[i5 - 1] = f2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: kk */
        public final synchronized void mo17834kk(double d, double d2, double d3, double d4) {
            mo17830k4(true, 4);
            byte[] bArr = this.f11970kk;
            int i = this.f11971to;
            this.f11971to = i + 1;
            bArr[i] = 2;
            float[] fArr = this.f11980m9;
            int i2 = this.f11968du;
            int i3 = i2 + 1;
            this.f11968du = i3;
            fArr[i2] = (float) d;
            int i4 = i2 + 2;
            this.f11968du = i4;
            fArr[i3] = (float) d2;
            int i5 = i2 + 3;
            this.f11968du = i5;
            fArr[i4] = (float) d3;
            this.f11968du = i2 + 4;
            fArr[i5] = (float) d4;
        }

        /* JADX INFO: renamed from: x1 */
        public final synchronized void m17845x1(float f, float f2) {
            mo17830k4(true, 2);
            byte[] bArr = this.f11970kk;
            int i = this.f11971to;
            this.f11971to = i + 1;
            bArr[i] = 1;
            float[] fArr = this.f11980m9;
            int i2 = this.f11968du;
            int i3 = i2 + 1;
            this.f11968du = i3;
            fArr[i2] = f;
            this.f11968du = i2 + 2;
            fArr[i3] = f2;
        }

        public x1(InterfaceC4413v4.k4 k4Var, int i) {
            super(k4Var, i);
            this.f11980m9 = new float[i * 2];
        }

        /* JADX INFO: renamed from: k4 */
        public final synchronized void m17843k4(float f, float f2, float f3, float f4) {
            mo17830k4(true, 4);
            byte[] bArr = this.f11970kk;
            int i = this.f11971to;
            this.f11971to = i + 1;
            bArr[i] = 2;
            float[] fArr = this.f11980m9;
            int i2 = this.f11968du;
            int i3 = i2 + 1;
            this.f11968du = i3;
            fArr[i2] = f;
            int i4 = i2 + 2;
            this.f11968du = i4;
            fArr[i3] = f2;
            int i5 = i2 + 3;
            this.f11968du = i5;
            fArr[i4] = f3;
            this.f11968du = i2 + 4;
            fArr[i5] = f4;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: x1 */
        public double[] mo17841x1(C11913yj c11913yj) {
            float[] fArr = this.f11980m9;
            double[] dArr = new double[fArr.length];
            if (c11913yj != null) {
                c11913yj.m55772k4(fArr, 0, dArr, 0, this.f11968du / 2);
                return dArr;
            }
            for (int i = 0; i < this.f11968du; i++) {
                dArr[i] = this.f11980m9[i];
            }
            return dArr;
        }

        /* JADX INFO: renamed from: k4 */
        public final synchronized void m17844k4(float f, float f2, float f3, float f4, float f5, float f6) {
            mo17830k4(true, 6);
            byte[] bArr = this.f11970kk;
            int i = this.f11971to;
            this.f11971to = i + 1;
            bArr[i] = 3;
            float[] fArr = this.f11980m9;
            int i2 = this.f11968du;
            int i3 = i2 + 1;
            this.f11968du = i3;
            fArr[i2] = f;
            int i4 = i2 + 2;
            this.f11968du = i4;
            fArr[i3] = f2;
            int i5 = i2 + 3;
            this.f11968du = i5;
            fArr[i4] = f3;
            int i6 = i2 + 4;
            this.f11968du = i6;
            fArr[i5] = f4;
            int i7 = i2 + 5;
            this.f11968du = i7;
            fArr[i6] = f5;
            this.f11968du = i2 + 6;
            fArr[i7] = f6;
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: k4 */
        public final void mo17829k4(InterfaceC4413v4 interfaceC4413v4, boolean z) {
            int i;
            int i2;
            float f;
            float f2;
            float[] fArr = new float[6];
            while (!interfaceC4413v4.mo17821x1()) {
                int iMo17818k4 = interfaceC4413v4.mo17818k4(fArr);
                if (iMo17818k4 != 0) {
                    if (iMo17818k4 == 1) {
                        f = fArr[0];
                        f2 = fArr[1];
                        m17845x1(f, f2);
                    } else if (iMo17818k4 == 2) {
                        m17843k4(fArr[0], fArr[1], fArr[2], fArr[3]);
                    } else if (iMo17818k4 == 3) {
                        m17844k4(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
                    } else if (iMo17818k4 == 4) {
                        m17825k4();
                    }
                } else if (!z || (i = this.f11971to) < 1 || (i2 = this.f11968du) < 1) {
                    m17842k4(fArr[0], fArr[1]);
                } else {
                    if (this.f11970kk[i - 1] != 4) {
                        float[] fArr2 = this.f11980m9;
                        if (fArr2[i2 - 2] == fArr[0] && fArr2[i2 - 1] == fArr[1]) {
                        }
                    }
                    f = fArr[0];
                    f2 = fArr[1];
                    m17845x1(f, f2);
                }
                interfaceC4413v4.mo17820kk();
                z = false;
            }
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: k4 */
        public void mo17830k4(boolean z, int i) {
            if (z && this.f11971to == 0) {
                throw new IllegalStateException("missing initial moveto in path definition");
            }
            byte[] bArr = this.f11970kk;
            int length = bArr.length;
            if (this.f11971to >= length) {
                this.f11970kk = Arrays.copyOf(bArr, length + (length <= 500 ? length : 500));
            }
            float[] fArr = this.f11980m9;
            int length2 = fArr.length;
            if (this.f11968du + i > length2) {
                int i2 = length2 <= 1000 ? length2 : 1000;
                if (i2 >= i) {
                    i = i2;
                }
                this.f11980m9 = Arrays.copyOf(fArr, length2 + i);
            }
        }

        @Override // com.aspose.slides.internal.p156gw.AbstractC4391bv
        /* JADX INFO: renamed from: k4 */
        public float[] mo17831k4(C11913yj c11913yj) {
            if (c11913yj == null) {
                float[] fArr = this.f11980m9;
                return Arrays.copyOf(fArr, fArr.length);
            }
            float[] fArr2 = this.f11980m9;
            float[] fArr3 = new float[fArr2.length];
            c11913yj.m55773k4(fArr2, 0, fArr3, 0, this.f11968du / 2);
            return fArr3;
        }
    }

    public AbstractC4391bv() {
    }

    public abstract Object clone();

    /* JADX INFO: renamed from: du */
    public final synchronized void m17822du() {
        this.f11968du = 0;
        this.f11971to = 0;
    }

    /* JADX INFO: renamed from: h4 */
    public int m17823h4() {
        return this.f11968du;
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC4413v4 mo8356k4(C11913yj c11913yj, double d) {
        return new C4407rv(mo8359kk(c11913yj), d);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract C12025x6 mo17824k4(int i);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo17826k4(double d, double d2, double d3, double d4, double d5, double d6);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo17829k4(InterfaceC4413v4 interfaceC4413v4, boolean z);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo17830k4(boolean z, int i);

    /* JADX INFO: renamed from: k4 */
    public abstract float[] mo17831k4(C11913yj c11913yj);

    /* JADX INFO: renamed from: kk */
    public final synchronized C12025x6 m17832kk() {
        try {
            int i = this.f11968du;
            int i2 = this.f11971to;
            if (i2 >= 1 && i >= 1) {
                if (this.f11970kk[i2 - 1] == 4) {
                    for (int i3 = i2 - 2; i3 > 0; i3--) {
                        byte b = this.f11970kk[i3];
                        if (b == 0) {
                            break;
                        }
                        if (b == 1) {
                            i -= 2;
                        } else if (b == 2) {
                            i -= 4;
                        } else if (b == 3) {
                            i -= 6;
                        }
                    }
                }
                return mo17824k4(i - 2);
            }
            return null;
        } finally {
        }
    }

    /* JADX INFO: renamed from: kk */
    public abstract void mo17833kk(double d, double d2);

    /* JADX INFO: renamed from: kk */
    public abstract void mo17834kk(double d, double d2, double d3, double d4);

    /* JADX INFO: renamed from: to */
    public final C12025x6 m17835to() {
        int i = this.f11968du;
        if (this.f11971to < 1 || i < 1) {
            return null;
        }
        return mo17824k4(i - 2);
    }

    /* JADX INFO: renamed from: to */
    public abstract void mo17836to(double d, double d2);

    /* JADX INFO: renamed from: to */
    public abstract void mo17837to(C11913yj c11913yj);

    /* JADX INFO: renamed from: x1 */
    public abstract int mo17838x1(double d, double d2);

    /* JADX INFO: renamed from: x1 */
    public abstract int mo17839x1(double d, double d2, double d3, double d4);

    /* JADX INFO: renamed from: x1 */
    public final synchronized InterfaceC4413v4.k4 m17840x1() {
        return this.f11969h4;
    }

    /* JADX INFO: renamed from: x1 */
    public abstract double[] mo17841x1(C11913yj c11913yj);

    public AbstractC4391bv(InterfaceC4413v4.k4 k4Var, int i) {
        m17828k4(k4Var);
        this.f11970kk = new byte[i];
    }

    /* JADX INFO: renamed from: k4 */
    public final synchronized void m17825k4() {
        try {
            int i = this.f11971to;
            if (i == 0 || this.f11970kk[i - 1] != 4) {
                mo17830k4(true, 0);
                byte[] bArr = this.f11970kk;
                int i2 = this.f11971to;
                this.f11971to = i2 + 1;
                bArr[i2] = 4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17827k4(InterfaceC1565x1 interfaceC1565x1, boolean z) {
        mo17829k4(interfaceC1565x1.mo8359kk(null), z);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17828k4(InterfaceC4413v4.k4 k4Var) {
        if (k4Var != f11966k4 && k4Var != f11967x1) {
            throw new IllegalArgumentException("winding rule must be WIND_EVEN_ODD or WIND_NON_ZERO");
        }
        this.f11969h4 = k4Var;
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: k4 */
    public final boolean mo8357k4(double d, double d2) {
        if ((d2 * 0.0d) + (d * 0.0d) != 0.0d || this.f11971to < 2) {
            return false;
        }
        return (mo17838x1(d, d2) & (this.f11969h4 == f11967x1 ? -1 : 1)) != 0;
    }

    @Override // com.aspose.slides.internal.p031aw.InterfaceC1565x1
    /* JADX INFO: renamed from: k4 */
    public final boolean mo8358k4(double d, double d2, double d3, double d4) {
        double d5 = d + d3;
        if (!Double.isNaN(d5)) {
            double d6 = d2 + d4;
            if (!Double.isNaN(d6) && d3 > 0.0d && d4 > 0.0d) {
                int i = this.f11969h4 == f11967x1 ? -1 : 2;
                int iMo17839x1 = mo17839x1(d, d2, d5, d6);
                return iMo17839x1 == Integer.MIN_VALUE || (iMo17839x1 & i) != 0;
            }
        }
        return false;
    }
}
