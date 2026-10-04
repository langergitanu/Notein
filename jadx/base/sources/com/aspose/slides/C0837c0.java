package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p431ty.C11241kk;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.c0 */
/* JADX INFO: loaded from: classes3.dex */
class C0837c0 extends AbstractC14353qn {

    /* JADX INFO: renamed from: x1 */
    private final float f4266x1;

    public C0837c0(C14237oh c14237oh, C0974f2 c0974f2) {
        super(c14237oh, c0974f2);
        this.f4266x1 = 1.5f;
    }

    /* JADX INFO: renamed from: dy */
    private boolean m4402dy() {
        AbstractC14763x3 abstractC14763x3M69706k4 = m69706k4();
        if (abstractC14763x3M69706k4 == null) {
            abstractC14763x3M69706k4 = m69708kk();
        }
        vfb vfbVar = (vfb) C7019kk.m27452k4((Object) abstractC14763x3M69706k4, vfb.class);
        if (vfbVar == null || vfbVar.m73026k4().m73384dy().isLogarithmic()) {
            return false;
        }
        int iM67472h4 = C14116yg.m67472h4(vfbVar.m3039s7());
        int iM67472h42 = C14116yg.m67472h4(vfbVar.m3033gi());
        return (iM67472h4 == 0 || iM67472h42 == 0 || iM67472h4 == iM67472h42) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    private float m4403k4(float f) {
        float f2;
        if (m69711x1() == null || m69711x1().m73036to() != 0) {
            return 0.0f;
        }
        float fM56697kk = m69711x1().mo4966ks().m56697kk();
        if (C7019kk.m27469x1(m69711x1(), C13785ll.class)) {
            fM56697kk -= ((C13785ll) m69711x1()).f46037dy;
        }
        if (f > fM56697kk) {
            return 0.0f;
        }
        int tickLabelPosition = m69711x1().m73026k4().m73384dy().getTickLabelPosition();
        if ((tickLabelPosition == 1 || tickLabelPosition == 0) && m4402dy()) {
            return 0.0f;
        }
        float fM4405k4 = m4405k4(m69711x1(), f);
        if (fM4405k4 > 75.0f) {
            return 1.5f;
        }
        if (fM4405k4 == 0.0f) {
            fM4405k4 = m69711x1().m73037x1("X").m56697kk() + m69711x1().m73034ne();
            f2 = C7019kk.m27469x1(m69711x1(), AbstractC14265p3.class) ? 7.0f : 10.0f;
        } else {
            f2 = 25.0f;
        }
        return (float) C11241kk.m54224k4(f - fM4405k4, 1.5d, f2);
    }

    /* JADX INFO: renamed from: x1 */
    private void m4410x1(C12025x6[] c12025x6Arr, C12015qq[] c12015qqArr) {
        if (this.f48362k4) {
            ChartPlotArea chartPlotArea = (ChartPlotArea) m69704du().getPlotArea();
            float fM4404k4 = m4404k4(1);
            if (chartPlotArea.getLayoutTargetType() == 0 && C7019kk.m27469x1(m69711x1(), C13785ll.class) && fM4404k4 < c12025x6Arr[0].m56897x1()) {
                if (c12015qqArr[0].m56699x1() + c12025x6Arr[0].m56897x1() >= m69704du().getWidth()) {
                    C12015qq c12015qq = c12015qqArr[0];
                    c12015qq.m56695k4((c12025x6Arr[0].m56897x1() - fM4404k4) + c12015qq.m56699x1());
                    c12025x6Arr[0].m56891k4(fM4404k4);
                }
            }
            float fM56897x1 = c12025x6Arr[0].m56897x1();
            float fM68556k4 = m69709m9().m68556k4(3);
            float fM68556k42 = m69709m9().m68556k4(0);
            float fM4404k42 = m4404k4(2);
            boolean z = m69704du().getWidth() - (c12015qqArr[0].m56699x1() + fM4404k4) > 0.0f;
            boolean z2 = fM4404k4 > fM56897x1;
            m69707k4(c12025x6Arr, c12015qqArr, fM4404k4, fM4404k42, fM68556k4, fM68556k42);
            if (m69709m9().m68549ck() != null && z && z2) {
                C12015qq c12015qq2 = c12015qqArr[0];
                c12015qq2.m56695k4(c12015qq2.m56699x1() - (m69709m9().m68549ck().m5615dy() - fM56897x1));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private float m4404k4(int i) {
        float fM68558kk = m69709m9().m68558kk(i);
        if (fM68558kk > 0.0f) {
            fM68558kk += 1.5f;
        }
        float fM68556k4 = m69709m9().m68556k4(i);
        if (fM68556k4 > 0.0f) {
            fM68556k4 += m69705h4().f4955k4;
        }
        float fM67481k4 = C14116yg.m67481k4(fM68558kk, fM68556k4);
        return (i != 1 || m69709m9().m68549ck() == null) ? fM67481k4 : C14116yg.m67481k4(m69709m9().m68549ck().m5615dy() + 12.0f, fM67481k4);
    }

    /* JADX INFO: renamed from: k4 */
    private float m4405k4(AbstractC14763x3 abstractC14763x3, float f) {
        float f2 = 0.0f;
        for (int i = 0; i < abstractC14763x3.f49904k4.size(); i++) {
            nxm nxmVar = abstractC14763x3.f49904k4.get_Item(i);
            if (nxmVar.m73203ak() >= 1.0E-6d) {
                float fM73203ak = nxmVar.m73203ak() + abstractC14763x3.m73034ne();
                if (m69705h4().f4955k4 + fM73203ak <= f && f2 < fM73203ak) {
                    f2 = fM73203ak;
                }
            }
        }
        return f2;
    }

    /* JADX INFO: renamed from: k4 */
    private void m4406k4(C12025x6 c12025x6, C12015qq c12015qq) {
        C12025x6 c12025x6Clone = c12025x6.Clone();
        C12015qq c12015qqClone = c12015qq.Clone();
        C12025x6[] c12025x6Arr = {c12025x6};
        C12015qq[] c12015qqArr = {c12015qq};
        m69705h4().m5807k4(m69704du().getPlotArea(), c12025x6Arr, c12015qqArr);
        c12025x6Arr[0].CloneTo(c12025x6);
        c12015qqArr[0].CloneTo(c12015qq);
        if (m69711x1() != null) {
            m69711x1().m73210fa(new C14713vw(c12015qq.m56699x1(), (m69704du().getHeight() - c12025x6.m56895kk()) / 2.0f));
        }
        if (m69710to() != null) {
            m69710to().m73210fa(new C14713vw(c12015qq.m56699x1(), m69704du().getHeight() / 2.0f));
        }
        float fM73203ak = m69709m9().m68549ck() == null ? 0.0f : m69709m9().m68549ck().m73203ak();
        if (m69709m9().m68558kk(3) > c12025x6Clone.m56895kk() || m69709m9().m68558kk(0) + fM73203ak > m69704du().getHeight() - (c12015qqClone.m56697kk() + c12025x6Clone.m56895kk())) {
            c12025x6Arr[0] = c12025x6;
            c12015qqArr[0] = c12015qq;
            m69705h4().m5807k4(m69704du().getPlotArea(), c12025x6Arr, c12015qqArr);
            c12025x6Arr[0].CloneTo(c12025x6);
            c12015qqArr[0].CloneTo(c12015qq);
            if (m69706k4() != null) {
                m69706k4().m73210fa(new C14713vw(m69704du().getWidth(), c12015qq.m56697kk()));
            }
            if (m69708kk() != null) {
                m69708kk().m73210fa(new C14713vw(m69704du().getWidth(), c12015qq.m56697kk()));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m4407k4(C12025x6 c12025x6, C12015qq c12015qq, C14713vw c14713vw) {
        C12025x6 c12025x6Clone = c12025x6.Clone();
        C12015qq c12015qqClone = c12015qq.Clone();
        float fM56895kk = c12025x6Clone.m56895kk();
        float height = m69704du().getHeight() - (c12015qqClone.m56697kk() + c12025x6Clone.m56895kk());
        if (m69711x1() != null) {
            float fM73034ne = m69711x1().m73034ne();
            if (m69711x1().m73036to() == 3 && m69711x1().mo4966ks().m56697kk() > fM56895kk) {
                m69711x1().m73210fa(fM56895kk < fM73034ne ? new C14713vw(c12015qqClone.m56699x1(), c14713vw.m72556x1() / 2.0f) : new C14713vw(c12015qqClone.m56699x1(), fM56895kk));
            }
            if (m69711x1().m73036to() == 0 && m69711x1().mo4966ks().m56697kk() > height) {
                m69711x1().m73210fa(height < fM73034ne ? new C14713vw(c12015qqClone.m56699x1(), c14713vw.m72556x1() / 2.0f) : new C14713vw(c12015qqClone.m56699x1(), height));
            }
        }
        if (m69710to() != null) {
            float fM56638du = m69710to().m73026k4().m73425x1().m56638du();
            if (m69710to().m73036to() == 3 && m69710to().mo4966ks().m56697kk() > fM56895kk) {
                m69710to().m73210fa(fM56895kk < fM56638du ? new C14713vw(c12015qqClone.m56699x1(), c14713vw.m72556x1() / 2.0f) : new C14713vw(c12015qqClone.m56699x1(), fM56895kk));
            }
            if (m69710to().m73036to() != 0 || m69710to().mo4966ks().m56697kk() <= height) {
                return;
            }
            m69710to().m73210fa(height < fM56638du ? new C14713vw(c12015qqClone.m56699x1(), c14713vw.m72556x1() / 2.0f) : new C14713vw(c12015qqClone.m56699x1(), height));
        }
    }

    @Override // com.aspose.slides.AbstractC14353qn
    /* JADX INFO: renamed from: k4 */
    public void mo3141k4(C14713vw c14713vw) {
        C12025x6 c12025x6 = new C12025x6();
        C12015qq c12015qq = new C12015qq();
        C12025x6[] c12025x6Arr = {c12025x6};
        C12015qq[] c12015qqArr = {c12015qq};
        m69705h4().m5807k4(m69704du().getPlotArea(), c12025x6Arr, c12015qqArr);
        c12025x6Arr[0].CloneTo(c12025x6);
        c12015qqArr[0].CloneTo(c12015qq);
        m4408k4(c14713vw, c12015qq.Clone());
        boolean zM4409k4 = m4409k4(c12015qq.Clone(), c12025x6.Clone(), c14713vw);
        this.f48362k4 = !zM4409k4;
        if (zM4409k4) {
            m4407k4(c12025x6.Clone(), c12015qq.Clone(), c14713vw);
        } else {
            m4406k4(c12025x6.Clone(), c12015qq.Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m4408k4(C14713vw c14713vw, C12015qq c12015qq) {
        C14713vw c14713vw2 = new C14713vw(c14713vw.m72555k4() / 2.0f, c12015qq.m56697kk());
        if (m69706k4() != null) {
            m69706k4().m73210fa(c14713vw2);
        }
        if (m69708kk() != null) {
            m69708kk().m73210fa(c14713vw2);
        }
        C14713vw c14713vw3 = new C14713vw(c12015qq.m56699x1(), m69704du().getHeight() / 2.0f);
        if (m69711x1() != null) {
            m69711x1().m73210fa(c14713vw3);
        }
        if (m69710to() != null) {
            m69710to().m73210fa(c14713vw3);
        }
    }

    @Override // com.aspose.slides.AbstractC14353qn
    /* JADX INFO: renamed from: k4 */
    public void mo3142k4(C12025x6[] c12025x6Arr, C12015qq[] c12015qqArr) {
        if (!this.f48362k4) {
            if (m69709m9().m68549ck() == null || !C7019kk.m27469x1(m69709m9().m68549ck().m5614c5(), C1195hd.class)) {
                return;
            }
            float fM73203ak = m69709m9().m68549ck().m73203ak() + 5.0f;
            if (fM73203ak > m69704du().getHeight() - (c12015qqArr[0].m56697kk() + c12025x6Arr[0].m56895kk())) {
                C12015qq c12015qq = c12015qqArr[0];
                c12015qq.m56700x1(c12015qq.m56697kk() - (((c12015qqArr[0].m56697kk() + c12025x6Arr[0].m56895kk()) + fM73203ak) - m69704du().getHeight()));
                return;
            }
            return;
        }
        m4410x1(c12025x6Arr, c12015qqArr);
        float fM68558kk = m69709m9().m68558kk(3);
        if (fM68558kk > c12025x6Arr[0].m56895kk()) {
            C12015qq c12015qq2 = c12015qqArr[0];
            c12015qq2.m56700x1(c12015qq2.m56697kk() - (fM68558kk - c12025x6Arr[0].m56895kk()));
            c12025x6Arr[0].m56898x1(fM68558kk);
        }
        float fM68558kk2 = m69709m9().m68558kk(0);
        if (m69711x1() != null && m69711x1().mo4966ks().m56697kk() > 0.0f && C7019kk.m27469x1(m69711x1(), C13785ll.class)) {
            fM68558kk2 -= C14116yg.m67504x1(m69711x1().mo4966ks().m56697kk(), ((C13785ll) C7019kk.m27452k4((Object) m69711x1(), C13785ll.class)).f46037dy);
        }
        if (m69709m9().m68549ck() != null) {
            fM68558kk2 += m69709m9().m68549ck().m73203ak();
        }
        if (c12015qqArr[0].m56697kk() + c12025x6Arr[0].m56895kk() + fM68558kk2 > m69704du().getHeight()) {
            float fM56697kk = c12015qqArr[0].m56697kk() + c12025x6Arr[0].m56895kk() + fM68558kk2 + m4403k4((m69704du().getHeight() - c12025x6Arr[0].m56895kk()) - c12015qqArr[0].m56697kk());
            C12015qq c12015qq3 = c12015qqArr[0];
            c12015qq3.m56700x1(c12015qq3.m56697kk() - (fM56697kk - m69704du().getHeight()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m4409k4(C12015qq c12015qq, C12025x6 c12025x6, C14713vw c14713vw) {
        if (m4404k4(1) > c12025x6.m56897x1()) {
            return false;
        }
        if (m4404k4(2) > m69704du().getWidth() - (c12015qq.m56699x1() + c12025x6.m56897x1()) || m69709m9().m68556k4(3) > c12025x6.m56895kk()) {
            return false;
        }
        if (m69711x1() != null && m69711x1().mo3221T_()) {
            int tickLabelPosition = m69711x1().m73026k4().m73384dy().getTickLabelPosition();
            if (tickLabelPosition == 0 || tickLabelPosition == 1) {
                return false;
            }
            if (tickLabelPosition == 2) {
                if (m69704du().getHeight() - (c12015qq.m56697kk() + c12025x6.m56895kk()) < m69705h4().f4955k4) {
                    return false;
                }
                if (C7019kk.m27469x1(m69711x1(), C1195hd.class) && m69711x1().m73026k4().m73422wl() && m69711x1().m73026k4().m73411qq() && ((C1195hd) C7019kk.m27452k4((Object) m69711x1(), C1195hd.class)).m70707jd(c14713vw) > m69709m9().m68556k4(0)) {
                    return false;
                }
            }
            if (m69711x1().m73026k4().m73386h4() == 0) {
                if (m4404k4(0) > m69704du().getHeight() - (c12015qq.m56697kk() + c12025x6.m56895kk())) {
                    float fM56699x1 = c12015qq.m56699x1() / m69711x1().f49904k4.size();
                    for (nxm nxmVar : m69711x1().f49904k4.toArray(new nxm[0])) {
                        if (m69711x1().m73031kk(nxmVar.m68253jd()).m56699x1() - fM56699x1 > 50.0f) {
                            return false;
                        }
                    }
                }
            }
        }
        return (m69710to() != null && m69710to().mo3221T_() && (m69710to().m73026k4().m73384dy().getTickLabelPosition() == 1 || m69710to().m73026k4().m73384dy().getTickLabelPosition() == 0)) ? false : true;
    }
}
