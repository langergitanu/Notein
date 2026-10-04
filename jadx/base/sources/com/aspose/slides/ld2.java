package com.aspose.slides;

import com.aspose.slides.Fonts;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.qy7;

/* JADX INFO: loaded from: classes3.dex */
class ld2 {

    /* JADX INFO: renamed from: du */
    private IFontSchemeEffectiveData f45966du;

    /* JADX INFO: renamed from: k4 */
    public final BaseSlide f45967k4;

    /* JADX INFO: renamed from: kk */
    public final TextFrame f45968kk;

    /* JADX INFO: renamed from: to */
    private final oju f45969to;

    /* JADX INFO: renamed from: x1 */
    public final LoadOptions f45970x1;

    public ld2(BaseSlide baseSlide, LoadOptions loadOptions, TextFrame textFrame, oju ojuVar) {
        oju ojuVar2 = new oju();
        this.f45969to = ojuVar2;
        this.f45967k4 = baseSlide;
        this.f45970x1 = loadOptions;
        this.f45968kk = textFrame;
        ojuVar.CloneTo(ojuVar2);
        IThemeEffectiveData iThemeEffectiveDataCreateThemeEffective = baseSlide.createThemeEffective();
        if (iThemeEffectiveDataCreateThemeEffective != null) {
            this.f45966du = iThemeEffectiveDataCreateThemeEffective.getFontScheme();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private MathematicalText m64356k4(IMathElement iMathElement) {
        MathematicalText mathematicalText = (MathematicalText) C7019kk.m27452k4((Object) iMathElement, MathematicalText.class);
        if (mathematicalText != null) {
            return mathematicalText;
        }
        for (IMathElement iMathElement2 : iMathElement.getChildren()) {
            MathematicalText mathematicalTextM64356k4 = m64356k4(iMathElement2);
            if (mathematicalTextM64356k4 != null) {
                return mathematicalTextM64356k4;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final qy7 m64366kk(kg7 kg7Var, r7c r7cVar, float f) {
        lrb lrbVar = r7cVar.f48541k4;
        Portion portion = r7cVar.f48542kk;
        return m64368x1(kg7Var, portion, r7cVar.f48541k4, (FontData) (portion.getPortionFormat().getSymbolFont() == null ? lrbVar.getLatinFont() : lrbVar.getSymbolFont()), f);
    }

    /* JADX INFO: renamed from: to */
    public final qy7 m64367to(kg7 kg7Var, r7c r7cVar, float f) {
        qy7.C14366k4 c14366k4 = new qy7.C14366k4();
        c14366k4.f48495k4 = "Segoe UI Emoji";
        c14366k4.f48498x1 = ay6.m3838to(r7cVar.f48541k4.m4837m9(), f);
        c14366k4.m69936k4(r7cVar.f48541k4, this.f45970x1.getDefaultSymbolFont());
        return new qy7(r7cVar.f48542kk, r7cVar.f48541k4, c14366k4.Clone(), (byte) 2, (byte) 0, null, this.f45970x1.getDefaultSymbolFont(), this.f45969to.Clone(), this.f45967k4, kg7Var, this.f45968kk.getTextFrameFormat().getEffective().getTextVerticalType());
    }

    /* JADX INFO: renamed from: x1 */
    public final qy7 m64368x1(kg7 kg7Var, Portion portion, lrb lrbVar, FontData fontData, float f) {
        String fontName;
        byte bM1485k4;
        byte bM1490x1;
        byte[] bArrM1488kk;
        if (fontData == null || C14113y2.m67363du(fontData.getFontName(), FontData.m1484du().getFontName())) {
            fontName = "Wingdings";
            bM1485k4 = 2;
            bM1490x1 = 0;
            bArrM1488kk = null;
        } else {
            fontName = fontData.getFontName();
            bM1485k4 = fontData.m1485k4();
            bM1490x1 = fontData.m1490x1();
            bArrM1488kk = fontData.m1488kk();
        }
        byte b = bM1485k4;
        byte b2 = bM1490x1;
        byte[] bArr = bArrM1488kk;
        qy7.C14366k4 c14366k4 = new qy7.C14366k4();
        c14366k4.f48495k4 = fontName;
        c14366k4.f48498x1 = ay6.m3838to(lrbVar.m4837m9(), f);
        c14366k4.m69936k4(lrbVar, this.f45970x1.getDefaultSymbolFont());
        return new qy7(portion, lrbVar, c14366k4.Clone(), b, b2, bArr, this.f45970x1.getDefaultSymbolFont(), this.f45969to.Clone(), this.f45967k4, kg7Var, this.f45968kk.getTextFrameFormat().getEffective().getTextVerticalType());
    }

    /* JADX INFO: renamed from: k4 */
    public final qy7.C14366k4 m64357k4(fqc fqcVar, r7c r7cVar, float f, FontData[] fontDataArr) {
        String strM3814k4;
        MathematicalText mathematicalTextM64356k4;
        fontDataArr[0] = null;
        if (fqcVar.f5106kk.isBulletHardFont() && fqcVar.getBullet().getType() != 2) {
            fontDataArr[0] = (FontData) fqcVar.getBullet().getFont();
        }
        qy7.C14366k4 c14366k4 = new qy7.C14366k4();
        c14366k4.f48498x1 = ay6.m3838to(r7cVar.f48541k4.m4837m9(), f);
        if (C7019kk.m27469x1(r7cVar.f48542kk, MathPortion.class) && (mathematicalTextM64356k4 = m64356k4((MathBlock) C7019kk.m27452k4((Object) ((MathParagraph) ((MathPortion) r7cVar.f48542kk).getMathParagraph()).get_Item(0), MathBlock.class))) != null) {
            c14366k4.f48498x1 = mathematicalTextM64356k4.getFormat().getFontHeight();
        }
        FontData fontData = fontDataArr[0];
        if (fontData == null) {
            FontData fontDataM3801k4 = ay6.m3801k4(r7cVar, r7cVar.f48544x1);
            fontDataArr[0] = fontDataM3801k4;
            strM3814k4 = fontDataM3801k4.getFontName();
        } else {
            strM3814k4 = ay6.m3814k4(fontData, this.f45966du);
        }
        c14366k4.f48495k4 = strM3814k4;
        c14366k4.m69936k4(r7cVar.f48541k4, this.f45970x1.getDefaultRegularFont());
        if (!C14064he.m66715kk(fqcVar.getBullet().getHeight())) {
            if (fqcVar.getBullet().getHeight() < 0.0f) {
                c14366k4.f48498x1 = -fqcVar.getBullet().getHeight();
            } else {
                c14366k4.f48498x1 = ((fqcVar.getBullet().getHeight() * c14366k4.f48498x1) / 100.0f) + 0.5f;
            }
        }
        if (fqcVar.getBullet().getType() == 1) {
            c14366k4.f48497to = false;
            c14366k4.f48496kk = false;
        }
        c14366k4.f48494du = false;
        return c14366k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final qy7 m64369x1(kg7 kg7Var, r7c r7cVar, float f) {
        FontData fontData = (FontData) r7cVar.f48541k4.getComplexScriptFont();
        qy7.C14366k4 c14366k4 = new qy7.C14366k4();
        c14366k4.f48495k4 = fontData.getFontName();
        c14366k4.f48498x1 = ay6.m3838to(r7cVar.f48541k4.m4837m9(), f);
        c14366k4.m69936k4(r7cVar.f48541k4, this.f45970x1.getDefaultAsianFont());
        return new qy7(r7cVar.f48542kk, r7cVar.f48541k4, c14366k4.Clone(), fontData.m1485k4(), fontData.m1490x1(), fontData.m1488kk(), this.f45970x1.getDefaultAsianFont(), this.f45969to.Clone(), this.f45967k4, kg7Var, this.f45968kk.getTextFrameFormat().getEffective().getTextVerticalType());
    }

    /* JADX INFO: renamed from: k4 */
    public final qy7 m64358k4(kg7 kg7Var, byte b, r7c r7cVar, String str, float f) {
        return b != 1 ? b != 2 ? b != 3 ? b != 4 ? m64361k4(kg7Var, r7cVar, str, f) : m64367to(kg7Var, r7cVar, f) : m64366kk(kg7Var, r7cVar, f) : m64369x1(kg7Var, r7cVar, f) : m64360k4((kg7) null, r7cVar, f);
    }

    /* JADX INFO: renamed from: k4 */
    public final qy7 m64359k4(kg7 kg7Var, Portion portion, lrb lrbVar, FontData fontData, float f) {
        qy7.C14366k4 c14366k4 = new qy7.C14366k4();
        c14366k4.f48495k4 = fontData.getFontName();
        c14366k4.f48498x1 = ay6.m3838to(lrbVar.m4837m9(), f);
        c14366k4.m69936k4(lrbVar, this.f45970x1.getDefaultRegularFont());
        return new qy7(portion, lrbVar, c14366k4.Clone(), fontData.m1485k4(), fontData.m1490x1(), fontData.m1488kk(), this.f45970x1.getDefaultRegularFont(), this.f45969to.Clone(), this.f45967k4, kg7Var, this.f45968kk.getTextFrameFormat().getEffective().getTextVerticalType());
    }

    /* JADX INFO: renamed from: k4 */
    public final qy7 m64360k4(kg7 kg7Var, r7c r7cVar, float f) {
        IFontData eastAsianFont = r7cVar.f48542kk.getPortionFormat().getEastAsianFont();
        IFontData latinFont = r7cVar.f48542kk.getPortionFormat().getLatinFont();
        FontData fontData = (FontData) r7cVar.f48541k4.getLatinFont();
        byte bM1485k4 = fontData.m1485k4();
        if (eastAsianFont != null || (bM1485k4 != -128 && (bM1485k4 != 1 || latinFont == null || (!C14113y2.m67363du("+mn-ea", latinFont.getFontName()) && !C14113y2.m67363du("+mj-ea", latinFont.getFontName()))))) {
            fontData = (FontData) r7cVar.f48541k4.getEastAsianFont();
        }
        qy7.C14366k4 c14366k4 = new qy7.C14366k4();
        c14366k4.f48495k4 = fontData.getFontName();
        c14366k4.f48498x1 = ay6.m3838to(r7cVar.f48541k4.m4837m9(), f);
        c14366k4.m69936k4(r7cVar.f48541k4, this.f45970x1.getDefaultAsianFont());
        return new qy7(r7cVar.f48542kk, r7cVar.f48541k4, c14366k4.Clone(), fontData.m1485k4(), fontData.m1490x1(), fontData.m1488kk(), this.f45970x1.getDefaultAsianFont(), this.f45969to.Clone(), this.f45967k4, kg7Var, this.f45968kk.getTextFrameFormat().getEffective().getTextVerticalType());
    }

    /* JADX INFO: renamed from: k4 */
    public final qy7 m64361k4(kg7 kg7Var, r7c r7cVar, String str, float f) {
        if (str == null) {
            str = r7cVar.f48544x1;
        }
        return m64359k4(kg7Var, r7cVar.f48542kk, r7cVar.f48541k4, ay6.m3801k4(r7cVar, str), f);
    }

    /* JADX INFO: renamed from: k4 */
    public final qy7 m64362k4(nrw nrwVar, r7c r7cVar, float f) {
        FontData[] fontDataArr = {null};
        qy7.C14366k4 c14366k4Clone = m64357k4(nrwVar.f47603k4, r7cVar, f, fontDataArr).Clone();
        FontData fontData = fontDataArr[0];
        return new qy7(r7cVar.f48542kk, r7cVar.f48541k4, c14366k4Clone.Clone(), fontData.m1485k4(), fontData.m1490x1(), fontData.m1488kk(), this.f45970x1.getDefaultRegularFont(), this.f45969to.Clone(), this.f45967k4, null, this.f45968kk.getTextFrameFormat().getEffective().getTextVerticalType());
    }

    /* JADX INFO: renamed from: k4 */
    public final qy7 m64363k4(r7c r7cVar, byte b, char c, float f) {
        if (C14117yj.m67513ck(c)) {
            String languageId = r7cVar.f48541k4.getLanguageId();
            Fonts.C0421k4[] c0421k4Arr = {null};
            int i = !C14113y2.m67411k4(languageId) && Fonts.f2330x1.tryGetValue(languageId, c0421k4Arr) ? c0421k4Arr[0].f2342kk : 0;
            if (i == 1) {
                b = 1;
            } else if (i == 2) {
                b = 2;
            }
        }
        return b != 1 ? b != 2 ? b != 3 ? b != 4 ? m64361k4((kg7) null, r7cVar, (String) null, f) : m64367to(null, r7cVar, f) : m64366kk(null, r7cVar, f) : m64369x1(null, r7cVar, f) : m64360k4((kg7) null, r7cVar, f);
    }

    /* JADX INFO: renamed from: k4 */
    public final qy7 m64364k4(InterfaceC14631uf interfaceC14631uf, float f) {
        return m64365k4(interfaceC14631uf, new byte[]{0}, f);
    }

    /* JADX INFO: renamed from: k4 */
    public final qy7 m64365k4(InterfaceC14631uf interfaceC14631uf, byte[] bArr, float f) {
        bArr[0] = interfaceC14631uf.mo6451x1();
        return m64363k4(interfaceC14631uf.mo6446k4(), bArr[0], interfaceC14631uf.mo6448kk(), f);
    }
}
