package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYAQ extends zzYA3 {
    private boolean zzXcH;
    private zzYCT zzXcI;
    private zzYAP zzXcJ;
    private boolean zzXcK;
    private int zzYQ8;

    public zzYAQ() {
        super(0);
    }

    public final String getInitials() {
        return this.zzXcJ.zzY5Y().getInitial();
    }

    public final void zzQx(boolean z) {
        this.zzXcH = z;
    }

    public final void zzQy(boolean z) {
        this.zzXcK = true;
    }

    @Override // com.aspose.words.zzYAU
    public final void zzX(zzYCT zzyct) {
        this.zzXcI = zzyct;
    }

    public final boolean zzY5Z() {
        return this.zzXcH;
    }

    public final boolean zzY60() {
        return this.zzXcK;
    }

    public final zzYAP zzY61() {
        return this.zzXcJ;
    }

    public final boolean zzY62() {
        return this == this.zzXcJ.zzY63();
    }

    public final zzYAQ zzY63() {
        return this.zzXcJ.zzY63();
    }

    public final zzYAQ zzY64() {
        return this.zzXcJ.zzY64();
    }

    public final zzYAQ zzY65() {
        return this.zzXcJ.zzY65();
    }

    @Override // com.aspose.words.zzYAU
    public final zzYAU zzY71() throws Exception {
        if (!this.zzXcK) {
            throw new IllegalStateException("Deep clone of SpanComment is not allowed.");
        }
        zzYAQ zzyaq = new zzYAQ();
        zzZB(zzyaq);
        zzYAP zzyap = new zzYAP();
        zzyaq.zzXcJ = zzyap;
        zzyap.zzZ(zzyaq, 1);
        zzyaq.zzXcK = this.zzXcK;
        zzyaq.zzYQ8 = this.zzYQ8;
        ((zzUI) zzY7l()).zzZ(zzyaq);
        return zzyaq;
    }

    @Override // com.aspose.words.zzYAU
    public final zzYCT zzY7l() {
        if (this.zzXcI == null && zza9() != null) {
            if (!zza9().zzaa().zzbD() && !zza9().zzaa().zzZ4E() && zza9().zzaa().getStoryType() != 5 && zza9().zzaa().getStoryType() != 3) {
                zza9().zzaa();
            }
            this.zzXcI = this.zzXcJ.zzY63().zzY6L().zza9().zzYTk();
        }
        return this.zzXcI;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzY7n() {
        return 4;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzYol() {
        return true;
    }

    public final void zzZ(zzYAP zzyap) {
        this.zzXcJ = zzyap;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzZ1s() {
        return this.zzXcJ.zzW(this);
    }

    public final int zzZZG() {
        return this.zzYQ8;
    }

    public final void zzlO(int i) {
        this.zzYQ8 = i;
    }
}
