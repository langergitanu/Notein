package com.aspose.slides;

import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.c5 */
/* JADX INFO: loaded from: classes3.dex */
final class C0842c5 extends el1 {

    /* JADX INFO: renamed from: k4 */
    private final C14327q4 f4278k4;

    /* JADX INFO: renamed from: kk */
    private float f4279kk;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC1182h2<oss> f4280x1;

    public C0842c5(MathAccent mathAccent, InterfaceC0851ce interfaceC0851ce, C14327q4 c14327q4) {
        super(mathAccent, interfaceC0851ce);
        C14327q4 c14327q42 = new C14327q4();
        this.f4278k4 = c14327q42;
        c14327q4.CloneTo(c14327q42);
        m5579k4(mathAccent.getBase(), c14327q4.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final MathAccent m4495k4() {
        return (MathAccent) this.f4820c5;
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public h2y mo3934k4(oju ojuVar) {
        el1 el1Var = this.f4826m9.get_Item(0);
        h2y h2yVarClone = el1Var.m5578h4().Clone();
        InterfaceC1182h2<oss> interfaceC1182h2Mo64920k4 = mo4555du().m69386k4().mo64920k4(m4495k4().getCharacter(), this.f4278k4.f48231du, h2yVarClone.f5389k4);
        this.f4280x1 = interfaceC1182h2Mo64920k4;
        oss ossVarClone = interfaceC1182h2Mo64920k4.mo6969k4().Clone();
        float fM67481k4 = C14116yg.m67481k4(h2yVarClone.f5389k4, ossVarClone.f47912k4);
        this.f4279kk = (fM67481k4 - ossVarClone.f47912k4) / 2.0f;
        float f = ossVarClone.f47913kk;
        el1Var.m5584x1(0.0f, f);
        h2y h2yVarClone2 = h2yVarClone.Clone();
        h2yVarClone2.f5390x1.f49849k4 += f;
        h2yVarClone2.f5389k4 = fM67481k4;
        return h2yVarClone2;
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public void mo3976k4(yvz yvzVar) {
        AbstractC12024x1[] abstractC12024x1Arr = {null};
        boolean zM69389k4 = mo4555du().m69389k4(m4495k4(), this.f4826m9.get_Item(0), abstractC12024x1Arr);
        AbstractC12024x1 abstractC12024x1 = abstractC12024x1Arr[0];
        if (!zM69389k4) {
            abstractC12024x1 = yvzVar.f50412x1;
        }
        pzd pzdVar = new pzd(yvzVar.f50411k4);
        try {
            yvzVar.f50411k4.m74612k4(this.f4279kk, 0.0f);
            this.f4280x1.mo7635k4(yvzVar.f50411k4, abstractC12024x1);
            pzdVar.dispose();
            super.mo3976k4(yvzVar.Clone());
        } catch (Throwable th) {
            pzdVar.dispose();
            throw th;
        }
    }
}
