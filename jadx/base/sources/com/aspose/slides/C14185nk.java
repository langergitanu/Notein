package com.aspose.slides;

import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: renamed from: com.aspose.slides.nk */
/* JADX INFO: loaded from: classes3.dex */
final class C14185nk extends el1 {

    /* JADX INFO: renamed from: k4 */
    private final C14327q4 f47554k4;

    /* JADX INFO: renamed from: x1 */
    private C12007ix f47555x1;

    public C14185nk(MathBar mathBar, InterfaceC0851ce interfaceC0851ce, C14327q4 c14327q4) {
        super(mathBar, interfaceC0851ce);
        C14327q4 c14327q42 = new C14327q4();
        this.f47554k4 = c14327q42;
        this.f47555x1 = new C12007ix();
        c14327q4.CloneTo(c14327q42);
        m5579k4(mathBar.getBase(), c14327q4.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final MathBar m68062k4() {
        return (MathBar) this.f4820c5;
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public h2y mo3934k4(oju ojuVar) {
        el1 el1Var = this.f4826m9.get_Item(0);
        h2y h2yVarClone = el1Var.m5578h4().Clone();
        float f = this.f47554k4.f48231du / 96.0f;
        float f2 = 7.0f * f;
        float f3 = f * 16.0f;
        if (m68062k4().getPosition() == 2) {
            float fM72912k4 = h2yVarClone.f5390x1.m72912k4() + f3;
            this.f47555x1 = new C12007ix(0.0f, fM72912k4, h2yVarClone.f5389k4, f2);
            h2y h2yVarClone2 = h2yVarClone.Clone();
            wsf wsfVar = h2yVarClone2.f5390x1;
            wsfVar.f49850x1 = (fM72912k4 + f2) - wsfVar.f49849k4;
            return h2yVarClone2;
        }
        this.f47555x1 = new C12007ix(0.0f, 0.0f, h2yVarClone.f5389k4, f2);
        float f4 = f2 + f3;
        el1Var.m5584x1(0.0f, f4);
        h2y h2yVarClone3 = h2yVarClone.Clone();
        h2yVarClone3.f5390x1.f49849k4 += f4;
        return h2yVarClone3;
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public void mo3976k4(yvz yvzVar) {
        AbstractC12024x1[] abstractC12024x1Arr = {null};
        boolean zM69389k4 = mo4555du().m69389k4(m68062k4(), this.f4826m9.get_Item(0), abstractC12024x1Arr);
        AbstractC12024x1 abstractC12024x1 = abstractC12024x1Arr[0];
        if (!zM69389k4) {
            abstractC12024x1 = yvzVar.f50412x1;
        }
        yvzVar.f50411k4.mo68794k4(this.f47555x1.Clone(), (azo) null, new C0962es(((C11999ar) abstractC12024x1).m56305h4().Clone()));
        super.mo3976k4(yvzVar.Clone());
    }
}
