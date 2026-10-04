package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IGradientStopCollection extends IGenericCollection<IGradientStop> {
    IGradientStop add(float f, Integer num);

    IGradientStop addPresetColor(float f, int i);

    IGradientStop addSchemeColor(float f, int i);

    void clear();

    IGradientStop get_Item(int i);

    void insert(int i, float f, Integer num);

    void insertPresetColor(int i, float f, int i2);

    void insertSchemeColor(int i, float f, int i2);

    void removeAt(int i);
}
