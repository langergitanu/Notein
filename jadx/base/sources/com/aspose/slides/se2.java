package com.aspose.slides;

import com.aspose.slides.internal.p464vq.C11791os;

/* JADX INFO: loaded from: classes3.dex */
class se2 extends uaw {
    public se2(C11791os c11791os, ctu ctuVar) {
        super(c11791os, ctuVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70600k4(ChartDataWorkbook chartDataWorkbook) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "sst".equals(m55443jd().mo65023fa())) {
                com.aspose.slides.internal.p332p7.ctm ctmVar = new com.aspose.slides.internal.p332p7.ctm(m55443jd());
                for (com.aspose.slides.internal.p332p7.mhp mhpVar : ctmVar.m29815k4()) {
                    chartDataWorkbook.f1429x1.m64839k4(mhpVar);
                }
                chartDataWorkbook.f1429x1.m64843k4(ctmVar.m29816x1());
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m70601x1(ChartDataWorkbook chartDataWorkbook) {
        mo55332up();
        com.aspose.slides.internal.p332p7.ctm ctmVar = new com.aspose.slides.internal.p332p7.ctm();
        ctmVar.m29817x1(chartDataWorkbook.f1429x1.f46216x1);
        ctmVar.m29812k4(chartDataWorkbook.f1429x1.f46213k4);
        for (int i = 0; i < chartDataWorkbook.f1429x1.m64845x1(); i++) {
            ctmVar.m29814k4(chartDataWorkbook.f1429x1.m64846x1(i));
        }
        ctmVar.m29813k4(chartDataWorkbook.f1429x1.m64844kk());
        ctmVar.mo6846k4(null, m55442ck(), "sst");
        mo55333yj();
    }

    public se2(C11791os c11791os, hxc hxcVar) {
        super(c11791os, hxcVar);
    }
}
