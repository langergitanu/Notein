package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ3L {
    private int zzYaJ;
    private zzZ zzYaK;
    private com.aspose.words.internal.zzD3<zzZ> zzYaL;
    private com.aspose.words.internal.zzD3<zzZ> zzYaM;
    private boolean zzYaN;
    private int zzYaO;
    private com.aspose.words.internal.zzB1 zzYaP;
    private boolean zzYaQ;
    private int zzYaR;
    private com.aspose.words.internal.zzB3 zzYaS;
    private com.aspose.words.internal.zzBG zzYb8;
    private zzZ3T zzZFQ;

    public static class zzZ {
        public boolean zzYaF;
        public zzZAH zzYaG;
        public int zzYaH;
        public com.aspose.words.internal.zzB2 zzYaI;

        private zzZ() {
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    public zzZ3L(zzZ3T zzz3t, com.aspose.words.internal.zzBG zzbg) {
        this.zzZFQ = zzz3t;
        this.zzYb8 = zzbg;
    }

    private void zzGW() {
        this.zzYaP = null;
        this.zzYaO = 0;
        this.zzYaL = null;
        this.zzYaM = null;
    }

    private static int zzR(zzWV zzwv) {
        int i = 1;
        for (zzWV zzwvZz6n = zzwv.zz6n(); zzwvZz6n != null; zzwvZz6n = zzwvZz6n.zz6n()) {
            i++;
        }
        return i;
    }

    private static zzWV zzS(zzZ70 zzz70) {
        zzWV zzwvZz6o = (zzWV) ((zzWT) zzz70.zzYgm).zza9();
        while (zzwvZz6o.zz6o() != null) {
            zzwvZz6o = zzwvZz6o.zz6o();
        }
        return zzwvZz6o;
    }

    private void zzT(zzZ70 zzz70) throws Exception {
        zzZ zzz = new zzZ((byte) 0);
        this.zzYaK = zzz;
        zzZ3T zzz3t = this.zzZFQ;
        zzz.zzYaG = new zzZ3N(zzz3t, 0, 0, zzZ3J.zzZ(zzz70, zzz3t));
        zzZ zzz2 = this.zzYaK;
        zzz2.zzYaF = true;
        zzz2.zzYaG.zzYWl();
    }

    private void zzU(zzZ70 zzz70) throws Exception {
        zzWV zzwv = (zzWV) ((zzWT) zzz70.zzYgm).zza9();
        if (zzX((zzYIC) zzwv.zza9())) {
            zzT(zzz70);
            return;
        }
        zzWV zzwvZzS = zzS(zzz70);
        int iHashCode = zzwvZzS.hashCode();
        if (this.zzYaN) {
            com.aspose.words.internal.zzD3<zzZ> zzd3 = this.zzYaL;
            zzZ zzz = zzd3 != null ? zzd3.get(iHashCode) : null;
            this.zzYaK = zzz;
            if (zzz != null) {
                this.zzYaM.set(iHashCode, zzz);
            }
        } else {
            this.zzYaK = this.zzYaM.get(iHashCode);
        }
        if (this.zzYaK != null) {
            return;
        }
        Cell cellZzZex = zzwv.zz69().zzY67().zzZex();
        boolean zZzZ = ((TableStyle) cellZzZex.getParentRow().getParentTable().getStyle()).zzZ(cellZzZex, new ConditionalStyle(1));
        boolean zZzZ2 = ((TableStyle) cellZzZex.getParentRow().getParentTable().getStyle()).zzZ(cellZzZex, new ConditionalStyle(2));
        zzZ zzz2 = new zzZ((byte) 0);
        this.zzYaK = zzz2;
        zzz2.zzYaI = new com.aspose.words.internal.zzB2(zZzZ, zZzZ2, zzwv.getColumnCount(), zzR(zzwvZzS));
        zzZ zzz3 = this.zzYaK;
        zzz3.zzYaH = iHashCode;
        zzz3.zzYaG = new zzZ3O(this.zzZFQ, zzz3.zzYaI);
        this.zzYaP.zzX(this.zzYaK.zzYaI);
        com.aspose.words.internal.zzD3<zzZ> zzd32 = this.zzYaM;
        zzZ zzz4 = this.zzYaK;
        zzd32.set(zzz4.zzYaH, zzz4);
    }

    private boolean zzX(zzYIC zzyic) {
        return zzyic.zzBz() && !this.zzYaQ;
    }

    private void zzYNh() {
        this.zzYaP = null;
        this.zzYaO = 0;
        this.zzYaL = this.zzYaM;
        this.zzYaM = new com.aspose.words.internal.zzD3<>();
    }

    public final void zzY(zzZ63 zzz63) {
        int i = this.zzYaJ;
        this.zzYaJ = i - 1;
        if (i > 1) {
            this.zzYaK.zzYaG.zzY(zzz63);
        }
    }

    public final boolean zzYNe() {
        zzZ zzz = this.zzYaK;
        return (zzz == null || zzz.zzYaG == null) ? false : true;
    }

    public final zzZAH zzYNf() {
        return this.zzYaK.zzYaG;
    }

    public final boolean zzYNg() {
        return this.zzYaJ > 0;
    }

    public final void zzZ(zzZ63 zzz63) {
        int i = this.zzYaJ;
        this.zzYaJ = i + 1;
        if (i > 0) {
            this.zzYaK.zzYaG.zzZ(zzz63);
            return;
        }
        if (this.zzYaS != null && this.zzYaR == zzz63.zzYRu()) {
            this.zzYaQ = false;
            return;
        }
        zzGW();
        com.aspose.words.internal.zzB3 zzb3 = new com.aspose.words.internal.zzB3(zzz63.zzBC());
        this.zzYaS = zzb3;
        this.zzYb8.zzX(zzb3);
        this.zzYaR = zzz63.zzYRu();
        this.zzYaQ = true;
    }

    public final void zzY(zzZ70 zzz70) {
        if (this.zzYaJ > 1) {
            this.zzYaK.zzYaG.zzY(zzz70);
            return;
        }
        zzZ zzz = this.zzYaK;
        if (zzz.zzYaF) {
            zzz.zzYaG.zzYWk();
        }
        this.zzYaK = null;
    }

    public final void zzZ(zzZ6M zzz6m) {
        if (this.zzYaJ > 1) {
            this.zzYaK.zzYaG.zzZ(zzz6m);
            return;
        }
        if (zzX((zzYIC) ((zzYIA) zzz6m.zzYgm).zza9())) {
            return;
        }
        if (this.zzYaP != null && this.zzYaO == zzz6m.zzYSa()) {
            this.zzYaN = false;
            return;
        }
        zzYNh();
        com.aspose.words.internal.zzB1 zzb1 = new com.aspose.words.internal.zzB1();
        this.zzYaP = zzb1;
        this.zzYaS.zzX(zzb1);
        this.zzYaO = zzz6m.zzYSa();
        this.zzYaN = true;
    }

    public final void zzZ(zzZ70 zzz70) throws Exception {
        if (this.zzYaJ > 1) {
            this.zzYaK.zzYaG.zzZ(zzz70);
        } else {
            zzU(zzz70);
        }
    }
}
