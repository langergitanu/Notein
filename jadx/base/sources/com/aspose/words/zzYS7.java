package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYS7 {
    public static com.aspose.words.internal.zzZOR zzY(byte[] bArr, String str, zzYS5 zzys5) throws Exception {
        return zzZ(bArr, str, zzys5, true);
    }

    private static byte[] zzYo(String str, String str2) {
        byte[] bytes = com.aspose.words.internal.zzZO0.zzhV().getBytes(str);
        return com.aspose.words.internal.zzIL.zzW(com.aspose.words.internal.zzS1.zzp(str2), bytes, bytes.length);
    }

    public static com.aspose.words.internal.zzZOR zzZ(byte[] bArr, String str, zzYS5 zzys5) throws Exception {
        return zzZ(bArr, str, zzys5, false);
    }

    private static com.aspose.words.internal.zzZOR zzY(byte[] bArr, com.aspose.words.internal.zzXL zzxl) throws Exception {
        int blockSize = zzxl.getBlockSize();
        int iCeil = ((int) Math.ceil(((double) bArr.length) / ((double) blockSize))) * blockSize;
        byte[] bArr2 = new byte[iCeil];
        int i = iCeil - blockSize;
        for (int i2 = 0; i2 < i; i2 += blockSize) {
            zzxl.zzZ(bArr, i2, bArr2, i2);
        }
        if (bArr.length == iCeil) {
            zzxl.zzZ(bArr, i, bArr2, i);
        } else {
            byte[] bArr3 = new byte[blockSize];
            com.aspose.words.internal.zzZKV.zzZ(bArr, i, bArr3, 0, bArr.length - i);
            zzxl.zzZ(bArr3, 0, bArr2, i);
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(bArr2);
        zzzor.setLength(bArr.length);
        return zzzor;
    }

    private static com.aspose.words.internal.zzZOR zzZ(byte[] bArr, String str, zzYS5 zzys5, boolean z) throws Exception {
        zzYS6 zzys6ZzYwG = zzys5.zzYwG();
        byte[] bArrZzZ = zzZ(str, zzys5);
        byte[] bArrZzYwH = zzys5.zzYwG().zzYwH();
        if ("Blowfish CFB".equals(zzys6ZzYwG.getName())) {
            return zzY(bArr, com.aspose.words.internal.zzXK.zzZ(z, bArrZzZ, bArrZzYwH));
        }
        if ("http://www.w3.org/2001/04/xmlenc#aes256-cbc".equals(zzys6ZzYwG.getName())) {
            return zzZ(bArr, com.aspose.words.internal.zzXK.zzY(z, bArrZzZ, bArrZzYwH));
        }
        throw new IllegalStateException(com.aspose.words.internal.zzZKN.format("Unexpected cipher algorithm name: {0}", zzys6ZzYwG.getName()));
    }

    private static com.aspose.words.internal.zzZOR zzZ(byte[] bArr, com.aspose.words.internal.zzXL zzxl) throws Exception {
        byte[] bArr2 = new byte[zzxl.getOutputSize(bArr.length)];
        try {
            int iZzX = zzxl.zzX(bArr, bArr2);
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(bArr2);
            zzzor.setLength(iZzX);
            return zzzor;
        } catch (Exception unused) {
            throw new IncorrectPasswordException("The document password is incorrect.");
        }
    }

    private static byte[] zzZ(String str, zzYS5 zzys5) {
        byte[] bArrZzYo = zzYo(str, zzys5.zzYwE().getName());
        zzYRC zzyrcZzYwF = zzys5.zzYwF();
        return com.aspose.words.internal.zz6D.zzY(bArrZzYo, zzyrcZzYwF.getSalt(), zzyrcZzYwF.getIterationCount(), zzyrcZzYwF.getSize());
    }
}
