package com.aspose.words.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: loaded from: classes5.dex */
public class zz0Q {
    private static long zzeu;
    private static long[] zzsu = new long[0];
    private int zzVf;
    private long[] zzsv;

    public zz0Q() {
        this.zzsv = zzsu;
    }

    private void ensureCapacity(int i) {
        long[] jArr = this.zzsv;
        if (jArr.length >= i) {
            return;
        }
        int length = jArr.length == 0 ? 4 : jArr.length * 2;
        if (length >= i) {
            i = length;
        }
        zzH(i);
    }

    private void zzK(int i, int i2) {
        zzZ4.zzY(i, FirebaseAnalytics.Param.INDEX);
        zzZ4.zzY(i2, C18293o1.f55803f);
        if (i + i2 > this.zzVf) {
            throw new IllegalArgumentException("The given index or/and count specify an invalid offset length.");
        }
    }

    private void zzW(int i, long[] jArr) {
        zzZ4.zzY((Object) jArr, "array");
        zzZ(i, jArr, jArr.length);
    }

    private void zzZO(int i) {
        zzK(0, i);
        zzZKV.zzZ(this.zzsv, 0, i);
    }

    private void zzZP(int i) {
        zzZ4.zzZ(i, 0, this.zzVf, FirebaseAnalytics.Param.INDEX);
    }

    private void zzZQ(int i) {
        zzZ4.zzZ(i, 0, this.zzVf - 1, FirebaseAnalytics.Param.INDEX);
    }

    public final void add(long j) {
        ensureCapacity(this.zzVf + 1);
        long[] jArr = this.zzsv;
        int i = this.zzVf;
        this.zzVf = i + 1;
        jArr[i] = j;
    }

    public final void clear() {
        zzZKV.zzY(this.zzsv, 0, this.zzVf);
        this.zzVf = 0;
    }

    public boolean equals(Object obj) {
        if (zzZKO.zzA(null, obj)) {
            return false;
        }
        if (zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zz0Q.class) {
            return false;
        }
        return zzQ((zz0Q) obj);
    }

    public final long get(int i) {
        zzZQ(i);
        return this.zzsv[i];
    }

    public final int getCount() {
        return this.zzVf;
    }

    public int hashCode() {
        int iZzYs = 0;
        for (long j : this.zzsv) {
            iZzYs = (iZzYs * 397) ^ zzZKP.zzYs(j);
        }
        return iZzYs;
    }

    public final void removeAt(int i) {
        zzZQ(i);
        int i2 = this.zzVf - 1;
        this.zzVf = i2;
        if (i < i2) {
            long[] jArr = this.zzsv;
            zzZKV.zzZ(jArr, i + 1, jArr, i, i2 - i);
        }
        this.zzsv[this.zzVf] = zzeu;
    }

    public final void removeRange(int i, int i2) {
        zzK(i, i2);
        if (i2 == 0) {
            return;
        }
        int i3 = this.zzVf - i2;
        this.zzVf = i3;
        if (i < i3) {
            long[] jArr = this.zzsv;
            zzZKV.zzZ(jArr, i + i2, jArr, i, i3 - i);
        }
        zzZKV.zzY(this.zzsv, this.zzVf, i2);
    }

    public final void reverse() {
        zzZO(this.zzVf);
    }

    public final void set(int i, long j) {
        zzZQ(i);
        this.zzsv[i] = j;
    }

    public final long[] toArray() {
        int i = this.zzVf;
        long[] jArr = new long[i];
        zzZKV.zzZ(this.zzsv, 0, jArr, 0, i);
        return jArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.zzVf; i++) {
            if (i != 0) {
                zzZNH.zzU(sb, " ");
            }
            zzZNH.zzZ(sb, Long.valueOf(this.zzsv[i]));
        }
        return sb.toString();
    }

    public final int zzB2() {
        return this.zzsv.length;
    }

    public final void zzH(int i) {
        if (i == this.zzsv.length) {
            return;
        }
        zzZ4.zzY(i, "value");
        int i2 = this.zzVf;
        if (i < i2) {
            throw new IllegalArgumentException("The specified capacity is less than the current size.\r\nParameter name: value");
        }
        if (i <= 0) {
            this.zzsv = zzsu;
            return;
        }
        long[] jArr = new long[i];
        if (i2 > 0) {
            zzZKV.zzZ(this.zzsv, 0, jArr, 0, i2);
        }
        this.zzsv = jArr;
    }

    public final void zzQ(long[] jArr) {
        zzZKV.zzZ(this.zzsv, 0, jArr, 0, this.zzVf);
    }

    public final void zzR(long[] jArr) {
        zzW(this.zzVf, jArr);
    }

    public final void zzT(int i, long j) {
        zzZP(i);
        ensureCapacity(this.zzVf + 1);
        int i2 = this.zzVf;
        if (i < i2) {
            long[] jArr = this.zzsv;
            zzZKV.zzZ(jArr, i, jArr, i + 1, i2 - i);
        }
        this.zzsv[i] = j;
        this.zzVf++;
    }

    public final void zzZ(int i, zz0Q zz0q) {
        zzZ4.zzY((Object) zz0q, "list");
        zzZ(i, zz0q.zzsv, zz0q.zzVf);
    }

    public final zz0Q zzZC(int i, int i2) {
        zzK(i, i2);
        zz0Q zz0q = new zz0Q(i2);
        zzZKV.zzZ(this.zzsv, i, zz0q.zzsv, 0, i2);
        zz0q.zzVf = i2;
        return zz0q;
    }

    private boolean zzQ(zz0Q zz0q) {
        if (zzZKO.zzA(null, zz0q)) {
            return false;
        }
        if (zzZKO.zzA(this, zz0q)) {
            return true;
        }
        if (this.zzVf != zz0q.zzVf) {
            return false;
        }
        for (int i = 0; i < this.zzVf; i++) {
            if (!zzZPY.zzD(get(i), zz0q.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final void zzR(zz0Q zz0q) {
        zzZ(this.zzVf, zz0q);
    }

    public zz0Q(int i) {
        zzZ4.zzY(i, "capacity");
        this.zzsv = new long[i];
    }

    private void zzZ(int i, long[] jArr, int i2) {
        zzZP(i);
        if (i2 == 0) {
            return;
        }
        ensureCapacity(this.zzVf + i2);
        int i3 = this.zzVf;
        if (i < i3) {
            long[] jArr2 = this.zzsv;
            zzZKV.zzZ(jArr2, i, jArr2, i + i2, i3 - i);
        }
        long[] jArr3 = this.zzsv;
        if (jArr3 == jArr) {
            zzZKV.zzZ(jArr3, 0, jArr3, i, i);
            long[] jArr4 = this.zzsv;
            zzZKV.zzZ(jArr4, i + i2, jArr4, i * 2, this.zzVf - i);
        } else {
            zzZKV.zzZ(jArr, 0, jArr3, i, i2);
        }
        this.zzVf += i2;
    }

    public zz0Q(long[] jArr) {
        this(jArr, true);
    }

    public zz0Q(long[] jArr, boolean z) {
        zzZ4.zzY((Object) jArr, "array");
        int length = jArr.length;
        this.zzVf = length;
        if (z) {
            long[] jArr2 = new long[length];
            this.zzsv = jArr2;
            System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
            return;
        }
        this.zzsv = jArr;
    }

    public zz0Q(zz0Q zz0q) {
        zzZ4.zzY((Object) zz0q, "list");
        this.zzsv = zz0q.toArray();
        this.zzVf = zz0q.zzVf;
    }
}
