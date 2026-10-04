package com.aspose.words.internal;

import javax.crypto.spec.PBEKeySpec;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYMD extends PBEKeySpec {

    /* JADX INFO: renamed from: F */
    private static final zzZ86 f51201F = new zzZ86(zzZ96.zzWy4, zzZC8.zzWHS);
    private zzZ86 zzWyC;

    public zzYMD(char[] cArr, byte[] bArr, int i, int i2, zzZ86 zzz86) {
        super(cArr, bArr, i, i2);
        this.zzWyC = zzz86;
    }

    public final zzZ86 zzXJd() {
        return this.zzWyC;
    }

    public final boolean zzXJe() {
        return f51201F.equals(this.zzWyC);
    }
}
