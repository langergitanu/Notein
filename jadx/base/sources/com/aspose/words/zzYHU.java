package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYHU extends zzYHQ {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\red", "\\green", "\\blue", "\\ctint", "\\cshade");
    private int zzXJi;
    private int zzXJj;
    private int zzXJk;
    private int zzXwe;
    private int zzXwf;
    private int zzXwg;
    private boolean zzXwh;
    private boolean zzXwi;

    public zzYHU(zzYFT zzyft) {
        super(zzyft);
    }

    private static int zzS(zzYET zzyet) {
        String strZzYR = zzyet.zzYR();
        int i = 0;
        for (int i2 = 0; i2 < strZzYR.length(); i2++) {
            if (strZzYR.charAt(i2) == ';') {
                i++;
            }
        }
        return i;
    }

    private void zzYiW() {
        this.zzXwi = true;
        this.zzXwh = false;
        this.zzXwf = 0;
        this.zzXwe = 0;
        this.zzXJk = 0;
        this.zzXJj = 0;
        this.zzXJi = 0;
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 0) {
            this.zzXJk = zzyet.zzYeT();
        } else if (iZzTP == 1) {
            this.zzXJj = zzyet.zzYeT();
        } else if (iZzTP == 2) {
            this.zzXJi = zzyet.zzYeT();
        } else if (iZzTP == 3) {
            this.zzXwf = zzyet.zzYeT();
        } else if (iZzTP != 4) {
            int iZzBJ = zzYEW.zzBJ(zzyet.getName());
            if (iZzBJ != Integer.MIN_VALUE) {
                this.zzXwg = iZzBJ;
                this.zzXwh = true;
            } else {
                zzO(zzyet);
            }
        } else {
            this.zzXwe = zzyet.zzYeT();
        }
        this.zzXwi = false;
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) {
        int iZzS = zzS(zzyet);
        if (iZzS > 0) {
            this.zzXw4.zzYgw().zzZ(this.zzXwi ? com.aspose.words.internal.zzPV.zzHZ : new com.aspose.words.internal.zzPV(this.zzXJk, this.zzXJj, this.zzXJi), this.zzXwh ? new zzY5M(this.zzXwg, this.zzXwf, this.zzXwe) : null);
            for (int i = 1; i < iZzS; i++) {
                this.zzXw4.zzYgw().zzZL(com.aspose.words.internal.zzPV.zzHZ);
            }
            zzYiW();
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final boolean zzYiX() {
        return true;
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) {
        this.zzXwi = true;
        this.zzXwh = false;
    }
}
