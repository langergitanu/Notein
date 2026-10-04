package com.aspose.slides;

import android.content.Context;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12023wl;

/* JADX INFO: renamed from: com.aspose.slides.q5 */
/* JADX INFO: loaded from: classes3.dex */
class C14328q5 {

    /* JADX INFO: renamed from: h4 */
    private int f48245h4;

    /* JADX INFO: renamed from: kk */
    private C14365qy f48247kk;

    /* JADX INFO: renamed from: m9 */
    private int f48248m9;

    /* JADX INFO: renamed from: to */
    private DataTable f48249to;

    /* JADX INFO: renamed from: x1 */
    private List<s8k> f48250x1;

    /* JADX INFO: renamed from: k4 */
    C12014ne f48246k4 = C12014ne.f40546k4.Clone();

    /* JADX INFO: renamed from: du */
    private C12023wl f48244du = C12023wl.f40585k4.Clone();

    public C14328q5(DataTable dataTable, C14365qy c14365qy) {
        this.f48247kk = c14365qy;
        if (c14365qy.m69834fa().hasDataTable()) {
            m69411x1(0);
            m69403k4(0);
            this.f48250x1 = new List<>();
            m69404k4(dataTable);
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final int m69398c5() {
        return this.f48248m9;
    }

    /* JADX INFO: renamed from: du */
    public final C12003du m69399du() {
        Chart chartM69834fa = this.f48247kk.m69834fa();
        return chartM69834fa.m507k4(((DataTable) C7019kk.m27452k4((Object) chartM69834fa.getChartDataTable(), DataTable.class)).getTextFormat(), ((chartM69834fa.m517up().m63294k4() && chartM69834fa.getThemeManager().isOverrideThemeEnabled()) ? ((ColorFormat) chartM69834fa.getThemeManager().getOverrideTheme().getColorScheme().getDark1()).m1084to() : ((C14870z2) ((fuq) chartM69834fa.getSlide().createThemeEffective()).m6304k4(C12003du.f40505to.Clone())).m74203k4()).Clone().Clone());
    }

    /* JADX INFO: renamed from: dy */
    public final int m69400dy() {
        return this.f48245h4;
    }

    /* JADX INFO: renamed from: h4 */
    public final C12023wl m69401h4() {
        return this.f48244du;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX INFO: renamed from: k4 */
    public final C12003du m69402k4() {
        im9.m7690k4(((this.f48247kk.m69834fa().m517up().m63294k4() && this.f48247kk.m69834fa().getThemeManager().isOverrideThemeEnabled()) ? ((ColorFormat) this.f48247kk.m69834fa().getThemeManager().getOverrideTheme().getColorScheme().getDark1()).m1084to() : ((C14870z2) ((fuq) this.f48247kk.m69834fa().getSlide().createThemeEffective()).m6304k4(C12003du.f40505to.Clone())).m74203k4()).Clone().Clone(), 0.75d);
        return Context.getPackageManager();
    }

    /* JADX INFO: renamed from: kk */
    public final C12013m9 m69407kk() {
        Chart chartM69834fa = this.f48247kk.m69834fa();
        return chartM69834fa.m509k4(((DataTable) C7019kk.m27452k4((Object) chartM69834fa.getChartDataTable(), DataTable.class)).getTextFormat());
    }

    /* JADX INFO: renamed from: m9 */
    public final C14365qy m69408m9() {
        return this.f48247kk;
    }

    /* JADX INFO: renamed from: to */
    public final C12013m9 m69409to() {
        return C12013m9.m56630k4(m69407kk().m56651x1(), (m69407kk().m56639dy() * 0.75f) / im9.m7679k4(), m69407kk().m56642jd());
    }

    /* JADX INFO: renamed from: x1 */
    public final List<s8k> m69410x1() {
        return this.f48250x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m69411x1(int i) {
        this.f48248m9 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69403k4(int i) {
        this.f48245h4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69404k4(DataTable dataTable) {
        this.f48249to = dataTable;
        List<C13847mr> listM69865up = this.f48247kk.m69865up();
        for (int i = 0; i < listM69865up.size(); i++) {
            C13847mr c13847mr = listM69865up.get_Item(i);
            s8k s8kVar = new s8k((Chart) dataTable.getChart());
            s8kVar.m70486k4(c13847mr.m64957kk());
            s8kVar.m70482k4(1);
            s8kVar.m70484k4(c13847mr);
            this.f48250x1.addItem(s8kVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69405k4(C11896dy c11896dy, float f, float f2) {
        C12003du c12003duClone = m69402k4().Clone();
        C12003du c12003duClone2 = C12003du.f40505to.Clone();
        LineFormat lineFormat = (LineFormat) this.f48249to.getFormat().getLine();
        FillFormat fillFormat = (FillFormat) this.f48249to.getFormat().getFill();
        azo azoVarM7718x1 = im9.m7718x1(c12003duClone.Clone(), lineFormat, this.f48247kk, (float) lineFormat.getEffective().getWidth());
        azoVarM7718x1.f4054h4 = im9.m7685k4(c12003duClone.Clone(), (LineFillFormat) lineFormat.getFillFormat(), this.f48247kk, 1.0f, c11896dy);
        C0962es c0962esM7684k4 = im9.m7684k4(c12003duClone2.Clone(), fillFormat, this.f48247kk, 1.0f, c11896dy);
        if (ChartTypeCharacterizer.isChartTypeBar(this.f48247kk.m69834fa().getType()) || !this.f48247kk.m69834fa().getRotation3D().getRightAngleAxes()) {
            return;
        }
        C12007ix c12007ixClone = this.f48247kk.m69855qm().Clone();
        C11896dy c11896dy2 = (C11896dy) c11896dy.deepClone();
        try {
            this.f48247kk.m69832dy().m7391k4(c12007ixClone.Clone(), c0962esM7684k4, azoVarM7718x1, c11896dy2, f, f2);
        } finally {
            if (c11896dy2 != null) {
                c11896dy2.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69406k4(C12023wl c12023wl) {
        c12023wl.CloneTo(this.f48244du);
    }
}
