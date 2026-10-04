package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzHZ {
    private zzJF zzZig;
    private int zzZhu = 1;
    private int zzZht = 2;
    private int zzUt = 1;
    private int zzZhy = 1;
    private zzI8 zzZhs = new zzI5();
    private zzIH zzZhr = new zzIF();
    private int zzZhF = 0;
    private int zzZhE = 1;

    public final int getOffset() {
        return this.zzUt;
    }

    public final void zzX(com.aspose.words.internal.zzZYT<String> zzzyt) {
        if (zzzyt.containsKey("bkpt")) {
            this.zzZhu = zz9Z.zzPW(zzzyt.get("bkpt"));
        }
        this.zzZht = zzIM.zzZ(zzzyt, "bkPtFixedVal", 32766);
        if (zzzyt.containsKey("off")) {
            this.zzUt = zz9Z.zzPV(zzzyt.get("off"));
        }
        if (zzzyt.containsKey("contDir")) {
            this.zzZhy = zz9Z.zzPU(zzzyt.get("contDir"));
        }
        if (zzzyt.containsKey("grDir")) {
            this.zzZhs = zzI8.zzRF(zzzyt.get("grDir"));
        }
        if (zzzyt.containsKey("flowDir")) {
            this.zzZhr = zzIH.zzRG(zzzyt.get("flowDir"));
        }
        if (zzzyt.containsKey("nodeHorzAlign")) {
            this.zzZhF = zz9Z.zzQ1(zzzyt.get("nodeHorzAlign"));
        }
        if (zzzyt.containsKey("nodeVertAlign")) {
            this.zzZhE = zz9Z.zzQ0(zzzyt.get("nodeVertAlign"));
        }
        this.zzZig = zzJF.zzY(zzzyt);
    }

    public final int zzZRF() {
        return this.zzZhE;
    }

    public final int zzZRG() {
        return this.zzZhF;
    }

    public final zzIH zzZRl() {
        return this.zzZhr;
    }

    public final zzI8 zzZRm() {
        return this.zzZhs;
    }

    public final int zzZRn() {
        return this.zzZht;
    }

    public final int zzZRo() {
        return this.zzZhu;
    }

    public final int zzZRt() {
        return this.zzZhy;
    }

    public final zzJF zzZSe() {
        return this.zzZig;
    }
}
