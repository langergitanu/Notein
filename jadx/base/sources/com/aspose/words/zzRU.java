package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzRU extends zzOO {
    public zzRU() {
        super("background-color", false, zzL4.zzZnp, zzL3.zzZ(zzL3.zzZkd, zzL3.zzJ(zzL4.zzZnp)));
    }

    @Override // com.aspose.words.zzMS
    public final void zzZ(zzMP zzmp, Table table) {
        zzmp.getCount();
        zzL4 zzl4ZzZVx = zzmp.zzZVx();
        Shading shading = new Shading();
        zzZ(zzl4ZzZVx, shading);
        if (shading.isVisible()) {
            for (Row row : table.getRows()) {
                row.zzZYf().zzZ(shading.zzYbE());
                for (Cell cell : row.getCells()) {
                    if (!cell.zz6G().contains(3170)) {
                        cell.zz6G().zzZ(shading.zzYbE());
                    }
                }
            }
        }
    }

    @Override // com.aspose.words.zzMS
    public final void zzZ(zzMP zzmp, CellFormat cellFormat) {
        zzmp.getCount();
        zzZ(zzmp.zzZVx(), cellFormat.getShading());
    }

    @Override // com.aspose.words.zzMS
    public final void zzZ(zzMP zzmp, Shape shape) {
        zzmp.getCount();
        zzL4 zzl4ZzZVx = zzmp.zzZVx();
        if (zzl4ZzZVx.getValueType() == 2) {
            shape.zzY9J().zzm(((zzQC) zzl4ZzZVx).zzZWw());
        }
    }

    @Override // com.aspose.words.zzMS
    public final void zzZ(zzMP zzmp, Document document) {
        zzmp.getCount();
        zzL4 zzl4ZzZVx = zzmp.zzZVx();
        if (zzl4ZzZVx.getValueType() == 2) {
            document.setPageColor(((zzQC) zzl4ZzZVx).zzZWw().zzPG());
        }
    }

    private static void zzZ(zzL4 zzl4, Shading shading) {
        if (zzl4.getValueType() == 2) {
            shading.setTexture(0);
            shading.zzZK(((zzQC) zzl4).zzZWw());
        }
    }
}
