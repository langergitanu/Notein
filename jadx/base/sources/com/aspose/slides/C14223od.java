package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.od */
/* JADX INFO: loaded from: classes3.dex */
final class C14223od extends AbstractC13680jc<ColorReplace, C14223od> implements IColorReplaceEffectiveData {

    /* JADX INFO: renamed from: x1 */
    static final C14223od f47741x1 = m68453to();

    /* JADX INFO: renamed from: k4 */
    C14811xp f47742k4;

    public C14223od(ColorReplace colorReplace) {
        super(colorReplace, ColorReplace.class, C14223od.class);
    }

    /* JADX INFO: renamed from: to */
    public static C14223od m68453to() {
        C14223od c14223od = new C14223od(null);
        c14223od.m68454du().m73525k4(C12003du.m56460uz().Clone());
        return c14223od;
    }

    /* JADX INFO: renamed from: du */
    public final C14811xp m68454du() {
        if (this.f47742k4 == null) {
            this.f47742k4 = new C14811xp();
        }
        return this.f47742k4;
    }

    @Override // com.aspose.slides.IColorReplaceEffectiveData
    public final Integer getColor() {
        return (Integer) C12003du.m56473x1(m68456x1());
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public tc4 mo3873k4(tc4 tc4Var) {
        C12003du c12003duClone = m68456x1().Clone();
        for (int i = 0; i < tc4Var.m71087to().length; i += 4) {
            tc4Var.m71087to()[i + 2] = c12003duClone.m56507jd();
            tc4Var.m71087to()[i + 1] = c12003duClone.m56502ck();
            tc4Var.m71087to()[i] = c12003duClone.m56505fa();
        }
        return tc4Var;
    }

    /* JADX INFO: renamed from: x1 */
    public C12003du m68456x1() {
        return this.f47742k4.m73522k4();
    }

    @Override // com.aspose.slides.AbstractC13680jc, com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public String mo3874k4() {
        String strMo3874k4 = super.mo3874k4();
        Character chValueOf = Character.valueOf(ControlChar.SPACE_CHAR);
        C14811xp c14811xp = this.f47742k4;
        return C14113y2.m67407k4(strMo3874k4, chValueOf, c14811xp != null ? c14811xp.toString() : "");
    }

    @Override // com.aspose.slides.AbstractC13680jc, com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public void mo4351k4(IBaseSlide iBaseSlide, dm6 dm6Var) {
        m68454du().m73524k4(iBaseSlide, dm6Var);
    }

    @Override // com.aspose.slides.AbstractC13680jc
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo6434k4(InterfaceC14672vc interfaceC14672vc, ColorReplace colorReplace) {
        m68454du().m73527k4(((C14223od) interfaceC14672vc).m68454du(), (ColorFormat) colorReplace.getColor());
    }

    @Override // com.aspose.slides.AbstractC13680jc
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public boolean mo6436k4(C14223od c14223od) {
        if (c14223od == null) {
            return false;
        }
        if (C14067j2.m66729x1(this, c14223od)) {
            return true;
        }
        return m68454du().equals(c14223od.m68454du());
    }
}
