package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.IDictionaryEnumerator;

/* JADX INFO: loaded from: classes3.dex */
public interface IOrderedDictionary {
    Object get_Item(int i);

    void insert(int i, Object obj, Object obj2);

    IDictionaryEnumerator iterator();

    void removeAt(int i);

    void set_Item(int i, Object obj);
}
