package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzYS7 implements zzYS8 {
    private byte[] key;

    public zzYS7(byte[] bArr) {
        this.key = bArr;
    }

    @Override // com.aspose.words.internal.zzYS8
    public final byte[] getKey() {
        return this.key;
    }

    public zzYS7(byte[] bArr, int i, int i2) {
        this.key = zzYGU.copyOfRange(bArr, i, i2 + i);
    }
}
