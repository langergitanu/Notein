package com.aspose.words.internal;

import java.nio.charset.CharsetDecoder;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZO6 {
    protected final zzZO0 zzMW;
    protected final CharsetDecoder zzZWE;
    protected zzZO5 zzZWD = null;
    protected zzZO4 zzZWC = null;

    public zzZO6(zzZO0 zzzo0) {
        this.zzMW = zzzo0;
        this.zzZWE = zzzo0.zzih();
    }

    public int zzY(byte[] bArr, int i, int i2, char[] cArr, int i3) {
        return zzZ(bArr, i, i2, cArr, i3);
    }

    public abstract int zzZ(byte[] bArr, int i, int i2, char[] cArr, int i3);
}
