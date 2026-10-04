package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zz3P {
    private zzZXH zzhY;

    public zz3P(zzZXH zzzxh) {
        this.zzhY = zzzxh;
    }

    private int zzTY(int i) {
        return zz3Q.zzZP(i, this.zzhY.zzpO());
    }

    private int zzTZ(int i) {
        byte b = (byte) i;
        if (!zz1E.zzI(b)) {
            return 0;
        }
        int iZzH = zz1E.zzH(b);
        if (zzTX(iZzH)) {
            return this.zzhY.zzpP().zzSx(iZzH).zzoZ();
        }
        return 0;
    }

    public abstract boolean isEmbedded();

    public abstract void zzF(zzFY zzfy) throws Exception;

    public final zzZXH zzPl() {
        return this.zzhY;
    }

    public abstract boolean zzTX(int i);

    public abstract void zzY(int i, int[] iArr);

    public final int[] zzZN(int i, int i2) {
        int[] iArr = new int[(i2 - i) + 1];
        for (int i3 = i; i3 <= i2; i3++) {
            iArr[i3 - i] = zzTY(zzTZ(i3));
        }
        return iArr;
    }

    public abstract void zzZO(int i, int i2);

    public abstract zz5G zzum();
}
