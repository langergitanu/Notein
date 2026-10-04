package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
final class phu extends AbstractC14206nx implements InterfaceC14751wu {

    /* JADX INFO: renamed from: du */
    private boolean f48063du;

    /* JADX INFO: renamed from: kk */
    private final oju f48064kk;

    /* JADX INFO: renamed from: to */
    private final C14571tq f48065to;

    /* JADX INFO: renamed from: x1 */
    private oju f48066x1;

    public phu(C14571tq c14571tq, IShape iShape, oju ojuVar, oju ojuVar2) {
        super(iShape);
        this.f48066x1 = new oju();
        oju ojuVar3 = new oju();
        this.f48064kk = ojuVar3;
        this.f48063du = true;
        this.f48065to = c14571tq;
        ojuVar.CloneTo(this.f48066x1);
        ojuVar2.CloneTo(ojuVar3);
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2023k4() {
        this.f48065to.m71281k4(this.f47636k4, this.f48064kk.Clone());
    }

    @Override // com.aspose.slides.InterfaceC14751wu
    /* JADX INFO: renamed from: k4 */
    public final void mo2024k4(float f) {
        if (this.f48063du) {
            this.f48063du = false;
            oju ojuVar = new oju();
            oju[] ojuVarArr = {ojuVar};
            boolean zM71286k4 = this.f48065to.m71286k4(this.f47636k4, ojuVarArr);
            ojuVarArr[0].CloneTo(ojuVar);
            if (zM71286k4) {
                ojuVar.CloneTo(this.f48066x1);
            }
        }
        oju ojuVar2 = this.f48066x1;
        this.f48065to.m71281k4(this.f47636k4, oju.m68619k4(ojuVar2, oju.m68617k4(oju.m68622x1(this.f48064kk, ojuVar2), f)).Clone().Clone());
    }
}
