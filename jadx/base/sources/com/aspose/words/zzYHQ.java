package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYHQ {
    private boolean zzXw3;
    protected zzYFT zzXw4;

    public zzYHQ(zzYFT zzyft) {
        this.zzXw4 = zzyft;
    }

    public final Document getDocument() {
        return this.zzXw4.getDocument();
    }

    public final void zzO(zzYET zzyet) throws Exception {
        zzyet.zzRg(true);
        if (this.zzXw4.zzYgi() == null || !this.zzXw4.zzYgi().zzZrB()) {
            this.zzXw4.zzC0(zzyet.getName());
        }
    }

    public void zzT(zzYET zzyet) throws Exception {
    }

    public void zzY(zzYET zzyet) throws Exception {
    }

    public final void zzYiJ() {
        this.zzXw3 = true;
    }

    public final boolean zzYiK() {
        return this.zzXw3;
    }

    public final zzYH3 zzYiL() {
        return this.zzXw4.zzYgo().zzYiL();
    }

    public final zzYGC zzYiM() {
        return this.zzXw4.zzYiM();
    }

    public final zzYHP zzYiN() {
        return zzYiL().zzYiN();
    }

    public void zzYiO() throws Exception {
    }

    public void zzYiP() {
    }

    public boolean zzYiX() {
        return false;
    }

    public void zzYjb() throws Exception {
    }

    public zzYHQ zzZ(zzYHP zzyhp) throws Exception {
        return null;
    }

    public void zzZ(zzYET zzyet) throws Exception {
    }
}
