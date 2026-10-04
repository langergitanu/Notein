package com.aspose.words;

import com.google.common.primitives.Shorts;

/* JADX INFO: loaded from: classes6.dex */
final class zzW {
    boolean zzZGB;
    int zzZGC;
    int zzZGD;

    public zzW() {
    }

    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzJ((short) this.zzZGD);
        int i = this.zzZGC | 8192;
        boolean z = this.zzZGB;
        zzzow.zzJ((short) (i | (z ? 16384 : 0) | (z ? 0 : 32768)));
    }

    public zzW(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzZGD = zzzox.zzX9() & 65535;
        short sZzX9 = zzzox.zzX9();
        this.zzZGC = sZzX9 & 8191;
        this.zzZGB = (sZzX9 & Shorts.MAX_POWER_OF_TWO) != 0;
    }
}
