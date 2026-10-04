package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class htp {
    /* JADX INFO: renamed from: k4 */
    public static String m7294k4(byte b) {
        return b != 0 ? b != 2 ? "vertical-align: center;" : "vertical-align: bottom;" : "vertical-align: top;";
    }

    /* JADX INFO: renamed from: kk */
    public static <T> float m7305kk(IParagraphFormatEffectiveData iParagraphFormatEffectiveData, TemplateContext<T> templateContext) {
        return ((iParagraphFormatEffectiveData.getBullet().getHeight() * (((Paragraph) C7019kk.m27452k4((Object) templateContext.getObject(), Paragraph.class)).getPortions().getCount() == 0 ? 0.0f : ((Paragraph) C7019kk.m27452k4((Object) templateContext.getObject(), Paragraph.class)).getPortions().get_Item(0).getPortionFormat().getEffective().getFontHeight())) / 100.0f) * 0.75f;
    }

    /* JADX INFO: renamed from: x1 */
    public static <T> String m7306x1(IParagraphFormatEffectiveData iParagraphFormatEffectiveData, TemplateContext<T> templateContext) {
        return C14113y2.m67402k4("width: {0}px; height: {0}px;", Float.valueOf(m7305kk(iParagraphFormatEffectiveData, templateContext)));
    }

    /* JADX INFO: renamed from: k4 */
    public static String m7295k4(int i) {
        return i != 1 ? i != 2 ? (i == 3 || i == 4 || i == 5) ? "text-align: center;" : "text-align: left;" : "text-align: right;" : "text-align: center;";
    }

    /* JADX INFO: renamed from: k4 */
    public static String m7296k4(IParagraphFormatEffectiveData iParagraphFormatEffectiveData, float f) {
        if (iParagraphFormatEffectiveData.getSpaceWithin() < 0.0f) {
            return C14113y2.m67402k4("line-height: {0}px;", Integer.valueOf(-C7019kk.m27462to(Float.valueOf(iParagraphFormatEffectiveData.getSpaceWithin()), 13)));
        }
        return C14113y2.m67402k4("line-height: {0}px;", Integer.valueOf(C7019kk.m27462to(Float.valueOf((iParagraphFormatEffectiveData.getSpaceWithin() * (f * 1.1428572f)) / 100.0f), 13)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> String m7297k4(IParagraphFormatEffectiveData iParagraphFormatEffectiveData, ITextFrameFormatEffectiveData iTextFrameFormatEffectiveData, boolean z, TemplateContext<T> templateContext) throws Throwable {
        String strM67401k4;
        String strM67402k4;
        IPortionFormatEffectiveData effective = ((Paragraph) C7019kk.m27452k4((Object) templateContext.getObject(), Paragraph.class)).getPortions().getCount() == 0 ? null : ((Paragraph) C7019kk.m27452k4((Object) templateContext.getObject(), Paragraph.class)).getPortions().get_Item(0).getPortionFormat().getEffective();
        String strM7299k4 = m7299k4(effective);
        byte type = iParagraphFormatEffectiveData.getBullet().getType();
        if (type == 1 || type == 2) {
            if (iParagraphFormatEffectiveData.getBullet().isBulletHardColor()) {
                strM67401k4 = C14113y2.m67402k4("color: {0};", C1126fz.m6356k4(((C14176nc) iParagraphFormatEffectiveData.getBullet().getFillFormat()).m67938m9().Clone()));
            } else if (effective != null) {
                String strM70498k4 = C14442sb.m70498k4(effective.getFillFormat(), templateContext);
                strM67401k4 = C14113y2.m67448x1(strM70498k4, "background-color: ") ? C14113y2.m67401k4(strM70498k4, "background-color: ", "color: ") : C14113y2.m67400k4(strM70498k4, " -webkit-text-fill-color: transparent; -webkit-background-clip: text;");
            } else {
                strM67401k4 = "";
            }
        }
        IFontData latinFont = effective != null ? effective.getLatinFont() : null;
        if (iParagraphFormatEffectiveData.getBullet().isBulletHardFont() && iParagraphFormatEffectiveData.getBullet().getType() != 2) {
            latinFont = iParagraphFormatEffectiveData.getBullet().getFont();
        }
        float f = ((iTextFrameFormatEffectiveData.getTextVerticalType() == 1 || iTextFrameFormatEffectiveData.getTextVerticalType() == 2) ? -1 : 1) * (z ? 0.5f : 1.0f);
        if (effective == null || effective.getEffectFormat().getOuterShadowEffect() == null) {
            strM67402k4 = "";
        } else {
            double d = f;
            strM67402k4 = C14113y2.m67402k4("text-shadow: {0}px {1}px {2}px {3};", dh2.m5101k4(C14116yg.m67470dy(((double) effective.getEffectFormat().getOuterShadowEffect().getDirection()) * 0.017453292519943295d) * effective.getEffectFormat().getOuterShadowEffect().getDistance() * d), dh2.m5101k4(C14116yg.m67495m9(((double) effective.getEffectFormat().getOuterShadowEffect().getDirection()) * 0.017453292519943295d) * effective.getEffectFormat().getOuterShadowEffect().getDistance() * d), dh2.m5101k4(effective.getEffectFormat().getOuterShadowEffect().getBlurRadius()), C1126fz.m6356k4(((vmd) effective.getEffectFormat().getOuterShadowEffect()).m72367x1().Clone()));
        }
        return C14113y2.m67403k4(" ", new String[]{strM7299k4, strM67401k4, strM67402k4, effective != null ? C14113y2.m67402k4("font-size: {0}px;", dh2.m5103k4((effective.getFontHeight() * iParagraphFormatEffectiveData.getBullet().getHeight()) / 100.0f)) : "", C14113y2.m67402k4("font-family: '{0}';", latinFont)});
    }

    /* JADX INFO: renamed from: k4 */
    public static String m7298k4(IParagraphFormatEffectiveData iParagraphFormatEffectiveData, TemplateContext<Paragraph> templateContext) {
        String strM7295k4 = m7295k4(iParagraphFormatEffectiveData.getAlignment());
        IPortionCollection portions = templateContext.getObject().getPortions();
        IGenericEnumerator<IPortion> it = portions.iterator();
        float f = Float.MAX_VALUE;
        while (it.hasNext()) {
            try {
                float fontHeight = ((Portion) it.next()).getPortionFormat().getEffective().getFontHeight();
                if (fontHeight < f) {
                    f = fontHeight;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return C14113y2.m67403k4(" ", new String[]{strM7295k4, (portions.getCount() >= 2 || iParagraphFormatEffectiveData.getBullet().getType() != 0) ? f < Float.MAX_VALUE ? m7296k4(iParagraphFormatEffectiveData, f) : "" : ""});
    }

    /* JADX INFO: renamed from: k4 */
    private static String m7299k4(IPortionFormatEffectiveData iPortionFormatEffectiveData) {
        String str = "";
        String str2 = (iPortionFormatEffectiveData == null || !iPortionFormatEffectiveData.getFontBold()) ? "" : "font-weight: bold;";
        if (iPortionFormatEffectiveData != null && iPortionFormatEffectiveData.getFontItalic()) {
            str = "font-style: italic;";
        }
        return C14113y2.m67403k4(" ", new String[]{str2, str});
    }

    /* JADX INFO: renamed from: k4 */
    public static <T> String m7300k4(IPortionFormatEffectiveData iPortionFormatEffectiveData, ITextFrameFormatEffectiveData iTextFrameFormatEffectiveData, boolean z, TemplateContext<T> templateContext) throws Throwable {
        boolean z2;
        String str;
        String strM67402k4;
        String strM67402k42;
        String strM67402k43;
        float fontHeight = iPortionFormatEffectiveData.getFontHeight();
        String strM70498k4 = C14442sb.m70498k4(iPortionFormatEffectiveData.getFillFormat(), templateContext);
        TemplateContext templateContext2 = (TemplateContext) C7019kk.m27452k4((Object) templateContext, TemplateContext.class);
        if (templateContext2 == null || ((Portion) templateContext2.getObject()).getPortionFormat().getHyperlinkClick() == null) {
            z2 = false;
        } else {
            String strM6356k4 = C1126fz.m6356k4(((ColorFormat) ((TextFrame) templateContext.getLocal().get("parentTextFrame")).getPresentation().getMasterTheme().getColorScheme().getHyperlink()).m1084to().Clone());
            if (((Portion) templateContext2.getObject()).getPortionFormat().getHyperlinkClick().getColorSource() == 0) {
                strM70498k4 = C14113y2.m67402k4("background-color: {0}; ", strM6356k4);
            }
            strM70498k4 = C14113y2.m67400k4(strM70498k4, C14113y2.m67402k4("text-decoration: underline solid {0}; ", strM6356k4));
            z2 = true;
        }
        String strM67401k4 = C14113y2.m67448x1(strM70498k4, "background-color: ") ? C14113y2.m67401k4(strM70498k4, "background-color: ", "color: ") : C14113y2.m67400k4(strM70498k4, " -webkit-text-fill-color: transparent; -webkit-background-clip: text;");
        if (iPortionFormatEffectiveData.getEscapement() != 0.0f) {
            String strM67402k44 = C14113y2.m67402k4("position: relative; top: {0}px;", dh2.m5103k4((iPortionFormatEffectiveData.getEscapement() * (-fontHeight)) / 100.0f));
            fontHeight *= 0.67f;
            str = strM67402k44;
        } else {
            str = "";
        }
        String str2 = "double";
        if (iPortionFormatEffectiveData.getStrikethroughType() != 0) {
            strM67402k4 = C14113y2.m67402k4("text-decoration: line-through {0};", iPortionFormatEffectiveData.getStrikethroughType() != 2 ? "solid" : "double");
        } else {
            strM67402k4 = "";
        }
        if (iPortionFormatEffectiveData.getFontUnderline() != 0 && !z2) {
            switch (iPortionFormatEffectiveData.getFontUnderline()) {
                case 3:
                    break;
                case 4:
                default:
                    str2 = "solid";
                    break;
                case 5:
                case 6:
                    str2 = "dotted";
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    str2 = "dashed";
                    break;
                case 15:
                case 16:
                case 17:
                    str2 = "wavy";
                    break;
            }
            strM67402k4 = C14113y2.m67402k4("text-decoration: underline {0} {1};", str2, C1126fz.m6356k4(((C14176nc) iPortionFormatEffectiveData.getUnderlineFillFormat()).m67938m9().Clone()));
        }
        String str3 = strM67402k4;
        float f = ((iTextFrameFormatEffectiveData.getTextVerticalType() == 1 || iTextFrameFormatEffectiveData.getTextVerticalType() == 2) ? -1 : 1) * (z ? 0.5f : 1.0f);
        if (iPortionFormatEffectiveData.getEffectFormat().getOuterShadowEffect() != null) {
            double d = f;
            strM67402k42 = C14113y2.m67402k4("text-shadow: {0}px {1}px {2}px {3};", dh2.m5101k4(C14116yg.m67470dy(((double) iPortionFormatEffectiveData.getEffectFormat().getOuterShadowEffect().getDirection()) * 0.017453292519943295d) * iPortionFormatEffectiveData.getEffectFormat().getOuterShadowEffect().getDistance() * d), dh2.m5101k4(C14116yg.m67495m9(((double) iPortionFormatEffectiveData.getEffectFormat().getOuterShadowEffect().getDirection()) * 0.017453292519943295d) * iPortionFormatEffectiveData.getEffectFormat().getOuterShadowEffect().getDistance() * d), dh2.m5101k4(iPortionFormatEffectiveData.getEffectFormat().getOuterShadowEffect().getBlurRadius()), C1126fz.m6356k4(((vmd) iPortionFormatEffectiveData.getEffectFormat().getOuterShadowEffect()).m72367x1().Clone()));
        } else {
            strM67402k42 = "";
        }
        if (iPortionFormatEffectiveData.getLineFormat().getFillFormat().getFillType() == 1) {
            strM67402k43 = C14113y2.m67402k4("-webkit-text-stroke: {0}px {1};", Double.valueOf(iPortionFormatEffectiveData.getLineFormat().getWidth()), C1126fz.m6356k4(((erk) iPortionFormatEffectiveData.getLineFormat().getFillFormat()).m5654x1().Clone()));
        } else {
            iPortionFormatEffectiveData.getLineFormat().getFillFormat().getFillType();
            strM67402k43 = "";
        }
        return C14113y2.m67403k4(" ", new String[]{m7299k4(iPortionFormatEffectiveData), C14113y2.m67402k4("font-family: '{0}';", C13834mf.m64869k4(iPortionFormatEffectiveData, templateContext)), C14113y2.m67402k4("font-size: {0}px;", dh2.m5103k4(fontHeight)), strM67401k4, str, str3, strM67402k42, strM67402k43, iPortionFormatEffectiveData.getSpacing() != 0.0f ? C14113y2.m67402k4("letter-spacing: {0}px;", dh2.m5103k4(iPortionFormatEffectiveData.getSpacing())) : "", iPortionFormatEffectiveData.getTextCapType() == 2 ? "text-transform: uppercase;" : iPortionFormatEffectiveData.getTextCapType() == 1 ? "font-variant: small-caps;" : "", "white-space: pre-wrap;", templateContext.getLocal().containsKey("paragraph") ? m7296k4(((Paragraph) templateContext.getLocal().get("paragraph")).getParagraphFormat().getEffective(), fontHeight) : ""});
    }

    /* JADX INFO: renamed from: k4 */
    public static String m7301k4(ITextFrameFormatEffectiveData iTextFrameFormatEffectiveData) {
        if (iTextFrameFormatEffectiveData.getColumnCount() <= 1) {
            return "";
        }
        float columnSpacing = iTextFrameFormatEffectiveData.getColumnSpacing();
        Integer numValueOf = Integer.valueOf(iTextFrameFormatEffectiveData.getColumnCount());
        if (C14044b3.m66437kk(columnSpacing)) {
            columnSpacing = 0.0f;
        }
        return C14113y2.m67402k4("column-count: {0}; column-gap: {1}px;", numValueOf, Float.valueOf(columnSpacing));
    }

    /* JADX INFO: renamed from: k4 */
    public static String m7302k4(TextFrame textFrame, AutoShape autoShape) {
        String strM67400k4;
        double width;
        ITextFrameFormatEffectiveData effective = textFrame.getTextFrameFormat().getEffective();
        IGenericEnumerator<IParagraph> it = textFrame.getParagraphs().iterator();
        float fM56575x1 = 0.0f;
        float fM56550c5 = -3.4028235E38f;
        while (it.hasNext()) {
            try {
                C12007ix c12007ixClone = ((Paragraph) it.next()).m2170x1().Clone();
                fM56575x1 += c12007ixClone.m56575x1();
                if (c12007ixClone.m56550c5() > fM56550c5) {
                    fM56550c5 = c12007ixClone.m56550c5();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        double height = 0.0d;
        if (effective.getTextVerticalType() == 1 || effective.getTextVerticalType() == 3 || effective.getTextVerticalType() == 2) {
            strM67400k4 = effective.getTextVerticalType() == 3 ? "width: 1px; word-wrap: break-word; white-space: pre-wrap;" : "writing-mode: vertical-rl;";
            width = ((effective.getAnchoringType() == 0 && (effective.getTextVerticalType() == 1 || effective.getTextVerticalType() == 3)) || (effective.getAnchoringType() == 2 && effective.getTextVerticalType() == 2)) ? (((double) (autoShape.getWidth() - fM56575x1)) - effective.getMarginLeft()) - effective.getMarginRight() : 0.0d;
            if (effective.getAnchoringType() == 1) {
                width = (effective.getTextVerticalType() == 0 || textFrame.getParagraphs().getCount() == 1) ? ((((double) (autoShape.getWidth() - fM56575x1)) - effective.getMarginLeft()) - effective.getMarginRight()) / 2.0d : (((double) (autoShape.getWidth() - fM56575x1)) - effective.getMarginLeft()) - effective.getMarginRight();
            }
            if (effective.getTextVerticalType() == 2) {
                strM67400k4 = C14113y2.m67400k4(strM67400k4, "transform: rotate(180deg);");
            }
        } else {
            byte anchoringType = effective.getAnchoringType();
            strM67400k4 = "";
            width = 0.0d;
            height = anchoringType != 1 ? anchoringType != 2 ? 0.0d : (((double) (autoShape.getHeight() - fM56575x1)) - effective.getMarginTop()) - effective.getMarginBottom() : ((((double) (autoShape.getHeight() - fM56575x1)) - effective.getMarginTop()) - effective.getMarginBottom()) / 2.0d;
        }
        return C14113y2.m67403k4(" ", new String[]{C14113y2.m67402k4("padding-top: {0}px;", Integer.valueOf(C7019kk.m27462to(Double.valueOf(height), 14))), C14113y2.m67402k4("padding-left: {0}px;", Integer.valueOf(C7019kk.m27462to(Double.valueOf(width), 14))), strM67400k4});
    }

    /* JADX INFO: renamed from: k4 */
    public static String m7303k4(String str) {
        return C12380dy.m57972k4(str, "span>\\s+<span", "span><span");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014b  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> double[] m7304k4(IParagraphFormatEffectiveData iParagraphFormatEffectiveData, TextFrame textFrame, C12015qq c12015qq, TemplateContext<T> templateContext) {
        char c;
        double[] dArr;
        Paragraph paragraph = (Paragraph) C7019kk.m27452k4((Object) templateContext.getObject(), Paragraph.class);
        ITextFrameFormatEffectiveData effective = textFrame.getTextFrameFormat().getEffective();
        float fontHeight = ((Paragraph) C7019kk.m27452k4((Object) templateContext.getObject(), Paragraph.class)).getPortions().getCount() == 0 ? 0.0f : ((Paragraph) C7019kk.m27452k4((Object) templateContext.getObject(), Paragraph.class)).getPortions().get_Item(0).getPortionFormat().getEffective().getFontHeight();
        double[] dArr2 = {effective.getMarginLeft() + ((double) iParagraphFormatEffectiveData.getMarginLeft()), 0.0d, effective.getMarginRight() + ((double) iParagraphFormatEffectiveData.getMarginRight()), 0.0d};
        int alignment = iParagraphFormatEffectiveData.getAlignment();
        if (alignment == 0) {
            c = 0;
            dArr = dArr2;
            if (effective.getTextVerticalType() == 2) {
                dArr[3] = c12015qq.m56697kk() - paragraph.m2170x1().m56550c5();
            } else if (effective.getTextVerticalType() == 3) {
                dArr[1] = -(c12015qq.m56697kk() - paragraph.m2170x1().m56550c5());
            }
        } else if (alignment == 1) {
            c = 0;
            dArr = dArr2;
            if (effective.getTextVerticalType() == 1) {
                dArr[1] = dArr[1] + ((double) ((c12015qq.m56697kk() - paragraph.m2170x1().m56550c5()) / 2.0f));
            } else if (effective.getTextVerticalType() == 3) {
                dArr[1] = -((c12015qq.m56697kk() - paragraph.m2170x1().m56550c5()) / 2.0f);
            } else if (effective.getTextVerticalType() == 2) {
                dArr[3] = dArr[3] + ((double) ((c12015qq.m56697kk() - paragraph.m2170x1().m56550c5()) / 2.0f));
            }
        } else {
            if (alignment != 2) {
                if (alignment == 3 || alignment == 4 || alignment == 5) {
                }
            } else if (effective.getTextVerticalType() == 1) {
                c = 0;
                dArr = dArr2;
                dArr[1] = dArr2[1] + ((double) (c12015qq.m56697kk() - paragraph.m2170x1().m56550c5()));
            }
            c = 0;
            dArr = dArr2;
        }
        byte anchoringType = effective.getAnchoringType();
        if (anchoringType == 1) {
            if (effective.getTextVerticalType() == 2) {
                dArr[2] = (c12015qq.m56699x1() - paragraph.m2170x1().m56575x1()) / 2.0f;
            }
        } else if (anchoringType != 2) {
            if (anchoringType == 3 || anchoringType == 4) {
            }
        } else if (effective.getTextVerticalType() == 2) {
            dArr[2] = c12015qq.m56699x1() - paragraph.m2170x1().m56575x1();
        }
        if ((effective.getTextVerticalType() == 1 || effective.getTextVerticalType() == 2) && textFrame.getParagraphs().getCount() > 1) {
            dArr[c] = 0.0d;
            dArr[2] = 0.0d;
        }
        if (effective.getTextVerticalType() == 0) {
            double d = fontHeight > 25.0f ? (-fontHeight) / 10.0f : 0.0d;
            dArr[1] = d;
            dArr[3] = d;
        }
        return dArr;
    }
}
