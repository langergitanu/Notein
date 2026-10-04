package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzWD {
    private static com.aspose.words.internal.zzZQ9 zzR(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        return com.aspose.words.internal.zzZQ9.zzYK(((((long) zzzox.zzXb()) & 4294967295L) << 32) | (4294967295L & ((long) zzzox.zzXb())));
    }

    public static DigitalSignature zzZ(com.aspose.words.internal.zzZOX zzzox, byte[] bArr) throws Exception {
        int iZzXb;
        int iZzXb2;
        int iZzXc;
        byte[] bArrZzn;
        byte[] bArrZzn2;
        DigitalSignature digitalSignature = new DigitalSignature(1);
        boolean zZzZ = false;
        try {
            int iZzXc2 = zzzox.zzXc();
            int iZzXc3 = zzzox.zzXc();
            zzR(zzzox);
            iZzXb = zzzox.zzXb();
            iZzXb2 = zzzox.zzXb();
            digitalSignature.zzq(com.aspose.words.internal.zzZQ9.zzYK(((((long) iZzXb) & 4294967295L) << 32) | (4294967295L & ((long) iZzXb2))));
            zzzox.zzXc();
            int iZzXc4 = zzzox.zzXc();
            iZzXc = zzzox.zzXc();
            zzzox.zzXc();
            int iZzXc5 = zzzox.zzXc();
            int iZzXc6 = zzzox.zzXc();
            zzzox.zzXc();
            zzZZR.zzR(zzzox, (iZzXc2 + 1) * 2);
            zzZZR.zzR(zzzox, (iZzXc3 + 1) * 2);
            bArrZzn = zzzox.zzn(iZzXc4);
            bArrZzn2 = zzzox.zzn(iZzXc);
            zzzox.zzn(iZzXc5);
            zzzox.zzn(iZzXc6);
        } catch (Exception unused) {
        }
        if (iZzXc == 0) {
            throw new IllegalStateException("There is no certificate embedded for a digital signature.");
        }
        com.aspose.words.internal.zzWZ zzwzZzE = com.aspose.words.internal.zzS1.zzE(bArrZzn2);
        digitalSignature.zzS(zzwzZzE);
        com.aspose.words.internal.zzZZ8 zzzz8ZzZ = com.aspose.words.internal.zzS1.zzZ(zzwzZzE);
        zzzz8ZzZ.getModulus().bitLength();
        com.aspose.words.internal.zzZKV.zzYM(bArrZzn);
        byte[] bArrZzI = com.aspose.words.internal.zz0W.zzI(com.aspose.words.internal.zz0W.zzZ(zzzz8ZzZ, com.aspose.words.internal.zz0W.zzZc(bArrZzn)), zzzz8ZzZ.getModulus().bitLength() >> 3);
        digitalSignature.zzYw(new byte[16]);
        com.aspose.words.internal.zzZKV.zzZ(bArrZzI, bArrZzI.length - 16, digitalSignature.getSignatureValue(), 0, 16);
        com.aspose.words.internal.zzH7 zzh7ZzYu = com.aspose.words.internal.zzS1.zzYu(8);
        zzh7ZzYu.zzW(bArr, 0, bArr.length);
        zzh7ZzYu.zzW(com.aspose.words.internal.zzZQK.getBytes(iZzXb2), 0, 4);
        zzh7ZzYu.zzW(com.aspose.words.internal.zzZQK.getBytes(iZzXb), 0, 4);
        byte[] bArr2 = new byte[zzh7ZzYu.zzQI()];
        zzh7ZzYu.zzo(bArr2);
        zZzZ = com.aspose.words.internal.zzZ1.zzZ(digitalSignature.getSignatureValue(), bArr2);
        digitalSignature.zzY9(zZzZ);
        return digitalSignature;
    }
}
