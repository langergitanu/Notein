package com.aspose.slides;

import androidx.core.text.util.LocalePreferences;
import com.aspose.slides.C14470su;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p077d8.C3068ks;
import com.aspose.slides.internal.p077d8.C3073my;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.AbstractC14070jw;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.words.ControlChar;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class yc7 {

    /* JADX INFO: renamed from: x1 */
    private static final char[] f50327x1 = {'\'', IOUtils.DIR_SEPARATOR_WINDOWS, '\n'};

    /* JADX INFO: renamed from: k4 */
    static final float[] f50320k4 = {7.5f, 10.0f, 12.0f, 14.0f, 18.0f, 24.0f, 36.0f};

    /* JADX INFO: renamed from: kk */
    private static final C3068ks f50321kk = new C3068ks(-1, true, "inherit", "ltr", "rtl");

    /* JADX INFO: renamed from: to */
    private static final C3068ks f50325to = new C3068ks(-1, true, "inherit", "left", "center", "right", "justify");

    /* JADX INFO: renamed from: du */
    private static final C3068ks f50315du = new C3068ks(0, true, "simple", "hanging");

    /* JADX INFO: renamed from: h4 */
    private static final C3068ks f50318h4 = new C3068ks(1, true, "solid", "gradient");

    /* JADX INFO: renamed from: m9 */
    private static final C3068ks f50323m9 = new C3068ks(0, true, "background1", "text1", "background2", "text2", "accent1", "accent2", "accent3", "accent4", "accent5", "accent6", "hyperlink", "followedhyperlink", "stylecolor", "dark1", "light1", "dark2", "light2");

    /* JADX INFO: renamed from: dy */
    private static final C3068ks f50316dy = new C3068ks(0, true, "linear", "path-rect", "path-circle", "path-shape");

    /* JADX INFO: renamed from: c5 */
    private static final C3068ks f50313c5 = new C3068ks(0, true, TranslateLanguage.NORWEGIAN, "yes");

    /* JADX INFO: renamed from: jd */
    private static final C3068ks f50319jd = new C3068ks(0, true, "solid", "dotgel", "dashgel", "longdashgel", "dashdotgel", "longdashdotgel", "longdashdotdotgel", "dashsys", "dotsys", "dashdotsys", "dashdotdotsys");

    /* JADX INFO: renamed from: ck */
    private static final C3068ks f50314ck = new C3068ks(0, true, "round", "bevel", "miter");

    /* JADX INFO: renamed from: fa */
    private static final C3068ks f50317fa = new C3068ks(0, true, "round", "square", "flat");

    /* JADX INFO: renamed from: up */
    private static final C3068ks f50326up = new C3068ks(0, true, "simple", "double", "thinthick", "thickthin", "triple");

    /* JADX INFO: renamed from: yj */
    private static final C3068ks f50329yj = new C3068ks(0, true, "center", "inset");

    /* JADX INFO: renamed from: ks */
    private static final C3068ks f50322ks = new C3068ks(0, true, "inherit", "baseline", "bottom", "middle", "sub", "super", "text-bottom", "text-top", "top");

    /* JADX INFO: renamed from: rv */
    private static final C3068ks f50324rv = new C3068ks(0, true, "left", "center", "right", "decimal");

    /* JADX INFO: renamed from: x6 */
    private static final C7017h4 f50328x6 = new C7017h4("x-small", "xx-small", "1", "small", "2", "medium", "3", "large", "4", "x-large", "5", "xx-large", "6");

    /* JADX INFO: renamed from: k4 */
    public static float m73805k4(C14470su.k4 k4Var, String str, float f) {
        String strM70774k4 = k4Var.m70774k4(str);
        return (strM70774k4 == null || "auto".equals(strM70774k4)) ? f : new C3073my(strM70774k4).m12995jd();
    }

    /* JADX INFO: renamed from: kk */
    private static float m73830kk(C14470su.k4 k4Var, String str, float f) {
        String strM70774k4 = k4Var.m70774k4(str);
        return strM70774k4 == null ? f : new C3073my(strM70774k4).m13005to(f);
    }

    /* JADX INFO: renamed from: to */
    private static float m73833to(C14470su.k4 k4Var, String str, float f) {
        String strM70774k4 = k4Var.m70774k4(str);
        if (strM70774k4 == null || "normal".equals(strM70774k4) || "auto".equals(strM70774k4)) {
            return f;
        }
        C3073my c3073my = new C3073my(strM70774k4);
        return C14113y2.m67364dy(strM70774k4, "%") >= 0 ? c3073my.m12991ck() : C14113y2.m67364dy(strM70774k4, "em") > 0 ? c3073my.m12995jd() * 100.0f : -c3073my.m12995jd();
    }

    /* JADX INFO: renamed from: x1 */
    private static float m73834x1(C14470su.k4 k4Var, String str, float f) {
        String strM70774k4 = k4Var.m70774k4(str);
        return strM70774k4 == null ? f : new C3073my(strM70774k4).m12996k4(f);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m73806k4(C14470su.k4 k4Var, String str, C3068ks c3068ks, int i) {
        String strM70774k4 = k4Var.m70774k4(str);
        return (strM70774k4 == null || !c3068ks.m12965x1(strM70774k4)) ? i : c3068ks.m12963k4(strM70774k4);
    }

    /* JADX INFO: renamed from: kk */
    private static String m73831kk(String str) {
        String str2;
        if (C14113y2.m67384k4(str, f50327x1) < 0) {
            return C14113y2.m67402k4("'{0}'", str);
        }
        C6765kp c6765kp = new C6765kp();
        int i = 0;
        while (i < str.length()) {
            int iM67385k4 = C14113y2.m67385k4(str, f50327x1, i);
            if (iM67385k4 < 0) {
                iM67385k4 = str.length();
            }
            if (i < iM67385k4) {
                c6765kp.m26793k4(str, i, iM67385k4);
            }
            if (iM67385k4 < str.length()) {
                char cCharAt = str.charAt(iM67385k4);
                if (cCharAt == '\n') {
                    str2 = "\\0000000a";
                } else if (cCharAt != '\'') {
                    if (cCharAt == '\\') {
                        str2 = "\\\\";
                    }
                    iM67385k4++;
                } else {
                    str2 = "\\'";
                }
                c6765kp.m26792k4(str2);
                iM67385k4++;
            }
            i = iM67385k4;
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public static float m73835x1(String str) {
        switch (f50328x6.m27428k4(str)) {
            case 0:
            case 1:
            case 2:
                return f50320k4[0];
            case 3:
            case 4:
                return f50320k4[1];
            case 5:
            case 6:
                return f50320k4[2];
            case 7:
            case 8:
                return f50320k4[3];
            case 9:
            case 10:
                return f50320k4[4];
            case 11:
            case 12:
                return f50320k4[5];
            default:
                float[] fArr = {0.0f};
                return C14064he.m66714k4(str, fArr) ? fArr[0] * 0.75f : new C3073my(str).m13006x1(Float.NaN);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static String m73807k4(IGenericDictionary<String, String> iGenericDictionary) {
        C6765kp c6765kp = new C6765kp();
        IGenericEnumerator<KeyValuePair<TKey, TValue>> it = iGenericDictionary.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair keyValuePair = (KeyValuePair) it.next();
                c6765kp.m26796k4(";{0}:{1}", keyValuePair.getKey(), keyValuePair.getValue());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (c6765kp.m26807x1() == 0) {
            return null;
        }
        return c6765kp.m26800k4(1, c6765kp.m26807x1() - 1);
    }

    /* JADX INFO: renamed from: kk */
    private static void m73832kk(IGenericDictionary<String, String> iGenericDictionary, String str, float f, float f2) {
        if (C3085sv.m13089k4(f, f2)) {
            iGenericDictionary.removeItemByKey(str);
        } else {
            iGenericDictionary.set_Item(str, C14113y2.m67407k4(C13850af.m65102k4(f), '%'));
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m73836x1(IGenericDictionary<String, String> iGenericDictionary, String str, float f, float f2) {
        if (C3085sv.m13089k4(f, f2)) {
            iGenericDictionary.removeItemByKey(str);
        } else {
            iGenericDictionary.set_Item(str, C13850af.m65102k4(f));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static String m73808k4(ColorFormat colorFormat) {
        C6765kp c6765kp = new C6765kp();
        for (int i = 0; i < colorFormat.getColorTransform().size(); i++) {
            int operationType = colorFormat.getColorTransform().get_Item(i).getOperationType();
            if (operationType == 0) {
                c6765kp.m26796k4(" tint={0}", Integer.valueOf(C7019kk.m27462to(Double.valueOf(((double) colorFormat.getColorTransform().get_Item(i).getParameter()) * 100000.0d), 14)));
            } else if (operationType != 1) {
                switch (operationType) {
                    case 10:
                        c6765kp.m26796k4(" huem={0}", Integer.valueOf(C7019kk.m27462to(Float.valueOf((colorFormat.getColorTransform().get_Item(i).getParameter() * 100000.0f) + 0.5f), 13)));
                        break;
                    case 11:
                        c6765kp.m26796k4(" sat={0}", Integer.valueOf(C7019kk.m27462to(Float.valueOf((colorFormat.getColorTransform().get_Item(i).getParameter() * 100000.0f) + 0.5f), 13)));
                        break;
                    case 12:
                        c6765kp.m26796k4(" sato={0}", Integer.valueOf(C7019kk.m27462to(Float.valueOf((colorFormat.getColorTransform().get_Item(i).getParameter() * 100000.0f) + 0.5f), 13)));
                        break;
                    case 13:
                        c6765kp.m26796k4(" satm={0}", Integer.valueOf(C7019kk.m27462to(Float.valueOf((colorFormat.getColorTransform().get_Item(i).getParameter() * 100000.0f) + 0.5f), 13)));
                        break;
                    case 14:
                        c6765kp.m26796k4(" lum={0}", Integer.valueOf(C7019kk.m27462to(Float.valueOf((colorFormat.getColorTransform().get_Item(i).getParameter() * 100000.0f) + 0.5f), 13)));
                        break;
                    case 15:
                        c6765kp.m26796k4(" lumo={0}", Integer.valueOf(C7019kk.m27462to(Float.valueOf((colorFormat.getColorTransform().get_Item(i).getParameter() * 100000.0f) + 0.5f), 13)));
                        break;
                    case 16:
                        c6765kp.m26796k4(" lumm={0}", Integer.valueOf(C7019kk.m27462to(Float.valueOf((colorFormat.getColorTransform().get_Item(i).getParameter() * 100000.0f) + 0.5f), 13)));
                        break;
                }
            } else {
                c6765kp.m26796k4(" shade={0}", Integer.valueOf(C7019kk.m27462to(Float.valueOf((colorFormat.getColorTransform().get_Item(i).getParameter() * 100000.0f) + 0.5f), 13)));
            }
        }
        if (c6765kp.m26807x1() > 0) {
            return c6765kp.m26800k4(1, c6765kp.m26807x1() - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m73809k4(IParagraphFormat iParagraphFormat) {
        SortedList sortedList = new SortedList(AbstractC14070jw.m66790x1());
        m73814k4(sortedList, "margin-top", iParagraphFormat.getSpaceBefore() > 0.0f ? iParagraphFormat.getSpaceBefore() : -iParagraphFormat.getSpaceBefore(), Float.NaN);
        if (iParagraphFormat.getSpaceWithin() > 0.0f) {
            m73832kk(sortedList, "line-height", iParagraphFormat.getSpaceWithin(), Float.NaN);
        } else {
            m73814k4(sortedList, "line-height", -iParagraphFormat.getSpaceWithin(), Float.NaN);
        }
        m73814k4(sortedList, "margin-bottom", iParagraphFormat.getSpaceBefore() > 0.0f ? iParagraphFormat.getSpaceAfter() : -iParagraphFormat.getSpaceAfter(), Float.NaN);
        m73814k4(sortedList, "text-indent", iParagraphFormat.getIndent(), Float.NaN);
        m73814k4(sortedList, "margin-left", iParagraphFormat.getMarginLeft(), Float.NaN);
        m73814k4(sortedList, "margin-right", iParagraphFormat.getMarginRight(), Float.NaN);
        m73819k4(sortedList, "text-align", f50325to, iParagraphFormat.getAlignment(), -1);
        m73819k4(sortedList, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, f50321kk, iParagraphFormat.getRightToLeft(), -1);
        m73819k4(sortedList, "punctuation-wrap", f50315du, iParagraphFormat.getHangingPunctuation(), -1);
        if (((ParagraphFormat) iParagraphFormat).m2188ck() > 0) {
            int alignment = iParagraphFormat.getTabs().get_Item(0).getAlignment();
            C6765kp c6765kp = new C6765kp(f50324rv.m12964k4(iParagraphFormat.getTabs().get_Item(0).getAlignment()));
            IGenericEnumerator<ITab> it = iParagraphFormat.getTabs().iterator();
            while (it.hasNext()) {
                try {
                    ITab next = it.next();
                    if (alignment != next.getAlignment()) {
                        alignment = next.getAlignment();
                        c6765kp.m26780k4(ControlChar.SPACE_CHAR);
                        c6765kp.m26792k4(f50324rv.m12964k4(next.getAlignment()));
                    }
                    c6765kp.m26780k4(ControlChar.SPACE_CHAR);
                    c6765kp.m26792k4(C13850af.m65101k4(next.getPosition()));
                    c6765kp.m26792k4(TranslateLanguage.PORTUGUESE);
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            sortedList.set_Item("tab-stops", c6765kp.toString());
        }
        return m73807k4(sortedList);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m73810k4(IPortionFormat iPortionFormat, boolean z, BaseSlide baseSlide, C14321pz c14321pz) {
        SortedList sortedList = new SortedList(AbstractC14070jw.m66790x1());
        if (z) {
            if (iPortionFormat.getLatinFont() != null) {
                m73820k4(sortedList, "mso-ascii-font-family", iPortionFormat.getLatinFont().getFontName());
            }
            if (iPortionFormat.getEastAsianFont() != null) {
                m73820k4(sortedList, "mso-fareast-font-family", iPortionFormat.getEastAsianFont().getFontName());
            }
            if (iPortionFormat.getComplexScriptFont() != null) {
                m73820k4(sortedList, "mso-bidi-font-family", iPortionFormat.getComplexScriptFont().getFontName());
            }
            m73814k4(sortedList, "mso-font-kerning", iPortionFormat.getKerningMinimalSize(), Float.NaN);
            m73818k4(sortedList, "mso-style-textoutline", iPortionFormat.getLineFormat(), baseSlide, c14321pz);
            m73817k4(sortedList, "mso-style-textfill", iPortionFormat.getFillFormat(), baseSlide, c14321pz);
            if (!C14064he.m66715kk(iPortionFormat.getEscapement())) {
                m73832kk(sortedList, "mso-text-raise", iPortionFormat.getEscapement(), 0.0f);
            }
        }
        if (iPortionFormat.getLatinFont() != null) {
            m73820k4(sortedList, "font-family", iPortionFormat.getLatinFont().getFontName(baseSlide.createThemeEffective()));
        }
        m73814k4(sortedList, "font-size", iPortionFormat.getFontHeight(), Float.NaN);
        if (iPortionFormat.getFontItalic() == 1) {
            sortedList.set_Item("font-style", "italic");
        }
        if (iPortionFormat.getFontBold() == 1) {
            sortedList.set_Item("font-weight", "bold");
        }
        sortedList.set_Item("language", iPortionFormat.getLanguageId());
        if (!C14064he.m66715kk(iPortionFormat.getEscapement()) && iPortionFormat.getEscapement() != 0.0f) {
            sortedList.set_Item("vertical-align", iPortionFormat.getEscapement() > 0.0f ? "super" : "sub");
        }
        if (iPortionFormat.getSpacing() > 0.0f) {
            m73814k4(sortedList, "letter-spacing", iPortionFormat.getSpacing(), Float.NaN);
        }
        return m73807k4(sortedList);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e8  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m73811k4(Paragraph paragraph, boolean z, BaseSlide baseSlide, C14321pz c14321pz) {
        IFontData latinFont;
        SortedList sortedList = new SortedList();
        if (paragraph.getParagraphFormat().getBullet().isBulletHardFont() != 1 || paragraph.getParagraphFormat().getBullet().getFont() == null) {
            if (paragraph.getPortions().getCount() > 0 && paragraph.getPortions().get_Item(0).getPortionFormat().getLatinFont() != null) {
                latinFont = paragraph.getPortions().get_Item(0).getPortionFormat().getLatinFont();
            }
            if (paragraph.getPortions().getCount() > 0) {
                m73814k4(sortedList, "font-size", paragraph.getPortions().get_Item(0).getPortionFormat().getFontHeight() * (paragraph.getParagraphFormat().getBullet().getHeight() / 100.0f), Float.NaN);
            }
            if (paragraph.getParagraphFormat().getBullet().isBulletHardColor() == 1) {
                C12003du c12003duClone = ((ColorFormat) paragraph.getParagraphFormat().getBullet().getColor()).m1082kk(baseSlide, c14321pz).Clone();
                sortedList.set_Item("color", C14113y2.m67402k4("#{0:x2}{1:x2}{2:x2}", Byte.valueOf(c12003duClone.m56507jd()), Byte.valueOf(c12003duClone.m56502ck()), Byte.valueOf(c12003duClone.m56505fa())));
            }
            if (z) {
                sortedList.set_Item("mso-special-format", paragraph.getParagraphFormat().getBullet().getType() == 2 ? C14113y2.m67402k4("'numbullet{0}\\,{1}'", Integer.valueOf(paragraph.getParagraphFormat().getBullet().getNumberedBulletStyle()), Short.valueOf(paragraph.getParagraphFormat().getBullet().getNumberedBulletStartWith())) : "bullet");
            }
            return m73807k4(sortedList);
        }
        latinFont = paragraph.getParagraphFormat().getBullet().getFont();
        m73820k4(sortedList, "font-family", latinFont.getFontName(baseSlide.createThemeEffective()));
        if (paragraph.getPortions().getCount() > 0) {
        }
        if (paragraph.getParagraphFormat().getBullet().isBulletHardColor() == 1) {
        }
        if (z) {
        }
        return m73807k4(sortedList);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m73812k4(String str) {
        if (C14113y2.m67429to(str, ',') <= 0) {
            return str;
        }
        String strM67423kk = C14113y2.m67423kk(C14113y2.m67414k4(str, ',')[0], '\"');
        strM67423kk.length();
        return strM67423kk;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m73813k4(String[] strArr) {
        if (strArr != null) {
            return m73812k4(strArr[0]);
        }
        throw new ArgumentNullException("cssFontNameParts");
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73814k4(IGenericDictionary<String, String> iGenericDictionary, String str, float f, float f2) {
        if (C3085sv.m13089k4(f, f2)) {
            iGenericDictionary.removeItemByKey(str);
        } else {
            iGenericDictionary.set_Item(str, C14113y2.m67408k4(C13850af.m65102k4(f), TranslateLanguage.PORTUGUESE));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73815k4(IGenericDictionary<String, String> iGenericDictionary, String str, ColorFormat colorFormat, BaseSlide baseSlide, C14321pz c14321pz) {
        C12003du c12003duClone = colorFormat.m1076k4((IBaseSlide) baseSlide, c14321pz).m69339k4().Clone();
        iGenericDictionary.set_Item(C14113y2.m67408k4(str, "-color"), C14113y2.m67402k4("#{0:x2}{1:x2}{2:x2}", Byte.valueOf(c12003duClone.m56507jd()), Byte.valueOf(c12003duClone.m56502ck()), Byte.valueOf(c12003duClone.m56505fa())));
        if (colorFormat.getColorType() == 3) {
            m73819k4(iGenericDictionary, C14113y2.m67408k4(str, "-themecolor"), f50323m9, colorFormat.getSchemeColor(), -1);
        }
        m73832kk(iGenericDictionary, C14113y2.m67408k4(str, "-alpha"), colorFormat.m1087x1(baseSlide, c14321pz).f48205k4 * 100.0f, 100.0f);
        String strM73808k4 = m73808k4(colorFormat);
        if (strM73808k4 == null || "".equals(strM73808k4)) {
            return;
        }
        iGenericDictionary.set_Item(C14113y2.m67408k4(str, "-colortransforms"), strM73808k4);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73816k4(IGenericDictionary<String, String> iGenericDictionary, String str, GradientFormat gradientFormat, BaseSlide baseSlide, C14321pz c14321pz) {
        m73819k4(iGenericDictionary, C14113y2.m67408k4(str, "-shadetype"), f50316dy, gradientFormat.getGradientShape(), -1);
        byte gradientShape = gradientFormat.getGradientShape();
        if (gradientShape == 0) {
            m73836x1(iGenericDictionary, C14113y2.m67408k4(str, "-shade-linearshade-angle"), gradientFormat.getLinearGradientAngle() * 60000.0f, Float.NaN);
            m73819k4(iGenericDictionary, C14113y2.m67408k4(str, "-shade-linearshade-fscaled"), f50313c5, gradientFormat.getLinearGradientScaled(), -1);
        } else if (gradientShape == 1 || gradientShape == 2 || gradientShape == 3) {
            ohe oheVarClone = gradientFormat.m1605h4().Clone();
            m73832kk(iGenericDictionary, C14113y2.m67408k4(str, "-shade-rectfill-pctleft"), oheVarClone.f47808k4.f47836k4, Float.NaN);
            m73832kk(iGenericDictionary, C14113y2.m67408k4(str, "-shade-rectfill-pctright"), oheVarClone.f47808k4.f47836k4 + oheVarClone.f47809x1.f47836k4, Float.NaN);
            m73832kk(iGenericDictionary, C14113y2.m67408k4(str, "-shade-rectfill-pcttop"), oheVarClone.f47808k4.f47837x1, Float.NaN);
            m73832kk(iGenericDictionary, C14113y2.m67408k4(str, "-shade-rectfill-pctbottom"), oheVarClone.f47808k4.f47837x1 + oheVarClone.f47809x1.f47837x1, Float.NaN);
        }
        C6765kp c6765kp = new C6765kp();
        for (int i = 0; i < gradientFormat.getGradientStops().size(); i++) {
            IGradientStop iGradientStop = gradientFormat.getGradientStops().get_Item(i);
            C12003du c12003duClone = ((ColorFormat) gradientFormat.getGradientStops().get_Item(i).getColor()).m1082kk(baseSlide, c14321pz).Clone();
            c6765kp.m26796k4("\\,{0} \\#{1:x2}{2:x2}{3:x2} {4}", Integer.valueOf(C7019kk.m27462to(Float.valueOf((iGradientStop.getPosition() * 100000.0f) + 0.5f), 13)), Byte.valueOf(c12003duClone.m56507jd()), Byte.valueOf(c12003duClone.m56502ck()), Byte.valueOf(c12003duClone.m56505fa()), Integer.valueOf(iGradientStop.getColor().getSchemeColor()));
            c6765kp.m26796k4(" {0}", Integer.valueOf(C7019kk.m27462to(Float.valueOf(((c12003duClone.m56501c5() & 255) * 100000.0f) / 255.0f), 13)));
            String strM73808k4 = m73808k4((ColorFormat) iGradientStop.getColor());
            if (strM73808k4 != null) {
                c6765kp.m26796k4(" {0}", strM73808k4);
            }
        }
        if (c6765kp.m26807x1() > 2) {
            iGenericDictionary.set_Item(C14113y2.m67408k4(str, "-stoplist"), c6765kp.m26800k4(2, c6765kp.m26807x1() - 2));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73817k4(IGenericDictionary<String, String> iGenericDictionary, String str, IFillFormat iFillFormat, BaseSlide baseSlide, C14321pz c14321pz) {
        byte fillType = iFillFormat.getFillType();
        if (fillType != 1) {
            if (fillType != 2) {
                return;
            }
            m73819k4(iGenericDictionary, C14113y2.m67408k4(str, "-type"), f50318h4, iFillFormat.getFillType(), -1);
            m73816k4(iGenericDictionary, C14113y2.m67408k4(str, "-fill-gradientfill"), (GradientFormat) iFillFormat.getGradientFormat(), baseSlide, c14321pz);
            return;
        }
        m73819k4(iGenericDictionary, C14113y2.m67408k4(str, "-type"), f50318h4, iFillFormat.getFillType(), -1);
        m73815k4(iGenericDictionary, C14113y2.m67408k4(str, "-fill"), (ColorFormat) iFillFormat.getSolidFillColor(), baseSlide, c14321pz);
        C12003du c12003duClone = ((ColorFormat) iFillFormat.getSolidFillColor()).m1082kk(baseSlide, c14321pz).Clone();
        iGenericDictionary.set_Item("color", C14113y2.m67402k4("#{0:x2}{1:x2}{2:x2}", Byte.valueOf(c12003duClone.m56507jd()), Byte.valueOf(c12003duClone.m56502ck()), Byte.valueOf(c12003duClone.m56505fa())));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73818k4(IGenericDictionary<String, String> iGenericDictionary, String str, ILineFormat iLineFormat, BaseSlide baseSlide, C14321pz c14321pz) {
        byte fillType = iLineFormat.getFillFormat().getFillType();
        if (fillType == 1) {
            m73819k4(iGenericDictionary, C14113y2.m67408k4(str, "-type"), f50318h4, iLineFormat.getFillFormat().getFillType(), -1);
            m73815k4(iGenericDictionary, C14113y2.m67408k4(str, "-fill"), (ColorFormat) iLineFormat.getFillFormat().getSolidFillColor(), baseSlide, c14321pz);
        } else if (fillType == 2) {
            m73819k4(iGenericDictionary, C14113y2.m67408k4(str, "-type"), f50318h4, iLineFormat.getFillFormat().getFillType(), -1);
            m73816k4(iGenericDictionary, C14113y2.m67408k4(str, "-fill-gradientfill"), (GradientFormat) iLineFormat.getFillFormat().getGradientFormat(), baseSlide, c14321pz);
        }
        m73819k4(iGenericDictionary, C14113y2.m67408k4(str, "-outlinestyle-dash"), f50319jd, iLineFormat.getDashStyle(), -1);
        m73819k4(iGenericDictionary, C14113y2.m67408k4(str, "-outlinestyle-join"), f50314ck, iLineFormat.getJoinStyle(), -1);
        m73819k4(iGenericDictionary, C14113y2.m67408k4(str, "-outlinestyle-linecap"), f50317fa, iLineFormat.getCapStyle(), -1);
        m73819k4(iGenericDictionary, C14113y2.m67408k4(str, "-outlinestyle-compound"), f50326up, iLineFormat.getStyle(), -1);
        m73819k4(iGenericDictionary, C14113y2.m67408k4(str, "-outlinestyle-align"), f50329yj, iLineFormat.getAlignment(), -1);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73819k4(IGenericDictionary<String, String> iGenericDictionary, String str, C3068ks c3068ks, int i, int i2) {
        if (i == i2) {
            iGenericDictionary.removeItemByKey(str);
        } else {
            iGenericDictionary.set_Item(str, c3068ks.m12964k4(i));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73820k4(IGenericDictionary<String, String> iGenericDictionary, String str, String str2) {
        iGenericDictionary.set_Item(str, m73831kk(str2));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73821k4(C3073my c3073my, IColorFormat iColorFormat) {
        int iM13007x1;
        IColorOperationCollection colorTransform;
        float f;
        int i;
        while (c3073my.m12994h4() > 0) {
            c3073my.m12993dy();
            char cM12990c5 = c3073my.m12990c5();
            if ((cM12990c5 < 'A' || cM12990c5 > 'Z') && (cM12990c5 < 'a' || cM12990c5 > 'z')) {
                return;
            }
            String strM13008x1 = c3073my.m13008x1();
            if (!"".equals(strM13008x1)) {
                c3073my.m12993dy();
                if (c3073my.m13003m9() == '=' && (iM13007x1 = c3073my.m13007x1(Integer.MIN_VALUE)) != Integer.MIN_VALUE) {
                    if (C14113y2.m67360du(strM13008x1, "tint", (short) 3) == 0) {
                        colorTransform = iColorFormat.getColorTransform();
                        f = iM13007x1 / 100000.0f;
                        i = 0;
                    } else if (C14113y2.m67360du(strM13008x1, "shade", (short) 3) == 0) {
                        colorTransform = iColorFormat.getColorTransform();
                        f = iM13007x1 / 100000.0f;
                        i = 1;
                    } else if (C14113y2.m67360du(strM13008x1, "huem", (short) 3) == 0) {
                        colorTransform = iColorFormat.getColorTransform();
                        f = iM13007x1 / 100000.0f;
                        i = 10;
                    } else if (C14113y2.m67360du(strM13008x1, LocalePreferences.FirstDayOfWeek.SATURDAY, (short) 3) == 0) {
                        colorTransform = iColorFormat.getColorTransform();
                        f = iM13007x1 / 100000.0f;
                        i = 11;
                    } else if (C14113y2.m67360du(strM13008x1, "sato", (short) 3) == 0) {
                        colorTransform = iColorFormat.getColorTransform();
                        f = iM13007x1 / 100000.0f;
                        i = 12;
                    } else if (C14113y2.m67360du(strM13008x1, "satm", (short) 3) == 0) {
                        colorTransform = iColorFormat.getColorTransform();
                        f = iM13007x1 / 100000.0f;
                        i = 13;
                    } else if (C14113y2.m67360du(strM13008x1, "lum", (short) 3) == 0) {
                        colorTransform = iColorFormat.getColorTransform();
                        f = iM13007x1 / 100000.0f;
                        i = 14;
                    } else if (C14113y2.m67360du(strM13008x1, "lumo", (short) 3) == 0) {
                        colorTransform = iColorFormat.getColorTransform();
                        f = iM13007x1 / 100000.0f;
                        i = 15;
                    } else if (C14113y2.m67360du(strM13008x1, "lumm", (short) 3) == 0) {
                        colorTransform = iColorFormat.getColorTransform();
                        f = iM13007x1 / 100000.0f;
                        i = 16;
                    }
                    colorTransform.add(i, f);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m73822k4(C14470su.k4 k4Var, IParagraphFormat iParagraphFormat, float f, float f2, float f3) {
        ITabCollection tabs;
        Tab tab;
        iParagraphFormat.setSpaceBefore(m73833to(k4Var, "margin-top", f2) / 2.0f);
        iParagraphFormat.setSpaceWithin(m73833to(k4Var, "line-height", Float.NaN));
        iParagraphFormat.setSpaceAfter(m73833to(k4Var, "margin-bottom", f3) / 2.0f);
        iParagraphFormat.setIndent(m73805k4(k4Var, "text-indent", Float.NaN));
        iParagraphFormat.setMarginLeft(m73805k4(k4Var, "margin-left", Float.NaN));
        iParagraphFormat.setMarginRight(m73805k4(k4Var, "margin-right", Float.NaN));
        iParagraphFormat.setAlignment(m73806k4(k4Var, "text-align", f50325to, -1));
        iParagraphFormat.setRightToLeft((byte) m73806k4(k4Var, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, f50321kk, -1));
        iParagraphFormat.setHangingPunctuation((byte) m73806k4(k4Var, "punctuation-wrap", f50315du, -1));
        String strM70774k4 = k4Var.m70774k4("tab-stops");
        if (strM70774k4 == null) {
            return;
        }
        C3073my c3073my = new C3073my(strM70774k4);
        while (true) {
            int i = 0;
            while (true) {
                int iM12997k4 = c3073my.m12997k4();
                float fM13005to = c3073my.m13005to(Float.NaN);
                if (C14064he.m66715kk(fM13005to)) {
                    c3073my.m12998k4(iM12997k4);
                    float fM13006x1 = c3073my.m13006x1(Float.NaN);
                    if (C14064he.m66715kk(fM13006x1)) {
                        c3073my.m12998k4(iM12997k4);
                        String strM13008x1 = c3073my.m13008x1();
                        if (strM13008x1 == null || "".equals(strM13008x1)) {
                            return;
                        }
                        C3068ks c3068ks = f50324rv;
                        if (C14113y2.m67360du(strM13008x1, c3068ks.m12964k4(0), (short) 3) == 0) {
                            break;
                        }
                        int i2 = 1;
                        if (C14113y2.m67360du(strM13008x1, c3068ks.m12964k4(1), (short) 3) != 0) {
                            i2 = 2;
                            if (C14113y2.m67360du(strM13008x1, c3068ks.m12964k4(2), (short) 3) != 0) {
                                if (C14113y2.m67360du(strM13008x1, c3068ks.m12964k4(3), (short) 3) == 0) {
                                    i = 3;
                                }
                            }
                        }
                        i = i2;
                    } else {
                        tabs = iParagraphFormat.getTabs();
                        tab = new Tab(fM13006x1, i);
                    }
                } else {
                    tabs = iParagraphFormat.getTabs();
                    tab = new Tab((((double) f) / 100.0d) * ((double) fM13005to), i);
                }
                tabs.add(tab);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73823k4(C14470su.k4 k4Var, PortionFormat portionFormat) {
        String strM70774k4 = k4Var.m70774k4("font");
        if (strM70774k4 != null) {
            C3073my c3073my = new C3073my(strM70774k4);
            c3073my.m12993dy();
            while (true) {
                String strM13008x1 = c3073my.m13008x1();
                if (C14113y2.m67411k4(strM13008x1)) {
                    break;
                }
                if (C14113y2.m67360du(strM13008x1, "bold", (short) 3) == 0 || C14113y2.m67360du(strM13008x1, "bolder", (short) 3) == 0) {
                    portionFormat.setFontBold((byte) 1);
                } else if (C14113y2.m67360du(strM13008x1, "normal", (short) 3) == 0 || C14113y2.m67360du(strM13008x1, "lighter", (short) 3) == 0) {
                    portionFormat.setFontBold((byte) 0);
                } else if (C14113y2.m67360du(strM70774k4, "normal", (short) 3) == 0) {
                    portionFormat.setFontItalic((byte) 0);
                } else if (C14113y2.m67360du(strM70774k4, "italic", (short) 3) == 0 || C14113y2.m67360du(strM70774k4, "oblique", (short) 3) == 0) {
                    portionFormat.setFontItalic((byte) 1);
                } else if (C14113y2.m67424kk(strM13008x1, TranslateLanguage.PORTUGUESE)) {
                    float[] fArr = {0.0f};
                    boolean z = C14064he.m66714k4(OooO0OO.OooO00o(2, 0, strM13008x1, strM13008x1), fArr);
                    float f = fArr[0];
                    if (z) {
                        portionFormat.setFontHeight(f);
                    }
                }
            }
            String strM67423kk = C14113y2.m67423kk(C14113y2.m67443x1(strM70774k4, c3073my.m12997k4(), strM70774k4.length() - c3073my.m12997k4()), '\"');
            if (C14113y2.m67411k4(strM67423kk)) {
                return;
            }
            FontData fontData = new FontData(strM67423kk);
            portionFormat.setLatinFont(fontData);
            portionFormat.setEastAsianFont(fontData);
            portionFormat.setComplexScriptFont(fontData);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0194 A[PHI: r0
      0x0194: PHI (r0v25 float) = (r0v21 float), (r0v24 float) binds: [B:79:0x0192, B:87:0x01b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m73824k4(C14470su.k4 k4Var, PortionFormat portionFormat, boolean z) {
        float f;
        String[] strArrM73829k4 = m73829k4(k4Var, "mso-ascii-font-family");
        String[] strArrM73829k42 = m73829k4(k4Var, "mso-fareast-font-family");
        String[] strArrM73829k43 = m73829k4(k4Var, "mso-bidi-font-family");
        String[] strArrM73829k44 = m73829k4(k4Var, "font-family");
        if (strArrM73829k44 != null && strArrM73829k44.length > 0) {
            portionFormat.setLatinFont(new FontData(m73813k4(strArrM73829k44)));
        } else if (strArrM73829k4 != null && strArrM73829k4.length > 0) {
            portionFormat.setLatinFont(new FontData(m73813k4(strArrM73829k4)));
        }
        if (strArrM73829k42 != null && strArrM73829k42.length > 0) {
            portionFormat.setEastAsianFont(new FontData(m73813k4(strArrM73829k42)));
        }
        if (strArrM73829k43 != null && strArrM73829k43.length > 0) {
            portionFormat.setComplexScriptFont(new FontData(m73813k4(strArrM73829k43)));
        }
        String strM70774k4 = k4Var.m70774k4("font-size");
        if (strM70774k4 != null) {
            portionFormat.setFontHeight(m73835x1(strM70774k4));
        }
        String strM70774k42 = k4Var.m70774k4("font-style");
        if (strM70774k42 == null) {
            portionFormat.setFontItalic((byte) -1);
        } else if (C14113y2.m67360du(strM70774k42, "normal", (short) 3) == 0) {
            portionFormat.setFontItalic((byte) 0);
        } else if (C14113y2.m67360du(strM70774k42, "italic", (short) 3) == 0 || C14113y2.m67360du(strM70774k42, "oblique", (short) 3) == 0) {
            portionFormat.setFontItalic((byte) 1);
        }
        String strM70774k43 = k4Var.m70774k4("font-weight");
        if (strM70774k43 != null) {
            C3073my c3073my = new C3073my(strM70774k43);
            c3073my.m12993dy();
            if (c3073my.m12990c5() < '0' || c3073my.m12990c5() > '9') {
                String strM13008x1 = c3073my.m13008x1();
                if (C14113y2.m67360du(strM13008x1, "bold", (short) 3) != 0 && C14113y2.m67360du(strM13008x1, "bolder", (short) 3) != 0) {
                    if (C14113y2.m67360du(strM13008x1, "normal", (short) 3) == 0 || C14113y2.m67360du(strM13008x1, "lighter", (short) 3) == 0) {
                        portionFormat.setFontBold((byte) 0);
                    } else {
                        portionFormat.setFontBold((byte) -1);
                    }
                }
                portionFormat.setFontBold((byte) 1);
            } else {
                int iM13007x1 = c3073my.m13007x1(Integer.MIN_VALUE);
                if (iM13007x1 != Integer.MIN_VALUE) {
                    if (iM13007x1 >= 700) {
                        portionFormat.setFontBold((byte) 1);
                    }
                }
                portionFormat.setFontBold((byte) -1);
            }
        }
        String strM70774k44 = k4Var.m70774k4("text-decoration");
        if (strM70774k44 == null) {
            strM70774k44 = k4Var.m70774k4("text-decoration-line");
        }
        if (strM70774k44 != null) {
            String strM13008x12 = new C3073my(strM70774k44).m13008x1();
            if (C14113y2.m67360du(strM13008x12, "line", (short) 3) == 0) {
                portionFormat.setStrikethroughType((byte) 1);
            } else if (C14113y2.m67360du(strM13008x12, "underline", (short) 3) == 0) {
                portionFormat.setFontUnderline((byte) 2);
            }
        }
        String strM70774k45 = k4Var.m70774k4("mso-font-kerning");
        if (strM70774k45 != null) {
            portionFormat.setKerningMinimalSize(new C3073my(strM70774k45).m13006x1(Float.NaN));
        }
        String strM70774k46 = k4Var.m70774k4("language");
        if (strM70774k46 != null) {
            portionFormat.setLanguageId(strM70774k46);
        }
        m73828k4(k4Var, "mso-style-textoutline", portionFormat.getLineFormat());
        m73826k4(k4Var, "mso-style-textfill", portionFormat.getFillFormat());
        if (portionFormat.getFillFormat().getFillType() == -1 && k4Var.m70775x1("color")) {
            portionFormat.getFillFormat().setFillType((byte) 1);
            new C3073my(k4Var.m70774k4("color")).m12999k4(portionFormat.getFillFormat().getSolidFillColor());
        }
        float fM73830kk = m73830kk(k4Var, "mso-text-raise", Float.NaN);
        if (C14064he.m66715kk(fM73830kk)) {
            if (!z) {
                float fM73830kk2 = m73830kk(k4Var, "vertical-align", Float.NaN);
                if (C14064he.m66715kk(fM73830kk2)) {
                    fM73830kk = 40.0f;
                    switch (m73806k4(k4Var, "vertical-align", f50322ks, -1)) {
                        case -1:
                        case 0:
                            portionFormat.setEscapement(Float.NaN);
                            break;
                        case 1:
                            f = 0.0f;
                            break;
                        case 2:
                        case 6:
                        case 7:
                        case 8:
                            portionFormat.setEscapement(fM73830kk);
                            break;
                        case 3:
                            f = 20.0f;
                            break;
                        case 4:
                            f = -25.0f;
                            break;
                        case 5:
                            f = 30.0f;
                            break;
                    }
                } else {
                    f = -fM73830kk2;
                }
                portionFormat.setEscapement(f);
            }
        }
        m73823k4(k4Var, portionFormat);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73825k4(C14470su.k4 k4Var, String str, IColorFormat iColorFormat) {
        String strM70774k4 = k4Var.m70774k4(C14113y2.m67408k4(str, "-color"));
        if (strM70774k4 != null) {
            new C3073my(strM70774k4).m12999k4(iColorFormat);
        }
        int iM73806k4 = m73806k4(k4Var, C14113y2.m67408k4(str, "-themecolor"), f50323m9, -1);
        if (iM73806k4 != -1) {
            iColorFormat.setSchemeColor(iM73806k4);
        }
        float fM73830kk = m73830kk(k4Var, C14113y2.m67408k4(str, "-alpha"), Float.NaN);
        if (!C14064he.m66715kk(fM73830kk)) {
            iColorFormat.getColorTransform().add(5, fM73830kk / 100.0f);
        }
        String strM70774k42 = k4Var.m70774k4(C14113y2.m67408k4(str, "-colortransforms"));
        if (strM70774k42 != null) {
            m73821k4(new C3073my(strM70774k42), iColorFormat);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73826k4(C14470su.k4 k4Var, String str, IFillFormat iFillFormat) {
        iFillFormat.setFillType((byte) m73806k4(k4Var, C14113y2.m67408k4(str, "-type"), f50318h4, -1));
        byte fillType = iFillFormat.getFillType();
        if (fillType == 1) {
            m73825k4(k4Var, C14113y2.m67408k4(str, "-fill"), iFillFormat.getSolidFillColor());
        } else {
            if (fillType != 2) {
                return;
            }
            m73827k4(k4Var, C14113y2.m67408k4(str, "-fill-gradientfill"), iFillFormat.getGradientFormat());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b2, code lost:
    
        if (r9.m12990c5() != '\"') goto L38;
     */
    /* JADX WARN: Path cross not found for [B:16:0x00b4, B:14:0x00ac], limit reached: 38 */
    /* JADX WARN: Path cross not found for [B:16:0x00b4, B:38:?], limit reached: 38 */
    /* JADX WARN: Path cross not found for [B:38:?, B:16:0x00b4], limit reached: 38 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0141 -> B:16:0x00b4). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m73827k4(C14470su.k4 k4Var, String str, IGradientFormat iGradientFormat) {
        iGradientFormat.setGradientShape((byte) m73806k4(k4Var, C14113y2.m67408k4(str, "-shadetype"), f50316dy, -1));
        byte gradientShape = iGradientFormat.getGradientShape();
        if (gradientShape == 0) {
            iGradientFormat.setLinearGradientAngle(m73834x1(k4Var, C14113y2.m67408k4(str, "-shade-linearshade-angle"), Float.NaN) / 60000.0f);
            iGradientFormat.setLinearGradientScaled((byte) m73806k4(k4Var, C14113y2.m67408k4(str, "-shade-linearshade-fscaled"), f50313c5, -1));
        } else if (gradientShape == 1 || gradientShape == 2 || gradientShape == 3) {
            float fM73830kk = m73830kk(k4Var, C14113y2.m67408k4(str, "-shade-rectfill-pctleft"), Float.NaN);
            float fM73830kk2 = m73830kk(k4Var, C14113y2.m67408k4(str, "-shade-rectfill-pctright"), Float.NaN);
            float fM73830kk3 = m73830kk(k4Var, C14113y2.m67408k4(str, "-shade-rectfill-pcttop"), Float.NaN);
            ((GradientFormat) iGradientFormat).m1607k4(fM73830kk, fM73830kk3, fM73830kk2 - fM73830kk, m73830kk(k4Var, C14113y2.m67408k4(str, "-shade-rectfill-pctbottom"), Float.NaN) - fM73830kk3);
        }
        C3073my c3073my = new C3073my(k4Var.m70774k4(C14113y2.m67408k4(str, "-stoplist")));
        if (c3073my.m12990c5() != '\'') {
        }
        c3073my.m13003m9();
        while (c3073my.m12994h4() > 0) {
            float fM12996k4 = c3073my.m12996k4(Float.NaN);
            if (C14064he.m66715kk(fM12996k4)) {
                return;
            }
            ((GradientStopCollection) iGradientFormat.getGradientStops()).m1625k4(fM12996k4 / 100000.0f, C12003du.m56460uz().Clone());
            IGradientStop iGradientStop = iGradientFormat.getGradientStops().get_Item(iGradientFormat.getGradientStops().size() - 1);
            c3073my.m12993dy();
            c3073my.m13003m9();
            c3073my.m12999k4(iGradientStop.getColor());
            int iM13007x1 = c3073my.m13007x1(-1);
            if (iM13007x1 >= 0) {
                iGradientStop.getColor().setSchemeColor(iM13007x1);
            }
            c3073my.m12993dy();
            float fM12996k42 = c3073my.m12996k4(Float.NaN) / 100000.0f;
            if (!C14064he.m66715kk(fM12996k42)) {
                iGradientStop.getColor().getColorTransform().insert(0, 5, fM12996k42);
            }
            m73821k4(c3073my, (ColorFormat) iGradientStop.getColor());
            c3073my.m12993dy();
            if (c3073my.m12990c5() == '\\') {
                c3073my.m13003m9();
            }
            if (c3073my.m12990c5() == ',') {
                c3073my.m13003m9();
                while (c3073my.m12994h4() > 0) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73828k4(C14470su.k4 k4Var, String str, ILineFormat iLineFormat) {
        iLineFormat.getFillFormat().setFillType((byte) m73806k4(k4Var, C14113y2.m67408k4(str, "-type"), f50318h4, -1));
        byte fillType = iLineFormat.getFillFormat().getFillType();
        if (fillType == 1) {
            m73825k4(k4Var, C14113y2.m67408k4(str, "-fill"), iLineFormat.getFillFormat().getSolidFillColor());
        } else if (fillType == 2) {
            m73827k4(k4Var, C14113y2.m67408k4(str, "-fill-gradientfill"), iLineFormat.getFillFormat().getGradientFormat());
        }
        iLineFormat.setDashStyle((byte) m73806k4(k4Var, C14113y2.m67408k4(str, "-outlinestyle-dash"), f50319jd, -1));
        iLineFormat.setJoinStyle((byte) m73806k4(k4Var, C14113y2.m67408k4(str, "-outlinestyle-join"), f50314ck, -1));
        iLineFormat.setCapStyle((byte) m73806k4(k4Var, C14113y2.m67408k4(str, "-outlinestyle-linecap"), f50317fa, -1));
        iLineFormat.setStyle((byte) m73806k4(k4Var, C14113y2.m67408k4(str, "-outlinestyle-compound"), f50326up, -1));
        iLineFormat.setAlignment((byte) m73806k4(k4Var, C14113y2.m67408k4(str, "-outlinestyle-align"), f50329yj, -1));
    }

    /* JADX INFO: renamed from: k4 */
    public static String[] m73829k4(C14470su.k4 k4Var, String str) {
        String strM70774k4 = k4Var.m70774k4(str);
        if (strM70774k4 == null) {
            return null;
        }
        C3073my c3073my = new C3073my(strM70774k4);
        List list = new List();
        while (true) {
            String strM67400k4 = "";
            do {
                String strM13002kk = c3073my.m13002kk();
                if ("".equals(strM13002kk)) {
                    list.addItem(strM67400k4);
                    return (String[]) list.toArray(new String[0]);
                }
                strM67400k4 = C14113y2.m67400k4(strM67400k4, strM13002kk);
                if (c3073my.m12990c5() == ' ' && strM67400k4.length() > 0) {
                    strM67400k4 = C14113y2.m67400k4(strM67400k4, " ");
                }
                c3073my.m12993dy();
            } while (c3073my.m12990c5() != ',');
            list.addItem(strM67400k4);
            c3073my.m13003m9();
        }
    }
}
