package com.aspose.words.internal;

import Oooo0oO.C21034OooOOOo;
import androidx.core.view.InputDeviceCompat;

/* JADX INFO: loaded from: classes5.dex */
final class zzAV {
    private static int zzY(zzAU zzau, int i) throws Exception {
        int iOooO00o = C21034OooOOOo.OooO00o(i, 256, 8, 1);
        int iZzZ = 0;
        for (int i2 = 0; i2 < iOooO00o; i2++) {
            iZzZ = (iZzZ << 3) + zzau.zzAY().zzZ();
        }
        return iZzZ + 1;
    }

    private static byte[] zzZ(zzXW zzxw, int i) throws Exception {
        if (i == 0) {
            return zzZ1.zzXW;
        }
        zzZOR zzzor = new zzZOR(i);
        try {
            zzAU zzau = new zzAU(i, zzxw);
            while (zzzor.getPosition() < i) {
                int iZzZ = zzau.zzAW().zzZ();
                if (iZzZ < 256) {
                    zzzor.writeByte((byte) iZzZ);
                } else if (iZzZ == zzau.zzAV()) {
                    zzzor.writeByte(zzZ(zzau, zzzor, 2));
                } else if (iZzZ == zzau.zzAU()) {
                    zzzor.writeByte(zzZ(zzau, zzzor, 4));
                } else if (iZzZ == zzau.zzAT()) {
                    zzzor.writeByte(zzZ(zzau, zzzor, 6));
                } else {
                    int iZzZ2 = zzZ(zzau, iZzZ);
                    if (zzY(zzau, iZzZ) >= 512) {
                        iZzZ2++;
                    }
                    byte[] bArrZzZ = zzZ(zzau, zzzor, (r6 + iZzZ2) - 1, iZzZ2);
                    zzzor.write(bArrZzZ, 0, bArrZzZ.length);
                }
            }
            byte[] bArrZzWy = zzzor.zzWy();
            zzzor.close();
            return bArrZzWy;
        } catch (Throwable th) {
            zzzor.close();
            throw th;
        }
    }

    private static byte[] zzZq(byte[] bArr) throws Exception {
        if (bArr == null || bArr.length == 0) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: data");
        }
        zzZOR zzzor = new zzZOR(bArr);
        try {
            zzXW zzxw = new zzXW(zzzor, true);
            boolean zZzX0 = zzxw.zzX0();
            byte[] bArrZzZ = zzZ(zzxw, (int) zzxw.zza(24));
            return zZzX0 ? zzZZB.decode(bArrZzZ) : bArrZzZ;
        } finally {
            zzzor.close();
        }
    }

    public static byte[] zzZr(byte[] bArr) throws Exception {
        return zzZq(bArr);
    }

    private static byte zzZ(zzAU zzau, zzZOP zzzop, int i) throws Exception {
        return zzZ(zzau, zzzop, i, 1)[0];
    }

    private static byte[] zzZ(zzAU zzau, zzZOP zzzop, int i, int i2) throws Exception {
        long j = i;
        if (zzzop.getPosition() - j < -7168) {
            throw new IllegalStateException("Invalid copy item offset.");
        }
        if (i2 <= i) {
            byte[] bArr = new byte[i2];
            long position = zzzop.getPosition() - j;
            if (position < 0) {
                long j2 = position + 7168;
                System.arraycopy(zzau.zzAZ(), (int) j2, bArr, 0, (int) Math.min(7168 - j2, i2));
            }
            long j3 = ((long) i2) + position;
            if (j3 > 0) {
                long jMax = Math.max(0L, position);
                int i3 = (int) (j3 - jMax);
                zzZKV.zzZ(zzZ(zzzop, jMax, i3), 0, bArr, i2 - i3, i3);
            }
            return bArr;
        }
        throw new IllegalStateException("Invalid copy item length.");
    }

    private static byte[] zzZ(zzZOP zzzop, long j, int i) throws Exception {
        long position = zzzop.getPosition();
        byte[] bArr = new byte[i];
        zzzop.zzH(j);
        zzzop.read(bArr, 0, i);
        zzzop.zzH(position);
        return bArr;
    }

    private static int zzZ(zzAU zzau, int i) throws Exception {
        int iZzZ = (i + InputDeviceCompat.SOURCE_ANY) % 8;
        int i2 = 0;
        while (true) {
            i2 = (i2 << 2) + (iZzZ & 3);
            if ((iZzZ & 4) == 0) {
                return i2 + 2;
            }
            iZzZ = zzau.zzAX().zzZ();
        }
    }
}
