package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class qma extends jk9 {
    public qma(double d, ChartSeries chartSeries, C0886d8[] c0886d8Arr) {
        super(d, chartSeries, c0886d8Arr);
    }

    @Override // com.aspose.slides.eca
    /* JADX INFO: renamed from: k4 */
    public void mo5410k4(double d, cdv[] cdvVarArr) {
        ((eca) this).f4736x1 = d;
        m5409k4(0.0d);
        for (cdv cdvVar : cdvVarArr) {
            double dM67475k4 = C14116yg.m67475k4(cdvVar.m4553jd());
            m5409k4(m5414m9() + dM67475k4);
            cdvVar.m4554k4(dM67475k4 / d);
        }
    }
}
