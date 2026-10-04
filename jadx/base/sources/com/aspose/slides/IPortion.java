package com.aspose.slides;

import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public interface IPortion extends ISlideComponent {
    void addField(IFieldType iFieldType);

    void addField(String str);

    PointF getCoordinates();

    IField getField();

    IPortionFormat getPortionFormat();

    RectF getRect();

    String getText();

    void removeField();

    void setText(String str);
}
