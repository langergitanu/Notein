package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IStringOrDoubleChartValue extends ISingleCellChartValue {
    double getAsLiteralDouble();

    String getAsLiteralString();

    void setAsLiteralDouble(double d);

    void setAsLiteralString(String str);

    double toDouble();
}
