package com.aspose.words.internal;

import Oooo0oO.o0Oo0oo;

/* JADX INFO: loaded from: classes5.dex */
class zzYZK extends zzZ08 implements zzYUB {
    public zzYZK(int i) {
        super(zzfz(i));
    }

    private static int zzfz(int i) {
        if (i == 128 || i == 256) {
            return i;
        }
        throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "'bitLength' ", " not supported for SHAKE"));
    }

    @Override // com.aspose.words.internal.zzZ08, com.aspose.words.internal.zzYUX
    public final int doFinal(byte[] bArr, int i) {
        return zzw(bArr, i, zzQI());
    }

    @Override // com.aspose.words.internal.zzYUB
    public int zzB(byte[] bArr, int i, int i2) {
        if (!this.zzWc8) {
            zzZ(new byte[]{15}, 0, 4L);
        }
        zzY(bArr, i, ((long) i2) * 8);
        return i2;
    }

    @Override // com.aspose.words.internal.zzZ08, com.aspose.words.internal.zzYUX
    public final String zzXGi() {
        return "SHAKE" + this.zzWc9;
    }

    @Override // com.aspose.words.internal.zzYUB
    public final int zzw(byte[] bArr, int i, int i2) {
        int iZzB = zzB(bArr, i, i2);
        reset();
        return iZzB;
    }
}
