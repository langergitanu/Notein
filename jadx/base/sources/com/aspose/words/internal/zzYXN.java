package com.aspose.words.internal;

import com.aspose.words.internal.zzYXO;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYXN<T extends zzYXO> extends zzYXO<zzYXR> implements zzZ4L<T> {

    /* JADX INFO: renamed from: iv */
    protected final byte[] f51276iv;
    protected final int zzZNm;

    public zzYXN(zzYXR zzyxr, int i, byte[] bArr) {
        super(zzyxr);
        this.zzZNm = i;
        this.f51276iv = bArr;
    }

    @Override // com.aspose.words.internal.zzZ4L
    public final byte[] getIV() {
        return zzYGU.zzVI(this.f51276iv);
    }

    @Override // com.aspose.words.internal.zzZ4L
    /* JADX INFO: renamed from: zzK, reason: merged with bridge method [inline-methods] */
    public T zzW(SecureRandom secureRandom) {
        return (T) zzY(zzXGV(), zzXGV().zzZ(this.zzZNm, secureRandom));
    }

    @Override // com.aspose.words.internal.zzZ4L
    /* JADX INFO: renamed from: zzWs, reason: merged with bridge method [inline-methods] */
    public T zzXg(byte[] bArr) {
        return (T) zzY(zzXGV(), zzYGU.zzVI(bArr));
    }

    public abstract T zzY(zzYXR zzyxr, byte[] bArr);
}
