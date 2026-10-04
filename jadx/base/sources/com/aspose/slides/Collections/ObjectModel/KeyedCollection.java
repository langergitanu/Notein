package com.aspose.slides.Collections.ObjectModel;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.EqualityComparer;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.KeyNotFoundException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class KeyedCollection<TKey, TItem> extends Collection<TItem> {

    /* JADX INFO: renamed from: k4 */
    private Dictionary<TKey, TItem> f1819k4;

    /* JADX INFO: renamed from: kk */
    private int f1820kk;

    /* JADX INFO: renamed from: x1 */
    private IGenericEqualityComparer<TKey> f1821x1;

    public KeyedCollection() {
        this(null, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private int m1005k4(TKey tkey) {
        for (int size = size() - 1; size >= 0; size--) {
            if (this.f1821x1.equalsT(tkey, (TKey) getKeyForItem(super.get_Item(size)))) {
                return size;
            }
        }
        return -1;
    }

    public void changeItemKey(TItem titem, TKey tkey) {
        if (!containsItem(titem)) {
            throw new ArgumentException();
        }
        TKey keyForItem = getKeyForItem(titem);
        if (this.f1821x1.equalsT(keyForItem, tkey)) {
            return;
        }
        if (containsKey(tkey)) {
            throw new ArgumentException();
        }
        Dictionary<TKey, TItem> dictionary = this.f1819k4;
        if (dictionary != null) {
            if (!dictionary.removeItemByKey(keyForItem)) {
                throw new ArgumentException();
            }
            this.f1819k4.addItem(tkey, titem);
        }
    }

    @Override // com.aspose.slides.Collections.ObjectModel.Collection, com.aspose.slides.Collections.Generic.IGenericCollection
    public void clear() {
        Dictionary<TKey, TItem> dictionary = this.f1819k4;
        if (dictionary != null) {
            dictionary.clear();
        }
        super.clear();
    }

    public boolean containsKey(TKey tkey) {
        Dictionary<TKey, TItem> dictionary = this.f1819k4;
        return dictionary != null ? dictionary.containsKey(tkey) : m1005k4(tkey) >= 0;
    }

    public IGenericEqualityComparer<TKey> getComparer() {
        return this.f1821x1;
    }

    public IGenericDictionary<TKey, TItem> getDictionary() {
        return this.f1819k4;
    }

    public abstract TKey getKeyForItem(TItem titem);

    @Override // com.aspose.slides.Collections.ObjectModel.Collection, com.aspose.slides.Collections.Generic.IGenericList
    public TItem get_Item(int i) {
        Dictionary<TKey, TItem> dictionary = this.f1819k4;
        if (dictionary == null || dictionary.getKeys().size() <= 0) {
            return (TItem) super.get_Item(i);
        }
        Dictionary.KeyCollection.Enumerator<TKey, TItem> it = this.f1819k4.getKeys().iterator();
        return (it.hasNext() && (it.next() instanceof Integer)) ? get_Item(Integer.valueOf(i)) : (TItem) super.get_Item(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.Collections.ObjectModel.Collection, com.aspose.slides.Collections.Generic.IGenericList
    public void insertItem(int i, TItem titem) {
        Object keyForItem = getKeyForItem(titem);
        if (keyForItem == null) {
            throw new ArgumentNullException("GetKeyForItem(item)");
        }
        Dictionary<TKey, TItem> dictionary = this.f1819k4;
        if (dictionary != null && dictionary.containsKey((TKey) keyForItem)) {
            throw new ArgumentException("An element with the same key already exists in the dictionary.");
        }
        if (this.f1819k4 == null) {
            for (int i2 = 0; i2 < size(); i2++) {
                if (this.f1821x1.equalsT((TKey) keyForItem, (TKey) getKeyForItem(super.get_Item(i2)))) {
                    throw new ArgumentException("An element with the same key already exists in the dictionary.");
                }
            }
        }
        super.insertItem(i, titem);
        Dictionary<TKey, TItem> dictionary2 = this.f1819k4;
        if (dictionary2 != null) {
            dictionary2.addItem((TKey) keyForItem, titem);
            return;
        }
        if (this.f1820kk == -1 || size() <= this.f1820kk) {
            return;
        }
        this.f1819k4 = new Dictionary<>(this.f1821x1);
        for (int i3 = 0; i3 < size(); i3++) {
            Object obj = super.get_Item(i3);
            this.f1819k4.addItem((TKey) getKeyForItem(obj), (TItem) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.Collections.ObjectModel.Collection, com.aspose.slides.Collections.Generic.IGenericList
    public void removeAt(int i) {
        if (this.f1819k4 != null) {
            this.f1819k4.removeItemByKey((TKey) getKeyForItem(super.get_Item(i)));
        }
        super.removeAt(i);
    }

    public boolean removeByKey(TKey tkey) {
        Dictionary<TKey, TItem> dictionary = this.f1819k4;
        if (dictionary == null) {
            int iM1005k4 = m1005k4(tkey);
            if (iM1005k4 == -1) {
                return false;
            }
            removeAt(iM1005k4);
            return true;
        }
        Object[] objArr = {null};
        boolean zTryGetValue = dictionary.tryGetValue(tkey, objArr);
        Object obj = objArr[0];
        if (zTryGetValue) {
            return super.removeItem(obj);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.Collections.ObjectModel.Collection
    public void setItem(int i, TItem titem) {
        Dictionary<TKey, TItem> dictionary = this.f1819k4;
        if (dictionary != null) {
            dictionary.removeItemByKey((TKey) getKeyForItem(super.get_Item(i)));
            this.f1819k4.addItem((TKey) getKeyForItem(titem), titem);
        }
        super.setItem(i, titem);
    }

    public KeyedCollection(IGenericEqualityComparer<TKey> iGenericEqualityComparer) {
        this(iGenericEqualityComparer, 0);
    }

    public TItem get_Item(TKey tkey) {
        Dictionary<TKey, TItem> dictionary = this.f1819k4;
        if (dictionary != null) {
            return dictionary.get_Item(tkey);
        }
        int iM1005k4 = m1005k4(tkey);
        if (iM1005k4 >= 0) {
            return (TItem) super.get_Item(iM1005k4);
        }
        throw new KeyNotFoundException();
    }

    public KeyedCollection(IGenericEqualityComparer<TKey> iGenericEqualityComparer, int i) {
        this.f1821x1 = iGenericEqualityComparer == null ? new EqualityComparer.DefaultComparer<>() : iGenericEqualityComparer;
        this.f1820kk = i;
        if (i == 0) {
            this.f1819k4 = new Dictionary<>(this.f1821x1);
        }
    }
}
