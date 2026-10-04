package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IColorOperationCollection extends IGenericCloneable<IColorOperationCollection>, IGenericCollection<IColorOperation> {
    IColorOperation add(int i);

    IColorOperation add(int i, float f);

    void clear();

    IColorOperation get_Item(int i);

    IColorOperation insert(int i, int i2);

    IColorOperation insert(int i, int i2, float f);

    void removeAt(int i);

    void set_Item(int i, IColorOperation iColorOperation);
}
