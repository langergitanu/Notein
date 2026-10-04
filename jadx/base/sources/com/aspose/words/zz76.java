package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz76 extends zzBT {
    @Override // com.aspose.words.zzZCM
    public final void zzZ(String str, zzZYD zzzyd) {
        zzzyd.zzZ(com.aspose.words.internal.zzZKN.format("{0}:gray", str), (String) null);
    }

    @Override // com.aspose.words.zzZCM
    public final zzZCM zzZFm() {
        return new zz76();
    }

    @Override // com.aspose.words.zzBT, com.aspose.words.zzZCM
    public final int zzZR1() {
        return 8;
    }

    @Override // com.aspose.words.zzBT, com.aspose.words.zzZCM
    public final com.aspose.words.internal.zzPV zzl(com.aspose.words.internal.zzPV zzpv) {
        int iZzPA = (int) ((((double) zzpv.zzPA()) * 0.114d) + (((double) zzpv.zzPB()) * 0.587d) + (((double) zzpv.zzPC()) * 0.299d));
        return new com.aspose.words.internal.zzPV(zzpv.zzPD(), iZzPA, iZzPA, iZzPA);
    }
}
