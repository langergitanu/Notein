package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzZYU implements Cloneable {
    private int zzVf;
    private short[] zzcg = null;
    private int[] zzuM = null;
    private Object[] zz9 = null;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private void zzSZ(int i) {
        short[] sArr = this.zzcg;
        int length = sArr.length == 0 ? 16 : sArr.length * 2;
        if (length >= i) {
            i = length;
        }
        zzT1(i);
    }

    private void zzT0(int i) {
        int[] iArr = this.zzuM;
        int length = iArr.length == 0 ? 16 : iArr.length * 2;
        if (length >= i) {
            i = length;
        }
        zzT2(i);
    }

    private void zzT1(int i) {
        short[] sArr = this.zzcg;
        if (i != sArr.length) {
            int i2 = this.zzVf;
            if (i < i2) {
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
            }
            if (i <= 0) {
                this.zzcg = new short[zzrb()];
                this.zz9 = new Object[zzrb()];
                return;
            }
            short[] sArr2 = new short[i];
            Object[] objArr = new Object[i];
            if (i2 > 0) {
                zzZKV.zzZ(sArr, 0, sArr2, 0, i2);
                zzZKV.zzZ(this.zz9, 0, objArr, 0, this.zzVf);
            }
            this.zzcg = sArr2;
            this.zz9 = objArr;
        }
    }

    private void zzT2(int i) {
        int[] iArr = this.zzuM;
        if (i != iArr.length) {
            int i2 = this.zzVf;
            if (i < i2) {
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
            }
            if (i <= 0) {
                this.zzuM = new int[zzrb()];
                this.zz9 = new Object[zzrb()];
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

    private void zzU(int i, Object obj) {
        zzra();
        int iBinarySearch = zzZ1.binarySearch(this.zzuM, 0, this.zzVf, i);
        if (iBinarySearch >= 0) {
            this.zz9[iBinarySearch] = obj;
        } else {
            zzX(~iBinarySearch, i, obj);
        }
    }

    private void zzV(int i, Object obj) {
        zzra();
        int iBinarySearch = zzZ1.binarySearch(this.zzuM, 0, this.zzVf, i);
        if (iBinarySearch >= 0) {
            throw new IllegalArgumentException("duplicate");
        }
        zzX(~iBinarySearch, i, obj);
    }

    private void zzX(int i, int i2, Object obj) {
        zzra();
        int i3 = this.zzVf;
        if (i3 == this.zzuM.length) {
            zzT0(i3 + 1);
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
        this.zz9[i] = obj;
        this.zzVf++;
    }

    private void zzY(short s, Object obj) {
        zzra();
        int iZzZ = zzZ1.zzZ(this.zzcg, this.zzVf, s);
        if (iZzZ >= 0) {
            this.zz9[iZzZ] = obj;
        } else {
            zzZ(~iZzZ, s, obj);
        }
    }

    private void zzZ(short s, Object obj) {
        zzra();
        int iZzZ = zzZ1.zzZ(this.zzcg, this.zzVf, s);
        if (iZzZ >= 0) {
            throw new IllegalArgumentException("duplicate");
        }
        zzZ(~iZzZ, s, obj);
    }

    private void zzr9() {
        zzra();
        this.zzuM = new int[this.zzcg.length];
        int i = 0;
        while (true) {
            short[] sArr = this.zzcg;
            if (i >= sArr.length) {
                this.zzcg = null;
                return;
            } else {
                this.zzuM[i] = sArr[i];
                i++;
            }
        }
    }

    private void zzra() {
        if (this.zz9 != null) {
            return;
        }
        this.zzcg = new short[zzrb()];
        this.zzuM = null;
        this.zz9 = new Object[zzrb()];
    }

    public void add(int i, Object obj) {
        zzra();
        if (this.zzuM != null) {
            zzV(i, obj);
        } else if (i <= 32767) {
            zzZ((short) i, obj);
        } else {
            zzr9();
            zzV(i, obj);
        }
    }

    public void clear() {
        this.zzVf = 0;
        this.zzuM = null;
        this.zzcg = null;
        this.zz9 = null;
    }

    public boolean contains(int i) {
        return this.zz9 != null && indexOfKey(i) >= 0;
    }

    public Object get(int i) {
        int iIndexOfKey;
        if (this.zz9 != null && (iIndexOfKey = indexOfKey(i)) >= 0) {
            return this.zz9[iIndexOfKey];
        }
        return null;
    }

    public int getCount() {
        if (this.zz9 == null) {
            return 0;
        }
        return this.zzVf;
    }

    public int indexOfKey(int i) {
        if (this.zz9 == null) {
            return -1;
        }
        int[] iArr = this.zzuM;
        int iBinarySearch = iArr != null ? zzZ1.binarySearch(iArr, 0, this.zzVf, i) : i > 32767 ? -1 : zzZ1.zzZ(this.zzcg, this.zzVf, (short) i);
        if (iBinarySearch >= 0) {
            return iBinarySearch;
        }
        return -1;
    }

    public void remove(int i) {
        int iIndexOfKey = indexOfKey(i);
        if (iIndexOfKey >= 0) {
            removeAt(iIndexOfKey);
        }
    }

    public void removeAt(int i) {
        int i2;
        if (this.zz9 == null || i < 0 || i >= (i2 = this.zzVf)) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        int i3 = i2 - 1;
        this.zzVf = i3;
        if (i < i3) {
            int[] iArr = this.zzuM;
            if (iArr != null) {
                zzZKV.zzZ(iArr, i + 1, iArr, i, i3 - i);
            } else {
                short[] sArr = this.zzcg;
                zzZKV.zzZ(sArr, i + 1, sArr, i, i3 - i);
            }
            Object[] objArr = this.zz9;
            zzZKV.zzZ(objArr, i + 1, objArr, i, this.zzVf - i);
        }
        int[] iArr2 = this.zzuM;
        if (iArr2 != null) {
            iArr2[this.zzVf] = 0;
        } else {
            this.zzcg[this.zzVf] = 0;
        }
        this.zz9[this.zzVf] = null;
    }

    public void set(int i, Object obj) {
        zzra();
        if (this.zzuM != null) {
            zzU(i, obj);
        } else if (i <= 32767) {
            zzY((short) i, obj);
        } else {
            zzr9();
            zzU(i, obj);
        }
    }

    public boolean zzS(int... iArr) {
        if (this.zz9 == null) {
            return false;
        }
        for (int i : iArr) {
            if (zzVE(i)) {
                return true;
            }
        }
        return false;
    }

    public int zzT3(int i) {
        if (this.zz9 == null || i < 0 || i >= this.zzVf) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        int[] iArr = this.zzuM;
        return iArr != null ? iArr[i] : this.zzcg[i];
    }

    public boolean zzVE(int i) {
        return this.zz9 != null && indexOfKey(i) >= 0;
    }

    public Object zzVY(int i) {
        Object[] objArr = this.zz9;
        if (objArr == null || i < 0 || i >= this.zzVf) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        return objArr[i];
    }

    public final zzZYU zzr8() {
        if (this.zz9 == null) {
            return (zzZYU) memberwiseClone();
        }
        zzra();
        zzZYU zzzyu = (zzZYU) memberwiseClone();
        zzzyu.zzVf = 0;
        int[] iArr = this.zzuM;
        if (iArr != null) {
            zzzyu.zzuM = new int[iArr.length];
        } else {
            zzzyu.zzcg = new short[this.zzcg.length];
        }
        zzzyu.zz9 = new Object[this.zz9.length];
        return zzzyu;
    }

    public int zzrb() {
        return 16;
    }

    private void zzZ(int i, short s, Object obj) {
        zzra();
        int i2 = this.zzVf;
        if (i2 == this.zzcg.length) {
            zzSZ(i2 + 1);
        }
        int i3 = this.zzVf;
        if (i < i3) {
            short[] sArr = this.zzcg;
            int i4 = i + 1;
            zzZKV.zzZ(sArr, i, sArr, i4, i3 - i);
            Object[] objArr = this.zz9;
            zzZKV.zzZ(objArr, i, objArr, i4, this.zzVf - i);
        }
        this.zzcg[i] = s;
        this.zz9[i] = obj;
        this.zzVf++;
    }
}
