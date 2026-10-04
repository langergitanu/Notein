package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IViewProperties {
    int getLastView();

    INormalViewProperties getNormalViewProperties();

    ICommonSlideViewProperties getNotesViewProperties();

    byte getShowComments();

    ICommonSlideViewProperties getSlideViewProperties();

    void setLastView(int i);

    void setShowComments(byte b);
}
