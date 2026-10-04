package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface ILayoutSlideCollection extends IGenericCollection<ILayoutSlide> {
    ILayoutSlide getByType(byte b);

    ILayoutSlide get_Item(int i);

    void remove(ILayoutSlide iLayoutSlide);

    void removeUnused();
}
