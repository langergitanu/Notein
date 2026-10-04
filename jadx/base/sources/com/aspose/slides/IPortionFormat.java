package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IPortionFormat extends IBasePortionFormat, IHyperlinkContainer {
    String getBookmarkId();

    IPortionFormatEffectiveData getEffective();

    boolean getSmartTagClean();

    void setBookmarkId(String str);

    void setSmartTagClean(boolean z);
}
