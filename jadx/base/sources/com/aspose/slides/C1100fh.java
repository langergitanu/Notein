package com.aspose.slides;

/* JADX INFO: renamed from: com.aspose.slides.fh */
/* JADX INFO: loaded from: classes3.dex */
final class C1100fh extends el1 {
    public C1100fh(MathBox mathBox, InterfaceC0851ce interfaceC0851ce, C14327q4 c14327q4) {
        super(mathBox, interfaceC0851ce);
        m5579k4(mathBox.getBase(), c14327q4.Clone());
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public h2y mo3934k4(oju ojuVar) {
        if (this.f4826m9.size() == 0) {
            return new h2y();
        }
        el1 el1Var = this.f4826m9.get_Item(0);
        el1Var.m5582kk(ojuVar.Clone());
        return el1Var.m5578h4();
    }
}
