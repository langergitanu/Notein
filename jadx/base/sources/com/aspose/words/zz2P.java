package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz2P extends zz40 {
    public zz2P() {
    }

    private int zzH4(int i) {
        return com.aspose.words.internal.zzZZ7.zzZt(com.aspose.words.internal.zzAN.zzR(com.aspose.words.internal.zzZZ7.zzT5(i) * getValue(), 0.0d, 1.0d));
    }

    @Override // com.aspose.words.zzZCM
    public final void zzZ(String str, zzZYD zzzyd) {
        zz40.zzZ("shade", str, getValue(), zzzyd);
    }

    @Override // com.aspose.words.zz40
    public final zz40 zzZR0() {
        return new zz2P();
    }

    @Override // com.aspose.words.zzBT, com.aspose.words.zzZCM
    public final int zzZR1() {
        return 26;
    }

    @Override // com.aspose.words.zzBT, com.aspose.words.zzZCM
    public final com.aspose.words.internal.zzPV zzl(com.aspose.words.internal.zzPV zzpv) {
        return new com.aspose.words.internal.zzPV(zzpv.zzPD(), zzH4(zzpv.zzPC()), zzH4(zzpv.zzPB()), zzH4(zzpv.zzPA()));
    }

    public zz2P(double d) {
        setValue(d);
    }
}
