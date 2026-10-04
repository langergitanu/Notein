package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: loaded from: classes3.dex */
public class StringCollection implements ICollection<String>, IEnumerable<String> {

    /* JADX INFO: renamed from: k4 */
    private ArrayList f1913k4 = new ArrayList();

    public int addItem(String str) {
        return this.f1913k4.addItem(str);
    }

    public void addRange(String[] strArr) {
        if (strArr == null) {
            throw new ArgumentNullException("value");
        }
        this.f1913k4.addRange(AbstractC14092to.m67208k4((Object) strArr));
    }

    public void clear() {
        this.f1913k4.clear();
    }

    public boolean contains(String str) {
        return this.f1913k4.contains(str);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        if (this.f1913k4.size() == 0) {
            return;
        }
        this.f1913k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public Object getSyncRoot() {
        return this;
    }

    public String get_Item(int i) {
        return (String) this.f1913k4.get_Item(i);
    }

    public int indexOf(String str) {
        return this.f1913k4.indexOf(str);
    }

    public void insertItem(int i, String str) {
        this.f1913k4.insertItem(i, str);
    }

    public boolean isReadOnly() {
        return false;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public IEnumerator iterator() {
        return this.f1913k4.iterator();
    }

    public void removeAt(int i) {
        this.f1913k4.removeAt(i);
    }

    public void removeItem(String str) {
        this.f1913k4.removeItem(str);
    }

    public void set_Item(int i, String str) {
        this.f1913k4.set_Item(i, str);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return this.f1913k4.size();
    }

    public void copyTo(String[] strArr, int i) {
        copyTo(AbstractC14092to.m67208k4((Object) strArr), i);
    }
}
