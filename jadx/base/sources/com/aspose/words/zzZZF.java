package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZF implements Cloneable {
    boolean zzYUN;
    int zzYUO;
    boolean zzYUP;
    boolean zzYUQ;
    boolean zzYUR;
    boolean zzYUS;
    boolean zzYUU;
    boolean zzYUV;
    boolean zzYUW;
    boolean zzYUX;
    int zzYUZ;
    String zzYV0;
    int zzYV1;
    boolean zzYV2;
    String zzYV3;
    boolean zzYV4;
    boolean zzYV5;
    boolean zzYV6;
    boolean zzYV7;
    boolean zzYV8;
    boolean zzYV9;
    boolean zzYVA;
    boolean zzYVB;
    boolean zzYVC;
    boolean zzYVD;
    boolean zzYVE;
    boolean zzYVG;
    String zzYVH;
    String zzYVI;
    String zzYVJ;
    int zzYVK;
    boolean zzYVL;
    boolean zzYVN;
    boolean zzYVO;
    int zzYVW;
    boolean zzYVX;
    boolean zzYVa;
    int zzYVi;
    int zzYVk;
    boolean zzYVl;
    boolean zzYVm;
    boolean zzYVn;
    String zzYVo;
    boolean zzYVp;
    boolean zzYVq;
    boolean zzYVr;
    boolean zzYVs;
    boolean zzYVt;
    boolean zzYVu;
    boolean zzYVv;
    boolean zzYVz;
    boolean zzYW0;
    boolean zzYW1;
    boolean zzYW2;
    boolean zzYWA;
    boolean zzYWB;
    boolean zzYWC;
    int zzYWD;
    boolean zzYWc;
    boolean zzYWg;
    boolean zzYWk;
    boolean zzYWl;
    boolean zzYWm;
    boolean zzYWr;
    boolean zzYWs;
    boolean zzYWt;
    boolean zzYWu;
    boolean zzYWv;
    boolean zzYWw;
    boolean zzYWx;
    boolean zzYWy;
    boolean zzYWz;
    zzY06 zzYWq = new zzY06();
    int zzYWp = 0;
    int zzYWo = 0;
    String zzYWn = "";
    zzY8L zzYWj = new zzY8L();
    int zzYWi = 2;
    int zzYWh = 0;
    boolean zzYWf = false;
    int zzYWe = 0;
    MailMergeSettings zzYWd = new MailMergeSettings();
    boolean zzYWb = true;
    boolean zzYWa = true;
    boolean zzYW9 = true;
    boolean zzYW8 = true;
    boolean zzYW7 = true;
    zzZYR zzYW6 = new zzZYR();
    WriteProtection zzYW5 = new WriteProtection();
    int zzYW4 = 720;
    HyphenationOptions zzYW3 = new HyphenationOptions();
    int zzYVZ = 0;
    int zzYVY = StyleIdentifier.NIL;
    int zzYVV = 180;
    int zzYVU = 180;
    int zzYVT = 1;
    int zzYVS = 1;
    boolean zzYVR = true;
    int zzYVQ = 1800;
    int zzYVP = 1440;
    int zzYVM = 0;
    int zzYVF = 0;
    int zzYVy = 96;
    int zzYVx = 3;
    boolean zzYVw = true;
    zzYI4 zzYVj = new zzYI4();
    zzYCZ zzYVh = new zzYCZ();
    CompatibilityOptions zzYVg = new CompatibilityOptions();
    ViewOptions zzYVf = new ViewOptions();
    zzY5H zzYVe = new zzY5H();
    zzYZU zzYVd = new zzYZU();
    zzXYT zzYVc = new zzXYT();
    zzXYR zzYVb = new zzXYR();
    int zzYUY = 9;
    boolean zzYUT = true;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zzWD(boolean z) {
        this.zzYWb = z;
        this.zzYWa = z;
        this.zzYW9 = z;
        this.zzYW8 = z;
        this.zzYW7 = z;
    }

    public final void zzZ(FontInfoCollection fontInfoCollection) {
        this.zzYWy = fontInfoCollection.getEmbedTrueTypeFonts();
        this.zzYWx = fontInfoCollection.getEmbedSystemFonts();
        this.zzYWw = fontInfoCollection.getSaveSubsetFonts();
    }

    public final boolean zzZrN() {
        return this.zzYWb || this.zzYWa || this.zzYW9 || this.zzYW8 || this.zzYW7;
    }

    public final boolean zzZrO() {
        int i = this.zzYWh;
        return i == 3 || i == 4;
    }

    public final zzZZF zzZrP() {
        zzZZF zzzzf = (zzZZF) memberwiseClone();
        zzzzf.zzYWq = this.zzYWq.zzXRR();
        zzzzf.zzYWd = this.zzYWd.deepClone();
        zzzzf.zzYW6 = this.zzYW6.zzZog();
        zzzzf.zzYW5 = this.zzYW5.zzXRT();
        zzzzf.zzYVh = (zzYCZ) this.zzYVh.zzbn();
        zzzzf.zzYVg = this.zzYVg.zzZYU();
        zzzzf.zzYVf = this.zzYVf.zzXTL();
        zzzzf.zzYW3 = this.zzYW3.zzYX6();
        zzzzf.zzYWj = new zzY8L(this.zzYWj.zzY2B());
        zzzzf.zzYVe = this.zzYVe.zzXVw();
        zzzzf.zzYVd = this.zzYVd.zzYEC();
        zzzzf.zzYVc = this.zzYVc.zzXQA();
        zzzzf.zzYVb = this.zzYVb.zzXQz();
        return zzzzf;
    }
}
