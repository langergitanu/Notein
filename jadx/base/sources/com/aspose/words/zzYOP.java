package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYOP {
    private static com.aspose.words.internal.zzZO0 zzYTZ = com.aspose.words.internal.zzZO0.zzhU();

    public static String zzR(com.aspose.words.internal.zzZOX zzzox, int i) throws Exception {
        if (i == 0) {
            return "";
        }
        return zzYTZ.zzR(zzzox.zzn(i), 0, i - 2);
    }

    public static int zzZ(String str, com.aspose.words.internal.zzZOW zzzow) throws Exception {
        int length = (str.length() + 1) * 2;
        byte[] bArr = new byte[length];
        zzYTZ.zzZ(str, str.length(), bArr, 0);
        zzzow.writeBytes(bArr);
        return length;
    }
}
