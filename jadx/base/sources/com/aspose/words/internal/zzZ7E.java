package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7E extends zzZDB {
    private byte[] zzWpD;

    public zzZ7E(byte[] bArr) {
        this.zzWpD = zzYGU.zzVI(bArr);
    }

    public final byte[] zzXIn() {
        return zzYGU.zzVI(this.zzWpD);
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        return new zzZC6(zzYGU.zzVI(this.zzWpD));
    }
}
