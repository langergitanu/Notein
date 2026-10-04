package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public final class AxisFormat extends DomObject<Axis> implements IAxisFormat, InterfaceC14376r6 {

    /* JADX INFO: renamed from: du */
    private IPresentationComponent f1033du;

    /* JADX INFO: renamed from: k4 */
    private final FillFormat f1034k4;

    /* JADX INFO: renamed from: kk */
    private final EffectFormat f1035kk;

    /* JADX INFO: renamed from: to */
    private final C13786lm f1036to;

    /* JADX INFO: renamed from: x1 */
    private final LineFormat f1037x1;

    public AxisFormat(Axis axis) {
        super(axis);
        this.f1036to = new C13786lm();
        this.f1034k4 = new FillFormat(this);
        LineFormat lineFormat = new LineFormat(this);
        this.f1037x1 = lineFormat;
        lineFormat.getFillFormat().getSolidFillColor().setColorType(0);
        this.f1035kk = new EffectFormat(this);
    }

    @Override // com.aspose.slides.IAxisFormat
    public final IEffectFormat getEffect() {
        return this.f1035kk;
    }

    @Override // com.aspose.slides.IAxisFormat
    public final IFillFormat getFill() {
        return this.f1034k4;
    }

    @Override // com.aspose.slides.IAxisFormat
    public final ILineFormat getLine() {
        return this.f1037x1;
    }

    @Override // com.aspose.slides.InterfaceC14376r6
    public final IPresentationComponent getParent_IPresentationComponent() {
        IPresentationComponent iPresentationComponent = this.f1033du;
        if (iPresentationComponent == null) {
            IPresentationComponent[] iPresentationComponentArr = {iPresentationComponent};
            kke.m63959k4(IPresentationComponent.class, (InterfaceC14397rj) this.f2127h4, iPresentationComponentArr);
            this.f1033du = iPresentationComponentArr[0];
        }
        return this.f1033du;
    }

    @Override // com.aspose.slides.DomObject, com.aspose.slides.InterfaceC14397rj
    public final InterfaceC14397rj getParent_Immediate() {
        return (InterfaceC14397rj) this.f2127h4;
    }

    @Override // com.aspose.slides.InterfaceC14376r6
    public final long getVersion() {
        return ((((this.f1034k4.getVersion() & 4294967295L) + (this.f1037x1.getVersion() & 4294967295L)) & 4294967295L) + (this.f1035kk.getVersion() & 4294967295L)) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public final C13786lm m330k4() {
        return this.f1036to;
    }
}
