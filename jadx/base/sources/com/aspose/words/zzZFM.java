package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZFM extends zzZII {
    @Override // com.aspose.words.zzZII
    public final void zzZ(zzZAS zzzas, zzPR zzpr) {
        zzpr.zzV(new zzM3("display", zzL4.zzZmt, (byte) 0));
        zzpr.zzV(new zzM3("font-family", new zzPA(zzL4.zzZkU)));
        zzpr.zzV(new zzM3("white-space", zzL4.zzZlN, (byte) 0));
        if (zzzas.zzKM("wrap") != null) {
            zzpr.zzV(new zzM3("white-space", zzL4.zzZlY, (byte) 0));
        }
    }
}
