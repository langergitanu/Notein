package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IRenderingOptions extends ISaveOptions {
    IInkOptions getInkOptions();

    @Deprecated
    INotesCommentsLayoutingOptions getNotesCommentsLayouting();

    ISlidesLayoutOptions getSlidesLayoutOptions();

    void setSlidesLayoutOptions(ISlidesLayoutOptions iSlidesLayoutOptions);
}
