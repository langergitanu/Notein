package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJF extends zzZII {
    @Override // com.aspose.words.zzZII
    public final void zzZ(zzZAS zzzas, zzPR zzpr) {
        zzpr.zzV(new zzM3("display", zzL4.zzZmk, (byte) 0));
        if (zzzas.zzKM("hidden") != null) {
            zzpr.zzV(new zzM3("visibility", zzL4.zzZm1, (byte) 0));
        }
        zzZBM zzzbmZzZ2Q = zzzas.zzZ2Q();
        if (zzzbmZzZ2Q != null && "table".equals(zzzbmZzZ2Q.zzZTQ()) && com.aspose.words.internal.zzZKN.zzX(zzzbmZzZ2Q.getAttributeValue("rules", ""), "groups", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8)) {
            zzOI zzoi = new zzOI(1.0d, 6);
            zzpr.zzV(new zzM3("border-right-width", zzoi, (byte) 0));
            zzpr.zzV(new zzM3("border-left-width", zzoi, (byte) 0));
            zzpr.zzV(new zzM3("border-right-style", zzL4.zzZlv, (byte) 0));
            zzpr.zzV(new zzM3("border-left-style", zzL4.zzZlv, (byte) 0));
        }
    }

    @Override // com.aspose.words.zzZUY
    public final boolean zzZjA() {
        return false;
    }
}
