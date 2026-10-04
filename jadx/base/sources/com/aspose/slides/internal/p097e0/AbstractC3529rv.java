package com.aspose.slides.internal.p097e0;

import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p409sv.C10782m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.e0.rv */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3529rv extends AbstractC3524ks {

    /* JADX INFO: renamed from: dy */
    private C3513ck f9856dy;

    /* JADX INFO: renamed from: h4 */
    protected AbstractC3511c5 f9857h4;

    /* JADX INFO: renamed from: m9 */
    public C3513ck f9858m9;

    public AbstractC3529rv(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f9856dy = null;
        this.f9858m9 = null;
    }

    /* JADX INFO: renamed from: bz */
    private void m14364bz() {
        AbstractC3511c5 abstractC3511c5 = this.f9857h4;
        if (abstractC3511c5 != null) {
            AbstractC3511c5.k4 k4VarMo14102kk = mo14102kk(abstractC3511c5);
            while (k4VarMo14102kk.mo9764x1()) {
                AbstractC3511c5 abstractC3511c5Mo14128dy = k4VarMo14102kk.mo14128dy();
                if (abstractC3511c5Mo14128dy.mo14084ix() == 10) {
                    abstractC3511c5Mo14128dy.mo14083h4();
                }
                abstractC3511c5Mo14128dy.mo14081dy();
            }
        }
        this.f9857h4 = null;
    }

    /* JADX INFO: renamed from: e0 */
    private void m14365e0() {
        int iMo14084ix;
        C3513ck c3513ck = this.f9856dy;
        if (c3513ck != null) {
            this.f9856dy = null;
            if (mo14084ix() == 3) {
                c3513ck.m14148k4((C10782m9) this);
                this.f9858m9 = c3513ck;
            } else if (mo14084ix() != 44 && mo14084ix() != 80 && mo14084ix() != 7) {
                AbstractC3511c5 abstractC3511c5M14115s_ = this.f9752k4;
                while (true) {
                    iMo14084ix = abstractC3511c5M14115s_.mo14084ix();
                    if (iMo14084ix == 3 || iMo14084ix == 44 || iMo14084ix == 80 || iMo14084ix == 7 || iMo14084ix == 53) {
                        break;
                    } else {
                        abstractC3511c5M14115s_ = abstractC3511c5M14115s_.m14115s_();
                    }
                }
                if (iMo14084ix == 3) {
                    c3513ck.m14148k4((C10782m9) abstractC3511c5M14115s_);
                    ((AbstractC3529rv) abstractC3511c5M14115s_).f9858m9 = c3513ck;
                } else if (iMo14084ix == 53) {
                    c3513ck.m14154um();
                }
            }
            mo14089k4(c3513ck);
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        super.mo14081dy();
        if (!mo14110p_() || mo14084ix() == 44) {
            m14364bz();
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: fa */
    public AbstractC3523kk mo14082fa() {
        return new C3510bv(this);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14089k4(AbstractC3511c5 abstractC3511c5) {
        m14365e0();
        if (!mo14110p_()) {
            if (!C7019kk.m27469x1(abstractC3511c5, C3513ck.class) && abstractC3511c5.mo14084ix() != 10) {
                m14366k4(this, abstractC3511c5);
                m14364bz();
            } else if (this.f9857h4 == null) {
                this.f9857h4 = abstractC3511c5;
            }
        }
        super.mo14089k4(abstractC3511c5);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: r_ */
    public void mo14113r_() {
        m14365e0();
        if (!mo14110p_() || mo14084ix() == 44) {
            m14366k4(this, (AbstractC3511c5) null);
        }
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: x1 */
    public void mo14121x1(AbstractC3511c5 abstractC3511c5) {
        super.mo14121x1(abstractC3511c5);
        if (abstractC3511c5 == this.f9857h4) {
            AbstractC3511c5.x1 x1Var = abstractC3511c5.f9754x1;
            this.f9857h4 = x1Var != null ? x1Var.f9755k4 : null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m14366k4(AbstractC3529rv abstractC3529rv, AbstractC3511c5 abstractC3511c5) {
        abstractC3529rv.mo14109o_().m14408kk().m14230k4(abstractC3529rv, abstractC3529rv.f9857h4, abstractC3511c5);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: x1 */
    public void mo14124x1(char[] cArr, int i, int i2, AbstractC3533um abstractC3533um, InterfaceC3757h4 interfaceC3757h4) {
        if (this.f9856dy == null) {
            C3513ck c3513ck = new C3513ck(this);
            this.f9856dy = c3513ck;
            c3513ck.m14091k4(interfaceC3757h4);
            if (!mo14110p_()) {
                this.f9856dy.mo14090k4(abstractC3533um);
            }
        }
        this.f9856dy.mo14124x1(cArr, i, i2, null, null);
    }
}
