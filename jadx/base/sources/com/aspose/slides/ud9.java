package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: loaded from: classes3.dex */
class ud9 {

    /* JADX INFO: renamed from: k4 */
    public final Paragraph f49313k4;

    public ud9(Paragraph paragraph) {
        if (paragraph == null) {
            throw new ArgumentNullException("paragraph");
        }
        this.f49313k4 = paragraph;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m71669k4() {
        nuk nukVar = new nuk();
        C12007ix c12007ix = new C12007ix();
        InterfaceC13762l4 interfaceC13762l4 = this.f49313k4.m2154ck().m2179kk().f3523to;
        nuk[] nukVarArr = {nukVar};
        C12007ix[] c12007ixArr = {c12007ix};
        jq6.m63491k4(interfaceC13762l4, nukVarArr, c12007ixArr, (kg7) null);
        nukVarArr[0].CloneTo(nukVar);
        c12007ixArr[0].CloneTo(c12007ix);
        return interfaceC13762l4.mo64299x1(this.f49313k4);
    }

    /* JADX INFO: renamed from: x1 */
    public final C12007ix m71670x1() {
        TextFrame textFrameM2179kk = this.f49313k4.m2154ck().m2179kk();
        InterfaceC13762l4 interfaceC13762l4 = textFrameM2179kk.f3523to;
        if (C7019kk.m27469x1(((InterfaceC14397rj) C7019kk.m27452k4((Object) textFrameM2179kk, InterfaceC14397rj.class)).getParent_Immediate(), Cell.class)) {
            Cell cell = (Cell) C7019kk.m27452k4((Object) ((InterfaceC14397rj) C7019kk.m27452k4((Object) textFrameM2179kk, InterfaceC14397rj.class)).getParent_Immediate(), Cell.class);
            interfaceC13762l4.mo64294k4(new oju((float) ((cell.getWidth() - cell.getMarginLeft()) - cell.getMarginRight()), 0.0f), (kg7) null);
            ohe oheVarClone = interfaceC13762l4.mo64290k4(this.f49313k4).Clone();
            ITextFrameFormatEffectiveData effective = textFrameM2179kk.getTextFrameFormat().getEffective();
            float marginLeft = (float) effective.getMarginLeft();
            float marginTop = (float) effective.getMarginTop();
            oju ojuVar = oheVarClone.f47808k4;
            float f = ojuVar.f47836k4 + marginLeft;
            float f2 = ojuVar.f47837x1 + marginTop;
            oju ojuVar2 = oheVarClone.f47809x1;
            return new C12007ix(f, f2, ojuVar2.f47836k4, ojuVar2.f47837x1);
        }
        nuk nukVar = new nuk();
        C12007ix c12007ix = new C12007ix();
        nuk[] nukVarArr = {nukVar};
        C12007ix[] c12007ixArr = {c12007ix};
        jq6.m63491k4(interfaceC13762l4, nukVarArr, c12007ixArr, (kg7) null);
        nukVarArr[0].CloneTo(nukVar);
        c12007ixArr[0].CloneTo(c12007ix);
        TextFrameFormat textFrameFormat = textFrameM2179kk.f3519k4;
        C4317dy c4317dyM63484k4 = jq6.m63484k4(nukVar.m68213k4().Clone(), c12007ix.Clone(), textFrameM2179kk.m2903du().Clone().Clone(), textFrameFormat.m2958lr(), textFrameFormat.getRotationAngle(), textFrameFormat.getWrapText(), textFrameFormat.m2957ks());
        oju ojuVarClone = nukVar.f47615k4.Clone();
        ojuVarClone.f47836k4 = (c4317dyM63484k4.m17330dy() - ojuVarClone.f47836k4) * c4317dyM63484k4.m17347to();
        ojuVarClone.f47837x1 = (c4317dyM63484k4.m17328c5() - ojuVarClone.f47837x1) * c4317dyM63484k4.m17346m9();
        ohe oheVarClone2 = interfaceC13762l4.mo64290k4(this.f49313k4).Clone();
        oju ojuVarClone2 = oheVarClone2.f47808k4.Clone();
        oju.m68619k4(ojuVarClone2, ojuVarClone).CloneTo(ojuVarClone2);
        if (c4317dyM63484k4.m17347to() < 0.0f) {
            ojuVarClone2.f47836k4 = (-ojuVarClone2.f47836k4) - oheVarClone2.f47809x1.f47836k4;
        }
        if (c4317dyM63484k4.m17346m9() < 0.0f) {
            ojuVarClone2.f47837x1 = (-ojuVarClone2.f47837x1) - oheVarClone2.f47809x1.f47837x1;
        }
        float f3 = ojuVarClone2.f47836k4;
        float f4 = ojuVarClone2.f47837x1;
        oju ojuVar3 = oheVarClone2.f47809x1;
        return new C12007ix(f3, f4, ojuVar3.f47836k4, ojuVar3.f47837x1);
    }
}
