package com.aspose.slides;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14074ks;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class ehe extends AbstractC14770x9 {

    /* JADX INFO: renamed from: du */
    private boolean f4797du;

    /* JADX INFO: renamed from: h4 */
    private int f4798h4;

    /* JADX INFO: renamed from: k4 */
    private List<C14407ro> f4799k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC14770x9[] f4800kk;

    /* JADX INFO: renamed from: m9 */
    private int f4801m9;

    /* JADX INFO: renamed from: to */
    private C13847mr f4802to;

    /* JADX INFO: renamed from: x1 */
    private List<ehe> f4803x1;

    public ehe(C13847mr c13847mr) {
        int[] iArr;
        this.f4799k4 = new List<>();
        this.f4803x1 = new List<>();
        this.f4798h4 = 0;
        this.f4801m9 = 0;
        C13847mr c13847mr2 = c13847mr;
        this.f4802to = c13847mr2;
        ChartCategoryCollection chartCategoryCollection = (ChartCategoryCollection) c13847mr.m64945h4().getChart().getChartData().getCategories();
        if (chartCategoryCollection.size() == 0) {
            int i = 0;
            while (i < c13847mr.m64945h4().getDataPoints().size()) {
                int[] iArr2 = {i};
                int i2 = iArr2[0];
                ehe eheVar = new ehe(c13847mr2, -1, i2, i2 + 1, iArr2);
                int i3 = iArr2[0];
                this.f4803x1.addItem(eheVar);
                m73215k4((AbstractC14770x9) eheVar);
                i = i3 + 1;
                c13847mr2 = c13847mr;
            }
            return;
        }
        int iM4304k4 = (((ChartData) c13847mr.m64945h4().getChart().getChartData()).m553x1().mo5710kk() != 2 ? ((ChartCategory) chartCategoryCollection.get_Item(0)).m526x1().m4304k4() : chartCategoryCollection.getGroupingLevelCount()) - 1;
        this.f4801m9 = iM4304k4;
        List<KeyValuePair<Integer, String>> listM532k4 = chartCategoryCollection.m532k4(iM4304k4);
        int i4 = 0;
        int i5 = 0;
        while (true) {
            iArr = new int[]{i5};
            if (i4 >= listM532k4.size() - 1) {
                break;
            }
            int i6 = i4 + 1;
            ehe eheVar2 = new ehe(c13847mr, iM4304k4 - 1, listM532k4.get_Item(i4).getKey().intValue(), listM532k4.get_Item(i6).getKey().intValue(), iArr);
            i5 = iArr[0];
            if (eheVar2.m5544to() > 0.0d) {
                this.f4803x1.addItem(eheVar2);
                m73215k4((AbstractC14770x9) eheVar2);
            }
            i4 = i6;
        }
        ehe eheVar3 = new ehe(c13847mr, iM4304k4 - 1, ((Integer) ((KeyValuePair) OooO0O0.OooO00o(listM532k4, 1)).getKey()).intValue(), chartCategoryCollection.size(), iArr);
        if (eheVar3.m5544to() <= 0.0d) {
            return;
        }
        this.f4803x1.addItem(eheVar3);
        m73215k4((AbstractC14770x9) eheVar3);
    }

    /* JADX INFO: renamed from: dy */
    public final C14365qy m5541dy() {
        return this.f4802to.m64941c5();
    }

    /* JADX INFO: renamed from: m9 */
    public final ChartDataPointLevel m5543m9() {
        return (ChartDataPointLevel) this.f4802to.m64945h4().getDataPoints().get_Item(this.f4798h4).getDataPointLevels().get_Item(this.f4801m9 + 1);
    }

    /* JADX INFO: renamed from: to */
    public final double m5544to() {
        double dM5544to = 0.0d;
        if (this.f4797du) {
            ChartDataPoint chartDataPoint = (ChartDataPoint) this.f4802to.m64945h4().getDataPoints().get_Item(this.f4798h4);
            if (((ChartData) this.f4802to.m64941c5().m69834fa().getChartData()).m553x1().mo5710kk() == 2) {
                return chartDataPoint.getSizeValue().toDouble();
            }
            if (chartDataPoint.m601x6().m71989k4() == null) {
                return 0.0d;
            }
            return ((Double) C7019kk.m27464to(chartDataPoint.m601x6().m71989k4(), Double.TYPE)).doubleValue();
        }
        List.Enumerator<ehe> it = this.f4803x1.iterator();
        while (it.hasNext()) {
            try {
                dM5544to += it.next().m5544to();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return dM5544to;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        AbstractC14770x9 abstractC14770x9;
        for (int i = 0; i < this.f4799k4.size(); i++) {
            float fM72555k4 = c14713vw.m72555k4() - this.f4799k4.get_Item(i).m73225wy();
            float fM72556x1 = c14713vw.m72556x1() - this.f4799k4.get_Item(i).m73203ak();
            this.f4799k4.get_Item(i).m73208du(fM72555k4 / 2.0f);
            this.f4799k4.get_Item(i).m73212h4(fM72556x1 / 2.0f);
            this.f4799k4.get_Item(i).m73220ss();
            AbstractC14770x9[] abstractC14770x9Arr = this.f4800kk;
            if (abstractC14770x9Arr != null && (abstractC14770x9 = abstractC14770x9Arr[i]) != null) {
                ((flt) abstractC14770x9).m73366kk(m5540k4(this.f4799k4.get_Item(i), (flt) this.f4800kk[i], c14713vw));
                C12025x6 c12025x6Clone = C14873z5.m74322k4(this.f4799k4.get_Item(i).m70189m9().Clone(), (-this.f4800kk[i].m73225wy()) / 2.0f, (-this.f4800kk[i].m73203ak()) / 2.0f).Clone();
                this.f4800kk[i].m73208du(c12025x6Clone.m56897x1());
                this.f4800kk[i].m73212h4(c12025x6Clone.m56895kk());
                this.f4800kk[i].m73220ss();
            }
        }
        List.Enumerator<ehe> it = this.f4803x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().m73220ss();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5542k4(double d, double d2) {
        List.Enumerator<ehe> it = this.f4803x1.iterator();
        double dM5544to = 0.0d;
        while (it.hasNext()) {
            try {
                dM5544to += it.next().m5544to();
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        this.f4803x1.sort(new AbstractC14074ks<ehe>() { // from class: com.aspose.slides.ehe.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14074ks
            /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public int mo1193k4(ehe eheVar, ehe eheVar2) {
                return eheVar.m5544to() == eheVar2.m5544to() ? eheVar.f4798h4 > eheVar2.f4798h4 ? -1 : 1 : eheVar.m5544to() > eheVar2.m5544to() ? -1 : 1;
            }
        });
        this.f4800kk = new AbstractC14770x9[this.f4803x1.size()];
        double d3 = d;
        for (int i = 0; i < this.f4803x1.size(); i++) {
            if (this.f4803x1.get_Item(i).mo3221T_()) {
                if (dM5544to == 0.0d) {
                    dM5544to = 1.0d;
                }
                double dM67475k4 = C14116yg.m67475k4(this.f4803x1.get_Item(i).m5544to() / dM5544to);
                double d4 = dM67475k4 * d2;
                C14407ro c14407ro = new C14407ro(this.f4803x1.get_Item(i), d3, d4, dM67475k4, this.f4803x1.get_Item(i).m5544to());
                this.f4799k4.addItem(c14407ro);
                m73215k4(c14407ro);
                this.f4803x1.get_Item(i).m5542k4(d3, d4);
                if (this.f4803x1.get_Item(i).m5543m9().getLabel().isVisible()) {
                    flt fltVar = new flt(this.f4803x1.get_Item(i).m5543m9(), this.f4802to.m64941c5());
                    this.f4800kk[i] = fltVar;
                    fltVar.m6196k4((d4 / 2.0d) + d3);
                    m73215k4(fltVar);
                }
                d3 += d4;
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        AbstractC14770x9 abstractC14770x9;
        int iM67483k4 = C14116yg.m67483k4(this.f4802to.m64941c5().m69834fa().getChartData().getCategories().getGroupingLevelCount(), 1);
        C6005k4.m24262k4(c14713vw.m72555k4() == c14713vw.m72556x1(), "Must be square area");
        float fM72555k4 = (c14713vw.m72555k4() / 2.0f) / (iM67483k4 + 1);
        float f = fM72555k4 * (iM67483k4 - this.f4801m9);
        for (int i = 0; i < this.f4799k4.size(); i++) {
            float f2 = (f + fM72555k4) * 2.0f;
            mxy mxyVarM67813k4 = ((mxy) c14713vw).m67812h4().m67813k4(f2, f2);
            this.f4799k4.get_Item(i).m73210fa(new C1128g1(f, mxyVarM67813k4.m72555k4(), mxyVarM67813k4.m72556x1(), mxyVarM67813k4.m67814to(), mxyVarM67813k4.m67811du()));
            AbstractC14770x9[] abstractC14770x9Arr = this.f4800kk;
            if (abstractC14770x9Arr != null && (abstractC14770x9 = abstractC14770x9Arr[i]) != null) {
                abstractC14770x9.m73210fa(new C14713vw(6.0f + fM72555k4, c14713vw.m72556x1()));
            }
        }
        List.Enumerator<ehe> it = this.f4803x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().m73210fa(c14713vw);
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m5540k4(C14407ro c14407ro, flt fltVar, C14713vw c14713vw) {
        C12025x6 c12025x6Clone = m73223ts().Clone();
        double dM5527fa = c14407ro.m5527fa();
        float fM70190to = c14407ro.m70190to();
        double dM5535up = c14407ro.m5535up();
        double d = fM70190to;
        C12025x6 c12025x6Clone2 = C14873z5.m74319k4(dM5527fa, d, c12025x6Clone.Clone()).Clone();
        C12025x6 c12025x6Clone3 = C14873z5.m74319k4(dM5527fa + dM5535up, d, c12025x6Clone.Clone()).Clone();
        return C14113y2.m67411k4(fltVar.m64877dy()) || C7019kk.m27462to(Float.valueOf(fltVar.m73368yj()[0].m56575x1()), 13) <= C7019kk.m27462to(Double.valueOf(C14116yg.m67496rv(C14116yg.m67469du((double) C14116yg.m67480k4(c12025x6Clone2.m56895kk() - c12025x6Clone3.m56895kk()), 2.0d) + C14116yg.m67469du((double) C14116yg.m67480k4(c12025x6Clone2.m56897x1() - c12025x6Clone3.m56897x1()), 2.0d))), 14);
    }

    private ehe(C13847mr c13847mr, int i, int i2, int i3, int[] iArr) {
        this.f4799k4 = new List<>();
        this.f4803x1 = new List<>();
        this.f4802to = c13847mr;
        this.f4801m9 = i;
        this.f4798h4 = i2;
        if (i == -1) {
            this.f4797du = true;
            return;
        }
        ChartCategoryCollection chartCategoryCollection = (ChartCategoryCollection) c13847mr.m64945h4().getChart().getChartData().getCategories();
        Object objM523k4 = ((ChartCategory) chartCategoryCollection.get_Item(i2)).m523k4(i);
        int i4 = i2;
        for (int i5 = i4; i5 < i3; i5++) {
            Object objM523k42 = ((ChartCategory) chartCategoryCollection.get_Item(i5)).m523k4(i);
            if (objM523k42 != null && !C14113y2.m67363du(objM523k4.toString(), objM523k42.toString()) && !"".equals(objM523k42.toString())) {
                iArr[0] = iArr[0] + 1;
                ehe eheVar = new ehe(c13847mr, i - 1, i4, i5, iArr);
                this.f4803x1.addItem(eheVar);
                m73215k4((AbstractC14770x9) eheVar);
                i4 = i5;
                objM523k4 = objM523k42;
            }
        }
        if (objM523k4 == null || "".equals(objM523k4.toString())) {
            this.f4797du = true;
            return;
        }
        iArr[0] = iArr[0] + 1;
        ehe eheVar2 = new ehe(c13847mr, i - 1, i4, i3, iArr);
        this.f4803x1.addItem(eheVar2);
        m73215k4((AbstractC14770x9) eheVar2);
    }
}
