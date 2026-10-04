package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IControlCollection extends IGenericCollection<IControl> {
    IControl addControl(int i, float f, float f2, float f3, float f4);

    void clear();

    IControl get_Item(int i);

    void remove(IControl iControl);

    void removeAt(int i);
}
