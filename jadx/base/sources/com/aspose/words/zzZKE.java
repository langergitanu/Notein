package com.aspose.words;

import com.orion.notein.domain.models.note.NoteMeta;

/* JADX INFO: loaded from: classes6.dex */
final class zzZKE extends zzZII {
    private static zzPS zzYtx = new zzPS(new zzM3("border-bottom-style", zzL4.zzZlx, (byte) 0), new zzM3("border-bottom-width", new zzOI(1.0d, 6), (byte) 0));

    @Override // com.aspose.words.zzZII
    public final void zzZ(zzZAS zzzas, zzPR zzpr) {
        if (zzzas.zzKM(NoteMeta.PROPERTY_TITLE) != null) {
            zzpr.zzO(zzYtx);
        }
    }
}
