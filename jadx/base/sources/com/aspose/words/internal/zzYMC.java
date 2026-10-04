package com.aspose.words.internal;

import javax.crypto.spec.PBEParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public class zzYMC extends PBEParameterSpec {

    /* JADX INFO: renamed from: F */
    private static final zzZ86 f51200F = new zzZ86(zzZ96.zzWy4, zzZC8.zzWHS);
    private final int zzWEq;
    private final zzZ86 zzWyC;

    public zzYMC(byte[] bArr, int i, int i2) {
        this(bArr, i, i2, f51200F);
    }

    public final int getKeySize() {
        return this.zzWEq;
    }

    public final zzZ86 zzXJd() {
        return this.zzWyC;
    }

    public zzYMC(byte[] bArr, int i, int i2, zzZ86 zzz86) {
        super(bArr, i);
        if (i2 % 8 != 0) {
            throw new IllegalArgumentException("keySize must be a multiple of 8");
        }
        this.zzWEq = i2;
        this.zzWyC = zzz86;
    }
}
