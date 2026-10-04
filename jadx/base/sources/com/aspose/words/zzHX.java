package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzHX {
    private zz0E zzZhg;
    private zz0E zzZhh;
    private zz0E zzZhi;
    private zz0E zzZhj;
    private zzJF zzZig;
    private int zzZhk = 2;
    private int zzZhf = 1;
    private int zzZhe = 1;
    private int zzZhd = 0;
    private int zzZhc = 0;
    private int zzZhb = 2;
    private int zzZha = 1;
    private int zzZh9 = 1;
    private int zzZh8 = 1;
    private int zzZh7 = 2;
    private int zzZh6 = 0;

    private static int zzLF(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 0;
        }
        throw new IllegalStateException("Unexpected vertical text anchor.");
    }

    private static int zzLG(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw new IllegalStateException("Unexpected text alignment.");
    }

    private static zz0E zzZ(com.aspose.words.internal.zzZYT<String> zzzyt, String str, double d) {
        return new zz3X(zzIM.zzZ(zzzyt, str, d, 0.0d, 1000.0d) / 100.0d);
    }

    public final void zzX(com.aspose.words.internal.zzZYT<String> zzzyt) {
        if (zzzyt.containsKey("autoTxRot")) {
            this.zzZhk = zz9Z.zzPT(zzzyt.get("autoTxRot"));
        }
        this.zzZhj = zzZ(zzzyt, "lnSpAfChP", 15.0d);
        this.zzZhi = zzZ(zzzyt, "lnSpAfParP", 35.0d);
        this.zzZhh = zzZ(zzzyt, "lnSpCh", 90.0d);
        this.zzZhg = zzZ(zzzyt, "lnSpPar", 90.0d);
        if (zzzyt.containsKey("parTxLTRAlign")) {
            this.zzZhf = zz9Z.zzPS(zzzyt.get("parTxLTRAlign"));
        }
        if (zzzyt.containsKey("parTxRTLAlign")) {
            this.zzZhe = zz9Z.zzPS(zzzyt.get("parTxRTLAlign"));
        }
        if (zzzyt.containsKey("shpTxLTRAlignCh")) {
            this.zzZhd = zz9Z.zzPS(zzzyt.get("shpTxLTRAlignCh"));
        }
        if (zzzyt.containsKey("shpTxRTLAlignCh")) {
            this.zzZhc = zz9Z.zzPS(zzzyt.get("shpTxRTLAlignCh"));
        }
        this.zzZhb = zzIM.zzZ(zzzyt, "stBulletLvl", 2);
        if (zzzyt.containsKey("txAnchorHorz")) {
            this.zzZha = zz9Z.zzPR(zzzyt.get("txAnchorHorz"));
        }
        if (zzzyt.containsKey("txAnchorHorzCh")) {
            this.zzZh9 = zz9Z.zzPR(zzzyt.get("txAnchorHorzCh"));
        }
        if (zzzyt.containsKey("txAnchorVert")) {
            this.zzZh8 = zz9Z.zzPQ(zzzyt.get("txAnchorVert"));
        }
        if (zzzyt.containsKey("txAnchorVertCh")) {
            this.zzZh7 = zz9Z.zzPQ(zzzyt.get("txAnchorVertCh"));
        }
        if (zzzyt.containsKey("txBlDir")) {
            this.zzZh6 = zz9Z.zzPP(zzzyt.get("txBlDir"));
        }
        this.zzZig = zzJF.zzY(zzzyt);
    }

    public final int zzZR2() {
        int i = this.zzZh6;
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        throw new IllegalStateException("Unexpected text block direction.");
    }

    public final int zzZR3() {
        return zzLF(this.zzZh7);
    }

    public final int zzZR4() {
        return zzLF(this.zzZh8);
    }

    public final boolean zzZR5() {
        return this.zzZh9 == 0;
    }

    public final boolean zzZR6() {
        return this.zzZha == 0;
    }

    public final boolean zzZR7() {
        return this.zzZhb == 1;
    }

    public final int zzZR8() {
        return zzLG(this.zzZhd);
    }

    public final int zzZR9() {
        return zzLG(this.zzZhf);
    }

    public final zz0E zzZRa() {
        return this.zzZhg;
    }

    public final zz0E zzZRb() {
        return this.zzZhh;
    }

    public final zz0E zzZRc() {
        return this.zzZhi;
    }

    public final zz0E zzZRd() {
        return this.zzZhj;
    }

    public final int zzZRe() {
        return this.zzZhk;
    }
}
