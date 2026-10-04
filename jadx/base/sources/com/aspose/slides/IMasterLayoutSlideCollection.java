package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IMasterLayoutSlideCollection extends ILayoutSlideCollection {
    ILayoutSlide add(byte b, String str);

    ILayoutSlide addClone(ILayoutSlide iLayoutSlide);

    ILayoutSlide insert(int i, byte b, String str);

    ILayoutSlide insertClone(int i, ILayoutSlide iLayoutSlide);

    void removeAt(int i);

    void reorder(int i, ILayoutSlide iLayoutSlide);
}
