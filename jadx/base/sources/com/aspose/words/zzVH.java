package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzVH {
    private String zzZwc;
    private String zzZwd;

    private zzVH(String str, String str2) {
        this.zzZwd = str;
        this.zzZwc = str2;
    }

    public static zzVH zzZ(byte[] bArr, byte[] bArr2, com.aspose.words.internal.zzZO0 zzzo0) {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        return new zzVH(com.aspose.words.internal.zzZKN.zzU2(zzZ(bArr, bArr2, 96, zzzo0)), com.aspose.words.internal.zzZKN.zzU2(zzZ(bArr, bArr2, 104, zzzo0)));
    }

    public final String zz17() {
        return this.zzZwc;
    }

    public final String zz18() {
        return this.zzZwd;
    }

    private static String zzZ(byte[] bArr, byte[] bArr2, int i, com.aspose.words.internal.zzZO0 zzzo0) {
        int iZzA = com.aspose.words.internal.zzZQK.zzA(bArr, i + 8);
        int i2 = iZzA;
        while (bArr2[i2] != 0 && i2 < bArr2.length) {
            i2++;
        }
        return zzzo0.zzR(bArr2, iZzA, i2 - iZzA);
    }
}
