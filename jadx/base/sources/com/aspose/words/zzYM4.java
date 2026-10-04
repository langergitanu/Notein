package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYM4 {
    static zzYM4 zzXFf = new zzYM4((byte) 0);
    zzYM2 zzXFg;
    zzYM2 zzXFh;
    zzYM2 zzXFi;
    zzYM2 zzXFj;

    public zzYM4() {
        this.zzXFj = new zzYM2();
        this.zzXFi = new zzYM2();
        this.zzXFh = new zzYM2();
        this.zzXFg = new zzYM2();
    }

    public final zzYM4 zzYnE() {
        zzYM4 zzym4 = new zzYM4();
        zzym4.zzXFj = this.zzXFj.zzYnD();
        zzym4.zzXFi = this.zzXFi.zzYnD();
        zzym4.zzXFh = this.zzXFh.zzYnD();
        zzym4.zzXFg = this.zzXFg.zzYnD();
        return zzym4;
    }

    public final boolean zzZ(zzYM4 zzym4) {
        if (com.aspose.words.internal.zzZKO.zzA(null, zzym4)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, zzym4)) {
            return true;
        }
        return this.zzXFj.zzY(zzym4.zzXFj) && this.zzXFi.zzY(zzym4.zzXFi) && this.zzXFh.zzY(zzym4.zzXFh) && this.zzXFg.zzY(zzym4.zzXFg);
    }

    private zzYM4(byte b) {
        this.zzXFj = new zzYM2();
        this.zzXFi = new zzYM2();
        this.zzXFh = new zzYM2();
        this.zzXFg = new zzYM2();
        this.zzXFj = new zzYM2(3163);
        this.zzXFi = new zzYM2(3163);
        this.zzXFh = new zzYM2(18437);
        this.zzXFg = new zzYM2(18437);
    }
}
