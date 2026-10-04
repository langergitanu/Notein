package com.aspose.words.internal;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZK8 extends zzZOR {
    private long zzZO8;
    private final OutputStream zzZO9;

    public zzZK8(OutputStream outputStream) {
        if (outputStream == null) {
            throw new NullPointerException("OutputStream cannot be null");
        }
        this.zzZO9 = outputStream;
    }

    @Override // com.aspose.words.internal.zzZOR, com.aspose.words.internal.zzZOP
    public final void close() {
        try {
            flush();
        } catch (Exception e) {
            zzZHV.zzY(e);
        }
        super.close();
    }

    @Override // com.aspose.words.internal.zzZOR, com.aspose.words.internal.zzZOP
    public final void flush() throws IOException {
        super.flush();
        try {
            long position = getPosition();
            zzH(this.zzZO8);
            zzZKB.zzZ(this, this.zzZO9);
            this.zzZO9.flush();
            this.zzZO8 = position;
        } catch (Exception e) {
            zzZHV.zzY(e);
        }
    }
}
