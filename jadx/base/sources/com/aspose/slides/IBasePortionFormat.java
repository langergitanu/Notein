package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IBasePortionFormat {
    String getAlternativeLanguageId();

    IFontData getComplexScriptFont();

    IFontData getEastAsianFont();

    IEffectFormat getEffectFormat();

    float getEscapement();

    IFillFormat getFillFormat();

    byte getFontBold();

    float getFontHeight();

    byte getFontItalic();

    byte getFontUnderline();

    IColorFormat getHighlightColor();

    float getKerningMinimalSize();

    byte getKumimoji();

    String getLanguageId();

    IFontData getLatinFont();

    ILineFormat getLineFormat();

    byte getNormaliseHeight();

    byte getProofDisabled();

    float getSpacing();

    byte getStrikethroughType();

    IFontData getSymbolFont();

    byte getTextCapType();

    IFillFormat getUnderlineFillFormat();

    ILineFormat getUnderlineLineFormat();

    byte isHardUnderlineFill();

    byte isHardUnderlineLine();

    void setAlternativeLanguageId(String str);

    void setComplexScriptFont(IFontData iFontData);

    void setEastAsianFont(IFontData iFontData);

    void setEscapement(float f);

    void setFontBold(byte b);

    void setFontHeight(float f);

    void setFontItalic(byte b);

    void setFontUnderline(byte b);

    void setHardUnderlineFill(byte b);

    void setHardUnderlineLine(byte b);

    void setKerningMinimalSize(float f);

    void setKumimoji(byte b);

    void setLanguageId(String str);

    void setLatinFont(IFontData iFontData);

    void setNormaliseHeight(byte b);

    void setProofDisabled(byte b);

    void setSpacing(float f);

    void setStrikethroughType(byte b);

    void setSymbolFont(IFontData iFontData);

    void setTextCapType(byte b);
}
