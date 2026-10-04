package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10497jm;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes3.dex */
public final class FontData implements IFontData {

    /* JADX INFO: renamed from: du */
    private byte[] f2295du;

    /* JADX INFO: renamed from: k4 */
    private String f2296k4;

    /* JADX INFO: renamed from: kk */
    private int f2297kk;

    /* JADX INFO: renamed from: to */
    private byte f2298to;

    /* JADX INFO: renamed from: x1 */
    private byte f2299x1;

    public FontData(FontData fontData) {
        this(fontData, fontData.f2296k4);
    }

    /* JADX INFO: renamed from: du */
    public static FontData m1484du() {
        return (FontData) C1143gg.m6638x1().m64802k4(65535).m70073x1();
    }

    public boolean equals(Object obj) {
        return m1487k4((FontData) C7019kk.m27452k4(obj, FontData.class), false);
    }

    @Override // com.aspose.slides.IFontData
    public final String getFontName() {
        return this.f2296k4;
    }

    public int hashCode() {
        return this.f2296k4.hashCode();
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m1485k4() {
        return this.f2298to;
    }

    /* JADX INFO: renamed from: kk */
    public final byte[] m1488kk() {
        return this.f2295du;
    }

    /* JADX INFO: renamed from: to */
    public final int m1489to() {
        return this.f2297kk;
    }

    public String toString() {
        return getFontName();
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m1490x1() {
        return this.f2299x1;
    }

    public FontData(FontData fontData, int i) {
        this(fontData);
        this.f2297kk = i;
    }

    @Override // com.aspose.slides.IFontData
    public final String getFontName(IThemeEffectiveData iThemeEffectiveData) {
        IFontsEffectiveData major;
        IFontData complexScriptFont;
        String str = this.f2296k4;
        if (str == null || str.length() != 6 || this.f2296k4.charAt(0) != '+' || iThemeEffectiveData == null) {
            return this.f2296k4;
        }
        if (C14113y2.m67375k4(this.f2296k4, 1, "mn-", 0, 3) == 0) {
            major = iThemeEffectiveData.getFontScheme().getMinor();
        } else {
            if (C14113y2.m67375k4(this.f2296k4, 1, "mj-", 0, 3) != 0) {
                return this.f2296k4;
            }
            major = iThemeEffectiveData.getFontScheme().getMajor();
        }
        String str2 = this.f2296k4;
        if (str2 == null || str2.length() <= 5 || C14113y2.m67375k4(this.f2296k4, 4, TranslateLanguage.LITHUANIAN, 0, 2) != 0) {
            String str3 = this.f2296k4;
            if (str3 == null || str3.length() <= 5 || C14113y2.m67375k4(this.f2296k4, 4, "ea", 0, 2) != 0) {
                String str4 = this.f2296k4;
                if (str4 == null || str4.length() <= 5 || C14113y2.m67375k4(this.f2296k4, 4, TranslateLanguage.CZECH, 0, 2) != 0) {
                    return this.f2296k4;
                }
                complexScriptFont = major.getComplexScriptFont();
            } else {
                complexScriptFont = major.getEastAsianFont();
            }
        } else {
            complexScriptFont = major.getLatinFont();
        }
        return complexScriptFont.getFontName();
    }

    /* JADX INFO: renamed from: k4 */
    public final FontData m1486k4(IThemeEffectiveData iThemeEffectiveData) {
        IFontsEffectiveData major;
        IFontData complexScriptFont;
        String str = this.f2296k4;
        if (str != null && str.length() == 6 && this.f2296k4.charAt(0) == '+' && iThemeEffectiveData != null) {
            if (C14113y2.m67375k4(this.f2296k4, 1, "mn-", 0, 3) == 0) {
                major = iThemeEffectiveData.getFontScheme().getMinor();
            } else if (C14113y2.m67375k4(this.f2296k4, 1, "mj-", 0, 3) == 0) {
                major = iThemeEffectiveData.getFontScheme().getMajor();
            }
            String str2 = this.f2296k4;
            if (str2 == null || str2.length() <= 5 || C14113y2.m67375k4(this.f2296k4, 4, TranslateLanguage.LITHUANIAN, 0, 2) != 0) {
                String str3 = this.f2296k4;
                if (str3 == null || str3.length() <= 5 || C14113y2.m67375k4(this.f2296k4, 4, "ea", 0, 2) != 0) {
                    String str4 = this.f2296k4;
                    if (str4 != null && str4.length() > 5 && C14113y2.m67375k4(this.f2296k4, 4, TranslateLanguage.CZECH, 0, 2) == 0) {
                        complexScriptFont = major.getComplexScriptFont();
                    }
                } else {
                    complexScriptFont = major.getEastAsianFont();
                }
            } else {
                complexScriptFont = major.getLatinFont();
            }
            return (FontData) complexScriptFont;
        }
        return this;
    }

    public FontData(FontData fontData, String str) {
        this.f2298to = (byte) 1;
        this.f2295du = null;
        this.f2296k4 = str;
        this.f2299x1 = fontData.m1490x1();
        this.f2297kk = fontData.f2297kk;
        this.f2298to = fontData.m1485k4();
        this.f2295du = fontData.f2295du;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m1487k4(FontData fontData, boolean z) {
        boolean z2 = false;
        if (fontData == null) {
            return false;
        }
        boolean zM13090k4 = C3085sv.m13090k4(getFontName(), fontData.getFontName());
        if (!z && (getFontName() != null || fontData.getFontName() != null)) {
            return zM13090k4;
        }
        if (C3085sv.m13089k4(m1490x1() & 255, fontData.m1490x1() & 255) && C3085sv.m13089k4(m1485k4() & 255, fontData.m1485k4() & 255)) {
            z2 = true;
        }
        return zM13090k4 & z2;
    }

    public FontData(FontData fontData, String str, byte b) {
        this.f2295du = null;
        this.f2296k4 = str;
        this.f2298to = b;
        this.f2299x1 = fontData.m1490x1();
        this.f2297kk = fontData.f2297kk;
        this.f2295du = fontData.f2295du;
    }

    public FontData(String str) {
        this.f2298to = (byte) 1;
        this.f2295du = null;
        this.f2296k4 = str;
    }

    public FontData(String str, byte b) {
        this.f2295du = null;
        this.f2296k4 = str;
        this.f2298to = b;
    }

    public FontData(String str, byte b, byte b2) {
        this.f2295du = null;
        this.f2296k4 = str;
        this.f2298to = b;
        this.f2299x1 = b2;
    }

    public FontData(String str, byte b, byte b2, int i, byte[] bArr) {
        this.f2296k4 = str;
        this.f2298to = b;
        this.f2299x1 = b2;
        this.f2297kk = i;
        this.f2295du = bArr;
    }

    public FontData(String str, C10497jm c10497jm) {
        this(str, c10497jm.m51023kk(), (byte) ((c10497jm.m51019du() & 255) | (c10497jm.m51020h4() & 255)));
    }
}
