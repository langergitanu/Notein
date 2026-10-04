package com.aspose.words.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZCF extends zzZDG {
    public zzZCF(zzZDA zzzda, zzZDD zzzdd, zzZD5 zzzd5, int i, zzZD5 zzzd52) {
        super(zzzda, zzzdd, zzzd5, i, zzzd52);
    }

    @Override // com.aspose.words.internal.zzZD5
    public final void zzZ(zzZD7 zzzd7) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzZDA zzzda = this.zzWIz;
        if (zzzda != null) {
            byteArrayOutputStream.write(zzzda.getEncoded("DER"));
        }
        zzZDD zzzdd = this.zzWIy;
        if (zzzdd != null) {
            byteArrayOutputStream.write(zzzdd.getEncoded("DER"));
        }
        zzZD5 zzzd5 = this.zzWIx;
        if (zzzd5 != null) {
            byteArrayOutputStream.write(zzzd5.getEncoded("DER"));
        }
        byteArrayOutputStream.write(new zzZBX(true, this.zzO1, this.zzWIw).getEncoded("DER"));
        zzzd7.zzY(32, 8, byteArrayOutputStream.toByteArray());
    }
}
