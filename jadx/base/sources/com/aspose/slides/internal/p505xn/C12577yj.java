package com.aspose.slides.internal.p505xn;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericCollection;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.KeyNotFoundException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.xn.yj */
/* JADX INFO: loaded from: classes5.dex */
public class C12577yj<TKey, TValue> implements IGenericDictionary<TKey, TValue> {

    /* JADX INFO: renamed from: k4 */
    private Class<TKey> f42092k4;

    /* JADX INFO: renamed from: kk */
    private final List<KeyValuePair<TKey, TValue>> f42093kk;

    /* JADX INFO: renamed from: to */
    private final Dictionary<TKey, Integer> f42094to;

    /* JADX INFO: renamed from: x1 */
    private Class<TValue> f42095x1;

    public C12577yj(Class<TKey> cls, Class<TValue> cls2) {
        this(cls, cls2, null, null);
    }

    /* JADX INFO: renamed from: k4 */
    private void m58709k4() {
        C6005k4.m24261k4(this.f42093kk.size() == this.f42094to.size());
        for (int i = 0; i < this.f42093kk.size(); i++) {
            this.f42094to.set_Item(this.f42093kk.get_Item(i).getKey(), Integer.valueOf(i));
        }
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final void clear() {
        this.f42093kk.clear();
        this.f42094to.clear();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final boolean containsKey(TKey tkey) {
        m58710k4(tkey);
        return this.f42094to.containsKey(tkey);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final IGenericCollection<TKey> getKeys() {
        return this.f42094to.getKeys();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final IGenericCollection<TValue> getValues() {
        Object[] objArr = new Object[this.f42093kk.size()];
        for (int i = 0; i < this.f42093kk.size(); i++) {
            objArr[i] = this.f42093kk.get_Item(i).getValue();
        }
        return AbstractC14092to.m67204k4(objArr);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final TValue get_Item(TKey tkey) {
        m58710k4(tkey);
        Integer[] numArr = {0};
        boolean zTryGetValue = this.f42094to.tryGetValue(tkey, numArr);
        int iIntValue = numArr[0].intValue();
        if (zTryGetValue) {
            return this.f42093kk.get_Item(iIntValue).getValue();
        }
        throw new KeyNotFoundException(C14113y2.m67402k4("The '{0}' was not found", tkey));
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean isReadOnly() {
        throw new NotImplementedException();
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<KeyValuePair<TKey, TValue>> iterator() {
        return this.f42093kk.iterator();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public final boolean removeItem(KeyValuePair<TKey, TValue> keyValuePair) {
        Integer[] numArr = {0};
        boolean z = this.f42094to.tryGetValue(keyValuePair.getKey(), numArr) && this.f42093kk.get_Item(numArr[0].intValue()).getValue().equals(keyValuePair.getValue());
        int iIntValue = numArr[0].intValue();
        if (!z) {
            return false;
        }
        this.f42093kk.removeAt(iIntValue);
        this.f42094to.removeItemByKey(keyValuePair.getKey());
        m58709k4();
        return true;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final boolean removeItemByKey(TKey tkey) {
        m58710k4(tkey);
        Integer[] numArr = {0};
        boolean zTryGetValue = this.f42094to.tryGetValue(tkey, numArr);
        int iIntValue = numArr[0].intValue();
        if (!zTryGetValue) {
            return false;
        }
        this.f42093kk.removeAt(iIntValue);
        this.f42094to.removeItemByKey(tkey);
        m58709k4();
        return true;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final void set_Item(TKey tkey, TValue tvalue) {
        m58710k4(tkey);
        Integer[] numArr = {0};
        boolean zTryGetValue = this.f42094to.tryGetValue(tkey, numArr);
        int iIntValue = numArr[0].intValue();
        if (zTryGetValue) {
            this.f42093kk.set_Item(iIntValue, new KeyValuePair<>(tkey, tvalue));
        } else {
            this.f42093kk.addItem(new KeyValuePair<>(tkey, tvalue));
            this.f42094to.addItem(tkey, Integer.valueOf(this.f42093kk.size() - 1));
        }
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public final int size() {
        return this.f42093kk.size();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final boolean tryGetValue(TKey tkey, Object[] objArr) {
        m58710k4(tkey);
        Integer[] numArr = {0};
        boolean zTryGetValue = this.f42094to.tryGetValue(tkey, numArr);
        int iIntValue = numArr[0].intValue();
        if (zTryGetValue) {
            objArr[0] = this.f42093kk.get_Item(iIntValue).getValue();
            return true;
        }
        objArr[0] = C7019kk.m27467x1((Class) this.f42095x1);
        return false;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public final boolean containsItem(KeyValuePair<TKey, TValue> keyValuePair) {
        return this.f42093kk.containsItem(keyValuePair.Clone());
    }

    public C12577yj(Class<TKey> cls, Class<TValue> cls2, C12577yj<TKey, TValue> c12577yj, IGenericEqualityComparer<TKey> iGenericEqualityComparer) {
        this.f42092k4 = cls;
        this.f42095x1 = cls2;
        this.f42093kk = c12577yj != null ? new List<>(c12577yj.f42093kk) : new List<>();
        this.f42094to = c12577yj != null ? new Dictionary<>(c12577yj.f42094to, iGenericEqualityComparer) : new Dictionary<>(iGenericEqualityComparer);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericDictionary
    public final void addItem(TKey tkey, TValue tvalue) {
        m58710k4(tkey);
        if (containsKey(tkey)) {
            throw new ArgumentException("An element with the same key already exists");
        }
        this.f42093kk.addItem(new KeyValuePair<>(tkey, tvalue));
        this.f42094to.addItem(tkey, Integer.valueOf(this.f42093kk.size() - 1));
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final void addItem(KeyValuePair<TKey, TValue> keyValuePair) {
        addItem(keyValuePair.getKey(), keyValuePair.getValue());
    }

    /* JADX INFO: renamed from: k4 */
    private static <TKey> void m58710k4(TKey tkey) {
        if (tkey == null) {
            throw new ArgumentNullException("Key cannot be null");
        }
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final void copyToTArray(KeyValuePair<TKey, TValue>[] keyValuePairArr, int i) {
        throw new NotImplementedException();
    }
}
