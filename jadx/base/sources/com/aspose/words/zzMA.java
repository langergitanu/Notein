package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzMA {
    private int zzZoD;
    private int zzZoE;
    private int zzyo;
    static zzMA zzZoG = new zzMA(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    static zzMA zzZoF = new zzMA(0, 0, 0);

    public zzMA(int i, int i2, int i3) {
        this.zzyo = i;
        this.zzZoE = i2;
        this.zzZoD = i3;
    }

    private static int zzYe(int i, int i2) {
        int i3 = i + i2;
        if (i3 >= 0) {
            return i3;
        }
        return Integer.MAX_VALUE;
    }

    public final String toString() {
        if (this.zzyo == Integer.MAX_VALUE && this.zzZoE == Integer.MAX_VALUE && this.zzZoD == Integer.MAX_VALUE) {
            return "inline";
        }
        return this.zzyo + "." + this.zzZoE + "." + this.zzZoD;
    }

    public final int zzY(zzMA zzma) {
        if (zzma == null) {
            return 1;
        }
        int iZzZ7 = com.aspose.words.internal.zzZKR.zzZ7(this.zzyo, zzma.zzyo);
        if (iZzZ7 != 0) {
            return iZzZ7;
        }
        int iZzZ72 = com.aspose.words.internal.zzZKR.zzZ7(this.zzZoE, zzma.zzZoE);
        return iZzZ72 != 0 ? iZzZ72 : com.aspose.words.internal.zzZKR.zzZ7(this.zzZoD, zzma.zzZoD);
    }

    public final zzMA zzZ(zzMA zzma) {
        return new zzMA(zzYe(this.zzyo, zzma.zzyo), zzYe(this.zzZoE, zzma.zzZoE), zzYe(this.zzZoD, zzma.zzZoD));
    }
}
