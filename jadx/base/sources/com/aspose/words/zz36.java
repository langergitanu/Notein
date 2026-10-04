package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz36 extends zz40 {
    @Override // com.aspose.words.zzZCM
    public final void zzZ(String str, zzZYD zzzyd) {
        zz40.zzZ("redOff", str, getValue(), zzzyd);
    }

    @Override // com.aspose.words.zz40
    public final zz40 zzZR0() {
        return new zz36();
    }

    @Override // com.aspose.words.zzBT, com.aspose.words.zzZCM
    public final int zzZR1() {
        return 22;
    }

    @Override // com.aspose.words.zzBT, com.aspose.words.zzZCM
    public final com.aspose.words.internal.zzPV zzl(com.aspose.words.internal.zzPV zzpv) {
        return new com.aspose.words.internal.zzPV(zzpv.zzPD(), com.aspose.words.internal.zzAN.zzZG(getValue() * 255.0d) + zzpv.zzPC(), zzpv.zzPB(), zzpv.zzPA());
    }
}
