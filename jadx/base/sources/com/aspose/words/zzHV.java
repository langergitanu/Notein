package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzHV extends zz40 implements zzZCN {
    @Override // com.aspose.words.zzZCN
    public final void zz9K() {
        setValue(1.0d - getValue());
    }

    @Override // com.aspose.words.zzZCM
    public final void zzZ(String str, zzZYD zzzyd) {
        zz40.zzZ("alpha", str, zz3W.zzXv(getValue()), zzzyd);
    }

    @Override // com.aspose.words.zz40
    public final zz40 zzZR0() {
        return new zzHV();
    }

    @Override // com.aspose.words.zzBT, com.aspose.words.zzZCM
    public final int zzZR1() {
        return 0;
    }

    @Override // com.aspose.words.zzBT, com.aspose.words.zzZCM
    public final com.aspose.words.internal.zzPV zzl(com.aspose.words.internal.zzPV zzpv) {
        return new com.aspose.words.internal.zzPV(com.aspose.words.internal.zzAN.zzZG(getValue() * 255.0d), zzpv);
    }
}
