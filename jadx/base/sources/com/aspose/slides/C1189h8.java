package com.aspose.slides;

import android.content.Context;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12014ne;

/* JADX INFO: renamed from: com.aspose.slides.h8 */
/* JADX INFO: loaded from: classes3.dex */
class C1189h8 {

    /* JADX INFO: renamed from: du */
    private final C14365qy f5454du;

    /* JADX INFO: renamed from: h4 */
    private Object f5455h4;

    /* JADX INFO: renamed from: m9 */
    private Format f5458m9;

    /* JADX INFO: renamed from: k4 */
    C12014ne f5456k4 = new C12014ne();

    /* JADX INFO: renamed from: x1 */
    C12007ix f5460x1 = new C12007ix();

    /* JADX INFO: renamed from: kk */
    C12007ix f5457kk = new C12007ix();

    /* JADX INFO: renamed from: to */
    C12007ix f5459to = new C12007ix();

    public C1189h8(Format format, C14365qy c14365qy, Object obj) {
        m7068k4(format);
        this.f5454du = c14365qy;
        this.f5455h4 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r0v17, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX INFO: renamed from: kk */
    private C12003du m7069kk() {
        int style = this.f5454du.m69834fa().getStyle();
        int i = style + 1;
        if ((C7019kk.m27469x1(this.f5455h4, ChartPlotArea.class) || C7019kk.m27469x1(this.f5455h4, IChartPlotArea.class)) && i > 32) {
            if (i <= 34) {
                im9.m7690k4(this.f5454du.m69834fa().m506k4((byte) 0).Clone().Clone(), 0.5d);
                return Context.getPackageManager();
            }
            if (i <= 40) {
                im9.m7690k4(this.f5454du.m69834fa().m506k4((byte) (style - 33)).Clone().Clone(), 0.2d);
                return Context.getPackageManager();
            }
            im9.m7690k4(this.f5454du.m69834fa().m506k4((byte) 0).Clone().Clone(), 0.95d);
            return Context.getPackageManager();
        }
        return C12003du.f40505to.Clone();
    }

    /* JADX INFO: renamed from: to */
    private C12003du m7070to() {
        return C12003du.f40505to.Clone();
    }

    /* JADX INFO: renamed from: x1 */
    private Format m7071x1() {
        return this.f5458m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7072k4() {
        C12003du c12003duClone;
        C12003du c12003duClone2;
        C14365qy c14365qy;
        C12007ix c12007ixM56544k4;
        C12003du c12003duClone3 = m7070to().Clone();
        C12003du c12003duClone4 = m7069kk().Clone();
        if (this.f5454du.m69834fa().m512kk()) {
            if (im9.m7716k4(this.f5460x1.Clone(), this.f5454du.m69855qm().Clone(), this.f5454du, m7071x1().getEffect3D(), m7071x1().getFill(), m7071x1().getLine(), c12003duClone4.Clone(), c12003duClone3.Clone())) {
                return;
            }
            im9.m7699k4(c12003duClone3.Clone(), c12003duClone4.Clone(), this.f5454du, this.f5460x1.Clone(), m7071x1(), C7019kk.m27469x1(this.f5455h4, IChartPlotArea.class));
            c12003duClone = c12003duClone3.Clone();
            c12003duClone2 = c12003duClone4.Clone();
            c14365qy = this.f5454du;
            c12007ixM56544k4 = this.f5460x1;
        } else {
            if (im9.m7716k4(C12007ix.m56544k4(this.f5456k4).Clone(), this.f5454du.m69855qm().Clone(), this.f5454du, m7071x1().getEffect3D(), m7071x1().getFill(), m7071x1().getLine(), c12003duClone4.Clone(), c12003duClone3.Clone())) {
                return;
            }
            im9.m7699k4(c12003duClone3.Clone(), c12003duClone4.Clone(), this.f5454du, C12007ix.m56544k4(this.f5456k4).Clone(), m7071x1(), C7019kk.m27469x1(this.f5455h4, IChartPlotArea.class));
            c12003duClone = c12003duClone3.Clone();
            c12003duClone2 = c12003duClone4.Clone();
            c14365qy = this.f5454du;
            c12007ixM56544k4 = C12007ix.m56544k4(this.f5456k4);
        }
        im9.m7698k4(c12003duClone, c12003duClone2, c14365qy, c12007ixM56544k4.Clone(), m7071x1());
    }

    /* JADX INFO: renamed from: k4 */
    private void m7068k4(Format format) {
        this.f5458m9 = format;
    }
}
