package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IModernComment extends IComment {
    IShape getShape();

    byte getStatus();

    int getTextSelectionLength();

    int getTextSelectionStart();

    void setStatus(byte b);

    void setTextSelectionLength(int i);

    void setTextSelectionStart(int i);
}
