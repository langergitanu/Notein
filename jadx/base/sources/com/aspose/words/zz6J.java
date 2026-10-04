package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz6J extends zzBT {
    private zzHK zzZ2S = new zzHK();

    @Override // com.aspose.words.zzBT
    public boolean equals(Object obj) {
        zz6J zz6j = (zz6J) com.aspose.words.internal.zzZKW.zzZ(obj, zz6J.class);
        if (zz6j == null) {
            return false;
        }
        zzHK zzhk = this.zzZ2S;
        return ((zzhk == null && zz6j.zzZ2S == null) || (zzhk != null && zzhk.zzZ(zz6j.zzZ2S))) && super.equals(obj);
    }

    @Override // com.aspose.words.zzBT
    public int hashCode() {
        zzHK zzhk = this.zzZ2S;
        if (zzhk != null) {
            return com.aspose.words.internal.zzZKP.zzZ9(zzhk.getValue()) ^ 14;
        }
        return 14;
    }

    public final void zzV(zzHK zzhk) {
        this.zzZ2S = zzhk;
    }

    @Override // com.aspose.words.zzZCM
    public final void zzZ(String str, zzZYD zzzyd) {
        zzzyd.zzX(com.aspose.words.internal.zzZKN.format("{0}:hueOff", str), zz56.zzZl(str, "val"), Double.valueOf(this.zzZ2S.getValue()));
    }

    @Override // com.aspose.words.zzZCM
    public final zzZCM zzZFm() {
        zz6J zz6j = new zz6J();
        zz6j.zzZ2S = this.zzZ2S;
        return zz6j;
    }

    @Override // com.aspose.words.zzBT, com.aspose.words.zzZCM
    public final int zzZR1() {
        return 14;
    }

    @Override // com.aspose.words.zzBT, com.aspose.words.zzZCM
    public final com.aspose.words.internal.zzPV zzl(com.aspose.words.internal.zzPV zzpv) {
        com.aspose.words.internal.zzIP zzip = new com.aspose.words.internal.zzIP(zzpv);
        zzip.zzZS((this.zzZ2S.zzZQQ() / 360.0d) + zzip.zzGw());
        return new com.aspose.words.internal.zzPV(zzpv.zzPD(), zzip.zzGx());
    }
}
