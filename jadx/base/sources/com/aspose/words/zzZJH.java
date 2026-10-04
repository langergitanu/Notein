package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJH extends zzZII {
    @Override // com.aspose.words.zzZII
    public final void zzZ(zzZAS zzzas, zzPR zzpr) {
        zzpr.zzV(new zzM3("display", zzL4.zzZmj, (byte) 0));
        if (zzzas.zzKM("hidden") != null) {
            zzpr.zzV(new zzM3("visibility", zzL4.zzZm1, (byte) 0));
        }
        zzL4 zzl4ZzS2 = zzL4.zzS2(zzzas.zzKM("width"));
        if (zzl4ZzS2 != null) {
            zzpr.zzV(new zzM3("width", zzl4ZzS2, (byte) 0));
        }
    }

    @Override // com.aspose.words.zzZUY
    public final boolean zzZjA() {
        return false;
    }
}
