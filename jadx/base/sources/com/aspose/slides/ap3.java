package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes3.dex */
class ap3 {
    /* JADX INFO: renamed from: k4 */
    private static C12014ne m3697k4(C12014ne c12014ne, bdg bdgVar) {
        return new C12014ne(C7019kk.m27462to(Double.valueOf(bdgVar.m4158to()), 14), C7019kk.m27462to(Double.valueOf(bdgVar.m4155k4()), 14), C7019kk.m27462to(Double.valueOf(((double) c12014ne.m56663c5()) - (bdgVar.m4156kk() + bdgVar.m4158to())), 14), C7019kk.m27462to(Double.valueOf(((double) c12014ne.m56683x1()) - (bdgVar.m4155k4() + bdgVar.m4159x1())), 14));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3698k4(IEffectFormat iEffectFormat, com.aspose.slides.internal.p332p7.lzc lzcVar, wxb wxbVar) {
        if (iEffectFormat == null) {
            throw new ArgumentNullException("effectFormat");
        }
        if (lzcVar == null) {
            throw new ArgumentNullException("style");
        }
        com.aspose.slides.internal.p332p7.rsv rsvVar = (com.aspose.slides.internal.p332p7.rsv) wgi.m72712k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVar.m36550to());
        if (rsvVar != null) {
            gz8.m6949k4(iEffectFormat, rsvVar, wxbVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3699k4(IFillFormat iFillFormat, com.aspose.slides.internal.p332p7.lzc lzcVar, wxb wxbVar) {
        if (iFillFormat == null) {
            throw new ArgumentNullException("fillFormat");
        }
        if (lzcVar == null) {
            throw new ArgumentNullException("style");
        }
        com.aspose.slides.internal.p332p7.rsv rsvVar = (com.aspose.slides.internal.p332p7.rsv) wgi.m72712k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVar.m36550to());
        if (rsvVar != null) {
            gz8.m6951k4(iFillFormat, rsvVar, wxbVar);
        }
        com.aspose.slides.internal.p332p7.nk7 nk7Var = (com.aspose.slides.internal.p332p7.nk7) wgi.m72712k4(com.aspose.slides.internal.p332p7.nk7.class, "drawing-page-properties", lzcVar.m36550to());
        if (nk7Var != null) {
            gz8.m6950k4(iFillFormat, nk7Var, wxbVar);
            FillFormat fillFormat = (FillFormat) iFillFormat;
            if (C7019kk.m27469x1(fillFormat.getParent_Immediate(), Background.class) && C7019kk.m27469x1(fillFormat.getParent_Immediate().getParent_Immediate(), LayoutSlide.class)) {
                ((LayoutSlide) fillFormat.getParent_Immediate().getParent_Immediate()).setShowMasterShapes(nk7Var.m37664yj() != 0);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3700k4(ILineFormat iLineFormat, IFillFormat iFillFormat, com.aspose.slides.internal.p332p7.lzc lzcVar, wxb wxbVar) {
        if (iLineFormat == null) {
            throw new ArgumentNullException("lineFormat");
        }
        if (iFillFormat == null) {
            throw new ArgumentNullException("fillFormat");
        }
        if (lzcVar == null) {
            throw new ArgumentNullException("style");
        }
        com.aspose.slides.internal.p332p7.rsv rsvVar = (com.aspose.slides.internal.p332p7.rsv) wgi.m72712k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVar.m36550to());
        if (rsvVar != null) {
            gz8.m6952k4(iLineFormat, iFillFormat, rsvVar, wxbVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3701k4(ILineFormat iLineFormat, com.aspose.slides.internal.p332p7.lzc lzcVar, wxb wxbVar) {
        if (iLineFormat == null) {
            throw new ArgumentNullException("lineFormat");
        }
        if (lzcVar == null) {
            throw new ArgumentNullException("style");
        }
        com.aspose.slides.internal.p332p7.rsv rsvVar = (com.aspose.slides.internal.p332p7.rsv) wgi.m72712k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVar.m36550to());
        if (rsvVar != null) {
            gz8.m6953k4(iLineFormat, rsvVar, wxbVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3702k4(IParagraphFormat iParagraphFormat, com.aspose.slides.internal.p332p7.zob zobVar, wxb wxbVar) {
        IPortionFormat defaultPortionFormat;
        float fM72739up;
        IPortionFormat defaultPortionFormat2;
        FontData fontData;
        if (iParagraphFormat == null) {
            throw new ArgumentNullException("paragraphFormat");
        }
        if (zobVar == null) {
            throw new ArgumentNullException("textProperties");
        }
        if (wgi.m72731kk(zobVar.m45829x1())) {
            iParagraphFormat.getDefaultPortionFormat().getFillFormat().setFillType((byte) 1);
            ((ColorFormat) iParagraphFormat.getDefaultPortionFormat().getFillFormat().getSolidFillColor()).m1080k4(wgi.m72698ck(zobVar.m45829x1()).Clone());
        }
        if (wgi.m72731kk(zobVar.m45804h4())) {
            String strM67401k4 = C14113y2.m67401k4(zobVar.m45804h4(), "'", "");
            iParagraphFormat.getDefaultPortionFormat().setLatinFont(new FontData(strM67401k4));
            if (((Presentation) C7019kk.m27452k4((Object) wxbVar.m72957k4().m69951k4(), Presentation.class)).m2385ks().m7124k4(strM67401k4, (byte) 2, 0, 18.0f, 0, false).m68818to()) {
                defaultPortionFormat2 = iParagraphFormat.getDefaultPortionFormat();
                fontData = new FontData(strM67401k4);
            } else {
                defaultPortionFormat2 = iParagraphFormat.getDefaultPortionFormat();
                fontData = C13827mb.f46185k4;
            }
            defaultPortionFormat2.setSymbolFont(fontData);
        }
        if (wgi.m72731kk(zobVar.m45818m9())) {
            iParagraphFormat.getDefaultPortionFormat().setEastAsianFont(new FontData(C14113y2.m67401k4(zobVar.m45818m9(), "'", "")));
        }
        if (wgi.m72731kk(zobVar.m45799dy())) {
            iParagraphFormat.getDefaultPortionFormat().setComplexScriptFont(new FontData(C14113y2.m67401k4(zobVar.m45799dy(), "'", "")));
        }
        if (wgi.m72731kk(zobVar.m45822to())) {
            iParagraphFormat.getDefaultPortionFormat().setEscapement(wgi.m72743x6(zobVar.m45822to()));
        }
        if (wgi.m72731kk(zobVar.m45808jd())) {
            iParagraphFormat.getDefaultPortionFormat().setFontHeight((float) wgi.m72702fa(zobVar.m45808jd()));
        }
        if (wgi.m72731kk(zobVar.m45794ck())) {
            if (C14113y2.m67363du("normal", zobVar.m45794ck())) {
                defaultPortionFormat = iParagraphFormat.getDefaultPortionFormat();
                fM72739up = 0.0f;
            } else {
                defaultPortionFormat = iParagraphFormat.getDefaultPortionFormat();
                fM72739up = (float) wgi.m72739up(zobVar.m45794ck());
            }
            defaultPortionFormat.setSpacing(fM72739up);
        }
        iParagraphFormat.getDefaultPortionFormat().setFontBold(q9u.f48269k4.get_Item(Integer.valueOf(zobVar.m45821rv())).byteValue());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3703k4(ParagraphFormat paragraphFormat, TextFrameFormat textFrameFormat, com.aspose.slides.internal.p332p7.lzc lzcVar, wxb wxbVar) {
        com.aspose.slides.internal.p332p7.mdp mdpVar = (com.aspose.slides.internal.p332p7.mdp) wgi.m72712k4(com.aspose.slides.internal.p332p7.mdp.class, "paragraph-properties", lzcVar.m36550to());
        if (mdpVar != null) {
            if (paragraphFormat != null) {
                k6v.m63659k4(paragraphFormat, mdpVar, wxbVar);
            }
            if (textFrameFormat != null) {
                k6v.m63656k4(textFrameFormat, mdpVar, wxbVar);
            }
        }
        com.aspose.slides.internal.p332p7.rsv rsvVar = (com.aspose.slides.internal.p332p7.rsv) wgi.m72712k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVar.m36550to());
        if (rsvVar != null && textFrameFormat != null) {
            k6v.m63657k4(textFrameFormat, rsvVar, wxbVar);
        }
        com.aspose.slides.internal.p332p7.zob zobVar = (com.aspose.slides.internal.p332p7.zob) wgi.m72712k4(com.aspose.slides.internal.p332p7.zob.class, "text-properties", lzcVar.m36550to());
        if (zobVar != null) {
            if (textFrameFormat != null) {
                m3702k4((ParagraphFormat) textFrameFormat.m2959m9().getDefaultParagraphFormat(), zobVar, wxbVar);
            }
            if (paragraphFormat != null) {
                m3702k4(paragraphFormat, zobVar, wxbVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01d1  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3704k4(PictureFrame pictureFrame, com.aspose.slides.internal.p332p7.cuq cuqVar, com.aspose.slides.internal.p332p7.lzc lzcVar, wxb wxbVar) {
        byte b;
        if (pictureFrame == null) {
            throw new ArgumentNullException("pictureFrame");
        }
        if (lzcVar == null) {
            throw new ArgumentNullException("style");
        }
        com.aspose.slides.internal.p332p7.rsv rsvVar = (com.aspose.slides.internal.p332p7.rsv) wgi.m72712k4(com.aspose.slides.internal.p332p7.rsv.class, "graphic-properties", lzcVar.m36550to());
        if (rsvVar != null) {
            byte b2 = 0;
            if (wgi.m72731kk(rsvVar.m40524yd())) {
                bdg bdgVar = new bdg(rsvVar.m40524yd());
                if (!bdgVar.m4151c5()) {
                    PictureFillFormat pictureFillFormat = (PictureFillFormat) pictureFrame.getPictureFormat();
                    if (pictureFillFormat.getPicture().getImage() == null && !C14113y2.m67411k4(pictureFillFormat.getPicture().getLinkPathLong())) {
                        pictureFillFormat.getPicture().setImage(((ImageCollection) pictureFillFormat.getPicture().getPresentation().getImages()).m1726k4(pictureFrame.getPictureFormat().getPicture().getLinkPathLong(), (Dictionary<String, IPPImage>) null));
                    }
                    PPImage pPImage = (PPImage) C7019kk.m27452k4((Object) pictureFillFormat.getPicture().getImage(), PPImage.class);
                    if (pPImage != null) {
                        C12014ne c12014ne = new C12014ne(0, 0, pPImage.getWidth(), pPImage.getHeight());
                        C12014ne c12014neClone = m3697k4(c12014ne.Clone(), bdgVar).Clone();
                        C12015qq c12015qq = new C12015qq(pPImage.getWidth() / pPImage.m2123c5().m56897x1(), pPImage.getHeight() / pPImage.m2123c5().m56895kk());
                        if (c12014ne.m56683x1() >= c12014neClone.m56683x1() && c12014ne.m56663c5() >= c12014neClone.m56663c5() && c12014neClone.m56683x1() > 0 && c12014neClone.m56663c5() > 0) {
                            pj5 pj5VarClone = pj5.m69111k4(new pj5((float) bdgVar.m4158to(), (float) bdgVar.m4155k4(), (float) bdgVar.m4156kk(), (float) bdgVar.m4159x1()), 100.0f).Clone();
                            pj5VarClone.f48081x1 /= c12015qq.m56699x1() * (bdgVar.m4154h4() ? 1.0f : 2.54f);
                            pj5VarClone.f48079kk /= c12015qq.m56697kk() * (bdgVar.m4152du() ? 1.0f : 2.54f);
                            pj5VarClone.f48080to /= c12015qq.m56699x1() * (bdgVar.m4157m9() ? 1.0f : 2.54f);
                            pj5VarClone.f48078du /= c12015qq.m56697kk() * (bdgVar.m4153dy() ? 1.0f : 2.54f);
                            pictureFillFormat.m2253k4(pj5VarClone.Clone());
                        }
                    }
                }
            }
            if (wgi.m72731kk(rsvVar.m40526yj())) {
                pictureFrame.f3032h4.getPicture().getImageTransform().addAlphaModulateFixedEffect(wgi.m72737to(rsvVar.m40526yj()));
            }
            if (wgi.m72731kk(rsvVar.m40487lr())) {
                if (C14113y2.m67363du("none", rsvVar.m40487lr())) {
                    b = 0;
                } else {
                    ISlide iSlide = (ISlide) C7019kk.m27452k4((Object) pictureFrame.getSlide(), ISlide.class);
                    byte b3 = iSlide != null ? iSlide.getSlideNumber() % 2 == 0 ? (byte) 1 : (byte) 0 : (byte) -1;
                    byte b4 = -1;
                    byte b5 = -1;
                    for (String str : C14113y2.m67369h4(rsvVar.m40487lr(), ControlChar.SPACE_CHAR, ',')) {
                        if (C14113y2.m67363du("horizontal", str)) {
                            if (b5 == -1) {
                                b4 = 1;
                                b5 = 0;
                            } else {
                                b4 = 1;
                            }
                        } else if (C14113y2.m67363du("vertical", str)) {
                            b5 = 1;
                            if (b4 == -1) {
                                b4 = 0;
                            }
                        } else if ((!C14113y2.m67363du("horizontal-on-odd", str) || b3 != 0) && (!C14113y2.m67363du("horizontal-on-even", str) || b3 != 1)) {
                        }
                    }
                    b = b4;
                    b2 = b5;
                }
                IShapeFrame frame = pictureFrame.getFrame();
                if ((b == -1 || frame.getFlipH() == b) && (b2 == -1 || frame.getFlipV() == b2)) {
                    return;
                }
                pictureFrame.setFrame(new ShapeFrame(frame.getX(), frame.getY(), frame.getWidth(), frame.getHeight(), b, b2, frame.getRotation()));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3705k4(PortionFormat portionFormat, com.aspose.slides.internal.p332p7.lzc lzcVar, wxb wxbVar) {
        zfd.m74510k4(portionFormat, lzcVar, wxbVar);
    }
}
