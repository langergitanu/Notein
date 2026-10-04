package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYV5 {
    private zzZ9W zzXTB;
    private zzZMS zzXTC;
    private zzZMS zzXTD;
    private zzZMS zzXTE;
    private int zzXTF;
    private int zzXTG;
    private int zzXTH;
    private int zzXTI;
    private boolean zzYWL;
    private int zzYwF;

    public zzYV5(int i, boolean z, zzZ9W zzz9w) {
        this.zzYwF = i;
        this.zzYWL = z;
        this.zzXTB = zzz9w;
    }

    private boolean zzJ(zzZS zzzs) {
        if (this.zzXTE == null && this.zzXTD == null && this.zzXTC == null) {
            return ((zzzs.zzPg(this.zzXTI) || !com.aspose.words.internal.zzZYD.zzXk(zzK(zzzs))) && zzzs.zzPg(this.zzXTH) && zzzs.zzPg(this.zzXTG) && zzzs.zzPg(this.zzXTF)) ? false : true;
        }
        return true;
    }

    private String zzK(zzZS zzzs) {
        return zzYyL() ? zzYUL.zzZz(((Integer) zzzs.zzPk(this.zzXTI)).intValue(), this.zzXTB.zzZmh()) : zzYUL.zzZA(((Integer) zzzs.zzPk(this.zzXTI)).intValue(), this.zzXTB.zzZmh());
    }

    private void zzL(zzZS zzzs) throws Exception {
        zzYU6 zzyu6ZzZm2 = this.zzXTB.zzZm2();
        zzyu6ZzZm2.zzY(zzYyL() ? "w:endnotePr" : "w:footnotePr");
        if (!zzzs.zzPg(this.zzXTI)) {
            zzyu6ZzZm2.zzYz("w:pos", zzK(zzzs));
        }
        if (!zzzs.zzPg(this.zzXTH)) {
            zzyu6ZzZm2.zzYz("w:numFmt", zzEH(((Integer) zzzs.zzPk(this.zzXTH)).intValue()));
        }
        if (!zzzs.zzPg(this.zzXTG)) {
            zzyu6ZzZm2.zzQ("w:numStart", (Integer) zzzs.zzPk(this.zzXTG));
        }
        if (!zzzs.zzPg(this.zzXTF)) {
            zzyu6ZzZm2.zzYz("w:numRestart", zzYUL.zzZD(((Integer) zzzs.zzPk(this.zzXTF)).intValue(), this.zzXTB.zzZmh()));
        }
        zzZ(this.zzXTE);
        zzZ(this.zzXTD);
        zzZ(this.zzXTC);
        zzyu6ZzZm2.zzp();
    }

    private void zzSy(boolean z) {
        this.zzXTE = null;
        this.zzXTD = null;
        this.zzXTC = null;
        if (z && this.zzYWL) {
            zzZMR zzzmrZzZpU = this.zzXTB.getDocument().zzZpU();
            this.zzXTE = zzzmrZzZpU.zzB1(zzYyL() ? 3 : 0);
            this.zzXTD = zzzmrZzZpU.zzB1(zzYyL() ? 4 : 1);
            this.zzXTC = zzzmrZzZpU.zzB1(zzYyL() ? 5 : 2);
        }
    }

    private void zzYyM() {
        int i = zzYyL() ? 100 : 0;
        this.zzXTI = i + 2500;
        this.zzXTH = i + 2530;
        this.zzXTG = i + 2520;
        this.zzXTF = i + 2510;
    }

    public abstract String zzEH(int i);

    public final void zzY(zzZS zzzs, boolean z) throws Exception {
        zzYyM();
        zzSy(z);
        if (zzJ(zzzs)) {
            zzL(zzzs);
        }
    }

    public final boolean zzYyL() {
        return this.zzYwF == 1;
    }

    public abstract void zzZ(zzZMS zzzms) throws Exception;

    public final boolean zzZrS() {
        return this.zzYWL;
    }
}
