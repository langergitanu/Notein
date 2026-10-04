package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz9N extends zz9O {
    @Override // com.aspose.words.internal.zz9O
    public final int zzV2(int i) {
        return 1;
    }

    @Override // com.aspose.words.internal.zz9O
    public final String zzZn(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            sb.append((char) ((b & 255) + 61440));
        }
        return sb.toString();
    }

    @Override // com.aspose.words.internal.zz9O
    public final String zzZo(byte[] bArr) {
        return zzZO0.zzQz(1252).zzZn(bArr);
    }
}
