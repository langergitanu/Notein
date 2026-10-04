package com.aspose.words.internal;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes5.dex */
public class zzZZQ {
    private static zzZQ4 zzde;
    private static zzZQ4[] zzdf = new zzZQ4[0];
    private int zzVf;
    private zzZQ4[] zzdg;

    public zzZZQ() {
        this.zzdg = zzdf;
    }

    private void ensureCapacity(int i) {
        zzZQ4[] zzzq4Arr = this.zzdg;
        if (zzzq4Arr.length >= i) {
            return;
        }
        int length = zzzq4Arr.length == 0 ? 4 : zzzq4Arr.length * 2;
        if (length >= i) {
            i = length;
        }
        zzH(i);
    }

    private void zzH(int i) {
        if (i == this.zzdg.length) {
            return;
        }
        zzZ4.zzY(i, "value");
        int i2 = this.zzVf;
        if (i < i2) {
            throw new IllegalArgumentException("The specified capacity is less than the current size.\r\nParameter name: value");
        }
        if (i <= 0) {
            this.zzdg = zzdf;
            return;
        }
        zzZQ4[] zzzq4Arr = new zzZQ4[i];
        if (i2 > 0) {
            zzZKV.zzZ(this.zzdg, 0, zzzq4Arr, 0, i2);
        }
        this.zzdg = zzzq4Arr;
    }

    private boolean zzX(zzZZQ zzzzq) {
        if (zzZKO.zzA(null, zzzzq)) {
            return false;
        }
        if (zzZKO.zzA(this, zzzzq)) {
            return true;
        }
        if (this.zzVf != zzzzq.zzVf) {
            return false;
        }
        for (int i = 0; i < this.zzVf; i++) {
            if (!zzZQ4.zzV(zzT7(i), zzzzq.zzT7(i))) {
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

    public final void clear() {
        zzZKV.zzY(this.zzdg, this.zzVf);
        this.zzVf = 0;
    }

    public boolean equals(Object obj) {
        if (zzZKO.zzA(null, obj)) {
            return false;
        }
        if (zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzZZQ.class) {
            return false;
        }
        return zzX((zzZZQ) obj);
    }

    public final int getCount() {
        return this.zzVf;
    }

    public int hashCode() {
        int iHashCode = 0;
        for (zzZQ4 zzzq4 : this.zzdg) {
            iHashCode = (iHashCode * 397) ^ zzzq4.hashCode();
        }
        return iHashCode;
    }

    public final void removeAt(int i) {
        zzZQ(i);
        int i2 = this.zzVf - 1;
        this.zzVf = i2;
        if (i < i2) {
            zzZQ4[] zzzq4Arr = this.zzdg;
            zzZKV.zzZ(zzzq4Arr, i + 1, zzzq4Arr, i, i2 - i);
        }
        this.zzdg[this.zzVf] = zzde;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.zzVf; i++) {
            if (i != 0) {
                zzZNH.zzU(sb, " ");
            }
            zzZNH.zzZ(sb, this.zzdg[i]);
        }
        return sb.toString();
    }

    public final zzZQ4 zzT7(int i) {
        zzZQ(i);
        return this.zzdg[i];
    }

    public final void zzY(zzZZQ zzzzq) {
        zzZ(this.zzVf, zzzzq);
    }

    public final void zzZ(int i, zzZZQ zzzzq) {
        zzZ4.zzY((Object) zzzzq, "list");
        zzZ(i, zzzzq.zzdg, zzzzq.zzVf);
    }

    public final void zzf(zzZQ4 zzzq4) {
        ensureCapacity(this.zzVf + 1);
        zzZQ4[] zzzq4Arr = this.zzdg;
        int i = this.zzVf;
        this.zzVf = i + 1;
        zzzq4Arr[i] = zzzq4;
    }

    public zzZZQ(zzZQ4[] zzzq4Arr) {
        this(zzzq4Arr, (byte) 0);
    }

    private void zzZ(int i, zzZQ4[] zzzq4Arr, int i2) {
        zzZP(i);
        if (i2 == 0) {
            return;
        }
        ensureCapacity(this.zzVf + i2);
        int i3 = this.zzVf;
        if (i < i3) {
            zzZQ4[] zzzq4Arr2 = this.zzdg;
            zzZKV.zzZ(zzzq4Arr2, i, zzzq4Arr2, i + i2, i3 - i);
        }
        zzZQ4[] zzzq4Arr3 = this.zzdg;
        if (zzzq4Arr3 == zzzq4Arr) {
            zzZKV.zzZ(zzzq4Arr3, 0, zzzq4Arr3, i, i);
            zzZQ4[] zzzq4Arr4 = this.zzdg;
            zzZKV.zzZ(zzzq4Arr4, i + i2, zzzq4Arr4, i * 2, this.zzVf - i);
        } else {
            zzZKV.zzZ(zzzq4Arr, 0, zzzq4Arr3, i, i2);
        }
        this.zzVf += i2;
    }

    private zzZZQ(zzZQ4[] zzzq4Arr, byte b) {
        zzZ4.zzY((Object) zzzq4Arr, "array");
        int length = zzzq4Arr.length;
        this.zzVf = length;
        zzZQ4[] zzzq4Arr2 = new zzZQ4[length];
        this.zzdg = zzzq4Arr2;
        System.arraycopy(zzzq4Arr, 0, zzzq4Arr2, 0, zzzq4Arr.length);
    }
}
