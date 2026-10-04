package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.vh */
/* JADX INFO: loaded from: classes3.dex */
public class C2337vh extends AbstractC2402z7 {

    /* JADX INFO: renamed from: du */
    private Object f8110du = new Object();

    /* JADX INFO: renamed from: kk */
    private C2286s7 f8111kk;

    /* JADX INFO: renamed from: to */
    private long f8112to;

    public C2337vh(C2286s7 c2286s7) {
        this.f8111kk = c2286s7;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2402z7
    /* JADX INFO: renamed from: k4 */
    public double mo11394k4() {
        return mo11402x1().m10424x1();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2402z7
    /* JADX INFO: renamed from: kk */
    public int mo11397kk(AbstractC2220nx abstractC2220nx) {
        C2334v6 c2334v6 = (C2334v6) C7019kk.m27452k4((Object) abstractC2220nx, C2334v6.class);
        return c2334v6 != null ? C14057f9.m66579k4(c2334v6.m11556k4()) : abstractC2220nx.hashCode();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2402z7, com.aspose.slides.internal.p060ca.InterfaceC2030c9
    /* JADX INFO: renamed from: to */
    public long mo10317to() {
        if (this.f8112to == 0) {
            synchronized (this.f8110du) {
                try {
                    if (this.f8112to == 0) {
                        this.f8112to = C7019kk.m27435du(Double.valueOf(1.0d / mo10316kk().m11686k4()), 14);
                    }
                } finally {
                }
            }
        }
        return this.f8112to;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2402z7, com.aspose.slides.internal.p060ca.InterfaceC2030c9
    /* JADX INFO: renamed from: x1 */
    public double mo10318x1(AbstractC2220nx abstractC2220nx) {
        C2068ei c2068eiMo10265k4;
        double dMo10318x1 = super.mo10318x1(abstractC2220nx);
        return (dMo10318x1 != 0.0d || (c2068eiMo10265k4 = this.f8111kk.mo10265k4(abstractC2220nx)) == null) ? dMo10318x1 : c2068eiMo10265k4.m10463c5();
    }

    /* JADX INFO: renamed from: k4 */
    public final C2372xo m11562k4(AbstractC2220nx abstractC2220nx) {
        int iM11614k4;
        int iM11556k4 = C7019kk.m27469x1(abstractC2220nx, C2334v6.class) ? ((C2334v6) abstractC2220nx).m11556k4() : this.f8111kk.m11388x1(((C2319ub) abstractC2220nx).m11480k4());
        C2097gf c2097gfM11385kk = this.f8111kk.m11385kk();
        if (this.f8111kk.m11389x1() != null && this.f8111kk.m11389x1().length != 0 && (iM11614k4 = this.f8111kk.m11382k4().m11742x1().m11614k4(iM11556k4) & 255) < this.f8111kk.m11389x1().length) {
            c2097gfM11385kk = this.f8111kk.m11389x1()[iM11614k4];
        }
        return (c2097gfM11385kk == this.f8111kk.m11385kk() || c2097gfM11385kk.m10584k4().f7953yj == null) ? this.f8111kk.m11385kk().m10584k4().f7953yj != null ? this.f8111kk.m11385kk().m10584k4().f7953yj : C2300t6.f7916ks : this.f8111kk.m11385kk().m10584k4().f7953yj != null ? c2097gfM11385kk.m10584k4().f7953yj.m11687k4(this.f8111kk.m11385kk().m10584k4().f7953yj) : c2097gfM11385kk.m10584k4().f7953yj;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2402z7, com.aspose.slides.internal.p060ca.InterfaceC2030c9
    /* JADX INFO: renamed from: kk */
    public C2372xo mo10316kk() {
        return this.f8111kk.m11385kk().m10584k4().f7953yj != null ? this.f8111kk.m11385kk().m10584k4().f7953yj : C2300t6.f7916ks;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2402z7
    /* JADX INFO: renamed from: x1 */
    public C2054dt mo11402x1() {
        return this.f8111kk.m11385kk().m10584k4().f7950x6;
    }
}
