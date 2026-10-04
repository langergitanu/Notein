package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz6L extends zzBT {
    private zzHK zzZ2S;

    @Override // com.aspose.words.zzBT
    public boolean equals(Object obj) {
        zz6L zz6l = (zz6L) com.aspose.words.internal.zzZKW.zzZ(obj, zz6L.class);
        if (zz6l == null) {
            return false;
        }
        zzHK zzhk = this.zzZ2S;
        return ((zzhk == null && zz6l.zzZ2S == null) || (zzhk != null && zzhk.zzZ(zz6l.zzZ2S))) && super.equals(obj);
    }

    @Override // com.aspose.words.zzBT
    public int hashCode() {
        zzHK zzhk = this.zzZ2S;
        if (zzhk != null) {
            return com.aspose.words.internal.zzZKP.zzZ9(zzhk.getValue()) ^ 12;
        }
        return 12;
    }

    public final void zzV(zzHK zzhk) {
        this.zzZ2S = zzhk;
    }

    @Override // com.aspose.words.zzZCM
    public final void zzZ(String str, zzZYD zzzyd) {
        zzzyd.zzX(com.aspose.words.internal.zzZKN.format("{0}:hue", str), zz56.zzZl(str, "val"), Double.valueOf(this.zzZ2S.getValue()));
    }

    @Override // com.aspose.words.zzZCM
    public final zzZCM zzZFm() {
        zz6L zz6l = new zz6L();
        zz6l.zzZ2S = this.zzZ2S;
        return zz6l;
    }

    @Override // com.aspose.words.zzBT, com.aspose.words.zzZCM
    public final int zzZR1() {
        return 12;
    }

    @Override // com.aspose.words.zzBT, com.aspose.words.zzZCM
    public final com.aspose.words.internal.zzPV zzl(com.aspose.words.internal.zzPV zzpv) {
        com.aspose.words.internal.zzIP zzip = new com.aspose.words.internal.zzIP(zzpv);
        zzip.zzZS(this.zzZ2S.zzZQQ() / 360.0d);
        return new com.aspose.words.internal.zzPV(zzpv.zzPD(), zzip.zzGx());
    }
}
