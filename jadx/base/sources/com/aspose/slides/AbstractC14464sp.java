package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.StyleIdentifier;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.sp */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC14464sp extends AbstractC14763x3 {
    public AbstractC14464sp(C14787xi c14787xi) {
        super(c14787xi);
        if (m73026k4().m73384dy().isAutomaticMajorUnit()) {
            m73026k4().m73409m9(1.0d);
            m73026k4().m73404kk(true);
        }
        if (m73026k4().m73384dy().isAutomaticMinorUnit()) {
            m73026k4().m73387h4(1.0d);
            m73026k4().m73416to(true);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static double m70702x1(Object obj) {
        if (obj != null) {
            if (!C7019kk.m27469x1(obj, String.class)) {
                if (C7019kk.m27469x1(obj, Double.class) || C7019kk.m27469x1(obj, Integer.class) || C7019kk.m27469x1(obj, Boolean.class)) {
                    return C14080ne.m66903fa(obj);
                }
                if (C7019kk.m27469x1(obj, C14084qq.class)) {
                    return kc0.m63752k4(((C14084qq) C7019kk.m27464to(obj, C14084qq.class)).Clone().Clone(), false);
                }
                try {
                    return C14080ne.m66876du(obj);
                } catch (RuntimeException e) {
                    C3085sv.m13082k4(e);
                    return Double.NaN;
                }
            }
            String string = obj.toString();
            if (!"".equals(string)) {
                double[] dArr = {0.0d};
                boolean zM66435k4 = C14044b3.m66435k4(string, 111, C11697x1.m55252to(), dArr);
                double d = dArr[0];
                if (zM66435k4) {
                    return d;
                }
            }
        }
        return Double.NaN;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: V_ */
    public void mo3030V_() {
        m73026k4().m73384dy().m323kk(m73026k4().m73418um());
        m73026k4().m73384dy().m326to(m73026k4().m73374ar());
        m73026k4().m73384dy().m321k4(m73026k4().m73417u4());
        m73026k4().m73384dy().m329x1(m73026k4().m73420uz());
    }

    /* JADX INFO: renamed from: ar */
    public final void m70703ar() {
        if (m73026k4().m73422wl() && m73026k4().m73411qq()) {
            m73026k4().m73415to(m73026k4().m73384dy().getBaseUnitScale());
            m73026k4().m73382du(1);
            m73026k4().m73409m9(1.0d);
            m73026k4().m73387h4(1.0d);
            m73026k4().m73404kk(true);
            m73026k4().m73416to(true);
        }
        if (m73026k4().m73422wl() || !m73026k4().m73411qq()) {
            return;
        }
        m73026k4().m73387h4(C22208OooOo0.OooO00o(m73026k4().m73418um(), 2.0d, 14) != 0 ? C22208OooOo0.OooO00o(m73026k4().m73418um(), 2.0d, 14) : 1.0d);
        m73026k4().m73416to(true);
        m73026k4().m73382du(m73026k4().m73417u4());
    }

    /* JADX INFO: renamed from: c5 */
    public final C12015qq m70704c5(C14713vw c14713vw) {
        if (m73026k4().m73384dy().isPlotOrderReversed()) {
            ((AbstractC14763x3) this).f49904k4.reverse();
        }
        float f = 0.0f;
        int iM73376bv = 0;
        float f2 = 0.0f;
        while (iM73376bv < ((AbstractC14763x3) this).f49904k4.size()) {
            oju ojuVarClone = ((AbstractC14763x3) this).f49904k4.get_Item(iM73376bv).m68258kk(c14713vw).Clone();
            float f3 = ojuVarClone.f47836k4;
            if (f3 > f) {
                f = f3;
            }
            float f4 = ojuVarClone.f47837x1;
            if (f4 > f2) {
                f2 = f4;
            }
            iM73376bv += m73026k4().m73376bv();
        }
        if (m73026k4().m73384dy().isPlotOrderReversed()) {
            ((AbstractC14763x3) this).f49904k4.reverse();
        }
        return new C12015qq(f, f2);
    }

    /* JADX INFO: renamed from: ck */
    public final void m70705ck(C14713vw c14713vw) {
        int iM69819to = C14365qy.m69819to(((AbstractC14763x3) this).f49908x1);
        List<C1210hn> listM69871x1 = m73026k4().m73419up() == 0 ? m73026k4().m73423wy().m69871x1() : m73026k4().m73423wy().m69848kk();
        boolean z = listM69871x1.size() == 0;
        List list = new List();
        int i = 0;
        while (true) {
            if (i >= listM69871x1.size()) {
                break;
            }
            C1210hn c1210hn = listM69871x1.get_Item(i);
            if (c1210hn.m7238x1() == null || !C14113y2.m67363du(c1210hn.m7238x1().toString(), "#N/A")) {
                int iM72790k4 = C14743wm.m72790k4(c1210hn.m7238x1(), false);
                if (iM72790k4 < 0) {
                    if (!c1210hn.m7237to()) {
                        list.clear();
                        listM69871x1.clear();
                        z = true;
                        break;
                    }
                } else {
                    list.addItem(Integer.valueOf(iM72790k4));
                }
            } else {
                listM69871x1.removeAt(i);
                i--;
            }
            i++;
        }
        if (z) {
            for (int i2 = 1; i2 <= iM69819to; i2++) {
                listM69871x1.addItem(new C1210hn(null, Integer.valueOf(i2)));
                list.addItem(Integer.valueOf(i2));
            }
        }
        new List(list).sort();
        if (m73026k4().m73384dy().isAutomaticMaxValue()) {
            m73026k4().m73381du(((Integer) OooO0O0.OooO00o(r10, 1)).intValue());
        }
        if (m73026k4().m73384dy().isAutomaticMinValue()) {
            m73026k4().m73414to(((Integer) r10.get_Item(0)).intValue());
        }
        if (m73026k4().m73384dy().m324kk()) {
            double dM66818k4 = C14084qq.m67073c5(C0841c4.m4464k4(m73026k4().m73389ix(), false).Clone(), C0841c4.m4464k4(m73026k4().m73410ne(), false).Clone()).m66818k4() / (((AbstractC14763x3) this).f49908x1.get_Item(0).m64944dy().size() - 1);
            if (dM66818k4 >= 365.0d) {
                m73026k4().m73384dy().setBaseUnitScale(3);
                return;
            }
            if (dM66818k4 >= 30.0d) {
                m73026k4().m73384dy().setBaseUnitScale(2);
            } else {
                if (dM66818k4 < 1.0d || m73026k4().m73384dy().getBaseUnitScale() != 0) {
                    return;
                }
                m73026k4().m73384dy().setBaseUnitScale(1);
            }
        }
    }

    /* JADX INFO: renamed from: dy */
    public final C12015qq m70706dy(C14713vw c14713vw) {
        C12015qq c12015qqClone = m70704c5(c14713vw).Clone();
        if (!C7019kk.m27469x1(this, C1195hd.class) || m73026k4().m73386h4() == 0 || c12015qqClone.m56697kk() <= c14713vw.m72556x1()) {
            return c12015qqClone;
        }
        List.Enumerator<nxm> it = ((AbstractC14763x3) this).f49904k4.iterator();
        while (it.hasNext()) {
            try {
                m70701k4(it.next(), c14713vw);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m70704c5(c14713vw).CloneTo(c12015qqClone);
        return c12015qqClone;
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: h4 */
    public C12015qq mo3034h4(C14713vw c14713vw) {
        nxm nxmVarM73025k4 = m73025k4(Double.valueOf(m73026k4().m73389ix()));
        oju ojuVarClone = nxmVarM73025k4.m68258kk(c14713vw).Clone();
        m73028k4(nxmVarM73025k4);
        return new C12015qq(ojuVarClone.f47836k4, ojuVarClone.f47837x1);
    }

    /* JADX INFO: renamed from: jd */
    public final float m70707jd(C14713vw c14713vw) {
        nxm nxmVarM73025k4 = m73025k4(Double.valueOf(m73026k4().m73389ix()));
        float fM56697kk = nxmVarM73025k4.m68249du(c14713vw).m56697kk();
        m73028k4(nxmVarM73025k4);
        return fM56697kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m70708k4(int i) {
        if (m73026k4().m73384dy().getAxisBetweenCategories() || m73026k4().m73423wy().m69834fa().hasDataTable()) {
            return C0841c4.m4455k4(i, C7019kk.m27462to(Double.valueOf(m73026k4().m73389ix()), 14), C7019kk.m27462to(Double.valueOf(m73026k4().m73410ne()), 14), C7019kk.m27462to(Double.valueOf(m73026k4().m73389ix()), 14), false) + 1;
        }
        int iM4455k4 = C0841c4.m4455k4(i, C7019kk.m27462to(Double.valueOf(m73026k4().m73389ix()), 14), C7019kk.m27462to(Double.valueOf(m73026k4().m73410ne()), 14), C7019kk.m27462to(Double.valueOf(m73026k4().m73389ix()), 14), false);
        if (iM4455k4 == 0) {
            return 1;
        }
        return iM4455k4;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract C14713vw mo5811k4(C14713vw c14713vw, int i);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022a A[PHI: r6
      0x022a: PHI (r6v1 double) = (r6v0 double), (r6v2 double) binds: [B:83:0x023d, B:80:0x0228] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m70710kk(int i) {
        double d;
        if (m73026k4().m73384dy().getBaseUnitScale() != 1) {
            if (m73026k4().m73384dy().getBaseUnitScale() == 2) {
                if (i >= 12) {
                    int i2 = i % 12;
                    int i3 = i / 12;
                    if (i2 != 0) {
                        i3++;
                    }
                    if (m73026k4().m73420uz() == 2) {
                        m73026k4().m73409m9(i3);
                    } else {
                        d = i3;
                        if (m73026k4().m73374ar() <= d) {
                            m73026k4().m73409m9(d);
                        }
                    }
                } else if (m73026k4().m73420uz() == 2) {
                    double d2 = i;
                    if (m73026k4().m73374ar() <= d2) {
                        m73026k4().m73409m9(d2);
                    } else {
                        m73026k4().m73409m9(m73026k4().m73374ar());
                    }
                    m73026k4().m73415to(2);
                }
                m73026k4().m73409m9(m73026k4().m73374ar());
            } else {
                d = i;
                if (m73026k4().m73374ar() > d) {
                    m73026k4().m73409m9(m73026k4().m73374ar());
                }
            }
            m73026k4().m73415to(3);
        } else if (i <= 2) {
            if (m73026k4().m73420uz() > m73026k4().m73384dy().getBaseUnitScale()) {
                m73026k4().m73415to(m73026k4().m73420uz());
            } else {
                m73026k4().m73415to(m73026k4().m73384dy().getBaseUnitScale());
                m73026k4().m73409m9(i);
                if (m73026k4().m73418um() < m73026k4().m73374ar()) {
                }
            }
            m73026k4().m73409m9(m73026k4().m73374ar());
        } else if (i > 2 && i <= 7) {
            if (m73026k4().m73420uz() <= m73026k4().m73384dy().getBaseUnitScale()) {
                m73026k4().m73415to(m73026k4().m73384dy().getBaseUnitScale());
                m73026k4().m73409m9(7.0d);
                if (m73026k4().m73418um() < m73026k4().m73374ar()) {
                }
            }
            m73026k4().m73409m9(m73026k4().m73374ar());
        } else if (i > 7 && i <= 30) {
            if (m73026k4().m73420uz() != 3) {
                m73026k4().m73415to(2);
                m73026k4().m73409m9(1.0d);
                if (m73026k4().m73418um() < m73026k4().m73374ar() && m73026k4().m73420uz() == 2) {
                }
            }
            m73026k4().m73409m9(m73026k4().m73374ar());
        } else if (i <= 30 || i > 360) {
            C14787xi c14787xiM73026k4 = m73026k4();
            int i4 = i % StyleIdentifier.LIST_TABLE_4_ACCENT_5;
            int i5 = i / StyleIdentifier.LIST_TABLE_4_ACCENT_5;
            if (i4 != 0) {
                i5++;
            }
            c14787xiM73026k4.m73409m9(i5);
            m73026k4().m73415to(3);
            if (m73026k4().m73418um() < m73026k4().m73374ar() && m73026k4().m73420uz() == 3) {
                m73026k4().m73409m9(m73026k4().m73374ar());
            }
        } else {
            if (m73026k4().m73420uz() != 3) {
                m73026k4().m73415to(2);
                C14787xi c14787xiM73026k42 = m73026k4();
                int i6 = i % 30;
                int i7 = i / 30;
                if (i6 != 0) {
                    i7++;
                }
                c14787xiM73026k42.m73409m9(i7);
                if (m73026k4().m73418um() > 2.0d) {
                    m73026k4().m73415to(3);
                    m73026k4().m73409m9(1.0d);
                }
                if (m73026k4().m73418um() < m73026k4().m73374ar() && m73026k4().m73420uz() == 2) {
                }
            }
            m73026k4().m73409m9(m73026k4().m73374ar());
        }
        m73026k4().m73404kk(true);
    }

    /* JADX INFO: renamed from: m9 */
    public void m70711m9(C14713vw c14713vw) {
        ((AbstractC14763x3) this).f49904k4.clear();
        if (!m73026k4().m73384dy().isVisible() || m73026k4().m73384dy().getTickLabelPosition() == 3) {
            return;
        }
        int iM27462to = C7019kk.m27462to(Double.valueOf(m73026k4().m73410ne()), 14);
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(m73026k4().m73389ix()), 14);
        if (m73026k4().m73384dy().getBaseUnitScale() == 2) {
            C14084qq c14084qqClone = nxm.m68243k4(C14080ne.m66996m9(Integer.valueOf(iM27462to)), false).Clone();
            iM27462to = C7019kk.m27462to(Double.valueOf(new C14084qq(c14084qqClone.m67158yj(), c14084qqClone.m67129dy(), 1).m67143ks()), 14);
        }
        if (m73026k4().m73384dy().getBaseUnitScale() == 3 && C0841c4.m4487x1(m73026k4().m73384dy().getBaseUnitScale(), m73026k4().m73417u4(), C7019kk.m27462to(Double.valueOf(m73026k4().m73418um()), 14), iM27462to, false) > iM27462to2) {
            m73025k4(Integer.valueOf(iM27462to2));
            return;
        }
        do {
            m73025k4(Integer.valueOf(iM27462to));
            iM27462to = C0841c4.m4487x1(m73026k4().m73384dy().getBaseUnitScale(), m73026k4().m73417u4(), C7019kk.m27462to(Double.valueOf(m73026k4().m73418um()), 14), iM27462to, false);
        } while (iM27462to2 - iM27462to >= 0);
    }

    /* JADX INFO: renamed from: qq */
    public final int m70712qq() {
        int iM27462to = C7019kk.m27462to(Double.valueOf(m73026k4().m73389ix()), 14);
        return (m73026k4().m73375b3() || m73026k4().m73423wy().m69834fa().hasDataTable()) ? C0841c4.m4487x1(m73026k4().m73384dy().getBaseUnitScale(), m73026k4().m73384dy().getBaseUnitScale(), 1, iM27462to, false) : iM27462to;
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: u4 */
    public List<Float> mo63717u4() {
        List<Float> list = new List<>();
        double dM73225wy = ((double) m73225wy()) / ((double) m70708k4(m73026k4().m73384dy().getBaseUnitScale()));
        float fM73203ak = m73020du() ? m73203ak() : m73225wy();
        float fM4455k4 = m73026k4().m73384dy().isPlotOrderReversed() ? fM73203ak : 0.0f;
        if (!m73026k4().m73384dy().isPlotOrderReversed()) {
            fM73203ak = m73227xk();
        }
        for (int i = 0; i < ((AbstractC14763x3) this).f49904k4.size(); i++) {
            int iM66998m9 = C14080ne.m66998m9(((AbstractC14763x3) this).f49904k4.get_Item(i).m68250dy());
            fM73203ak = m73026k4().m73384dy().isPlotOrderReversed() ? fM73203ak - fM4455k4 : fM73203ak + fM4455k4;
            fM4455k4 = (float) (((double) C0841c4.m4455k4(m73026k4().m73384dy().getBaseUnitScale(), C0841c4.m4487x1(m73026k4().m73384dy().getBaseUnitScale(), m73026k4().m73417u4(), C7019kk.m27462to(Double.valueOf(m73026k4().m73418um()), 14), iM66998m9, false), iM66998m9, C7019kk.m27462to(Double.valueOf(m73026k4().m73389ix()), 14), false)) * dM73225wy);
            list.addItem(Float.valueOf(fM73203ak));
        }
        return list;
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: up */
    public float mo63718up() {
        return mo4964k4(mo63720yj());
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: uz */
    public List<Float> mo63719uz() {
        boolean z;
        List<Float> list = new List<>();
        int iM70708k4 = m70708k4(m73026k4().m73384dy().getBaseUnitScale());
        float fM73203ak = m73020du() ? m73203ak() : m73225wy();
        double d = ((double) fM73203ak) / ((double) iM70708k4);
        float f = m73026k4().m73384dy().isPlotOrderReversed() ? fM73203ak : 0.0f;
        int iM27462to = C7019kk.m27462to(Double.valueOf(m73026k4().m73410ne()), 14);
        int iM4487x1 = C0841c4.m4487x1(m73026k4().m73384dy().getBaseUnitScale(), m73026k4().m73417u4(), C7019kk.m27462to(Double.valueOf(m73026k4().m73418um()), 14), C7019kk.m27462to(Double.valueOf(m73026k4().m73410ne()), 14), false);
        while (true) {
            int iM4487x12 = C0841c4.m4487x1(m73026k4().m73384dy().getBaseUnitScale(), m73026k4().m73420uz(), C7019kk.m27462to(Double.valueOf(m73026k4().m73374ar()), 14), iM27462to, false);
            if (iM4487x12 == iM4487x1) {
                iM4487x1 = C0841c4.m4487x1(m73026k4().m73384dy().getBaseUnitScale(), m73026k4().m73417u4(), C7019kk.m27462to(Double.valueOf(m73026k4().m73418um()), 14), iM4487x1, false);
                z = false;
            } else {
                z = true;
            }
            if (iM4487x12 >= iM4487x1) {
                iM4487x1 = C0841c4.m4487x1(m73026k4().m73384dy().getBaseUnitScale(), m73026k4().m73417u4(), C7019kk.m27462to(Double.valueOf(m73026k4().m73418um()), 14), iM4487x1, false);
            }
            float fM4455k4 = (float) (((double) C0841c4.m4455k4(m73026k4().m73384dy().getBaseUnitScale(), iM4487x12, iM27462to, C7019kk.m27462to(Double.valueOf(m73026k4().m73389ix()), 14), false)) * d);
            f = m73026k4().m73384dy().isPlotOrderReversed() ? f - fM4455k4 : f + fM4455k4;
            if (z && f >= 0.0f && f <= fM73203ak) {
                list.addItem(Float.valueOf(f));
            }
            if (f < 0.0f || f > fM73203ak) {
                break;
            }
            iM27462to = iM4487x12;
        }
        return list;
    }

    /* JADX INFO: renamed from: wl */
    public final int m70713wl() {
        int iM27462to = C7019kk.m27462to(Double.valueOf(m73026k4().m73410ne()), 14);
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(m73026k4().m73389ix()), 14);
        if (m73026k4().m73422wl() && !m73026k4().m73411qq() && m73026k4().m73418um() == 0.0d) {
            return kc0.m63753k4((float) (((double) C0841c4.m4456k4(m73026k4().m73420uz(), iM27462to2, iM27462to, false)) / m73026k4().m73374ar()));
        }
        int iM4487x1 = C0841c4.m4487x1(m73026k4().m73384dy().getBaseUnitScale(), m73026k4().m73417u4(), C7019kk.m27462to(Double.valueOf(m73026k4().m73418um()), 14), iM27462to, false);
        int i = 1;
        while (iM27462to2 - iM4487x1 >= 0) {
            i++;
            iM4487x1 = C0841c4.m4487x1(m73026k4().m73384dy().getBaseUnitScale(), m73026k4().m73417u4(), C7019kk.m27462to(Double.valueOf(m73026k4().m73418um()), 14), iM4487x1, false);
        }
        return i;
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: yj */
    public double mo63720yj() {
        int iM27462to = C7019kk.m27462to(Double.valueOf(m73026k4().m73410ne()), 14);
        int iM4457k4 = C0841c4.m4457k4(m73026k4().m73384dy().getBaseUnitScale(), C7019kk.m27462to(Float.valueOf(m73026k4().m73430x6()), 13), false);
        if (m73026k4().m73384dy().getCrossType() == 1) {
            iM4457k4 = m70712qq();
        }
        if (iM4457k4 > m70712qq()) {
            iM27462to = m70712qq();
        } else if (iM4457k4 >= iM27462to) {
            iM27462to = iM4457k4;
        }
        m73026k4().m73392k4(iM27462to);
        return iM27462to;
    }

    /* JADX INFO: renamed from: k4 */
    private void m70701k4(nxm nxmVar, C14713vw c14713vw) {
        String strM68253jd = nxmVar.m68253jd();
        oju ojuVarClone = nxmVar.m68258kk(c14713vw).Clone();
        if (ojuVarClone.f47837x1 <= c14713vw.m72556x1() / 2.0f) {
            return;
        }
        while (ojuVarClone.f47837x1 > c14713vw.m72556x1() / 2.0f && strM68253jd.length() > 1) {
            strM68253jd = OooO0OO.OooO00o(1, 0, strM68253jd, strM68253jd);
            nxm nxmVar2 = new nxm(C14113y2.m67407k4(strM68253jd, (char) 8230), this);
            nxmVar2.m68257k4(true);
            m73215k4((AbstractC14770x9) nxmVar2);
            nxmVar2.m68258kk(c14713vw).CloneTo(ojuVarClone);
            m73226x1((AbstractC14770x9) nxmVar2);
        }
        nxmVar.m68257k4(true);
        nxmVar.m68256k4((Object) C14113y2.m67407k4(strM68253jd, (char) 8230));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1 A[PHI: r12
      0x00c1: PHI (r12v10 com.aspose.slides.xi) = (r12v2 com.aspose.slides.xi), (r12v19 com.aspose.slides.xi) binds: [B:39:0x0149, B:23:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0104 A[PHI: r12
      0x0104: PHI (r12v6 com.aspose.slides.xi) = (r12v1 com.aspose.slides.xi), (r12v16 com.aspose.slides.xi) binds: [B:42:0x0164, B:32:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m70714x1(int i) {
        C14787xi c14787xiM73026k4;
        C14787xi c14787xiM73026k42;
        double dOooO00o = 1.0d;
        if (m73026k4().m73384dy().getBaseUnitScale() == 1) {
            if (i <= 2) {
                m73026k4().m73409m9(i);
            } else if (i > 2 && i <= 7) {
                m73026k4().m73409m9(7.0d);
            } else if (i > 7 && i <= 14) {
                m73026k4().m73409m9(14.0d);
                m73026k4().m73387h4(7.0d);
                m73026k4().m73415to(m73026k4().m73384dy().getBaseUnitScale());
                m73026k4().m73382du(m73026k4().m73384dy().getBaseUnitScale());
            } else if (i > 14 && i <= 30) {
                m73026k4().m73409m9(1.0d);
                m73026k4().m73387h4(1.0d);
                m73026k4().m73415to(2);
                m73026k4().m73382du(2);
            } else if (i <= 30 || i > 360) {
                C14787xi c14787xiM73026k43 = m73026k4();
                int i2 = i % StyleIdentifier.LIST_TABLE_4_ACCENT_5;
                int i3 = i / StyleIdentifier.LIST_TABLE_4_ACCENT_5;
                if (i2 != 0) {
                    i3++;
                }
                c14787xiM73026k43.m73409m9(i3);
                c14787xiM73026k4 = m73026k4();
                if (C22208OooOo0.OooO00o(m73026k4().m73418um(), 2.0d, 14) != 0) {
                    dOooO00o = C22208OooOo0.OooO00o(m73026k4().m73418um(), 2.0d, 14);
                }
                c14787xiM73026k4.m73387h4(dOooO00o);
                m73026k4().m73415to(3);
                m73026k4().m73382du(3);
            } else {
                m73026k4().m73409m9(C14116yg.m67501x1(i / 30.0f));
                c14787xiM73026k42 = m73026k4();
                if (C22208OooOo0.OooO00o(m73026k4().m73418um(), 2.0d, 14) != 0) {
                    dOooO00o = C22208OooOo0.OooO00o(m73026k4().m73418um(), 2.0d, 14);
                }
                c14787xiM73026k42.m73387h4(dOooO00o);
                m73026k4().m73415to(2);
                m73026k4().m73382du(2);
            }
            m73026k4().m73387h4(1.0d);
            m73026k4().m73415to(m73026k4().m73384dy().getBaseUnitScale());
            m73026k4().m73382du(m73026k4().m73384dy().getBaseUnitScale());
        } else if (m73026k4().m73384dy().getBaseUnitScale() == 2) {
            m73026k4().m73409m9(i);
            c14787xiM73026k42 = m73026k4();
            if (C22208OooOo0.OooO00o(m73026k4().m73418um(), 2.0d, 14) != 0) {
            }
            c14787xiM73026k42.m73387h4(dOooO00o);
            m73026k4().m73415to(2);
            m73026k4().m73382du(2);
        } else {
            m73026k4().m73409m9(i);
            c14787xiM73026k4 = m73026k4();
            if (C22208OooOo0.OooO00o(m73026k4().m73418um(), 2.0d, 14) != 0) {
            }
            c14787xiM73026k4.m73387h4(dOooO00o);
            m73026k4().m73415to(3);
            m73026k4().m73382du(3);
        }
        m73026k4().m73404kk(true);
        m73026k4().m73416to(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030 A[PHI: r3
      0x0030: PHI (r3v1 double) = (r3v0 double), (r3v0 double), (r3v2 double) binds: [B:21:0x007d, B:11:0x002e, B:14:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m70709k4(int[] iArr) {
        C14787xi c14787xiM73026k4;
        double dM73418um;
        int i = iArr[0];
        double d = 2.0d;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    c14787xiM73026k4 = m73026k4();
                    dM73418um = m73026k4().m73418um() + 1.0d;
                    c14787xiM73026k4.m73409m9(dM73418um);
                }
            } else if (m73026k4().m73418um() == 1.0d) {
                m73026k4().m73409m9(d);
            } else {
                d = 3.0d;
                if (m73026k4().m73418um() != 2.0d) {
                    if (m73026k4().m73418um() == 3.0d) {
                        c14787xiM73026k4 = m73026k4();
                        dM73418um = 4.0d;
                        c14787xiM73026k4.m73409m9(dM73418um);
                    } else {
                        m73026k4().m73409m9(1.0d);
                        iArr[0] = 3;
                        m73026k4().m73415to(3);
                        m73026k4().m73382du(3);
                    }
                }
            }
        } else if (m73026k4().m73418um() != 1.0d) {
            if (m73026k4().m73418um() == 2.0d) {
                c14787xiM73026k4 = m73026k4();
                dM73418um = 7.0d;
                c14787xiM73026k4.m73409m9(dM73418um);
            } else {
                m73026k4().m73409m9(1.0d);
                iArr[0] = 2;
                m73026k4().m73415to(2);
                m73026k4().m73382du(2);
            }
        }
        m73026k4().m73404kk(true);
    }
}
