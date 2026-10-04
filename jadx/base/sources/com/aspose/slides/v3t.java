package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
class v3t {
    /* JADX INFO: renamed from: k4 */
    public static Slide m72072k4(Presentation presentation) {
        Slide slide = new Slide((SlideCollection) presentation.getSlides());
        slide.m2708ne().m5302k4(presentation.m2351fa().m68353ar());
        slide.setHidden(false);
        GroupShape groupShape = slide.f1077kk;
        nd1 nd1VarMo1214P_ = groupShape.mo1214P_();
        tbp tbpVar = tbp.f49088kk;
        nd1VarMo1214P_.m67987k4(tbpVar.Clone());
        groupShape.mo1650kk(tbpVar.Clone());
        groupShape.m1647k4(tbpVar.Clone());
        groupShape.m1654x1(tbpVar.Clone());
        groupShape.m2556k4(new EffectFormat(slide.f1077kk));
        groupShape.setAlternativeText("");
        groupShape.setName("");
        return slide;
    }
}
