package com.aspose.words.internal;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public class zzZC4 extends zzZD7 {
    public zzZC4(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // com.aspose.words.internal.zzZD7
    public final zzZD7 zzXKG() {
        return this;
    }

    @Override // com.aspose.words.internal.zzZD7
    public final zzZD7 zzXKH() {
        return this;
    }

    @Override // com.aspose.words.internal.zzZD7
    public final void zzY(zzZDK zzzdk) throws IOException {
        if (zzzdk == null) {
            throw new IOException("null object detected");
        }
        zzzdk.zzXL0().zzXL3().zzZ(this);
    }
}
