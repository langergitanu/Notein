package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ICell extends ISlideComponent {
    boolean getAnchorCenter();

    ICellFormat getCellFormat();

    int getColSpan();

    IColumn getFirstColumn();

    int getFirstColumnIndex();

    IRow getFirstRow();

    int getFirstRowIndex();

    double getHeight();

    double getMarginBottom();

    double getMarginLeft();

    double getMarginRight();

    double getMarginTop();

    double getMinimalHeight();

    double getOffsetX();

    double getOffsetY();

    int getRowSpan();

    ITable getTable();

    byte getTextAnchorType();

    ITextFrame getTextFrame();

    byte getTextVerticalType();

    double getWidth();

    boolean isMergedCell();

    void setAnchorCenter(boolean z);

    void setMarginBottom(double d);

    void setMarginLeft(double d);

    void setMarginRight(double d);

    void setMarginTop(double d);

    void setTextAnchorType(byte b);

    void setTextVerticalType(byte b);

    void splitByColSpan(int i);

    void splitByHeight(double d);

    void splitByRowSpan(int i);

    void splitByWidth(double d);
}
