package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: loaded from: classes3.dex */
class hqr {

    /* JADX INFO: renamed from: k4 */
    private AbstractC14353qn f5566k4;

    public hqr(C14237oh c14237oh, C0974f2 c0974f2) {
        int iM762k4 = ChartTypeCharacterizer.m762k4(c0974f2.m7149to().m69834fa().getChartData().getSeries().get_Item(0).getType());
        this.f5566k4 = iM762k4 != 2 ? iM762k4 != 4 ? new zeg(c14237oh, c0974f2) : new a0f(c14237oh, c0974f2) : new C0837c0(c14237oh, c0974f2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7280k4(C14713vw c14713vw) {
        this.f5566k4.mo3141k4(c14713vw);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m7281k4(C12025x6[] c12025x6Arr, C12015qq[] c12015qqArr) {
        this.f5566k4.mo3142k4(c12025x6Arr, c12015qqArr);
    }
}
