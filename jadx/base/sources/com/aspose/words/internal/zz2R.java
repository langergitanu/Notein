package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz2R extends zz70 {
    private boolean zzgK;
    private boolean zzgL;
    private boolean zzgM;
    private boolean zzgN;
    private int zzgO;
    private boolean zzgS;
    private boolean zzgT;
    private int zzgV;
    private boolean zzgW;
    private int zzgX;
    private boolean zzgY;
    private boolean zzh0;
    private boolean zzh1;
    private zz4H zzh3;
    private zz4Q zzh5;
    private float zzjq;
    private zzA6 zzl6;
    private boolean zzrk;
    private zzH3 zzwm;
    private zz51 zzh4 = new zz51();
    private int zzh2 = 3;
    private int zzC = 0;
    private int zzB = 100;
    private int zzgZ = 0;
    private zz6U zzgU = new zz6U();
    private zzQL zzgR = new zzQL();
    private int zzgQ = 1;
    private int zzgP = 0;
    private boolean zzgJ = true;

    public zz2R(zzH6 zzh6) {
        this.zzwm = zzh6.zzFG();
        this.zzl6 = new zzA6(zzh6);
    }

    private void zzXN(String str) {
        zzI().zzZ(2, 5, str);
    }

    public final boolean getAdditionalTextPositioning() {
        return this.zzgL;
    }

    public final boolean getCacheBackgroundGraphics() {
        return this.zzgJ;
    }

    public final int getCustomPropertiesExport() {
        return this.zzgX;
    }

    public final boolean getDisplayDocTitle() {
        return this.zzgM;
    }

    public final boolean getEmbedFullFonts() {
        return this.zzh0;
    }

    public final int getFontEmbeddingMode() {
        return this.zzgZ;
    }

    public final int getImageColorSpaceExportMode() {
        return this.zzgO;
    }

    public final int getImageCompression() {
        return this.zzC;
    }

    public final boolean getInterpolateImages() {
        return this.zzgK;
    }

    public final int getJpegQuality() {
        return this.zzB;
    }

    public final boolean getOpenHyperlinksInNewWindow() {
        return this.zzgT;
    }

    public final boolean getOptimizeOutput() {
        return this.zzrk;
    }

    public final int getPageLayout() {
        return this.zzgP;
    }

    public final int getPageMode() {
        return this.zzgQ;
    }

    public final boolean getPreblendImages() {
        return this.zzgN;
    }

    public final int getTextCompression() {
        return this.zzh2;
    }

    public final boolean getUseCoreFonts() {
        return this.zzgY;
    }

    public final boolean isEncrypted() {
        return this.zzh3 != null;
    }

    public final void setAdditionalTextPositioning(boolean z) {
        this.zzgL = z;
    }

    public final void setCacheBackgroundGraphics(boolean z) {
        this.zzgJ = z;
    }

    public final void setCustomPropertiesExport(int i) {
        this.zzgX = i;
    }

    public final void setDisplayDocTitle(boolean z) {
        this.zzgM = z;
    }

    public final void setEmbedFullFonts(boolean z) {
        this.zzh0 = z;
    }

    public final void setFontEmbeddingMode(int i) {
        this.zzgZ = i;
    }

    public final void setImageColorSpaceExportMode(int i) {
        this.zzgO = i;
    }

    public final void setImageCompression(int i) {
        this.zzC = i;
    }

    public final void setInterpolateImages(boolean z) {
        this.zzgK = z;
    }

    public final void setJpegQuality(int i) {
        if (i < 0 || i > 100) {
            throw new IllegalArgumentException("value");
        }
        this.zzB = i;
    }

    public final void setOpenHyperlinksInNewWindow(boolean z) {
        this.zzgT = z;
    }

    public final void setOptimizeOutput(boolean z) {
        this.zzrk = z;
    }

    public final void setPageLayout(int i) {
        this.zzgP = i;
    }

    public final void setPageMode(int i) {
        this.zzgQ = i;
    }

    public final void setPreblendImages(boolean z) {
        this.zzgN = z;
    }

    public final void setTextCompression(int i) {
        this.zzh2 = i;
    }

    public final void setUseCoreFonts(boolean z) {
        this.zzgY = z;
    }

    public final void zzTM(int i) {
        this.zzgV = i;
    }

    public final void zzY(zz51 zz51Var) {
        this.zzh4 = zz51Var;
    }

    public final void zzZ(zzQL zzql) {
        if (zzql == null) {
            zzql = new zzQL();
        }
        this.zzgR = zzql;
    }

    public final void zzZF(boolean z) {
        this.zzgS = z;
    }

    public final void zzZY(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzjq = f;
    }

    public final boolean zztA() {
        return this.zzgW;
    }

    public final zz4Q zztB() {
        return this.zzh5;
    }

    public final zz4H zztC() {
        return this.zzh3;
    }

    public final boolean zztD() {
        return this.zzh1;
    }

    public final zzQL zztE() {
        return this.zzgR;
    }

    public final void zztF() {
        if (this.zzh4.zzvz()) {
            if (this.zzh3 != null) {
                zzXN("Encryption is prohibited by PDF/A compliance. PDF document will not be encrypted.");
                this.zzh3 = null;
            }
            if (this.zzh2 == 2) {
                zzXN("LZW compression is prohibited by PDF/A compliance. Flate compression will be used instead.");
                this.zzh2 = 3;
            }
            int i = this.zzC;
            if (i == 4 || i == 5) {
                zzXN("LZW compression is prohibited by PDF/A compliance. Automatic image compression will be used instead.");
                this.zzC = 0;
            }
            if (this.zzgZ != 0) {
                zzXN("PDF/A compliance requires that all fonts including standard Windows fonts must be embedded. All fonts will be embedded into PDF document.");
                this.zzgZ = 0;
            }
            if (this.zzgY) {
                zzXN("PDF/A compliance requires that all fonts including standard Windows fonts must be embedded. Core fonts will not be used in PDF document.");
                this.zzgY = false;
            }
            if (this.zzgO != 0) {
                zzXN("CMYK images color space is not supported when saving to PDF/A. Auto color space export mode will be used instead.");
                this.zzgO = 0;
            }
            if (this.zzgK) {
                zzXN("Interpolation flag is prohibited by PDF/A compliance. It will not be used in PDF document.");
                this.zzgK = false;
            }
            if (this.zzgT && !this.zzh4.zzvv()) {
                zzXN("JavaScript actions are prohibited by PDF/A-1 and PDF/A-2 compliance. Hyperlinks will be exported without JavaScript.");
                this.zzgT = false;
            }
            if (this.zzgX == 2) {
                if (this.zzh4.zzvv()) {
                    zzXN("Custom properties are not supported when saving to PDF/A-4. Custom properties will not be exported.");
                    this.zzgX = 0;
                } else {
                    zzXN("Custom properties in metadata are not supported when saving to PDF/A. Standard custom properties export will be used instead.");
                    this.zzgX = 1;
                }
            }
        }
        if (this.zzh4.zzvy()) {
            zz4H zz4h = this.zzh3;
            if (zz4h != null && (zz4h.getPermissions() & 512) == 0) {
                zzXN("Copy content for accessibility encryption permission is required by PDF/UA compliance. It will be set in PDF document.");
                zz4H zz4h2 = this.zzh3;
                zz4h2.setPermissions(zz4h2.getPermissions() | 512);
            }
            if (this.zzgZ != 0) {
                zzXN("PDF/UA compliance requires that all fonts including standard Windows fonts must be embedded. All fonts will be embedded into PDF document.");
                this.zzgZ = 0;
            }
            if (this.zzgY) {
                zzXN("PDF/UA compliance requires that all fonts including standard Windows fonts must be embedded. Core fonts will not be used in PDF document.");
                this.zzgY = false;
            }
            if (!this.zzgM) {
                zzXN("DisplayDocTitle flag is required by PDF/UA. It will be set in PDF document.");
                this.zzgM = true;
            }
        }
        if (this.zzh4.zzvA()) {
            if (this.zzgX == 1) {
                zzXN("Custom properties in /Info dictionary are deprecated in PDF 2.0 format. Metadata custom properties export will be used instead.");
                this.zzgX = 2;
            }
            if (this.zzgY) {
                zzXN("Core fonts are not supported when saving to PDF 2.0. Core fonts will not be used in PDF document.");
                this.zzgY = false;
            }
        }
        zz4H zz4h3 = this.zzh3;
        if (zz4h3 != null) {
            if (!zzZYD.zzXk(zz4h3.getUserPassword()) && !zzZYD.zzXk(this.zzh3.getOwnerPassword())) {
                throw new IllegalArgumentException("You have requested PDF encryption, but not specified either a user password or an owner password.");
            }
            if (zzZKN.equals(this.zzh3.getUserPassword(), this.zzh3.getOwnerPassword())) {
                throw new IllegalArgumentException("The PDF user password and owner password cannot be the same. Please enter different passwords.");
            }
        }
    }

    public final zzH3 zztv() {
        return this.zzwm;
    }

    public final zz6U zztw() {
        return this.zzgU;
    }

    public final float zztx() {
        return this.zzjq;
    }

    public final int zzty() {
        return this.zzgV;
    }

    public final void zztz() {
        this.zzgW = true;
    }

    public final boolean zzv6() {
        return this.zzgS;
    }

    public final zz51 zzv7() {
        return this.zzh4;
    }

    public final zzA6 zzwy() {
        return this.zzl6;
    }

    public final void zzZ(zz4H zz4h) {
        this.zzh3 = zz4h;
    }

    public final void zzZ(zz4Q zz4q) {
        this.zzh5 = zz4q;
    }

    public final void zzZ(zzA6 zza6) {
        this.zzl6 = zza6;
    }

    public final void zzZ(zz6U zz6u) {
        if (zz6u == null) {
            zz6u = new zz6U();
        }
        this.zzgU = zz6u;
    }
}
