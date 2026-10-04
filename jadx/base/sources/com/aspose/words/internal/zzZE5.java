package com.aspose.words.internal;

import androidx.core.location.LocationRequestCompat;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZE5 {
    static final Long zzWJp;
    static final char[] zzWJr = new char[0];
    static final Integer[] zzWJq = new Integer[100];

    static {
        int i = 0;
        while (true) {
            Integer[] numArr = zzWJq;
            if (i >= numArr.length) {
                zzWJp = new Long(LocationRequestCompat.PASSIVE_INTERVAL);
                return;
            } else {
                numArr[i] = new Integer(i);
                i++;
            }
        }
    }

    public static Long zzX9(long j) {
        return j == LocationRequestCompat.PASSIVE_INTERVAL ? zzWJp : new Long(j);
    }

    public static char[] zzXLL() {
        return zzWJr;
    }

    public static Object zzYH(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Illegal to pass null; can not determine component type");
        }
        int length = Array.getLength(obj);
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), (length >> 1) + length);
        System.arraycopy(obj, 0, objNewInstance, 0, length);
        return objNewInstance;
    }

    public static <T> boolean zzZ(Collection<T> collection, Collection<T> collection2) {
        if (collection.size() > collection2.size()) {
            collection2 = collection;
            collection = collection2;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (collection2.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static int[] zzZW(int[] iArr) {
        if (iArr == null) {
            return new int[8];
        }
        int length = iArr.length;
        int[] iArr2 = new int[length + 8];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    public static Integer zzgh(int i) {
        if (i >= 0) {
            Integer[] numArr = zzWJq;
            if (i < numArr.length) {
                return numArr[i];
            }
        }
        return new Integer(i);
    }

    public static String[] zzZ(String[] strArr, int i) {
        if (strArr == null) {
            return new String[i];
        }
        int length = strArr.length;
        String[] strArr2 = new String[i + length];
        System.arraycopy(strArr, 0, strArr2, 0, length);
        return strArr2;
    }
}
