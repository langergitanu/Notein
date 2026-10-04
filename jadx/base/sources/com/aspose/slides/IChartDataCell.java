package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IChartDataCell {
    void calculate(boolean z);

    IChartDataWorksheet getChartDataWorksheet();

    int getColumn();

    String getCustomNumberFormat();

    String getFormula();

    byte getPresetNumberFormat();

    String getR1C1Formula();

    int getRow();

    Object getValue();

    boolean isHidden();

    void setCustomNumberFormat(String str);

    void setFormula(String str);

    void setPresetNumberFormat(byte b);

    void setR1C1Formula(String str);

    void setValue(Object obj);
}
