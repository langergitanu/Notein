package com.aspose.slides;

import com.aspose.slides.Collections.Generic.KeyValuePair;

/* JADX INFO: loaded from: classes3.dex */
public interface ITagCollection extends IGenericCollection<KeyValuePair<String, String>> {
    int add(String str, String str2);

    void clear();

    boolean contains(String str);

    String getNameByIndex(int i);

    String[] getNamesOfTags();

    String getValueByIndex(int i);

    String get_Item(String str);

    int indexOfName(String str);

    void remove(String str);

    void removeAt(int i);

    void set_Item(String str, String str2);
}
