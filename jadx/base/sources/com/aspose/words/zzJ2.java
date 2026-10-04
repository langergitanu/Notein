package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzJ2 extends zzJ3 {
    private boolean zzZhS;
    private boolean zzZhT;

    public zzJ2(zzJ6 zzj6) {
        this.zzZhT = zzj6.zzZRU();
        this.zzZhS = zzj6.zzZRT();
    }

    @Override // com.aspose.words.zzJ3
    public final void zzZ(zz2O zz2o) {
        zz2o.setFill(new zz54());
        zz2o.setOutline(new zz4G());
        zz2o.getOutline().zzXK(6350.0d);
        zz2o.getOutline().setEndCap(2);
        zz2o.getOutline().zzHo(0);
        if (this.zzZhT) {
            zz2o.getOutline().zzZ(new zz6T());
            zz2o.getOutline().zzZxB().setType(1);
        }
        if (this.zzZhS) {
            zz2o.getOutline().zzZ(new zz12());
            zz2o.getOutline().zzZxA().setType(1);
        }
    }

    @Override // com.aspose.words.zzJ3
    public final boolean zzZRS() {
        return true;
    }
}
