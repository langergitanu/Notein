package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.internal.zzZ1L;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes5.dex */
final class zzZZT implements zzFU {
    private final zzZ0O zzdn;

    public zzZZT(int i) {
        SecureRandom secureRandom = new SecureRandom();
        this.zzdn = zzT9(3).zzZ(new zzYRP(secureRandom, true)).zzXFC().zzXFB().zzZ(secureRandom.generateSeed(16), true, null);
    }

    private static zzZ1L.zzZ zzT9(int i) {
        if (i == 1) {
            return zzZ1L.zzWhO;
        }
        if (i == 2) {
            return zzZ1L.zzWhN;
        }
        if (i == 3) {
            return zzZ1L.zzWhM;
        }
        if (i == 4) {
            return zzZ1L.zzWhL;
        }
        if (i == 5) {
            return zzZ1L.zzWhK;
        }
        throw new IllegalStateException(C21532OooOOo.OooO0OO(i, "Unsupported hash algorithm: "));
    }

    @Override // com.aspose.words.internal.zzFU
    public final void nextBytes(byte[] bArr) {
        this.zzdn.nextBytes(bArr);
    }

    @Override // com.aspose.words.internal.zzFU
    public final void zz0(byte[] bArr) {
        this.zzdn.setSeed(bArr);
    }
}
