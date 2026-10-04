package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ForEach;

/* JADX INFO: loaded from: classes3.dex */
public class Collect {
    public static IGenericEnumerable<Shape> shapes(Presentation presentation) {
        final List list = new List();
        ForEach.shape(presentation, new ForEach.ForEachShapeCallback() { // from class: com.aspose.slides.Collect.1
            @Override // com.aspose.slides.ForEach.ForEachShapeCallback
            public void invoke(Shape shape, BaseSlide baseSlide, int i) {
                list.addItem(shape);
            }
        });
        return list;
    }
}
