package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;

/* JADX INFO: loaded from: classes3.dex */
public interface ISequence extends IGenericEnumerable<IEffect> {
    IEffect addEffect(IChart iChart, int i, int i2, int i3, int i4, int i5);

    IEffect addEffect(IChart iChart, int i, int i2, int i3, int i4, int i5, int i6);

    IEffect addEffect(IParagraph iParagraph, int i, int i2, int i3);

    IEffect addEffect(IShape iShape, int i, int i2, int i3);

    void clear();

    int getCount();

    int getCount(IShape iShape);

    IEffect[] getEffectsByParagraph(IParagraph iParagraph);

    IEffect[] getEffectsByShape(IShape iShape);

    IShape getTriggerShape();

    IEffect get_Item(int i);

    void remove(IEffect iEffect);

    void removeAt(int i);

    void removeByShape(IShape iShape);

    void setTriggerShape(IShape iShape);
}
