package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzRS {
    private static byte[] zzW(zzRR zzrr) throws Exception {
        int iZzo = zzZVZ.zzo(zzrr.zzRg());
        int iZzo2 = zzZVZ.zzo(zzrr.zzRg());
        zzZOR zzzor = new zzZOR();
        try {
            zzXZ zzxz = new zzXZ(zzzor);
            zzZX1.zzZ(zzxz, zzW(zzrr.zzRf(), iZzo));
            byte[] bArrZzn = zzrr.zzRe().zzn(iZzo2);
            zzxz.zzW(bArrZzn, bArrZzn.length);
            return zzzor.zzWy();
        } finally {
            zzzor.close();
        }
    }

    private static zzJ1 zzX(zzRR zzrr) throws Exception {
        short sZzXa = zzrr.zzRg().zzXa();
        zzZYX zzzyx = new zzZYX();
        int i = 0;
        boolean z = sZzXa == Short.MAX_VALUE;
        if (z) {
            zzzyx.zzz1 = zzrr.zzRg().zzXa();
            zzzyx.zzBm = zzrr.zzRg().zzXa();
            zzzyx.zzBl = zzrr.zzRg().zzXa();
            zzzyx.zzBk = zzrr.zzRg().zzXa();
            zzzyx.zzBj = zzrr.zzRg().zzXa();
        } else {
            zzzyx.zzz1 = sZzXa;
        }
        if (!zzzyx.isEmpty()) {
            zzDB zzdb = new zzDB(zzzyx.zzz1);
            int iZzo = 0;
            for (int i2 = 0; i2 < zzzyx.zzz1; i2++) {
                iZzo += zzZVZ.zzo(zzrr.zzRg());
                zzdb.add(iZzo);
            }
            int i3 = iZzo + 1;
            byte[] bArrZzn = zzrr.zzRg().zzn(i3);
            zzzyx.zzch = new zzZX4[i3];
            int i4 = 0;
            int i5 = 0;
            while (i < i3) {
                zzRO zzroZzZ = zzRO.zzZ(zzrr.zzRg(), bArrZzn[i]);
                short s = zzroZzZ.zzNb;
                int i6 = i4 + s;
                short s2 = zzroZzZ.zzNa;
                int i7 = i5 + s2;
                zzzyx.zzch[i] = new zzZX4(s, s2, i6, i7, zzroZzZ.zzN9, zzdb.contains(i));
                i++;
                i4 = i6;
                i5 = i7;
            }
            if (!z) {
                zzzyx.zzre();
            }
            zzzyx.zzPh = zzW(zzrr);
        }
        return zzzyx;
    }

    private static zzJ1 zzY(zzRR zzrr) throws Exception {
        short sZzXa = zzrr.zzRg().zzXa();
        zzSS zzss = new zzSS();
        zzss.zzz1 = sZzXa;
        zzss.zzBm = zzrr.zzRg().zzXa();
        zzss.zzBl = zzrr.zzRg().zzXa();
        zzss.zzBk = zzrr.zzRg().zzXa();
        zzss.zzBj = zzrr.zzRg().zzXa();
        zzss.zzW(zzrr.zzRg());
        if (zzss.zzPg) {
            zzss.zzPh = zzW(zzrr);
        }
        return zzss;
    }

    public static void zzZ(zzZZ2 zzzz2, byte[] bArr, byte[] bArr2, byte[] bArr3, zzK1 zzk1) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        zzZOR zzzor2 = new zzZOR(bArr2);
        zzZOR zzzor3 = new zzZOR(bArr3);
        try {
            zzRR zzrr = new zzRR(zzzor, zzzor2, zzzor3);
            zzZOR zzzor4 = new zzZOR();
            try {
                zzXZ zzxz = new zzXZ(zzzor4);
                zzZX0 zzzx0 = new zzZX0();
                while (zzzor.getPosition() < zzzor.getLength()) {
                    zzzx0.zzoI().add((int) zzzor4.getPosition());
                    zzJ1 zzj1ZzZ = zzZ(zzrr);
                    if (!zzj1ZzZ.isEmpty()) {
                        zzj1ZzZ.zzX(zzxz);
                    }
                    zzZYQ.zzV(zzzor4, 4);
                }
                zzzx0.zzoI().add((int) zzzor4.getPosition());
                zzzx0.zzoJ();
                zzk1.zz7(zzzx0.zzHW());
                zzzz2.zzZ("glyf", zzzor4.zzWy());
                zzzz2.zzZ("loca", zzzx0.toByteArray());
                zzzor4.close();
            } catch (Throwable th) {
                zzzor4.close();
                throw th;
            }
        } finally {
            zzzor.close();
            zzzor2.close();
            zzzor3.close();
        }
    }

    private static short[] zzW(zzY0 zzy0, int i) throws Exception {
        short[] sArr = new short[i];
        int i2 = 0;
        while (i2 < i) {
            short s = (short) (zzy0.readByte() & 255);
            if (s == 251) {
                short s2 = sArr[i2 - 2];
                sArr[i2] = s2;
                int i3 = i2 + 2;
                sArr[i2 + 1] = zzZYY.zzt(zzy0);
                i2 += 3;
                sArr[i3] = s2;
            } else if (s == 252) {
                short s3 = sArr[i2 - 2];
                sArr[i2] = s3;
                sArr[i2 + 1] = zzZYY.zzt(zzy0);
                sArr[i2 + 2] = s3;
                int i4 = i2 + 4;
                sArr[i2 + 3] = zzZYY.zzt(zzy0);
                i2 += 5;
                sArr[i4] = s3;
            } else {
                zzy0.zzq().zzH(zzy0.zzq().getPosition() - 1);
                sArr[i2] = zzZYY.zzt(zzy0);
                i2++;
            }
        }
        return sArr;
    }

    private static zzJ1 zzZ(zzRR zzrr) throws Exception {
        short sZzXa = zzrr.zzRg().zzXa();
        zzrr.zzRg().zzq().zzH(zzrr.zzRg().zzq().getPosition() - 2);
        if (sZzXa >= 0) {
            return zzX(zzrr);
        }
        return zzY(zzrr);
    }
}
