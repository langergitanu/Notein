package com.aspose.words.internal;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes5.dex */
final class zzRQ {
    public static zzRU zzZ(zzZZ0 zzzz0, boolean z) throws Exception {
        zzzz0.zzXx("loca");
        zzZX0 zzzx0ZzZ = zzZX0.zzZ(zzzz0.zzrh(), zzzz0.zzrf().get("loca").zzci, z);
        zzRU zzru = new zzRU();
        zzZOR zzzor = new zzZOR();
        zzZOR zzzor2 = new zzZOR();
        zzZOR zzzor3 = new zzZOR();
        try {
            zzRP zzrp = new zzRP(zzzor, zzzor3, zzzor2);
            zzzz0.zzXx("glyf");
            int position = (int) zzzz0.zzq().getPosition();
            zzY0 zzy0Zzrh = zzzz0.zzrh();
            zzDB zzdbZzoI = zzzx0ZzZ.zzoI();
            int i = 0;
            while (i < zzdbZzoI.getCount() - 1) {
                int i2 = i + 1;
                if (i2 >= zzdbZzoI.getCount() || zzdbZzoI.get(i) != zzdbZzoI.get(i2)) {
                    zzy0Zzrh.zzq().zzH(zzzx0ZzZ.zzoI().get(i) + position);
                    zzZ(zzJ1.zzT(zzy0Zzrh), zzrp);
                } else {
                    zzrp.zzRd().zzj(0);
                }
                i = i2;
            }
            zzru.zzw(zzzor.zzWy());
            zzru.zzv(zzzor3.zzWy());
            zzru.zzu(zzzor2.zzWy());
            zzzor.close();
            zzzor2.close();
            zzzor3.close();
            return zzru;
        } catch (Throwable th) {
            zzzor.close();
            zzzor2.close();
            zzzor3.close();
            throw th;
        }
    }

    private static void zzZ(zzJ1 zzj1, zzRP zzrp) throws Exception {
        if (zzj1.zzz1 >= 0) {
            zzZ((zzZYX) zzj1, zzrp);
        } else {
            zzZ((zzSS) zzj1, zzrp);
        }
    }

    private static void zzZ(zzSS zzss, zzRP zzrp) throws Exception {
        zzss.zzW(zzrp.zzRd());
        zzrp.zzRd().writeBytes(zzss.zzPi);
        if (zzss.zzPg) {
            zzZ(zzss.zzPh, zzrp);
        }
    }

    private static void zzZ(zzZYX zzzyx, zzRP zzrp) throws Exception {
        zzrp.zzRd().zzj(zzzyx.zzz1);
        if (zzzyx.isEmpty()) {
            return;
        }
        int i = 0;
        int i2 = -1;
        for (zzZX4 zzzx4 : zzzyx.zzch) {
            i2++;
            if (zzzx4.zzoN()) {
                zzZVZ.zzZ(((short) i2) & 65535, zzrp.zzRd());
                i2 = 0;
            }
        }
        int length = zzzyx.zzch.length;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            zzZX4 zzzx42 = zzzyx.zzch[i3];
            bArr[i3] = zzZWE.zzZs(zzzx42.zzoQ(), zzzx42.zzoP());
            if (!zzzx42.zzoO()) {
                bArr[i3] = (byte) (bArr[i3] | UnsignedBytes.MAX_POWER_OF_TWO);
            }
            zzrp.zzRd().writeByte(bArr[i3]);
        }
        zzXV zzxv = new zzXV(zzrp.zzRd().zzq(), true);
        while (true) {
            zzZX4[] zzzx4Arr = zzzyx.zzch;
            if (i < zzzx4Arr.length) {
                zzZWE.zzZ(zzxv, bArr[i], zzzx4Arr[i]);
                i++;
            } else {
                zzxv.flush();
                zzZ(zzzyx.zzPh, zzrp);
                return;
            }
        }
    }

    private static void zzZ(byte[] bArr, zzRP zzrp) throws Exception {
        zzZOR zzzor = new zzZOR(bArr);
        try {
            zzY0 zzy0 = new zzY0(zzzor);
            zzDB zzdbZzq = zzZX1.zzq(zzy0);
            zzZVZ.zzZ(((short) zzdbZzq.getCount()) & 65535, zzrp.zzRd());
            int length = ((short) (zzzor.getLength() - zzzor.getPosition())) & 65535;
            zzZVZ.zzZ(length, zzrp.zzRd());
            zzZ(zzdbZzq, zzrp.zzRc());
            byte[] bArrZzn = zzy0.zzn(length);
            zzrp.zzRb().zzW(bArrZzn, bArrZzn.length);
        } finally {
            zzzor.close();
        }
    }

    private static void zzZ(zzDB zzdb, zzXZ zzxz) throws Exception {
        int i;
        int i2;
        int i3 = 0;
        while (i3 < zzdb.getCount()) {
            int i4 = zzdb.get(i3);
            int i5 = i3 - 2;
            byte b = -5;
            if (i5 >= 0 && (i2 = i3 + 2) < zzdb.getCount() && zzdb.get(i5) == i4 && zzdb.get(i2) == i4) {
                int i6 = i3 + 4;
                if (i6 < zzdb.getCount() && zzdb.get(i6) == i4) {
                    b = -4;
                }
                zzxz.writeByte(b);
                zzZYY.zzZ((short) zzdb.get(i3 + 1), zzxz);
                i = i3 + 3;
                if (b == -4) {
                    zzZYY.zzZ((short) zzdb.get(i), zzxz);
                    i3 += 5;
                } else {
                    i3 = i;
                }
            } else {
                int i7 = i3 + 4;
                if (i7 < zzdb.getCount() && zzdb.get(i3 + 2) == i4 && zzdb.get(i7) == i4) {
                    zzZYY.zzZ((short) i4, zzxz);
                    zzZYY.zzZ((short) zzdb.get(i3 + 1), zzxz);
                    int i8 = i3 + 6;
                    if (i8 < zzdb.getCount() && zzdb.get(i8) == i4) {
                        b = -4;
                    }
                    zzxz.writeByte(b);
                    zzZYY.zzZ((short) zzdb.get(i3 + 3), zzxz);
                    i = i3 + 5;
                    if (b == -4) {
                        zzZYY.zzZ((short) zzdb.get(i), zzxz);
                        i3 += 7;
                    } else {
                        i3 = i;
                    }
                } else {
                    i = i3 + 1;
                    zzZYY.zzZ((short) zzdb.get(i3), zzxz);
                    i3 = i;
                }
            }
        }
    }
}
