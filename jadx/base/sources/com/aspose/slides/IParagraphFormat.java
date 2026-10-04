package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IParagraphFormat {
    int getAlignment();

    IBulletFormat getBullet();

    IPortionFormat getDefaultPortionFormat();

    float getDefaultTabSize();

    short getDepth();

    byte getEastAsianLineBreak();

    IParagraphFormatEffectiveData getEffective();

    int getFontAlignment();

    byte getHangingPunctuation();

    float getIndent();

    byte getLatinLineBreak();

    float getMarginLeft();

    float getMarginRight();

    byte getRightToLeft();

    float getSpaceAfter();

    float getSpaceBefore();

    float getSpaceWithin();

    ITabCollection getTabs();

    void setAlignment(int i);

    void setDefaultTabSize(float f);

    void setDepth(short s);

    void setEastAsianLineBreak(byte b);

    void setFontAlignment(int i);

    void setHangingPunctuation(byte b);

    void setIndent(float f);

    void setLatinLineBreak(byte b);

    void setMarginLeft(float f);

    void setMarginRight(float f);

    void setRightToLeft(byte b);

    void setSpaceAfter(float f);

    void setSpaceBefore(float f);

    void setSpaceWithin(float f);
}
