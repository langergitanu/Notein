package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: loaded from: classes3.dex */
class ikt implements InterfaceC14217o7 {

    /* JADX INFO: renamed from: k4 */
    public final Portion f5726k4;

    public ikt(Portion portion) {
        if (portion == null) {
            throw new ArgumentNullException("portion");
        }
        this.f5726k4 = portion;
    }

    @Override // com.aspose.slides.InterfaceC14217o7
    /* JADX INFO: renamed from: k4 */
    public final C12007ix mo7668k4(boolean z) {
        ohe oheVarMo64291k4;
        TextFrame textFrameM2179kk = this.f5726k4.m2282fa().m2154ck().m2179kk();
        InterfaceC13762l4 interfaceC13762l4 = textFrameM2179kk.f3523to;
        InterfaceC14397rj parent_Immediate = ((InterfaceC14397rj) C7019kk.m27452k4((Object) textFrameM2179kk, InterfaceC14397rj.class)).getParent_Immediate();
        ohe oheVar = new ohe();
        if (C7019kk.m27469x1(parent_Immediate, Cell.class)) {
            Cell cell = (Cell) C7019kk.m27452k4((Object) parent_Immediate, Cell.class);
            interfaceC13762l4.mo64294k4(new oju((float) ((cell.getWidth() - cell.getMarginLeft()) - cell.getMarginRight()), 0.0f), (kg7) null);
            oheVarMo64291k4 = interfaceC13762l4.mo64291k4(this.f5726k4, false);
        } else {
            jq6.m63494x1(interfaceC13762l4);
            oheVarMo64291k4 = interfaceC13762l4.mo64291k4(this.f5726k4, z);
        }
        oheVarMo64291k4.CloneTo(oheVar);
        ITextFrameFormatEffectiveData effective = textFrameM2179kk.getTextFrameFormat().getEffective();
        float marginLeft = (float) effective.getMarginLeft();
        float marginTop = (float) effective.getMarginTop();
        oju ojuVar = oheVar.f47808k4;
        float f = ojuVar.f47836k4 + marginLeft;
        float f2 = ojuVar.f47837x1 + marginTop;
        oju ojuVar2 = oheVar.f47809x1;
        return new C12007ix(f, f2, ojuVar2.f47836k4, ojuVar2.f47837x1);
    }
}
