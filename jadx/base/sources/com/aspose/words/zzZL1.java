package com.aspose.words;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: loaded from: classes6.dex */
final class zzZL1 {
    private int zzL4;
    private int zzZn;

    public zzZL1() {
        this(0, 0);
    }

    public final int getType() {
        return this.zzL4;
    }

    public final int getValue() {
        return this.zzZn;
    }

    public final int zzZ51() {
        int i = this.zzL4;
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? i != 5 ? this.zzZn : this.zzZn + 256 : this.zzZn + 3;
        }
        return 2;
    }

    public zzZL1(int i, int i2) {
        this.zzL4 = i;
        this.zzZn = i2;
    }

    public zzZL1(int i) {
        this.zzZn = 0;
        if (i == 0) {
            this.zzL4 = 1;
            return;
        }
        if (i == 1) {
            this.zzL4 = 2;
            return;
        }
        if (i == 2) {
            this.zzL4 = 3;
            return;
        }
        if (i >= 3 && i <= 132) {
            this.zzL4 = 4;
            this.zzZn = i - 3;
        } else {
            this.zzL4 = 5;
            this.zzZn = i + InputDeviceCompat.SOURCE_ANY;
        }
    }
}
