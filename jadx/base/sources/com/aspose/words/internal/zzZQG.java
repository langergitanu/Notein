package com.aspose.words.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZQG {
    public static ArrayList zzM(long... jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static ArrayList zzQ(int... iArr) {
        ArrayList arrayList = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            arrayList.add(Integer.valueOf(iArr[i]));
        }
        return arrayList;
    }

    public static <T> ArrayList<T> zzT(Iterable<T> iterable) {
        ArrayList<T> arrayList = new ArrayList<>();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static void zzU(ArrayList arrayList, int i, int i2) {
        if (i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException(i < 0 ? FirebaseAnalytics.Param.INDEX : "length");
        }
        if (arrayList.size() - i < i2) {
            throw new IndexOutOfBoundsException("length");
        }
        for (int i3 = (i2 + i) - 1; i < i3; i3--) {
            Object obj = arrayList.get(i);
            arrayList.set(i, arrayList.get(i3));
            arrayList.set(i3, obj);
            i++;
        }
    }

    public static <T> ArrayList<T> zzV(T[] tArr) {
        return new ArrayList<>(Arrays.asList(tArr));
    }

    public static ArrayList zzW(ArrayList arrayList, int i, int i2) {
        return new ArrayList(arrayList.subList(i, i2 + i));
    }

    public static <T> ArrayList<T> zzY(Collection<T> collection) {
        return new ArrayList<>(collection);
    }

    public static <T> int zzZ(ArrayList<T> arrayList, T t) {
        arrayList.add(t);
        return arrayList.size() - 1;
    }

    public static void zzV(ArrayList arrayList, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("negative count");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.remove(i);
        }
    }

    public static ArrayList zzY(short... sArr) {
        ArrayList arrayList = new ArrayList(6);
        for (int i = 0; i < 6; i++) {
            arrayList.add(Short.valueOf(sArr[i]));
        }
        return arrayList;
    }

    public static <T> void zzZ(ArrayList<T> arrayList, Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
    }

    public static void zzY(ArrayList arrayList, String[] strArr) {
        arrayList.addAll(Arrays.asList(strArr));
    }

    public static <T> void zzY(ArrayList<T> arrayList, T[] tArr) {
        zzZ(arrayList, 0, tArr, 0, arrayList.size());
    }

    public static void zzZ(ArrayList arrayList, Object[] objArr) {
        arrayList.addAll(Arrays.asList(objArr));
    }

    public static void zzZ(ArrayList arrayList, int[] iArr) {
        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.valueOf(iArr[i]));
        }
    }

    public static <T> void zzZ(Set<T> set, T[] tArr) {
        Iterator<T> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            tArr[i] = it.next();
            i++;
        }
    }

    public static <T> void zzZ(ArrayList<T> arrayList, int i, T[] tArr, int i2, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("negative count");
        }
        for (int i4 = 0; i4 < i3; i4++) {
            tArr[i4] = arrayList.get(i + i4);
        }
    }
}
