package com.aspose.slides;

/* JADX INFO: loaded from: classes3.dex */
public interface IFontFallBackRule {
    void addFallBackFonts(String str);

    void addFallBackFonts(String[] strArr);

    void clear();

    int getCount();

    long getRangeEndIndex();

    long getRangeStartIndex();

    String get_Item(int i);

    int indexOf(String str);

    void remove(String str);

    void removeAt(int i);

    String[] toArray();

    String[] toArray(int i, int i2);
}
