package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZXJ {
    public static void zzT(byte[] bArr, String str) {
        if (bArr == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: fontData");
        }
        zzZ(bArr, new com.aspose.words.internal.zzZOZ(str));
    }

    public static String zzZ(zzZUW zzzuw, com.aspose.words.internal.zzZOP zzzop) throws Exception {
        byte[] data = zzzuw.getData();
        if (data == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: fontData");
        }
        int iMin = Math.min(data.length, 32);
        byte[] bArr = new byte[iMin];
        System.arraycopy(data, 0, bArr, 0, iMin);
        com.aspose.words.internal.zzZOZ zzzozZzY = com.aspose.words.internal.zzZZS.zzY(data);
        zzZ(bArr, zzzozZzY);
        zzzop.write(bArr, 0, iMin);
        zzzop.write(data, iMin, zzzuw.getData().length - iMin);
        return zzzozZzY.toString("B").toUpperCase();
    }

    private static void zzZ(byte[] bArr, com.aspose.words.internal.zzZOZ zzzoz) {
        byte[] bArrZzZ = com.aspose.words.internal.zzZ1.zzZ(zzzoz);
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            int length = bArrZzZ.length - 1;
            while (length >= 0 && i < bArr.length) {
                bArr[i] = (byte) (bArr[i] ^ bArrZzZ[length]);
                length--;
                i++;
            }
        }
    }
}
