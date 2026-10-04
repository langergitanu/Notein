package com.aspose.words.internal;

import com.aspose.words.internal.zzYXQ;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYXQ<T extends zzYXQ> extends zzYXN<T> implements zzZ5P<T> {
    protected final int zzWiH;

    public zzYXQ(zzYXR zzyxr, int i, byte[] bArr, int i2) {
        super(zzyxr, i, bArr);
        this.zzWiH = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.aspose.words.internal.zzYXN
    /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
    public T zzY(zzYXR zzyxr, byte[] bArr) {
        return (T) zzY(zzyxr, bArr, this.zzWiH);
    }

    @Override // com.aspose.words.internal.zzZ5Q
    public final int zzXH3() {
        return this.zzWiH;
    }

    public abstract T zzY(zzYXR zzyxr, byte[] bArr, int i);

    @Override // com.aspose.words.internal.zzZ5Q
    /* JADX INFO: renamed from: zzfq, reason: merged with bridge method [inline-methods] */
    public final T zzg1(int i) {
        return (T) zzY(zzXGV(), getIV(), i);
    }
}
