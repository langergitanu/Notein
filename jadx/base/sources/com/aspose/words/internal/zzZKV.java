package com.aspose.words.internal;

import com.aspose.words.ref.Ref;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.lang.reflect.Array;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZKV {
    public static void sort(int[] iArr, int i, int i2) {
        Arrays.sort(iArr, 0, i2);
    }

    public static String zzL(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        int i3 = i2 - i;
        int i4 = 16;
        while (i < i3) {
            if (i + i4 > i3) {
                i4 = i3 - i;
            }
            sb.append(zzZ(bArr, i, i4));
            sb.append(" | ");
            sb.append(zzM(bArr, i, i4));
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            i += 16;
        }
        return sb.toString();
    }

    private static String zzM(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        while (i2 > 0) {
            char c = (char) bArr[i];
            if (Character.isISOControl(c)) {
                c = FilenameUtils.EXTENSION_SEPARATOR;
            } else if (c > 127) {
                c = (char) (c + 1168);
            }
            sb.append(c);
            i++;
            i2--;
        }
        return sb.toString();
    }

    public static void zzN(byte[] bArr, int i, int i2) {
        Arrays.fill(bArr, i, i2 + i, (byte) 0);
    }

    public static void zzO(byte[] bArr, int i, int i2) {
        Arrays.fill(bArr, i, i2 + i, (byte) 0);
    }

    public static void zzP(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("array");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException(i < 0 ? FirebaseAnalytics.Param.INDEX : "length");
        }
        if (bArr.length - i < i2) {
            throw new IndexOutOfBoundsException("length");
        }
        for (int i3 = (i2 + i) - 1; i < i3; i3--) {
            byte b = bArr[i];
            bArr[i] = bArr[i3];
            bArr[i3] = b;
            i++;
        }
    }

    public static <T> Iterator<T> zzS(Object[] objArr) {
        return new Iterator<T>(objArr) { // from class: com.aspose.words.internal.zzZKV.4
            int index = 0;
            final int length;
            final /* synthetic */ Object[] zzZPt;

            {
                this.zzZPt = objArr;
                this.length = objArr.length;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.index < this.length;
            }

            @Override // java.util.Iterator
            public final T next() {
                try {
                    Object[] objArr2 = this.zzZPt;
                    int i = this.index;
                    T t = (T) objArr2[i];
                    this.index = i + 1;
                    return t;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new NoSuchElementException();
                }
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static <T> Iterator<T> zzT(T... tArr) {
        return new Iterator<T>(tArr) { // from class: com.aspose.words.internal.zzZKV.3
            int index = 0;
            final int length;
            final /* synthetic */ Object[] zzZPt;

            {
                this.zzZPt = tArr;
                this.length = tArr.length;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.index < this.length;
            }

            @Override // java.util.Iterator
            public final T next() {
                try {
                    Object[] objArr = this.zzZPt;
                    int i = this.index;
                    T t = (T) objArr[i];
                    this.index = i + 1;
                    return t;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new NoSuchElementException();
                }
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void zzU(Object[] objArr) {
        zzZ(objArr, objArr.length);
    }

    public static void zzX(int[] iArr, int i, int i2) {
        Arrays.fill(iArr, i, i2 + i, 0);
    }

    public static void zzY(float[] fArr, int i) {
        if (fArr == null) {
            throw new NullPointerException("array");
        }
        if (i < 0) {
            throw new IllegalArgumentException("length");
        }
        if (fArr.length < i) {
            throw new IllegalArgumentException("length");
        }
        int i2 = 0;
        for (int i3 = i - 1; i2 < i3; i3--) {
            float f = fArr[i2];
            fArr[i2] = fArr[i3];
            fArr[i3] = f;
            i2++;
        }
    }

    public static void zzYM(byte[] bArr) {
        zzP(bArr, 0, bArr.length);
    }

    public static int zzZ(int[] iArr, int i, int i2, int i3) {
        if (iArr == null) {
            throw new NullPointerException("array");
        }
        if (i2 < 0 || i2 > iArr.length) {
            throw new IllegalArgumentException("startIndex");
        }
        int i4 = i2 + i3;
        if (i3 < 0 || i4 > iArr.length) {
            throw new IllegalArgumentException(C18293o1.f55803f);
        }
        while (i2 < i4) {
            if (i == iArr[i2]) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static <T> Iterable<T> zzZY(final Object obj) {
        return new Iterable<T>() { // from class: com.aspose.words.internal.zzZKV.2
            @Override // java.lang.Iterable
            public final Iterator<T> iterator() {
                Object obj2 = obj;
                if (obj2 instanceof Object[]) {
                    return zzZKV.zzS((Object[]) obj2);
                }
                int i = 0;
                if (obj2 instanceof int[]) {
                    ArrayList arrayList = new ArrayList();
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i < length) {
                        arrayList.add(Integer.valueOf(iArr[i]));
                        i++;
                    }
                    return arrayList.iterator();
                }
                if (obj2 instanceof byte[]) {
                    ArrayList arrayList2 = new ArrayList();
                    byte[] bArr = (byte[]) obj;
                    int length2 = bArr.length;
                    while (i < length2) {
                        arrayList2.add(Byte.valueOf(bArr[i]));
                        i++;
                    }
                    return arrayList2.iterator();
                }
                if (obj2 instanceof char[]) {
                    ArrayList arrayList3 = new ArrayList();
                    char[] cArr = (char[]) obj;
                    int length3 = cArr.length;
                    while (i < length3) {
                        arrayList3.add(Character.valueOf(cArr[i]));
                        i++;
                    }
                    return arrayList3.iterator();
                }
                if (obj2 instanceof short[]) {
                    ArrayList arrayList4 = new ArrayList();
                    short[] sArr = (short[]) obj;
                    int length4 = sArr.length;
                    while (i < length4) {
                        arrayList4.add(Short.valueOf(sArr[i]));
                        i++;
                    }
                    return arrayList4.iterator();
                }
                if (obj2 instanceof long[]) {
                    ArrayList arrayList5 = new ArrayList();
                    long[] jArr = (long[]) obj;
                    int length5 = jArr.length;
                    while (i < length5) {
                        arrayList5.add(Long.valueOf(jArr[i]));
                        i++;
                    }
                    return arrayList5.iterator();
                }
                if (obj2 instanceof float[]) {
                    ArrayList arrayList6 = new ArrayList();
                    float[] fArr = (float[]) obj;
                    int length6 = fArr.length;
                    while (i < length6) {
                        arrayList6.add(Float.valueOf(fArr[i]));
                        i++;
                    }
                    return arrayList6.iterator();
                }
                if (obj2 instanceof double[]) {
                    ArrayList arrayList7 = new ArrayList();
                    double[] dArr = (double[]) obj;
                    int length7 = dArr.length;
                    while (i < length7) {
                        arrayList7.add(Double.valueOf(dArr[i]));
                        i++;
                    }
                    return arrayList7.iterator();
                }
                if (!(obj2 instanceof boolean[])) {
                    return zzZKV.zzT(obj2);
                }
                ArrayList arrayList8 = new ArrayList();
                boolean[] zArr = (boolean[]) obj;
                int length8 = zArr.length;
                while (i < length8) {
                    arrayList8.add(Boolean.valueOf(zArr[i]));
                    i++;
                }
                return arrayList8.iterator();
            }
        };
    }

    public static void sort(double[] dArr, int i, int i2) {
        Arrays.sort(dArr, 0, i2);
    }

    public static void sort(Object[] objArr, int i, int i2) {
        Arrays.sort(objArr, i, i2 + i);
    }

    public static int zzZ(byte[] bArr, byte b, int i, int i2) {
        if (bArr != null) {
            if (i >= 0 && i <= bArr.length) {
                int i3 = i + i2;
                if (i2 < 0 || i3 > bArr.length) {
                    throw new IllegalArgumentException(C18293o1.f55803f);
                }
                while (i < i3) {
                    if (b == bArr[i]) {
                        return i;
                    }
                    i++;
                }
                return -1;
            }
            throw new IllegalArgumentException("startIndex");
        }
        throw new NullPointerException("array");
    }

    public static void zzP(String[] strArr) {
        final Collator collatorZzcp = zzZHT.zzcp();
        Arrays.sort(strArr, new Comparator<String>() { // from class: com.aspose.words.internal.zzZKV.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                return collatorZzcp.compare(str, str2);
            }
        });
    }

    public static void zzY(int[] iArr, int i, int i2) {
        if (iArr == null) {
            throw new NullPointerException("array");
        }
        if (i2 >= 0) {
            if (iArr.length < i2) {
                throw new IllegalArgumentException("length");
            }
            int i3 = 0;
            for (int i4 = i2 - 1; i3 < i4; i4--) {
                int i5 = iArr[i3];
                iArr[i3] = iArr[i4];
                iArr[i4] = i5;
                i3++;
            }
            return;
        }
        throw new IllegalArgumentException("length");
    }

    public static int zzZ(char[] cArr, char c, int i, int i2) {
        if (cArr != null) {
            if (i >= 0 && i <= cArr.length) {
                int i3 = i + i2;
                if (i2 < 0 || i3 > cArr.length) {
                    throw new IllegalArgumentException(C18293o1.f55803f);
                }
                while (i < i3) {
                    if (c == cArr[i]) {
                        return i;
                    }
                    i++;
                }
                return -1;
            }
            throw new IllegalArgumentException("startIndex");
        }
        throw new NullPointerException("array");
    }

    public static void zzY(char[] cArr, int i) {
        if (cArr == null) {
            throw new NullPointerException("array");
        }
        if (i >= 0) {
            if (cArr.length < i) {
                throw new IndexOutOfBoundsException("length");
            }
            int i2 = 0;
            for (int i3 = i - 1; i2 < i3; i3--) {
                char c = cArr[i2];
                cArr[i2] = cArr[i3];
                cArr[i3] = c;
                i2++;
            }
            return;
        }
        throw new IndexOutOfBoundsException("length");
    }

    public static int zzZ(Object[] objArr, Object obj) {
        return zzZ(objArr, obj, objArr.length);
    }

    public static int zzZ(Object[] objArr, Object obj, int i) {
        if (objArr != null) {
            if (objArr.length >= 0) {
                if (i < 0 || i > objArr.length) {
                    throw new IllegalArgumentException(C18293o1.f55803f);
                }
                int i2 = 0;
                if (obj == null) {
                    while (i2 < i) {
                        if (objArr[i2] == null) {
                            return i2;
                        }
                        i2++;
                    }
                    return -1;
                }
                while (i2 < i) {
                    if (obj.equals(objArr[i2])) {
                        return i2;
                    }
                    i2++;
                }
                return -1;
            }
            throw new IllegalArgumentException("startIndex");
        }
        throw new NullPointerException("array");
    }

    public static void zzY(long[] jArr, int i, int i2) {
        Arrays.fill(jArr, i, i2 + i, 0L);
    }

    public static void zzY(Object[] objArr, int i) {
        Arrays.fill(objArr, 0, i, (Object) null);
    }

    public static void zzY(Object obj, int i, Object obj2, int i2, int i3) {
        if (i2 < 0) {
            System.arraycopy(obj, i - i2, obj2, 0, i3 + i2);
        } else {
            System.arraycopy(obj, i, obj2, i2, i3);
        }
    }

    public static void zzZ(Object[] objArr, int i) {
        if (objArr == null) {
            throw new NullPointerException("array");
        }
        if (i >= 0) {
            if (objArr.length < i) {
                throw new IllegalArgumentException("length");
            }
            int i2 = 0;
            for (int i3 = i - 1; i2 < i3; i3--) {
                Object obj = objArr[i2];
                objArr[i2] = objArr[i3];
                objArr[i3] = obj;
                i2++;
            }
            return;
        }
        throw new IllegalArgumentException("length");
    }

    public static void zzZ(long[] jArr, int i, int i2) {
        if (jArr == null) {
            throw new NullPointerException("array");
        }
        if (i >= 0 && i2 >= 0) {
            if (jArr.length - i < i2) {
                throw new IllegalArgumentException("length");
            }
            for (int i3 = (i2 + i) - 1; i < i3; i3--) {
                long j = jArr[i];
                jArr[i] = jArr[i3];
                jArr[i3] = j;
                i++;
            }
            return;
        }
        throw new IllegalArgumentException(i < 0 ? FirebaseAnalytics.Param.INDEX : "length");
    }

    public static void zzZ(double[] dArr, int i) {
        Arrays.fill(dArr, 0, i, 0.0d);
    }

    public static void zzZ(Object obj, int i, Object obj2, int i2, int i3) {
        if (obj.getClass().equals(obj2.getClass())) {
            System.arraycopy(obj, i, obj2, i2, i3);
            return;
        }
        int i4 = 0;
        if (obj2 instanceof int[]) {
            while (i4 < i3) {
                ((int[]) obj2)[i2 + i4] = Array.getInt(obj, i + i4);
                i4++;
            }
            return;
        }
        if (obj2 instanceof Object[]) {
            while (i4 < i3) {
                ((Object[]) obj2)[i2 + i4] = Array.get(obj, i + i4);
                i4++;
            }
            return;
        }
        if (obj2 instanceof byte[]) {
            while (i4 < i3) {
                ((byte[]) obj2)[i2 + i4] = Array.getByte(obj, i + i4);
                i4++;
            }
            return;
        }
        if (obj2 instanceof char[]) {
            while (i4 < i3) {
                ((char[]) obj2)[i2 + i4] = Array.getChar(obj, i + i4);
                i4++;
            }
            return;
        }
        if (obj2 instanceof short[]) {
            while (i4 < i3) {
                ((short[]) obj2)[i2 + i4] = Array.getShort(obj, i + i4);
                i4++;
            }
            return;
        }
        if (obj2 instanceof long[]) {
            while (i4 < i3) {
                ((long[]) obj2)[i2 + i4] = Array.getLong(obj, i + i4);
                i4++;
            }
        } else if (obj2 instanceof float[]) {
            while (i4 < i3) {
                ((float[]) obj2)[i2 + i4] = Array.getFloat(obj, i + i4);
                i4++;
            }
        } else {
            if (!(obj2 instanceof double[])) {
                throw new ArrayStoreException("Not found type: " + obj2.getClass().toString());
            }
            while (i4 < i3) {
                ((double[]) obj2)[i2 + i4] = Array.getDouble(obj, i + i4);
                i4++;
            }
        }
    }

    private static String zzZ(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        while (i2 > 0) {
            sb.append(zzZHP.zzPt(bArr[i]));
            sb.append(" ");
            i++;
            i2--;
        }
        return sb.toString();
    }

    public static <T> void zzZ(Ref<T> ref, int i) {
        Object obj = ref.get();
        if (obj == null || !obj.getClass().isArray()) {
            return;
        }
        if (obj instanceof int[]) {
            ref.set(Arrays.copyOf((int[]) obj, i));
            return;
        }
        if (obj instanceof byte[]) {
            ref.set(Arrays.copyOf((byte[]) obj, i));
            return;
        }
        if (obj instanceof short[]) {
            ref.set(Arrays.copyOf((short[]) obj, i));
            return;
        }
        if (obj instanceof boolean[]) {
            ref.set(Arrays.copyOf((boolean[]) obj, i));
            return;
        }
        if (obj instanceof long[]) {
            ref.set(Arrays.copyOf((long[]) obj, i));
            return;
        }
        if (obj instanceof double[]) {
            ref.set(Arrays.copyOf((double[]) obj, i));
            return;
        }
        if (obj instanceof float[]) {
            ref.set(Arrays.copyOf((float[]) obj, i));
        } else if (obj instanceof char[]) {
            ref.set(Arrays.copyOf((char[]) obj, i));
        } else {
            ref.set(Arrays.copyOf((Object[]) obj, i));
        }
    }
}
