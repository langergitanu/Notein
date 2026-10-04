package com.aspose.words.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: loaded from: classes5.dex */
public class zzDB {
    private static int zzuT;
    private static int[] zzuU = new int[0];
    private int zzVf;
    private int[] zzuV;

    public zzDB() {
        this.zzuV = zzuU;
    }

    private void ensureCapacity(int i) {
        int[] iArr = this.zzuV;
        if (iArr.length >= i) {
            return;
        }
        int length = iArr.length == 0 ? 4 : iArr.length * 2;
        if (length >= i) {
            i = length;
        }
        zzH(i);
    }

    private int zz5(int i, int i2) {
        zzK(0, i);
        return zzZ1.binarySearch(this.zzuV, 0, i, i2);
    }

    public static zzDB zzCT() {
        return new zzDB(16);
    }

    private void zzH(int i) {
        if (i == this.zzuV.length) {
            return;
        }
        zzZ4.zzY(i, "value");
        int i2 = this.zzVf;
        if (i < i2) {
            throw new IllegalArgumentException("The specified capacity is less than the current size.\r\nParameter name: value");
        }
        if (i <= 0) {
            this.zzuV = zzuU;
            return;
        }
        int[] iArr = new int[i];
        if (i2 > 0) {
            zzZKV.zzZ(this.zzuV, 0, iArr, 0, i2);
        }
        this.zzuV = iArr;
    }

    private void zzK(int i, int i2) {
        zzZ4.zzY(i, FirebaseAnalytics.Param.INDEX);
        zzZ4.zzY(i2, C18293o1.f55803f);
        if (i + i2 > this.zzVf) {
            throw new IllegalArgumentException("The given index or/and count specify an invalid offset length.");
        }
    }

    private int zzO(int i, int i2, int i3) {
        zzK(0, i3);
        return zzZKV.zzZ(this.zzuV, i, 0, i3);
    }

    private int zzVH(int i) {
        return zzO(i, 0, this.zzVf);
    }

    private boolean zzW(zzDB zzdb) {
        if (zzZKO.zzA(null, zzdb)) {
            return false;
        }
        if (zzZKO.zzA(this, zzdb)) {
            return true;
        }
        if (this.zzVf != zzdb.zzVf) {
            return false;
        }
        for (int i = 0; i < this.zzVf; i++) {
            if (get(i) != zzdb.get(i)) {
                return false;
            }
        }
        return true;
    }

    private void zzY(int i, zzDB zzdb) {
        zzZ4.zzY((Object) zzdb, "list");
        zzZ(i, zzdb.zzuV, zzdb.zzVf);
    }

    private void zzYk(int i) {
        zzK(0, i);
        zzZKV.sort(this.zzuV, 0, i);
    }

    private void zzZ(int i, int[] iArr) {
        zzZ4.zzY((Object) iArr, "array");
        zzZ(i, iArr, iArr.length);
    }

    private void zzZO(int i) {
        zzK(0, i);
        zzZKV.zzY(this.zzuV, 0, i);
    }

    private void zzZP(int i) {
        zzZ4.zzZ(i, 0, this.zzVf, FirebaseAnalytics.Param.INDEX);
    }

    private void zzZQ(int i) {
        zzZ4.zzZ(i, 0, this.zzVf - 1, FirebaseAnalytics.Param.INDEX);
    }

    public final void add(int i) {
        ensureCapacity(this.zzVf + 1);
        int[] iArr = this.zzuV;
        int i2 = this.zzVf;
        this.zzVf = i2 + 1;
        iArr[i2] = i;
    }

    public final void clear() {
        zzZKV.zzX(this.zzuV, 0, this.zzVf);
        this.zzVf = 0;
    }

    public final boolean contains(int i) {
        return this.zzVf != 0 && zzVH(i) >= 0;
    }

    public boolean equals(Object obj) {
        if (zzZKO.zzA(null, obj)) {
            return false;
        }
        if (zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzDB.class) {
            return false;
        }
        return zzW((zzDB) obj);
    }

    public final int get(int i) {
        zzZQ(i);
        return this.zzuV[i];
    }

    public final int getCount() {
        return this.zzVf;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 : this.zzuV) {
            i = (i * 397) ^ i2;
        }
        return i;
    }

    public final int indexOf(int i) {
        return zzVH(i);
    }

    public final void removeAt(int i) {
        zzZQ(i);
        int i2 = this.zzVf - 1;
        this.zzVf = i2;
        if (i < i2) {
            int[] iArr = this.zzuV;
            zzZKV.zzZ(iArr, i + 1, iArr, i, i2 - i);
        }
        this.zzuV[this.zzVf] = zzuT;
    }

    public final void removeRange(int i, int i2) {
        zzK(i, i2);
        if (i2 == 0) {
            return;
        }
        int i3 = this.zzVf - i2;
        this.zzVf = i3;
        if (i < i3) {
            int[] iArr = this.zzuV;
            zzZKV.zzZ(iArr, i + i2, iArr, i, i3 - i);
        }
        zzZKV.zzX(this.zzuV, this.zzVf, i2);
    }

    public final void reverse() {
        zzZO(this.zzVf);
    }

    public final void set(int i, int i2) {
        zzZQ(i);
        this.zzuV[i] = i2;
    }

    public final void sort() {
        zzYk(this.zzVf);
    }

    public final int[] toArray() {
        int i = this.zzVf;
        int[] iArr = new int[i];
        zzZKV.zzZ(this.zzuV, 0, iArr, 0, i);
        return iArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.zzVf; i++) {
            if (i != 0) {
                zzZNH.zzU(sb, " ");
            }
            sb.append(this.zzuV[i]);
        }
        return sb.toString();
    }

    public final void zz4(int i, int i2) {
        zzZP(i);
        ensureCapacity(this.zzVf + 1);
        int i3 = this.zzVf;
        if (i < i3) {
            int[] iArr = this.zzuV;
            zzZKV.zzZ(iArr, i, iArr, i + 1, i3 - i);
        }
        this.zzuV[i] = i2;
        this.zzVf++;
    }

    public final boolean zzVG(int i) {
        int iZzVH = zzVH(i);
        if (iZzVH < 0) {
            return false;
        }
        removeAt(iZzVH);
        return true;
    }

    public final zzDB zzVI(int i) {
        zzK(0, i);
        zzDB zzdb = new zzDB(i);
        zzZKV.zzZ(this.zzuV, 0, zzdb.zzuV, 0, i);
        zzdb.zzVf = i;
        return zzdb;
    }

    public final int zzVJ(int i) {
        return zz5(this.zzVf, i);
    }

    public final void zzX(int[] iArr) {
        zzZ(this.zzVf, iArr);
    }

    public final void zzX(zzDB zzdb) {
        zzY(this.zzVf, zzdb);
    }

    public zzDB(int i) {
        zzZ4.zzY(i, "capacity");
        this.zzuV = new int[i];
    }

    private void zzZ(int i, int[] iArr, int i2) {
        zzZP(i);
        if (i2 == 0) {
            return;
        }
        ensureCapacity(this.zzVf + i2);
        int i3 = this.zzVf;
        if (i < i3) {
            int[] iArr2 = this.zzuV;
            zzZKV.zzZ(iArr2, i, iArr2, i + i2, i3 - i);
        }
        int[] iArr3 = this.zzuV;
        if (iArr3 == iArr) {
            zzZKV.zzZ(iArr3, 0, iArr3, i, i);
            int[] iArr4 = this.zzuV;
            zzZKV.zzZ(iArr4, i + i2, iArr4, i * 2, this.zzVf - i);
        } else {
            zzZKV.zzZ(iArr, 0, iArr3, i, i2);
        }
        this.zzVf += i2;
    }

    public zzDB(int[] iArr) {
        this(iArr, (byte) 0);
    }

    private zzDB(int[] iArr, byte b) {
        zzZ4.zzY((Object) iArr, "array");
        int length = iArr.length;
        this.zzVf = length;
        int[] iArr2 = new int[length];
        this.zzuV = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
    }

    public zzDB(zzDB zzdb) {
        zzZ4.zzY((Object) zzdb, "list");
        this.zzuV = zzdb.toArray();
        this.zzVf = zzdb.zzVf;
    }
}
