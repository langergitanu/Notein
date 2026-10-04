package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZLP implements zzZBJ {
    private zzZSN zzYuW = new zzZSN();

    @Override // com.aspose.words.zzZBJ
    public final zzTL zzZ(zzTJ zztj) throws Exception {
        if (this.zzYuW.getCount() < zzc4() || this.zzYuW.getCount() > zzc3()) {
            return zzZU3.zzZiV();
        }
        zzTK zztk = new zzTK();
        Iterator<zzZBJ> it = this.zzYuW.iterator();
        while (it.hasNext()) {
            zzTL zztlZzZ = it.next().zzZ(null);
            if (zztlZzZ.isError() && !zzZTa()) {
                return zztlZzZ;
            }
            if (zztlZzZ.zzbY() == 5 && !zzc2()) {
                return zzZU3.zzMy(zztlZzZ.zz8W());
            }
            zztk.zzY(zztlZzZ);
        }
        return zzZ(zztk);
    }

    public abstract zzTL zzZ(zzTK zztk);

    public final zzZSN zzZ5s() {
        return this.zzYuW;
    }

    public boolean zzZTa() {
        return false;
    }

    public boolean zzbU() {
        return false;
    }

    public abstract boolean zzc2();

    public abstract int zzc3();

    public abstract int zzc4();
}
