package com.aspose.slides;

import android.graphics.PointF;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;

/* JADX INFO: loaded from: classes3.dex */
public interface IMotionPath extends IGenericEnumerable<IMotionCmdPath> {
    IMotionCmdPath add(int i, PointF[] pointFArr, int i2, boolean z);

    void clear();

    int getCount();

    IMotionCmdPath get_Item(int i);

    void insert(int i, int i2, PointF[] pointFArr, int i3, boolean z);

    void remove(IMotionCmdPath iMotionCmdPath);

    void removeAt(int i);
}
