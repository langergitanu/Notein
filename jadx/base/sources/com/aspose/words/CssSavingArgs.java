package com.aspose.words;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class CssSavingArgs {
    private Document zzZEY;
    private boolean zzZoL = true;
    private boolean zzZoM;
    private OutputStream zzZoN;

    public CssSavingArgs(Document document) {
        this.zzZEY = document;
    }

    public OutputStream getCssStream() {
        return this.zzZoN;
    }

    public Document getDocument() {
        return this.zzZEY;
    }

    public boolean getKeepCssStreamOpen() {
        return this.zzZoM;
    }

    public boolean isExportNeeded() {
        return this.zzZoL;
    }

    public void setCssStream(OutputStream outputStream) {
        this.zzZoN = outputStream;
    }

    public void setKeepCssStreamOpen(boolean z) {
        this.zzZoM = z;
    }

    public final zzY3P zzZVm() {
        return new zzY3P(this.zzZoN, this.zzZoM);
    }

    public final boolean zzro() {
        return this.zzZoN != null;
    }

    public void isExportNeeded(boolean z) {
        this.zzZoL = z;
    }
}
