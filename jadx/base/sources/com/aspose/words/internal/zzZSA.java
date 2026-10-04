package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZSA {
    private static byte[] zzU(byte[] bArr, String str) throws Exception {
        byte[] bArrZzW5 = zzW5(str);
        for (int i = 0; i < 32; i++) {
            bArr[i] = (byte) (bArrZzW5[(bArrZzW5.length - (i % bArrZzW5.length)) - 1] ^ bArr[i]);
        }
        return bArr;
    }

    private static zz77 zzV(byte[] bArr, String str) throws Exception {
        byte[] bArrZzU = zzU(bArr, str);
        zz77 zz77Var = new zz77(str, "application/vnd.ms-package.obfuscated-opentype");
        zz77Var.zzR1().write(bArrZzU, 0, bArrZzU.length);
        return zz77Var;
    }

    private static byte[] zzW5(String str) throws Exception {
        return zzZ1.zzZ(new zzZOZ(zzZOQ.zzVg(str)));
    }

    public static zz77 zzZ(zzJO zzjo, String str) throws Exception {
        zzZOR zzzor = new zzZOR();
        try {
            zzjo.zzY(zzzor);
            byte[] bArrZzZX = zzZYQ.zzZX(zzzor);
            zzzor.close();
            return zzV(bArrZzZX, str);
        } catch (Throwable th) {
            zzzor.close();
            throw th;
        }
    }
}
