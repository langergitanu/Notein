package com.aspose.words;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class FontSavingArgs {
    private String zzAp;
    private boolean zzYwR;
    private String zzYwS;
    private boolean zzYwT;
    private int zzYwU;
    private boolean zzYwV;
    private OutputStream zzYwW;
    private Document zzZEY;
    private boolean zzZoL = true;
    private String zzZwV;
    private boolean zzpG;

    public FontSavingArgs(Document document, String str, boolean z, boolean z2, String str2, int i, boolean z3, String str3) {
        this.zzZEY = document;
        this.zzAp = str;
        this.zzYwV = z;
        this.zzpG = z2;
        this.zzZwV = str2;
        this.zzYwU = i;
        this.zzYwT = z3;
        this.zzYwS = str3;
    }

    public boolean getBold() {
        return this.zzYwV;
    }

    public Document getDocument() {
        return this.zzZEY;
    }

    public String getFontFamilyName() {
        return this.zzAp;
    }

    public String getFontFileName() {
        return this.zzYwS;
    }

    public OutputStream getFontStream() {
        return this.zzYwW;
    }

    public boolean getItalic() {
        return this.zzpG;
    }

    public boolean getKeepFontStreamOpen() {
        return this.zzYwR;
    }

    public String getOriginalFileName() {
        return this.zzZwV;
    }

    public int getOriginalFileSize() {
        return this.zzYwU;
    }

    public boolean isExportNeeded() {
        return this.zzZoL;
    }

    public boolean isSubsettingNeeded() {
        return this.zzYwT;
    }

    public void setFontFileName(String str) throws Exception {
        com.aspose.words.internal.zzZ4.zzU(str, "FontFileName");
        if (!com.aspose.words.internal.zzZKN.equals(com.aspose.words.internal.zzZOQ.zzVh(str), str)) {
            throw new IllegalArgumentException("FontFileName must be a file name without path.");
        }
        this.zzYwS = str;
    }

    public void setFontStream(OutputStream outputStream) {
        this.zzYwW = outputStream;
    }

    public void setKeepFontStreamOpen(boolean z) {
        this.zzYwR = z;
    }

    public final zzY3P zzZVm() {
        return new zzY3P(this.zzYwW, this.zzYwR);
    }

    public final boolean zzro() {
        return this.zzYwW != null;
    }

    public void isExportNeeded(boolean z) {
        this.zzZoL = z;
    }

    public void isSubsettingNeeded(boolean z) {
        this.zzYwT = z;
    }
}
