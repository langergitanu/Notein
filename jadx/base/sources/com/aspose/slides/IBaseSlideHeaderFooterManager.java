package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IBaseSlideHeaderFooterManager extends IBaseHeaderFooterManager {
    boolean isDateTimeVisible();

    boolean isFooterVisible();

    boolean isSlideNumberVisible();

    void setDateTimeText(String str);

    void setDateTimeVisibility(boolean z);

    void setFooterText(String str);

    void setFooterVisibility(boolean z);

    void setSlideNumberVisibility(boolean z);
}
