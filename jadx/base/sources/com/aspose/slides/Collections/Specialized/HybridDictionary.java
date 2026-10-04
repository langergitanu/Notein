package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.CaseInsensitiveComparer;
import com.aspose.slides.Collections.CaseInsensitiveHashCodeProvider;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IDictionary;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: loaded from: classes3.dex */
public class HybridDictionary implements ICollection, IDictionary {

    /* JADX INFO: renamed from: k4 */
    private boolean f1867k4;

    /* JADX INFO: renamed from: kk */
    private ListDictionary f1868kk;

    /* JADX INFO: renamed from: x1 */
    private Hashtable f1869x1;

    public HybridDictionary() {
        this(0, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public IDictionary m1029k4() {
        ListDictionary listDictionary = this.f1868kk;
        return listDictionary == null ? this.f1869x1 : listDictionary;
    }

    /* JADX INFO: renamed from: x1 */
    private void m1031x1() {
        this.f1869x1 = new Hashtable(this.f1868kk, this.f1867k4 ? CaseInsensitiveHashCodeProvider.getDefaultInvariant() : null, this.f1867k4 ? CaseInsensitiveComparer.getDefaultInvariant() : null);
        this.f1868kk.clear();
        this.f1868kk = null;
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public void addItem(Object obj, Object obj2) {
        m1029k4().addItem(obj, obj2);
        if (this.f1868kk == null || size() <= 10) {
            return;
        }
        m1031x1();
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public void clear() {
        m1029k4().clear();
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public boolean contains(Object obj) {
        return m1029k4().contains(obj);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        m1029k4().copyTo(abstractC14092to, i);
    }

    public IEnumerable getIEnumerable() {
        return new IEnumerable() { // from class: com.aspose.slides.Collections.Specialized.HybridDictionary.1
            @Override // java.lang.Iterable
            public IEnumerator iterator() {
                return HybridDictionary.this.m1029k4().iterator();
            }
        };
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public ICollection getKeys() {
        return m1029k4().getKeys();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public ICollection getValues() {
        return m1029k4().getValues();
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public Object get_Item(Object obj) {
        return m1029k4().get_Item(obj);
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public boolean isFixedSize() {
        return false;
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public boolean isReadOnly() {
        return false;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public IDictionaryEnumerator iterator() {
        return m1029k4().iterator();
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public void removeItem(Object obj) {
        m1029k4().removeItem(obj);
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public void set_Item(Object obj, Object obj2) {
        m1029k4().set_Item(obj, obj2);
        if (this.f1868kk == null || size() <= 10) {
            return;
        }
        m1031x1();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return m1029k4().size();
    }

    public HybridDictionary(int i) {
        this(i, false);
    }

    public HybridDictionary(int i, boolean z) {
        this.f1867k4 = z;
        CaseInsensitiveComparer defaultInvariant = z ? CaseInsensitiveComparer.getDefaultInvariant() : null;
        CaseInsensitiveHashCodeProvider defaultInvariant2 = z ? CaseInsensitiveHashCodeProvider.getDefaultInvariant() : null;
        if (i <= 10) {
            this.f1868kk = new ListDictionary(defaultInvariant);
        } else {
            this.f1869x1 = new Hashtable(i, defaultInvariant2, defaultInvariant);
        }
    }

    public HybridDictionary(boolean z) {
        this(0, z);
    }
}
