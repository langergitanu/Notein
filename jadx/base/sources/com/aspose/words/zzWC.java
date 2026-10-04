package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzWC {
    public static void zzZ(com.aspose.words.internal.zzZOW zzzow, com.aspose.words.internal.zzKD zzkd, DigitalSignature digitalSignature) throws Exception {
        zzZKZ zzzkz = new zzZKZ(zzkd.zzIf());
        com.aspose.words.internal.zzH7 zzh7ZzYu = com.aspose.words.internal.zzS1.zzYu(8);
        zzh7ZzYu.zzW(zzzkz.zzZ50(), 0, zzzkz.zzZ50().length);
        zzh7ZzYu.zzW(com.aspose.words.internal.zzZQK.zzYN(digitalSignature.zzZSA().zzkL()), 0, 8);
        byte[] bArr = new byte[zzh7ZzYu.zzQI()];
        zzh7ZzYu.zzo(bArr);
        byte[] bArrZzZ = com.aspose.words.internal.zzS1.zzZ(digitalSignature.zzZSz(), bArr, 8);
        com.aspose.words.internal.zzZKV.zzP(bArrZzZ, 0, bArrZzZ.length);
        byte[] bArrZzW = com.aspose.words.internal.zzS1.zzW(digitalSignature.zzZSz());
        com.aspose.words.internal.zzZQ9 zzzq9ZzZ = com.aspose.words.internal.zzZQ9.zzZ(digitalSignature.zzZSz().zzVk().getNotAfter());
        zzzow.zzl(0);
        zzzow.zzl(0);
        zzZ(zzzow, zzzq9ZzZ);
        zzZ(zzzow, digitalSignature.zzZSA());
        zzzow.zzl(32771);
        zzzow.zzl(bArrZzZ.length);
        zzzow.zzl(bArrZzW.length);
        zzzow.zzl(0);
        zzzow.zzl(0);
        zzzow.zzl(0);
        zzzow.zzl(0);
        zzZZQ.zzZ("", zzzow);
        zzZZQ.zzZ("", zzzow);
        zzzow.writeBytes(bArrZzZ);
        zzzow.writeBytes(bArrZzW);
    }

    private static void zzZ(com.aspose.words.internal.zzZOW zzzow, com.aspose.words.internal.zzZQ9 zzzq9) throws Exception {
        long jZzkL = zzzq9.zzkL();
        zzzow.zzl((int) (jZzkL >> 32));
        zzzow.zzl((int) (jZzkL & 4294967295L));
    }
}
