package com.aspose.words.internal;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZBO extends zzZD7 {
    public zzZBO(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // com.aspose.words.internal.zzZD7
    public final void zzY(zzZDK zzzdk) throws IOException {
        if (zzzdk == null) {
            throw new IOException("null object detected");
        }
        zzzdk.zzXL0().zzXL2().zzZ(this);
    }
}
