package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12015qq;

/* JADX INFO: renamed from: com.aspose.slides.tn */
/* JADX INFO: loaded from: classes3.dex */
class C14568tn extends k8h {
    public C14568tn(C14787xi c14787xi) {
        super(c14787xi);
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: du */
    public void mo4962du(C14713vw c14713vw) {
        float fM73019ck;
        float fM73019ck2;
        ((AbstractC14763x3) this).f49907to = 0.0f;
        ((AbstractC14763x3) this).f49900du = 0.0f;
        if (mo3221T_()) {
            float fM73225wy = m73225wy() / (((AbstractC14763x3) this).f49904k4.size() - 1);
            if (!m73026k4().m73384dy().isPlotOrderReversed()) {
                ((AbstractC14763x3) this).f49904k4.reverse();
            }
            float f = 0.0f;
            float fM72555k4 = 0.0f;
            for (int i = 0; i < ((AbstractC14763x3) this).f49904k4.size(); i++) {
                float f2 = i * fM73225wy;
                if (m73026k4().m73386h4() == 0 || m73026k4().m73386h4() % 90 == 0) {
                    float fM73225wy2 = ((AbstractC14763x3) this).f49904k4.get_Item(i).m73225wy() / 2.0f;
                    float f3 = f2 - fM73225wy2;
                    fM73019ck = fM73225wy2 + f2;
                    fM73019ck2 = f3;
                } else {
                    float fM73225wy3 = ((AbstractC14763x3) this).f49904k4.get_Item(i).m73225wy();
                    if (m73026k4().m73386h4() > 0) {
                        fM73019ck2 = (f2 + m73019ck()) - fM73225wy3;
                        fM73019ck = m73019ck();
                    } else {
                        float fM73019ck3 = (-1.0f) * m73019ck();
                        fM73019ck = (f2 - m73019ck()) + fM73225wy3;
                        fM73019ck2 = fM73019ck3;
                    }
                }
                if (fM73019ck2 < 0.0f && fM73019ck2 < f) {
                    f = fM73019ck2;
                }
                if (fM73019ck > c14713vw.m72555k4() && fM73019ck - c14713vw.m72555k4() > fM72555k4) {
                    fM72555k4 = fM73019ck - c14713vw.m72555k4();
                }
            }
            if (!m73026k4().m73384dy().isPlotOrderReversed()) {
                ((AbstractC14763x3) this).f49904k4.reverse();
            }
            ((AbstractC14763x3) this).f49907to = f * (-1.0f);
            ((AbstractC14763x3) this).f49900du = fM72555k4;
        }
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: dy */
    public void mo4963dy() {
        m73023jd();
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: k4 */
    public float mo4964k4(double d) {
        double dM73391k4 = m73026k4().m73391k4(((ValueAxisBase) this).f3634jd);
        double dM73391k42 = m73026k4().m73391k4(((ValueAxisBase) this).f3630c5);
        return m73026k4().m73384dy().isPlotOrderReversed() ? m73225wy() - ((float) (((d - dM73391k42) / (dM73391k4 - dM73391k42)) * ((double) m73225wy()))) : (float) (((d - dM73391k42) / (dM73391k4 - dM73391k42)) * ((double) m73225wy()));
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: ks */
    public C12015qq mo4966ks() {
        return m73035rv();
    }

    @Override // com.aspose.slides.ValueAxisBase
    /* JADX INFO: renamed from: m9 */
    public void mo3037m9(C14713vw c14713vw) {
        float fM72555k4 = c14713vw.m72555k4();
        float fM56699x1 = mo3034h4(c14713vw).m56699x1() * (((AbstractC14763x3) this).f49904k4.size() - 1);
        if (m73026k4().m73422wl() && ((AbstractC14763x3) this).f49904k4.size() > 2 && fM56699x1 > fM72555k4) {
            this.f3631ck += 1.0d;
            mo3042wl();
            mo3037m9(c14713vw);
        }
        if (((AbstractC14763x3) this).f49904k4.size() >= 2) {
            Object objM68259m9 = ((AbstractC14763x3) this).f49904k4.get_Item(0).m68259m9();
            Class cls = Double.TYPE;
            ((ValueAxisBase) this).f3630c5 = ((Double) C7019kk.m27464to(objM68259m9, cls)).doubleValue();
            ((ValueAxisBase) this).f3634jd = ((Double) C7019kk.m27464to(((nxm) OooO0O0.OooO00o(((AbstractC14763x3) this).f49904k4, 1)).m68259m9(), cls)).doubleValue();
            if (m73026k4().m73411qq()) {
                m73026k4().m73387h4((m73026k4().m73422wl() ? this.f3631ck : m73026k4().m73418um()) / 10.0d);
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        double dM73391k4 = m73026k4().m73391k4(m3033gi());
        double dM73391k42 = m73026k4().m73391k4(m3039s7());
        for (int i = 0; i < ((AbstractC14763x3) this).f49904k4.size(); i++) {
            nxm nxmVar = ((AbstractC14763x3) this).f49904k4.get_Item(i);
            double dM73391k43 = m73026k4().m73391k4(((Double) C7019kk.m27464to(nxmVar.m68259m9(), Double.TYPE)).doubleValue());
            float fM73225wy = (!m73026k4().m73384dy().isPlotOrderReversed() ? m73225wy() - ((float) (((dM73391k4 - dM73391k43) / (dM73391k4 - dM73391k42)) * ((double) m73225wy()))) : (float) (((dM73391k4 - dM73391k43) / (dM73391k4 - dM73391k42)) * ((double) m73225wy()))) - (nxmVar.m73225wy() / 2.0f);
            nxmVar.m73212h4(m73022ix() == 0 ? m73034ne() : (m73203ak() - m73034ne()) - nxmVar.m73203ak());
            nxmVar.m73208du(fM73225wy);
        }
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73224wp();
        m3032dy(c14713vw);
        if (!m73026k4().m73384dy().isPlotOrderReversed()) {
            ((AbstractC14763x3) this).f49904k4.reverse();
        }
        C12015qq c12015qqClone = mo3034h4(c14713vw).Clone();
        m73217kk(c14713vw.m72555k4());
        m73222to(c12015qqClone.m56697kk() + m73034ne());
        m73027k4(c12015qqClone.Clone());
        mo4962du(c14713vw);
    }
}
