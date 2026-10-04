package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZYQ {
    public static boolean zzT(zzZOX zzzox, int i) throws Exception {
        return ((long) i) <= zzzox.zzq().getLength() - zzzox.zzq().getPosition();
    }

    public static byte[] zzU(zzZOP zzzop, int i) throws Exception {
        long position = zzzop.getPosition();
        byte[] bArr = new byte[i];
        zzzop.read(bArr, 0, i);
        zzzop.zzH(position);
        return bArr;
    }

    public static void zzV(zzZOP zzzop, int i) throws Exception {
        long jZzN = zzAN.zzN(zzzop.getPosition(), i);
        if (zzzop.getLength() < jZzN) {
            zzzop.setLength(jZzN);
        }
        zzzop.zzH(jZzN);
    }

    public static void zzX(zzZOP zzzop, zzZOP zzzop2) throws Exception {
        if (zzzop == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: srcStream");
        }
        if (zzzop2 == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: dstStream");
        }
        byte[] bArr = new byte[65536];
        while (true) {
            int i = zzzop.read(bArr, 0, 65536);
            if (i <= 0) {
                return;
            } else {
                zzzop2.write(bArr, 0, i);
            }
        }
    }

    public static void zzY(String str, zzZOP zzzop) throws Exception {
        for (int i = 0; i < str.length(); i++) {
            zzzop.writeByte((byte) str.charAt(i));
        }
    }

    public static void zzZ(int i, zzZOP zzzop) throws Exception {
        for (int i2 = 0; i2 < 4; i2++) {
            zzzop.writeByte((byte) (((long) i) & 4294967295L));
            i >>>= 8;
        }
    }

    public static byte[] zzZX(zzZOP zzzop) {
        try {
            if (zzzop == null) {
                throw new NullPointerException("Value cannot be null.\r\nParameter name: srcStream");
            }
            if ((zzzop instanceof zzZOR) && zzzop.getLength() < 2000000.0d) {
                return ((zzZOR) zzzop).zzWy();
            }
            byte[] bArr = new byte[(int) zzzop.getLength()];
            zzZOR zzzor = new zzZOR(bArr);
            try {
                zzzop.zzH(0L);
                zzX(zzzop, zzzor);
                return bArr;
            } finally {
                zzzor.close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static zzZOR zzZY(zzZOP zzzop) throws Exception {
        zzZOR zzzor = (zzZOR) zzZKW.zzZ(zzzop, zzZOR.class);
        if (zzzor != null) {
            return zzzor;
        }
        zzZOR zzzor2 = new zzZOR((int) zzzop.getLength());
        zzX(zzzop, zzzor2);
        return zzzor2;
    }

    public static byte[] zzZZ(zzZOP zzzop) throws Exception {
        zzZOR zzzor = new zzZOR();
        try {
            byte[] bArr = new byte[3072];
            int i = 0;
            while (i < 3072) {
                int i2 = zzzop.read(bArr, 0, 3072);
                i += i2;
                if (i2 <= 0) {
                    break;
                }
                zzzor.write(bArr, 0, i2);
            }
            byte[] bArrZzWy = zzzor.zzWy();
            zzzor.close();
            return bArrZzWy;
        } catch (Throwable th) {
            zzzor.close();
            throw th;
        }
    }

    public static boolean zzY(zzZOP zzzop, byte[] bArr) throws Exception {
        return zzX(zzzop, bArr);
    }

    private static boolean zzX(zzZOP zzzop, byte[] bArr) throws Exception {
        if (bArr.length == 0 || zzzop.getLength() < bArr.length) {
            return false;
        }
        int iMin = Math.min(1024, bArr.length);
        byte[] bArr2 = new byte[iMin];
        long position = zzzop.getPosition();
        zzzop.zzH(zzzop.getLength() - ((long) bArr.length));
        int i = zzzop.read(bArr2, 0, iMin);
        int i2 = 0;
        while (i > 0) {
            int i3 = 0;
            while (i3 < i) {
                if (bArr2[i3] != bArr[i2]) {
                    zzzop.zzH(position);
                    return false;
                }
                i3++;
                i2++;
            }
            i = zzzop.read(bArr2, 0, iMin);
        }
        zzzop.zzH(position);
        return true;
    }
}
