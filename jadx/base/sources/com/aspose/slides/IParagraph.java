package com.aspose.slides;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public interface IParagraph extends ISlideComponent {
    IPortionFormat getEndParagraphPortionFormat();

    int getLinesCount();

    IParagraphFormat getParagraphFormat();

    IPortionCollection getPortions();

    RectF getRect();

    String getText();

    void joinPortionsWithSameFormatting();

    void setEndParagraphPortionFormat(IPortionFormat iPortionFormat);

    void setText(String str);
}
