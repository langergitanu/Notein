package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zz2Q {
    private zz6T zzgH;
    private zz2O zzgI;
    private zz4W zzkV;

    public zz2Q(zz4W zz4w) {
        this.zzkV = zz4w;
        this.zzgH = new zz6T(zz4w.zzvc().zztw());
    }

    public final boolean isEmpty() {
        return this.zzgH.zzx3().zzwZ().size() == 0;
    }

    public final void zzY(zzFX zzfx) throws Exception {
        this.zzgI.zzY(zzfx);
    }

    public final void zzZ(zzI zzi, zz4R zz4r) {
        this.zzgH.zzZ(zzi, new zz2P(zzi.getDisplayName(), zz4r));
    }

    public final String zztt() {
        return this.zzgI.zzF0();
    }

    public final void zztu() {
        this.zzgI = zzZ(this.zzgH.zzx3(), true);
    }

    public final void zzZ(zzZI zzzi, zz4R zz4r) {
        this.zzgH.zzZ(zzzi, new zz2P(zzzi.getTitle(), zz4r));
    }

    private zz2O zzZ(zz6S zz6s, boolean z) {
        zz2O zz2o = new zz2O(this.zzkV, (zz2P) zz6s.zzwX(), zz6s.zzwY(), z);
        Iterator<zz6S> it = zz6s.zzwZ().iterator();
        while (it.hasNext()) {
            zz2o.zzZ(zzZ(it.next(), false));
        }
        return zz2o;
    }
}
