package com.aspose.words;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes6.dex */
final class zzYA7 {
    private int zzVf;
    private zzYA8[] zzXbV;
    private static zzYA8[] zzXbU = new zzYA8[0];
    private static zzYA8 zzXbT = new zzYA8();

    public zzYA7() {
        this.zzXbV = zzXbU;
    }

    private void ensureCapacity(int i) {
        zzYA8[] zzya8Arr = this.zzXbV;
        if (zzya8Arr.length >= i) {
            return;
        }
        int length = zzya8Arr.length == 0 ? 4 : zzya8Arr.length * 2;
        if (length >= i) {
            i = length;
        }
        zzH(i);
    }

    private void zzH(int i) {
        if (i == this.zzXbV.length) {
            return;
        }
        com.aspose.words.internal.zzZ4.zzY(i, "value");
        int i2 = this.zzVf;
        if (i < i2) {
            throw new IllegalArgumentException("The specified capacity is less than the current size.\r\nParameter name: value");
        }
        if (i <= 0) {
            this.zzXbV = zzXbU;
            return;
        }
        zzYA8[] zzya8Arr = new zzYA8[i];
        if (i2 > 0) {
            com.aspose.words.internal.zzZKV.zzZ(this.zzXbV, 0, zzya8Arr, 0, i2);
        }
        this.zzXbV = zzya8Arr;
    }

    public static zzYA7 zzY5n() {
        return new zzYA7((byte) 0);
    }

    private void zzZQ(int i) {
        com.aspose.words.internal.zzZ4.zzZ(i, 0, this.zzVf - 1, FirebaseAnalytics.Param.INDEX);
    }

    public final int getCount() {
        return this.zzVf;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.zzVf; i++) {
            if (i != 0) {
                com.aspose.words.internal.zzZNH.zzU(sb, " ");
            }
            com.aspose.words.internal.zzZNH.zzZ(sb, this.zzXbV[i]);
        }
        return sb.toString();
    }

    public final void zzZ(zzYA8 zzya8) {
        ensureCapacity(this.zzVf + 1);
        zzYA8[] zzya8Arr = this.zzXbV;
        int i = this.zzVf;
        this.zzVf = i + 1;
        zzya8Arr[i] = zzya8;
    }

    public final zzYA8 zzlF(int i) {
        zzZQ(i);
        return this.zzXbV[i];
    }

    private zzYA7(byte b) {
        com.aspose.words.internal.zzZ4.zzY(16, "capacity");
        this.zzXbV = new zzYA8[16];
    }
}
