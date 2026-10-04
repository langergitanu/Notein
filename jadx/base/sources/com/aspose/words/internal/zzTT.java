package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzTT extends zzTU {
    @Override // com.aspose.words.internal.zzU1
    public final String getName() {
        return "UTF-32BE";
    }

    @Override // com.aspose.words.internal.zzTU
    public final int zzR(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
