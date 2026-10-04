package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14084qq;

/* JADX INFO: loaded from: classes3.dex */
final class t4w extends DomObject<Presentation> implements IMasterHandoutSlideManager {

    /* JADX INFO: renamed from: k4 */
    MasterHandoutSlide f49025k4;

    public t4w(Presentation presentation) {
        super(presentation);
    }

    /* JADX INFO: renamed from: k4 */
    public static AutoShape m70937k4(MasterHandoutSlide masterHandoutSlide, String str) {
        AutoShape autoShapeM2615fa = ((ShapeCollection) masterHandoutSlide.f1077kk.getShapes()).m2615fa();
        autoShapeM2615fa.m2574ss();
        autoShapeM2615fa.mo1214P_().m67987k4(tbp.f49088kk.Clone());
        autoShapeM2615fa.m2555k4(234.0d, 36.12503937007874d);
        autoShapeM2615fa.m1591yj().m3331x1(5);
        autoShapeM2615fa.setAlternativeText("");
        autoShapeM2615fa.setName(str);
        autoShapeM2615fa.m2554k4((byte) 0, (byte) 2, (byte) 7, 0L, false);
        autoShapeM2615fa.getAutoShapeLock().setGroupingLocked(true);
        TextFrameFormat textFrameFormat = (TextFrameFormat) autoShapeM2615fa.m276ck().getTextFrameFormat();
        s8a.m70469k4(textFrameFormat);
        IParagraphFormat iParagraphFormatM2991x1 = textFrameFormat.m2959m9().m2991x1(0);
        iParagraphFormatM2991x1.setAlignment(0);
        iParagraphFormatM2991x1.getDefaultPortionFormat().setFontHeight(12.0f);
        return autoShapeM2615fa;
    }

    /* JADX INFO: renamed from: kk */
    public static AutoShape m70938kk(MasterHandoutSlide masterHandoutSlide, String str) {
        AutoShape autoShapeM2615fa = ((ShapeCollection) masterHandoutSlide.f1077kk.getShapes()).m2615fa();
        autoShapeM2615fa.m2574ss();
        autoShapeM2615fa.mo1214P_().m67987k4(new tbp(305.87503937007875d, 0.0d));
        autoShapeM2615fa.m2555k4(234.0d, 36.12503937007874d);
        autoShapeM2615fa.m1591yj().m3331x1(5);
        autoShapeM2615fa.setAlternativeText("");
        autoShapeM2615fa.setName(str);
        autoShapeM2615fa.m2554k4((byte) 0, (byte) 2, (byte) 4, 1L, false);
        autoShapeM2615fa.getAutoShapeLock().setGroupingLocked(true);
        TextFrameFormat textFrameFormat = (TextFrameFormat) autoShapeM2615fa.m276ck().getTextFrameFormat();
        s8a.m70469k4(textFrameFormat);
        IParagraphFormat iParagraphFormatM2991x1 = textFrameFormat.m2959m9().m2991x1(0);
        iParagraphFormatM2991x1.setAlignment(2);
        iParagraphFormatM2991x1.getDefaultPortionFormat().setFontHeight(12.0f);
        autoShapeM2615fa.getTextFrame().setText(C14084qq.m67081jd().m67150u4());
        autoShapeM2615fa.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).addField("datetimeFigureOut");
        return autoShapeM2615fa;
    }

    /* JADX INFO: renamed from: to */
    public static AutoShape m70939to(MasterHandoutSlide masterHandoutSlide, String str) {
        AutoShape autoShapeM2615fa = ((ShapeCollection) masterHandoutSlide.f1077kk.getShapes()).m2615fa();
        autoShapeM2615fa.m2574ss();
        autoShapeM2615fa.mo1214P_().m67987k4(new tbp(305.87503937007875d, 683.8750393700788d));
        autoShapeM2615fa.m2555k4(234.0d, 36.12496062992126d);
        autoShapeM2615fa.m1591yj().m3331x1(5);
        autoShapeM2615fa.setAlternativeText("");
        autoShapeM2615fa.setName(str);
        autoShapeM2615fa.m2554k4((byte) 0, (byte) 2, (byte) 5, 3L, false);
        autoShapeM2615fa.getAutoShapeLock().setGroupingLocked(true);
        TextFrameFormat textFrameFormat = (TextFrameFormat) autoShapeM2615fa.m276ck().getTextFrameFormat();
        s8a.m70469k4(textFrameFormat);
        textFrameFormat.setAnchoringType((byte) 2);
        IParagraphFormat iParagraphFormatM2991x1 = textFrameFormat.m2959m9().m2991x1(0);
        iParagraphFormatM2991x1.setAlignment(2);
        iParagraphFormatM2991x1.getDefaultPortionFormat().setFontHeight(12.0f);
        autoShapeM2615fa.getTextFrame().setText("‹#›");
        autoShapeM2615fa.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().setSmartTagClean(false);
        autoShapeM2615fa.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).addField("slidenum");
        return autoShapeM2615fa;
    }

    /* JADX INFO: renamed from: x1 */
    public static AutoShape m70940x1(MasterHandoutSlide masterHandoutSlide, String str) {
        AutoShape autoShapeM2615fa = ((ShapeCollection) masterHandoutSlide.f1077kk.getShapes()).m2615fa();
        autoShapeM2615fa.m2574ss();
        autoShapeM2615fa.mo1214P_().m67987k4(new tbp(0.0d, 683.8750393700788d));
        autoShapeM2615fa.m2555k4(234.0d, 36.12496062992126d);
        autoShapeM2615fa.m1591yj().m3331x1(5);
        autoShapeM2615fa.setAlternativeText("");
        autoShapeM2615fa.setName(str);
        autoShapeM2615fa.m2554k4((byte) 0, (byte) 2, (byte) 6, 2L, false);
        autoShapeM2615fa.getAutoShapeLock().setGroupingLocked(true);
        TextFrameFormat textFrameFormat = (TextFrameFormat) autoShapeM2615fa.m276ck().getTextFrameFormat();
        s8a.m70469k4(textFrameFormat);
        textFrameFormat.setAnchoringType((byte) 2);
        IParagraphFormat iParagraphFormatM2991x1 = textFrameFormat.m2959m9().m2991x1(0);
        iParagraphFormatM2991x1.setAlignment(0);
        iParagraphFormatM2991x1.getDefaultPortionFormat().setFontHeight(12.0f);
        return autoShapeM2615fa;
    }

    @Override // com.aspose.slides.IMasterHandoutSlideManager
    public final IMasterHandoutSlide getMasterHandoutSlide() {
        return this.f49025k4;
    }

    @Override // com.aspose.slides.IMasterHandoutSlideManager
    public final void removeMasterHandoutSlide() {
        this.f49025k4 = null;
    }

    @Override // com.aspose.slides.IMasterHandoutSlideManager
    public final IMasterHandoutSlide setDefaultMasterHandoutSlide() {
        MasterHandoutSlide masterHandoutSlide = new MasterHandoutSlide(this);
        this.f49025k4 = masterHandoutSlide;
        return masterHandoutSlide;
    }
}
