package com.aspose.words.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzX3 extends zz0V {
    private int zzUf;
    private zzH0 zzXQ;

    public zzX3(zzZZR zzzzr, int i, zzH0 zzh0) {
        super(zzzzr);
        this.zzUf = i;
        this.zzXQ = zzh0;
    }

    @Override // com.aspose.words.internal.zz0V
    public final int zzZ(zzFS zzfs, zzZZR zzzzr, Map map, zz0U zz0u) throws Exception {
        Object objZzF = zzfs.zzF(zzzzr.zzEW());
        if (objZzF == null) {
            return 3;
        }
        zzH0 zzh0 = this.zzXQ;
        zz0u.zzsv().zzZ(objZzF, this.zzUf, zzsx(), zzh0 != null ? zzh0.zzx() : null);
        return 3;
    }
}
