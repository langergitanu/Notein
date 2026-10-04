package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZCC extends zzZD5 implements zzZCZ {
    private final byte[] zzWIn;

    public zzZCC(byte[] bArr) {
        this.zzWIn = bArr;
    }

    @Override // com.aspose.words.internal.zzZCZ
    public final String getString() {
        return zzYGI.zzVG(this.zzWIn);
    }

    @Override // com.aspose.words.internal.zzZD5, com.aspose.words.internal.zzZDB
    public final int hashCode() {
        return zzYGU.hashCode(this.zzWIn);
    }

    public final String toString() {
        return getString();
    }

    @Override // com.aspose.words.internal.zzZD5
    public final int zzXL6() {
        return zzZBC.zzg4(this.zzWIn.length) + 1 + this.zzWIn.length;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzXLa() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final void zzZ(zzZD7 zzzd7) throws IOException {
        zzzd7.zzV(27, this.zzWIn);
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzZ(zzZD5 zzzd5) {
        if (zzzd5 instanceof zzZCC) {
            return zzYGU.zzp(this.zzWIn, ((zzZCC) zzzd5).zzWIn);
        }
        return false;
    }
}
