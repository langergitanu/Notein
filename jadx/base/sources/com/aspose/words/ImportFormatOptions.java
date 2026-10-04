package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ImportFormatOptions {
    private boolean zzYiG;
    private boolean zzYiH;
    private boolean zzYiI;
    private boolean zzYiJ;
    private boolean zzYiK;
    private boolean zzYiL;
    private boolean zzYiM;
    private boolean zzYiN;
    private boolean zzYiF = true;
    private boolean zzYiE = true;

    public boolean getAdjustSentenceAndWordSpacing() {
        return this.zzYiJ;
    }

    public boolean getForceCopyStyles() {
        return this.zzYiK;
    }

    public boolean getIgnoreHeaderFooter() {
        return this.zzYiE;
    }

    public boolean getIgnoreTextBoxes() {
        return this.zzYiF;
    }

    public boolean getKeepSourceNumbering() {
        return this.zzYiM;
    }

    public boolean getMergePastedLists() {
        return this.zzYiL;
    }

    public boolean getSmartStyleBehavior() {
        return this.zzYiN;
    }

    public void setAdjustSentenceAndWordSpacing(boolean z) {
        this.zzYiJ = z;
    }

    public void setForceCopyStyles(boolean z) {
        this.zzYiK = z;
    }

    public void setIgnoreHeaderFooter(boolean z) {
        this.zzYiE = z;
    }

    public void setIgnoreTextBoxes(boolean z) {
        this.zzYiF = z;
    }

    public void setKeepSourceNumbering(boolean z) {
        this.zzYiM = z;
    }

    public void setMergePastedLists(boolean z) {
        this.zzYiL = z;
    }

    public void setSmartStyleBehavior(boolean z) {
        this.zzYiN = z;
    }

    public final void zzV7(boolean z) {
        this.zzYiG = z;
    }

    public final boolean zzYVp() {
        return this.zzYiG;
    }

    public final void zzYVq() {
        this.zzYiH = true;
    }

    public final boolean zzYVr() {
        return this.zzYiH;
    }

    public final void zzYVs() {
        this.zzYiI = true;
    }

    public final boolean zzYVt() {
        return this.zzYiI;
    }
}
