package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz2V extends zz40 {
    @Override // com.aspose.words.zzZCM
    public final void zzZ(String str, zzZYD zzzyd) {
        zz40.zzZ("satOff", str, getValue(), zzzyd);
    }

    @Override // com.aspose.words.zz40
    public final zz40 zzZR0() {
        return new zz2V();
    }

    @Override // com.aspose.words.zzBT, com.aspose.words.zzZCM
    public final int zzZR1() {
        return 25;
    }

    @Override // com.aspose.words.zzBT, com.aspose.words.zzZCM
    public final com.aspose.words.internal.zzPV zzl(com.aspose.words.internal.zzPV zzpv) {
        com.aspose.words.internal.zzIP zzip = new com.aspose.words.internal.zzIP(zzpv);
        com.aspose.words.internal.zzPV zzpv2 = new com.aspose.words.internal.zzPV(zzpv.zzPD(), com.aspose.words.internal.zzIP.zzT(zzip.zzGw(), zzip.zzGv() + getValue(), zzip.zzGu()));
        if (!com.aspose.words.internal.zzAN.zzZD(zzip.zzGv())) {
            return zzpv2;
        }
        return new com.aspose.words.internal.zzPV(zzpv2.zzPD(), zzpv2.zzPC(), zzpv2.zzPB(), com.aspose.words.internal.zzIP.zzT(zzip.zzGw(), getValue() * 5.0d, zzip.zzGu()).zzPA());
    }
}
