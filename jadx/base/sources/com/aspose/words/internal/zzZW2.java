package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZW2 extends zzZW3 {
    private String mName;
    private boolean zz88;

    public zzZW2(String str, boolean z, zzZVP[] zzzvpArr) {
        super(zzzvpArr);
        this.mName = str;
        this.zz88 = z;
    }

    @Override // com.aspose.words.internal.zzZW3
    public final boolean zzG(zzZW5 zzzw5) {
        if (zzzw5.zzAG() == 2 && zzzw5.zznT() == this.zz88) {
            return zzZKN.zzX(zzzw5.zznU(), this.mName, zzZOF.ORDINAL$4894b8c8);
        }
        return false;
    }
}
