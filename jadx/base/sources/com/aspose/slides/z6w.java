package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14047bz;

/* JADX INFO: loaded from: classes3.dex */
class z6w {
    /* JADX INFO: renamed from: k4 */
    public static AutoShape m74336k4(NotesSlide notesSlide, String str) {
        AutoShape autoShapeM2615fa = ((ShapeCollection) notesSlide.f1077kk.getShapes()).m2615fa();
        autoShapeM2615fa.m2574ss();
        autoShapeM2615fa.setAlternativeText("");
        autoShapeM2615fa.setName(str);
        autoShapeM2615fa.m2554k4((byte) 0, (byte) 0, (byte) 14, 0L, false);
        autoShapeM2615fa.getAutoShapeLock().setGroupingLocked(true);
        autoShapeM2615fa.getAutoShapeLock().setRotateLocked(true);
        autoShapeM2615fa.getAutoShapeLock().setAspectRatioLocked(true);
        autoShapeM2615fa.mo277dy();
        return autoShapeM2615fa;
    }

    /* JADX INFO: renamed from: kk */
    public static AutoShape m74338kk(NotesSlide notesSlide, String str) {
        AutoShape autoShapeM2615fa = ((ShapeCollection) notesSlide.f1077kk.getShapes()).m2615fa();
        autoShapeM2615fa.m2574ss();
        autoShapeM2615fa.setAlternativeText("");
        autoShapeM2615fa.setName(str);
        autoShapeM2615fa.m2554k4((byte) 0, (byte) 2, (byte) 5, 10L, false);
        autoShapeM2615fa.getAutoShapeLock().setGroupingLocked(true);
        autoShapeM2615fa.m276ck();
        Paragraph paragraph = new Paragraph();
        Portion portion = new Portion();
        portion.addField("slidenum");
        ((Field) portion.getField()).m1445k4(new C14047bz("6101C5E1-D8E9-464D-A93E-CE21651935A7"));
        portion.getPortionFormat().setLanguageId("en-US");
        portion.getPortionFormat().setSmartTagClean(false);
        portion.m2289k4("1");
        paragraph.getPortions().add(portion);
        Portion portion2 = new Portion();
        portion2.getPortionFormat().setLanguageId("en-US");
        paragraph.getPortions().add(portion2);
        autoShapeM2615fa.getTextFrame().getParagraphs().add(paragraph);
        autoShapeM2615fa.mo277dy();
        return autoShapeM2615fa;
    }

    /* JADX INFO: renamed from: x1 */
    public static AutoShape m74339x1(NotesSlide notesSlide, String str) {
        AutoShape autoShapeM2615fa = ((ShapeCollection) notesSlide.f1077kk.getShapes()).m2615fa();
        autoShapeM2615fa.m2574ss();
        autoShapeM2615fa.setAlternativeText("");
        autoShapeM2615fa.setName(str);
        autoShapeM2615fa.m2554k4((byte) 0, (byte) 0, (byte) 1, 1L, false);
        autoShapeM2615fa.getAutoShapeLock().setGroupingLocked(true);
        autoShapeM2615fa.addTextFrame("");
        autoShapeM2615fa.getTextFrame().getTextFrameFormat().setAutofitType((byte) 1);
        autoShapeM2615fa.mo277dy();
        return autoShapeM2615fa;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74337k4(NotesSlide notesSlide) {
        GroupShape groupShape = notesSlide.f1077kk;
        nd1 nd1VarMo1214P_ = groupShape.mo1214P_();
        tbp tbpVar = tbp.f49088kk;
        nd1VarMo1214P_.m67987k4(tbpVar.Clone());
        groupShape.mo1650kk(tbpVar.Clone());
        groupShape.m1647k4(tbpVar.Clone());
        groupShape.m1654x1(tbpVar.Clone());
        groupShape.m2556k4(new EffectFormat(notesSlide.f1077kk));
        groupShape.setAlternativeText("");
        groupShape.setName("");
        m74336k4(notesSlide, "Slide Image Placeholder 1");
        m74339x1(notesSlide, "Notes Placeholder 2");
        m74338kk(notesSlide, "Slide Number Placeholder 3");
    }
}
