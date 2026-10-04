package com.aspose.words.internal;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ6K implements zzZ6D {
    private final zzZDA zzWsy;
    private final byte[] zzZWW;

    public zzZ6K(byte[] bArr) {
        this(zzZAQ.zzWFM, bArr);
    }

    @Override // com.aspose.words.internal.zzZ6L
    public final Object getContent() {
        return zzYGU.zzVI(this.zzZWW);
    }

    @Override // com.aspose.words.internal.zzZ6L
    public final void write(OutputStream outputStream) throws zzZ6M, IOException {
        outputStream.write(this.zzZWW);
    }

    @Override // com.aspose.words.internal.zzZ6D
    public final zzZDA zzXJW() {
        return this.zzWsy;
    }

    public zzZ6K(zzZDA zzzda, byte[] bArr) {
        this.zzWsy = zzzda;
        this.zzZWW = bArr;
    }
}
