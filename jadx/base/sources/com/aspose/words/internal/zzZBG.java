package com.aspose.words.internal;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
final class zzZBG implements Enumeration {
    private Object zzWHC = readObject();
    private zzZDE zzWHD;

    public zzZBG(byte[] bArr) {
        this.zzWHD = new zzZDE(bArr, (byte) 0);
    }

    private Object readObject() {
        try {
            return this.zzWHD.zzXKN();
        } catch (IOException e) {
            throw new zzZD6("malformed DER construction: " + e, e);
        }
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.zzWHC != null;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        Object obj = this.zzWHC;
        this.zzWHC = readObject();
        return obj;
    }
}
