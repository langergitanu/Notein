package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IBulletFormat {
    void applyDefaultParagraphIndentsShifts();

    char getChar();

    IColorFormat getColor();

    IBulletFormatEffectiveData getEffective();

    IFontData getFont();

    float getHeight();

    short getNumberedBulletStartWith();

    byte getNumberedBulletStyle();

    ISlidesPicture getPicture();

    byte getType();

    byte isBulletHardColor();

    byte isBulletHardFont();

    void setBulletHardColor(byte b);

    void setBulletHardFont(byte b);

    void setChar(char c);

    void setFont(IFontData iFontData);

    void setHeight(float f);

    void setNumberedBulletStartWith(short s);

    void setNumberedBulletStyle(byte b);

    void setType(byte b);
}
