package com.aspose.slides;

/* JADX INFO: renamed from: com.aspose.slides.qp */
/* JADX INFO: loaded from: classes3.dex */
class C14355qp {

    /* JADX INFO: renamed from: du */
    private ChartData f48367du;

    /* JADX INFO: renamed from: k4 */
    private boolean f48368k4;

    /* JADX INFO: renamed from: kk */
    private int f48369kk;

    /* JADX INFO: renamed from: to */
    private int f48370to;

    /* JADX INFO: renamed from: x1 */
    private int f48371x1;

    public C14355qp(IChartDataCell iChartDataCell, InterfaceC14397rj interfaceC14397rj) {
        this.f48368k4 = false;
        this.f48367du = (ChartData) C0754al.m3657k4(ChartData.class, interfaceC14397rj);
        if (iChartDataCell == null) {
            this.f48368k4 = false;
        } else {
            this.f48371x1 = iChartDataCell.getColumn();
            this.f48369kk = iChartDataCell.getRow();
            this.f48370to = iChartDataCell.getChartDataWorksheet().getIndex();
            this.f48368k4 = true;
        }
        if (interfaceC14397rj != null) {
            this.f48367du = new ChartData[]{this.f48367du}[0];
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final IChartDataCell m69722k4() {
        ChartData chartData = this.f48367du;
        if (chartData != null) {
            chartData.m553x1().mo5704k4();
        }
        ChartData chartData2 = this.f48367du;
        if (chartData2 == null || !this.f48368k4) {
            return null;
        }
        return chartData2.getChartDataWorkbook().getCell(this.f48370to, this.f48369kk, this.f48371x1);
    }

    public C14355qp(InterfaceC14397rj interfaceC14397rj) {
        this.f48368k4 = false;
        ChartData chartData = (ChartData) C0754al.m3657k4(ChartData.class, interfaceC14397rj);
        this.f48367du = chartData;
        if (interfaceC14397rj != null) {
            this.f48367du = new ChartData[]{chartData}[0];
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69723k4(IChartDataCell iChartDataCell) {
        boolean z;
        if (iChartDataCell == null) {
            z = false;
        } else {
            this.f48371x1 = iChartDataCell.getColumn();
            this.f48369kk = iChartDataCell.getRow();
            this.f48370to = iChartDataCell.getChartDataWorksheet().getIndex();
            z = true;
        }
        this.f48368k4 = z;
    }
}
