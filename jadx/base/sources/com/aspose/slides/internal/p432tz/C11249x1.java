package com.aspose.slides.internal.p432tz;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p342pq.C9478du;
import com.aspose.slides.internal.p342pq.C9480kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.aspose.slides.internal.tz.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C11249x1 extends Hashtable {

    /* JADX INFO: renamed from: k4 */
    private Map f38804k4;

    /* JADX INFO: renamed from: x1 */
    private int f38805x1;

    public C11249x1(Map map) {
        this.f38804k4 = map;
        if (map instanceof Hashtable) {
            this.f38805x1 = ((Hashtable) map).getVersion();
        }
    }

    @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.IDictionary
    public void addItem(Object obj, Object obj2) {
        this.f38804k4.put(obj, obj2);
        this.f38805x1++;
    }

    @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.IDictionary
    public void clear() {
        this.f38804k4.clear();
        this.f38805x1++;
    }

    @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.IDictionary
    public boolean contains(Object obj) {
        return this.f38804k4.containsKey(obj);
    }

    @Override // com.aspose.slides.Collections.Hashtable, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f38804k4.containsKey(obj);
    }

    @Override // com.aspose.slides.Collections.Hashtable, java.util.Map
    public boolean containsValue(Object obj) {
        return this.f38804k4.containsValue(obj);
    }

    @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("array", "Array cannot be null");
        }
        if (abstractC14092to.m67277to() != 1) {
            throw new ArgumentException("Only single dimensional arrays are supported for the requested action");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("arrayIndex", "Non-negative number required");
        }
        if (abstractC14092to.m67265du() - i < size()) {
            throw new ArgumentException("Destination array is not long enough to copy all the items in the collection. Check array index and length");
        }
        for (Object obj : this.f38804k4.keySet()) {
            abstractC14092to.m67276kk(new DictionaryEntry(obj, this.f38804k4.get(obj)).clone(), i);
            i++;
        }
    }

    @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        java.util.Hashtable hashtable = new java.util.Hashtable(this.f38804k4.size());
        for (Object obj : this.f38804k4.keySet()) {
            hashtable.put(obj, this.f38804k4.get(obj));
        }
        return hashtable;
    }

    @Override // com.aspose.slides.Collections.Hashtable, java.util.Map
    public Set entrySet() {
        return this.f38804k4.entrySet();
    }

    @Override // com.aspose.slides.Collections.Hashtable, java.util.Map
    public Object get(Object obj) {
        return this.f38804k4.get(obj);
    }

    @Override // com.aspose.slides.Collections.Hashtable
    public IGenericEqualityComparer getEqualityComparer() {
        return null;
    }

    @Override // com.aspose.slides.Collections.Hashtable
    public int getHash(Object obj) {
        return this.f38804k4.hashCode();
    }

    @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.IDictionary
    public ICollection getKeys() {
        return new C11248to(this);
    }

    @Override // com.aspose.slides.Collections.Hashtable
    public void getObjectData(C9480kk c9480kk, C9478du c9478du) {
    }

    @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.ICollection
    public Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.IDictionary
    public ICollection getValues() {
        return new C11244h4(this);
    }

    @Override // com.aspose.slides.Collections.Hashtable
    public int getVersion() {
        Map map = this.f38804k4;
        return map instanceof Hashtable ? ((Hashtable) map).getVersion() : this.f38805x1;
    }

    @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.IDictionary
    public Object get_Item(Object obj) {
        return this.f38804k4.get(obj);
    }

    @Override // com.aspose.slides.Collections.Hashtable, java.util.Map
    public boolean isEmpty() {
        return this.f38804k4.size() == 0;
    }

    @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.IDictionary
    public boolean isFixedSize() {
        return false;
    }

    @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.IDictionary
    public boolean isReadOnly() {
        return false;
    }

    @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.ICollection
    public boolean isSynchronized() {
        return false;
    }

    @Override // com.aspose.slides.Collections.Hashtable, java.lang.Iterable
    public IDictionaryEnumerator iterator() {
        return new C11246kk(this);
    }

    @Override // com.aspose.slides.Collections.Hashtable
    public boolean keyEquals(Object obj, Object obj2) {
        return obj != null && obj.equals(obj2);
    }

    @Override // com.aspose.slides.Collections.Hashtable, java.util.Map
    public Set keySet() {
        return this.f38804k4.keySet();
    }

    @Override // com.aspose.slides.Collections.Hashtable
    public void onDeserialization(Object obj) {
    }

    @Override // com.aspose.slides.Collections.Hashtable, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f38805x1++;
        return this.f38804k4.put(obj, obj2);
    }

    @Override // com.aspose.slides.Collections.Hashtable, java.util.Map
    public void putAll(Map map) {
        this.f38804k4.putAll(map);
        this.f38805x1++;
    }

    @Override // com.aspose.slides.Collections.Hashtable, java.util.Map
    public Object remove(Object obj) {
        this.f38805x1++;
        return this.f38804k4.remove(obj);
    }

    @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.IDictionary
    public void removeItem(Object obj) {
        this.f38804k4.remove(obj);
    }

    @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.IDictionary
    public void set_Item(Object obj, Object obj2) {
        this.f38804k4.put(obj, obj2);
        this.f38805x1++;
    }

    @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.ICollection
    public int size() {
        return this.f38804k4.size();
    }

    @Override // com.aspose.slides.Collections.Hashtable, java.util.Map
    public Collection values() {
        return this.f38804k4.values();
    }
}
