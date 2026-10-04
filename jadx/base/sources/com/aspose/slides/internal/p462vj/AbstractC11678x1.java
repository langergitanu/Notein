package com.aspose.slides.internal.p462vj;

import com.aspose.slides.internal.p034b3.InterfaceC1599u4;
import com.aspose.slides.internal.p048bv.InterfaceC1870up;
import com.aspose.slides.internal.p393s7.C10155jd;
import com.aspose.slides.internal.p393s7.C10159m9;
import com.aspose.slides.internal.p393s7.C10161to;
import com.aspose.slides.internal.p409sv.AbstractC10779kk;
import com.aspose.slides.internal.p486wy.C12320ks;
import com.aspose.slides.internal.p513xw.C12712m2;
import com.aspose.slides.internal.p513xw.C12717os;
import com.aspose.slides.internal.p513xw.C12724ss;

/* JADX INFO: renamed from: com.aspose.slides.internal.vj.x1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11678x1 extends AbstractC11681yd {

    /* JADX INFO: renamed from: c5 */
    protected AbstractC10779kk f39487c5;

    /* JADX INFO: renamed from: ck */
    protected boolean f39488ck;

    /* JADX INFO: renamed from: jd */
    protected C10161to f39489jd;

    public AbstractC11678x1(AbstractC10779kk abstractC10779kk) {
        super(abstractC10779kk);
        this.f39488ck = false;
        this.f39487c5 = abstractC10779kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m55024k4(String str) {
        int iM49984x1 = 0;
        for (int i = 0; i < str.length(); i++) {
            iM49984x1 += this.f39489jd.m49984x1(str.charAt(i));
        }
        return iM49984x1;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: x6 */
    public void mo49031x6() {
        C10159m9 c10159m9Mo14168c_ = this.f39487c5.mo14107n_().mo14168c_();
        C10155jd[] c10155jdArrM17246k4 = this.f39487c5.m52272e0().m17246k4(c10159m9Mo14168c_);
        this.f39489jd = c10159m9Mo14168c_.m49955k4(c10155jdArrM17246k4[0], this.f39487c5.m52272e0().f11682k4.mo9886x1(this), c10155jdArrM17246k4[0].m49936du());
        m55029k4(this.f39487c5.m52275gi());
    }

    /* JADX INFO: renamed from: yd */
    public final int m55026yd() {
        return this.f39487c5.m14331wy();
    }

    @Override // com.aspose.slides.internal.p462vj.AbstractC11681yd
    /* JADX INFO: renamed from: k4 */
    public C11662kk mo54822k4(C12724ss c12724ss) {
        return new C11662kk(this.f39489jd, this.f39487c5.m52278s7().m17133to(this).mo9877dy().mo9886x1(this), this.f39487c5.m52280sv(), this.f39487c5.m52281wp(), this.f39487c5.m52279ss(), this.f39487c5.m52276kp(), c12724ss.m59137ar());
    }

    @Override // com.aspose.slides.internal.p462vj.AbstractC11681yd, com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: k4 */
    public void mo49023k4(InterfaceC1870up<C12717os> interfaceC1870up, C12724ss c12724ss) {
        super.mo49023k4(interfaceC1870up, c12724ss);
        if (this.f39488ck) {
            return;
        }
        mo54979qq().m58921k4(this.f39487c5.m52273f9(), (InterfaceC1599u4) ((AbstractC11681yd) this).f39494fa);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55025k4(C12320ks c12320ks) {
        C12712m2.m59048k4(c12320ks, this.f39487c5.mo14334yd());
        c12320ks.m8670kk(this.f39489jd.m49969du() - this.f39489jd.m49972h4());
        c12320ks.m57593fa(this.f39489jd.m49969du());
        C12712m2.m59046k4(c12320ks, this.f39489jd);
        c12320ks.m8667k4(7, this.f39487c5.m52271bz().Clone());
        C12712m2.m59047k4(c12320ks, this.f39487c5.m52274g8());
        C12712m2.m59044k4(c12320ks, this.f39487c5.m52277qm());
    }
}
