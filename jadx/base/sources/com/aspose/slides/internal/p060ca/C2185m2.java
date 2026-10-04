package com.aspose.slides.internal.p060ca;

import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.m2 */
/* JADX INFO: loaded from: classes3.dex */
class C2185m2 {

    /* JADX INFO: renamed from: k4 */
    private C2069ek f7605k4 = new C2069ek();

    /* JADX INFO: renamed from: x1 */
    private C2068ei f7606x1;

    public C2185m2(C2068ei c2068ei) {
        this.f7606x1 = c2068ei;
        c2068ei.m10484x1(1000);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11096k4() {
        if (this.f7605k4 != null) {
            this.f7606x1.m10482up().m11515k4(this.f7605k4);
        }
        this.f7605k4 = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11097k4(double d, double d2) {
        this.f7606x1.m10478kk(d);
        this.f7606x1.m10481to(d2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11098k4(C2046dg c2046dg) {
        Iterator<T> it = c2046dg.m10362k4().iterator();
        while (it.hasNext()) {
            this.f7606x1.m10468h4().m10362k4().m11513k4((InterfaceC2196mi) it.next());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11099k4(C2046dg c2046dg, double d, double d2) {
        Iterator<T> it = c2046dg.m10362k4().iterator();
        while (it.hasNext()) {
            InterfaceC2196mi interfaceC2196miMo10538kk = ((InterfaceC2196mi) it.next()).mo10538kk();
            interfaceC2196miMo10538kk.mo10536k4(d, d2);
            this.f7606x1.m10468h4().m10362k4().m11513k4(interfaceC2196miMo10538kk);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11100k4(C2141j8 c2141j8) {
        C2387yg c2387yg = new C2387yg(c2141j8.m10812k4(), c2141j8.m10813x1());
        c2387yg.m11745k4(this.f7605k4);
        this.f7606x1.m10468h4().m10362k4().m11513k4(c2387yg);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11101k4(C2239p5 c2239p5) {
        C2140j6 c2140j6 = new C2140j6(c2239p5.m11228k4(), c2239p5.m11229x1());
        c2140j6.m10809k4(this.f7605k4);
        this.f7606x1.m10468h4().m10362k4().m11513k4(c2140j6);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11102k4(C2305th c2305th) {
        C2264qn c2264qn = new C2264qn(c2305th.m11440k4(), c2305th.m11443x1(), c2305th.m11441kk(), c2305th.m11442to(), c2305th.m11438du(), c2305th.m11439h4());
        c2264qn.m11299k4(this.f7605k4);
        this.f7606x1.m10468h4().m10362k4().m11513k4(c2264qn);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11103k4(C2336vf c2336vf) {
        C2090fu c2090fu = new C2090fu(c2336vf.m11560k4(), c2336vf.m11561x1());
        c2090fu.m10537k4(this.f7605k4);
        this.f7606x1.m10468h4().m10362k4().m11513k4(c2090fu);
    }
}
