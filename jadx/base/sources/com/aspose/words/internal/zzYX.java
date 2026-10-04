package com.aspose.words.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzYX extends zz0V {
    private zzYW zzXO;
    private zzYY zzXP;
    private zzH0 zzXQ;

    public zzYX(zzZZR zzzzr, zzH0 zzh0, zzYY zzyy, zzYW zzyw) {
        super(zzzzr);
        this.zzXQ = zzh0;
        this.zzXP = zzyy;
        this.zzXO = zzyw;
    }

    @Override // com.aspose.words.internal.zz0V
    public final int zzZ(zzFS zzfs, zzZZR zzzzr, Map map, zz0U zz0u) throws Exception {
        Object objZzx = this.zzXQ.zzx();
        this.zzXP.setText(objZzx != null ? objZzx.toString() : "");
        this.zzXO.zzZ(this.zzXP);
        this.zzXP.setText(null);
        zzfs.zzZ(zzzzr.zzEW(), 3, this.zzXP.zzYz());
        return 0;
    }
}
