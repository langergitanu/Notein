package com.aspose.slides;

import android.graphics.PointF;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public interface IComment {
    ICommentAuthor getAuthor();

    Date getCreatedTime();

    IComment getParentComment();

    PointF getPosition();

    ISlide getSlide();

    String getText();

    void remove();

    void setCreatedTime(Date date);

    void setParentComment(IComment iComment);

    void setPosition(PointF pointF);

    void setText(String str);
}
