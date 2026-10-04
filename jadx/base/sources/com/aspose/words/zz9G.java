package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz9G extends zz9B {
    private zzIZ zzZ5O;

    public zz9G(zz8Z zz8z) {
        super(zz8z);
    }

    public final void zzT(zz2O zz2o) {
        zzS(zz2o);
        if (zz2o.zzZAk() != null) {
            zz2o.zzZAk().zzZ(zzU(zz2o));
        }
    }

    @Override // com.aspose.words.zz9B
    public final zz07 zzU(zz2O zz2o) {
        return this.zzZ5O.zzYe(zzZDQ());
    }

    public final void zzZ(zzIZ zziz) {
        this.zzZ5O = zziz;
    }

    @Override // com.aspose.words.zz9B
    public final zz8O zzZDp() {
        return new zz8O(this, new zzHY(zzZDR()), this.zzZ5O.zzYd(zzZDQ()));
    }

    @Override // com.aspose.words.zz9B
    public final zz2O zzZDq() {
        zz2O zz2o = new zz2O(0);
        zz2o.zzO(zzZDL().zzZCJ());
        return zz2o;
    }
}
