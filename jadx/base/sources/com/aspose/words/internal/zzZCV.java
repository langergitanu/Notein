package com.aspose.words.internal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZCV extends zzZDP {
    public zzZCV(int i, zzZDJ zzzdj) {
        super(true, i, zzZ(zzzdj));
    }

    private static byte[] zzZ(zzZDJ zzzdj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != zzzdj.size(); i++) {
            try {
                byteArrayOutputStream.write(((zzZDB) zzzdj.zzg8(i)).getEncoded("BER"));
            } catch (IOException e) {
                throw new zzZD6("malformed object: " + e, e);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.aspose.words.internal.zzZDP, com.aspose.words.internal.zzZD5
    public final void zzZ(zzZD7 zzzd7) throws IOException {
        zzzd7.writeTag(this.zzWIL ? 96 : 64, this.tag);
        zzzd7.write(128);
        zzzd7.write(this.zzWIK);
        zzzd7.write(0);
        zzzd7.write(0);
    }
}
