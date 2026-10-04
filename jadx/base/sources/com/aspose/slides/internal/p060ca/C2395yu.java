package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p060ca.C2146jl;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.yu */
/* JADX INFO: loaded from: classes3.dex */
public class C2395yu extends AbstractC2402z7 {

    /* JADX INFO: renamed from: du */
    private C2372xo f8316du;

    /* JADX INFO: renamed from: dy */
    @Deprecated
    private C2347wg f8317dy;

    /* JADX INFO: renamed from: kk */
    private C2092fz f8319kk;

    /* JADX INFO: renamed from: to */
    private C2054dt f8321to;

    /* JADX INFO: renamed from: h4 */
    private Object f8318h4 = new Object();

    /* JADX INFO: renamed from: m9 */
    private Object f8320m9 = new Object();

    public C2395yu(C2092fz c2092fz) {
        C2347wg[] c2347wgArrM10455k4;
        this.f8319kk = c2092fz;
        if (c2092fz == null || c2092fz.m10548dy() == null || (c2347wgArrM10455k4 = c2092fz.m10548dy().m10455k4(3, 1)) == null || c2347wgArrM10455k4.length <= 0) {
            return;
        }
        this.f8317dy = c2347wgArrM10455k4[0];
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2402z7
    /* JADX INFO: renamed from: k4 */
    public double mo11394k4() {
        if (this.f8319kk.m10545c5() != null) {
            return this.f8319kk.m10545c5().m11594to();
        }
        return 0.0d;
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
        if (this.f8319kk.m10572kk() == null) {
            return 1000L;
        }
        return this.f8319kk.m10572kk().m11015x1();
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2402z7, com.aspose.slides.internal.p060ca.InterfaceC2030c9
    /* JADX INFO: renamed from: x1 */
    public double mo10318x1(AbstractC2220nx abstractC2220nx) {
        int iM11596x1;
        C2146jl.x1 x1VarM10846k4;
        int iM11556k4;
        C2334v6 c2334v6 = (C2334v6) C7019kk.m27452k4((Object) abstractC2220nx, C2334v6.class);
        if (c2334v6 == null) {
            return super.mo10318x1(abstractC2220nx);
        }
        if (this.f8319kk.m10552jd() != null && this.f8319kk.m10552jd().m10846k4().m10855k4() == 1) {
            x1VarM10846k4 = this.f8319kk.m10552jd().m10846k4();
            iM11556k4 = 0;
        } else {
            if (this.f8319kk.m10552jd() == null || c2334v6.m11556k4() > this.f8319kk.m10552jd().m10846k4().m10855k4() - 1) {
                if (this.f8319kk.m10545c5() == null) {
                    return 0.0d;
                }
                iM11596x1 = this.f8319kk.m10545c5().m11596x1();
                return iM11596x1 & 65535;
            }
            x1VarM10846k4 = this.f8319kk.m10552jd().m10846k4();
            iM11556k4 = c2334v6.m11556k4();
        }
        iM11596x1 = x1VarM10846k4.m10856k4(iM11556k4).m10851k4();
        return iM11596x1 & 65535;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2402z7, com.aspose.slides.internal.p060ca.InterfaceC2030c9
    /* JADX INFO: renamed from: k4 */
    public double mo10315k4(AbstractC2220nx abstractC2220nx, AbstractC2220nx abstractC2220nx2) {
        if (this.f8346x1.size() > 0) {
            return super.mo10315k4(abstractC2220nx, abstractC2220nx2);
        }
        if (this.f8319kk.m10549fa() == null || this.f8319kk.m10549fa().m10298k4().f8346x1.size() <= 0) {
            return 0.0d;
        }
        return this.f8319kk.m10549fa().m10298k4().mo10315k4(abstractC2220nx, abstractC2220nx2);
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2402z7, com.aspose.slides.internal.p060ca.InterfaceC2030c9
    /* JADX INFO: renamed from: kk */
    public C2372xo mo10316kk() {
        if (this.f8316du == null) {
            synchronized (this.f8320m9) {
                try {
                    if (this.f8316du == null) {
                        this.f8316du = new C2372xo(new double[]{1.0d / (mo10317to() & 4294967295L), 0.0d, 0.0d, 1.0d / (4294967295L & mo10317to()), 0.0d, 0.0d});
                    }
                } finally {
                }
            }
        }
        return this.f8316du;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2402z7
    /* JADX INFO: renamed from: x1 */
    public C2054dt mo11402x1() {
        if (this.f8321to == null) {
            synchronized (this.f8318h4) {
                try {
                    if (this.f8321to == null) {
                        this.f8321to = this.f8319kk.m10572kk() != null ? new C2054dt(this.f8319kk.m10572kk().m11009kk(), this.f8319kk.m10572kk().m11013to(), this.f8319kk.m10572kk().m10999du(), this.f8319kk.m10572kk().m11002h4()) : new C2054dt(0.0d, 0.0d, 0.0d, 0.0d);
                    }
                } finally {
                }
            }
        }
        return this.f8321to;
    }
}
