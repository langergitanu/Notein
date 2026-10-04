package com.aspose.words.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZBP extends zzZDG {
    public zzZBP(zzZDJ zzzdj) {
        super(zzzdj);
    }

    @Override // com.aspose.words.internal.zzZD5
    public final void zzZ(zzZD7 zzzd7) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzZDA zzzda = this.zzWIz;
        if (zzzda != null) {
            byteArrayOutputStream.write(zzzda.getEncoded("DL"));
        }
        zzZDD zzzdd = this.zzWIy;
        if (zzzdd != null) {
            byteArrayOutputStream.write(zzzdd.getEncoded("DL"));
        }
        zzZD5 zzzd5 = this.zzWIx;
        if (zzzd5 != null) {
            byteArrayOutputStream.write(zzzd5.getEncoded("DL"));
        }
        byteArrayOutputStream.write(new zzZBX(true, this.zzO1, this.zzWIw).getEncoded("DL"));
        zzzd7.zzY(32, 8, byteArrayOutputStream.toByteArray());
    }
}
