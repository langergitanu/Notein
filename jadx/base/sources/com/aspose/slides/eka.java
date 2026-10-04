package com.aspose.slides;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class eka extends AbstractC14770x9 {

    /* JADX INFO: renamed from: c5 */
    private ChartDataPointLevel f4810c5;

    /* JADX INFO: renamed from: du */
    private float f4811du;

    /* JADX INFO: renamed from: dy */
    private int f4812dy;

    /* JADX INFO: renamed from: h4 */
    private float f4813h4;

    /* JADX INFO: renamed from: jd */
    private C13847mr f4814jd;

    /* JADX INFO: renamed from: k4 */
    private float f4815k4;

    /* JADX INFO: renamed from: kk */
    private C13713k5 f4816kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f4817m9;

    /* JADX INFO: renamed from: to */
    private flt f4818to;

    /* JADX INFO: renamed from: x1 */
    private List<eka> f4819x1;

    public eka(C13847mr c13847mr) {
        this.f4819x1 = new List<>();
        this.f4812dy = 0;
        C13847mr c13847mr2 = c13847mr;
        this.f4814jd = c13847mr2;
        ChartCategoryCollection chartCategoryCollection = (ChartCategoryCollection) c13847mr2.m64945h4().getChart().getChartData().getCategories();
        if (chartCategoryCollection.size() == 0) {
            int i = 0;
            int i2 = 0;
            while (i2 < c13847mr2.m64944dy().size()) {
                int[] iArr = {i};
                eka ekaVar = new eka(c13847mr2, -1, i2, i2, iArr, true);
                int i3 = iArr[0];
                this.f4819x1.addItem(ekaVar);
                m73215k4(ekaVar);
                i2++;
                i = i3;
                c13847mr2 = c13847mr;
            }
            return;
        }
        int iM4304k4 = (((ChartData) c13847mr.m64945h4().getChart().getChartData()).m553x1().mo5710kk() != 2 ? ((ChartCategory) chartCategoryCollection.get_Item(0)).m526x1().m4304k4() : chartCategoryCollection.getGroupingLevelCount()) - 1;
        List<KeyValuePair<Integer, String>> listM532k4 = chartCategoryCollection.m532k4(iM4304k4);
        int i4 = 0;
        int i5 = 0;
        while (i4 < listM532k4.size() - 1) {
            int[] iArr2 = {i5};
            int i6 = i4 + 1;
            eka ekaVar2 = new eka(c13847mr, iM4304k4 - 1, listM532k4.get_Item(i4).getKey().intValue(), listM532k4.get_Item(i6).getKey().intValue(), iArr2, true);
            i5 = iArr2[0];
            if (ekaVar2.m5572to() > 0.0d) {
                this.f4819x1.addItem(ekaVar2);
                m73215k4(ekaVar2);
            }
            i4 = i6;
        }
        if (listM532k4.size() > 0) {
            eka ekaVar3 = new eka(c13847mr, iM4304k4 - 1, ((Integer) ((KeyValuePair) OooO0O0.OooO00o(listM532k4, 1)).getKey()).intValue(), chartCategoryCollection.size(), new int[]{i5}, true);
            if (ekaVar3.m5572to() <= 0.0d) {
                return;
            }
            this.f4819x1.addItem(ekaVar3);
            m73215k4(ekaVar3);
        }
    }

    /* JADX INFO: renamed from: du */
    private boolean m5565du(C14713vw c14713vw) {
        return c14713vw.m72555k4() > c14713vw.m72556x1();
    }

    /* JADX INFO: renamed from: kk */
    private void m5569kk(C14713vw c14713vw) {
        float fM72555k4 = c14713vw.m72555k4() * c14713vw.m72556x1();
        List.Enumerator<eka> it = this.f4819x1.iterator();
        double dM5572to = 0.0d;
        while (it.hasNext()) {
            try {
                dM5572to += it.next().m5572to();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        m5570k4(fM72555k4);
        if (dM5572to == 0.0d) {
            dM5572to = 1.0d;
        }
        float f = fM72555k4 / ((float) dM5572to);
        it = this.f4819x1.iterator();
        while (it.hasNext()) {
            try {
                eka next = it.next();
                next.m5570k4(((float) next.m5572to()) * f);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5570k4(float f) {
        this.f4815k4 = f;
    }

    /* JADX INFO: renamed from: m9 */
    public final float m5571m9() {
        return this.f4815k4;
    }

    /* JADX INFO: renamed from: to */
    public final double m5572to() {
        double dM5572to = 0.0d;
        if (!this.f4817m9) {
            List.Enumerator<eka> it = this.f4819x1.iterator();
            while (it.hasNext()) {
                try {
                    dM5572to += it.next().m5572to();
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            return dM5572to;
        }
        ChartDataPoint chartDataPoint = (ChartDataPoint) this.f4814jd.m64945h4().getDataPoints().get_Item(this.f4812dy);
        if (((ChartData) this.f4814jd.m64941c5().m69834fa().getChartData()).m553x1().mo5710kk() != 2) {
            if (chartDataPoint.m601x6().m71989k4() == null) {
                return 0.0d;
            }
            return ((Double) C7019kk.m27464to(chartDataPoint.m601x6().m71989k4(), Double.TYPE)).doubleValue();
        }
        double d = chartDataPoint.getSizeValue().toDouble();
        if (C14044b3.m66437kk(d)) {
            return 0.0d;
        }
        return d;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        if (this.f4817m9) {
            im9.m7707k4(C12003du.f40505to.Clone(), this.f4814jd.m64941c5(), m73209e0().Clone(), this.f4810c5.m651kk(), this.f4810c5.m653to());
            this.f4814jd.m64941c5().m69870wy().mo68794k4(m73209e0().Clone(), new azo(C12003du.m56385i5().Clone(), 0.15f), new C0962es(C12003du.f40505to.Clone()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m5566k4(int i, int i2, float f, float f2, C14713vw c14713vw) {
        boolean zM5565du = m5565du(c14713vw);
        if (i2 >= this.f4819x1.size()) {
            m5567k4(i, i2, f, c14713vw, zM5565du);
            return;
        }
        float fM5571m9 = this.f4819x1.get_Item(i2).m5571m9() + f;
        eka ekaVar = this.f4819x1.get_Item(i2);
        if (zM5565du) {
            ekaVar.m73217kk(fM5571m9 / c14713vw.m72556x1());
            this.f4819x1.get_Item(i2).m73222to((this.f4819x1.get_Item(i2).m5571m9() / fM5571m9) * c14713vw.m72556x1());
        } else {
            ekaVar.m73222to(fM5571m9 / c14713vw.m72555k4());
            this.f4819x1.get_Item(i2).m73217kk((this.f4819x1.get_Item(i2).m5571m9() / fM5571m9) * c14713vw.m72555k4());
        }
        float fM67481k4 = C14116yg.m67481k4((this.f4819x1.get_Item(i2).m73203ak() * 1.622305f) / this.f4819x1.get_Item(i2).m73225wy(), (this.f4819x1.get_Item(i2).m73225wy() * 2.511665f) / this.f4819x1.get_Item(i2).m73203ak());
        if (fM67481k4 > f2) {
            m5567k4(i, i2, f, c14713vw, zM5565du);
        } else {
            m5566k4(i, i2 + 1, f + this.f4819x1.get_Item(i2).m5571m9(), fM67481k4, c14713vw);
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        flt fltVar = this.f4818to;
        if (fltVar != null) {
            fltVar.m73208du(3.0f);
            this.f4818to.m73212h4((m73203ak() - this.f4818to.m73203ak()) - 3.0f);
        }
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m5567k4(int i, int i2, float f, C14713vw c14713vw, boolean z) {
        C14713vw c14713vw2;
        C14713vw c14713vw3;
        C14713vw c14713vw4 = new C14713vw(c14713vw.m72555k4(), c14713vw.m72556x1());
        float fM73225wy = this.f4811du;
        float fM73203ak = this.f4813h4;
        C14713vw c14713vw5 = c14713vw4;
        while (i < i2) {
            eka ekaVar = this.f4819x1.get_Item(i);
            if (z) {
                c14713vw2 = new C14713vw(f / c14713vw.m72556x1(), (this.f4819x1.get_Item(i).m5571m9() / f) * c14713vw.m72556x1());
                ekaVar.m73210fa(c14713vw2);
                this.f4819x1.get_Item(i).m73208du(fM73225wy);
                this.f4819x1.get_Item(i).m73212h4(fM73203ak);
                c14713vw3 = new C14713vw(c14713vw.m72555k4() - this.f4819x1.get_Item(i).m73225wy(), c14713vw.m72556x1());
                fM73203ak += this.f4819x1.get_Item(i).m73203ak();
            } else {
                c14713vw2 = new C14713vw((this.f4819x1.get_Item(i).m5571m9() / f) * c14713vw.m72555k4(), f / c14713vw.m72555k4());
                ekaVar.m73210fa(c14713vw2);
                this.f4819x1.get_Item(i).m73208du(fM73225wy);
                this.f4819x1.get_Item(i).m73212h4(fM73203ak);
                c14713vw3 = new C14713vw(c14713vw.m72555k4(), c14713vw.m72556x1() - this.f4819x1.get_Item(i).m73203ak());
                fM73225wy += this.f4819x1.get_Item(i).m73225wy();
            }
            c14713vw5 = c14713vw3;
            i++;
        }
        if (z) {
            this.f4811du = (c14713vw.m72555k4() - c14713vw5.m72555k4()) + this.f4811du;
        } else {
            this.f4813h4 = (c14713vw.m72556x1() - c14713vw5.m72556x1()) + this.f4813h4;
        }
        if (i2 < this.f4819x1.size()) {
            m5566k4(i2, i2, 0.0f, 2.1474836E9f, c14713vw5);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m5568k4(List<eka> list) {
        boolean z = true;
        for (int size = list.size(); size > 0 && z; size--) {
            z = false;
            for (int i = 1; i < size; i++) {
                int i2 = i - 1;
                if (list.get_Item(i2).m5572to() < list.get_Item(i).m5572to()) {
                    eka ekaVar = list.get_Item(i2);
                    list.set_Item(i2, list.get_Item(i));
                    list.set_Item(i, ekaVar);
                    z = true;
                }
            }
        }
    }

    public eka(C13847mr c13847mr, int i, int i2, int i3, int[] iArr, boolean z) {
        ChartDataPointLevel chartDataPointLevel;
        AbstractC14770x9 abstractC14770x9;
        flt fltVar;
        this.f4819x1 = new List<>();
        this.f4812dy = 0;
        C13847mr c13847mr2 = c13847mr;
        this.f4814jd = c13847mr2;
        ChartCategoryCollection chartCategoryCollection = (ChartCategoryCollection) c13847mr2.m64945h4().getChart().getChartData().getCategories();
        this.f4812dy = i2;
        if (i == -1) {
            this.f4817m9 = true;
            chartDataPointLevel = (ChartDataPointLevel) this.f4814jd.m64945h4().getDataPoints().get_Item(this.f4812dy).getDataPointLevels().get_Item(i + 1);
            fltVar = new flt(chartDataPointLevel, this.f4814jd.m64941c5());
        } else {
            int i4 = i2;
            int i5 = i4;
            Object objM523k4 = ((ChartCategory) chartCategoryCollection.get_Item(i2)).m523k4(i);
            while (i5 < i3) {
                Object objM523k42 = ((ChartCategory) chartCategoryCollection.get_Item(i5)).m523k4(i);
                if (objM523k42 != null && !C14113y2.m67363du(objM523k4.toString(), objM523k42.toString()) && !"".equals(objM523k42.toString())) {
                    iArr[0] = iArr[0] + 1;
                    eka ekaVar = new eka(c13847mr2, i - 1, i4, i5, iArr, false);
                    if (ekaVar.m5572to() <= 0.0d) {
                        i4 = i5;
                    } else {
                        this.f4819x1.addItem(ekaVar);
                        m73215k4(ekaVar);
                        i4 = i5;
                        objM523k4 = objM523k42;
                    }
                }
                i5++;
                c13847mr2 = c13847mr;
            }
            if (objM523k4 != null && !"".equals(objM523k4.toString())) {
                iArr[0] = iArr[0] + 1;
                eka ekaVar2 = new eka(c13847mr, i - 1, i4, i3, iArr, false);
                if (ekaVar2.m5572to() <= 0.0d) {
                    return;
                }
                this.f4819x1.addItem(ekaVar2);
                m73215k4(ekaVar2);
                if (!z || c13847mr.m64945h4().getParentLabelLayout() == 1 || this.f4819x1.size() <= 0) {
                    return;
                }
                chartDataPointLevel = (ChartDataPointLevel) this.f4814jd.m64945h4().getDataPoints().get_Item(this.f4812dy).getDataPointLevels().get_Item(i + 1);
                C13713k5 c13713k5 = new C13713k5(chartDataPointLevel, c13847mr.m64941c5());
                this.f4816kk = c13713k5;
                abstractC14770x9 = c13713k5;
                m73215k4(abstractC14770x9);
                this.f4810c5 = chartDataPointLevel;
            }
            this.f4817m9 = true;
            chartDataPointLevel = (ChartDataPointLevel) this.f4814jd.m64945h4().getDataPoints().get_Item(this.f4812dy).getDataPointLevels().get_Item(i + 1);
            fltVar = new flt(chartDataPointLevel, this.f4814jd.m64941c5());
        }
        this.f4818to = fltVar;
        abstractC14770x9 = fltVar;
        m73215k4(abstractC14770x9);
        this.f4810c5 = chartDataPointLevel;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73217kk(c14713vw.m72555k4());
        m73222to(c14713vw.m72556x1());
        float fM72555k4 = c14713vw.m72555k4();
        float fM72556x1 = c14713vw.m72556x1();
        flt fltVar = this.f4818to;
        if (fltVar != null) {
            fltVar.m73210fa(c14713vw);
        }
        this.f4811du = 0.0f;
        this.f4813h4 = 0.0f;
        C13713k5 c13713k5 = this.f4816kk;
        if (c13713k5 != null) {
            c13713k5.m73210fa(c14713vw);
            if (this.f4814jd.m64945h4().getParentLabelLayout() == 0) {
                this.f4813h4 += this.f4816kk.m73203ak();
                fM72556x1 -= this.f4816kk.m73203ak();
            }
        }
        if (this.f4819x1.size() == 0) {
            return;
        }
        m5569kk(new C14713vw(fM72555k4, fM72556x1));
        m5568k4(this.f4819x1);
        m5566k4(0, 0, 0.0f, 2.1474836E9f, new C14713vw(fM72555k4, fM72556x1));
    }
}
