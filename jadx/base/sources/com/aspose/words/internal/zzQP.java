package com.aspose.words.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: loaded from: classes5.dex */
public class zzQP {
    private static double zzLc;
    private static double[] zzLd = new double[0];
    private double[] zzLe = zzLd;
    private int zzVf;

    private void ensureCapacity(int i) {
        double[] dArr = this.zzLe;
        if (dArr.length >= i) {
            return;
        }
        int length = dArr.length == 0 ? 4 : dArr.length * 2;
        if (length >= i) {
            i = length;
        }
        zzH(i);
    }

    private void zzH(int i) {
        if (i == this.zzLe.length) {
            return;
        }
        zzZ4.zzY(i, "value");
        int i2 = this.zzVf;
        if (i < i2) {
            throw new IllegalArgumentException("The specified capacity is less than the current size.\r\nParameter name: value");
        }
        if (i <= 0) {
            this.zzLe = zzLd;
            return;
        }
        double[] dArr = new double[i];
        if (i2 > 0) {
            zzZKV.zzZ(this.zzLe, 0, dArr, 0, i2);
        }
        this.zzLe = dArr;
    }

    private void zzK(int i, int i2) {
        zzZ4.zzY(0, FirebaseAnalytics.Param.INDEX);
        zzZ4.zzY(i2, C18293o1.f55803f);
        if (i2 > this.zzVf) {
            throw new IllegalArgumentException("The given index or/and count specify an invalid offset length.");
        }
    }

    private void zzYk(int i) {
        zzK(0, i);
        zzZKV.sort(this.zzLe, 0, i);
    }

    private boolean zzZ(zzQP zzqp) {
        if (zzZKO.zzA(null, zzqp)) {
            return false;
        }
        if (zzZKO.zzA(this, zzqp)) {
            return true;
        }
        if (this.zzVf != zzqp.zzVf) {
            return false;
        }
        for (int i = 0; i < this.zzVf; i++) {
            if (get(i) != zzqp.get(i)) {
                return false;
            }
        }
        return true;
    }

    private void zzZQ(int i) {
        zzZ4.zzZ(i, 0, this.zzVf - 1, FirebaseAnalytics.Param.INDEX);
    }

    public final void add(double d) {
        ensureCapacity(this.zzVf + 1);
        double[] dArr = this.zzLe;
        int i = this.zzVf;
        this.zzVf = i + 1;
        dArr[i] = d;
    }

    public boolean equals(Object obj) {
        if (zzZKO.zzA(null, obj)) {
            return false;
        }
        if (zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzQP.class) {
            return false;
        }
        return zzZ((zzQP) obj);
    }

    public final double get(int i) {
        zzZQ(i);
        return this.zzLe[i];
    }

    public final int getCount() {
        return this.zzVf;
    }

    public int hashCode() {
        int iZzZ9 = 0;
        for (double d : this.zzLe) {
            iZzZ9 = (iZzZ9 * 397) ^ zzZKP.zzZ9(d);
        }
        return iZzZ9;
    }

    public final void removeAt(int i) {
        zzZQ(i);
        int i2 = this.zzVf - 1;
        this.zzVf = i2;
        if (i < i2) {
            double[] dArr = this.zzLe;
            zzZKV.zzZ(dArr, i + 1, dArr, i, i2 - i);
        }
        this.zzLe[this.zzVf] = zzLc;
    }

    public final void sort() {
        zzYk(this.zzVf);
    }

    public final double[] toArray() {
        int i = this.zzVf;
        double[] dArr = new double[i];
        zzZKV.zzZ(this.zzLe, 0, dArr, 0, i);
        return dArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.zzVf; i++) {
            if (i != 0) {
                zzZNH.zzU(sb, " ");
            }
            sb.append(this.zzLe[i]);
        }
        return sb.toString();
    }
}
