package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.fn */
/* JADX INFO: loaded from: classes3.dex */
class C1113fn extends vfb {
    public C1113fn(C14787xi c14787xi) {
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
        double d2 = ((ValueAxisBase) this).f3634jd;
        double d3 = ((ValueAxisBase) this).f3630c5;
        return (float) (((m73026k4().m73384dy().isPlotOrderReversed() ? d2 - d : d - d3) / (d2 - d3)) * ((double) m73225wy()));
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: ks */
    public C12015qq mo4966ks() {
        return m73035rv();
    }

    @Override // com.aspose.slides.ValueAxisBase
    /* JADX INFO: renamed from: m9 */
    public void mo3037m9(C14713vw c14713vw) {
        float fM72555k4 = (((ChartPlotArea) C7019kk.m27452k4((Object) m73026k4().m73423wy().m69834fa().getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated() ? ((C0974f2) C7019kk.m27452k4((Object) m73228yd().m73228yd(), C0974f2.class)).m5806du(new C14713vw(m73026k4().m73423wy().m69867v4(), m73026k4().m73423wy().m69852lr())).m72555k4() : c14713vw.m72555k4()) / (((AbstractC14763x3) this).f49904k4.size() - 1);
        Object objM68259m9 = ((AbstractC14763x3) this).f49904k4.get_Item(0).m68259m9();
        Class cls = Double.TYPE;
        float f = C14116yg.m67491kk(((Double) C7019kk.m27464to(objM68259m9, cls)).doubleValue(), ((Double) C7019kk.m27464to(((nxm) OooO0O0.OooO00o(((AbstractC14763x3) this).f49904k4, 1)).m68259m9(), cls)).doubleValue()) < 0.0d ? 3.0f : 2.0f;
        float fM56699x1 = m73024k4("0").m56699x1();
        double size = (!ChartTypeCharacterizer.isChartTypeBar(((AbstractC14763x3) this).f49908x1.get_Item(0).m64945h4().getType()) || ((AbstractC14763x3) this).f49904k4.size() >= 6) ? ChartTypeCharacterizer.isChartTypeScatter(((AbstractC14763x3) this).f49908x1.get_Item(0).m64945h4().getType()) ? 6.615d : 7.5d : ((double) ((AbstractC14763x3) this).f49904k4.size()) + 2.0d;
        if (m73026k4().m73422wl() && ((AbstractC14763x3) this).f49904k4.size() > f && ((double) fM56699x1) * size > fM72555k4) {
            double[] dArr = {this.f3631ck};
            C14743wm.m72796k4(dArr[0], dArr, new double[]{0.0d}, m73026k4());
            this.f3631ck = dArr[0] * 10.0d;
            mo3042wl();
            mo3037m9(c14713vw);
        }
        if (((AbstractC14763x3) this).f49904k4.size() >= 2) {
            ((ValueAxisBase) this).f3630c5 = C14116yg.m67491kk(((Double) C7019kk.m27464to(((AbstractC14763x3) this).f49904k4.get_Item(0).m68259m9(), cls)).doubleValue(), ((Double) C7019kk.m27464to(((nxm) OooO0O0.OooO00o(((AbstractC14763x3) this).f49904k4, 1)).m68259m9(), cls)).doubleValue());
            ((ValueAxisBase) this).f3634jd = C14116yg.m67502x1(((Double) C7019kk.m27464to(((AbstractC14763x3) this).f49904k4.get_Item(0).m68259m9(), cls)).doubleValue(), ((Double) C7019kk.m27464to(((nxm) OooO0O0.OooO00o(((AbstractC14763x3) this).f49904k4, 1)).m68259m9(), cls)).doubleValue());
            if (m73026k4().m73411qq()) {
                m73026k4().m73387h4((m73026k4().m73422wl() ? this.f3631ck : m73026k4().m73418um()) / 5.0d);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo3231x1(C14713vw c14713vw) {
        float fM73225wy;
        float fM73225wy2;
        for (int i = 0; i < ((AbstractC14763x3) this).f49904k4.size(); i++) {
            nxm nxmVar = ((AbstractC14763x3) this).f49904k4.get_Item(i);
            float fMo4964k4 = mo4964k4(((Double) C7019kk.m27464to(nxmVar.m68259m9(), Double.TYPE)).doubleValue());
            if (m73026k4().m73386h4() == 0 || m73026k4().m73386h4() % 90 == 0) {
                fM73225wy = nxmVar.m73225wy() / 2.0f;
            } else if (m73026k4().m73386h4() >= 0 ? !m73021fa().m73026k4().m73384dy().isPlotOrderReversed() : m73021fa().m73026k4().m73384dy().isPlotOrderReversed()) {
                fM73225wy2 = (fMo4964k4 - nxmVar.m73225wy()) + m73019ck();
                nxmVar.m73208du(fM73225wy2);
                nxmVar.m73212h4(m73022ix() != 0 ? m73034ne() : (m73203ak() - m73034ne()) - nxmVar.m73203ak());
            } else {
                fM73225wy = m73019ck();
            }
            fM73225wy2 = fMo4964k4 - fM73225wy;
            nxmVar.m73208du(fM73225wy2);
            nxmVar.m73212h4(m73022ix() != 0 ? m73034ne() : (m73203ak() - m73034ne()) - nxmVar.m73203ak());
        }
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73224wp();
        m73033m9();
        m73217kk(c14713vw.m72555k4());
        m3032dy(c14713vw);
        m72210ar();
        if (!m73026k4().m73384dy().isPlotOrderReversed()) {
            ((AbstractC14763x3) this).f49904k4.reverse();
        }
        C12015qq c12015qqClone = mo3034h4(c14713vw).Clone();
        m73222to(c12015qqClone.m56697kk() + m73034ne());
        m73027k4(c12015qqClone.Clone());
        mo4962du(c14713vw);
    }
}
