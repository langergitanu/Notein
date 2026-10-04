package com.aspose.slides;

import com.alipay.share.sdk.openapi.APApiImlV1;
import com.alipay.share.sdk.openapi.BaseReq;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class xxd {
    /* JADX INFO: renamed from: k4 */
    public static AutoShape m73630k4(MasterSlide masterSlide, String str) {
        AutoShape autoShapeM2615fa = ((ShapeCollection) masterSlide.f1077kk.getShapes()).m2615fa();
        autoShapeM2615fa.m2574ss();
        autoShapeM2615fa.mo1214P_().m67987k4(new tbp(36.0d, 500.5d));
        autoShapeM2615fa.m2555k4(168.0d, 28.75d);
        autoShapeM2615fa.m1591yj().m3331x1(5);
        autoShapeM2615fa.setAlternativeText("");
        autoShapeM2615fa.setName(str);
        autoShapeM2615fa.m2554k4((byte) 0, (byte) 1, (byte) 4, 2L, false);
        autoShapeM2615fa.getAutoShapeLock().setGroupingLocked(true);
        TextFrameFormat textFrameFormat = (TextFrameFormat) autoShapeM2615fa.m276ck().getTextFrameFormat();
        textFrameFormat.setTextVerticalType((byte) 0);
        textFrameFormat.m2953k4(xmh.m73497x1(s8a.f48772k4, 12700.0d).Clone());
        textFrameFormat.m2970x1((byte) 0);
        textFrameFormat.setAnchoringType((byte) 1);
        textFrameFormat.m2959m9().m2991x1(0).getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        textFrameFormat.m2959m9().m2991x1(0).getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        textFrameFormat.m2959m9().m2991x1(0).getDefaultPortionFormat().getFillFormat().getSolidFillColor().getColorTransform().add(0, 0.75f);
        textFrameFormat.m2959m9().m2991x1(0).getDefaultPortionFormat().setFontHeight(12.0f);
        textFrameFormat.m2959m9().m2991x1(0).setAlignment(0);
        Paragraph paragraph = new Paragraph();
        Portion portion = new Portion();
        portion.addField("datetimeFigureOut");
        ((Field) portion.getField()).m1445k4(new C14047bz("E8FD0B7A-F5DD-4F40-B4CB-3B2C354B893A"));
        portion.getPortionFormat().setLanguageId("en-US");
        portion.getPortionFormat().setSmartTagClean(false);
        portion.m2289k4("11/7/2009");
        paragraph.getPortions().add(portion);
        Portion portion2 = new Portion();
        portion2.getPortionFormat().setLanguageId("en-US");
        paragraph.getPortions().add(portion2);
        autoShapeM2615fa.getTextFrame().getParagraphs().add(paragraph);
        autoShapeM2615fa.mo277dy();
        return autoShapeM2615fa;
    }

    /* JADX INFO: renamed from: kk */
    public static AutoShape m73632kk(MasterSlide masterSlide, String str) {
        AutoShape autoShapeM2615fa = ((ShapeCollection) masterSlide.f1077kk.getShapes()).m2615fa();
        autoShapeM2615fa.m2574ss();
        autoShapeM2615fa.mo1214P_().m67987k4(new tbp(516.0d, 500.5d));
        autoShapeM2615fa.m2555k4(168.0d, 28.75d);
        autoShapeM2615fa.m1591yj().m3331x1(5);
        autoShapeM2615fa.setAlternativeText("");
        autoShapeM2615fa.setName(str);
        autoShapeM2615fa.m2554k4((byte) 0, (byte) 2, (byte) 5, 4L, false);
        autoShapeM2615fa.getAutoShapeLock().setGroupingLocked(true);
        TextFrameFormat textFrameFormat = (TextFrameFormat) autoShapeM2615fa.m276ck().getTextFrameFormat();
        textFrameFormat.setTextVerticalType((byte) 0);
        textFrameFormat.m2953k4(xmh.m73497x1(s8a.f48772k4, 12700.0d).Clone());
        textFrameFormat.m2970x1((byte) 0);
        textFrameFormat.setAnchoringType((byte) 1);
        ((TextStyle) autoShapeM2615fa.getTextFrame().getTextFrameFormat().getTextStyle()).m2991x1(0).getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        ((TextStyle) autoShapeM2615fa.getTextFrame().getTextFrameFormat().getTextStyle()).m2991x1(0).getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        ((TextStyle) autoShapeM2615fa.getTextFrame().getTextFrameFormat().getTextStyle()).m2991x1(0).getDefaultPortionFormat().getFillFormat().getSolidFillColor().getColorTransform().add(0, 0.75f);
        ((TextStyle) autoShapeM2615fa.getTextFrame().getTextFrameFormat().getTextStyle()).m2991x1(0).getDefaultPortionFormat().setFontHeight(12.0f);
        ((TextStyle) autoShapeM2615fa.getTextFrame().getTextFrameFormat().getTextStyle()).m2991x1(0).setAlignment(2);
        Paragraph paragraph = new Paragraph();
        Portion portion = new Portion();
        portion.addField("slidenum");
        ((Field) portion.getField()).m1445k4(new C14047bz("93AE1883-0942-4AA3-9DB2-9C7C3A0314B1"));
        portion.getPortionFormat().setLanguageId("en-US");
        portion.getPortionFormat().setSmartTagClean(false);
        portion.m2289k4(C14113y2.m67408k4("‹", "#", "›"));
        paragraph.getPortions().add(portion);
        Portion portion2 = new Portion();
        portion2.getPortionFormat().setLanguageId("en-US");
        paragraph.getPortions().add(portion2);
        autoShapeM2615fa.getTextFrame().getParagraphs().add(paragraph);
        autoShapeM2615fa.mo277dy();
        return autoShapeM2615fa;
    }

    /* JADX INFO: renamed from: x1 */
    public static AutoShape m73633x1(MasterSlide masterSlide, String str) {
        AutoShape autoShapeM2615fa = ((ShapeCollection) masterSlide.f1077kk.getShapes()).m2615fa();
        autoShapeM2615fa.m2574ss();
        autoShapeM2615fa.mo1214P_().m67987k4(new tbp(246.0d, 500.5d));
        autoShapeM2615fa.m2555k4(228.0d, 28.75d);
        autoShapeM2615fa.m1591yj().m3331x1(5);
        autoShapeM2615fa.setAlternativeText("");
        autoShapeM2615fa.setName(str);
        autoShapeM2615fa.m2554k4((byte) 0, (byte) 2, (byte) 6, 3L, false);
        autoShapeM2615fa.getAutoShapeLock().setGroupingLocked(true);
        TextFrame textFrameM276ck = autoShapeM2615fa.m276ck();
        TextFrameFormat textFrameFormat = (TextFrameFormat) textFrameM276ck.getTextFrameFormat();
        textFrameFormat.setTextVerticalType((byte) 0);
        textFrameFormat.m2953k4(xmh.m73497x1(s8a.f48772k4, 12700.0d).Clone());
        textFrameFormat.m2970x1((byte) 0);
        textFrameFormat.setAnchoringType((byte) 1);
        IParagraphFormat iParagraphFormatM2991x1 = ((TextStyle) textFrameM276ck.getTextFrameFormat().getTextStyle()).m2991x1(0);
        iParagraphFormatM2991x1.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        iParagraphFormatM2991x1.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        iParagraphFormatM2991x1.getDefaultPortionFormat().getFillFormat().getSolidFillColor().getColorTransform().add(0, 0.75f);
        iParagraphFormatM2991x1.getDefaultPortionFormat().setFontHeight(12.0f);
        iParagraphFormatM2991x1.setAlignment(1);
        Paragraph paragraph = new Paragraph();
        Portion portion = new Portion();
        portion.getPortionFormat().setLanguageId("en-US");
        paragraph.getPortions().add(portion);
        textFrameM276ck.getParagraphs().add(paragraph);
        autoShapeM2615fa.mo277dy();
        return autoShapeM2615fa;
    }

    /* JADX WARN: Type inference failed for: r10v19, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r10v20, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r10v34, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r10v35, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r10v49, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r10v50, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r4v40, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r4v41, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v105, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v106, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v115, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v116, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v125, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v126, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v136, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v137, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v146, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v147, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v157, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v158, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v168, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v169, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v179, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v180, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v190, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v191, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v201, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v202, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v30, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v31, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v45, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v46, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v60, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v61, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v75, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v76, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v90, types: [byte[], com.aspose.slides.IPortionFormat] */
    /* JADX WARN: Type inference failed for: r5v91, types: [boolean, com.aspose.slides.IPortionFormat] */
    /* JADX INFO: renamed from: k4 */
    public static MasterSlide m73631k4(Presentation presentation) {
        MasterSlide masterSlide = new MasterSlide((MasterSlideCollection) presentation.getMasters());
        masterSlide.m1944x6().m5302k4(presentation.m2351fa().m68390um());
        masterSlide.getBackground().setType((byte) 0);
        masterSlide.getBackground().setStyleIndex(1);
        masterSlide.getBackground().getStyleColor().setSchemeColor(0);
        GroupShape groupShape = masterSlide.f1077kk;
        nd1 nd1VarMo1214P_ = groupShape.mo1214P_();
        tbp tbpVar = tbp.f49088kk;
        nd1VarMo1214P_.m67987k4(tbpVar.Clone());
        groupShape.mo1650kk(tbpVar.Clone());
        groupShape.m1647k4(tbpVar.Clone());
        groupShape.m1654x1(tbpVar.Clone());
        groupShape.m2556k4(new EffectFormat(masterSlide.f1077kk));
        groupShape.setAlternativeText("");
        groupShape.setName("");
        AutoShape autoShapeM2615fa = ((ShapeCollection) groupShape.getShapes()).m2615fa();
        autoShapeM2615fa.m2574ss();
        autoShapeM2615fa.mo1214P_().m67987k4(new tbp(36.0d, 21.62504005432129d));
        autoShapeM2615fa.m2555k4(648.0d, 90.0d);
        autoShapeM2615fa.m1591yj().m3331x1(5);
        autoShapeM2615fa.setAlternativeText("");
        autoShapeM2615fa.setName("Title Placeholder 1");
        autoShapeM2615fa.m2554k4((byte) 0, (byte) 0, (byte) 0, 0L, false);
        autoShapeM2615fa.getAutoShapeLock().setGroupingLocked(true);
        TextFrameFormat textFrameFormat = (TextFrameFormat) autoShapeM2615fa.m276ck().getTextFrameFormat();
        textFrameFormat.setAutofitType((byte) 1);
        textFrameFormat.setTextVerticalType((byte) 0);
        xmh xmhVar = s8a.f48772k4;
        textFrameFormat.m2953k4(xmh.m73497x1(xmhVar, 12700.0d).Clone());
        textFrameFormat.m2970x1((byte) 0);
        textFrameFormat.setAnchoringType((byte) 1);
        Paragraph paragraph = new Paragraph();
        Portion portion = new Portion();
        C22233OoooOOo.OooO00o(portion, "en-US", false, "Click to edit Master title style", paragraph).add(portion);
        Portion portion2 = new Portion();
        portion2.getPortionFormat().setLanguageId("en-US");
        paragraph.getPortions().add(portion2);
        autoShapeM2615fa.getTextFrame().getParagraphs().add(paragraph);
        autoShapeM2615fa.mo277dy();
        AutoShape autoShapeM2615fa2 = ((ShapeCollection) groupShape.getShapes()).m2615fa();
        autoShapeM2615fa2.m2574ss();
        autoShapeM2615fa2.mo1214P_().m67987k4(new tbp(36.0d, 126.0d));
        autoShapeM2615fa2.m2555k4(648.0d, 356.3750305175781d);
        autoShapeM2615fa2.m1591yj().m3331x1(5);
        autoShapeM2615fa2.setAlternativeText("");
        autoShapeM2615fa2.setName("Text Placeholder 2");
        autoShapeM2615fa2.m2554k4((byte) 0, (byte) 0, (byte) 1, 1L, false);
        autoShapeM2615fa2.getAutoShapeLock().setGroupingLocked(true);
        TextFrameFormat textFrameFormat2 = (TextFrameFormat) autoShapeM2615fa2.m276ck().getTextFrameFormat();
        textFrameFormat2.setAutofitType((byte) 1);
        textFrameFormat2.setTextVerticalType((byte) 0);
        textFrameFormat2.m2953k4(xmh.m73497x1(xmhVar, 12700.0d).Clone());
        textFrameFormat2.m2970x1((byte) 0);
        Paragraph paragraph2 = new Paragraph();
        paragraph2.getParagraphFormat().setDepth((short) 0);
        Portion portion3 = new Portion();
        C22233OoooOOo.OooO00o(portion3, "en-US", false, "Click to edit Master text styles", paragraph2).add(portion3);
        autoShapeM2615fa2.getTextFrame().getParagraphs().add(paragraph2);
        Paragraph paragraph3 = new Paragraph();
        paragraph3.getParagraphFormat().setDepth((short) 1);
        Portion portion4 = new Portion();
        C22233OoooOOo.OooO00o(portion4, "en-US", false, "Second level", paragraph3).add(portion4);
        autoShapeM2615fa2.getTextFrame().getParagraphs().add(paragraph3);
        Paragraph paragraph4 = new Paragraph();
        paragraph4.getParagraphFormat().setDepth((short) 2);
        Portion portion5 = new Portion();
        C22233OoooOOo.OooO00o(portion5, "en-US", false, "Third level", paragraph4).add(portion5);
        autoShapeM2615fa2.getTextFrame().getParagraphs().add(paragraph4);
        Paragraph paragraph5 = new Paragraph();
        paragraph5.getParagraphFormat().setDepth((short) 3);
        Portion portion6 = new Portion();
        C22233OoooOOo.OooO00o(portion6, "en-US", false, "Fourth level", paragraph5).add(portion6);
        autoShapeM2615fa2.getTextFrame().getParagraphs().add(paragraph5);
        Paragraph paragraph6 = new Paragraph();
        paragraph6.getParagraphFormat().setDepth((short) 4);
        Portion portion7 = new Portion();
        C22233OoooOOo.OooO00o(portion7, "en-US", false, "Fifth level", paragraph6).add(portion7);
        Portion portion8 = new Portion();
        portion8.getPortionFormat().setLanguageId("en-US");
        paragraph6.getPortions().add(portion8);
        autoShapeM2615fa2.getTextFrame().getParagraphs().add(paragraph6);
        autoShapeM2615fa2.mo277dy();
        m73630k4(masterSlide, "Date Placeholder 3");
        m73633x1(masterSlide, "Footer Placeholder 4");
        m73632kk(masterSlide, "Slide Number Placeholder 5");
        IParagraphFormat iParagraphFormatM2991x1 = ((TextStyle) masterSlide.getTitleStyle()).m2991x1(0);
        iParagraphFormatM2991x1.setSpaceBefore(0.0f);
        iParagraphFormatM2991x1.getBullet().setType((byte) 0);
        iParagraphFormatM2991x1.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        iParagraphFormatM2991x1.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        iParagraphFormatM2991x1.getDefaultPortionFormat().setFontHeight(44.0f);
        iParagraphFormatM2991x1.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mj-ea", APApiImlV1.checkSumConsistent("+mj-lt", iParagraphFormatM2991x1.getDefaultPortionFormat()), iParagraphFormatM2991x1).setComplexScriptFont(new FontData("+mj-cs"));
        iParagraphFormatM2991x1.setAlignment(1);
        iParagraphFormatM2991x1.setDefaultTabSize(72.0f);
        iParagraphFormatM2991x1.setRightToLeft((byte) 0);
        iParagraphFormatM2991x1.setEastAsianLineBreak((byte) 1);
        iParagraphFormatM2991x1.setLatinLineBreak((byte) 0);
        iParagraphFormatM2991x1.setHangingPunctuation((byte) 1);
        IParagraphFormat iParagraphFormatM2991x12 = ((TextStyle) masterSlide.getBodyStyle()).m2991x1(0);
        iParagraphFormatM2991x12.setSpaceBefore(20.0f);
        iParagraphFormatM2991x12.getBullet().setBulletHardFont((byte) 1);
        iParagraphFormatM2991x12.getBullet().setFont(new FontData("Arial", (byte) 0, (byte) 34));
        iParagraphFormatM2991x12.getBullet().setType((byte) 1);
        iParagraphFormatM2991x12.getBullet().setChar((char) 8226);
        iParagraphFormatM2991x12.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        iParagraphFormatM2991x12.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        iParagraphFormatM2991x12.getDefaultPortionFormat().setFontHeight(32.0f);
        iParagraphFormatM2991x12.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", iParagraphFormatM2991x12.getDefaultPortionFormat()), iParagraphFormatM2991x12);
        BaseReq.toBundle("+mn-cs");
        iParagraphFormatM2991x12.setIndent(-27.0f);
        iParagraphFormatM2991x12.setDefaultTabSize(72.0f);
        iParagraphFormatM2991x12.setRightToLeft((byte) 0);
        iParagraphFormatM2991x12.setEastAsianLineBreak((byte) 1);
        iParagraphFormatM2991x12.setLatinLineBreak((byte) 0);
        iParagraphFormatM2991x12.setHangingPunctuation((byte) 1);
        IParagraphFormat iParagraphFormatM2991x13 = ((TextStyle) masterSlide.getBodyStyle()).m2991x1(1);
        iParagraphFormatM2991x13.setSpaceBefore(20.0f);
        iParagraphFormatM2991x13.getBullet().setBulletHardFont((byte) 1);
        iParagraphFormatM2991x13.getBullet().setFont(new FontData("Arial", (byte) 0, (byte) 34));
        iParagraphFormatM2991x13.getBullet().setType((byte) 1);
        iParagraphFormatM2991x13.getBullet().setChar((char) 8211);
        iParagraphFormatM2991x13.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        iParagraphFormatM2991x13.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        iParagraphFormatM2991x13.getDefaultPortionFormat().setFontHeight(28.0f);
        iParagraphFormatM2991x13.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", iParagraphFormatM2991x13.getDefaultPortionFormat()), iParagraphFormatM2991x13);
        BaseReq.toBundle("+mn-cs");
        iParagraphFormatM2991x13.setIndent(-22.5f);
        iParagraphFormatM2991x13.setDefaultTabSize(72.0f);
        iParagraphFormatM2991x13.setRightToLeft((byte) 0);
        iParagraphFormatM2991x13.setEastAsianLineBreak((byte) 1);
        iParagraphFormatM2991x13.setLatinLineBreak((byte) 0);
        iParagraphFormatM2991x13.setHangingPunctuation((byte) 1);
        IParagraphFormat iParagraphFormatM2991x14 = ((TextStyle) masterSlide.getBodyStyle()).m2991x1(2);
        iParagraphFormatM2991x14.setSpaceBefore(20.0f);
        iParagraphFormatM2991x14.getBullet().setBulletHardFont((byte) 1);
        iParagraphFormatM2991x14.getBullet().setFont(new FontData("Arial", (byte) 0, (byte) 34));
        iParagraphFormatM2991x14.getBullet().setType((byte) 1);
        iParagraphFormatM2991x14.getBullet().setChar((char) 8226);
        iParagraphFormatM2991x14.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        iParagraphFormatM2991x14.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        iParagraphFormatM2991x14.getDefaultPortionFormat().setFontHeight(24.0f);
        iParagraphFormatM2991x14.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", iParagraphFormatM2991x14.getDefaultPortionFormat()), iParagraphFormatM2991x14);
        BaseReq.toBundle("+mn-cs");
        iParagraphFormatM2991x14.setIndent(-18.0f);
        iParagraphFormatM2991x14.setDefaultTabSize(72.0f);
        iParagraphFormatM2991x14.setRightToLeft((byte) 0);
        iParagraphFormatM2991x14.setEastAsianLineBreak((byte) 1);
        iParagraphFormatM2991x14.setLatinLineBreak((byte) 0);
        iParagraphFormatM2991x14.setHangingPunctuation((byte) 1);
        IParagraphFormat iParagraphFormatM2991x15 = ((TextStyle) masterSlide.getBodyStyle()).m2991x1(3);
        iParagraphFormatM2991x15.setSpaceBefore(20.0f);
        iParagraphFormatM2991x15.getBullet().setBulletHardFont((byte) 1);
        iParagraphFormatM2991x15.getBullet().setFont(new FontData("Arial", (byte) 0, (byte) 34));
        iParagraphFormatM2991x15.getBullet().setType((byte) 1);
        iParagraphFormatM2991x15.getBullet().setChar((char) 8211);
        iParagraphFormatM2991x15.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        iParagraphFormatM2991x15.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        iParagraphFormatM2991x15.getDefaultPortionFormat().setFontHeight(20.0f);
        iParagraphFormatM2991x15.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", iParagraphFormatM2991x15.getDefaultPortionFormat()), iParagraphFormatM2991x15);
        BaseReq.toBundle("+mn-cs");
        iParagraphFormatM2991x15.setIndent(-18.0f);
        iParagraphFormatM2991x15.setDefaultTabSize(72.0f);
        iParagraphFormatM2991x15.setRightToLeft((byte) 0);
        iParagraphFormatM2991x15.setEastAsianLineBreak((byte) 1);
        iParagraphFormatM2991x15.setLatinLineBreak((byte) 0);
        iParagraphFormatM2991x15.setHangingPunctuation((byte) 1);
        IParagraphFormat iParagraphFormatM2991x16 = ((TextStyle) masterSlide.getBodyStyle()).m2991x1(4);
        iParagraphFormatM2991x16.setSpaceBefore(20.0f);
        iParagraphFormatM2991x16.getBullet().setBulletHardFont((byte) 1);
        iParagraphFormatM2991x16.getBullet().setFont(new FontData("Arial", (byte) 0, (byte) 34));
        iParagraphFormatM2991x16.getBullet().setType((byte) 1);
        iParagraphFormatM2991x16.getBullet().setChar((char) 187);
        iParagraphFormatM2991x16.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        iParagraphFormatM2991x16.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        iParagraphFormatM2991x16.getDefaultPortionFormat().setFontHeight(20.0f);
        iParagraphFormatM2991x16.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", iParagraphFormatM2991x16.getDefaultPortionFormat()), iParagraphFormatM2991x16);
        BaseReq.toBundle("+mn-cs");
        iParagraphFormatM2991x16.setIndent(-18.0f);
        iParagraphFormatM2991x16.setDefaultTabSize(72.0f);
        iParagraphFormatM2991x16.setRightToLeft((byte) 0);
        iParagraphFormatM2991x16.setEastAsianLineBreak((byte) 1);
        iParagraphFormatM2991x16.setLatinLineBreak((byte) 0);
        iParagraphFormatM2991x16.setHangingPunctuation((byte) 1);
        IParagraphFormat iParagraphFormatM2991x17 = ((TextStyle) masterSlide.getBodyStyle()).m2991x1(5);
        iParagraphFormatM2991x17.setSpaceBefore(20.0f);
        iParagraphFormatM2991x17.getBullet().setBulletHardFont((byte) 1);
        iParagraphFormatM2991x17.getBullet().setFont(new FontData("Arial", (byte) 0, (byte) 34));
        iParagraphFormatM2991x17.getBullet().setType((byte) 1);
        iParagraphFormatM2991x17.getBullet().setChar((char) 8226);
        iParagraphFormatM2991x17.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        iParagraphFormatM2991x17.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        iParagraphFormatM2991x17.getDefaultPortionFormat().setFontHeight(20.0f);
        iParagraphFormatM2991x17.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", iParagraphFormatM2991x17.getDefaultPortionFormat()), iParagraphFormatM2991x17);
        BaseReq.toBundle("+mn-cs");
        iParagraphFormatM2991x17.setIndent(-18.0f);
        iParagraphFormatM2991x17.setDefaultTabSize(72.0f);
        iParagraphFormatM2991x17.setRightToLeft((byte) 0);
        iParagraphFormatM2991x17.setEastAsianLineBreak((byte) 1);
        iParagraphFormatM2991x17.setLatinLineBreak((byte) 0);
        iParagraphFormatM2991x17.setHangingPunctuation((byte) 1);
        IParagraphFormat iParagraphFormatM2991x18 = ((TextStyle) masterSlide.getBodyStyle()).m2991x1(6);
        iParagraphFormatM2991x18.setSpaceBefore(20.0f);
        iParagraphFormatM2991x18.getBullet().setBulletHardFont((byte) 1);
        iParagraphFormatM2991x18.getBullet().setFont(new FontData("Arial", (byte) 0, (byte) 34));
        iParagraphFormatM2991x18.getBullet().setType((byte) 1);
        iParagraphFormatM2991x18.getBullet().setChar((char) 8226);
        iParagraphFormatM2991x18.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        iParagraphFormatM2991x18.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        iParagraphFormatM2991x18.getDefaultPortionFormat().setFontHeight(20.0f);
        iParagraphFormatM2991x18.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", iParagraphFormatM2991x18.getDefaultPortionFormat()), iParagraphFormatM2991x18);
        BaseReq.toBundle("+mn-cs");
        iParagraphFormatM2991x18.setIndent(-18.0f);
        iParagraphFormatM2991x18.setDefaultTabSize(72.0f);
        iParagraphFormatM2991x18.setRightToLeft((byte) 0);
        iParagraphFormatM2991x18.setEastAsianLineBreak((byte) 1);
        iParagraphFormatM2991x18.setLatinLineBreak((byte) 0);
        iParagraphFormatM2991x18.setHangingPunctuation((byte) 1);
        IParagraphFormat iParagraphFormatM2991x19 = ((TextStyle) masterSlide.getBodyStyle()).m2991x1(7);
        iParagraphFormatM2991x19.setSpaceBefore(20.0f);
        iParagraphFormatM2991x19.getBullet().setBulletHardFont((byte) 1);
        iParagraphFormatM2991x19.getBullet().setFont(new FontData("Arial", (byte) 0, (byte) 34));
        iParagraphFormatM2991x19.getBullet().setType((byte) 1);
        iParagraphFormatM2991x19.getBullet().setChar((char) 8226);
        iParagraphFormatM2991x19.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        iParagraphFormatM2991x19.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        iParagraphFormatM2991x19.getDefaultPortionFormat().setFontHeight(20.0f);
        iParagraphFormatM2991x19.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", iParagraphFormatM2991x19.getDefaultPortionFormat()), iParagraphFormatM2991x19);
        BaseReq.toBundle("+mn-cs");
        iParagraphFormatM2991x19.setIndent(-18.0f);
        iParagraphFormatM2991x19.setDefaultTabSize(72.0f);
        iParagraphFormatM2991x19.setRightToLeft((byte) 0);
        iParagraphFormatM2991x19.setEastAsianLineBreak((byte) 1);
        iParagraphFormatM2991x19.setLatinLineBreak((byte) 0);
        iParagraphFormatM2991x19.setHangingPunctuation((byte) 1);
        IParagraphFormat iParagraphFormatM2991x110 = ((TextStyle) masterSlide.getBodyStyle()).m2991x1(8);
        iParagraphFormatM2991x110.setSpaceBefore(20.0f);
        iParagraphFormatM2991x110.getBullet().setBulletHardFont((byte) 1);
        iParagraphFormatM2991x110.getBullet().setFont(new FontData("Arial", (byte) 0, (byte) 34));
        iParagraphFormatM2991x110.getBullet().setType((byte) 1);
        iParagraphFormatM2991x110.getBullet().setChar((char) 8226);
        iParagraphFormatM2991x110.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        iParagraphFormatM2991x110.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        iParagraphFormatM2991x110.getDefaultPortionFormat().setFontHeight(20.0f);
        iParagraphFormatM2991x110.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", iParagraphFormatM2991x110.getDefaultPortionFormat()), iParagraphFormatM2991x110);
        BaseReq.toBundle("+mn-cs");
        iParagraphFormatM2991x110.setIndent(-18.0f);
        iParagraphFormatM2991x110.setDefaultTabSize(72.0f);
        iParagraphFormatM2991x110.setRightToLeft((byte) 0);
        iParagraphFormatM2991x110.setEastAsianLineBreak((byte) 1);
        iParagraphFormatM2991x110.setLatinLineBreak((byte) 0);
        iParagraphFormatM2991x110.setHangingPunctuation((byte) 1);
        masterSlide.getOtherStyle().getDefaultParagraphFormat().getDefaultPortionFormat().setLanguageId("en-US");
        IParagraphFormat iParagraphFormatM2991x111 = ((TextStyle) masterSlide.getOtherStyle()).m2991x1(0);
        iParagraphFormatM2991x111.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        iParagraphFormatM2991x111.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        iParagraphFormatM2991x111.getDefaultPortionFormat().setFontHeight(18.0f);
        iParagraphFormatM2991x111.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", iParagraphFormatM2991x111.getDefaultPortionFormat()), iParagraphFormatM2991x111);
        BaseReq.toBundle("+mn-cs");
        iParagraphFormatM2991x111.setDefaultTabSize(72.0f);
        iParagraphFormatM2991x111.setRightToLeft((byte) 0);
        iParagraphFormatM2991x111.setEastAsianLineBreak((byte) 1);
        iParagraphFormatM2991x111.setLatinLineBreak((byte) 0);
        iParagraphFormatM2991x111.setHangingPunctuation((byte) 1);
        IParagraphFormat iParagraphFormatM2991x112 = ((TextStyle) masterSlide.getOtherStyle()).m2991x1(1);
        iParagraphFormatM2991x112.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        iParagraphFormatM2991x112.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        iParagraphFormatM2991x112.getDefaultPortionFormat().setFontHeight(18.0f);
        iParagraphFormatM2991x112.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", iParagraphFormatM2991x112.getDefaultPortionFormat()), iParagraphFormatM2991x112);
        BaseReq.toBundle("+mn-cs");
        iParagraphFormatM2991x112.setDefaultTabSize(72.0f);
        iParagraphFormatM2991x112.setRightToLeft((byte) 0);
        iParagraphFormatM2991x112.setEastAsianLineBreak((byte) 1);
        iParagraphFormatM2991x112.setLatinLineBreak((byte) 0);
        iParagraphFormatM2991x112.setHangingPunctuation((byte) 1);
        IParagraphFormat iParagraphFormatM2991x113 = ((TextStyle) masterSlide.getOtherStyle()).m2991x1(2);
        iParagraphFormatM2991x113.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        iParagraphFormatM2991x113.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        iParagraphFormatM2991x113.getDefaultPortionFormat().setFontHeight(18.0f);
        iParagraphFormatM2991x113.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", iParagraphFormatM2991x113.getDefaultPortionFormat()), iParagraphFormatM2991x113);
        BaseReq.toBundle("+mn-cs");
        iParagraphFormatM2991x113.setDefaultTabSize(72.0f);
        iParagraphFormatM2991x113.setRightToLeft((byte) 0);
        iParagraphFormatM2991x113.setEastAsianLineBreak((byte) 1);
        iParagraphFormatM2991x113.setLatinLineBreak((byte) 0);
        iParagraphFormatM2991x113.setHangingPunctuation((byte) 1);
        IParagraphFormat iParagraphFormatM2991x114 = ((TextStyle) masterSlide.getOtherStyle()).m2991x1(3);
        iParagraphFormatM2991x114.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        iParagraphFormatM2991x114.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        iParagraphFormatM2991x114.getDefaultPortionFormat().setFontHeight(18.0f);
        iParagraphFormatM2991x114.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", iParagraphFormatM2991x114.getDefaultPortionFormat()), iParagraphFormatM2991x114);
        BaseReq.toBundle("+mn-cs");
        iParagraphFormatM2991x114.setDefaultTabSize(72.0f);
        iParagraphFormatM2991x114.setRightToLeft((byte) 0);
        iParagraphFormatM2991x114.setEastAsianLineBreak((byte) 1);
        iParagraphFormatM2991x114.setLatinLineBreak((byte) 0);
        iParagraphFormatM2991x114.setHangingPunctuation((byte) 1);
        IParagraphFormat iParagraphFormatM2991x115 = ((TextStyle) masterSlide.getOtherStyle()).m2991x1(4);
        iParagraphFormatM2991x115.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        iParagraphFormatM2991x115.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        iParagraphFormatM2991x115.getDefaultPortionFormat().setFontHeight(18.0f);
        iParagraphFormatM2991x115.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", iParagraphFormatM2991x115.getDefaultPortionFormat()), iParagraphFormatM2991x115);
        BaseReq.toBundle("+mn-cs");
        iParagraphFormatM2991x115.setDefaultTabSize(72.0f);
        iParagraphFormatM2991x115.setRightToLeft((byte) 0);
        iParagraphFormatM2991x115.setEastAsianLineBreak((byte) 1);
        iParagraphFormatM2991x115.setLatinLineBreak((byte) 0);
        iParagraphFormatM2991x115.setHangingPunctuation((byte) 1);
        IParagraphFormat iParagraphFormatM2991x116 = ((TextStyle) masterSlide.getOtherStyle()).m2991x1(5);
        iParagraphFormatM2991x116.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        iParagraphFormatM2991x116.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        iParagraphFormatM2991x116.getDefaultPortionFormat().setFontHeight(18.0f);
        iParagraphFormatM2991x116.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", iParagraphFormatM2991x116.getDefaultPortionFormat()), iParagraphFormatM2991x116);
        BaseReq.toBundle("+mn-cs");
        iParagraphFormatM2991x116.setDefaultTabSize(72.0f);
        iParagraphFormatM2991x116.setRightToLeft((byte) 0);
        iParagraphFormatM2991x116.setEastAsianLineBreak((byte) 1);
        iParagraphFormatM2991x116.setLatinLineBreak((byte) 0);
        iParagraphFormatM2991x116.setHangingPunctuation((byte) 1);
        IParagraphFormat iParagraphFormatM2991x117 = ((TextStyle) masterSlide.getOtherStyle()).m2991x1(6);
        iParagraphFormatM2991x117.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        iParagraphFormatM2991x117.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        iParagraphFormatM2991x117.getDefaultPortionFormat().setFontHeight(18.0f);
        iParagraphFormatM2991x117.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", iParagraphFormatM2991x117.getDefaultPortionFormat()), iParagraphFormatM2991x117);
        BaseReq.toBundle("+mn-cs");
        iParagraphFormatM2991x117.setDefaultTabSize(72.0f);
        iParagraphFormatM2991x117.setRightToLeft((byte) 0);
        iParagraphFormatM2991x117.setEastAsianLineBreak((byte) 1);
        iParagraphFormatM2991x117.setLatinLineBreak((byte) 0);
        iParagraphFormatM2991x117.setHangingPunctuation((byte) 1);
        IParagraphFormat iParagraphFormatM2991x118 = ((TextStyle) masterSlide.getOtherStyle()).m2991x1(7);
        iParagraphFormatM2991x118.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        iParagraphFormatM2991x118.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        iParagraphFormatM2991x118.getDefaultPortionFormat().setFontHeight(18.0f);
        iParagraphFormatM2991x118.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", iParagraphFormatM2991x118.getDefaultPortionFormat()), iParagraphFormatM2991x118);
        BaseReq.toBundle("+mn-cs");
        iParagraphFormatM2991x118.setDefaultTabSize(72.0f);
        iParagraphFormatM2991x118.setRightToLeft((byte) 0);
        iParagraphFormatM2991x118.setEastAsianLineBreak((byte) 1);
        iParagraphFormatM2991x118.setLatinLineBreak((byte) 0);
        iParagraphFormatM2991x118.setHangingPunctuation((byte) 1);
        IParagraphFormat iParagraphFormatM2991x119 = ((TextStyle) masterSlide.getOtherStyle()).m2991x1(8);
        iParagraphFormatM2991x119.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
        iParagraphFormatM2991x119.getDefaultPortionFormat().getFillFormat().getSolidFillColor().setSchemeColor(1);
        iParagraphFormatM2991x119.getDefaultPortionFormat().setFontHeight(18.0f);
        iParagraphFormatM2991x119.getDefaultPortionFormat().setKerningMinimalSize(12.0f);
        C22230OoooO0O.OooO00o("+mn-ea", APApiImlV1.checkSumConsistent("+mn-lt", iParagraphFormatM2991x119.getDefaultPortionFormat()), iParagraphFormatM2991x119);
        BaseReq.toBundle("+mn-cs");
        iParagraphFormatM2991x119.setDefaultTabSize(72.0f);
        iParagraphFormatM2991x119.setRightToLeft((byte) 0);
        iParagraphFormatM2991x119.setEastAsianLineBreak((byte) 1);
        iParagraphFormatM2991x119.setLatinLineBreak((byte) 0);
        iParagraphFormatM2991x119.setHangingPunctuation((byte) 1);
        return masterSlide;
    }
}
