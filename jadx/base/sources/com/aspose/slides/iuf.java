package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12015qq;

/* JADX INFO: loaded from: classes3.dex */
class iuf extends k8h {
    public iuf(C14787xi c14787xi) {
        super(c14787xi);
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: du */
    public void mo4962du(C14713vw c14713vw) {
        double dM73391k4 = m73026k4().m73391k4(((ValueAxisBase) this).f3634jd);
        double dM73391k42 = m73026k4().m73391k4(((ValueAxisBase) this).f3630c5);
        for (int i = 0; i < ((AbstractC14763x3) this).f49904k4.size(); i++) {
            if (((AbstractC14763x3) this).f49904k4.get_Item(i).mo3221T_()) {
                double dM73391k43 = m73026k4().m73391k4(((Double) C7019kk.m27464to(((AbstractC14763x3) this).f49904k4.get_Item(i).m68259m9(), Double.TYPE)).doubleValue());
                double dM73203ak = ((AbstractC14763x3) this).f49904k4.get_Item(i).m73203ak();
                double dM73203ak2 = m73026k4().m73384dy().isPlotOrderReversed() ? m73203ak() - ((float) (((dM73391k4 - dM73391k43) / (dM73391k4 - dM73391k42)) * ((double) m73203ak()))) : (float) (((dM73391k4 - dM73391k43) / (dM73391k4 - dM73391k42)) * ((double) m73203ak()));
                double d = dM73203ak / 2.0d;
                double d2 = dM73203ak2 - d;
                if (d2 < 0.0d && (-1.0d) * d2 > ((AbstractC14763x3) this).f49900du) {
                    ((AbstractC14763x3) this).f49900du = ((float) d2) * (-1.0f);
                }
                double d3 = dM73203ak2 + d;
                if (d3 > m73203ak() && d3 - ((double) m73203ak()) > ((AbstractC14763x3) this).f49907to) {
                    ((AbstractC14763x3) this).f49907to = (float) (d3 - ((double) m73203ak()));
                }
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: dy */
    public void mo4963dy() {
        m73018c5();
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: k4 */
    public float mo4964k4(double d) {
        double dM73391k4 = m73026k4().m73391k4(((ValueAxisBase) this).f3634jd);
        double dM73391k42 = m73026k4().m73391k4(((ValueAxisBase) this).f3630c5);
        return m73026k4().m73384dy().isPlotOrderReversed() ? (float) (((d - dM73391k42) / (dM73391k4 - dM73391k42)) * ((double) m73203ak())) : m73203ak() - ((float) (((d - dM73391k42) / (dM73391k4 - dM73391k42)) * ((double) m73203ak())));
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: ks */
    public C12015qq mo4966ks() {
        return m73038x6();
    }

    @Override // com.aspose.slides.ValueAxisBase
    /* JADX INFO: renamed from: m9 */
    public void mo3037m9(C14713vw c14713vw) {
        float fM72556x1 = c14713vw.m72556x1();
        float fM56697kk = mo3034h4(c14713vw).m56697kk() * (((AbstractC14763x3) this).f49904k4.size() - 1);
        if (m73026k4().m73422wl() && ((AbstractC14763x3) this).f49904k4.size() > 2 && fM56697kk > fM72556x1) {
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
            float fM73203ak = (m73026k4().m73384dy().isPlotOrderReversed() ? m73203ak() - ((float) (((dM73391k4 - dM73391k43) / (dM73391k4 - dM73391k42)) * ((double) m73203ak()))) : (float) (((dM73391k4 - dM73391k43) / (dM73391k4 - dM73391k42)) * ((double) m73203ak()))) - (nxmVar.m73203ak() / 2.0f);
            nxmVar.m73208du(m73022ix() == 1 ? (m73225wy() - m73034ne()) - nxmVar.m73225wy() : m73034ne());
            nxmVar.m73212h4(fM73203ak);
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
        if (m73026k4().m73384dy().isPlotOrderReversed()) {
            ((AbstractC14763x3) this).f49904k4.reverse();
        }
        C12015qq c12015qqClone = mo3034h4(c14713vw).Clone();
        m73217kk(c12015qqClone.m56699x1() + m73034ne());
        m73222to(c14713vw.m72556x1());
        m73027k4(c12015qqClone.Clone());
        mo4962du(c14713vw);
    }
}
