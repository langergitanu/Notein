package com.aspose.slides.internal.p060ca;

import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.cc */
/* JADX INFO: loaded from: classes3.dex */
class C2032cc {

    /* JADX INFO: renamed from: kk */
    private C2068ei f7043kk;

    /* JADX INFO: renamed from: k4 */
    private C2069ek f7042k4 = new C2069ek();

    /* JADX INFO: renamed from: x1 */
    private C2287s9 f7044x1 = new C2287s9();

    public C2032cc(C2068ei c2068ei) {
        this.f7043kk = c2068ei;
        c2068ei.m10484x1(1000);
    }

    /* JADX INFO: renamed from: k4 */
    public final C2068ei m10319k4() {
        return this.f7043kk;
    }

    /* JADX INFO: renamed from: kk */
    public final void m10328kk() {
        m10319k4().m10482up().m11515k4(this.f7042k4);
        this.f7042k4 = new C2069ek();
    }

    /* JADX INFO: renamed from: to */
    public final void m10330to(double d, double d2) {
        this.f7042k4.m10490k4(new C2413zo(m10319k4().m10479m9() + d, d2));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10331x1() {
        if (this.f7042k4 != null) {
            m10319k4().m10482up().m11515k4(this.f7042k4);
        }
        this.f7042k4 = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10320k4(double d, double d2) {
        m10319k4().m10470k4(d);
        m10319k4().m10483x1(d2);
    }

    /* JADX INFO: renamed from: kk */
    public final void m10329kk(double d, double d2) {
        this.f7042k4.m10490k4(new C2332v0(m10319k4().m10466dy() + d, d2));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10332x1(double d, double d2) {
        m10319k4().m10478kk(d);
        m10319k4().m10481to(d2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10321k4(C2046dg c2046dg) {
        Iterator<T> it = c2046dg.m10362k4().iterator();
        while (it.hasNext()) {
            m10319k4().m10468h4().m10362k4().m11513k4((InterfaceC2196mi) it.next());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10322k4(C2046dg c2046dg, double d, double d2) {
        Iterator<T> it = c2046dg.m10362k4().iterator();
        while (it.hasNext()) {
            InterfaceC2196mi interfaceC2196miMo10538kk = ((InterfaceC2196mi) it.next()).mo10538kk();
            interfaceC2196miMo10538kk.mo10536k4(d, d2);
            m10319k4().m10468h4().m10362k4().m11513k4(interfaceC2196miMo10538kk);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10323k4(C2141j8 c2141j8) {
        C2387yg c2387yg = new C2387yg(c2141j8.m10812k4(), c2141j8.m10813x1());
        c2387yg.m11745k4(this.f7042k4);
        m10319k4().m10468h4().m10362k4().m11513k4(c2387yg);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10324k4(C2239p5 c2239p5) {
        C2140j6 c2140j6 = new C2140j6(c2239p5.m11228k4(), c2239p5.m11229x1());
        c2140j6.m10809k4(this.f7042k4);
        m10319k4().m10468h4().m10362k4().m11513k4(c2140j6);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10325k4(C2305th c2305th) {
        C2264qn c2264qn = new C2264qn(c2305th.m11440k4(), c2305th.m11443x1(), c2305th.m11441kk(), c2305th.m11442to(), c2305th.m11438du(), c2305th.m11439h4());
        c2264qn.m11299k4(this.f7042k4);
        m10319k4().m10468h4().m10362k4().m11513k4(c2264qn);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10326k4(C2336vf c2336vf) {
        C2090fu c2090fu = new C2090fu(c2336vf.m11560k4(), c2336vf.m11561x1());
        c2090fu.m10537k4(this.f7042k4);
        m10319k4().m10468h4().m10362k4().m11513k4(c2090fu);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10327k4(double[][] dArr, double[][] dArr2) {
        for (double[] dArr3 : dArr) {
            int i = 0;
            while (true) {
                if (i < dArr3.length) {
                    if (i % 2 == 0) {
                        dArr3[i] = m10319k4().m10466dy() + dArr3[i];
                    }
                    i++;
                }
            }
        }
        for (double[] dArr4 : dArr2) {
            int i2 = 0;
            while (true) {
                if (i2 < dArr4.length) {
                    if (i2 % 2 == 0) {
                        dArr4[i2] = m10319k4().m10479m9() + dArr4[i2];
                    }
                    i2++;
                }
            }
        }
        this.f7042k4.m10490k4(new C2341vw(dArr, dArr2));
    }
}
