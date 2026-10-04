package com.aspose.words.internal;

import java.io.UnsupportedEncodingException;
import java.io.Writer;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZHL implements zzYFS {
    private boolean zzZGS;

    private zzZHL(boolean z) {
        this.zzZGS = z;
    }

    public static zzZHL zzcg() {
        return new zzZHL(true);
    }

    public static zzZHL zzch() {
        return new zzZHL(false);
    }

    @Override // com.aspose.words.internal.zzYFS
    public final Writer zzZ(Writer writer) throws UnsupportedEncodingException {
        return new zzZHM(writer, this.zzZGS);
    }
}
