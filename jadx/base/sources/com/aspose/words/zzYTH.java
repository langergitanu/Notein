package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYTH {
    private zzYTJ zzXRC;
    private zzYTJ zzXRD;
    private zzYTJ zzXRE;
    private zzYTJ zzXRF;

    private boolean zzYy0() {
        return com.aspose.words.internal.zzPV.zzZ(this.zzXRF.zzZy(), this.zzXRE.zzZy()) && com.aspose.words.internal.zzPV.zzZ(this.zzXRF.zzZy(), this.zzXRC.zzZy()) && com.aspose.words.internal.zzPV.zzZ(this.zzXRF.zzZy(), this.zzXRD.zzZy());
    }

    private boolean zzYy1() {
        return this.zzXRF.getLineStyle() == this.zzXRE.getLineStyle() && this.zzXRF.getLineStyle() == this.zzXRC.getLineStyle() && this.zzXRF.getLineStyle() == this.zzXRD.getLineStyle();
    }

    private boolean zzYy2() {
        return this.zzXRF.zzYyc() == this.zzXRE.zzYyc() && this.zzXRF.zzYyc() == this.zzXRC.zzYyc() && this.zzXRF.zzYyc() == this.zzXRD.zzYyc();
    }

    private boolean zzYy3() {
        return (this.zzXRF == null || this.zzXRE == null || this.zzXRC == null || this.zzXRD == null) ? false : true;
    }

    public final void zzV(zzYTJ zzytj) {
        this.zzXRC = zzytj;
    }

    public final void zzW(zzYTJ zzytj) {
        this.zzXRD = zzytj;
    }

    public final void zzX(zzYTJ zzytj) {
        this.zzXRE = zzytj;
    }

    public final void zzY(zzYTJ zzytj) {
        this.zzXRF = zzytj;
    }

    public final boolean zzYy4() {
        return zzYy3() && this.zzXRF.getLineStyle() != 0 && !com.aspose.words.internal.zzPV.zzZ(this.zzXRF.zzZy(), com.aspose.words.internal.zzPV.zzHZ) && !com.aspose.words.internal.zzPV.zzZ(this.zzXRF.zzZy(), com.aspose.words.internal.zzPV.zzI0) && zzYy2() && zzYy1() && zzYy0();
    }

    public final zzYTJ zzYy5() {
        return this.zzXRC;
    }

    public final zzYTJ zzYy6() {
        return this.zzXRD;
    }

    public final zzYTJ zzYy7() {
        return this.zzXRE;
    }

    public final zzYTJ zzYy8() {
        return this.zzXRF;
    }
}
