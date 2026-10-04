package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class tsh extends vfb {
    public tsh(C14787xi c14787xi) {
        super(c14787xi);
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: du */
    public void mo4962du(C14713vw c14713vw) {
        Object objOooO00o;
        float f;
        float fM73203ak;
        Object objOooO00o2;
        Object objOooO00o3;
        if (mo3221T_()) {
            if (m73026k4().m73386h4() == 0 || m73026k4().m73386h4() % 90 == 0) {
                if (m73026k4().m73384dy().isPlotOrderReversed()) {
                    ((AbstractC14763x3) this).f49907to = ((AbstractC14763x3) this).f49904k4.get_Item(0).m73203ak() / 2.0f;
                    objOooO00o = OooO0O0.OooO00o(((AbstractC14763x3) this).f49904k4, 1);
                } else {
                    ((AbstractC14763x3) this).f49907to = ((nxm) OooO0O0.OooO00o(((AbstractC14763x3) this).f49904k4, 1)).m73203ak() / 2.0f;
                    objOooO00o = ((AbstractC14763x3) this).f49904k4.get_Item(0);
                }
                ((AbstractC14763x3) this).f49900du = ((nxm) objOooO00o).m73203ak() / 2.0f;
            } else {
                int iM73386h4 = m73026k4().m73386h4();
                m73026k4().m73394k4(90);
                if (m73026k4().m73384dy().isPlotOrderReversed()) {
                    fM73203ak = ((AbstractC14763x3) this).f49904k4.get_Item(0).m73203ak() / 2.0f;
                    objOooO00o2 = OooO0O0.OooO00o(((AbstractC14763x3) this).f49904k4, 1);
                } else {
                    fM73203ak = ((nxm) OooO0O0.OooO00o(((AbstractC14763x3) this).f49904k4, 1)).m73203ak() / 2.0f;
                    objOooO00o2 = ((AbstractC14763x3) this).f49904k4.get_Item(0);
                }
                float fM73203ak2 = ((nxm) objOooO00o2).m73203ak() / 2.0f;
                m73026k4().m73394k4(iM73386h4);
                if (m73026k4().m73384dy().isPlotOrderReversed()) {
                    ((AbstractC14763x3) this).f49907to = ((AbstractC14763x3) this).f49904k4.get_Item(0).m73203ak() / 2.0f;
                    objOooO00o3 = OooO0O0.OooO00o(((AbstractC14763x3) this).f49904k4, 1);
                } else {
                    ((AbstractC14763x3) this).f49907to = ((nxm) OooO0O0.OooO00o(((AbstractC14763x3) this).f49904k4, 1)).m73203ak() / 2.0f;
                    objOooO00o3 = ((AbstractC14763x3) this).f49904k4.get_Item(0);
                }
                ((AbstractC14763x3) this).f49900du = ((nxm) objOooO00o3).m73203ak() / 2.0f;
                if (((AbstractC14763x3) this).f49907to > fM73203ak) {
                    ((AbstractC14763x3) this).f49907to = fM73203ak;
                }
                if (((AbstractC14763x3) this).f49900du > fM73203ak2) {
                    ((AbstractC14763x3) this).f49900du = fM73203ak2;
                }
            }
            if (((ChartPlotArea) C7019kk.m27452k4((Object) m73026k4().m73423wy().m69834fa().getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated()) {
                float f2 = ((AbstractC14763x3) this).f49900du;
                float f3 = 0.0f;
                if (f2 >= 8.0f) {
                    f = f2 - 8.0f;
                    ((AbstractC14763x3) this).f49900du = f;
                } else {
                    f = 0.0f;
                }
                ((AbstractC14763x3) this).f49900du = f;
                float f4 = ((AbstractC14763x3) this).f49907to;
                if (f4 >= 8.0f) {
                    f3 = f4 - 8.0f;
                    ((AbstractC14763x3) this).f49907to = f3;
                }
                ((AbstractC14763x3) this).f49907to = f3;
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
        double d2 = ((ValueAxisBase) this).f3634jd;
        double d3 = ((ValueAxisBase) this).f3630c5;
        return (float) (((!m73026k4().m73384dy().isPlotOrderReversed() ? d2 - d : d - d3) / (d2 - d3)) * ((double) m73203ak()));
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: ks */
    public C12015qq mo4966ks() {
        return m73038x6();
    }

    @Override // com.aspose.slides.ValueAxisBase
    /* JADX INFO: renamed from: m9 */
    public void mo3037m9(C14713vw c14713vw) {
        float fM67504x1;
        float f;
        mxy mxyVarM5806du = ((C0974f2) C7019kk.m27452k4((Object) m73228yd().m73228yd(), C0974f2.class)).m5806du(new C14713vw(m73026k4().m73423wy().m69867v4(), m73026k4().m73423wy().m69852lr()));
        boolean zIsLocationAutocalculated = ((ChartPlotArea) C7019kk.m27452k4((Object) m73026k4().m73423wy().m69834fa().getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated();
        double dM72556x1 = mxyVarM5806du.m72556x1() + 2.0f;
        if (!zIsLocationAutocalculated && m73026k4().m73423wy().m69834fa().getPlotArea().getLayoutTargetType() == 1) {
            dM72556x1 = m73026k4().m73423wy().m69834fa().getHeight();
        }
        if (ChartTypeCharacterizer.isChartTypeRadar(((AbstractC14763x3) this).f49908x1.get_Item(0).m64945h4().getType())) {
            if (zIsLocationAutocalculated) {
                fM67504x1 = C14116yg.m67504x1(mxyVarM5806du.m72555k4(), mxyVarM5806du.m72556x1());
                f = 0.6f;
            } else {
                mxy mxyVarM5808kk = ((C0974f2) C7019kk.m27452k4((Object) m73228yd().m73228yd(), C0974f2.class)).m5808kk(c14713vw);
                fM67504x1 = C14116yg.m67504x1(mxyVarM5808kk.m72555k4(), mxyVarM5808kk.m72556x1());
                f = 0.5f;
            }
            dM72556x1 = fM67504x1 * f;
        }
        float fM56639dy = (m73026k4().m73425x1().m56639dy() * m73026k4().m73425x1().m56651x1().m56526du(0)) / m73026k4().m73425x1().m56651x1().m56535to(0);
        double size = (((AbstractC14763x3) this).f49904k4.size() + 1) * fM56639dy;
        int i = 11;
        if (m73026k4().m73384dy().isAutomaticMaxValue() && m73026k4().m73384dy().isAutomaticMinValue() && ((ValueAxisBase) this).f3630c5 < 0.0d && ((ValueAxisBase) this).f3634jd > 0.0d && ((AbstractC14763x3) this).f49904k4.size() == 11) {
            size = ((AbstractC14763x3) this).f49904k4.size() * fM56639dy;
        }
        if (((ValueAxisBase) this).f3630c5 < 0.0d && ((ValueAxisBase) this).f3634jd > 0.0d) {
            i = 12;
        }
        if (m3031bv()) {
            size *= 0.550000011920929d;
            i = 21;
        }
        Class cls = Double.TYPE;
        if ((size > dM72556x1 || ((AbstractC14763x3) this).f49904k4.size() > i) && m73026k4().m73422wl() && ((AbstractC14763x3) this).f49904k4.size() > 2 && (((AbstractC14763x3) this).f49904k4.size() != 3 || ((Double) C7019kk.m27464to(((AbstractC14763x3) this).f49904k4.get_Item(0).m68259m9(), cls)).doubleValue() <= 0.0d || ((Double) C7019kk.m27464to(((AbstractC14763x3) this).f49904k4.get_Item(2).m68259m9(), cls)).doubleValue() >= 0.0d)) {
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

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        for (int i = 0; i < ((AbstractC14763x3) this).f49904k4.size(); i++) {
            nxm nxmVar = ((AbstractC14763x3) this).f49904k4.get_Item(i);
            float fMo4964k4 = mo4964k4(((Double) C7019kk.m27464to(nxmVar.m68259m9(), Double.TYPE)).doubleValue()) - (nxmVar.m73203ak() / 2.0f);
            nxmVar.m73208du(m73022ix() == 1 ? (m73225wy() - m73034ne()) - nxmVar.m73225wy() : m73034ne());
            nxmVar.m73212h4(fMo4964k4);
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
        m72210ar();
        C12015qq c12015qqClone = mo3034h4(c14713vw).Clone();
        m73217kk(c12015qqClone.m56699x1() + m73034ne());
        m73222to(c14713vw.m72556x1());
        m73027k4(c12015qqClone.Clone());
        mo4962du(c14713vw);
    }
}
