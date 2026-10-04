package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.sa */
/* JADX INFO: loaded from: classes3.dex */
public class C2288sa extends AbstractC2402z7 {

    /* JADX INFO: renamed from: ck */
    private String f7871ck;

    /* JADX INFO: renamed from: du */
    private C2015bq f7872du;

    /* JADX INFO: renamed from: dy */
    private C2372xo f7873dy;

    /* JADX INFO: renamed from: fa */
    private String f7874fa;

    /* JADX INFO: renamed from: h4 */
    private long f7875h4;

    /* JADX INFO: renamed from: ix */
    private double f7876ix;

    /* JADX INFO: renamed from: ks */
    private double f7879ks;

    /* JADX INFO: renamed from: m9 */
    private C2054dt f7880m9;

    /* JADX INFO: renamed from: ne */
    private double f7881ne;

    /* JADX INFO: renamed from: rv */
    private double f7882rv;

    /* JADX INFO: renamed from: u4 */
    private double f7884u4;

    /* JADX INFO: renamed from: up */
    private String f7885up;

    /* JADX INFO: renamed from: x6 */
    private double f7886x6;

    /* JADX INFO: renamed from: yj */
    private double f7887yj;

    /* JADX INFO: renamed from: c5 */
    private Object f7870c5 = new Object();

    /* JADX INFO: renamed from: jd */
    private Object f7877jd = new Object();

    /* JADX INFO: renamed from: kk */
    public double f7878kk = -1.7976931348623157E308d;

    /* JADX INFO: renamed from: to */
    public double f7883to = -1.7976931348623157E308d;

    public C2288sa(C2015bq c2015bq) {
        this.f7872du = c2015bq;
    }

    /* JADX INFO: renamed from: du */
    public final String m11390du() {
        return this.f7871ck;
    }

    /* JADX INFO: renamed from: dy */
    public final void m11392dy(double d) {
        this.f7884u4 = d;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m11393h4(double d) {
        this.f7881ne = d;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2402z7
    /* JADX INFO: renamed from: k4 */
    public double mo11394k4() {
        if (this.f7883to == -1.7976931348623157E308d) {
            this.f7883to = mo11402x1().m10424x1();
        }
        return this.f7883to;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2402z7
    /* JADX INFO: renamed from: kk */
    public int mo11397kk(AbstractC2220nx abstractC2220nx) {
        C2319ub c2319ub = (C2319ub) C7019kk.m27452k4((Object) abstractC2220nx, C2319ub.class);
        return c2319ub != null ? c2319ub.m11480k4().hashCode() : abstractC2220nx.hashCode();
    }

    /* JADX INFO: renamed from: m9 */
    public final void m11400m9(double d) {
        this.f7876ix = d;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2402z7, com.aspose.slides.internal.p060ca.InterfaceC2030c9
    /* JADX INFO: renamed from: to */
    public long mo10317to() {
        if (this.f7875h4 == 0) {
            synchronized (this.f7870c5) {
                try {
                    if (this.f7875h4 == 0) {
                        if (C7019kk.m27469x1(this.f7872du, C2113hg.class)) {
                            this.f7875h4 = 1000L;
                        } else {
                            this.f7875h4 = C7019kk.m27435du(Double.valueOf(1.0d / this.f7872du.mo10267k4().m11579to().m10697k4()[0]), 14);
                        }
                    }
                } finally {
                }
            }
        }
        return this.f7875h4;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2402z7, com.aspose.slides.internal.p060ca.InterfaceC2030c9
    /* JADX INFO: renamed from: x1 */
    public double mo10318x1(AbstractC2220nx abstractC2220nx) {
        C2068ei c2068eiMo10265k4;
        double dMo10318x1 = super.mo10318x1(abstractC2220nx);
        return (dMo10318x1 != 0.0d || C7019kk.m27469x1(this.f7872du, C2113hg.class) || (c2068eiMo10265k4 = this.f7872du.mo10265k4(abstractC2220nx)) == null) ? dMo10318x1 : c2068eiMo10265k4.m10463c5();
    }

    /* JADX INFO: renamed from: du */
    public final void m11391du(double d) {
        this.f7886x6 = d;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2402z7
    /* JADX INFO: renamed from: k4 */
    public void mo11395k4(C2054dt c2054dt) {
        this.f7880m9 = c2054dt;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2402z7, com.aspose.slides.internal.p060ca.InterfaceC2030c9
    /* JADX INFO: renamed from: kk */
    public C2372xo mo10316kk() {
        if (this.f7873dy == null) {
            synchronized (this.f7877jd) {
                try {
                    if (this.f7873dy == null) {
                        this.f7873dy = !C7019kk.m27469x1(this.f7872du, C2113hg.class) ? new C2372xo(this.f7872du.mo10267k4().m11579to().m10697k4()) : new C2372xo();
                    }
                } finally {
                }
            }
        }
        return this.f7873dy;
    }

    /* JADX INFO: renamed from: to */
    public final void m11401to(double d) {
        this.f7882rv = d;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2402z7
    /* JADX INFO: renamed from: x1 */
    public C2054dt mo11402x1() {
        if (this.f7880m9 == null) {
            synchronized (this.f7870c5) {
                try {
                    if (this.f7880m9 == null) {
                        if (C7019kk.m27469x1(this.f7872du, C2113hg.class)) {
                            this.f7880m9 = new C2054dt();
                        } else {
                            this.f7880m9 = new C2054dt(this.f7872du.mo10267k4().m11568du().m11137k4()[0], this.f7872du.mo10267k4().m11568du().m11137k4()[1], this.f7872du.mo10267k4().m11568du().m11137k4()[2], this.f7872du.mo10267k4().m11568du().m11137k4()[3]);
                        }
                    }
                } finally {
                }
            }
        }
        return this.f7880m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11396k4(String str) {
        this.f7871ck = str;
    }

    /* JADX INFO: renamed from: kk */
    public final void m11398kk(double d) {
        this.f7879ks = d;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m11403x1(double d) {
        this.f7887yj = d;
    }

    /* JADX INFO: renamed from: kk */
    public final void m11399kk(String str) {
        this.f7885up = str;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m11404x1(String str) {
        this.f7874fa = str;
    }
}
