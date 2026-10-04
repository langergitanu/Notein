package com.aspose.slides.p559ms.System;

import Oooo0oO.C21034OooOOOo;
import com.aspose.slides.Collections.Comparer;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.exceptions.RankException;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;
import java.lang.reflect.Array;
import java.util.Comparator;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.yn */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class C14118yn {

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.yn$k4 */
    public static class k4<T> implements Comparator<T> {

        /* JADX INFO: renamed from: k4 */
        private final AbstractC14074ks<T> f47380k4;

        public k4(AbstractC14074ks<T> abstractC14074ks) {
            this.f47380k4 = abstractC14074ks;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            return this.f47380k4.mo1193k4(t, t2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67551k4(Object obj) {
        int i = 0;
        for (Class<?> componentType = obj.getClass(); componentType.isArray(); componentType = componentType.getComponentType()) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: kk */
    public static int m67560kk(Object obj, int i) {
        if (obj != null) {
            return m67561x1(obj, i) + 1;
        }
        throw new NullReferenceException("array is null");
    }

    /* JADX INFO: renamed from: x1 */
    public static int m67561x1(Object obj, int i) {
        if (obj == null) {
            throw new NullReferenceException("array is null");
        }
        if (i < 0 || m67551k4(obj) - 1 < i) {
            throw new ArgumentException("invalid dimension");
        }
        for (int i2 = 0; i2 < i; i2++) {
            obj = Array.get(obj, 0);
            if (obj == null) {
                return -1;
            }
        }
        return Array.getLength(obj) - 1;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67552k4(Object obj, int i) {
        if (obj == null) {
            throw new NullReferenceException();
        }
        if (i < 0 || m67551k4(obj) - 1 < i) {
            throw new ArgumentException("invalid dimension");
        }
        return 0;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m67562x1(Object[] objArr, int i, int i2, Object obj, Comparator comparator) {
        if (comparator == null) {
            comparator = Comparer.Default;
        }
        int i3 = (i2 + i) - 1;
        while (i <= i3) {
            int iOooO00o = C21034OooOOOo.OooO00o(i3, i, 2, i);
            try {
                int iCompare = comparator.compare(objArr[iOooO00o], obj);
                if (iCompare == 0) {
                    return iOooO00o;
                }
                if (iCompare > 0) {
                    i3 = iOooO00o - 1;
                } else {
                    i = iOooO00o + 1;
                }
            } catch (Exception e) {
                throw new InvalidOperationException("value is not of the same type", e);
            }
        }
        return ~i;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67553k4(Object[] objArr, int i, int i2, Object obj) {
        if (objArr == null) {
            throw new ArgumentNullException("array");
        }
        if (m67551k4((Object) objArr) > 1) {
            throw new RankException("Only single dimension arrays are supported.");
        }
        if (i < m67552k4(objArr, 0)) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, "index is less than the lower bound of array.");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("length", "Value has to be >= 0.");
        }
        if (i > (m67560kk(objArr, 0) + m67552k4(objArr, 0)) - i2) {
            throw new ArgumentException("index and length do not specify a valid range in array.");
        }
        if (objArr.length == 0) {
            return -1;
        }
        if (obj == null || (obj instanceof Comparable)) {
            return m67562x1(objArr, i, i2, obj, null);
        }
        throw new ArgumentException("value does not support IComparable");
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67554k4(Object[] objArr, int i, int i2, Object obj, Comparator comparator) {
        if (objArr == null) {
            throw new ArgumentNullException("array");
        }
        if (m67551k4((Object) objArr) > 1) {
            throw new RankException("Only single dimension arrays are supported.");
        }
        if (i < m67552k4(objArr, 0)) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, "index is less than the lower bound of array.");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("length", "Value has to be >= 0.");
        }
        if (i > (m67560kk(objArr, 0) + m67552k4(objArr, 0)) - i2) {
            throw new ArgumentException("index and length do not specify a valid range in array.");
        }
        if (objArr.length == 0) {
            return -1;
        }
        if (comparator != null || obj == null || (obj instanceof Comparable)) {
            return m67562x1(objArr, i, i2, obj, comparator);
        }
        throw new ArgumentException("comparer is null and value does not support IComparable.");
    }

    /* JADX INFO: renamed from: k4 */
    public static int m67555k4(Object[] objArr, Object obj, int i, int i2) {
        if (objArr == null) {
            throw new ArgumentNullException("array");
        }
        if (objArr.length == 0) {
            return -1;
        }
        if (i < 0 || i >= objArr.length) {
            throw new ArgumentOutOfRangeException("startIndex");
        }
        if (i2 < 0 || i2 > i + 1) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f);
        }
        int i3 = (i - i2) + 1;
        while (i >= i3) {
            if (C14067j2.m66728k4(obj, objArr[i])) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67556k4(byte[] bArr) {
        m67557k4(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67557k4(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new ArgumentNullException("array");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i < 0 ? FirebaseAnalytics.Param.INDEX : "length");
        }
        if (bArr.length - i < i2) {
            throw new ArgumentOutOfRangeException("length");
        }
        for (int i3 = (i2 + i) - 1; i < i3; i3--) {
            byte b = bArr[i];
            bArr[i] = bArr[i3];
            bArr[i3] = b;
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67558k4(Object[] objArr) {
        m67559k4(objArr, 0, objArr.length);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m67559k4(Object[] objArr, int i, int i2) {
        if (objArr == null) {
            throw new ArgumentNullException("array");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i < 0 ? FirebaseAnalytics.Param.INDEX : "length");
        }
        if (objArr.length - i < i2) {
            throw new ArgumentOutOfRangeException("length");
        }
        for (int i3 = (i2 + i) - 1; i < i3; i3--) {
            Object obj = objArr[i];
            objArr[i] = objArr[i3];
            objArr[i3] = obj;
            i++;
        }
    }
}
