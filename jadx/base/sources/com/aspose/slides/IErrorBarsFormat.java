package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IErrorBarsFormat extends IChartComponent {
    IFormat getFormat();

    int getType();

    float getValue();

    int getValueType();

    boolean hasEndCap();

    boolean isVisible();

    void setEndCap(boolean z);

    void setFormat(IFormat iFormat);

    void setType(int i);

    void setValue(float f);

    void setValueType(int i);

    void setVisible(boolean z);
}
