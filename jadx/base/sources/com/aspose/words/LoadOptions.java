package com.aspose.words;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
public class LoadOptions {
    private String zz93;
    private com.aspose.words.internal.zzZO0 zzMW;
    private FontSettings zzYSG;
    private IResourceLoadingCallback zzYSe;
    private zzY3G zzYT0;
    private boolean zzYbn;
    private boolean zzYbo;
    private LanguagePreferences zzYbp;
    private boolean zzYbq;
    private boolean zzYbr;
    private boolean zzYbs;
    private int zzYbt;
    private boolean zzYbu;
    private boolean zzYbv;
    private IDocumentLoadingCallback zzYbw;
    private boolean zzYbx;
    private boolean zzYby;
    private int zzYzH;
    private int zzZFU;
    private IWarningCallback zzZG0;
    private String zzZp0;
    private String zzjf;

    public LoadOptions() {
        this.zzYzH = 0;
        this.zzYbu = true;
        this.zzYbt = 0;
        this.zzZFU = 7;
        this.zzYbp = new LanguagePreferences();
        this.zzYbo = false;
        this.zzYbn = true;
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() == LoadOptions.class) {
            LoadOptions loadOptions = (LoadOptions) obj;
            return this.zzYzH == loadOptions.zzYzH && com.aspose.words.internal.zzZKN.equals(this.zzjf, loadOptions.zzjf) && com.aspose.words.internal.zzZKN.equals(this.zzZp0, loadOptions.zzZp0) && this.zzMW == loadOptions.zzMW && this.zzYSe == loadOptions.zzYSe && this.zzZG0 == loadOptions.zzZG0 && this.zzYbv == loadOptions.zzYbv && this.zzYbu == loadOptions.zzYbu && this.zzYSG.equals(loadOptions.zzYSG) && this.zzYbt == loadOptions.zzYbt && this.zzYT0 == loadOptions.zzYT0 && this.zzYbs == loadOptions.zzYbs && this.zzYbq == loadOptions.zzYbq && this.zzZFU == loadOptions.zzZFU && this.zzYbo == loadOptions.zzYbo && getProgressCallback() == loadOptions.getProgressCallback() && this.zzYbx == loadOptions.zzYbx;
        }
        if (obj.getClass() == Document.class) {
            Document document = (Document) obj;
            zzY3G zzy3gZzZqr = document.zzZqr();
            this.zzYT0 = zzy3gZzZqr;
            if (zzy3gZzZqr != null) {
                this.zzYT0 = document.zzZqr();
            }
            if (this.zzYSe == document.getResourceLoadingCallback() && this.zzYT0 == document.zzZqr() && this.zzZG0 == document.getWarningCallback()) {
                return true;
            }
        }
        return false;
    }

    public String getBaseUri() {
        return this.zzZp0;
    }

    public boolean getConvertMetafilesToPng() {
        return this.zzYbo;
    }

    public boolean getConvertShapeToOfficeMath() {
        return this.zzYbq;
    }

    public Charset getEncoding() {
        return com.aspose.words.internal.zzZO0.zzX(this.zzMW);
    }

    public FontSettings getFontSettings() {
        return this.zzYSG;
    }

    public boolean getIgnoreOleData() {
        return this.zzYby;
    }

    public LanguagePreferences getLanguagePreferences() {
        return this.zzYbp;
    }

    public int getLoadFormat() {
        return this.zzYzH;
    }

    public int getMswVersion() {
        return this.zzZFU;
    }

    public String getPassword() {
        return this.zzjf;
    }

    public boolean getPreserveIncludePictureField() {
        return this.zzYbv;
    }

    public IDocumentLoadingCallback getProgressCallback() {
        return this.zzYbw;
    }

    public IResourceLoadingCallback getResourceLoadingCallback() {
        return this.zzYSe;
    }

    public String getTempFolder() {
        return this.zz93;
    }

    public boolean getUpdateDirtyFields() {
        return this.zzYbs;
    }

    public IWarningCallback getWarningCallback() {
        return this.zzZG0;
    }

    public void setBaseUri(String str) {
        this.zzZp0 = str;
    }

    public void setConvertMetafilesToPng(boolean z) {
        this.zzYbo = z;
    }

    public void setConvertShapeToOfficeMath(boolean z) {
        this.zzYbq = z;
    }

    public void setEncoding(Charset charset) {
        this.zzMW = com.aspose.words.internal.zzZO0.zzZ(charset);
    }

    public void setFontSettings(FontSettings fontSettings) {
        this.zzYSG = fontSettings;
    }

    public void setIgnoreOleData(boolean z) {
        this.zzYby = z;
    }

    public void setLoadFormat(int i) {
        this.zzYzH = i;
    }

    public void setMswVersion(int i) {
        this.zzZFU = i;
    }

    public void setPassword(String str) {
        this.zzjf = str;
    }

    public void setPreserveIncludePictureField(boolean z) {
        this.zzYbv = z;
    }

    public void setProgressCallback(IDocumentLoadingCallback iDocumentLoadingCallback) {
        this.zzYbw = iDocumentLoadingCallback;
    }

    public void setResourceLoadingCallback(IResourceLoadingCallback iResourceLoadingCallback) {
        this.zzYSe = iResourceLoadingCallback;
    }

    public void setTempFolder(String str) {
        this.zz93 = str;
    }

    public void setUpdateDirtyFields(boolean z) {
        this.zzYbs = z;
    }

    public void setWarningCallback(IWarningCallback iWarningCallback) {
        this.zzZG0 = iWarningCallback;
    }

    public LoadOptions zz1s() {
        return new LoadOptions(this);
    }

    public final void zzUF(boolean z) {
        this.zzYbx = true;
    }

    public final boolean zzYNC() {
        return this.zzYbx;
    }

    public final boolean zzYND() {
        return this.zzYbn;
    }

    public final boolean zzYNE() {
        return this.zzYbr;
    }

    public final void zzYNF() {
        this.zzYbt = 2;
    }

    public final int zzYNG() {
        return this.zzYbt;
    }

    public final void zzZ(zzY3G zzy3g) {
        this.zzYT0 = zzy3g;
    }

    public final com.aspose.words.internal.zzZO0 zzZ9Y() {
        return this.zzMW;
    }

    public final zzY3G zzZqr() {
        return this.zzYT0;
    }

    public final boolean zzZrB() {
        return this.zzYbt > 0;
    }

    public LoadOptions(String str) {
        this.zzYzH = 0;
        this.zzYbu = true;
        this.zzYbt = 0;
        this.zzZFU = 7;
        this.zzYbp = new LanguagePreferences();
        this.zzYbo = false;
        this.zzYbn = true;
        this.zzjf = str;
    }

    public LoadOptions(int i, String str, String str2) {
        this.zzYzH = 0;
        this.zzYbu = true;
        this.zzYbt = 0;
        this.zzZFU = 7;
        this.zzYbp = new LanguagePreferences();
        this.zzYbo = false;
        this.zzYbn = true;
        this.zzYzH = i;
        this.zzjf = str;
        this.zzZp0 = str2;
    }

    public LoadOptions(LoadOptions loadOptions) {
        this.zzYzH = 0;
        this.zzYbu = true;
        this.zzYbt = 0;
        this.zzZFU = 7;
        this.zzYbp = new LanguagePreferences();
        this.zzYbo = false;
        this.zzYbn = true;
        if (loadOptions != null) {
            this.zzYzH = loadOptions.zzYzH;
            this.zzjf = loadOptions.zzjf;
            this.zzZp0 = loadOptions.zzZp0;
            this.zzMW = loadOptions.zzMW;
            this.zzYSe = loadOptions.zzYSe;
            this.zzZG0 = loadOptions.zzZG0;
            this.zzYbv = loadOptions.zzYbv;
            this.zzYbu = loadOptions.zzYbu;
            this.zzYSG = loadOptions.zzYSG;
            this.zzYbt = loadOptions.zzYbt;
            this.zzYT0 = loadOptions.zzYT0;
            this.zzYbs = loadOptions.zzYbs;
            this.zzYbq = loadOptions.zzYbq;
            this.zzZFU = loadOptions.zzZFU;
            this.zzYbo = loadOptions.zzYbo;
            setProgressCallback(loadOptions.getProgressCallback());
            this.zzYbx = loadOptions.zzYbx;
        }
    }
}
