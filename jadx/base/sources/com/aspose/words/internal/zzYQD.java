package com.aspose.words.internal;

import com.aspose.words.internal.zzZ0P;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes5.dex */
final class zzYQD extends MessageDigest implements Cloneable {
    private static zzZ1I<zzZ0P.zzQ> zzVVH = new zzZ0P.zzR();
    private final zzZ41 zzVVF;
    private final zzZ4V zzVVG;

    public zzYQD(zzZ0P.zzQ zzq) {
        this(zzVVH.zzZ(zzq));
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public final Object clone() throws CloneNotSupportedException {
        return new zzYQD(this.zzVVG.clone());
    }

    @Override // java.security.MessageDigestSpi
    public final byte[] engineDigest() {
        byte[] bArrZzXI5 = this.zzVVG.zzXI5();
        engineReset();
        return bArrZzXI5;
    }

    @Override // java.security.MessageDigestSpi
    public final int engineGetDigestLength() {
        return this.zzVVG.zzQI();
    }

    @Override // java.security.MessageDigestSpi
    public final void engineReset() {
        this.zzVVG.reset();
    }

    @Override // java.security.MessageDigestSpi
    public final void engineUpdate(byte b) {
        this.zzVVF.update(b);
    }

    public zzYQD(zzZ4V zzz4v) {
        super(((zzZ4M) zzz4v.zzXGU()).zzXGV().getName());
        this.zzVVG = zzz4v;
        this.zzVVF = zzz4v.zzXGT();
    }

    @Override // java.security.MessageDigestSpi
    public final void engineUpdate(byte[] bArr, int i, int i2) {
        this.zzVVF.update(bArr, i, i2);
    }
}
