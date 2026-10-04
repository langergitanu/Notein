package com.aspose.slides.Collections;

import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class CompatibleComparer implements IGenericEqualityComparer, Comparator {

    /* JADX INFO: renamed from: k4 */
    private Comparator f1584k4;

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        Comparator comparator = this.f1584k4;
        if (comparator != null) {
            return comparator.compare(obj, obj2);
        }
        if (Comparable.class.isAssignableFrom(obj.getClass())) {
            return ((Comparable) obj).compareTo(obj2);
        }
        throw new ArgumentException("At least one object must implement java.lang.Comparable");
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public boolean equals(Object obj, Object obj2) {
        return equalsT(obj, obj2);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public boolean equalsT(Object obj, Object obj2) {
        return compare(obj, obj2) == 0;
    }

    public Comparator getComparer() {
        return this.f1584k4;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public int hashCode(Object obj) {
        return hashCodeT(obj);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
    public int hashCodeT(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        throw new ArgumentNullException("obj");
    }
}
