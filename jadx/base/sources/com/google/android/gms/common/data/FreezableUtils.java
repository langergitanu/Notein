package com.google.android.gms.common.data;

import com.google.firebase.firestore.Query;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        Query.C170491 c170491 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c170491.add(arrayList.get(i).freeze());
        }
        return c170491;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        Query.C170491 c170491 = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            c170491.add(it.next().freeze());
        }
        return c170491;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        Query.C170491 c170491 = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            c170491.add(e.freeze());
        }
        return c170491;
    }
}
