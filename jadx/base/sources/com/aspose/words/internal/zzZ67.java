package com.aspose.words.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ67 implements zzZ6D {
    private final zzZDK zzWmm;
    private final zzZDA zzWsy;

    public zzZ67(zzZDA zzzda, zzZDK zzzdk) {
        this.zzWsy = zzzda;
        this.zzWmm = zzzdk;
    }

    @Override // com.aspose.words.internal.zzZ6L
    public final Object getContent() {
        return this.zzWmm;
    }

    @Override // com.aspose.words.internal.zzZ6L
    public final void write(OutputStream outputStream) throws zzZ6M, IOException {
        zzZDK zzzdk = this.zzWmm;
        if (zzzdk instanceof zzZD4) {
            Iterator<zzZDK> it = zzZD4.zzYy(zzzdk).iterator();
            while (it.hasNext()) {
                outputStream.write(it.next().zzXL0().getEncoded("DER"));
            }
        } else {
            byte[] encoded = zzzdk.zzXL0().getEncoded("DER");
            int i = 1;
            while ((encoded[i] & 255) > 127) {
                i++;
            }
            int i2 = i + 1;
            outputStream.write(encoded, i2, encoded.length - i2);
        }
    }

    @Override // com.aspose.words.internal.zzZ6D
    public final zzZDA zzXJW() {
        return this.zzWsy;
    }
}
