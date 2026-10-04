package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZV1 extends zzZOX {
    public zzZV1(zzZOP zzzop) {
        super(zzzop);
    }

    private long[] zzXK(int i) throws Exception {
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = zzZPY.zzG(zzXa(), zzXa());
        }
        return jArr;
    }

    private int[] zzXQ(int i) throws Exception {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = zzXa();
        }
        return iArr;
    }

    public final zz82 zzMP() throws Exception {
        return new zz82(zzXa(), zzXa(), zzXa(), zzXa());
    }

    public final long[][] zzMS() throws Exception {
        int iZzXa = zzXa() & 65535;
        long[][] jArr = new long[iZzXa][];
        int[] iArrZzXQ = zzXQ(iZzXa);
        for (int i = 0; i < iZzXa; i++) {
            jArr[i] = zzXK(iArrZzXQ[i]);
        }
        return jArr;
    }

    public final long[] zzMU() throws Exception {
        return zzXK(zzXa() & 65535);
    }

    public final zzPV zzMW() throws Exception {
        int iZzX6 = zzX6() & 255;
        int iZzX62 = zzX6() & 255;
        int iZzX63 = zzX6() & 255;
        zzX6();
        return new zzPV(iZzX6, iZzX62, iZzX63);
    }

    public final zzZQ4 zzMY() throws Exception {
        int[] iArrZzXQ = zzXQ(4);
        return zzZQ4.zzX(iArrZzXQ[0], iArrZzXQ[1], iArrZzXQ[2], iArrZzXQ[3]);
    }

    public final long zzMZ() throws Exception {
        return zzZPW.zzG(zzXa(), zzXa());
    }

    public final long zzN1() throws Exception {
        return zzZPY.zzG(zzXa(), zzXa());
    }

    public final int[] zzXP(int i) throws Exception {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = zzXa();
        }
        return iArr;
    }

    public final zzZQ5 zzmZ() throws Exception {
        int[] iArrZzXQ = zzXQ(4);
        return new zzZQ5(iArrZzXQ[3], iArrZzXQ[2], iArrZzXQ[1], iArrZzXQ[0]);
    }

    public final zzZQ4 zzn0() throws Exception {
        int[] iArrZzXQ = zzXQ(4);
        return zzAN.zzv(zzZQ4.zzX(iArrZzXQ[3], iArrZzXQ[2], iArrZzXQ[1], iArrZzXQ[0]));
    }
}
