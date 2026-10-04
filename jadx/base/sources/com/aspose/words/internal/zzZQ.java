package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZQ extends zz6 {
    private ArrayList<zzZR> zzYJ = new ArrayList<>();

    private zzZQ() {
    }

    public static ArrayList<zzZR> zzU(zzZL zzzl) throws Exception {
        zzZQ zzzq = new zzZQ();
        zzzl.zzZ(zzzq);
        return zzzq.zzYJ;
    }

    private void zzY(zzL zzl) {
        zzZR zzzr;
        if (zzl == null || (zzzr = (zzZR) zzZKW.zzZ(zzl, zzZR.class)) == null) {
            return;
        }
        zzZQG.zzZ(this.zzYJ, zzzr);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzG zzg) {
        zzY(zzg.zzZM());
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZU zzzu) {
        zzY(zzzu.zzZl());
    }
}
