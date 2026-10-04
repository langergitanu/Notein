package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZC6 extends zzZD9 {
    public zzZC6(byte[] bArr) {
        super(bArr);
    }

    @Override // com.aspose.words.internal.zzZD5
    public final int zzXL6() {
        return zzZBC.zzg4(this.zzWIn.length) + 1 + this.zzWIn.length;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzXLa() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZD9, com.aspose.words.internal.zzZD5
    public final void zzZ(zzZD7 zzzd7) throws IOException {
        zzzd7.zzV(4, this.zzWIn);
    }

    public zzZC6(zzZDK zzzdk) throws IOException {
        super(zzzdk.zzXL0().getEncoded("DER"));
    }
}
