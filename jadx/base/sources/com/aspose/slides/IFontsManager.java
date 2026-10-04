package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;

/* JADX INFO: loaded from: classes3.dex */
public interface IFontsManager {
    void addEmbeddedFont(IFontData iFontData, int i);

    void addEmbeddedFont(byte[] bArr, int i);

    IFontData[] getEmbeddedFonts();

    IFontFallBackRulesCollection getFontFallBackRulesCollection();

    IFontSubstRuleCollection getFontSubstRuleList();

    IFontData[] getFonts();

    IGenericEnumerable<FontSubstitutionInfo> getSubstitutions();

    void removeEmbeddedFont(IFontData iFontData);

    void replaceFont(IFontData iFontData, IFontData iFontData2);

    void replaceFont(IFontSubstRule iFontSubstRule);

    void replaceFont(IFontSubstRuleCollection iFontSubstRuleCollection);

    void setFontFallBackRulesCollection(IFontFallBackRulesCollection iFontFallBackRulesCollection);

    void setFontSubstRuleList(IFontSubstRuleCollection iFontSubstRuleCollection);
}
