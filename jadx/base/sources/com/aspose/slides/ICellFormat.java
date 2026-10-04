package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ICellFormat {
    ILineFormat getBorderBottom();

    ILineFormat getBorderDiagonalDown();

    ILineFormat getBorderDiagonalUp();

    ILineFormat getBorderLeft();

    ILineFormat getBorderRight();

    ILineFormat getBorderTop();

    ICellFormatEffectiveData getEffective();

    IFillFormat getFillFormat();

    float getTransparency();

    void setTransparency(float f);
}
