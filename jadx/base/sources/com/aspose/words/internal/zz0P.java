package com.aspose.words.internal;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes5.dex */
public class zz0P {
    private static long zzeu;
    private static long[] zzsu = new long[0];
    private int zzVf;
    private long[] zzsv;

    public zz0P() {
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

    private long[] toArray() {
        int i = this.zzVf;
        long[] jArr = new long[i];
        zzZKV.zzZ(this.zzsv, 0, jArr, 0, i);
        return jArr;
    }

    private void zzH(int i) {
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

    private boolean zzZ(zz0P zz0p) {
        if (zzZKO.zzA(null, zz0p)) {
            return false;
        }
        if (zzZKO.zzA(this, zz0p)) {
            return true;
        }
        if (this.zzVf != zz0p.zzVf) {
            return false;
        }
        for (int i = 0; i < this.zzVf; i++) {
            if (!zzZPZ.zzD(get(i), zz0p.get(i))) {
                return false;
            }
        }
        return true;
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

    public boolean equals(Object obj) {
        if (zzZKO.zzA(null, obj)) {
            return false;
        }
        if (zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zz0P.class) {
            return false;
        }
        return zzZ((zz0P) obj);
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

    public final void set(int i, long j) {
        zzZQ(i);
        this.zzsv[i] = j;
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

    public zz0P(byte b) {
        zzZ4.zzY(4, "capacity");
        this.zzsv = new long[4];
    }

    public zz0P(long[] jArr) {
        this(jArr, (byte) 0);
    }

    private zz0P(long[] jArr, byte b) {
        zzZ4.zzY((Object) jArr, "array");
        int length = jArr.length;
        this.zzVf = length;
        long[] jArr2 = new long[length];
        this.zzsv = jArr2;
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
    }

    public zz0P(zz0P zz0p) {
        zzZ4.zzY((Object) zz0p, "list");
        this.zzsv = zz0p.toArray();
        this.zzVf = zz0p.zzVf;
    }
}
