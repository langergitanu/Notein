package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZBQ extends zzZDN {
    public zzZBQ(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // com.aspose.words.internal.zzZD5
    public final int zzXL6() {
        return zzZBC.zzg4(this.data.length + 1) + 1 + this.data.length + 1;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzXLa() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZDN, com.aspose.words.internal.zzZD5
    public final void zzZ(zzZD7 zzzd7) throws IOException {
        byte[] bArr = this.data;
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        bArr2[0] = (byte) zzXL4();
        System.arraycopy(bArr, 0, bArr2, 1, length);
        zzzd7.zzV(3, bArr2);
    }
}
