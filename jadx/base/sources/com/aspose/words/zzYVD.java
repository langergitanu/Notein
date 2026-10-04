package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYVD {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("tcPr", "pPr", "tcW", "hMerge");
    private zzYVF zzXUn;
    private zzYUE zzXUo;
    private zzYUV zzXUq;

    public zzYVD(zzYUE zzyue, zzYUV zzyuv, zzYVF zzyvf) {
        this.zzXUo = zzyue;
        this.zzXUq = zzyuv;
        this.zzXUn = zzyvf;
    }

    private static boolean zzB(Cell cell) {
        if (cell.zz6G().getHorizontalMerge() != 2) {
            return false;
        }
        Cell previousCell = cell.getPreviousCell();
        while (previousCell != null && previousCell.zz6G().getHorizontalMerge() == 2) {
            previousCell = previousCell.getPreviousCell();
        }
        return previousCell != null && previousCell.zz6G().getHorizontalMerge() == 1;
    }

    public final void zzY(zzYVB zzyvb) throws Exception {
        Cell cell = new Cell(zzyvb.getDocument());
        zzyvb.zzT(cell);
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        while (zzyu4ZzZsD.zzQ("tc")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 0) {
                this.zzXUn.zzY(zzyvb, cell.zz6G());
            } else if (iZzTP == 1) {
                this.zzXUq.zzY(zzyvb, zzyvb.zzXUh, zzyvb.zzXUf);
            } else if (iZzTP == 2) {
                cell.zz6G().zzZ(zzyu4ZzZsD.zzX(zzyvb.zzZqn()));
            } else if (iZzTP == 3) {
                zzYVF.zzY(zzyu4ZzZsD, cell.zz6G());
            } else if (!zzyvb.zzZmh() || !zzyvb.zzYyZ().zzZrB() || cell.getParentRow().getParentTable().getAllowAutoFit() || !zzB(cell)) {
                this.zzXUo.zzF(zzyvb);
            }
        }
        zzyvb.zztj(7);
    }
}
