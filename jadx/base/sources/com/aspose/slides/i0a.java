package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
final class i0a extends el1 {

    /* JADX INFO: renamed from: k4 */
    private final nn2 f5597k4;

    /* JADX INFO: renamed from: kk */
    private final el1 f5598kk;

    /* JADX INFO: renamed from: to */
    private final el1 f5599to;

    /* JADX INFO: renamed from: x1 */
    private final el1 f5600x1;

    public i0a(BaseScript baseScript, InterfaceC0851ce interfaceC0851ce, C14327q4 c14327q4) {
        super(baseScript, interfaceC0851ce);
        nn2 nn2VarM69387k4 = mo4555du().m69387k4(c14327q4.f48231du);
        this.f5597k4 = nn2VarM69387k4;
        this.f5600x1 = m5579k4(baseScript.getBase(), c14327q4.Clone());
        C14327q4 c14327q4Clone = c14327q4.Clone();
        int i = c14327q4Clone.f48241x1 + 1;
        c14327q4Clone.f48241x1 = i;
        c14327q4Clone.f48231du = dxs.m5313k4(c14327q4.f48241x1, i, nn2VarM69387k4) * c14327q4.f48231du;
        this.f5599to = m5579k4(m7362x1(), c14327q4Clone.Clone());
        this.f5598kk = m5579k4(m7361k4(), c14327q4Clone.Clone());
    }

    /* JADX INFO: renamed from: kk */
    private h2y m7359kk() {
        h2y h2yVarClone = this.f5600x1.m5578h4().Clone();
        h2y h2yVarClone2 = this.f5599to.m5578h4().Clone();
        h2y h2yVarClone3 = this.f5598kk.m5578h4().Clone();
        float[] fArr = {0.0f};
        float[] fArr2 = {0.0f};
        m7358k4(fArr, fArr2);
        float f = fArr[0];
        float f2 = fArr2[0];
        wsf wsfVarClone = veo.m72190k4(h2yVarClone.f5390x1.Clone(), h2yVarClone2.f5390x1.Clone(), h2yVarClone3.f5390x1.Clone(), f2, f).Clone();
        float f3 = h2yVarClone.f5390x1.f49849k4;
        float f4 = (f3 - h2yVarClone3.f5390x1.f49849k4) - f;
        float f5 = (f3 - h2yVarClone2.f5390x1.f49849k4) + f2;
        float f6 = wsfVarClone.f49849k4 - f3;
        float fM68109ks = this.f5597k4.m68109ks();
        this.f5598kk.m5584x1(fM68109ks, f4 + f6);
        this.f5599to.m5584x1(fM68109ks, f5 + f6);
        float fM67481k4 = C14116yg.m67481k4(h2yVarClone3.f5389k4, h2yVarClone2.f5389k4) + fM68109ks + this.f5597k4.m68109ks();
        this.f5600x1.m5584x1(fM67481k4, f6);
        h2y h2yVar = new h2y();
        h2yVar.f5389k4 = fM67481k4 + h2yVarClone.f5389k4;
        wsfVarClone.CloneTo(h2yVar.f5390x1);
        return h2yVar;
    }

    /* JADX INFO: renamed from: to */
    private h2y m7360to() {
        h2y h2yVarClone = this.f5600x1.m5578h4().Clone();
        h2y h2yVarClone2 = this.f5599to.m5578h4().Clone();
        h2y h2yVarClone3 = this.f5598kk.m5578h4().Clone();
        float[] fArr = {0.0f};
        float[] fArr2 = {0.0f};
        m7358k4(fArr, fArr2);
        float f = fArr[0];
        float f2 = fArr2[0];
        wsf wsfVarClone = veo.m72190k4(h2yVarClone.f5390x1.Clone(), h2yVarClone2.f5390x1.Clone(), h2yVarClone3.f5390x1.Clone(), f2, f).Clone();
        float fM68109ks = h2yVarClone.f5389k4 + this.f5597k4.m68109ks();
        float f3 = h2yVarClone.f5390x1.f49849k4;
        float f4 = (f3 - h2yVarClone3.f5390x1.f49849k4) - f;
        float f5 = (f3 - h2yVarClone2.f5390x1.f49849k4) + f2;
        float f6 = wsfVarClone.f49849k4 - f3;
        this.f5598kk.m5584x1(fM68109ks, f4 + f6);
        this.f5599to.m5584x1(fM68109ks, f5 + f6);
        this.f5600x1.m5584x1(0.0f, f6);
        h2y h2yVar = new h2y();
        wsfVarClone.CloneTo(h2yVar.f5390x1);
        h2yVar.f5389k4 = C14116yg.m67481k4(h2yVarClone3.f5389k4, h2yVarClone2.f5389k4) + fM68109ks;
        return h2yVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final IMathElement m7361k4() {
        if (C7019kk.m27469x1(this.f4820c5, MathRightSubSuperscriptElement.class)) {
            return ((MathRightSubSuperscriptElement) this.f4820c5).getSuperscript();
        }
        if (C7019kk.m27469x1(this.f4820c5, MathLeftSubSuperscriptElement.class)) {
            return ((MathLeftSubSuperscriptElement) this.f4820c5).getSuperscript();
        }
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: x1 */
    public final IMathElement m7362x1() {
        if (C7019kk.m27469x1(this.f4820c5, MathRightSubSuperscriptElement.class)) {
            return ((MathRightSubSuperscriptElement) this.f4820c5).getSubscript();
        }
        if (C7019kk.m27469x1(this.f4820c5, MathLeftSubSuperscriptElement.class)) {
            return ((MathLeftSubSuperscriptElement) this.f4820c5).getSubscript();
        }
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public h2y mo3934k4(oju ojuVar) {
        return C7019kk.m27469x1(this.f4820c5, MathLeftSubSuperscriptElement.class) ? m7359kk() : m7360to();
    }

    /* JADX INFO: renamed from: k4 */
    private void m7358k4(float[] fArr, float[] fArr2) {
        h2y h2yVarClone = this.f5600x1.m5578h4().Clone();
        h2y h2yVarClone2 = this.f5599to.m5578h4().Clone();
        h2y h2yVarClone3 = this.f5598kk.m5578h4().Clone();
        pti ptiVar = new pti();
        ptiVar.f48158k4 = this.f5597k4.m68105fa();
        ptiVar.f48160x1 = this.f5597k4.m68118yj();
        ptiVar.f48159kk = this.f5597k4.m68114up();
        fArr[0] = veo.m72188k4(h2yVarClone.f5390x1.Clone(), h2yVarClone3.f5390x1.Clone(), ptiVar.Clone()) * 1.1f;
        xf6 xf6Var = new xf6();
        xf6Var.f50073kk = this.f5597k4.m68113u4();
        xf6Var.f50072k4 = this.f5597k4.m68111ne();
        xf6Var.f50074x1 = this.f5597k4.m68107ix();
        fArr2[0] = veo.m72187k4(0.0f, h2yVarClone2.f5390x1.Clone(), xf6Var.Clone()) * 1.1f;
    }
}
