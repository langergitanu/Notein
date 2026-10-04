package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
final class c7j extends el1 {

    /* JADX INFO: renamed from: k4 */
    private final C14327q4 f4285k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC1182h2<oss> f4286kk;

    /* JADX INFO: renamed from: to */
    private oju f4287to;

    /* JADX INFO: renamed from: x1 */
    private el1 f4288x1;

    public c7j(MathNaryOperator mathNaryOperator, InterfaceC0851ce interfaceC0851ce, C14327q4 c14327q4) {
        super(mathNaryOperator, interfaceC0851ce);
        C14327q4 c14327q42 = new C14327q4();
        this.f4285k4 = c14327q42;
        this.f4287to = new oju();
        c14327q4.CloneTo(c14327q42);
        c14327q42.f48232dy++;
        m5579k4(mathNaryOperator.getBase(), c14327q42.Clone());
        C14327q4 c14327q4Clone = c14327q42.Clone();
        c14327q4Clone.f48236k4++;
        c14327q4Clone.f48231du = c14327q4.f48231du * 0.73f;
        c14327q4Clone.f48230ck = 2;
        if (!mathNaryOperator.getHideSuperscript()) {
            m5579k4(mathNaryOperator.getSuperscript(), c14327q4Clone.Clone());
        }
        if (mathNaryOperator.getHideSubscript()) {
            return;
        }
        this.f4288x1 = m5579k4(mathNaryOperator.getSubscript(), c14327q4Clone.Clone());
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m4502x1() {
        return m4503k4().getOperator() == 8747;
    }

    /* JADX INFO: renamed from: k4 */
    public final MathNaryOperator m4503k4() {
        return (MathNaryOperator) this.f4820c5;
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public h2y mo3934k4(oju ojuVar) {
        float f;
        float f2;
        el1 el1Var = this.f4826m9.get_Item(0);
        h2y h2yVarClone = el1Var.m5578h4().Clone();
        float f3 = this.f4285k4.f48231du / 96.0f;
        float f4 = 16.0f * f3;
        float f5 = 26.0f * f3;
        if (m4502x1()) {
            f = 130.0f * f3;
            if (m4503k4().getLimitLocation() != 1 && C7019kk.m27469x1(m4503k4().getBase(), MathematicalText.class)) {
                f4 = 0.0f;
            }
        } else {
            f = (this.f4285k4.f48239to == 0 ? 142.0f : 14.2f) * f3;
        }
        if (this.f4285k4.f48237kk > 0) {
            f /= 2.0f;
        }
        this.f4286kk = m4503k4().getOperator() == 0 ? mo4555du().m69386k4().mo64920k4((char) 8747, this.f4285k4.f48231du, f) : mo4555du().m69386k4().mo64920k4(m4503k4().getOperator(), this.f4285k4.f48231du, f);
        oss ossVarClone = this.f4286kk.mo6969k4().Clone();
        float fM72912k4 = !m4503k4().getHideSuperscript() ? f5 + this.f4826m9.get_Item(1).m5578h4().Clone().f5390x1.m72912k4() : 0.0f;
        this.f4287to.f47836k4 = 0.0f;
        wsf wsfVar = new wsf();
        float f6 = ossVarClone.f47914x1;
        wsf.m72910k4(new wsf(fM72912k4 + f6, ossVarClone.f47913kk - f6).Clone(), h2yVarClone.f5390x1.Clone()).CloneTo(wsfVar);
        wsf.m72910k4(wsfVar.Clone(), new wsf(f, 0.0f)).CloneTo(wsfVar);
        this.f4287to.f47837x1 = wsfVar.f49849k4 - ossVarClone.f47914x1;
        oju ojuVar2 = new oju(ossVarClone.f47912k4 + f4, wsfVar.f49849k4 - h2yVarClone.f5390x1.f49849k4);
        if (m4503k4().getHideSuperscript()) {
            f2 = 0.0f;
        } else {
            f2 = ((m4502x1() && m4503k4().getLimitLocation() == 1) ? (ossVarClone.f47912k4 * 3.0f) / 4.0f : ossVarClone.f47912k4 / 2.0f) - (this.f4826m9.get_Item(1).m5578h4().f5389k4 / 2.0f);
        }
        oju ojuVarClone = oju.f47834kk.Clone();
        if (this.f4288x1 != null) {
            if (m4502x1() && m4503k4().getLimitLocation() == 1) {
                ojuVarClone.f47836k4 = ossVarClone.f47912k4 / 4.0f;
            } else {
                ojuVarClone.f47836k4 = ossVarClone.f47912k4 / 2.0f;
            }
            h2y h2yVarClone2 = this.f4288x1.m5578h4().Clone();
            float fM67481k4 = C14116yg.m67481k4(f3 * 12.0f, (58.0f * f3) - h2yVarClone2.f5390x1.f49849k4);
            ojuVarClone.f47836k4 -= h2yVarClone2.f5389k4 / 2.0f;
            float f7 = this.f4287to.f47837x1 + ossVarClone.f47913kk + fM67481k4;
            ojuVarClone.f47837x1 = f7;
            wsfVar.f49850x1 = C14116yg.m67481k4(wsfVar.f49850x1, (f7 + h2yVarClone2.f5390x1.m72912k4()) - wsfVar.f49849k4);
        }
        float fM67504x1 = C14116yg.m67504x1(C14116yg.m67504x1(0.0f, f2), ojuVarClone.f47836k4);
        float f8 = f2 - fM67504x1;
        ojuVarClone.f47836k4 -= fM67504x1;
        ojuVar2.f47836k4 -= fM67504x1;
        this.f4287to.f47836k4 -= fM67504x1;
        if (!m4503k4().getHideSuperscript()) {
            this.f4826m9.get_Item(1).m5585x1(new oju(f8, 0.0f));
        }
        el1 el1Var2 = this.f4288x1;
        if (el1Var2 != null) {
            el1Var2.m5585x1(ojuVarClone.Clone());
        }
        el1Var.m5585x1(ojuVar2.Clone());
        h2y h2yVar = new h2y();
        wsfVar.CloneTo(h2yVar.f5390x1);
        h2yVar.f5389k4 = ojuVar2.f47836k4 + h2yVarClone.f5389k4;
        return h2yVar;
    }

    @Override // com.aspose.slides.el1
    /* JADX INFO: renamed from: k4 */
    public void mo3976k4(yvz yvzVar) {
        AbstractC12024x1[] abstractC12024x1Arr = {null};
        boolean zM69389k4 = mo4555du().m69389k4(m4503k4(), this.f4826m9.get_Item(0), abstractC12024x1Arr);
        AbstractC12024x1 abstractC12024x1 = abstractC12024x1Arr[0];
        if (!zM69389k4) {
            abstractC12024x1 = yvzVar.f50412x1;
        }
        if (this.f4286kk != null) {
            pzd pzdVar = new pzd(yvzVar.f50411k4);
            try {
                AbstractC14897zn abstractC14897zn = yvzVar.f50411k4;
                oju ojuVar = this.f4287to;
                abstractC14897zn.m74612k4(ojuVar.f47836k4, ojuVar.f47837x1);
                this.f4286kk.mo7635k4(yvzVar.f50411k4, abstractC12024x1);
            } finally {
                pzdVar.dispose();
            }
        }
        super.mo3976k4(yvzVar.Clone());
    }
}
