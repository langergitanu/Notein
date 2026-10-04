package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3126c5;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p474wg.AbstractC11956my;
import com.aspose.slides.internal.p474wg.AbstractC11994yg;
import com.aspose.slides.internal.p541z6.C13447k4;
import com.aspose.slides.internal.p541z6.C13452x1;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class oaj implements ett {

    /* JADX INFO: renamed from: du */
    private final Chart f47728du;

    /* JADX INFO: renamed from: h4 */
    private String f47729h4;

    /* JADX INFO: renamed from: k4 */
    private int f47730k4;

    /* JADX INFO: renamed from: kk */
    private int f47731kk;

    /* JADX INFO: renamed from: to */
    private ChartDataWorkbook f47732to;

    /* JADX INFO: renamed from: x1 */
    private C3152yj f47733x1;

    public oaj(Chart chart) {
        this.f47728du = chart;
        m68428x1(0);
    }

    /* JADX INFO: renamed from: c5 */
    public final String m68429c5() {
        return this.f47729h4;
    }

    @Override // com.aspose.slides.ett
    /* JADX INFO: renamed from: du */
    public final C3152yj mo5701du() {
        AbstractC3150x6 abstractC3150x6M68427x1;
        C3152yj c3152yj = new C3152yj();
        if (mo5710kk() == 2) {
            this.f47732to.m680k4(c3152yj);
        } else {
            if (mo5711m9() == 1) {
                abstractC3150x6M68427x1 = m68427x1(mo5703h4());
                if (abstractC3150x6M68427x1 == null) {
                    throw new NotImplementedException("External workbook is not available or can't be loaded.");
                }
            } else {
                abstractC3150x6M68427x1 = this.f47733x1;
            }
            m68426k4(abstractC3150x6M68427x1, c3152yj);
        }
        c3152yj.setPosition(0L);
        return c3152yj;
    }

    @Override // com.aspose.slides.ett
    /* JADX INFO: renamed from: dy */
    public final C3152yj mo5702dy() {
        return this.f47733x1;
    }

    @Override // com.aspose.slides.ett
    /* JADX INFO: renamed from: h4 */
    public final String mo5703h4() {
        Chart chart = this.f47728du;
        if (chart == null || chart.mo268du() == null || mo5711m9() != 1) {
            return null;
        }
        return this.f47728du.mo268du().m5166fa();
    }

    @Override // com.aspose.slides.ett
    /* JADX INFO: renamed from: k4 */
    public final void mo5704k4() {
        String str;
        int iMo5711m9 = mo5711m9();
        if (iMo5711m9 != 0) {
            if (iMo5711m9 != 1 || mo5710kk() != 0) {
                return;
            }
            Presentation presentation = (Presentation) this.f47728du.getPresentation();
            m68428x1(1);
            C3152yj c3152yjM68427x1 = m68427x1(mo5703h4());
            this.f47733x1 = c3152yjM68427x1;
            if (c3152yjM68427x1 == null) {
                if (!presentation.m2349du().getSpreadsheetOptions().getRecoverWorkbookFromChartCache()) {
                    m68428x1(0);
                    throw new InvalidOperationException("Chart uses external workbook. External workbook is not available or can't be loaded.");
                }
                ChartDataWorkbook chartDataWorkbook = new ChartDataWorkbook(this.f47728du.getChartData());
                this.f47732to = chartDataWorkbook;
                chartDataWorkbook.m691x1(m68429c5());
                oen.m68488k4(this.f47732to, this.f47728du.getChartData());
                C14430s2.m70427k4(this.f47728du.getChartData());
                this.f47728du.mo268du().m5169k4((byte) 0);
                m68428x1(2);
                C6005k4.m24264to("CHART: External workbook has been recovered and loaded");
            }
            oen.m68492k4(this.f47728du, mo5702dy());
            C14430s2.m70427k4(this.f47728du.getChartData());
            this.f47733x1 = null;
            m68428x1(2);
            str = "CHART: External workbook has been loaded";
        } else if (mo5710kk() == 0 && mo5702dy() != null) {
            m68428x1(1);
            oen.m68492k4(this.f47728du, mo5702dy());
            this.f47733x1 = null;
            C14430s2.m70427k4(this.f47728du.getChartData());
            m68428x1(2);
            str = "CHART: Embedded workbook has been loaded";
        } else {
            if (this.f47732to != null) {
                return;
            }
            m68428x1(1);
            ChartDataWorkbook chartDataWorkbook2 = new ChartDataWorkbook(this.f47728du.getChartData());
            this.f47732to = chartDataWorkbook2;
            chartDataWorkbook2.m691x1(m68429c5());
            m68428x1(2);
            str = "CHART: Workbook has been created";
        }
        C6005k4.m24264to(str);
    }

    @Override // com.aspose.slides.ett
    /* JADX INFO: renamed from: kk */
    public final int mo5710kk() {
        return this.f47730k4;
    }

    @Override // com.aspose.slides.ett
    /* JADX INFO: renamed from: m9 */
    public final int mo5711m9() {
        Chart chart = this.f47728du;
        return (chart == null || chart.mo268du() == null || this.f47728du.mo268du().m5163ck() != 1) ? 0 : 1;
    }

    @Override // com.aspose.slides.ett
    /* JADX INFO: renamed from: to */
    public final int mo5712to() {
        return mo5710kk() == 2 ? ((ChartDataWorkbook) mo5713x1()).m685kk() : this.f47731kk;
    }

    @Override // com.aspose.slides.ett
    /* JADX INFO: renamed from: x1 */
    public final IChartDataWorkbook mo5713x1() {
        mo5704k4();
        return this.f47732to;
    }

    /* JADX INFO: renamed from: x1 */
    private C3152yj m68427x1(String str) {
        String strM3658k4 = C0754al.m3658k4(str);
        if (C14113y2.m67411k4(strM3658k4)) {
            throw new InvalidDataException("External workbook path is empty");
        }
        ny0 ny0Var = new ny0(strM3658k4);
        LoadOptions loadOptionsM2349du = ((Presentation) C7019kk.m27452k4((Object) this.f47728du.getPresentation(), Presentation.class)).m2349du();
        int iResourceLoading = (loadOptionsM2349du == null || loadOptionsM2349du.getResourceLoadingCallback() == null) ? 0 : loadOptionsM2349du.getResourceLoadingCallback().resourceLoading(ny0Var);
        if (iResourceLoading != 0) {
            if (iResourceLoading == 1) {
                return null;
            }
            if (iResourceLoading != 2) {
                throw new NotImplementedException("External workbook is not available or can't be loaded.");
            }
            try {
                if (ny0Var.m68286k4() == null || ny0Var.m68286k4().length <= 0) {
                    return null;
                }
                if (!C14113y2.m67363du(this.f47728du.mo268du().m5166fa(), strM3658k4)) {
                    this.f47728du.mo268du().m5187x1(strM3658k4);
                }
                return new C3152yj(ny0Var.m68286k4());
            } catch (RuntimeException unused) {
                throw new InvalidOperationException("Chart uses external workbook. External workbook is not available or can't be loaded.");
            }
        }
        if (C14113y2.m67448x1(strM3658k4, "file:///")) {
            C3126c5 c3126c5 = new C3126c5(C14113y2.m67401k4(strM3658k4, "file:///", C14113y2.f47374k4));
            if (!c3126c5.m13333k4()) {
                return null;
            }
            if (!C14113y2.m67424kk(C14113y2.m67368h4(strM3658k4), ".xlsx") && !C14113y2.m67424kk(C14113y2.m67368h4(strM3658k4), ".xls")) {
                throw new NotImplementedException("Workbook format is not supported");
            }
            byte[] bArrM13362m9 = C3131h4.m13362m9(c3126c5.m13430h4());
            if (!C14113y2.m67363du(this.f47728du.mo268du().m5166fa(), strM3658k4)) {
                this.f47728du.mo268du().m5187x1(strM3658k4);
            }
            return new C3152yj(bArrM13362m9);
        }
        if (C14113y2.m67429to(strM3658k4, ':') <= 1) {
            return null;
        }
        try {
            AbstractC11956my abstractC11956myMo56227qq = AbstractC11994yg.m56286x1(strM3658k4).mo56227qq();
            try {
                AbstractC3150x6 abstractC3150x6Mo56080h4 = abstractC11956myMo56227qq.mo56080h4();
                try {
                    C3152yj c3152yj = new C3152yj(C13447k4.m62559k4(abstractC3150x6Mo56080h4));
                    abstractC11956myMo56227qq.dispose();
                    return c3152yj;
                } finally {
                    if (abstractC3150x6Mo56080h4 != null) {
                        abstractC3150x6Mo56080h4.dispose();
                    }
                }
            } catch (Throwable th) {
                if (abstractC11956myMo56227qq != null) {
                    abstractC11956myMo56227qq.dispose();
                }
                throw th;
            }
        } catch (RuntimeException e) {
            throw new InvalidOperationException("Error occurred during loading workbook: " + e);
        }
    }

    @Override // com.aspose.slides.ett
    /* JADX INFO: renamed from: k4 */
    public final void mo5705k4(int i) {
        C6005k4.m24261k4(mo5710kk() != 2);
        this.f47731kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    private void m68428x1(int i) {
        this.f47730k4 = i;
    }

    @Override // com.aspose.slides.ett
    /* JADX INFO: renamed from: k4 */
    public final void mo5706k4(IChartDataCell iChartDataCell) {
        if (mo5711m9() != 0) {
            return;
        }
        ChartDataCell chartDataCell = (ChartDataCell) C7019kk.m27452k4((Object) iChartDataCell, ChartDataCell.class);
        if (iChartDataCell != null && chartDataCell.m572kk() != mo5713x1()) {
            throw new InvalidOperationException("Wrong workbook has been used. Chart uses another workbook as a data source.");
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m68426k4(AbstractC3150x6 abstractC3150x6, AbstractC3150x6 abstractC3150x62) {
        abstractC3150x6.setPosition(0L);
        byte[] bArr = new byte[4096];
        while (true) {
            int i = abstractC3150x6.read(bArr, 0, 4096);
            if (i <= 0) {
                abstractC3150x62.setPosition(0L);
                return;
            }
            abstractC3150x62.write(bArr, 0, i);
        }
    }

    @Override // com.aspose.slides.ett
    /* JADX INFO: renamed from: x1 */
    public final void mo5714x1(C3152yj c3152yj) {
        this.f47733x1 = c3152yj;
    }

    @Override // com.aspose.slides.ett
    /* JADX INFO: renamed from: k4 */
    public final void mo5707k4(C3152yj c3152yj) {
        if (c3152yj != null) {
            if (mo5710kk() != 2) {
                C3152yj c3152yj2 = new C3152yj();
                this.f47733x1 = c3152yj2;
                m68426k4(c3152yj, c3152yj2);
                mo5704k4();
                return;
            }
            C14047bz c14047bzClone = C14047bz.m66536x1().Clone();
            try {
                v7f.m72086k4(c14047bzClone.Clone());
                ChartDataWorkbook chartDataWorkbook = new ChartDataWorkbook(this.f47728du.getChartData(), c3152yj, C13452x1.f45039k4, InterruptionToken.getNone());
                this.f47732to = chartDataWorkbook;
                chartDataWorkbook.m691x1(m68429c5());
                v7f.m72084k4(c14047bzClone.Clone(), c3152yj);
            } catch (RuntimeException e) {
                v7f.m72090x1(c14047bzClone.Clone());
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m68430k4(String str) {
        this.f47729h4 = str;
    }

    @Override // com.aspose.slides.ett
    /* JADX INFO: renamed from: k4 */
    public final void mo5708k4(String str, boolean z) {
        this.f47728du.mo268du().m5187x1(str);
        m68428x1(0);
        this.f47728du.mo268du().m5169k4((byte) 1);
        if (z) {
            this.f47733x1 = m68427x1(mo5703h4());
            oen.m68492k4(this.f47728du, mo5702dy());
            m68428x1(2);
            C14430s2.m70427k4(this.f47728du.getChartData());
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.aspose.slides.ett
    /* JADX INFO: renamed from: k4 */
    public final boolean mo5709k4(AbstractC3150x6 abstractC3150x6, List<String> list, C13452x1 c13452x1, InterruptionToken interruptionToken) {
        boolean z;
        if (abstractC3150x6 != null) {
            try {
                ChartDataWorkbook chartDataWorkbook = new ChartDataWorkbook(this.f47728du.getChartData(), abstractC3150x6, c13452x1, interruptionToken);
                this.f47732to = chartDataWorkbook;
                chartDataWorkbook.m691x1(m68429c5());
                List.Enumerator<String> it = list.iterator();
                while (true) {
                    try {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        if (!this.f47732to.m689to(it.next())) {
                            z = false;
                            break;
                        }
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            } catch (RuntimeException e) {
                C3085sv.m13082k4(e);
                ChartDataWorkbook chartDataWorkbook2 = new ChartDataWorkbook(this.f47728du.getChartData());
                this.f47732to = chartDataWorkbook2;
                chartDataWorkbook2.m691x1(m68429c5());
                return false;
            }
        } else {
            z = false;
        }
        if (z && abstractC3150x6 != null) {
            return true;
        }
        ChartDataWorkbook chartDataWorkbook3 = new ChartDataWorkbook(this.f47728du.getChartData());
        this.f47732to = chartDataWorkbook3;
        chartDataWorkbook3.m691x1(m68429c5());
        return false;
    }
}
