package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzSV extends zz72 {
    private String mName;

    public zzSV(String str, zzZVP zzzvp) {
        super(new zzZVP[]{zzzvp});
        this.mName = str;
    }

    private boolean zzY(zzZW5 zzzw5, zzZW5 zzzw52) {
        for (int i = 0; i < zzzw5.zzAE().length; i++) {
            if (zzY(zzzw5, i).getType() != zzY(zzzw52, i).getType()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.aspose.words.internal.zz72
    public final boolean zzZ(zzZW5 zzzw5) {
        if (zzZKN.zzX(zzzw5.zznU(), this.mName, zzZOF.ORDINAL$4894b8c8)) {
            return zzM(zzzw5);
        }
        return false;
    }

    public zzSV(String str, zzZVP zzzvp, zzZVP zzzvp2) {
        super(new zzZVP[]{zzzvp, zzzvp2});
        this.mName = str;
    }

    @Override // com.aspose.words.internal.zzZW8
    public final boolean zzZ(zzZW5 zzzw5, zzZW5 zzzw52) {
        if (zzW(zzzw5, zzzw52)) {
            return true;
        }
        return !zzO(zzzw5) && zzO(zzzw52) && zzY(zzzw5, zzzw52);
    }
}
