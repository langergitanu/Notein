package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.KeyValuePair;

/* JADX INFO: loaded from: classes3.dex */
public interface IControlPropertiesCollection extends IGenericEnumerable<KeyValuePair<String, String>> {
    void add(String str, String str2);

    void clear();

    int getCount();

    com.aspose.slides.Collections.Generic.IGenericCollection<String> getNamesOfProperties();

    String get_Item(String str);

    void remove(String str);

    void set_Item(String str, String str2);
}
