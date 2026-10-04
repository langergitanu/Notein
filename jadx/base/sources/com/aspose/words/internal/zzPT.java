package com.aspose.words.internal;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
public final class zzPT {
    private float[][] zzHX;

    public zzPT() {
        this(true);
    }

    public static zzPT zzZ(zzPT zzpt, zzPT zzpt2) {
        if (zzpt == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: leftMatrix");
        }
        if (zzpt2 == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: rightMatrix");
        }
        zzPT zzpt3 = new zzPT(false);
        for (int i = 0; i < 5; i++) {
            for (int i2 = 0; i2 < 5; i2++) {
                for (int i3 = 0; i3 < 5; i3++) {
                    zzpt3.set(i, i2, (zzpt2.get(i3, i2) * zzpt.get(i, i3)) + zzpt3.get(i, i2));
                }
            }
        }
        return zzpt3;
    }

    public final float get(int i, int i2) {
        return this.zzHX[i][i2];
    }

    public final void set(int i, int i2, float f) {
        if (i > 4 || i2 > 4) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: DrColorMatrix has size 5x5.");
        }
        this.zzHX[i][i2] = f;
    }

    public final boolean zzPw() {
        for (int i = 0; i < 5; i++) {
            for (int i2 = 0; i2 < 5; i2++) {
                float f = this.zzHX[i][i2];
                if ((i == i2 && f != 1.0f) || (i != i2 && f != 0.0f)) {
                    return false;
                }
            }
        }
        return true;
    }

    public zzPT(float[][] fArr) {
        this.zzHX = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 5, 5);
        for (int i = 0; i < 5; i++) {
            for (int i2 = 0; i2 < 5; i2++) {
                this.zzHX[i][i2] = fArr[i][i2];
            }
        }
    }

    private zzPT(boolean z) {
        this.zzHX = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 5, 5);
        if (z) {
            for (int i = 0; i < 5; i++) {
                this.zzHX[i][i] = 1.0f;
            }
        }
    }

    public static zzPV zzZ(zzPV zzpv, zzPT zzpt) {
        return new zzPV(zzAN.zzZE((zzpt.get(4, 3) * 255.0f) + (zzpt.get(3, 3) * zzpv.zzPD()) + (zzpt.get(2, 3) * zzpv.zzPA()) + (zzpt.get(1, 3) * zzpv.zzPB()) + (zzpt.get(0, 3) * zzpv.zzPC())), zzAN.zzZE((zzpt.get(4, 0) * 255.0f) + (zzpt.get(3, 0) * zzpv.zzPD()) + (zzpt.get(2, 0) * zzpv.zzPA()) + (zzpt.get(1, 0) * zzpv.zzPB()) + (zzpt.get(0, 0) * zzpv.zzPC())), zzAN.zzZE((zzpt.get(4, 1) * 255.0f) + (zzpt.get(3, 1) * zzpv.zzPD()) + (zzpt.get(2, 1) * zzpv.zzPA()) + (zzpt.get(1, 1) * zzpv.zzPB()) + (zzpt.get(0, 1) * zzpv.zzPC())), zzAN.zzZE((zzpt.get(4, 2) * 255.0f) + (zzpt.get(3, 2) * zzpv.zzPD()) + (zzpt.get(2, 2) * zzpv.zzPA()) + (zzpt.get(1, 2) * zzpv.zzPB()) + (zzpt.get(0, 2) * zzpv.zzPC())));
    }
}
