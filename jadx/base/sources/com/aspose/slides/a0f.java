package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class a0f extends AbstractC14353qn {
    public a0f(C14237oh c14237oh, C0974f2 c0974f2) {
        super(c14237oh, c0974f2);
    }

    /* JADX INFO: renamed from: c5 */
    private boolean m3136c5() {
        return m69704du().getPlotArea().getRight() < 1.0f;
    }

    /* JADX INFO: renamed from: dy */
    private boolean m3137dy() {
        return ((double) m69704du().getPlotArea().getX()) > 0.1d && m69704du().getPlotArea().getX() < m69704du().getPlotArea().getWidth();
    }

    /* JADX INFO: renamed from: jd */
    private boolean m3138jd() {
        if (m69711x1() != null) {
            return m69711x1().mo3221T_() && m69704du().getPlotArea().getBottom() < 1.0f;
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private void m3139k4(C12025x6 c12025x6, C12015qq c12015qq) {
        C12025x6 c12025x6Clone = c12025x6.Clone();
        C12015qq c12015qqClone = c12015qq.Clone();
        C12025x6[] c12025x6Arr = {c12025x6};
        C12015qq[] c12015qqArr = {c12015qq};
        m69705h4().m5807k4(m69704du().getPlotArea(), c12025x6Arr, c12015qqArr);
        c12025x6Arr[0].CloneTo(c12025x6);
        c12015qqArr[0].CloneTo(c12015qq);
        boolean z = m3137dy() && m3136c5() && m3138jd();
        if (m69706k4() != null) {
            m69706k4().m73210fa(new C14713vw(z ? c12025x6.m56897x1() : m69704du().getWidth() / 2.0f, c12015qq.m56697kk()));
        }
        if (m69708kk() != null) {
            m69708kk().m73210fa(new C14713vw(z ? c12025x6.m56897x1() : m69704du().getWidth() / 2.0f, c12015qq.m56697kk()));
        }
        if (m69709m9().m68558kk(1) > c12025x6Clone.m56897x1() || m69709m9().m68558kk(2) > m69704du().getWidth() - (c12015qqClone.m56699x1() + c12025x6Clone.m56897x1())) {
            c12025x6Arr[0] = c12025x6;
            c12015qqArr[0] = c12015qq;
            m69705h4().m5807k4(m69704du().getPlotArea(), c12025x6Arr, c12015qqArr);
            c12025x6Arr[0].CloneTo(c12025x6);
            c12015qqArr[0].CloneTo(c12015qq);
            if (m69711x1() != null) {
                m69711x1().m73210fa(new C14713vw(c12015qq.m56699x1(), m69704du().getHeight()));
            }
            if (m69710to() != null) {
                m69710to().m73210fa(new C14713vw(c12015qq.m56699x1(), m69704du().getHeight()));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m3140k4(C12025x6 c12025x6, C12015qq c12015qq, C14713vw c14713vw) {
        AbstractC14763x3 abstractC14763x3M69706k4;
        C14713vw c14713vw2;
        AbstractC14763x3 abstractC14763x3M69706k42;
        C14713vw c14713vw3;
        C12025x6 c12025x6Clone = c12025x6.Clone();
        C12015qq c12015qqClone = c12015qq.Clone();
        float fM56897x1 = c12025x6Clone.m56897x1();
        float width = m69704du().getWidth() - (c12015qqClone.m56699x1() + c12025x6Clone.m56897x1());
        if (m69706k4() != null) {
            float fM56638du = m69706k4().m73026k4().m73425x1().m56638du();
            if (m69706k4().m73036to() == 1 && m69706k4().mo4966ks().m56699x1() > fM56897x1) {
                if (fM56897x1 < fM56638du) {
                    abstractC14763x3M69706k42 = m69706k4();
                    c14713vw3 = new C14713vw(c14713vw.m72555k4() / 2.0f, c12015qqClone.m56697kk());
                } else {
                    abstractC14763x3M69706k42 = m69706k4();
                    c14713vw3 = new C14713vw(fM56897x1, c12015qqClone.m56697kk());
                }
                abstractC14763x3M69706k42.m73210fa(c14713vw3);
            }
            if (m69706k4().m73036to() == 2 && m69706k4().mo4966ks().m56699x1() > width) {
                if (width < fM56638du) {
                    abstractC14763x3M69706k4 = m69706k4();
                    c14713vw2 = new C14713vw(c14713vw.m72555k4() / 2.0f, c12015qqClone.m56697kk());
                } else {
                    abstractC14763x3M69706k4 = m69706k4();
                    c14713vw2 = new C14713vw(width, c12015qqClone.m56697kk());
                }
                abstractC14763x3M69706k4.m73210fa(c14713vw2);
            }
        }
        if (m69708kk() != null) {
            float fM56638du2 = m69708kk().m73026k4().m73425x1().m56638du();
            if (m69708kk().m73036to() == 1 && m69708kk().mo4966ks().m56699x1() > fM56897x1) {
                if (fM56897x1 < fM56638du2) {
                    m69708kk().m73210fa(new C14713vw(c14713vw.m72555k4() / 2.0f, c12015qqClone.m56697kk()));
                } else {
                    m69708kk().m73210fa(new C14713vw(fM56897x1, c12015qqClone.m56697kk()));
                }
            }
            if (m69708kk().m73036to() != 2 || m69708kk().mo4966ks().m56699x1() <= width) {
                return;
            }
            if (width < fM56638du2) {
                m69708kk().m73210fa(new C14713vw(c14713vw.m72555k4() / 2.0f, c12015qqClone.m56697kk()));
            } else {
                m69708kk().m73210fa(new C14713vw(width, c12015qqClone.m56697kk()));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x015f  */
    @Override // com.aspose.slides.AbstractC14353qn
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo3141k4(C14713vw c14713vw) {
        C12025x6 c12025x6 = new C12025x6();
        C12015qq c12015qq = new C12015qq();
        C12025x6[] c12025x6Arr = {c12025x6};
        C12015qq[] c12015qqArr = {c12015qq};
        m69705h4().m5807k4(m69704du().getPlotArea(), c12025x6Arr, c12015qqArr);
        boolean z = false;
        c12025x6Arr[0].CloneTo(c12025x6);
        c12015qqArr[0].CloneTo(c12015qq);
        boolean z2 = m3137dy() && m3136c5() && m3138jd();
        if (m69706k4() != null) {
            m69706k4().m73210fa(new C14713vw(z2 ? c12025x6.m56897x1() : c14713vw.m72555k4() / 2.0f, c12015qq.m56697kk()));
        }
        if (m69708kk() != null) {
            m69708kk().m73210fa(new C14713vw(z2 ? c12025x6.m56897x1() : c14713vw.m72555k4() / 2.0f, c12015qq.m56697kk()));
        }
        if (m69711x1() != null) {
            m69711x1().m73210fa(new C14713vw(c12015qq.m56699x1(), c14713vw.m72556x1() / 2.0f));
        }
        if (m69710to() != null) {
            m69710to().m73210fa(new C14713vw(c12015qq.m56699x1(), c14713vw.m72556x1() / 2.0f));
        }
        float fM67481k4 = C14116yg.m67481k4(m69709m9().m68558kk(3), m69709m9().m68556k4(3) > 0.0f ? m69709m9().m68556k4(3) + m69705h4().f4955k4 : 0.0f);
        float fM67481k42 = C14116yg.m67481k4(m69709m9().m68558kk(0), m69709m9().m68556k4(0) > 0.0f ? m69705h4().f4955k4 + m69709m9().m68556k4(0) : 0.0f);
        float fM68556k4 = m69709m9().m68556k4(1);
        float fM68556k42 = m69709m9().m68556k4(2);
        if (fM68556k4 <= c12025x6.m56897x1()) {
            if (fM68556k42 > m69704du().getWidth() - (c12015qq.m56699x1() + c12025x6.m56897x1()) || fM67481k4 > c12025x6.m56895kk()) {
                z = true;
            } else {
                if (fM67481k42 > m69704du().getHeight() - (c12015qq.m56697kk() + c12025x6.m56895kk())) {
                }
            }
        }
        this.f48362k4 = z;
        if (m69706k4() != null && m69706k4().mo3221T_()) {
            if (m69706k4().m73026k4().m73384dy().getTickLabelPosition() == 1 || m69706k4().m73026k4().m73384dy().getTickLabelPosition() == 0) {
                this.f48362k4 = true;
            }
            if (C7019kk.m27469x1(m69706k4(), AbstractC14265p3.class) && ((AbstractC14265p3) C7019kk.m27452k4((Object) m69706k4(), AbstractC14265p3.class)).m68928m9(c14713vw) > fM68556k4) {
                this.f48362k4 = true;
            }
        }
        if (m69708kk() != null && m69708kk().mo3221T_() && (m69708kk().m73026k4().m73384dy().getTickLabelPosition() == 1 || m69708kk().m73026k4().m73384dy().getTickLabelPosition() == 0)) {
            this.f48362k4 = true;
        }
        if (this.f48362k4) {
            m3139k4(c12025x6.Clone(), c12015qq.Clone());
        } else {
            m3140k4(c12025x6.Clone(), c12015qq.Clone(), c14713vw);
        }
    }

    @Override // com.aspose.slides.AbstractC14353qn
    /* JADX INFO: renamed from: k4 */
    public void mo3142k4(C12025x6[] c12025x6Arr, C12015qq[] c12015qqArr) {
        float f = m69705h4().f4955k4;
        float fM68556k4 = m69709m9().m68556k4(1) > 0.0f ? m69709m9().m68556k4(1) + f : 0.0f;
        float fM68556k42 = m69709m9().m68556k4(2) > 0.0f ? m69709m9().m68556k4(2) + f : 0.0f;
        if (m69706k4() != null && m69706k4().mo3221T_() && (m69706k4().m73026k4().m73384dy().getTickLabelPosition() == 1 || m69706k4().m73026k4().m73384dy().getTickLabelPosition() == 0)) {
            if (m69706k4().m73022ix() == 1) {
                fM68556k4 = C14116yg.m67481k4(fM68556k4, m69709m9().m68558kk(1));
            }
            if (m69706k4().m73022ix() == 2) {
                fM68556k42 = C14116yg.m67481k4(fM68556k42, m69709m9().m68558kk(2));
            }
        }
        float f2 = fM68556k4;
        float f3 = fM68556k42;
        float fM67481k4 = C14116yg.m67481k4(m69709m9().m68558kk(3), m69709m9().m68556k4(3) > 0.0f ? m69709m9().m68556k4(3) + f : 0.0f);
        float fM67481k42 = C14116yg.m67481k4(m69709m9().m68558kk(0), m69709m9().m68556k4(0) > 0.0f ? m69709m9().m68556k4(0) + f : 0.0f);
        if (this.f48362k4) {
            m69707k4(c12025x6Arr, c12015qqArr, f2, f3, fM67481k4, fM67481k42);
            float fM68558kk = m69709m9().m68558kk(1);
            if (fM68558kk > c12025x6Arr[0].m56897x1()) {
                C12015qq c12015qq = c12015qqArr[0];
                c12015qq.m56695k4(c12015qq.m56699x1() - (fM68558kk - c12025x6Arr[0].m56897x1()));
                c12025x6Arr[0].m56891k4(fM68558kk);
            }
            float fM68558kk2 = m69709m9().m68558kk(2);
            if (c12015qqArr[0].m56699x1() + c12025x6Arr[0].m56897x1() + fM68558kk2 > m69704du().getWidth()) {
                C12015qq c12015qq2 = c12015qqArr[0];
                c12015qq2.m56695k4(c12015qq2.m56699x1() - (((c12015qqArr[0].m56699x1() + c12025x6Arr[0].m56897x1()) + fM68558kk2) - m69704du().getWidth()));
            }
        }
    }
}
