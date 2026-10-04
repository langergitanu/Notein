package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ITrendline extends IOverridableText {
    double getBackward();

    boolean getDisplayEquation();

    boolean getDisplayRSquaredValue();

    IFormat getFormat();

    double getForward();

    double getIntercept();

    byte getOrder();

    byte getPeriod();

    ILegendEntryProperties getRelatedLegendEntry();

    String getTrendlineName();

    int getTrendlineType();

    void setBackward(double d);

    void setDisplayEquation(boolean z);

    void setDisplayRSquaredValue(boolean z);

    void setFormat(IFormat iFormat);

    void setForward(double d);

    void setIntercept(double d);

    void setOrder(byte b);

    void setPeriod(byte b);

    void setTrendlineName(String str);

    void setTrendlineType(int i);
}
