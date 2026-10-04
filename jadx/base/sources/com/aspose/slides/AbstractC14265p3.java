package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.p3 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC14265p3 extends AbstractC14763x3 {

    /* JADX INFO: renamed from: dy */
    private List<List<nxm>> f47989dy;

    /* JADX INFO: renamed from: m9 */
    private boolean f47990m9;

    public AbstractC14265p3(C14787xi c14787xi) {
        super(c14787xi);
        this.f47989dy = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    private void m68923k4(boolean z) {
        this.f47990m9 = z;
    }

    /* JADX INFO: renamed from: ar */
    public final void m68924ar() {
        if (m73026k4().m73376bv() == 1) {
            return;
        }
        int iM73376bv = 0;
        while (iM73376bv < ((AbstractC14763x3) this).f49904k4.size()) {
            int iM73376bv2 = m73026k4().m73376bv() + iM73376bv;
            if (iM73376bv2 > ((AbstractC14763x3) this).f49904k4.size()) {
                iM73376bv2 = ((AbstractC14763x3) this).f49904k4.size();
            }
            for (int i = iM73376bv + 1; i < iM73376bv2; i++) {
                ((AbstractC14763x3) this).f49904k4.get_Item(i).mo63967x1(false);
                m73226x1(((AbstractC14763x3) this).f49904k4.get_Item(i));
            }
            iM73376bv += m73026k4().m73376bv();
        }
    }

    /* JADX INFO: renamed from: bv */
    public final double m68925bv() {
        int iM69819to = C14365qy.m69819to(m73026k4().m73423wy().m69879yj());
        if (m73026k4().m73375b3() || m73026k4().m73423wy().m69834fa().hasDataTable()) {
            iM69819to++;
        }
        if (iM69819to <= 1) {
            iM69819to = 2;
        }
        return iM69819to;
    }

    /* JADX INFO: renamed from: c5 */
    public abstract C14713vw mo4960c5(C14713vw c14713vw);

    /* JADX INFO: renamed from: dy */
    public final boolean m68926dy(C14713vw c14713vw) {
        C14713vw c14713vw2 = new C14713vw(m73026k4().m73423wy().m69867v4(), m73026k4().m73423wy().m69852lr());
        int iM73376bv = 0;
        while (iM73376bv < ((AbstractC14763x3) this).f49904k4.size()) {
            if (((AbstractC14763x3) this).f49904k4.get_Item(iM73376bv).m68249du(c14713vw2).m56699x1() > c14713vw.m72555k4()) {
                return false;
            }
            iM73376bv += m73026k4().m73376bv();
        }
        return true;
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: h4 */
    public C12015qq mo3034h4(C14713vw c14713vw) {
        float f = 0.0f;
        if (!m73026k4().m73384dy().isVisible() || m73026k4().m73384dy().getTickLabelPosition() == 3) {
            return new C12015qq(0.0f, 0.0f);
        }
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
        return new C12015qq(f, f2);
    }

    /* JADX INFO: renamed from: jd */
    public void mo68927jd(C14713vw c14713vw) {
        ((AbstractC14763x3) this).f49904k4.clear();
        List.Enumerator<C13847mr> it = ((AbstractC14763x3) this).f49908x1.iterator();
        int iM27462to = 0;
        while (it.hasNext()) {
            try {
                if (ChartTypeCharacterizer.m762k4(it.next().m64945h4().getType()) == 5) {
                    double[] dArr = {0.0d};
                    ((C0974f2) C7019kk.m27452k4((Object) m73228yd().m73228yd(), C0974f2.class)).m5809m9().m6991k4(this, new double[]{0.0d}, dArr);
                    double d = dArr[0];
                    if (d > iM27462to) {
                        iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67490kk(d)), 14);
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        int iM67483k4 = C14116yg.m67483k4(C14365qy.m69819to(((AbstractC14763x3) this).f49908x1), iM27462to);
        IChartCategoryCollection secondaryCategories = (m73026k4().m73384dy().m318du() && m73218lr().m7149to().m69834fa().getChartData().getUseSecondaryCategories()) ? m73026k4().m73423wy().m69834fa().getChartData().getSecondaryCategories() : m73026k4().m73423wy().m69834fa().getChartData().getCategories();
        if (secondaryCategories.size() <= 0) {
            if (((ChartCategoryCollection) secondaryCategories).m530h4() || ChartTypeCharacterizer.m767to(((AbstractC14763x3) this).f49908x1.get_Item(0).m64945h4().getType())) {
                if (!m73026k4().m73384dy().isAutomaticMaxValue()) {
                    iM67483k4 = C7019kk.m27462to(Double.valueOf(m73026k4().m73384dy().getMaxValue()), 14);
                }
                for (int i = 1; i <= iM67483k4; i++) {
                    m73025k4(Integer.valueOf(i));
                }
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < iM67483k4; i2++) {
            if (i2 < secondaryCategories.size()) {
                ChartCategory chartCategory = (ChartCategory) secondaryCategories.get_Item(i2);
                nxm nxmVarM73025k4 = m73025k4(chartCategory.m525kk());
                if (!m68931v4() && C14113y2.m67411k4(nxmVarM73025k4.m68253jd())) {
                    m68923k4(true);
                }
                if (secondaryCategories.getGroupingLevelCount() > 1 && m73026k4().m73384dy().m319k4().m68838h4()) {
                    for (int i3 = 1; i3 < secondaryCategories.getGroupingLevelCount(); i3++) {
                        if (chartCategory.m523k4(i3) != null) {
                            Object objM523k4 = chartCategory.m523k4(i3);
                            if (nxmVarM73025k4.m68259m9() != null) {
                                objM523k4 = C14113y2.m67402k4("{0}\n{1}", nxmVarM73025k4.m68253jd(), objM523k4);
                            }
                            nxmVarM73025k4.m68256k4(objM523k4);
                        }
                    }
                }
            } else {
                m73025k4((Object) C14113y2.f47374k4);
                m68923k4(true);
            }
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final float m68928m9(C14713vw c14713vw) {
        float f = 0.0f;
        int iM73376bv = 0;
        while (iM73376bv < ((AbstractC14763x3) this).f49904k4.size()) {
            float fM56699x1 = ((AbstractC14763x3) this).f49904k4.get_Item(iM73376bv).m68249du(c14713vw).m56699x1();
            if (fM56699x1 > f) {
                f = fM56699x1;
            }
            iM73376bv += m73026k4().m73376bv();
        }
        return f;
    }

    /* JADX INFO: renamed from: qq */
    public final int m68929qq() {
        int[] iArr = {0};
        int iM67484k4 = C14116yg.m67484k4(((AbstractC14763x3) this).f49904k4.size(), m73026k4().m73376bv(), iArr);
        return iArr[0] > 0 ? iM67484k4 + 1 : iM67484k4;
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: u4 */
    public List<Float> mo63717u4() {
        List<Float> list = new List<>();
        int[] iArr = {0};
        int iM67484k4 = C14116yg.m67484k4(m73026k4().m73375b3() ? ((AbstractC14763x3) this).f49904k4.size() + 1 : ((AbstractC14763x3) this).f49904k4.size(), m73026k4().m73406lr(), iArr);
        if (iArr[0] > 0) {
            iM67484k4++;
        }
        float fM73203ak = (m73020du() ? m73203ak() : m73225wy()) / (iM67484k4 - 1);
        int tickMarksSpacing = m73026k4().m73384dy().isAutomaticTickMarksSpacing() ? 1 : (int) m73026k4().m73384dy().getTickMarksSpacing();
        for (int i = 0; i < iM67484k4; i += tickMarksSpacing) {
            list.addItem(Float.valueOf(i * fM73203ak));
        }
        return list;
    }

    /* JADX INFO: renamed from: um */
    public final List<List<nxm>> m68930um() {
        return this.f47989dy;
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: up */
    public float mo63718up() {
        return mo4964k4(mo63720yj());
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: uz */
    public List<Float> mo63719uz() {
        int[] iArr = {0};
        int iM67484k4 = C14116yg.m67484k4(m73026k4().m73375b3() ? ((AbstractC14763x3) this).f49904k4.size() + 1 : ((AbstractC14763x3) this).f49904k4.size(), m73026k4().m73406lr(), iArr);
        if (iArr[0] > 0) {
            iM67484k4++;
        }
        List<Float> list = new List<>();
        float fM73203ak = (m73020du() ? m73203ak() : m73225wy()) / (iM67484k4 - 1);
        for (int i = 0; i < iM67484k4 - 1; i++) {
            list.addItem(Float.valueOf((fM73203ak / 2.0f) + (i * fM73203ak)));
        }
        return list;
    }

    /* JADX INFO: renamed from: v4 */
    public final boolean m68931v4() {
        return this.f47990m9;
    }

    /* JADX INFO: renamed from: wl */
    public final int m68932wl() {
        int iM73376bv = 0;
        int i = 0;
        while (iM73376bv < ((AbstractC14763x3) this).f49904k4.size()) {
            if (!C14113y2.m67411k4(((AbstractC14763x3) this).f49904k4.get_Item(iM73376bv).m68253jd())) {
                i++;
            }
            iM73376bv += m73026k4().m73376bv();
        }
        return i;
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: yj */
    public double mo63720yj() {
        double dM73430x6 = m73026k4().m73430x6();
        if (m73026k4().m73384dy().getCrossType() == 1) {
            dM73430x6 = m68925bv();
        }
        if (dM73430x6 > m68925bv()) {
            dM73430x6 = m68925bv();
        } else {
            double d = 1;
            if (dM73430x6 < d) {
                dM73430x6 = d;
            }
        }
        m73026k4().m73392k4((float) dM73430x6);
        return dM73430x6;
    }
}
