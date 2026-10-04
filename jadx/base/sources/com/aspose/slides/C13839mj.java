package com.aspose.slides;

import com.aspose.slides.Fonts;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.mj */
/* JADX INFO: loaded from: classes3.dex */
final class C13839mj implements IFontsEffectiveData, InterfaceC14672vc {

    /* JADX INFO: renamed from: k4 */
    C1247ic f46241k4;

    /* JADX INFO: renamed from: kk */
    private C13839mj f46242kk = null;

    /* JADX INFO: renamed from: x1 */
    private Fonts f46243x1;

    public C13839mj(Fonts fonts) {
        this.f46243x1 = fonts;
        C1247ic c1247ic = new C1247ic();
        this.f46241k4 = c1247ic;
        if (fonts != null) {
            c1247ic.m7616k4(fonts.m1523k4());
        }
    }

    @Override // com.aspose.slides.IFontsEffectiveData
    public final IFontData getComplexScriptFont() {
        IFontData complexScriptFont;
        Fonts fonts = this.f46243x1;
        if (fonts != null && (complexScriptFont = fonts.getComplexScriptFont()) != null) {
            return complexScriptFont;
        }
        C13839mj c13839mj = this.f46242kk;
        if (c13839mj != null) {
            return c13839mj.getComplexScriptFont();
        }
        return null;
    }

    @Override // com.aspose.slides.IFontsEffectiveData
    public final IFontData getEastAsianFont() {
        IFontData eastAsianFont;
        Fonts fonts = this.f46243x1;
        if (fonts != null && (eastAsianFont = fonts.getEastAsianFont()) != null) {
            return eastAsianFont;
        }
        C13839mj c13839mj = this.f46242kk;
        if (c13839mj != null) {
            return c13839mj.getEastAsianFont();
        }
        return null;
    }

    @Override // com.aspose.slides.IFontsEffectiveData
    public final IFontData getLatinFont() {
        IFontData latinFont;
        Fonts fonts = this.f46243x1;
        if (fonts != null && (latinFont = fonts.getLatinFont()) != null) {
            return latinFont;
        }
        C13839mj c13839mj = this.f46242kk;
        if (c13839mj != null) {
            return c13839mj.getLatinFont();
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m64895k4(String str) {
        if (C14113y2.m67411k4(str)) {
            return null;
        }
        Fonts.C0421k4[] c0421k4Arr = {null};
        boolean zTryGetValue = Fonts.f2330x1.tryGetValue(str, c0421k4Arr);
        Fonts.C0421k4 c0421k4 = c0421k4Arr[0];
        if (!zTryGetValue) {
            return null;
        }
        String[] strArr = {null};
        boolean zTryGetValue2 = this.f46241k4.m7615k4().tryGetValue(c0421k4.f2343x1, strArr);
        String str2 = strArr[0];
        if (zTryGetValue2) {
            return str2;
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64896k4(C13839mj c13839mj, Fonts fonts) {
        this.f46243x1 = fonts;
        this.f46242kk = c13839mj;
        if (fonts != null) {
            this.f46241k4.m7616k4(fonts.m1523k4());
        } else if (c13839mj != null) {
            this.f46241k4.m7616k4(c13839mj.f46241k4);
        }
    }
}
