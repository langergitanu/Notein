package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class MetafileRenderingOptions {
    private boolean zzXZO;
    private int zzri = 0;
    private int zzrh = 0;
    private boolean zzrg = true;
    private boolean zzrf = true;
    private boolean zzre = true;
    private int zzrd = 96;

    public int getEmfPlusDualRenderingMode() {
        return this.zzri;
    }

    public boolean getEmulateRasterOperations() {
        return this.zzrf;
    }

    public boolean getEmulateRenderingToSizeOnPage() {
        return this.zzre;
    }

    public int getEmulateRenderingToSizeOnPageResolution() {
        return this.zzrd;
    }

    public int getRenderingMode() {
        return this.zzrh;
    }

    public boolean getUseEmfEmbeddedToWmf() {
        return this.zzrg;
    }

    public boolean getUseGdiRasterOperationsEmulation() {
        return this.zzXZO;
    }

    public void setEmfPlusDualRenderingMode(int i) {
        this.zzri = i;
    }

    public void setEmulateRasterOperations(boolean z) {
        this.zzrf = z;
    }

    public void setEmulateRenderingToSizeOnPage(boolean z) {
        this.zzre = z;
    }

    public void setEmulateRenderingToSizeOnPageResolution(int i) {
        this.zzrd = i;
    }

    public void setRenderingMode(int i) {
        this.zzrh = i;
    }

    public void setUseEmfEmbeddedToWmf(boolean z) {
        this.zzrg = z;
    }

    public void setUseGdiRasterOperationsEmulation(boolean z) {
        this.zzXZO = z;
    }

    public final com.aspose.words.internal.zzA6 zzW(Document document, boolean z) {
        return zzZ(document.zzZqx(), z);
    }

    public final com.aspose.words.internal.zzA6 zzZ(com.aspose.words.internal.zzH6 zzh6, boolean z) {
        com.aspose.words.internal.zzA6 zza6 = new com.aspose.words.internal.zzA6(zzh6);
        zza6.setRenderingMode(zzZUA.zzEs(getRenderingMode()));
        zza6.setEmfPlusDualRenderingMode(zzZUA.zzEr(getEmfPlusDualRenderingMode()));
        zza6.setUseEmfEmbeddedToWmf(getUseEmfEmbeddedToWmf());
        zza6.setEmulateRasterOperations(getEmulateRasterOperations());
        zza6.zzZS(getUseGdiRasterOperationsEmulation());
        zza6.setOptimizeOutput(z);
        zza6.setEmulateRenderingToSizeOnPage(getEmulateRenderingToSizeOnPage());
        zza6.setEmulateRenderingToSizeOnPageResolution(getEmulateRenderingToSizeOnPageResolution());
        return zza6;
    }
}
