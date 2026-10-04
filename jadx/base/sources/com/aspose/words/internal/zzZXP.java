package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZXP implements zzFN {
    public static zzZXP zzb6 = new zzZXP();

    private zzZXP() {
    }

    @Override // com.aspose.words.internal.zzFN
    public final zzFM zzEJ() {
        return new zzZXO();
    }

    @Override // com.aspose.words.internal.zzFN
    public final zzFO zzEK() {
        return zzZXQ.zzb8;
    }

    @Override // com.aspose.words.internal.zzFN
    public final zzFM zzW8(int i) {
        return new zzZXO(i);
    }

    @Override // com.aspose.words.internal.zzFN
    public final zzFM zzY(zzFO zzfo) {
        return new zzZXO(new StringBuilder(((zzZXQ) zzfo).getValue()));
    }

    @Override // com.aspose.words.internal.zzFN
    public final zzFO zzYT(String str) {
        return zzZXQ.zzWW(str);
    }

    @Override // com.aspose.words.internal.zzFN
    public final boolean zzZ(zzFO zzfo) {
        if (zzfo == null) {
            return true;
        }
        return zzZKN.zzU3(((zzZXQ) zzfo).getValue());
    }
}
