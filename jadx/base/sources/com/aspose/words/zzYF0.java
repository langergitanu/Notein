package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYF0 {
    private int zzU8;
    private zzYHW zzXrA;
    private zzYEY zzXrB;
    private boolean zzXru;
    private int zzXrv;
    private Row zzXrw;
    private zzYEM zzXwl;
    private com.aspose.words.internal.zzD7 zzXrx = new com.aspose.words.internal.zzD7();
    private com.aspose.words.internal.zzZOR zzXrz = new com.aspose.words.internal.zzZOR();
    private zzYEX zzXry = new zzYF6(this.zzXrz);

    public zzYF0(zzYEM zzyem) throws Exception {
        this.zzXwl = zzyem;
        this.zzXrB = new zzYEY(zzyem);
        this.zzXrA = new zzYHW(this.zzXwl);
    }

    private void zzYf6() throws Exception {
        this.zzXwl.zzYfW().flush();
        this.zzXwl.zzYfW().zzYj1().zzE(this.zzXrz);
    }

    private void zzYf7() throws Exception {
        this.zzXrz.setLength(0L);
        this.zzXrz.zzH(0L);
        this.zzXwl.zzYfW().flush();
        zzYEX zzyexZzYj1 = this.zzXwl.zzYfW().zzYj1();
        this.zzXwl.zzYfW().zzZ(this.zzXry);
        zzr(this.zzXrw);
        this.zzXwl.zzYfW().flush();
        this.zzXwl.zzYfW().zzZ(zzyexZzYj1);
        this.zzXwl.zzYfW().zzYj1().zzE(this.zzXrz);
    }

    private void zzr(Row row) throws Exception {
        this.zzXwl.zzYfW().zzCD("\\trowd");
        this.zzXwl.zzYfW().zzZ5("\\irow", this.zzU8);
        this.zzXwl.zzYfW().zzZ5("\\irowband", this.zzU8);
        this.zzXwl.zzYfW().zz7("\\lastrow", row.isLastRow());
        zzY6G zzy6gZzZYf = row.zzZYf();
        this.zzXrB.zzZ(zzy6gZzZYf, false);
        int iZzCR = this.zzXrx.zzCR() + zzy6gZzZYf.zzYk9();
        this.zzXwl.zzYfW().zzZ5("\\trleft", iZzCR);
        for (Cell firstCell = row.getFirstCell(); firstCell != null; firstCell = firstCell.getNextCell()) {
            this.zzXrA.zzR(firstCell.zzYI(false));
            iZzCR += firstCell.zz6G().getWidth();
            this.zzXwl.zzYfW().zzZ5("\\cellx", iZzCR);
        }
    }

    public final void zz9(Table table) {
        this.zzXrx.zzVF(table.zzZrd());
        this.zzU8 = 0;
        this.zzXru = false;
    }

    public final void zzGW() {
        this.zzXrx.zzCQ();
        this.zzU8 = this.zzXrv;
        this.zzXru = this.zzXrx.getCount() == 1;
    }

    public final int zzYTl() {
        return this.zzXrx.getCount();
    }

    public final boolean zzYf5() {
        return this.zzXrx.getCount() > 1;
    }

    public final void zzYf8() throws Exception {
        if (this.zzXru) {
            zzYf6();
            this.zzXru = false;
        }
    }

    public final void zzs(Row row) throws Exception {
        if (zzYf5()) {
            zzr(row);
        } else if (!this.zzXwl.zzYen().getExportCompactSize()) {
            zzYf6();
        }
        this.zzU8++;
    }

    public final void zzt(Row row) throws Exception {
        if (zzYf5()) {
            return;
        }
        this.zzXrw = row;
        this.zzXrv = this.zzU8;
        zzYf7();
    }
}
