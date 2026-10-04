package com.aspose.slides;

import android.graphics.PointF;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public interface ICommentCollection extends IGenericCollection<IComment> {
    IComment addComment(String str, ISlide iSlide, PointF pointF, Date date);

    IModernComment addModernComment(String str, ISlide iSlide, IShape iShape, PointF pointF, Date date);

    void clear();

    IComment get_Item(int i);

    IComment insertComment(int i, String str, ISlide iSlide, PointF pointF, Date date);

    IModernComment insertModernComment(int i, String str, ISlide iSlide, IShape iShape, PointF pointF, Date date);

    void remove(IComment iComment);

    void removeAt(int i);

    IComment[] toArray();

    IComment[] toArray(int i, int i2);
}
