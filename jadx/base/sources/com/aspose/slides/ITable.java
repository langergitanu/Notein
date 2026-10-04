package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ITable extends IBulkTextFormattable, IGraphicalObject {
    IColumnCollection getColumns();

    boolean getFirstCol();

    boolean getFirstRow();

    boolean getHorizontalBanding();

    boolean getLastCol();

    boolean getLastRow();

    boolean getRightToLeft();

    IRowCollection getRows();

    int getStylePreset();

    ITableFormat getTableFormat();

    boolean getVerticalBanding();

    ICell get_Item(int i, int i2);

    ICell mergeCells(ICell iCell, ICell iCell2, boolean z);

    void setFirstCol(boolean z);

    void setFirstRow(boolean z);

    void setHorizontalBanding(boolean z);

    void setLastCol(boolean z);

    void setLastRow(boolean z);

    void setRightToLeft(boolean z);

    void setStylePreset(int i);

    void setVerticalBanding(boolean z);
}
