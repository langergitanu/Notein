package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: loaded from: classes3.dex */
final class lv5 extends MathElementBase implements IMathElement {

    /* JADX INFO: renamed from: du */
    private PortionFormat f46098du;

    /* JADX INFO: renamed from: k4 */
    private ldn f46099k4;

    /* JADX INFO: renamed from: to */
    private final pnx f46100to;

    public lv5() {
        this.f46100to = new pnx();
        this.f46098du = new PortionFormat();
    }

    /* JADX INFO: renamed from: du */
    public final IPortionFormat m64604du() {
        return this.f46098du;
    }

    @Override // com.aspose.slides.MathElementBase, com.aspose.slides.IMathElement
    public final IMathElement[] getChildren() {
        return MathElementBase.f2751kk;
    }

    @Override // com.aspose.slides.MathElementBase
    /* JADX INFO: renamed from: k4 */
    public void mo1966k4(fx0 fx0Var) {
        fx0Var.mo4395k4(this);
    }

    /* JADX INFO: renamed from: kk */
    public final ldn m64606kk() {
        return this.f46099k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final InterfaceC13826ma m64607x1() {
        return this.f46100to;
    }

    public lv5(String str, PortionFormat portionFormat) {
        if (str == null) {
            throw new ArgumentNullException("text");
        }
        pnx pnxVar = new pnx();
        this.f46100to = pnxVar;
        pnxVar.addItem(new b3y(str));
        this.f46098du = portionFormat == null ? new PortionFormat() : portionFormat;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64605k4(ldn ldnVar) {
        this.f46099k4 = ldnVar;
    }
}
