package com.aspose.words.internal;

import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public class zzYN5 extends IvParameterSpec {
    private final byte[] zzVVV;
    private final int zzWdl;

    public zzYN5(byte[] bArr, int i) {
        this(bArr, i, (byte) 0);
    }

    public final byte[] zzXA9() {
        return zzYGU.zzVI(this.zzVVV);
    }

    public final int zzXAa() {
        return this.zzWdl;
    }

    private zzYN5(byte[] bArr, int i, byte b) {
        super(bArr);
        this.zzWdl = i;
        this.zzVVV = zzYGU.zzVI(null);
    }
}
