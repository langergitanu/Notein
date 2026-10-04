package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
class c0l {
    /* JADX INFO: renamed from: k4 */
    public static IFontData m4411k4(Portion portion, PortionFormat portionFormat, IPortionFormatEffectiveData iPortionFormatEffectiveData, TextFrame textFrame) {
        IParagraphFormat defaultParagraphFormat;
        IFontData latinFont;
        IPortionFormat defaultPortionFormat;
        if (portion.getPortionFormat().getLatinFont() != null) {
            defaultPortionFormat = portion.getPortionFormat();
        } else {
            Paragraph paragraphM2282fa = portion.m2282fa();
            if (paragraphM2282fa == null || paragraphM2282fa.getParagraphFormat().getDefaultPortionFormat().getLatinFont() == null) {
                defaultParagraphFormat = ((TextFrameFormat) textFrame.getTextFrameFormat()).m2959m9().getDefaultParagraphFormat();
                if (defaultParagraphFormat.getDefaultPortionFormat().getLatinFont() == null) {
                    latinFont = (portionFormat == null || portionFormat.getLatinFont() == null) ? null : portionFormat.getLatinFont();
                    return (latinFont != null || (iPortionFormatEffectiveData != null && AbstractC14092to.m67201k4(ay6.f3981c5, latinFont.getFontName()) >= 0)) ? (iPortionFormatEffectiveData != null || iPortionFormatEffectiveData.getLatinFont() == null) ? C13827mb.f46185k4 : iPortionFormatEffectiveData.getLatinFont() : latinFont;
                }
            } else {
                defaultParagraphFormat = portion.m2282fa().getParagraphFormat();
            }
            defaultPortionFormat = defaultParagraphFormat.getDefaultPortionFormat();
        }
        latinFont = defaultPortionFormat.getLatinFont();
        if (latinFont != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01db  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.aspose.slides.internal.p332p7.zob m4412k4(Portion portion, TextFrame textFrame, boolean z, com.aspose.slides.internal.p332p7.ok7 ok7Var, pkv pkvVar) {
        byte b;
        IFillFormatEffectiveData iFillFormatEffectiveData;
        if (portion == null) {
            throw new ArgumentNullException("portion");
        }
        if (ok7Var == null) {
            throw new ArgumentNullException("pElementData");
        }
        com.aspose.slides.internal.p332p7.lzc lzcVarM69128k4 = pkvVar.m69128k4("T", 1);
        m4414k4(portion, z, ok7Var, lzcVarM69128k4);
        com.aspose.slides.internal.p332p7.zob zobVar = (com.aspose.slides.internal.p332p7.zob) lzcVarM69128k4.m36545k4("text-properties").m29542x1();
        lrb lrbVarM2305bv = portion.m2295x1().m2305bv();
        zobVar.m45793c5(wgi.m72734m9(lrbVarM2305bv.getFontHeight()));
        if (lrbVarM2305bv.getTextCapType() == 2) {
            zobVar.m45831x1(3);
        }
        C12003du c12003duClone = m4413k4(portion, lrbVarM2305bv, (BaseSlide) textFrame.getSlide()).Clone();
        if (lrbVarM2305bv.getFillFormat().getFillType() == 0) {
            if (lrbVarM2305bv.getLineFormat().getFillFormat().getFillType() == 1) {
                c12003duClone = ((erk) lrbVarM2305bv.getLineFormat().getFillFormat()).m5654x1();
            }
            if (C12003du.m56476x1(lrbVarM2305bv.m4830h4(), C12003du.f40505to)) {
                zobVar.m45828uz(wgi.m72720k4(lrbVarM2305bv.m4830h4().Clone()));
            }
            if (lrbVarM2305bv.getEffectFormat().getOuterShadowEffect() != null) {
                zobVar.m45827up("1pt 1pt");
                if (C12003du.m56476x1(((vmd) lrbVarM2305bv.getEffectFormat().getOuterShadowEffect()).m72367x1(), C12003du.f40505to)) {
                    zobVar.m45827up(C14113y2.m67408k4(zobVar.m45826up(), C14113y2.m67408k4(" 0pc ", wgi.m72720k4(((vmd) lrbVarM2305bv.getEffectFormat().getOuterShadowEffect()).m72367x1().Clone()))));
                }
            }
            zobVar.m45806h4(C14113y2.m67408k4("'", m4411k4(portion, (PortionFormat) null, lrbVarM2305bv, textFrame).getFontName(), "'"));
            if (lrbVarM2305bv.getEastAsianFont() != null) {
                zobVar.m45820m9(C14113y2.m67408k4("'", lrbVarM2305bv.getEastAsianFont().getFontName(portion.m2279ck().getSlide().createThemeEffective()), "'"));
            }
            if (lrbVarM2305bv.getComplexScriptFont() != null) {
                zobVar.m45801dy(C14113y2.m67408k4("'", lrbVarM2305bv.getComplexScriptFont().getFontName(), "'"));
            }
            if (lrbVarM2305bv.getFontBold()) {
                zobVar.m45792c5(2);
            }
            if (lrbVarM2305bv.getFontItalic()) {
                zobVar.m45797du(2);
            }
            if (!C14064he.m66715kk(lrbVarM2305bv.getSpacing())) {
                zobVar.m45809jd(lrbVarM2305bv.getSpacing() == 0.0f ? "normal" : wgi.m72717k4(lrbVarM2305bv.getSpacing()));
            }
            byte[] bArr = {0};
            IFillFormatEffectiveData[] iFillFormatEffectiveDataArr = {null};
            ay6.m3820k4(lrbVarM2305bv, bArr, new ILineFormatEffectiveData[]{null}, iFillFormatEffectiveDataArr);
            b = bArr[0];
            iFillFormatEffectiveData = iFillFormatEffectiveDataArr[0];
            if (b != 0 && b != -1) {
                zobVar.m45819m9(2);
                zobVar.m45807ix("auto");
                if (iFillFormatEffectiveData != null && iFillFormatEffectiveData.getFillType() == 1) {
                    zobVar.m45825u4(wgi.m72720k4(((C14176nc) iFillFormatEffectiveData).m67938m9().Clone()));
                }
            }
            if (lrbVarM2305bv.getStrikethroughType() != 0 && lrbVarM2305bv.getStrikethroughType() != -1) {
                zobVar.m45823to(2);
                zobVar.m45832x1("auto");
            }
            if (!C14064he.m66715kk(lrbVarM2305bv.getEscapement())) {
                zobVar.m45798du(lrbVarM2305bv.getEscapement() == 0.0f ? "0% 100%" : C14113y2.m67402k4("{0}% 66.6667%", Float.valueOf(lrbVarM2305bv.getEscapement())));
            }
            if (lrbVarM2305bv.getKerningMinimalSize() > 0.0f && lrbVarM2305bv.getFontHeight() >= lrbVarM2305bv.getKerningMinimalSize()) {
                zobVar.m45830x1((byte) 1);
            }
            zobVar.m45811k4((byte) 0);
            zobVar.m45805h4(1);
            return zobVar;
        }
        if (C12003du.m56403k4(c12003duClone, C12003du.f40505to)) {
            c12003duClone = ((C14176nc) lrbVarM2305bv.getFillFormat()).m67938m9();
        }
        zobVar.m45813k4(wgi.m72720k4(c12003duClone.Clone()));
        if (C12003du.m56476x1(lrbVarM2305bv.m4830h4(), C12003du.f40505to)) {
        }
        if (lrbVarM2305bv.getEffectFormat().getOuterShadowEffect() != null) {
        }
        zobVar.m45806h4(C14113y2.m67408k4("'", m4411k4(portion, (PortionFormat) null, lrbVarM2305bv, textFrame).getFontName(), "'"));
        if (lrbVarM2305bv.getEastAsianFont() != null) {
        }
        if (lrbVarM2305bv.getComplexScriptFont() != null) {
        }
        if (lrbVarM2305bv.getFontBold()) {
        }
        if (lrbVarM2305bv.getFontItalic()) {
        }
        if (!C14064he.m66715kk(lrbVarM2305bv.getSpacing())) {
        }
        byte[] bArr2 = {0};
        IFillFormatEffectiveData[] iFillFormatEffectiveDataArr2 = {null};
        ay6.m3820k4(lrbVarM2305bv, bArr2, new ILineFormatEffectiveData[]{null}, iFillFormatEffectiveDataArr2);
        b = bArr2[0];
        iFillFormatEffectiveData = iFillFormatEffectiveDataArr2[0];
        if (b != 0) {
            zobVar.m45819m9(2);
            zobVar.m45807ix("auto");
            if (iFillFormatEffectiveData != null) {
                zobVar.m45825u4(wgi.m72720k4(((C14176nc) iFillFormatEffectiveData).m67938m9().Clone()));
            }
        }
        if (lrbVarM2305bv.getStrikethroughType() != 0) {
            zobVar.m45823to(2);
            zobVar.m45832x1("auto");
        }
        if (!C14064he.m66715kk(lrbVarM2305bv.getEscapement())) {
        }
        if (lrbVarM2305bv.getKerningMinimalSize() > 0.0f) {
            zobVar.m45830x1((byte) 1);
        }
        zobVar.m45811k4((byte) 0);
        zobVar.m45805h4(1);
        return zobVar;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12003du m4413k4(Portion portion, lrb lrbVar, BaseSlide baseSlide) {
        if ((lrbVar.getHyperlinkClick() == null || lrbVar.getHyperlinkClick().getColorSource() != 0) && (lrbVar.getHyperlinkMouseOver() == null || lrbVar.getHyperlinkMouseOver().getColorSource() != 0)) {
            return portion.getPortionFormat().getFillFormat().getFillType() != -1 ? ((ColorFormat) portion.getPortionFormat().getFillFormat().getSolidFillColor()).m1084to() : (portion.m2282fa() == null || portion.m2282fa().getParagraphFormat().getDefaultPortionFormat().getFillFormat().getFillType() == -1) ? C12003du.f40505to.Clone() : ((ColorFormat) portion.m2282fa().getParagraphFormat().getDefaultPortionFormat().getFillFormat().getSolidFillColor()).m1084to();
        }
        C12003du c12003duClone = C12003du.m56397k4(0, 153, 153).Clone();
        if (baseSlide != null) {
            baseSlide.m390k4(10).m1084to().CloneTo(c12003duClone);
        }
        return c12003duClone;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4414k4(Portion portion, boolean z, com.aspose.slides.internal.p332p7.ok7 ok7Var, com.aspose.slides.internal.p332p7.lzc lzcVar) {
        String strM2283h4 = portion.m2283h4();
        if ("\u000b".equals(strM2283h4)) {
            ok7Var.m38325k4(gq5.f5330kk);
            return;
        }
        int i = 0;
        if (C14113y2.m67359c5(strM2283h4, "\u000b")) {
            String[] strArrM67414k4 = C14113y2.m67414k4(strM2283h4, ControlChar.LINE_BREAK_CHAR);
            while (i < strArrM67414k4.length) {
                m4415k4(strArrM67414k4[i], portion.m2295x1(), ok7Var, lzcVar);
                if (i < strArrM67414k4.length - 1) {
                    com.aspose.slides.internal.p332p7.omk omkVar = (com.aspose.slides.internal.p332p7.omk) ok7Var.m38325k4(C14113y2.m67408k4("text:", "span")).m29542x1();
                    omkVar.m38372x1(lzcVar.m36546k4());
                    omkVar.m38369k4(gq5.f5330kk);
                }
                i++;
            }
            return;
        }
        if (C14113y2.m67359c5(strM2283h4, "\t")) {
            String[] strArrM67414k42 = C14113y2.m67414k4(strM2283h4, '\t');
            while (i < strArrM67414k42.length) {
                String str = strArrM67414k42[i];
                if (str.length() > 0) {
                    m4415k4(str, portion.m2295x1(), ok7Var, lzcVar);
                }
                if (i < strArrM67414k42.length - 1) {
                    com.aspose.slides.internal.p332p7.omk omkVar2 = (com.aspose.slides.internal.p332p7.omk) ok7Var.m38325k4(C14113y2.m67408k4("text:", "span")).m29542x1();
                    omkVar2.m38372x1(lzcVar.m36546k4());
                    omkVar2.m38369k4(gq5.f5332x1);
                }
                i++;
            }
            return;
        }
        if (!C14113y2.m67359c5(strM2283h4, IOUtils.LINE_SEPARATOR_UNIX) || C14113y2.m67424kk(strM2283h4, IOUtils.LINE_SEPARATOR_UNIX)) {
            if (z) {
                strM2283h4 = "\u200b";
            }
            m4415k4(strM2283h4, portion.m2295x1(), ok7Var, lzcVar);
        } else {
            String[] strArrM67414k43 = C14113y2.m67414k4(strM2283h4, '\n');
            while (i < strArrM67414k43.length) {
                m4415k4(strArrM67414k43[i], portion.m2295x1(), ok7Var, lzcVar);
                if (i < strArrM67414k43.length - 1) {
                    ok7Var.m38325k4(gq5.f5330kk);
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4415k4(String str, PortionFormat portionFormat, com.aspose.slides.internal.p332p7.ok7 ok7Var, com.aspose.slides.internal.p332p7.lzc lzcVar) {
        C7394ca c7394caM33588k4;
        com.aspose.slides.internal.p332p7.omk omkVar = (com.aspose.slides.internal.p332p7.omk) ok7Var.m38325k4(C14113y2.m67408k4("text:", "span")).m29542x1();
        omkVar.m38372x1(lzcVar.m36546k4());
        Hyperlink hyperlink = (Hyperlink) portionFormat.getHyperlinkClick();
        if (hyperlink == null) {
            c7394caM33588k4 = omkVar.m38369k4("_TEXT");
        } else {
            com.aspose.slides.internal.p332p7.hqi hqiVar = (com.aspose.slides.internal.p332p7.hqi) omkVar.m38369k4(C14113y2.m67408k4("text:", "a")).m29542x1();
            hqiVar.m33590k4(1);
            hqiVar.m33592x1(hyperlink.getTargetSlide() != null ? !C14113y2.m67411k4(hyperlink.m1698m9()) ? hyperlink.m1698m9() : C14113y2.m67408k4("#Slide ", C14057f9.m66591x1(hyperlink.getTargetSlide().getSlideNumber())) : hyperlink.getExternalUrlOriginal());
            c7394caM33588k4 = hqiVar.m33588k4("_TEXT");
        }
        c7394caM33588k4.m29540k4(wgi.m72736rv(str));
    }
}
