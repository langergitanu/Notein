package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.Collections.IHashCodeProvider;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class NameValueCollection extends NameObjectCollectionBase {

    /* JADX INFO: renamed from: k4 */
    private String[] f1900k4;

    /* JADX INFO: renamed from: x1 */
    private String[] f1901x1;

    public NameValueCollection() {
        this.f1900k4 = null;
        this.f1901x1 = null;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m1046k4(ArrayList arrayList) {
        int size;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return null;
        }
        if (size == 1) {
            return (String) arrayList.get_Item(0);
        }
        if (size == 2) {
            return C14113y2.m67407k4((String) arrayList.get_Item(0), ',', (String) arrayList.get_Item(1));
        }
        int length = size;
        for (int i = 0; i < size; i++) {
            length += ((String) arrayList.get_Item(i)).length();
        }
        C6765kp c6765kp = new C6765kp((String) arrayList.get_Item(0), length);
        for (int i2 = 1; i2 < size; i2++) {
            c6765kp.m26780k4(',');
            c6765kp.m26791k4(arrayList.get_Item(i2));
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: to */
    private void m1047to() {
        this.f1901x1 = null;
        int size = size();
        this.f1901x1 = new String[size];
        for (int i = 0; i < size; i++) {
            this.f1901x1[i] = get(i);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static String[] m1048x1(ArrayList arrayList) {
        int size;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return null;
        }
        String[] strArr = new String[size];
        arrayList.copyTo(AbstractC14092to.m67208k4((Object) strArr));
        return strArr;
    }

    public void add(NameValueCollection nameValueCollection) {
        if (isReadOnly()) {
            throw new NotSupportedException("Collection is read-only");
        }
        if (nameValueCollection == null) {
            throw new ArgumentNullException("c");
        }
        invalidateCachedArrays();
        int size = nameValueCollection.size();
        for (int i = 0; i < size; i++) {
            String key = nameValueCollection.getKey(i);
            String[] values = nameValueCollection.getValues(i);
            if (values == null || values.length <= 0) {
                add(key, null);
            } else {
                for (String str : values) {
                    add(key, str);
                }
            }
        }
    }

    public void clear() {
        if (isReadOnly()) {
            throw new NotSupportedException("Collection is read-only");
        }
        invalidateCachedArrays();
        baseClear();
    }

    @Override // com.aspose.slides.Collections.Specialized.NameObjectCollectionBase, com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("dest", "Null argument - dest");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, "index is less than 0");
        }
        if (abstractC14092to.m67277to() > 1) {
            throw new ArgumentException("dest", "multidim");
        }
        if (abstractC14092to.m67265du() - i < size()) {
            throw new ArgumentException("The number of elements in the collection is greater than the available space from index to the end of the destination array");
        }
        if (this.f1901x1 == null) {
            m1047to();
        }
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f1901x1), 0, abstractC14092to, i, this.f1901x1.length);
    }

    public String get(int i) {
        return m1046k4((ArrayList) baseGet(i));
    }

    public String[] getAllKeys() {
        if (this.f1900k4 == null) {
            this.f1900k4 = baseGetAllKeys();
        }
        return this.f1900k4;
    }

    public String getKey(int i) {
        return baseGetKey(i);
    }

    public String[] getValues(int i) {
        return m1048x1((ArrayList) baseGet(i));
    }

    public String get_Item(int i) {
        return get(i);
    }

    public boolean hasKeys() {
        return baseHasKeys();
    }

    public void invalidateCachedArrays() {
        this.f1900k4 = null;
        this.f1901x1 = null;
    }

    public void remove(String str) {
        if (isReadOnly()) {
            throw new NotSupportedException("Collection is read-only");
        }
        invalidateCachedArrays();
        baseRemove(str);
    }

    public void set(String str, String str2) {
        if (isReadOnly()) {
            throw new NotSupportedException("Collection is read-only");
        }
        invalidateCachedArrays();
        ArrayList arrayList = new ArrayList();
        if (str2 == null) {
            baseSet(str, (Object) null);
        } else {
            arrayList.addItem(str2);
            baseSet(str, arrayList);
        }
    }

    public void set_Item(String str, String str2) {
        set(str, str2);
    }

    public NameValueCollection(int i) {
        super(i);
        this.f1900k4 = null;
        this.f1901x1 = null;
    }

    public void add(String str, String str2) {
        if (isReadOnly()) {
            throw new NotSupportedException("Collection is read-only");
        }
        invalidateCachedArrays();
        ArrayList arrayList = (ArrayList) baseGet(str);
        if (arrayList != null) {
            if (str2 != null) {
                arrayList.addItem(str2);
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            if (str2 != null) {
                arrayList2.addItem(str2);
            }
            baseAdd(str, arrayList2);
        }
    }

    public String get(String str) {
        return m1046k4((ArrayList) baseGet(str));
    }

    public String[] getValues(String str) {
        return m1048x1((ArrayList) baseGet(str));
    }

    public String get_Item(String str) {
        return get(str);
    }

    public NameValueCollection(int i, IGenericEqualityComparer iGenericEqualityComparer) {
        super(i, iGenericEqualityComparer);
        this.f1900k4 = null;
        this.f1901x1 = null;
    }

    @Deprecated
    public NameValueCollection(int i, IHashCodeProvider iHashCodeProvider, Comparator comparator) {
        super(i, iHashCodeProvider, comparator);
        this.f1900k4 = null;
        this.f1901x1 = null;
    }

    public NameValueCollection(int i, NameValueCollection nameValueCollection) {
        super(i, nameValueCollection == null ? null : nameValueCollection.m1044kk(), nameValueCollection == null ? null : nameValueCollection.m1045x1());
        this.f1900k4 = null;
        this.f1901x1 = null;
        add(nameValueCollection);
    }

    public NameValueCollection(IGenericEqualityComparer iGenericEqualityComparer) {
        super(iGenericEqualityComparer);
        this.f1900k4 = null;
        this.f1901x1 = null;
    }

    @Deprecated
    public NameValueCollection(IHashCodeProvider iHashCodeProvider, Comparator comparator) {
        super(iHashCodeProvider, comparator);
        this.f1900k4 = null;
        this.f1901x1 = null;
    }

    public NameValueCollection(NameValueCollection nameValueCollection) {
        super(nameValueCollection == null ? null : nameValueCollection.m1042k4(), nameValueCollection == null ? null : nameValueCollection.m1045x1(), nameValueCollection == null ? null : nameValueCollection.m1044kk());
        this.f1900k4 = null;
        this.f1901x1 = null;
        if (nameValueCollection == null) {
            throw new ArgumentNullException("col");
        }
        add(nameValueCollection);
    }
}
