package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz6F extends zzBT {
    @Override // com.aspose.words.zzZCM
    public final void zzZ(String str, zzZYD zzzyd) {
        zzzyd.zzZ(com.aspose.words.internal.zzZKN.format("{0}:inv", str), (String) null);
    }

    @Override // com.aspose.words.zzZCM
    public final zzZCM zzZFm() {
        return new zz6F();
    }

    @Override // com.aspose.words.zzBT, com.aspose.words.zzZCM
    public final int zzZR1() {
        return 15;
    }

    @Override // com.aspose.words.zzBT, com.aspose.words.zzZCM
    public final com.aspose.words.internal.zzPV zzl(com.aspose.words.internal.zzPV zzpv) {
        return new com.aspose.words.internal.zzPV(zzpv.zzPD(), 255 - zzpv.zzPC(), 255 - zzpv.zzPB(), 255 - zzpv.zzPA());
    }
}
