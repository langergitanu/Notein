package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzZYV<T> {
    private Object[] zz9;
    private int zzVf;
    private T zza;
    private int[] zzuM;

    public zzZYV() {
        this.zza = null;
        this.zzuM = new int[16];
        this.zz9 = new Object[16];
    }

    private void ensureCapacity(int i) {
        int[] iArr = this.zzuM;
        int length = iArr.length == 0 ? 16 : iArr.length * 2;
        if (length >= i) {
            i = length;
        }
        zzH(i);
    }

    private void zzH(int i) {
        int[] iArr = this.zzuM;
        if (i != iArr.length) {
            int i2 = this.zzVf;
            if (i < i2) {
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
            }
            if (i <= 0) {
                this.zzuM = new int[16];
                this.zz9 = new Object[16];
                return;
            }
            int[] iArr2 = new int[i];
            Object[] objArr = new Object[i];
            if (i2 > 0) {
                zzZKV.zzZ(iArr, 0, iArr2, 0, i2);
                zzZKV.zzZ(this.zz9, 0, objArr, 0, this.zzVf);
            }
            this.zzuM = iArr2;
            this.zz9 = objArr;
        }
    }

    private void zzY(int i, int i2, T t) {
        int i3 = this.zzVf;
        if (i3 == this.zzuM.length) {
            ensureCapacity(i3 + 1);
        }
        int i4 = this.zzVf;
        if (i < i4) {
            int[] iArr = this.zzuM;
            int i5 = i + 1;
            zzZKV.zzZ(iArr, i, iArr, i5, i4 - i);
            Object[] objArr = this.zz9;
            zzZKV.zzZ(objArr, i, objArr, i5, this.zzVf - i);
        }
        this.zzuM[i] = i2;
        this.zz9[i] = t;
        this.zzVf++;
    }

    public final void add(int i, T t) {
        int iBinarySearch = zzZ1.binarySearch(this.zzuM, 0, this.zzVf, i);
        if (iBinarySearch >= 0) {
            throw new IllegalArgumentException("duplicate");
        }
        zzY(~iBinarySearch, i, t);
    }

    public final void clear() {
        this.zzVf = 0;
        this.zzuM = new int[16];
        this.zz9 = new Object[16];
    }

    public final T get(int i) {
        return zzW(i, this.zza);
    }

    public final int getCount() {
        return this.zzVf;
    }

    public int hashCode() {
        int iHashCode = 0;
        for (int i = 0; i < this.zzVf; i++) {
            iHashCode = (iHashCode * 397) ^ this.zzuM[i];
            Object obj = this.zz9[i];
            if (obj != null) {
                iHashCode = (iHashCode * 397) ^ obj.hashCode();
            }
        }
        return iHashCode;
    }

    public final int indexOfKey(int i) {
        int iBinarySearch = zzZ1.binarySearch(this.zzuM, 0, this.zzVf, i);
        if (iBinarySearch >= 0) {
            return iBinarySearch;
        }
        return -1;
    }

    public final void remove(int i) {
        int iIndexOfKey = indexOfKey(i);
        if (iIndexOfKey >= 0) {
            removeAt(iIndexOfKey);
        }
    }

    public final void removeAt(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.zzVf)) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        int i3 = i2 - 1;
        this.zzVf = i3;
        if (i < i3) {
            int[] iArr = this.zzuM;
            int i4 = i + 1;
            zzZKV.zzZ(iArr, i4, iArr, i, i3 - i);
            Object[] objArr = this.zz9;
            zzZKV.zzZ(objArr, i4, objArr, i, this.zzVf - i);
        }
        int[] iArr2 = this.zzuM;
        int i5 = this.zzVf;
        iArr2[i5] = 0;
        this.zz9[i5] = this.zza;
    }

    public final void set(int i, T t) {
        int iBinarySearch = zzZ1.binarySearch(this.zzuM, 0, this.zzVf, i);
        if (iBinarySearch >= 0) {
            this.zz9[iBinarySearch] = t;
        } else {
            zzY(~iBinarySearch, i, t);
        }
    }

    public final int zzT3(int i) {
        if (i < 0 || i >= this.zzVf) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        return this.zzuM[i];
    }

    public final void zzT4(int i) {
        int i2 = this.zzVf;
        if (i2 > 0 && i <= this.zzuM[i2 - 1]) {
            throw new IllegalStateException("Key value should be greater than max key value in list.");
        }
        zzY(i2, i, null);
    }

    public final boolean zzVE(int i) {
        return indexOfKey(i) >= 0;
    }

    public final T zzVY(int i) {
        if (i < 0 || i >= this.zzVf) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        return (T) this.zz9[i];
    }

    public final T zzW(int i, T t) {
        int iIndexOfKey = indexOfKey(i);
        return iIndexOfKey >= 0 ? (T) this.zz9[iIndexOfKey] : t;
    }

    public final Object[] zzr() {
        return this.zz9;
    }

    public final int[] zzrc() {
        return this.zzuM;
    }

    public zzZYV(int i) {
        this.zza = null;
        if (i >= 0) {
            this.zzuM = new int[i];
            this.zz9 = new Object[i];
            return;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: initialCapacity");
    }
}
