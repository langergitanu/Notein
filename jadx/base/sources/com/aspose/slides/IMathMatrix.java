package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IMathMatrix extends IMathElement {
    void deleteColumn(int i);

    void deleteRow(int i);

    int getBaseJustification();

    int getColumnAlignment(int i);

    int getColumnCount();

    long getColumnGap();

    int getColumnGapRule();

    boolean getHidePlaceholders();

    long getMinColumnWidth();

    int getRowCount();

    long getRowGap();

    int getRowGapRule();

    IMathElement get_Item(int i, int i2);

    void insertColumnAfter(int i);

    void insertColumnBefore(int i);

    void insertRowAfter(int i);

    void insertRowBefore(int i);

    void setBaseJustification(int i);

    void setColumnAlignment(int i, int i2);

    void setColumnGap(long j);

    void setColumnGapRule(int i);

    void setColumnsAlignment(int i, long j, int i2);

    void setHidePlaceholders(boolean z);

    void setMinColumnWidth(long j);

    void setRowGap(long j);

    void setRowGapRule(int i);

    void set_Item(int i, int i2, IMathElement iMathElement);
}
