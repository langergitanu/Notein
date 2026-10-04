package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZ0Y<T> implements zzZ4T<T> {
    public abstract int zzX0(byte[] bArr);

    @Override // com.aspose.words.internal.zzZ4T
    public final byte[] zzXGP() {
        byte[] bArr = new byte[zzXGR()];
        zzX0(bArr);
        return bArr;
    }

    @Override // com.aspose.words.internal.zzZ4T
    public abstract int zzXGR();
}
