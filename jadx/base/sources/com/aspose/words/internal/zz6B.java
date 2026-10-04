package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz6B {
    private static int zzlm = zzSA.zzw(2.0d);
    private static long[] zzln;

    static {
        long[] jArr = new long[20];
        zzln = jArr;
        jArr[0] = zzSA.zzR(8.5d, 11.0d);
        zzln[1] = zzSA.zzR(8.5d, 14.0d);
        zzln[2] = zzSA.zzS(210.0d, 297.0d);
        zzln[3] = zzSA.zzR(7.25d, 10.5d);
        zzln[4] = zzSA.zzR(17.0d, 11.0d);
        zzln[5] = zzSA.zzS(297.0d, 420.0d);
        zzln[6] = zzSA.zzR(4.1d, 9.5d);
        zzln[7] = zzSA.zzR(3.875d, 7.5d);
        zzln[8] = zzSA.zzS(162.0d, 229.0d);
        zzln[9] = zzSA.zzS(110.0d, 220.0d);
        zzln[10] = zzSA.zzS(257.0d, 364.0d);
        zzln[11] = zzSA.zzS(182.0d, 257.0d);
        zzln[12] = zzSA.zzS(176.0d, 250.0d);
        zzln[14] = zzSA.zzS(100.0d, 148.0d);
        zzln[15] = zzSA.zzS(200.0d, 148.0d);
        zzln[16] = zzSA.zzS(148.0d, 210.0d);
        zzln[17] = zzSA.zzS(105.0d, 148.0d);
        zzln[18] = zzSA.zzS(128.0d, 182.0d);
    }

    public static short[] zzQ(zzOU zzou) {
        int length = zzou.zzNH().length;
        int i = length % 2 == 1 ? length + 1 : length;
        short[] sArr = new short[i];
        for (int i2 = 0; i2 < length; i2++) {
            sArr[i2] = zza(zzou.zzNH()[i2]);
        }
        if (length != i) {
            sArr[length] = 0;
        }
        return sArr;
    }

    public static byte zzR(zzOU zzou) {
        int iZzNM = zzou.zzNM();
        if (iZzNM == 0) {
            return (byte) 0;
        }
        if (iZzNM == 1) {
            return (byte) 2;
        }
        if (iZzNM != 2) {
            return iZzNM != 3 ? (byte) 3 : (byte) 0;
        }
        return (byte) 1;
    }

    public static byte zzS(zzOU zzou) {
        int endCap = zzou.getEndCap();
        if (endCap == 0) {
            return (byte) 0;
        }
        if (endCap != 1) {
            if (endCap != 2) {
                if (endCap == 3) {
                    return (byte) 3;
                }
                if (endCap == 240 || endCap == 255) {
                    return (byte) 0;
                }
                switch (endCap) {
                    case 16:
                    case 19:
                    case 20:
                        return (byte) 0;
                    case 17:
                        break;
                    case 18:
                        break;
                    default:
                        return (byte) 2;
                }
            }
            return (byte) 1;
        }
        return (byte) 2;
    }

    public static int zzX(int i, int i2, boolean z) {
        boolean z2;
        int i3 = 0;
        while (true) {
            long[] jArr = zzln;
            if (i3 >= jArr.length) {
                return 19;
            }
            if (i3 != 19) {
                long j = jArr[i3];
                z2 = z;
                if (zzJ6.zzZ(zzZPW.zzG((int) j, (int) (j >>> 32)), zzZPW.zzG(i, i2), z2, zzlm)) {
                    return i3;
                }
            } else {
                z2 = z;
            }
            i3++;
            z = z2;
        }
    }

    public static short zza(float f) {
        return zzZQB.zzRs(zzZQB.zzZk(f));
    }
}
