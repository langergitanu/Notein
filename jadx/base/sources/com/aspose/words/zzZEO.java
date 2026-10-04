package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZEO extends zzZII {
    @Override // com.aspose.words.zzZII
    public final void zzZ(zzZAS zzzas, zzPR zzpr) {
        zzpr.zzV(new zzM3("display", zzL4.zzZml, (byte) 0));
        zzpr.zzV(new zzM3("border-top-color", zzL4.zzZnn, (byte) 0));
        zzpr.zzV(new zzM3("border-right-color", zzL4.zzZnn, (byte) 0));
        zzpr.zzV(new zzM3("border-bottom-color", zzL4.zzZnn, (byte) 0));
        zzpr.zzV(new zzM3("border-left-color", zzL4.zzZnn, (byte) 0));
        zzpr.zzV(new zzM3("vertical-align", zzL4.zzZnn, (byte) 0));
        if (zzzas.zzKM("hidden") != null) {
            zzpr.zzV(new zzM3("visibility", zzL4.zzZm1, (byte) 0));
        }
        zzZII.zzZ((zzZBM) zzzas, zzpr, true);
        zzZUY.zzW(zzzas, zzpr);
        String strZzKM = zzzas.zzKM("height");
        if (com.aspose.words.internal.zzZYD.zzXk(strZzKM)) {
            zzL4 zzl4ZzS2 = zzL4.zzS2(strZzKM);
            if (zzl4ZzS2 == null) {
                zzl4ZzS2 = zzL4.zzS3(strZzKM);
            }
            if (zzl4ZzS2 != null) {
                zzpr.zzV(new zzM3("height", zzl4ZzS2, (byte) 0));
            }
        }
        zzZUY.zzX(zzzas, zzpr);
        zzZBM zzzbmZzZ2Q = zzzas.zzZ2Q();
        if (zzzbmZzZ2Q != null && ("thead".equals(zzzbmZzZ2Q.zzZTQ()) || "tbody".equals(zzzbmZzZ2Q.zzZTQ()) || "tfoot".equals(zzzbmZzZ2Q.zzZTQ()))) {
            zzzbmZzZ2Q = zzzbmZzZ2Q.zzZ2Q();
        }
        if (zzzbmZzZ2Q == null || !"table".equals(zzzbmZzZ2Q.zzZTQ())) {
            return;
        }
        zzOI zzoi = new zzOI(1.0d, 6);
        if (com.aspose.words.internal.zzZKN.zzX(zzzbmZzZ2Q.getAttributeValue("rules", ""), "rows", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8)) {
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
