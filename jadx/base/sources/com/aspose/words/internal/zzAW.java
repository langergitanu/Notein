package com.aspose.words.internal;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes5.dex */
public class zzAW {
    private static long[] zzsu = new long[0];
    private int zzVf;
    private long[] zzsv = zzsu;

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

    private boolean zzZ(zzAW zzaw) {
        if (zzZKO.zzA(null, zzaw)) {
            return false;
        }
        if (zzZKO.zzA(this, zzaw)) {
            return true;
        }
        if (this.zzVf != zzaw.zzVf) {
            return false;
        }
        for (int i = 0; i < this.zzVf; i++) {
            if (get(i) != zzaw.get(i)) {
                return false;
            }
        }
        return true;
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
        if (obj.getClass() != zzAW.class) {
            return false;
        }
        return zzZ((zzAW) obj);
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.zzVf; i++) {
            if (i != 0) {
                zzZNH.zzU(sb, " ");
            }
            sb.append(this.zzsv[i]);
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
}
