package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZ1D {
    private com.aspose.words.internal.zzZQC<zzWF> zzY2D = new com.aspose.words.internal.zzZQC<>();
    private boolean zzYrO;

    public zzZ1D(boolean z) {
        this.zzYrO = z;
    }

    private void zzD(Cell cell) {
        cell.getParentRow();
        zzJ(cell.getParentRow());
        zzYHm().zz4Q();
        while (zzYHm().zz4K() != null && zzYHm().zz4K().zz52() != cell) {
            zzYHm().zz4P();
        }
        zzYHm().zz4K();
    }

    private boolean zzE(Cell cell) {
        cell.getParentRow().getParentTable();
        if (this.zzYrO) {
            return (zzYNg() && zzYHm().zz4N() == cell.getParentRow().getParentTable()) ? false : true;
        }
        return false;
    }

    private void zzJ(Row row) {
        row.getParentTable();
        zzWF zzwfZzo = zzo(row.getParentTable());
        zzwfZzo.zz4S();
        while (zzwfZzo.zz4L() != null && zzwfZzo.zz4L().zz4Z() != row) {
            zzwfZzo.zz4R();
        }
        zzwfZzo.zz4L();
    }

    private boolean zzK(Row row) {
        row.getParentTable();
        if (this.zzYrO) {
            return (zzYNg() && zzYHm().zz4N() == row.getParentTable()) ? false : true;
        }
        return false;
    }

    private zzWF zzo(Table table) {
        zzWF zzwf = new zzWF(table, 1);
        this.zzY2D.push(zzwf);
        return zzwf;
    }

    public final void zzF(Cell cell) throws Exception {
        if (zzE(cell)) {
            zzD(cell);
        }
        zzYYu();
    }

    public final void zzL(Row row) throws Exception {
        if (zzK(row)) {
            zzJ(row);
        }
        zzYYw();
        zzYHm().zz4Q();
        while (zzYHm().zz4K() != null && zzYHm().zz4K().zz51()) {
            zzYYu();
            zzYYt();
            zzYHm().zz4P();
        }
    }

    public final zzWF zzYHm() {
        this.zzY2D.size();
        return this.zzY2D.peek();
    }

    public final void zzYHn() throws Exception {
        zzYYt();
        zzYHm().zz4P();
    }

    public final void zzYHo() throws Exception {
        while (zzYHm().zz4K() != null) {
            if (!zzYHm().zz4K().zz51()) {
                throw new IllegalStateException("Expected pad cells only.");
            }
            zzYYu();
            zzYYt();
            zzYHm().zz4P();
        }
        zzYYv();
        zzYHm().zz4R();
    }

    public final boolean zzYNg() {
        return this.zzY2D.size() != 0;
    }

    public abstract void zzYYt() throws Exception;

    public abstract void zzYYu() throws Exception;

    public abstract void zzYYv() throws Exception;

    public abstract void zzYYw() throws Exception;

    public final void zzp(Table table) throws Exception {
        zzt(table);
        this.zzY2D.pop();
    }

    public final void zzq(Table table) throws Exception {
        zzo(table);
        zzYHm().zz4S();
        zzu(table);
    }

    public abstract void zzt(Table table) throws Exception;

    public abstract void zzu(Table table) throws Exception;

    public final double zzuW(int i) {
        return ((double) zzYHm().zzOg(i)) / 20.0d;
    }
}
