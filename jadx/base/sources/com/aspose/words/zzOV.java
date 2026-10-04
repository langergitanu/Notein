package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzOV extends zzOO {
    public zzOV() {
        super("height", false, zzL4.zzZng, zzL3.zzZ(zzL3.zzZkg, zzL3.zzZkf, zzL3.zzJ(zzL4.zzZng)));
    }

    @Override // com.aspose.words.zzMS
    public final void zzZ(zzMP zzmp, Row row) {
        zzmp.getCount();
        double dZzW = zzL5.zzW(zzmp);
        if (com.aspose.words.internal.zzAN.zzL(dZzW, -1.7976931348623157E308d)) {
            return;
        }
        row.getRowFormat().setHeight(dZzW);
        row.getRowFormat().setHeightRule(0);
    }
}
