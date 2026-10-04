package com.aspose.slides;

/* JADX INFO: renamed from: com.aspose.slides.d1 */
/* JADX INFO: loaded from: classes3.dex */
final class C0877d1 extends el1 {

    /* JADX INFO: renamed from: k4 */
    public final C14327q4 f4516k4;

    public C0877d1(MathFunction mathFunction, InterfaceC0851ce interfaceC0851ce, C14327q4 c14327q4) {
        super(mathFunction, interfaceC0851ce);
        C14327q4 c14327q42 = new C14327q4();
        this.f4516k4 = c14327q42;
        c14327q4.CloneTo(c14327q42);
        for (IMathElement iMathElement : mathFunction.getChildren()) {
            m5579k4(iMathElement, c14327q4.Clone());
        }
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public h2y mo3934k4(oju ojuVar) {
        h2y h2yVarClone = t8a.m70992k4(this.f4826m9, this.f4516k4.Clone()).Clone();
        float f = (this.f4516k4.f48231du * 15.0f) / 96.0f;
        el1 el1Var = this.f4826m9.get_Item(1);
        oju ojuVarClone = el1Var.m5583m9().Clone();
        ojuVarClone.f47836k4 += f;
        el1Var.m5585x1(ojuVarClone.Clone());
        h2yVarClone.f5389k4 += f;
        return h2yVarClone;
    }
}
