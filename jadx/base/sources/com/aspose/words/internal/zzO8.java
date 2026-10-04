package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
class zzO8 extends zzZOX {
    public zzO8(zzZOP zzzop) {
        super(zzzop);
    }

    private int[] zzXQ(int i) throws Exception {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = zzXc();
        }
        return iArr;
    }

    public final zz82 zzMP() throws Exception {
        return new zz82(zzXc(), zzXc(), zzXc(), zzXc());
    }

    public final zzP9 zzMQ() throws Exception {
        return new zzP9(Float.intBitsToFloat(zzXc()), Float.intBitsToFloat(zzXc()), Float.intBitsToFloat(zzXc()), Float.intBitsToFloat(zzXc()), Float.intBitsToFloat(zzXc()), Float.intBitsToFloat(zzXc()));
    }

    public final long[][] zzMR() throws Exception {
        int iZzXc = zzXc();
        zzXc();
        long[][] jArr = new long[iZzXc][];
        int[] iArrZzXQ = zzXQ(iZzXc);
        for (int i = 0; i < iZzXc; i++) {
            jArr[i] = zzXJ(iArrZzXQ[i]);
        }
        return jArr;
    }

    public final long[][] zzMS() throws Exception {
        int iZzXc = zzXc();
        zzXc();
        long[][] jArr = new long[iZzXc][];
        int[] iArrZzXQ = zzXQ(iZzXc);
        for (int i = 0; i < iZzXc; i++) {
            jArr[i] = zzXK(iArrZzXQ[i]);
        }
        return jArr;
    }

    public final long[] zzMT() throws Exception {
        return zzXJ(zzXc());
    }

    public final long[] zzMU() throws Exception {
        return zzXK(zzXc());
    }

    public final zzPV zzMV() throws Exception {
        int iZzX6 = zzX6() & 255;
        int iZzX62 = zzX6() & 255;
        return new zzPV(zzX6() & 255, zzX6() & 255, iZzX62, iZzX6);
    }

    public final zzPV zzMW() throws Exception {
        int iZzX6 = zzX6() & 255;
        int iZzX62 = zzX6() & 255;
        int iZzX63 = zzX6() & 255;
        zzX6();
        return new zzPV(iZzX6, iZzX62, iZzX63);
    }

    public final zzZQ4 zzMX() throws Exception {
        return new zzZQ4(Float.intBitsToFloat(zzXc()), Float.intBitsToFloat(zzXc()), Float.intBitsToFloat(zzXc()), Float.intBitsToFloat(zzXc()));
    }

    public final zzZQ4 zzMY() throws Exception {
        int iZzXc = zzXc();
        int iZzXc2 = zzXc();
        int iZzXc3 = zzXc();
        int iZzXc4 = zzXc();
        return zzZQ4.zzX(Math.min(iZzXc, iZzXc3), Math.min(iZzXc2, iZzXc4), Math.max(iZzXc, iZzXc3), Math.max(iZzXc2, iZzXc4));
    }

    public final long zzMZ() throws Exception {
        return zzZPW.zzG(zzXc(), zzXc());
    }

    public final long zzN0() throws Exception {
        return zzZPY.zzG(Float.intBitsToFloat(zzXc()), Float.intBitsToFloat(zzXc()));
    }

    public final long zzN1() throws Exception {
        return zzZPY.zzG(zzXc(), zzXc());
    }

    public final int[] zzN2() throws Exception {
        return zzXQ(zzXc());
    }

    public final int[] zzXI(int i) throws Exception {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = zzX6() & 255;
        }
        return iArr;
    }

    public final long[] zzXJ(int i) throws Exception {
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = zzZPY.zzG(zzXa(), zzXa());
        }
        return jArr;
    }

    public final long[] zzXK(int i) throws Exception {
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = zzZPY.zzG(zzXc(), zzXc());
        }
        return jArr;
    }

    public final long[] zzXL(int i) throws Exception {
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = zzN0();
        }
        return jArr;
    }

    public final String zzXM(int i) throws Exception {
        byte[] bArrZzn = zzn(i);
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrZzn) {
            sb.append((char) (b & 255));
        }
        return sb.toString();
    }

    public final String zzXN(int i) throws Exception {
        return zzZO0.zzhU().zzZn(zzn(i * 2));
    }

    public final float[] zzXO(int i) throws Exception {
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = Float.intBitsToFloat(zzXc());
        }
        return fArr;
    }

    public final int[] zzXP(int i) throws Exception {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = zzXa();
        }
        return iArr;
    }
}
