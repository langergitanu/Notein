package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZ10<T> implements zzZ4V<T> {
    @Override // com.aspose.words.internal.zzZ4V
    public abstract int zzQI();

    public abstract int zzWZ(byte[] bArr);

    @Override // com.aspose.words.internal.zzZ4V
    /* JADX INFO: renamed from: zzXER, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract zzZ10<T> zzXGS() throws CloneNotSupportedException;

    @Override // com.aspose.words.internal.zzZ4V
    public abstract zzZ41 zzXGT();

    @Override // com.aspose.words.internal.zzZ4V
    public final byte[] zzXI5() {
        byte[] bArr = new byte[zzQI()];
        zzWZ(bArr);
        return bArr;
    }
}
