package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.internal.p464vq.AbstractC11829uo;
import com.aspose.slides.internal.p464vq.C11707b3;
import com.aspose.slides.internal.p464vq.C11736ek;
import com.aspose.slides.internal.p464vq.C11752he;
import com.aspose.slides.internal.p464vq.C11786nk;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11803r9;
import com.aspose.slides.internal.p464vq.C11810sc;
import com.aspose.slides.internal.p464vq.C11822tu;
import com.aspose.slides.internal.p464vq.C11846x0;
import com.aspose.slides.internal.p464vq.C11859yd;
import com.aspose.slides.internal.p464vq.C11867z9;
import com.aspose.slides.internal.p482wr.C12275wy;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class ik7 {

    /* JADX INFO: renamed from: k4 */
    private ctu f5722k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f5723x1 = false;

    /* JADX INFO: renamed from: du */
    private void m7657du(C11867z9 c11867z9, ChartDataWorkbook chartDataWorkbook) {
        if (chartDataWorkbook.m671h4().m70133uz().getCountOfCustomProperties() > 0) {
            C11791os c11791osM55394k4 = c11867z9.m55394k4("/docProps/custom.xml", (AbstractC11760jd.k4) null, new C11707b3());
            c11867z9.m55390dy().m55311x1(c11791osM55394k4);
            new C13708k0(c11791osM55394k4, this.f5722k4).m63592x1(chartDataWorkbook.m671h4().m70133uz());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC11829uo m7658k4(int i) {
        if (i == 0) {
            return new C11803r9();
        }
        if (i == 1) {
            return new C11846x0();
        }
        if (i == 2) {
            return new C11822tu();
        }
        if (i == 3) {
            return new C11736ek();
        }
        throw new ArgumentOutOfRangeException("outputType");
    }

    /* JADX INFO: renamed from: kk */
    private void m7661kk(C11867z9 c11867z9, ChartDataWorkbook chartDataWorkbook) {
        if (c11867z9.m55392h4("/docProps/core.xml") != null) {
            return;
        }
        C11791os c11791osM55394k4 = c11867z9.m55394k4("/docProps/core.xml", (AbstractC11760jd.k4) null, new C11859yd());
        new C14565tk(c11791osM55394k4, this.f5722k4).m71240x1(chartDataWorkbook.m671h4().m70133uz());
        c11867z9.m55390dy().m55311x1(c11791osM55394k4);
    }

    /* JADX INFO: renamed from: to */
    private void m7662to(C11867z9 c11867z9, ChartDataWorkbook chartDataWorkbook) {
        C11791os c11791osM55394k4 = c11867z9.m55394k4("/docProps/app.xml", (AbstractC11760jd.k4) null, new C11752he());
        new C14668v9(c11791osM55394k4, this.f5722k4).m72098k4(chartDataWorkbook.m671h4().m70133uz(), (IPresentation) null);
        c11867z9.m55390dy().m55311x1(c11791osM55394k4);
    }

    /* JADX INFO: renamed from: x1 */
    private void m7663x1(C11867z9 c11867z9, ChartDataWorkbook chartDataWorkbook) {
        C11791os c11791osM55394k4 = c11867z9.m55394k4("/xl/styles.xml", (AbstractC11760jd.k4) null, new C11810sc());
        new q0e(c11791osM55394k4, this.f5722k4).m69353x1(chartDataWorkbook);
        c11867z9.m55445ix().m55377up().m55311x1(c11791osM55394k4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m7659k4(ChartDataWorkbook chartDataWorkbook, C11791os c11791os) {
        rhq rhqVarM671h4 = chartDataWorkbook.m671h4();
        ykd.m73921k4(c11791os, rhqVarM671h4.m70104ix(), rhqVarM671h4.m70131u4());
        Iterator<ipw> it = rhqVarM671h4.m70104ix().iterator();
        while (it.hasNext()) {
            ykd.m73922k4(this.f5722k4.mo4812qm(), it.next());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m7664k4(ChartDataWorkbook chartDataWorkbook, C12275wy c12275wy, int i) {
        if (this.f5723x1) {
            throw new Exception("XlsxSerializator instance can call WriteWorkbookToZipFile() method only once.");
        }
        this.f5723x1 = true;
        C11867z9 c11867z9 = new C11867z9();
        this.f5722k4 = new ctu(c11867z9, chartDataWorkbook);
        if (chartDataWorkbook.m670fa() != null) {
            chartDataWorkbook.m672jd();
        }
        chartDataWorkbook.f1429x1.m64842k4();
        C11791os c11791osM55394k4 = c11867z9.m55394k4("/xl/workbook.xml", (AbstractC11760jd.k4) null, m7658k4(chartDataWorkbook.m685kk()));
        m7659k4(chartDataWorkbook, c11791osM55394k4);
        new pjq(c11791osM55394k4, this.f5722k4).m69119x1(chartDataWorkbook);
        c11867z9.m55390dy().m55311x1(c11791osM55394k4);
        m7661kk(c11867z9, chartDataWorkbook);
        m7662to(c11867z9, chartDataWorkbook);
        m7657du(c11867z9, chartDataWorkbook);
        m7663x1(c11867z9, chartDataWorkbook);
        m7660k4(c11867z9, chartDataWorkbook);
        c11867z9.m55399k4(c12275wy);
    }

    /* JADX INFO: renamed from: k4 */
    private void m7660k4(C11867z9 c11867z9, ChartDataWorkbook chartDataWorkbook) {
        C11791os c11791osM55394k4 = c11867z9.m55394k4("/xl/sharedStrings.xml", (AbstractC11760jd.k4) null, new C11786nk());
        new se2(c11791osM55394k4, this.f5722k4).m70601x1(chartDataWorkbook);
        c11867z9.m55445ix().m55377up().m55311x1(c11791osM55394k4);
    }
}
