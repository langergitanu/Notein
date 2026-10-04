package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZQJ<K> extends ArrayList<K> {
    private Comparator<K> zz3s;

    public zzZQJ(Collection<K> collection, Comparator<K> comparator) {
        super(collection);
        this.zz3s = comparator;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int size = size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (this.zz3s.compare(obj, get(i)) == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int size = size();
        if (obj == null) {
            for (int i = size - 1; i >= 0; i--) {
                if (get(i) == null) {
                    return i;
                }
            }
            return -1;
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            if (this.zz3s.compare(obj, get(i2)) == 0) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        if (obj == null) {
            return super.remove(obj);
        }
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }
}
