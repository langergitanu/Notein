package com.aspose.words.internal;

import javax.crypto.interfaces.PBEKey;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYRB extends zzYRC implements PBEKey {
    private final byte[] zzWAR;
    private final int zzWfC;

    public zzYRB(char[] cArr, boolean z, byte[] bArr, int i) {
        super(cArr, z);
        this.zzWAR = zzYGU.zzVI(bArr);
        this.zzWfC = i;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public final int getIterationCount() {
        return this.zzWfC;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public final byte[] getSalt() {
        return zzYGU.zzVI(this.zzWAR);
    }
}
