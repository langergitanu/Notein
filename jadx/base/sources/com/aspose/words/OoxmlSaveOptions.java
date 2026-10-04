package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class OoxmlSaveOptions extends SaveOptions {
    private boolean zzXIA;
    private boolean zzXIB;
    private boolean zzXIC;
    private int zzXID;
    private boolean zzXIE;
    private int zzXIu;
    private boolean zzXIv;
    private boolean zzXIw;
    private boolean zzXIx;
    private boolean zzXIy;
    private boolean zzXIz;
    private int zzZCv;
    private String zzjf;
    private int zzn1;

    public OoxmlSaveOptions() {
        this(20);
    }

    private void zzGe(int i) {
        switch (i) {
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                this.zzZCv = i;
                return;
            default:
                throw new IllegalArgumentException("An invalid SaveFormat for this options type was chosen.");
        }
    }

    private void zzqT(int i) {
        this.zzXIu = i;
        this.zzXIw = true;
    }

    public int getCompliance() {
        int i = this.zzXIu;
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        throw new IllegalStateException("Unknown OOXML version value.");
    }

    public int getCompressionLevel() {
        return this.zzn1;
    }

    public boolean getKeepLegacyControlChars() {
        return this.zzXIE;
    }

    public String getPassword() {
        return this.zzjf;
    }

    @Override // com.aspose.words.SaveOptions
    public int getSaveFormat() {
        return this.zzZCv;
    }

    public int getZip64Mode() {
        return this.zzXID;
    }

    public void setCompliance(int i) {
        if (i == 0) {
            zzqT(0);
        } else if (i == 1) {
            zzqT(1);
        } else {
            if (i != 2) {
                throw new IllegalStateException("Unknown OOXML version value.");
            }
            zzqT(2);
        }
    }

    public void setCompressionLevel(int i) {
        this.zzn1 = i;
    }

    public void setKeepLegacyControlChars(boolean z) {
        this.zzXIE = z;
    }

    public void setPassword(String str) {
        this.zzjf = str;
    }

    @Override // com.aspose.words.SaveOptions
    public void setSaveFormat(int i) {
        zzGe(i);
    }

    public void setZip64Mode(int i) {
        this.zzXID = i;
    }

    public final void zzRO(boolean z) {
        this.zzXIv = false;
    }

    @Override // com.aspose.words.SaveOptions
    public final void zzYZd() {
        super.zzYZd();
        this.zzXIB = false;
        this.zzXIA = false;
        this.zzXIz = false;
        this.zzXIy = false;
        this.zzXIx = false;
    }

    public final boolean zzYqV() {
        return this.zzXIv;
    }

    public final boolean zzYqW() {
        return this.zzXIw;
    }

    public final boolean zzYqX() {
        return this.zzXIx;
    }

    public final boolean zzYqY() {
        return this.zzXIy;
    }

    public final boolean zzYqZ() {
        return this.zzXIz;
    }

    public final boolean zzYr0() {
        return this.zzXIA;
    }

    public final boolean zzYr1() {
        return this.zzXIB;
    }

    public final boolean zzYr2() {
        return this.zzXIC;
    }

    public final int zzYr3() {
        return this.zzXIu;
    }

    public OoxmlSaveOptions(int i) {
        this.zzXIu = 0;
        this.zzXIB = true;
        this.zzXIA = true;
        this.zzXIz = true;
        this.zzXIy = true;
        this.zzXIx = true;
        this.zzXIv = true;
        setCompressionLevel(0);
        setZip64Mode(0);
        zzGe(i);
    }
}
