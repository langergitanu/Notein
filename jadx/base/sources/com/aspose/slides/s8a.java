package com.aspose.slides;

import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: loaded from: classes3.dex */
final class s8a extends DomObject<Presentation> implements IMasterNotesSlideManager {

    /* JADX INFO: renamed from: k4 */
    static final xmh f48772k4 = new xmh(91440.0d, 45720.0d, 91440.0d, 45720.0d);

    /* JADX INFO: renamed from: x1 */
    private MasterNotesSlide f48773x1;

    public s8a(Presentation presentation) {
        super(presentation);
    }

    /* JADX INFO: renamed from: k4 */
    public static AutoShape m70468k4(MasterNotesSlide masterNotesSlide, String str) {
        AutoShape autoShapeM2615fa = ((ShapeCollection) masterNotesSlide.f1077kk.getShapes()).m2615fa();
        autoShapeM2615fa.m2574ss();
        autoShapeM2615fa.mo1214P_().m67987k4(tbp.f49088kk.Clone());
        autoShapeM2615fa.m2555k4(229.5d, 39.0d);
        autoShapeM2615fa.m1591yj().m3331x1(5);
        autoShapeM2615fa.setAlternativeText("");
        autoShapeM2615fa.setName(str);
        autoShapeM2615fa.m2554k4((byte) 0, (byte) 2, (byte) 7, 0L, false);
        autoShapeM2615fa.getAutoShapeLock().setGroupingLocked(true);
        TextFrameFormat textFrameFormat = (TextFrameFormat) autoShapeM2615fa.m276ck().getTextFrameFormat();
        m70469k4(textFrameFormat);
        IParagraphFormat iParagraphFormatM2991x1 = textFrameFormat.m2959m9().m2991x1(0);
        iParagraphFormatM2991x1.setAlignment(0);
        iParagraphFormatM2991x1.getDefaultPortionFormat().setFontHeight(12.0f);
        return autoShapeM2615fa;
    }

    /* JADX INFO: renamed from: kk */
    public static AutoShape m70470kk(MasterNotesSlide masterNotesSlide, String str) {
        C12015qq c12015qqClone = ((NotesSize) masterNotesSlide.getPresentation().getNotesSize()).m2030k4().Clone();
        AutoShape autoShapeM2615fa = ((ShapeCollection) masterNotesSlide.f1077kk.getShapes()).m2615fa();
        autoShapeM2615fa.m2574ss();
        autoShapeM2615fa.mo1214P_().m67987k4(new tbp(((double) c12015qqClone.m56699x1()) - 229.5d, 0.0d));
        autoShapeM2615fa.m2555k4(229.5d, 39.0d);
        autoShapeM2615fa.m1591yj().m3331x1(5);
        autoShapeM2615fa.setAlternativeText("");
        autoShapeM2615fa.setName(str);
        autoShapeM2615fa.m2554k4((byte) 0, (byte) 0, (byte) 4, 1L, false);
        autoShapeM2615fa.getAutoShapeLock().setGroupingLocked(true);
        TextFrameFormat textFrameFormat = (TextFrameFormat) autoShapeM2615fa.m276ck().getTextFrameFormat();
        m70469k4(textFrameFormat);
        IParagraphFormat iParagraphFormatM2991x1 = textFrameFormat.m2959m9().m2991x1(0);
        iParagraphFormatM2991x1.setAlignment(2);
        iParagraphFormatM2991x1.getDefaultPortionFormat().setFontHeight(12.0f);
        autoShapeM2615fa.getTextFrame().setText(C14084qq.m67081jd().m67150u4());
        autoShapeM2615fa.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).addField("datetimeFigureOut");
        return autoShapeM2615fa;
    }

    /* JADX INFO: renamed from: to */
    public static AutoShape m70471to(MasterNotesSlide masterNotesSlide, String str) {
        C12015qq c12015qqClone = ((NotesSize) masterNotesSlide.getPresentation().getNotesSize()).m2030k4().Clone();
        AutoShape autoShapeM2615fa = ((ShapeCollection) masterNotesSlide.f1077kk.getShapes()).m2615fa();
        autoShapeM2615fa.m2574ss();
        autoShapeM2615fa.mo1214P_().m67987k4(new tbp(((double) c12015qqClone.m56699x1()) - 229.5d, ((double) c12015qqClone.m56697kk()) - 39.0d));
        autoShapeM2615fa.m2555k4(229.5d, 39.0d);
        autoShapeM2615fa.m1591yj().m3331x1(5);
        autoShapeM2615fa.setAlternativeText("");
        autoShapeM2615fa.setName(str);
        autoShapeM2615fa.m2554k4((byte) 0, (byte) 2, (byte) 5, 5L, false);
        autoShapeM2615fa.getAutoShapeLock().setGroupingLocked(true);
        TextFrameFormat textFrameFormat = (TextFrameFormat) autoShapeM2615fa.m276ck().getTextFrameFormat();
        m70469k4(textFrameFormat);
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
    public static AutoShape m70472x1(MasterNotesSlide masterNotesSlide, String str) {
        C12015qq c12015qqClone = ((NotesSize) masterNotesSlide.getPresentation().getNotesSize()).m2030k4().Clone();
        AutoShape autoShapeM2615fa = ((ShapeCollection) masterNotesSlide.f1077kk.getShapes()).m2615fa();
        autoShapeM2615fa.m2574ss();
        autoShapeM2615fa.mo1214P_().m67987k4(new tbp(0.0d, ((double) c12015qqClone.m56697kk()) - 39.0d));
        autoShapeM2615fa.m2555k4(229.5d, 39.0d);
        autoShapeM2615fa.m1591yj().m3331x1(5);
        autoShapeM2615fa.setAlternativeText("");
        autoShapeM2615fa.setName(str);
        autoShapeM2615fa.m2554k4((byte) 0, (byte) 2, (byte) 6, 4L, false);
        autoShapeM2615fa.getAutoShapeLock().setGroupingLocked(true);
        TextFrameFormat textFrameFormat = (TextFrameFormat) autoShapeM2615fa.m276ck().getTextFrameFormat();
        m70469k4(textFrameFormat);
        textFrameFormat.setAnchoringType((byte) 2);
        IParagraphFormat iParagraphFormatM2991x1 = textFrameFormat.m2959m9().m2991x1(0);
        iParagraphFormatM2991x1.setAlignment(0);
        iParagraphFormatM2991x1.getDefaultPortionFormat().setFontHeight(12.0f);
        return autoShapeM2615fa;
    }

    @Override // com.aspose.slides.IMasterNotesSlideManager
    public final IMasterNotesSlide getMasterNotesSlide() {
        return this.f48773x1;
    }

    @Override // com.aspose.slides.IMasterNotesSlideManager
    public final void removeMasterNotesSlide() {
        this.f48773x1 = null;
    }

    @Override // com.aspose.slides.IMasterNotesSlideManager
    public final IMasterNotesSlide setDefaultMasterNotesSlide() {
        MasterNotesSlide masterNotesSlide = new MasterNotesSlide(this);
        this.f48773x1 = masterNotesSlide;
        return masterNotesSlide;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70473k4() {
        double d;
        double d2;
        this.f48773x1.getThemeManager().setOverrideTheme(new MasterTheme(this.f48773x1));
        Background background = (Background) this.f48773x1.getBackground();
        background.setType((byte) 0);
        background.m338to().m4205k4(1001L);
        background.getStyleColor().setSchemeColor(0);
        nd1 nd1VarMo1214P_ = this.f48773x1.f1077kk.mo1214P_();
        tbp tbpVar = tbp.f49088kk;
        nd1VarMo1214P_.m67987k4(tbpVar.Clone());
        this.f48773x1.f1077kk.mo1650kk(tbpVar.Clone());
        this.f48773x1.f1077kk.m1647k4(tbpVar.Clone());
        this.f48773x1.f1077kk.m1654x1(tbpVar.Clone());
        m70468k4(this.f48773x1, "Header 1");
        m70470kk(this.f48773x1, "DateTime 2");
        AutoShape autoShapeM2615fa = ((ShapeCollection) this.f48773x1.f1077kk.getShapes()).m2615fa();
        autoShapeM2615fa.m2574ss();
        nd1 nd1VarMo1214P_2 = autoShapeM2615fa.mo1214P_();
        if (this.f48773x1.getPresentation().getSlideSize().getType() == 2) {
            nd1VarMo1214P_2.m67987k4(new tbp(75.25d, 97.25d));
            autoShapeM2615fa.m2555k4(379.0d, 262.37503937007875d);
        } else {
            C12015qq c12015qqClone = ((NotesSize) this.f48773x1.getPresentation().getNotesSize()).m2030k4().Clone();
            C12015qq c12015qqClone2 = ((SlideSize) this.f48773x1.getPresentation().getSlideSize()).m2755k4().Clone();
            double dM56699x1 = (((double) c12015qqClone2.m56699x1()) * 243.0d) / ((double) c12015qqClone2.m56697kk());
            nd1VarMo1214P_2.m67987k4(new tbp((((double) c12015qqClone.m56699x1()) - dM56699x1) / 2.0d, 90.0d));
            autoShapeM2615fa.m2555k4(dM56699x1, 243.0d);
        }
        autoShapeM2615fa.m1591yj().m3331x1(5);
        autoShapeM2615fa.setAlternativeText("");
        autoShapeM2615fa.setName("SlideImage 3");
        autoShapeM2615fa.m2554k4((byte) 0, (byte) 0, (byte) 14, 2L, false);
        autoShapeM2615fa.getAutoShapeLock().setGroupingLocked(true);
        autoShapeM2615fa.getAutoShapeLock().setRotateLocked(true);
        autoShapeM2615fa.getAutoShapeLock().setAspectRatioLocked(true);
        autoShapeM2615fa.getFillFormat().setFillType((byte) 0);
        autoShapeM2615fa.getLineFormat().setWidth(1.0d);
        autoShapeM2615fa.getLineFormat().getFillFormat().setFillType((byte) 1);
        autoShapeM2615fa.getLineFormat().getFillFormat().getSolidFillColor().setPresetColor(7);
        TextFrameFormat textFrameFormat = (TextFrameFormat) autoShapeM2615fa.m276ck().getTextFrameFormat();
        m70469k4(textFrameFormat);
        textFrameFormat.setAnchoringType((byte) 1);
        AutoShape autoShapeM2615fa2 = ((ShapeCollection) this.f48773x1.f1077kk.getShapes()).m2615fa();
        autoShapeM2615fa2.m2574ss();
        nd1 nd1VarMo1214P_3 = autoShapeM2615fa2.mo1214P_();
        if (this.f48773x1.getPresentation().getSlideSize().getType() == 2) {
            nd1VarMo1214P_3.m67987k4(new tbp(53.0d, 374.12503937007875d));
            d = 423.5d;
            d2 = 306.25d;
        } else {
            nd1VarMo1214P_3.m67987k4(new tbp(54.0d, 346.5d));
            d = 432.0d;
            d2 = 283.5d;
        }
        autoShapeM2615fa2.m2555k4(d, d2);
        autoShapeM2615fa2.m1591yj().m3331x1(5);
        autoShapeM2615fa2.setAlternativeText("");
        autoShapeM2615fa2.setName("Notes 4");
        autoShapeM2615fa2.m2554k4((byte) 0, (byte) 2, (byte) 1, 3L, false);
        autoShapeM2615fa2.getAutoShapeLock().setGroupingLocked(true);
        TextFrameFormat textFrameFormat2 = (TextFrameFormat) autoShapeM2615fa2.m276ck().getTextFrameFormat();
        textFrameFormat2.m2959m9().getDefaultParagraphFormat().getDefaultPortionFormat().setFontHeight(12.0f);
        m70469k4(textFrameFormat2);
        Paragraph paragraph = new Paragraph();
        paragraph.setText("First Level");
        autoShapeM2615fa2.getTextFrame().getParagraphs().add(paragraph);
        paragraph.getParagraphFormat().setDepth((short) 0);
        paragraph.getPortions().get_Item(0).getPortionFormat().setSmartTagClean(false);
        Paragraph paragraph2 = new Paragraph();
        paragraph2.setText("Second Level");
        autoShapeM2615fa2.getTextFrame().getParagraphs().add(paragraph2);
        paragraph2.getParagraphFormat().setDepth((short) 1);
        paragraph2.getPortions().get_Item(0).getPortionFormat().setSmartTagClean(false);
        Paragraph paragraph3 = new Paragraph();
        paragraph3.setText("Third level");
        autoShapeM2615fa2.getTextFrame().getParagraphs().add(paragraph3);
        paragraph3.getParagraphFormat().setDepth((short) 2);
        paragraph3.getPortions().get_Item(0).getPortionFormat().setSmartTagClean(false);
        Paragraph paragraph4 = new Paragraph();
        paragraph4.setText("Fourth level");
        autoShapeM2615fa2.getTextFrame().getParagraphs().add(paragraph4);
        paragraph4.getParagraphFormat().setDepth((short) 3);
        paragraph4.getPortions().get_Item(0).getPortionFormat().setSmartTagClean(false);
        Paragraph paragraph5 = new Paragraph();
        paragraph5.setText("Fifth level");
        autoShapeM2615fa2.getTextFrame().getParagraphs().add(paragraph5);
        paragraph5.getParagraphFormat().setDepth((short) 4);
        paragraph5.getPortions().get_Item(0).getPortionFormat().setSmartTagClean(false);
        textFrameFormat2.m2959m9().m2987k4(new C14093tq<>(2));
        textFrameFormat2.m2942du().m64159k4(new C14093tq<>(2));
        m70472x1(this.f48773x1, "Footer 5");
        m70471to(this.f48773x1, "SlideNumber 6");
        TextStyle textStyle = (TextStyle) this.f48773x1.getNotesStyle();
        textStyle.m2989m9();
        textStyle.m2984k4(1);
        ParagraphFormat paragraphFormat = (ParagraphFormat) textStyle.getLevel(0);
        paragraphFormat.setMarginLeft(0.0f);
        paragraphFormat.setAlignment(0);
        paragraphFormat.setDefaultTabSize(72.0f);
        paragraphFormat.setRightToLeft((byte) 0);
        paragraphFormat.setEastAsianLineBreak((byte) 1);
        paragraphFormat.setLatinLineBreak((byte) 0);
        paragraphFormat.setHangingPunctuation((byte) 1);
        PortionFormat portionFormatM2204to = paragraphFormat.m2204to();
        portionFormatM2204to.setFontHeight(12.0f);
        portionFormatM2204to.setKerningMinimalSize(12.0f);
        portionFormatM2204to.getFillFormat().setFillType((byte) 1);
        portionFormatM2204to.getFillFormat().getSolidFillColor().setSchemeColor(1);
        portionFormatM2204to.setLatinFont(new FontData("+mn-lt"));
        portionFormatM2204to.setEastAsianFont(new FontData("+mn-ea"));
        portionFormatM2204to.setComplexScriptFont(new FontData("+mn-cs"));
        int i = 0;
        int i2 = 1;
        while (i2 < 9) {
            i += 457200;
            int i3 = i2 + 1;
            textStyle.m2984k4(i3);
            ParagraphFormat paragraphFormat2 = (ParagraphFormat) textStyle.getLevel(i2);
            paragraphFormat2.m2196k4(paragraphFormat);
            paragraphFormat2.setMarginLeft((float) (((double) i) / 12700.0d));
            paragraphFormat = paragraphFormat2;
            i2 = i3;
        }
        this.f48773x1.getPresentation().getViewProperties().getNotesViewProperties().setVariableScale(true);
        this.f48773x1.m1933x6().m72933k4(new com.aspose.slides.internal.p332p7.qvp());
        this.f48773x1.m1933x6().m72932dy().m39713x1(false);
        this.f48773x1.m1933x6().m72932dy().m39709kk(false);
        this.f48773x1.m1933x6().m72932dy().m39711to(false);
        this.f48773x1.m1933x6().m72932dy().m39707k4(true);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70469k4(TextFrameFormat textFrameFormat) {
        textFrameFormat.setTextVerticalType((byte) 0);
        textFrameFormat.m2953k4(xmh.m73497x1(f48772k4, 12700.0d).Clone());
        textFrameFormat.m2970x1((byte) 0);
    }
}
