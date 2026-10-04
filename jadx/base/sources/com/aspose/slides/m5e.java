package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
final class m5e extends el1 {

    /* JADX INFO: renamed from: k4 */
    public final C14327q4 f46176k4;

    public m5e(MathLimit mathLimit, InterfaceC0851ce interfaceC0851ce, C14327q4 c14327q4) {
        super(mathLimit, interfaceC0851ce);
        C14327q4 c14327q42 = new C14327q4();
        this.f46176k4 = c14327q42;
        c14327q4.CloneTo(c14327q42);
        int i = c14327q4.f48236k4;
        float fM5313k4 = dxs.m5313k4(i, i + 1, mo4555du().m69387k4(c14327q4.f48231du));
        C14327q4 c14327q4Clone = c14327q4.Clone();
        c14327q4Clone.f48236k4++;
        c14327q4Clone.f48231du = fM5313k4 * c14327q4.f48231du;
        m5579k4(mathLimit.getBase(), c14327q4.Clone());
        m5579k4(mathLimit.getLimit(), c14327q4Clone.Clone());
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public h2y mo3934k4(oju ojuVar) {
        el1 el1Var = this.f4826m9.get_Item(0);
        el1 el1Var2 = this.f4826m9.get_Item(1);
        h2y h2yVarClone = el1Var.m5578h4().Clone();
        wsf wsfVarClone = h2yVarClone.f5390x1.Clone();
        h2y h2yVarClone2 = el1Var2.m5578h4().Clone();
        float f = (this.f46176k4.f48231du * 9.0f) / 96.0f;
        float fM67481k4 = C14116yg.m67481k4(h2yVarClone.f5389k4, el1Var2.m5578h4().f5389k4);
        el1Var.m5584x1((fM67481k4 - h2yVarClone.f5389k4) / 2.0f, 0.0f);
        float fM72912k4 = wsfVarClone.m72912k4() + f;
        el1Var2.m5584x1((fM67481k4 - h2yVarClone2.f5389k4) / 2.0f, fM72912k4);
        h2y h2yVar = new h2y();
        h2yVar.f5390x1 = new wsf(wsfVarClone.f49849k4, C14116yg.m67481k4(fM72912k4 + h2yVarClone2.f5390x1.m72912k4(), wsfVarClone.m72912k4()) - wsfVarClone.f49849k4);
        h2yVar.f5389k4 = fM67481k4;
        return h2yVar;
    }
}
