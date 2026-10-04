package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p463vm.C11690k4;
import com.aspose.slides.internal.p463vm.C11697x1;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class Comparer implements Comparator {
    public static final Comparer Default = new Comparer(C11697x1.m55252to());
    public static final Comparer DefaultInvariant = new Comparer(C11697x1.m55250kk());

    /* JADX INFO: renamed from: k4 */
    private C11690k4 f1583k4;

    private Comparer() {
        this.f1583k4 = null;
    }

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
        C11690k4 c11690k4 = this.f1583k4;
        if (c11690k4 != null && (obj instanceof String) && (obj2 instanceof String)) {
            return c11690k4.m55129k4((String) obj, (String) obj2);
        }
        try {
            if (obj instanceof Comparable) {
                return ((Comparable) obj).compareTo(obj2);
            }
            if (obj2 instanceof Comparable) {
                return ((Comparable) obj2).compareTo(obj);
            }
            throw new ArgumentException("At least one object must implement Comparable.");
        } catch (ClassCastException unused) {
            throw new ArgumentException("value A is not of the same type as B");
        }
    }

    public Comparer(C11697x1 c11697x1) {
        if (c11697x1 == null) {
            throw new ArgumentNullException("culture");
        }
        this.f1583k4 = c11697x1.m55271up();
    }
}
