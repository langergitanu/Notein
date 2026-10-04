package com.aspose.slides.Collections.Generic;

/* JADX INFO: loaded from: classes3.dex */
public interface IGenericDictionary<TKey, TValue> extends IGenericCollection<KeyValuePair<TKey, TValue>> {
    void addItem(TKey tkey, TValue tvalue);

    boolean containsKey(TKey tkey);

    IGenericCollection<TKey> getKeys();

    IGenericCollection<TValue> getValues();

    TValue get_Item(TKey tkey);

    boolean removeItemByKey(TKey tkey);

    void set_Item(TKey tkey, TValue tvalue);

    boolean tryGetValue(TKey tkey, Object[] objArr);
}
