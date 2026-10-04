package com.aspose.words.internal;

import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes5.dex */
public class zzYMO implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: iv */
    private final byte[] f51222iv;
    private final byte[] zzW6q;

    public zzYMO(zzZDA zzzda, byte[] bArr) {
        this.zzW6q = zzYXX.zzL(zzzda);
        this.f51222iv = zzYGU.zzVI(bArr);
    }

    public final byte[] getIV() {
        return zzYGU.zzVI(this.f51222iv);
    }

    public final byte[] zzXDo() {
        return zzYGU.zzVI(this.zzW6q);
    }
}
