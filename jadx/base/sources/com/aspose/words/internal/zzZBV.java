package com.aspose.words.internal;

import com.aspose.slides.C22206OooOOo0;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZBV extends zzZD5 implements zzZCZ {
    private final byte[] zzWIn;

    public zzZBV(byte[] bArr) {
        this.zzWIn = bArr;
    }

    public static zzZBV zzYs(Object obj) {
        if (obj == null || (obj instanceof zzZBV)) {
            return (zzZBV) obj;
        }
        throw new IllegalArgumentException(C22206OooOOo0.OooO0OO(obj, "illegal object in getInstance: "));
    }

    @Override // com.aspose.words.internal.zzZCZ
    public final String getString() {
        return zzYGI.zzVH(this.zzWIn);
    }

    @Override // com.aspose.words.internal.zzZD5, com.aspose.words.internal.zzZDB
    public final int hashCode() {
        return zzYGU.hashCode(this.zzWIn);
    }

    public final String toString() {
        return getString();
    }

    @Override // com.aspose.words.internal.zzZD5
    public final int zzXL6() throws IOException {
        return zzZBC.zzg4(this.zzWIn.length) + 1 + this.zzWIn.length;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzXLa() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZD5
    public final boolean zzZ(zzZD5 zzzd5) {
        if (zzzd5 instanceof zzZBV) {
            return zzYGU.zzp(this.zzWIn, ((zzZBV) zzzd5).zzWIn);
        }
        return false;
    }

    public zzZBV(String str) {
        this.zzWIn = zzYGI.zzwc(str);
    }

    @Override // com.aspose.words.internal.zzZD5
    public final void zzZ(zzZD7 zzzd7) throws IOException {
        zzzd7.zzV(12, this.zzWIn);
    }
}
