package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public final class TagCollection implements ITagCollection {

    /* JADX INFO: renamed from: k4 */
    private final SortedList<String, String> f3501k4 = new SortedList<>();

    @Override // com.aspose.slides.ITagCollection
    public final int add(String str, String str2) {
        if (str == null) {
            throw new ArgumentNullException("name");
        }
        String strM67358c5 = C14113y2.m67358c5(str);
        if (m2883k4().containsKey(strM67358c5)) {
            m2883k4().set_Item(strM67358c5, str2);
        } else {
            m2883k4().addItem(strM67358c5, str2);
        }
        return m2883k4().indexOfKey(strM67358c5);
    }

    @Override // com.aspose.slides.ITagCollection
    public final void clear() {
        m2883k4().clear();
    }

    @Override // com.aspose.slides.ITagCollection
    public final boolean contains(String str) {
        if (str == null) {
            throw new ArgumentNullException("name");
        }
        return m2883k4().containsKey(C14113y2.m67358c5(str));
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        m2883k4().copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.ITagCollection
    public final String getNameByIndex(int i) {
        return m2883k4().getKeys().get_Item(i);
    }

    @Override // com.aspose.slides.ITagCollection
    public final String[] getNamesOfTags() {
        String[] strArr = new String[m2883k4().getKeys().size()];
        m2883k4().getKeys().copyToTArray(strArr, 0);
        return strArr;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.ITagCollection
    public final String getValueByIndex(int i) {
        return m2883k4().getValues().get_Item(i);
    }

    @Override // com.aspose.slides.ITagCollection
    public final String get_Item(String str) {
        if (str == null) {
            throw new ArgumentNullException("name");
        }
        String[] strArr = {null};
        m2883k4().tryGetValue(C14113y2.m67358c5(str), strArr);
        return strArr[0];
    }

    @Override // com.aspose.slides.ITagCollection
    public final int indexOfName(String str) {
        if (str == null) {
            throw new ArgumentNullException("name");
        }
        return m2883k4().indexOfKey(C14113y2.m67358c5(str));
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<KeyValuePair<String, String>> iterator() {
        return m2883k4().iterator();
    }

    @Override // com.aspose.slides.IGenericCollection
    public final IGenericEnumerator<KeyValuePair<String, String>> iteratorJava() {
        return m2883k4().iteratorJava();
    }

    /* JADX INFO: renamed from: k4 */
    public final SortedList<String, String> m2883k4() {
        return this.f3501k4;
    }

    @Override // com.aspose.slides.ITagCollection
    public final void remove(String str) {
        if (str == null) {
            throw new ArgumentNullException("name");
        }
        m2883k4().removeItemByKey(C14113y2.m67358c5(str));
    }

    @Override // com.aspose.slides.ITagCollection
    public final void removeAt(int i) {
        m2883k4().removeAt(i);
    }

    @Override // com.aspose.slides.ITagCollection
    public final void set_Item(String str, String str2) {
        if (str == null) {
            throw new ArgumentNullException("name");
        }
        m2883k4().set_Item(C14113y2.m67358c5(str), str2);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return m2883k4().size();
    }
}
