package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZEK {
    private boolean zzYl8;
    private zzZIG zzYsT;

    public zzZEK(zzZIG zzzig, zzPS zzps) {
        this.zzYsT = zzzig;
        zzPT zzptZzSx = zzps.zzSx("caption-side");
        this.zzYl8 = zzptZzSx == null || !zzptZzSx.zzZWj().zzP(zzL4.zzZmX);
    }

    public final boolean zzYYx() {
        return this.zzYl8;
    }

    public final zzZIG zzZ3Y() {
        return this.zzYsT;
    }
}
