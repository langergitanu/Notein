package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZXJ extends zzZXK {
    private static byte[] zzZ3(byte[] bArr) {
        int length = bArr.length / 2;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = bArr[(i * 2) + 1];
        }
        return bArr2;
    }

    private static boolean zzZ4(byte[] bArr) {
        if (bArr.length % 2 == 1) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (i % 2 == 0 && bArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.aspose.words.internal.zzZXK
    public final String zzZn(byte[] bArr) {
        if (zzZ4(bArr)) {
            bArr = zzZ3(bArr);
        }
        return zzZO0.zzV3("gb2312").zzZn(bArr);
    }
}
