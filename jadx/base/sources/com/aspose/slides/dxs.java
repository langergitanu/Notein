package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
final class dxs extends el1 {

    /* JADX INFO: renamed from: k4 */
    private C14327q4 f4685k4;

    /* JADX INFO: renamed from: kk */
    private final el1 f4686kk;

    /* JADX INFO: renamed from: to */
    private final nn2 f4687to;

    /* JADX INFO: renamed from: x1 */
    private final el1 f4688x1;

    private dxs(BaseScript baseScript, IMathElement iMathElement, InterfaceC0851ce interfaceC0851ce, C14327q4 c14327q4) {
        super(baseScript, interfaceC0851ce);
        this.f4685k4 = new C14327q4();
        this.f4688x1 = m5579k4(baseScript.getBase(), c14327q4.Clone());
        c14327q4.CloneTo(this.f4685k4);
        this.f4685k4.f48241x1++;
        nn2 nn2VarM69387k4 = mo4555du().m69387k4(c14327q4.f48231du);
        this.f4687to = nn2VarM69387k4;
        float fM5313k4 = C7019kk.m27469x1(this.f4821ck, C0877d1.class) ? 0.76f : m5313k4(c14327q4.f48241x1, this.f4685k4.f48241x1, nn2VarM69387k4);
        C14327q4 c14327q42 = this.f4685k4;
        c14327q42.f48231du = fM5313k4 * c14327q4.f48231du;
        if (c14327q4.f48238m9) {
            c14327q42.f48231du = (c14327q4.f48231du * 3.0f) / 4.0f;
        }
        c14327q42.f48240up = 1.1f;
        this.f4686kk = m5579k4(iMathElement, c14327q42.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static float m5313k4(int i, int i2, nn2 nn2Var) {
        float fM68117x6 = nn2Var.m68117x6() * 0.01f;
        float fM68112rv = nn2Var.m68112rv() * 0.01f;
        if (i2 != i + 1) {
            return 1.0f;
        }
        if (i2 == 1) {
            return fM68112rv;
        }
        if (i2 == 2) {
            return fM68117x6;
        }
        return 1.0f;
    }

    public dxs(MathSubscriptElement mathSubscriptElement, InterfaceC0851ce interfaceC0851ce, C14327q4 c14327q4) {
        this(mathSubscriptElement, mathSubscriptElement.getSubscript(), interfaceC0851ce, c14327q4.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final h2y m5314k4(h2y h2yVar, h2y h2yVar2, float f) {
        h2y h2yVar3 = new h2y();
        new wsf();
        float f2 = h2yVar2.f5390x1.f49849k4 / 2.0f;
        if (C7019kk.m27469x1(this.f4686kk, b3e.class) && h2yVar2.f5390x1.f49849k4 < ((b3e) this.f4686kk).f4105x1 * 0.6f) {
            f2 *= 0.8f;
        }
        wsf wsfVar = new wsf();
        wsf wsfVar2 = h2yVar.f5390x1;
        wsfVar.f49849k4 = wsfVar2.f49849k4 + f2;
        wsfVar.f49850x1 = wsfVar2.f49850x1;
        this.f4688x1.m5584x1(0.0f, f2);
        this.f4686kk.m5584x1(f, 0.0f);
        h2yVar3.f5389k4 = C14116yg.m67481k4(h2yVar.f5389k4, h2yVar2.f5389k4 + f);
        wsfVar.CloneTo(h2yVar3.f5390x1);
        return h2yVar3;
    }

    public dxs(MathSuperscriptElement mathSuperscriptElement, InterfaceC0851ce interfaceC0851ce, C14327q4 c14327q4) {
        this(mathSuperscriptElement, mathSuperscriptElement.getSuperscript(), interfaceC0851ce, c14327q4.Clone());
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x017b  */
    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h2y mo3934k4(oju ojuVar) {
        float f;
        h2y h2yVarClone = this.f4688x1.m5578h4().Clone();
        h2y h2yVarClone2 = this.f4686kk.m5578h4().Clone();
        float fM68109ks = (this.f4687to.m68109ks() * 1.3f) + h2yVarClone.f5389k4;
        if ((C7019kk.m27469x1(this.f4688x1, C1138gb.class) && this.f4688x1.f4826m9.get_Item(0).m5578h4().f5390x1.m72912k4() > mo4555du().f48223k4) || (h2yVarClone.f5390x1.m72912k4() > mo4555du().f48223k4 + 0.1f && h2yVarClone.f5390x1.m72912k4() > h2yVarClone2.f5390x1.m72912k4())) {
            return m5314k4(h2yVarClone.Clone(), h2yVarClone2.Clone(), fM68109ks);
        }
        h2y h2yVar = new h2y();
        wsf wsfVar = new wsf();
        if (C7019kk.m27469x1(this.f4820c5, MathSuperscriptElement.class)) {
            pti ptiVar = new pti();
            ptiVar.f48158k4 = this.f4687to.m68105fa();
            ptiVar.f48160x1 = this.f4687to.m68118yj();
            float fM68114up = this.f4687to.m68114up();
            ptiVar.f48159kk = fM68114up;
            C14327q4 c14327q4 = this.f4685k4;
            if ((c14327q4.f48237kk > 0 || c14327q4.f48229c5) && !c14327q4.f48234h4 && c14327q4.f48241x1 > 0) {
                ptiVar.f48158k4 *= 0.8f;
                ptiVar.f48160x1 *= 0.8f;
                ptiVar.f48159kk = fM68114up * 0.8f;
            }
            if (C7019kk.m27469x1(this.f4688x1, C1138gb.class) && h2yVarClone.f5390x1.m72912k4() > mo4555du().f48223k4) {
                ptiVar.f48158k4 = (((C1138gb) this.f4688x1).m6464x1() / 96.0f) * 55.0f;
            }
            float fM67481k4 = C14116yg.m67481k4(ptiVar.f48158k4, h2yVarClone2.f5390x1.f49850x1 + ptiVar.f48159kk);
            wsf wsfVar2 = h2yVarClone.f5390x1;
            float f2 = (wsfVar2.f49849k4 - h2yVarClone2.f5390x1.f49849k4) - fM67481k4;
            veo.m72189k4(wsfVar2.Clone(), h2yVarClone2.f5390x1.Clone(), fM67481k4).CloneTo(wsfVar);
            if (C7019kk.m27469x1(this.f4686kk, C14431s3.class)) {
                C14327q4 c14327q42 = this.f4685k4;
                if (c14327q42.f48239to != 0 || (c14327q42.f48231du - ((C14431s3) this.f4686kk).m70434kk()) - this.f4687to.m68108jd() >= 0.0f || this.f4686kk.m5578h4().f5390x1.f49849k4 / this.f4685k4.f48231du >= 2.0f || (-f2) <= (h2yVarClone.f5390x1.m72912k4() / 2.0f) + this.f4687to.m68108jd()) {
                    f = 0.0f;
                } else {
                    f = (-this.f4687to.m68108jd()) / 2.0f;
                    wsfVar.f49849k4 += f;
                }
                this.f4688x1.m5584x1(0.0f, (-f2) + f);
                this.f4686kk.m5584x1(fM68109ks, f);
            }
        } else {
            xf6 xf6Var = new xf6();
            xf6Var.f50073kk = this.f4687to.m68113u4();
            xf6Var.f50072k4 = this.f4687to.m68111ne();
            xf6Var.f50074x1 = this.f4687to.m68107ix();
            wsf wsfVarClone = h2yVarClone.f5390x1.Clone();
            float f3 = xf6Var.f50072k4;
            veo.m72191x1(wsfVarClone.Clone(), h2yVarClone2.f5390x1.Clone(), f3).CloneTo(wsfVar);
            this.f4686kk.m5584x1(fM68109ks, (h2yVarClone.f5390x1.f49849k4 - h2yVarClone2.f5390x1.f49849k4) + f3);
        }
        h2yVar.f5389k4 = C14116yg.m67481k4(h2yVarClone.f5389k4, h2yVarClone2.f5389k4 + fM68109ks);
        wsfVar.CloneTo(h2yVar.f5390x1);
        return h2yVar;
    }
}
