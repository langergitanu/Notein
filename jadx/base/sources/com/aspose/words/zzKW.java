package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzKW extends zzOO {
    public zzKW() {
        super("width", false, zzL4.zzZng, zzL3.zzZ(zzL3.zzZkg, zzL3.zzZkf, zzL3.zzX(zzL4.zzZng)));
    }

    @Override // com.aspose.words.zzMS
    public final void zzZ(zzMP zzmp, CellFormat cellFormat) {
        zzmp.getCount();
        PreferredWidth preferredWidthZzT = zzKV.zzT(zzmp);
        if (preferredWidthZzT != null) {
            cellFormat.setPreferredWidth(preferredWidthZzT);
        }
    }

    @Override // com.aspose.words.zzMS
    public final void zzZ(zzMP zzmp, Shape shape) {
        zzmp.getCount();
        PreferredWidth preferredWidthZzT = zzKV.zzT(zzmp);
        if (preferredWidthZzT == null) {
            return;
        }
        int type = preferredWidthZzT.getType();
        if (type != 2) {
            if (type == 3 && preferredWidthZzT.getValue() >= 0.0d) {
                shape.zzWf(preferredWidthZzT.getValue());
                shape.zzY9h().zzZyf().zzX3(0.0d);
                return;
            }
            return;
        }
        Section section = (Section) shape.getAncestor(2);
        if (preferredWidthZzT.getValue() >= 0.0d) {
            shape.zzY9h().zzZyf().zzX2(preferredWidthZzT.getValue());
            shape.zzWf((((double) section.getPageSetup().zzYRX()) * shape.zzY9h().zzZyf().zzZ4v()) / 100.0d);
        }
    }
}
