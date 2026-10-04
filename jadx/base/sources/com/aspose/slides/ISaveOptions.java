package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ISaveOptions {
    String getDefaultRegularFont();

    int getGradientStyle();

    IProgressCallback getProgressCallback();

    IWarningCallback getWarningCallback();

    void setDefaultRegularFont(String str);

    void setGradientStyle(int i);

    void setProgressCallback(IProgressCallback iProgressCallback);

    void setWarningCallback(IWarningCallback iWarningCallback);
}
