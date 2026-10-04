package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZEG extends zzZII {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("thead", "tbody", "tfoot");

    @Override // com.aspose.words.zzZII
    public final void zzZ(zzZAS zzzas, zzPR zzpr) {
        zzpr.zzV(new zzM3("vertical-align", zzL4.zzZmW, (byte) 0));
        zzpr.zzV(new zzM3("border-top-color", zzL4.zzZnn, (byte) 0));
        zzpr.zzV(new zzM3("border-right-color", zzL4.zzZnn, (byte) 0));
        zzpr.zzV(new zzM3("border-bottom-color", zzL4.zzZnn, (byte) 0));
        zzpr.zzV(new zzM3("border-left-color", zzL4.zzZnn, (byte) 0));
        int iZzTP = zzUR.zzTP(zzzas.zzZTQ());
        if (iZzTP == 0) {
            zzpr.zzV(new zzM3("display", zzL4.zzZmn, (byte) 0));
        } else if (iZzTP == 1) {
            zzpr.zzV(new zzM3("display", zzL4.zzZmo, (byte) 0));
        } else if (iZzTP == 2) {
            zzpr.zzV(new zzM3("display", zzL4.zzZmm, (byte) 0));
        }
        if (zzzas.zzKM("hidden") != null) {
            zzpr.zzV(new zzM3("visibility", zzL4.zzZm1, (byte) 0));
        }
        zzZII.zzZ((zzZBM) zzzas, zzpr, true);
        zzZUY.zzW(zzzas, zzpr);
        zzZUY.zzX(zzzas, zzpr);
        zzZBM zzzbmZzZ2Q = zzzas.zzZ2Q();
        if (zzzbmZzZ2Q != null && "table".equals(zzzbmZzZ2Q.zzZTQ()) && com.aspose.words.internal.zzZKN.zzX(zzzbmZzZ2Q.getAttributeValue("rules", ""), "groups", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8)) {
            zzOI zzoi = new zzOI(1.0d, 6);
            zzpr.zzV(new zzM3("border-top-width", zzoi, (byte) 0));
            zzpr.zzV(new zzM3("border-bottom-width", zzoi, (byte) 0));
            zzpr.zzV(new zzM3("border-top-style", zzL4.zzZlv, (byte) 0));
            zzpr.zzV(new zzM3("border-bottom-style", zzL4.zzZlv, (byte) 0));
        }
    }

    @Override // com.aspose.words.zzZUY
    public final boolean zzZjA() {
        return false;
    }
}
