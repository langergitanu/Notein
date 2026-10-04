package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class Marker implements IMarker, InterfaceC14397rj {

    /* JADX INFO: renamed from: du */
    private ChartSeries f2673du;

    /* JADX INFO: renamed from: k4 */
    int f2675k4;

    /* JADX INFO: renamed from: kk */
    Format f2676kk;

    /* JADX INFO: renamed from: to */
    private InterfaceC14397rj f2677to;

    /* JADX INFO: renamed from: h4 */
    private snk f2674h4 = new snk();

    /* JADX INFO: renamed from: x1 */
    int f2678x1 = -1;

    public Marker(InterfaceC14397rj interfaceC14397rj, ChartSeries chartSeries) {
        this.f2677to = interfaceC14397rj;
        this.f2673du = chartSeries;
    }

    @Override // com.aspose.slides.IMarker
    public final IFormat getFormat() {
        if (this.f2676kk == null) {
            this.f2676kk = new Format(this);
        }
        return this.f2676kk;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f2677to;
    }

    @Override // com.aspose.slides.IMarker
    public final int getSize() {
        return this.f2675k4;
    }

    @Override // com.aspose.slides.IMarker
    public final int getSymbol() {
        return this.f2678x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final snk m1928k4() {
        return this.f2674h4;
    }

    @Override // com.aspose.slides.IMarker
    public final void setSize(int i) {
        this.f2675k4 = i;
    }

    @Override // com.aspose.slides.IMarker
    public final void setSymbol(int i) {
        if (this.f2678x1 != i) {
            this.f2678x1 = i;
            this.f2673du.m735to();
        }
    }
}
