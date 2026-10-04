package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYYU {
    public static void zzXf(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            bArr[i] = bArr[(bArr.length - 1) - i];
            bArr[(bArr.length - 1) - i] = b;
        }
    }
}
