package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzBM extends zzBT {
    @Override // com.aspose.words.zzZCM
    public final void zzZ(String str, zzZYD zzzyd) {
        zzzyd.zzZ(com.aspose.words.internal.zzZKN.format("{0}:comp", str), (String) null);
    }

    @Override // com.aspose.words.zzZCM
    public final zzZCM zzZFm() {
        return new zzBM();
    }

    @Override // com.aspose.words.zzBT, com.aspose.words.zzZCM
    public final int zzZR1() {
        return 6;
    }

    @Override // com.aspose.words.zzBT, com.aspose.words.zzZCM
    public final com.aspose.words.internal.zzPV zzl(com.aspose.words.internal.zzPV zzpv) {
        com.aspose.words.internal.zzIP zzip = new com.aspose.words.internal.zzIP(zzpv);
        double dZzGw = zzip.zzGw() + 0.5d;
        if (dZzGw > 1.0d) {
            dZzGw -= 1.0d;
        }
        zzip.zzZS(dZzGw);
        return zzip.zzGx();
    }
}
