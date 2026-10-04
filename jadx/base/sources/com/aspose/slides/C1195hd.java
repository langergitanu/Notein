package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.hd */
/* JADX INFO: loaded from: classes3.dex */
class C1195hd extends AbstractC14464sp {
    public C1195hd(C14787xi c14787xi) {
        super(c14787xi);
    }

    /* JADX INFO: renamed from: bv */
    private float m7096bv() {
        return (float) (((double) m73026k4().m73425x1().m56650up()) / C14116yg.m67495m9((((double) C14116yg.m67482k4(m73026k4().m73386h4())) * 3.141592653589793d) / 180.0d));
    }

    /* JADX INFO: renamed from: ks */
    private float m7097ks(C14713vw c14713vw) {
        return (m73026k4().m73386h4() == 0 || m73026k4().m73386h4() % 180 == 0) ? m7102yj(c14713vw) : m73026k4().m73386h4() % 90 == 0 ? mo3034h4(c14713vw).m56699x1() * 1.3f : m7096bv();
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: du */
    public void mo4962du(C14713vw c14713vw) {
        float fMo4964k4;
        float fMo4964k42;
        float fM73019ck;
        float fM73019ck2;
        ((AbstractC14763x3) this).f49907to = 0.0f;
        ((AbstractC14763x3) this).f49900du = 0.0f;
        if (mo3221T_()) {
            float fM7099um = m7099um();
            nxm nxmVar = ((AbstractC14763x3) this).f49904k4.get_Item(0);
            nxm nxmVar2 = (nxm) OooO0O0.OooO00o(((AbstractC14763x3) this).f49904k4, 1);
            if (m73026k4().m73384dy().getAxisBetweenCategories()) {
                fMo4964k4 = (fM7099um / 2.0f) + mo4964k4(((Integer) nxmVar.m68250dy()).intValue());
            } else {
                fMo4964k4 = mo4964k4(((Integer) nxmVar.m68250dy()).intValue());
            }
            if (m73026k4().m73384dy().getAxisBetweenCategories()) {
                fMo4964k42 = (fM7099um / 2.0f) + mo4964k4(((Integer) nxmVar2.m68250dy()).intValue());
            } else {
                fMo4964k42 = mo4964k4(((Integer) nxmVar2.m68250dy()).intValue());
            }
            if (m73026k4().m73386h4() == 0) {
                fM73019ck = fMo4964k4 - (nxmVar.m73225wy() / 2.0f);
                fM73019ck2 = (nxmVar2.m73225wy() / 2.0f) + fMo4964k42;
            } else if (m73026k4().m73386h4() % 90 == 0) {
                fM73019ck2 = 0.0f;
                fM73019ck = 0.0f;
            } else {
                float fM67480k4 = C14116yg.m67480k4((m73026k4().m73386h4() / 90.0f) * m73026k4().m73400kk().m56638du());
                if (m73026k4().m73386h4() > 0) {
                    float fM73019ck3 = (fMo4964k4 + m73019ck()) - nxmVar.m73225wy();
                    fM73019ck2 = fMo4964k42 + m73019ck() + fM67480k4;
                    fM73019ck = fM73019ck3 + fM67480k4;
                } else {
                    fM73019ck = ((m73019ck() * (-1.0f)) + fMo4964k4) - fM67480k4;
                    fM73019ck2 = ((fMo4964k42 - m73019ck()) + nxmVar2.m73225wy()) - fM67480k4;
                }
            }
            if (fM73019ck < 0.0f) {
                ((AbstractC14763x3) this).f49907to = fM73019ck * (-1.0f);
            }
            if (fM73019ck2 > c14713vw.m72555k4()) {
                ((AbstractC14763x3) this).f49900du = fM73019ck2 - c14713vw.m72555k4();
            }
            if (ChartTypeCharacterizer.isChartTypeArea(m73026k4().m73384dy().getChart().getType()) && m73026k4().m73386h4() == 0 && ((ChartPlotArea) C7019kk.m27452k4((Object) m73026k4().m73423wy().m69834fa().getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated()) {
                ((AbstractC14763x3) this).f49900du = ((AbstractC14763x3) this).f49907to;
            }
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
        int iM27462to = C7019kk.m27462to(Double.valueOf(m73026k4().m73410ne()), 14);
        int iM70708k4 = m70708k4(m73026k4().m73384dy().getBaseUnitScale());
        int iM4455k4 = C0841c4.m4455k4(m73026k4().m73384dy().getBaseUnitScale(), C7019kk.m27462to(Double.valueOf(d), 14), iM27462to, C7019kk.m27462to(Double.valueOf(m73026k4().m73389ix()), 14), false);
        return m73026k4().m73384dy().isPlotOrderReversed() ? m73225wy() - ((iM4455k4 / iM70708k4) * m73225wy()) : (iM4455k4 / iM70708k4) * m73225wy();
    }

    /* JADX INFO: renamed from: kk */
    public final void m7098kk(C14713vw c14713vw, int i) {
        C14713vw c14713vw2 = new C14713vw(m73026k4().m73423wy().m69867v4(), m73026k4().m73423wy().m69852lr());
        float fMo4964k4 = mo4964k4(C0841c4.m4487x1(m73026k4().m73384dy().getBaseUnitScale(), m73026k4().m73417u4(), C7019kk.m27462to(Double.valueOf(m73026k4().m73418um()), 14), r1, false)) - mo4964k4(C7019kk.m27462to(Double.valueOf(m73026k4().m73410ne()), 14));
        float fM7097ks = m7097ks(c14713vw2);
        if (!m73026k4().m73422wl() || !m73026k4().m73411qq()) {
            if (!m73026k4().m73422wl() && m73026k4().m73411qq()) {
                m73026k4().m73387h4(C22208OooOo0.OooO00o(m73026k4().m73418um(), 2.0d, 14) == 0 ? 1.0d : C22208OooOo0.OooO00o(m73026k4().m73418um(), 2.0d, 14));
                m73026k4().m73382du(m73026k4().m73417u4());
                return;
            }
            if (!m73026k4().m73422wl() || m73026k4().m73411qq() || fM7097ks <= fMo4964k4) {
                return;
            }
            int iM70708k4 = m70708k4(m73026k4().m73384dy().getMinorUnitScale());
            int iM27462to = C7019kk.m27462to(Float.valueOf(c14713vw.m72555k4() / fM7097ks), 13);
            int i2 = iM70708k4 % iM27462to;
            int i3 = iM70708k4 / iM27462to;
            if (i2 != 0) {
                i3++;
            }
            m70714x1(i3);
            m73026k4().m73416to(false);
            return;
        }
        if ((m73026k4().m73386h4() == 0 || m73026k4().m73386h4() % 180 == 0) && fM7097ks > 0.85f * fMo4964k4) {
            int[] iArr = {i};
            m70709k4(iArr);
            m7098kk(c14713vw, iArr[0]);
        } else if (m73026k4().m73386h4() % 90 == 0 && fM7097ks > fMo4964k4) {
            int[] iArr2 = {i};
            m70709k4(iArr2);
            m7098kk(c14713vw, iArr2[0]);
        } else if (((double) fM7097ks) * 0.885d > fMo4964k4) {
            int[] iArr3 = {i};
            m70709k4(iArr3);
            m7098kk(c14713vw, iArr3[0]);
        }
    }

    /* JADX INFO: renamed from: um */
    public final float m7099um() {
        return m73225wy() / m70708k4(m73026k4().m73384dy().getBaseUnitScale());
    }

    /* JADX INFO: renamed from: up */
    public final void m7100up(C14713vw c14713vw) {
        if (!m73026k4().m73384dy().isVisible() || m73026k4().m73384dy().getTickLabelPosition() == 3) {
            return;
        }
        if (m73026k4().m73377c5()) {
            m7101x1(c14713vw, m73026k4().m73384dy().getBaseUnitScale());
        } else {
            m7098kk(c14713vw, m73026k4().m73384dy().getBaseUnitScale());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo3231x1(C14713vw c14713vw) {
        float fM73225wy;
        float fM73225wy2;
        float fM7099um = m7099um();
        for (int i = 0; i < ((AbstractC14763x3) this).f49904k4.size(); i++) {
            nxm nxmVar = ((AbstractC14763x3) this).f49904k4.get_Item(i);
            float fMo4964k4 = m73026k4().m73384dy().getAxisBetweenCategories() ? (fM7099um / 2.0f) + mo4964k4(((Integer) nxmVar.m68250dy()).intValue()) : mo4964k4(((Integer) nxmVar.m68250dy()).intValue());
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

    /* JADX INFO: renamed from: yj */
    public final float m7102yj(C14713vw c14713vw) {
        nxm nxmVarM73025k4 = m73025k4(Double.valueOf(m73026k4().m73410ne()));
        float fM56699x1 = nxmVarM73025k4.m68249du(c14713vw).m56699x1();
        m73028k4(nxmVarM73025k4);
        return fM56699x1;
    }

    @Override // com.aspose.slides.AbstractC14464sp
    /* JADX INFO: renamed from: k4 */
    public C14713vw mo5811k4(C14713vw c14713vw, int i) {
        return new C14713vw((float) (((double) c14713vw.m72555k4()) / ((double) i)), c14713vw.m72556x1() - m73034ne());
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: ks */
    public C12015qq mo4966ks() {
        return m73035rv();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m7101x1(C14713vw c14713vw, int i) {
        float fM72555k4 = mo5811k4(c14713vw, m70713wl()).m72555k4();
        float fM7097ks = m7097ks(new C14713vw(m73026k4().m73423wy().m69867v4(), m73026k4().m73423wy().m69852lr()));
        if (m73026k4().m73386h4() == 0 || m73026k4().m73386h4() % 180 == 0) {
            if (((double) fM7097ks) * 1.2d <= fM72555k4) {
                return;
            } else {
                m73026k4().m73394k4(45);
            }
        } else if (m73026k4().m73386h4() % 90 == 0) {
            if (m73026k4().m73425x1().m56638du() <= fM72555k4 * 1.14f) {
                return;
            }
            if (m73026k4().m73384dy().isAutomaticMajorUnit() && m73026k4().m73384dy().isAutomaticMinorUnit()) {
                int[] iArr = {i};
                m70709k4(iArr);
                i = iArr[0];
            } else {
                if (!m73026k4().m73384dy().isAutomaticMajorUnit() || m73026k4().m73384dy().isAutomaticMinorUnit()) {
                    return;
                }
                int iM70713wl = m70713wl();
                int iM27462to = C7019kk.m27462to(Float.valueOf(c14713vw.m72555k4() / fM7097ks), 13);
                int i2 = iM70713wl % iM27462to;
                int i3 = iM70713wl / iM27462to;
                if (i2 != 0) {
                    i3++;
                }
                m70710kk(i3);
            }
            m73026k4().m73394k4(0);
        } else if (((double) fM7097ks) * 0.885d <= fM72555k4) {
            return;
        } else {
            m73026k4().m73394k4(90);
        }
        m7101x1(c14713vw, i);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73217kk(c14713vw.m72555k4());
        m73224wp();
        if (c14713vw.m72555k4() == 0.0f || c14713vw.m72556x1() == 0.0f) {
            return;
        }
        m70705ck(c14713vw);
        m73033m9();
        m7100up(c14713vw);
        m70711m9(c14713vw);
        C12015qq c12015qqClone = m70706dy(new C14713vw(c14713vw.m72555k4() / ((AbstractC14763x3) this).f49904k4.size(), c14713vw.m72556x1())).Clone();
        m73222to(c12015qqClone.m56697kk() + m73034ne());
        m73027k4(c12015qqClone.Clone());
        mo4962du(c14713vw);
    }
}
