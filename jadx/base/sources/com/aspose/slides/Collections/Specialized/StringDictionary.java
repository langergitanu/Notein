package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class StringDictionary implements IEnumerable {

    /* JADX INFO: renamed from: k4 */
    private Hashtable f1914k4 = new Hashtable();

    public void add(String str, String str2) {
        if (str == null) {
            throw new ArgumentNullException("key");
        }
        this.f1914k4.addItem(C14113y2.m67398k4(str, C11697x1.m55250kk()), str2);
    }

    public void clear() {
        this.f1914k4.clear();
    }

    public boolean containsKey(String str) {
        if (str != null) {
            return this.f1914k4.containsKey(C14113y2.m67398k4(str, C11697x1.m55250kk()));
        }
        throw new ArgumentNullException("key");
    }

    public boolean containsValue(String str) {
        return this.f1914k4.containsValue(str);
    }

    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f1914k4.copyTo(abstractC14092to, i);
    }

    public int getCount() {
        return this.f1914k4.size();
    }

    public ICollection getKeys() {
        return this.f1914k4.getKeys();
    }

    public Object getSyncRoot() {
        return this.f1914k4.getSyncRoot();
    }

    public ICollection getValues() {
        return this.f1914k4.getValues();
    }

    public String get_Item(String str) {
        if (str != null) {
            return (String) this.f1914k4.get_Item(C14113y2.m67398k4(str, C11697x1.m55250kk()));
        }
        throw new ArgumentNullException("key");
    }

    public boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public IEnumerator iterator() {
        return this.f1914k4.iterator();
    }

    public void remove(String str) {
        if (str == null) {
            throw new ArgumentNullException("key");
        }
        this.f1914k4.removeItem(C14113y2.m67398k4(str, C11697x1.m55250kk()));
    }

    public void set_Item(String str, String str2) {
        if (str == null) {
            throw new ArgumentNullException("key");
        }
        this.f1914k4.set_Item(C14113y2.m67398k4(str, C11697x1.m55250kk()), str2);
    }
}
