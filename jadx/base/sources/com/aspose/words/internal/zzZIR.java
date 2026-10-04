package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZIR {
    static zzZIR zzZJb;
    static zzZIR zzZJc;
    static zzZIR zzZJd;
    private int type;
    private int zzZJm;

    public zzZIR(int i, int i2) {
        this.type = i;
        this.zzZJm = i2;
    }

    public static zzZIR zzPE(int i) {
        zzZIR zzzir;
        zzZIR zzzir2;
        zzZIR zzzir3;
        if (i == 1000) {
            synchronized (zzZIR.class) {
                try {
                    if (zzZJd == null) {
                        zzZJd = new zzZIG(5, 3);
                    }
                    zzzir = zzZJd;
                } finally {
                }
            }
            return zzzir;
        }
        if (i == 1003) {
            synchronized (zzZIR.class) {
                try {
                    if (zzZJc == null) {
                        zzZJc = new zzZIG(6, 1);
                    }
                    zzzir2 = zzZJc;
                } finally {
                }
            }
            return zzzir2;
        }
        if (i != 1004) {
            throw new IllegalArgumentException("Unknown color space");
        }
        synchronized (zzZIR.class) {
            try {
                if (zzZJb == null) {
                    zzZJb = new zzZIG(5, 3, true);
                }
                zzzir3 = zzZJb;
            } finally {
            }
        }
        return zzzir3;
    }

    public final float getMaxValue(int i) {
        if (i < 0 || i > this.zzZJm - 1) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Component index out of range: "));
        }
        return 1.0f;
    }

    public final float getMinValue(int i) {
        if (i < 0 || i > this.zzZJm - 1) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Component index out of range: "));
        }
        return 0.0f;
    }

    public final int getType() {
        return this.type;
    }

    public abstract float[] zzM(float[] fArr);

    public final int zzd4() {
        return this.zzZJm;
    }
}
