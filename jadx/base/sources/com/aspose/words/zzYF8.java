package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYF8 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\sect", "\\par", "\\\r", "\\\n", "\\nestcell", "\\cell", "\\row", "\\nestrow", "\\subdocument", "\\chpgn", "\\chdate", "\\chdpl", "\\chdpa", "\\chtime");
    private zzYFT zzXwE;

    public zzYF8(zzYFT zzyft) {
        this.zzXwE = zzyft;
    }

    private void zzYfv() {
        if (this.zzXwE.zzYgo().zzYiL().zzZYh().zzYdW().toBool()) {
            this.zzXwE.zzYhj().zzZYf().zzXXd();
        }
        Row row = this.zzXwE.zzYiM().getContainer().getNodeType() == 6 ? (Row) this.zzXwE.zzYiM().getContainer() : (Row) this.zzXwE.zzYiM().getContainer().getAncestor(6);
        if (row != null) {
            this.zzXwE.zzYhj().zzp(row.getLastCell());
        }
        this.zzXwE.zzYhj().zzYfa();
        if (this.zzXwE.zzYhj().isLastRow()) {
            this.zzXwE.zzYiM().zzYhE();
        } else {
            this.zzXwE.zzYiM().zzYhC();
        }
    }

    public final boolean zzX(zzYET zzyet) throws Exception {
        switch (zzUR.zzTP(zzyet.getName())) {
            case 0:
                this.zzXwE.zzYiM().zzRn(false);
                return true;
            case 1:
            case 2:
            case 3:
                this.zzXwE.zzYiM().zzYhN();
                return true;
            case 4:
                this.zzXwE.zzYiM().zzRm(!this.zzXwE.zzYhj().zzYfe());
                return true;
            case 5:
                this.zzXwE.zzYhj().zzRh(true);
                this.zzXwE.zzYiM().zzYhy();
                Row row = (Row) com.aspose.words.internal.zzZKW.zzZ(this.zzXwE.zzYiM().getContainer(), Row.class);
                if (row != null) {
                    this.zzXwE.zzYhj().zznQ(row.getCount());
                }
                return true;
            case 6:
            case 7:
                zzYfv();
                return true;
            case 8:
                this.zzXwE.zzYiM().zzZ(new SubDocument(this.zzXwE.getDocument(), this.zzXwE.zzYgs().get(zzyet.zzYeT())));
                return true;
            case 9:
                this.zzXwE.zzYiM().zzm(33, "PAGE");
                return true;
            case 10:
                this.zzXwE.zzYiM().zzm(31, "date");
                return true;
            case 11:
                this.zzXwE.zzYiM().zzm(31, "date \\@ \"dddd, MMMM d, yyyy\"");
                return true;
            case 12:
                this.zzXwE.zzYiM().zzm(31, "date \\@ \"ddd, MMM d, yyyy\"");
                return true;
            case 13:
                this.zzXwE.zzYiM().zzm(32, "time");
                return true;
            default:
                return false;
        }
    }
}
