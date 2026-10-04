package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public class ChartLinesFormat implements IChartLinesFormat, InterfaceC14397rj {

    /* JADX INFO: renamed from: to */
    private final InterfaceC14397rj f1445to;

    /* JADX INFO: renamed from: k4 */
    private final C14884zg f1443k4 = new C14884zg();

    /* JADX INFO: renamed from: x1 */
    private final LineFormat f1446x1 = new LineFormat(this);

    /* JADX INFO: renamed from: kk */
    private final EffectFormat f1444kk = new EffectFormat(this);

    public ChartLinesFormat(InterfaceC14397rj interfaceC14397rj) {
        this.f1445to = interfaceC14397rj;
    }

    @Override // com.aspose.slides.IChartLinesFormat
    public final IEffectFormat getEffect() {
        return this.f1444kk;
    }

    @Override // com.aspose.slides.IChartLinesFormat
    public final ILineFormat getLine() {
        return this.f1446x1;
    }

    @Override // com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return this.f1445to;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14884zg m708k4() {
        return this.f1443k4;
    }
}
