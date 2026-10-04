package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz2Q extends zzBW {
    private int zzZn;

    @Override // com.aspose.words.zzBW
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return com.aspose.words.internal.zzZKO.equals(Integer.valueOf(((zz2Q) obj).zzZn), Integer.valueOf(this.zzZn));
        }
        return false;
    }

    public final int getValue() {
        return this.zzZn;
    }

    @Override // com.aspose.words.zzBW
    public int hashCode() {
        return super.hashCode() ^ this.zzZn;
    }

    public final void setValue(int i) {
        this.zzZn = i;
    }

    public final zz6S zzS(zzZ90 zzz90) {
        zz6S zz6sZzh = zz6S.zzh(zzZ(zzz90));
        zzU(zz6sZzh);
        return zz6sZzh;
    }

    @Override // com.aspose.words.zzBW
    public final com.aspose.words.internal.zzPV zzZ(zzZ90 zzz90) {
        return zzz90 == null ? com.aspose.words.internal.zzPV.zzHZ : zzz90.getThemeColor(this.zzZn).zzZ(zzz90, (zzZCM) null);
    }

    @Override // com.aspose.words.zzBW
    public final int zzZHs() {
        return 5;
    }

    @Override // com.aspose.words.zzBW
    public final zzBW zzZHt() {
        zz2Q zz2q = new zz2Q();
        zz2q.zzZn = this.zzZn;
        zzU(zz2q);
        return zz2q;
    }
}
