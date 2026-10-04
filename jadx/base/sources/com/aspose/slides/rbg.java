package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: loaded from: classes3.dex */
final class rbg<TKey, TValue> implements IGenericDictionary<TKey, TValue> {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<TKey, TValue> f48551k4;

    public rbg(Dictionary<TKey, TValue> dictionary) {
        if (dictionary == null) {
            throw new ArgumentNullException("implementation");
        }
        this.f48551k4 = dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    private IGenericDictionary<TKey, TValue> m70058k4() {
        return this.f48551k4;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void clear() {
        m70058k4().clear();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final boolean containsKey(TKey tkey) {
        if (tkey == null) {
            return false;
        }
        return m70058k4().containsKey(tkey);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final com.aspose.slides.Collections.Generic.IGenericCollection<TKey> getKeys() {
        return m70058k4().getKeys();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final com.aspose.slides.Collections.Generic.IGenericCollection<TValue> getValues() {
        return m70058k4().getValues();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final TValue get_Item(TKey tkey) {
        return m70058k4().get_Item(tkey);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean isReadOnly() {
        return m70058k4().isReadOnly();
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<KeyValuePair<TKey, TValue>> iterator() {
        return m70058k4().iterator();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public final boolean removeItem(KeyValuePair<TKey, TValue> keyValuePair) {
        return m70058k4().removeItem(keyValuePair.Clone());
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final boolean removeItemByKey(TKey tkey) {
        return m70058k4().removeItemByKey(tkey);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final void set_Item(TKey tkey, TValue tvalue) {
        m70058k4().set_Item(tkey, tvalue);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final int size() {
        return m70058k4().size();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final boolean tryGetValue(TKey tkey, Object[] objArr) {
        return m70058k4().tryGetValue(tkey, objArr);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final boolean containsItem(KeyValuePair<TKey, TValue> keyValuePair) {
        return m70058k4().containsItem(keyValuePair.Clone());
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final void addItem(TKey tkey, TValue tvalue) {
        m70058k4().addItem(tkey, tvalue);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final void addItem(KeyValuePair<TKey, TValue> keyValuePair) {
        m70058k4().addItem(keyValuePair.Clone());
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final void copyToTArray(KeyValuePair<TKey, TValue>[] keyValuePairArr, int i) {
        m70058k4().copyToTArray(keyValuePairArr, i);
    }
}
