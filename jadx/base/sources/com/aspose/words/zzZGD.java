package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZGD extends zzZII {
    @Override // com.aspose.words.zzZII
    public final void zzZ(zzZAS zzzas, zzPR zzpr) {
        zzZUY.zzX(zzzas, zzpr);
        zzZII.zzT(zzzas, zzpr);
        zzZII.zzS(zzzas, zzpr);
        zzL4 zzl4ZzS2 = zzL4.zzS2(zzzas.zzKM("hspace"));
        if (zzl4ZzS2 != null) {
            zzpr.zzV(new zzM3("margin-left", zzl4ZzS2, (byte) 0));
            zzpr.zzV(new zzM3("margin-right", zzl4ZzS2, (byte) 0));
        }
        zzL4 zzl4ZzS22 = zzL4.zzS2(zzzas.zzKM("vspace"));
        if (zzl4ZzS22 != null) {
            zzpr.zzV(new zzM3("margin-top", zzl4ZzS22, (byte) 0));
            zzpr.zzV(new zzM3("margin-bottom", zzl4ZzS22, (byte) 0));
        }
    }
}
