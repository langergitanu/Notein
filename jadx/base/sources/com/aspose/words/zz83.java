package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz83 {
    public static com.aspose.words.internal.zzZYJ zzZ(String[] strArr, int[] iArr) {
        if (strArr.length != iArr.length) {
            throw new IllegalArgumentException("Length of keys and values arrays must be the same.");
        }
        com.aspose.words.internal.zzZYJ zzzyj = new com.aspose.words.internal.zzZYJ();
        for (int i = 0; i < strArr.length; i++) {
            zzzyj.zzH(strArr[i], iArr[i]);
        }
        return zzzyj;
    }
}
