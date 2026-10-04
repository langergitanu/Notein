package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class idr implements InterfaceC0933ea {

    /* JADX INFO: renamed from: k4 */
    private ChartDataWorkbook f5708k4;

    /* JADX INFO: renamed from: kk */
    private final InterfaceC14825y0 f5709kk = new myn(this);

    /* JADX INFO: renamed from: x1 */
    private final d5a f5710x1;

    public idr(ChartDataWorkbook chartDataWorkbook) {
        this.f5708k4 = chartDataWorkbook;
        this.f5710x1 = new C14387rg(chartDataWorkbook);
    }

    @Override // com.aspose.slides.InterfaceC0933ea
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC14836y7 mo5384k4(String str) {
        return ((ChartDataWorksheetCollection) this.f5708k4.getWorksheets()).m707x1(str).m695h4();
    }

    @Override // com.aspose.slides.InterfaceC0933ea
    /* JADX INFO: renamed from: kk */
    public final InterfaceC14825y0 mo5386kk() {
        return this.f5709kk;
    }

    /* JADX INFO: renamed from: to */
    public final String m7625to() {
        return this.f5708k4.m666c5();
    }

    @Override // com.aspose.slides.InterfaceC0933ea
    /* JADX INFO: renamed from: x1 */
    public final d5a mo5387x1() {
        return this.f5710x1;
    }

    @Override // com.aspose.slides.InterfaceC0933ea
    /* JADX INFO: renamed from: k4 */
    public final boolean mo5385k4() {
        return this.f5708k4.m684k4();
    }
}
