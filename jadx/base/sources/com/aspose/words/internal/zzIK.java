package com.aspose.words.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
final class zzIK {
    private static byte[] zzyi;
    private static HashMap<String, byte[]> zzyh = new HashMap<>();
    private static Object zzyg = new Object();

    static {
        try {
            zzZOP zzzopZzX1 = zzZXR.zzX1("Aspose.Resources.HatchMasks.dat");
            try {
                byte[] bArr = new byte[(int) zzzopZzX1.getLength()];
                zzyi = bArr;
                zzzopZzX1.read(bArr, 0, bArr.length);
                zzzopZzX1.close();
            } catch (Throwable th) {
                if (zzzopZzX1 != null) {
                    zzzopZzX1.close();
                }
                throw th;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String zzV(zzPK zzpk) {
        return zzZKN.format("{0}{1:X}{2:X}", Integer.valueOf(zzpk.zzOM()), Integer.valueOf(zzpk.zzOK().toArgb()), Integer.valueOf(zzpk.zzOL().toArgb()));
    }

    private static byte[] zzW(zzPK zzpk) throws Exception {
        byte[] bArr = new byte[8];
        zzZKV.zzZ(zzyi, zzpk.zzOM() * 8, bArr, 0, 8);
        zzXN zzxn = new zzXN(8, 8);
        for (int i = 0; i < 8; i++) {
            for (int i2 = 0; i2 < 8; i2++) {
                try {
                    zzxn.zzZ(i2, 7 - i, ((bArr[i] & 255) & (128 >> i2)) > 0 ? zzpk.zzOL() : zzpk.zzOK());
                } catch (Throwable th) {
                    zzxn.dispose();
                    throw th;
                }
            }
        }
        zzZOR zzzor = new zzZOR();
        zzxn.zzZ(zzzor, 6);
        byte[] bArrZzZX = zzZYQ.zzZX(zzzor);
        zzxn.dispose();
        return bArrZzZX;
    }

    public static byte[] zzZ(zzPK zzpk) throws Exception {
        byte[] bArrZzW;
        String strZzV = zzV(zzpk);
        synchronized (zzyg) {
            try {
                bArrZzW = (byte[]) zzQW.zzZ(zzyh, strZzV);
                if (bArrZzW == null) {
                    bArrZzW = zzW(zzpk);
                    zzyh.put(strZzV, bArrZzW);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrZzW;
    }
}
