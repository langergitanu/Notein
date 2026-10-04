package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzA6 implements Cloneable {
    private zzH6 zzrj;
    private boolean zzrk;
    private boolean zzrl;
    private int zzri = 0;
    private int zzrh = 0;
    private boolean zzrg = true;
    private boolean zzrf = true;
    private boolean zzre = true;
    private int zzrd = 96;

    public zzA6(zzH6 zzh6) {
        this.zzrj = zzh6;
    }

    public final boolean getEmulateRasterOperations() {
        return this.zzrf;
    }

    public final boolean getEmulateRenderingToSizeOnPage() {
        return this.zzre;
    }

    public final int getEmulateRenderingToSizeOnPageResolution() {
        return this.zzrd;
    }

    public final boolean getOptimizeOutput() {
        return this.zzrk;
    }

    public final boolean getUseEmfEmbeddedToWmf() {
        return this.zzrg;
    }

    public final void setEmfPlusDualRenderingMode(int i) {
        this.zzri = i;
    }

    public final void setEmulateRasterOperations(boolean z) {
        this.zzrf = z;
    }

    public final void setEmulateRenderingToSizeOnPage(boolean z) {
        this.zzre = z;
    }

    public final void setEmulateRenderingToSizeOnPageResolution(int i) {
        this.zzrd = i;
    }

    public final void setOptimizeOutput(boolean z) {
        this.zzrk = z;
    }

    public final void setRenderingMode(int i) {
        this.zzrh = i;
    }

    public final void setUseEmfEmbeddedToWmf(boolean z) {
        this.zzrg = z;
    }

    public final boolean zzAp() {
        return this.zzri == 0;
    }

    public final boolean zzAq() {
        int i = this.zzri;
        return i == 0 || i == 1;
    }

    public final boolean zzAr() {
        return this.zzrh == 0;
    }

    public final boolean zzAs() {
        int i = this.zzrh;
        return i == 0 || i == 1;
    }

    public final zzH6 zzAt() {
        return this.zzrj;
    }

    public final boolean zzAu() {
        return this.zzrl;
    }

    public final zzGQ zzMk() {
        return this.zzrj.zzFG();
    }

    public final void zzZS(boolean z) {
        this.zzrl = z;
    }
}
