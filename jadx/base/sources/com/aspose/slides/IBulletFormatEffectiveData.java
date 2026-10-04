package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IBulletFormatEffectiveData {
    String getActualBulletValue();

    char getChar();

    IFillFormatEffectiveData getFillFormat();

    IFontData getFont();

    float getHeight();

    short getNumberedBulletStartWith();

    byte getNumberedBulletStyle();

    @Deprecated
    IPictureEffectiveData getPicture();

    byte getType();

    boolean isBulletHardColor();

    boolean isBulletHardFont();
}
