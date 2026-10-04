package com.aspose.words.internal;

import Oooo0oO.o0Oo0oo;

/* JADX INFO: loaded from: classes5.dex */
final class zzYZN extends zzZ08 {
    public zzYZN(int i) {
        super(zzfz(i));
    }

    private static int zzfz(int i) {
        if (i == 224 || i == 256 || i == 384 || i == 512) {
            return i;
        }
        throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "'bitLength' ", " not supported for SHA-3"));
    }

    @Override // com.aspose.words.internal.zzZ08, com.aspose.words.internal.zzYUX
    public final int doFinal(byte[] bArr, int i) {
        zzZ(new byte[]{2}, 0, 2L);
        return super.doFinal(bArr, i);
    }

    @Override // com.aspose.words.internal.zzZ08, com.aspose.words.internal.zzYUX
    public final String zzXGi() {
        return "SHA3-" + this.zzWc9;
    }

    public zzYZN(zzYZN zzyzn) {
        super(zzyzn);
    }
}
