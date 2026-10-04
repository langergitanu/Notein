package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ei */
/* JADX INFO: loaded from: classes3.dex */
public class C2068ei {

    /* JADX INFO: renamed from: du */
    private double f7149du;

    /* JADX INFO: renamed from: dy */
    private C2054dt f7150dy;

    /* JADX INFO: renamed from: fa */
    private C2325uo f7151fa;

    /* JADX INFO: renamed from: h4 */
    private double f7152h4;

    /* JADX INFO: renamed from: k4 */
    C2046dg f7154k4;

    /* JADX INFO: renamed from: m9 */
    private int f7157m9;

    /* JADX INFO: renamed from: rv */
    private int f7158rv;

    /* JADX INFO: renamed from: x1 */
    C2117hn f7161x1;

    /* JADX INFO: renamed from: kk */
    private double f7155kk = -1.7976931348623157E308d;

    /* JADX INFO: renamed from: to */
    private double f7159to = -1.7976931348623157E308d;

    /* JADX INFO: renamed from: c5 */
    private Object f7147c5 = new Object();

    /* JADX INFO: renamed from: jd */
    private Object f7153jd = new Object();

    /* JADX INFO: renamed from: ck */
    private Object f7148ck = new Object();

    /* JADX INFO: renamed from: up */
    private k4 f7160up = k4.f7163k4;

    /* JADX INFO: renamed from: yj */
    private boolean f7162yj = false;

    /* JADX INFO: renamed from: ks */
    private Object f7156ks = new Object();

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.ei$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public static final k4 f7163k4 = new k4(null, C2334v6.f8105k4, null);

        /* JADX INFO: renamed from: kk */
        private C2377xv f7164kk;

        /* JADX INFO: renamed from: to */
        private AbstractC2220nx f7165to;

        /* JADX INFO: renamed from: x1 */
        private byte[] f7166x1;

        public k4(C2377xv c2377xv, AbstractC2220nx abstractC2220nx, byte[] bArr) {
            this.f7166x1 = bArr;
            this.f7164kk = c2377xv;
            this.f7165to = abstractC2220nx;
        }

        /* JADX INFO: renamed from: k4 */
        public final C2377xv m10486k4() {
            return this.f7164kk;
        }

        /* JADX INFO: renamed from: kk */
        public final byte[] m10487kk() {
            return this.f7166x1;
        }

        /* JADX INFO: renamed from: x1 */
        public final AbstractC2220nx m10488x1() {
            return this.f7165to;
        }
    }

    public C2068ei() {
        m10472k4(0);
        this.f7151fa = new C2325uo();
        this.f7154k4 = new C2046dg();
    }

    /* JADX INFO: renamed from: c5 */
    public final double m10463c5() {
        return this.f7149du;
    }

    /* JADX INFO: renamed from: ck */
    public final int m10464ck() {
        return this.f7157m9;
    }

    /* JADX INFO: renamed from: du */
    public final int m10465du() {
        return this.f7158rv;
    }

    /* JADX INFO: renamed from: dy */
    public final double m10466dy() {
        if (this.f7159to == -1.7976931348623157E308d) {
            synchronized (this.f7148ck) {
                try {
                    if (this.f7159to == -1.7976931348623157E308d) {
                        this.f7159to = m10467fa().m10422to();
                    }
                } finally {
                }
            }
        }
        return this.f7159to;
    }

    /* JADX INFO: renamed from: fa */
    public final C2054dt m10467fa() {
        if (this.f7150dy == null) {
            synchronized (this.f7147c5) {
                try {
                    if (this.f7150dy == null) {
                        C2054dt c2054dt = new C2054dt();
                        this.f7150dy = c2054dt;
                        m10485x1(c2054dt);
                    }
                } finally {
                }
            }
        }
        return this.f7150dy;
    }

    /* JADX INFO: renamed from: h4 */
    public C2046dg m10468h4() {
        if (mo10477kk() != null && !this.f7162yj) {
            synchronized (this.f7156ks) {
                try {
                    if (!this.f7162yj) {
                        this.f7154k4 = this.f7161x1.mo10695k4();
                        this.f7162yj = true;
                    }
                } finally {
                }
            }
        }
        return this.f7154k4;
    }

    /* JADX INFO: renamed from: jd */
    public final double m10469jd() {
        return this.f7152h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10470k4(double d) {
        this.f7155kk = d;
    }

    /* JADX INFO: renamed from: kk */
    public C2117hn mo10477kk() {
        return this.f7161x1;
    }

    /* JADX INFO: renamed from: m9 */
    public final double m10479m9() {
        if (this.f7155kk == -1.7976931348623157E308d) {
            synchronized (this.f7153jd) {
                try {
                    if (this.f7155kk == -1.7976931348623157E308d) {
                        this.f7155kk = m10467fa().m10418k4();
                    }
                } finally {
                }
            }
        }
        return this.f7155kk;
    }

    /* JADX INFO: renamed from: to */
    public final k4 m10480to() {
        return this.f7160up;
    }

    /* JADX INFO: renamed from: up */
    public final C2325uo m10482up() {
        return this.f7151fa;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10483x1(double d) {
        this.f7159to = d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10471k4(double d, double d2) {
        for (InterfaceC2196mi interfaceC2196mi : m10468h4().m10362k4()) {
            C2140j6 c2140j6 = (C2140j6) C7019kk.m27452k4((Object) interfaceC2196mi, C2140j6.class);
            if (c2140j6 != null) {
                c2140j6.m10808k4(c2140j6.m10807k4() + d);
                c2140j6.m10811x1(c2140j6.m10810x1() + d2);
            } else {
                C2090fu c2090fu = (C2090fu) C7019kk.m27452k4((Object) interfaceC2196mi, C2090fu.class);
                if (c2090fu != null) {
                    c2090fu.m10535k4(c2090fu.m10534k4() + d);
                    c2090fu.m10540x1(c2090fu.m10539x1() + d2);
                } else {
                    C2264qn c2264qn = (C2264qn) C7019kk.m27452k4((Object) interfaceC2196mi, C2264qn.class);
                    if (c2264qn != null) {
                        c2264qn.m11298k4(c2264qn.m11297k4() + d);
                        c2264qn.m11305x1(c2264qn.m11304x1() + d2);
                        c2264qn.m11300kk(c2264qn.m11302to() + d);
                        c2264qn.m11303to(c2264qn.m11293du() + d2);
                        c2264qn.m11294du(c2264qn.m11295h4() + d);
                        c2264qn.m11296h4(c2264qn.m11301m9() + d2);
                    } else {
                        C2387yg c2387yg = (C2387yg) C7019kk.m27452k4((Object) interfaceC2196mi, C2387yg.class);
                        if (c2387yg != null) {
                            c2387yg.m11744k4(c2387yg.m11743k4() + d);
                            c2387yg.m11747x1(c2387yg.m11746x1() + d2);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m10478kk(double d) {
        this.f7149du = d;
    }

    /* JADX INFO: renamed from: to */
    public final void m10481to(double d) {
        this.f7152h4 = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10484x1(int i) {
        this.f7157m9 = i;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m10462k4(double d, double d2, C2372xo c2372xo, double[] dArr, double[] dArr2) {
        dArr[0] = (c2372xo.m11694x1() * d2) + (c2372xo.m11686k4() * d);
        dArr2[0] = (c2372xo.m11692to() * d2) + (c2372xo.m11690kk() * d);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10485x1(C2054dt c2054dt) {
        double d;
        double d2;
        double d3;
        double d4;
        double dM11301m9;
        double dM11295h4;
        if (c2054dt != null) {
            if (m10468h4().m10362k4().size() == 0) {
                d4 = 0.0d;
                d3 = 0.0d;
                d = 0.0d;
                d2 = 0.0d;
            } else {
                double d5 = Double.MAX_VALUE;
                d = -1.7976931348623157E308d;
                d2 = -1.7976931348623157E308d;
                d3 = Double.MAX_VALUE;
                for (InterfaceC2196mi interfaceC2196mi : m10468h4().m10362k4()) {
                    C2140j6 c2140j6 = (C2140j6) C7019kk.m27452k4((Object) interfaceC2196mi, C2140j6.class);
                    if (c2140j6 != null) {
                        dM11295h4 = c2140j6.m10807k4();
                        dM11301m9 = c2140j6.m10810x1();
                    } else {
                        C2090fu c2090fu = (C2090fu) C7019kk.m27452k4((Object) interfaceC2196mi, C2090fu.class);
                        if (c2090fu != null) {
                            dM11295h4 = c2090fu.m10534k4();
                            dM11301m9 = c2090fu.m10539x1();
                        } else {
                            C2264qn c2264qn = (C2264qn) C7019kk.m27452k4((Object) interfaceC2196mi, C2264qn.class);
                            if (c2264qn != null) {
                                dM11295h4 = c2264qn.m11295h4();
                                dM11301m9 = c2264qn.m11301m9();
                            } else {
                                dM11301m9 = -2.147483648E9d;
                                dM11295h4 = -2.147483648E9d;
                            }
                        }
                    }
                    if (dM11295h4 != -2.147483648E9d && dM11301m9 != -2.147483648E9d) {
                        if (dM11295h4 < d5) {
                            d5 = dM11295h4;
                        }
                        if (dM11295h4 > d) {
                            d = dM11295h4;
                        }
                        if (dM11301m9 < d3) {
                            d3 = dM11301m9;
                        }
                        if (dM11301m9 > d2) {
                            d2 = dM11301m9;
                        }
                    }
                }
                d4 = d5;
            }
            c2054dt.m10419k4(d4);
            c2054dt.m10421kk(d);
            c2054dt.m10425x1(d3);
            c2054dt.m10423to(d2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10472k4(int i) {
        this.f7158rv = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10473k4(C2054dt c2054dt) {
        this.f7150dy = c2054dt;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10474k4(k4 k4Var) {
        this.f7160up = k4Var;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo10475k4(C2117hn c2117hn) {
        this.f7161x1 = c2117hn;
        this.f7162yj = false;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10476k4(C2372xo c2372xo) {
        for (InterfaceC2196mi interfaceC2196mi : m10468h4().m10362k4()) {
            C2140j6 c2140j6 = (C2140j6) C7019kk.m27452k4((Object) interfaceC2196mi, C2140j6.class);
            if (c2140j6 != null) {
                double[] dArr = {0.0d};
                double[] dArr2 = {0.0d};
                m10462k4(c2140j6.m10807k4(), c2140j6.m10810x1(), c2372xo, dArr, dArr2);
                double d = dArr[0];
                double d2 = dArr2[0];
                c2140j6.m10808k4(d);
                c2140j6.m10811x1(d2);
            } else {
                C2090fu c2090fu = (C2090fu) C7019kk.m27452k4((Object) interfaceC2196mi, C2090fu.class);
                if (c2090fu != null) {
                    double[] dArr3 = {0.0d};
                    double[] dArr4 = {0.0d};
                    m10462k4(c2090fu.m10534k4(), c2090fu.m10539x1(), c2372xo, dArr3, dArr4);
                    double d3 = dArr3[0];
                    double d4 = dArr4[0];
                    c2090fu.m10535k4(d3);
                    c2090fu.m10540x1(d4);
                } else {
                    C2264qn c2264qn = (C2264qn) C7019kk.m27452k4((Object) interfaceC2196mi, C2264qn.class);
                    if (c2264qn != null) {
                        double[] dArr5 = {0.0d};
                        double[] dArr6 = {0.0d};
                        m10462k4(c2264qn.m11297k4(), c2264qn.m11304x1(), c2372xo, dArr5, dArr6);
                        double d5 = dArr5[0];
                        double d6 = dArr6[0];
                        c2264qn.m11298k4(d5);
                        c2264qn.m11305x1(d6);
                        dArr5[0] = d5;
                        dArr6[0] = d6;
                        m10462k4(c2264qn.m11302to(), c2264qn.m11293du(), c2372xo, dArr5, dArr6);
                        double d7 = dArr5[0];
                        double d8 = dArr6[0];
                        c2264qn.m11300kk(d7);
                        c2264qn.m11303to(d8);
                        dArr5[0] = d7;
                        dArr6[0] = d8;
                        m10462k4(c2264qn.m11295h4(), c2264qn.m11301m9(), c2372xo, dArr5, dArr6);
                        double d9 = dArr5[0];
                        double d10 = dArr6[0];
                        c2264qn.m11294du(d9);
                        c2264qn.m11296h4(d10);
                    } else {
                        C2387yg c2387yg = (C2387yg) C7019kk.m27452k4((Object) interfaceC2196mi, C2387yg.class);
                        if (c2387yg != null) {
                            double[] dArr7 = {0.0d};
                            double[] dArr8 = {0.0d};
                            m10462k4(c2387yg.m11743k4(), c2387yg.m11746x1(), c2372xo, dArr7, dArr8);
                            double d11 = dArr7[0];
                            double d12 = dArr8[0];
                            c2387yg.m11744k4(d11);
                            c2387yg.m11747x1(d12);
                        }
                    }
                }
            }
        }
    }
}
