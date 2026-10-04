package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzZW3 extends zzZW8 {
    public zzZW3(zzZVP[] zzzvpArr) {
        super(zzzvpArr);
    }

    public abstract boolean zzG(zzZW5 zzzw5);

    @Override // com.aspose.words.internal.zzZW8
    public final boolean zzW(zzZW5 zzzw5) {
        if (zzG(zzzw5)) {
            return zzM(zzzw5);
        }
        return false;
    }

    @Override // com.aspose.words.internal.zzZW8
    public final boolean zzZ(zzZW5 zzzw5, zzZW5 zzzw52) {
        if (zzW(zzzw5, zzzw52)) {
            return true;
        }
        return !zzW(zzzw52, zzzw5) && zzzw5.zznP() < zzzw52.zznP();
    }
}
