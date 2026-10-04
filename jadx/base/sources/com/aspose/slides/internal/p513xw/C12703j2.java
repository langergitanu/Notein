package com.aspose.slides.internal.p513xw;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p023ak.C1387kk;
import com.aspose.slides.internal.p034b3.C1584du;
import com.aspose.slides.internal.p034b3.C1587h4;
import com.aspose.slides.internal.p034b3.C1602uz;
import com.aspose.slides.internal.p034b3.C1603v4;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p406ss.AbstractC10346wl;
import com.aspose.slides.internal.p406ss.C10326c5;
import com.aspose.slides.internal.p406ss.C10333jd;
import com.aspose.slides.internal.p406ss.C10343um;
import com.aspose.slides.internal.p406ss.C10345uz;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.j2 */
/* JADX INFO: loaded from: classes5.dex */
public class C12703j2 extends AbstractC12692du {

    /* JADX INFO: renamed from: ks */
    private C12728tq f42269ks;

    public C12703j2(C1584du c1584du, C10326c5 c10326c5) {
        super(c1584du, c10326c5);
        this.f42269ks = new C12728tq(c1584du, c10326c5);
    }

    /* JADX INFO: renamed from: ak */
    public final C12728tq m58990ak() {
        return this.f42269ks;
    }

    /* JADX INFO: renamed from: dq */
    public final C10326c5 m58991dq() {
        return (C10326c5) ((AbstractC12692du) this).f42220ck;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12692du
    /* JADX INFO: renamed from: k4 */
    public C12736vj mo58917k4(int i, boolean z) {
        return this.f42269ks.m59245k4(z, i, 0);
    }

    /* JADX INFO: renamed from: kk */
    public final int m58992kk(int i) {
        int i2 = i % 2;
        return (i2 == 0 || !(m58991dq().m50358bz() == 43 || m58991dq().m50358bz() == 40)) ? i2 == 0 ? (m58991dq().m50358bz() == 99 || m58991dq().m50358bz() == 41) ? i + 1 : i : i : i + 1;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12727to, com.aspose.slides.internal.p513xw.InterfaceC12711lr
    /* JADX INFO: renamed from: qq */
    public C12703j2 mo54979qq() {
        return this;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12692du
    /* JADX INFO: renamed from: to */
    public C12736vj mo58923to(boolean z) {
        C12736vj c12736vjMo58923to = super.mo58923to(z);
        if (!z) {
            while (!C14113y2.m67363du(m58991dq().m50332sv().m50347ts(), c12736vjMo58923to.m59331k4().m50385m9(58).m50335bz())) {
                c12736vjMo58923to = super.mo58923to(z);
            }
        }
        return c12736vjMo58923to;
    }

    @Override // com.aspose.slides.internal.p513xw.InterfaceC12740wy
    /* JADX INFO: renamed from: v_ */
    public void mo58993v_() {
        if (((AbstractC12692du) this).f42220ck.m14316b3()) {
            ((AbstractC12692du) this).f42222jd.m8613x1(((AbstractC12692du) this).f42220ck.mo14334yd());
        }
        C10345uz c10345uzMo14126yj = ((AbstractC12692du) this).f42220ck.mo14126yj();
        int i = this.f42223up;
        c10345uzMo14126yj.m50399k4(i, (i - this.f42224yj) + 1);
        ((AbstractC12692du) this).f42219c5.m8554k4(((AbstractC12692du) this).f42220ck, (this.f42223up - this.f42224yj) + 1);
        m58991dq().m50333t6();
        C10333jd c10333jdM50374h4 = ((AbstractC12692du) this).f42220ck.mo14126yj().m50396bz().m50374h4(m58991dq().m50326gi());
        if (c10333jdM50374h4 != null) {
            c10333jdM50374h4.m50353e0();
        }
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12692du
    /* JADX INFO: renamed from: wy */
    public void mo58925wy() {
        m58989to(57);
        m58989to(56);
        m58989to(61);
        m58989to(59);
        super.mo58925wy();
    }

    /* JADX INFO: renamed from: xk */
    public void m58994xk() {
        mo49031x6();
        if (((AbstractC12692du) this).f42219c5.m8551h4()) {
            C1387kk.m8232k4(m58991dq());
        }
        C1602uz c1602uz = null;
        if (m58991dq().m50325g8() != null) {
            try {
                c1602uz = (C1602uz) m58927yd().mo59017k4(this, m58991dq().m50325g8()).mo48951k4((C1606x1) null);
            } catch (InvalidOperationException unused) {
            }
        }
        C1587h4 c1587h4M8557kk = ((AbstractC12692du) this).f42219c5.m8557kk();
        C1603v4 c1603v4 = new C1603v4(c1602uz);
        m59228kk(c1603v4);
        c1603v4.m8646k4(m58991dq().m50324f9());
        c1603v4.m8647x1(m58991dq().m50330s7());
        c1587h4M8557kk.mo8487k4(c1603v4);
        ((AbstractC12692du) this).f42221fa = mo58923to(false);
        new C12735vh(this).m59330x1(m59235um().m59339jd().m8570v4());
        mo58925wy();
    }

    /* JADX INFO: renamed from: to */
    private void m58989to(int i) {
        C10343um c10343umM50323du;
        AbstractC10346wl abstractC10346wl = (AbstractC10346wl) ((AbstractC12692du) this).f42221fa.m59331k4().m50385m9(i);
        if (abstractC10346wl == null || (c10343umM50323du = m58991dq().m50323du(abstractC10346wl.m50335bz())) == null) {
            return;
        }
        m58927yd().mo59020k4(this, c10343umM50323du, abstractC10346wl).m59000yd();
    }
}
