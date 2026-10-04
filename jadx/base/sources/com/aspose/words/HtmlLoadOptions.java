package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class HtmlLoadOptions extends LoadOptions {
    private boolean zzYo8;
    private boolean zzYo9;
    private int zzYoa;
    private int zzYob;
    private boolean zzYoc;
    private boolean zzYod;
    private int zzYoe;
    private boolean zzZr1;

    public HtmlLoadOptions() {
        this.zzYob = 100000;
    }

    public int getBlockImportMode() {
        return this.zzYoe;
    }

    public boolean getConvertSvgToEmf() {
        return this.zzYo8;
    }

    public boolean getIgnoreNoscriptElements() {
        return this.zzYo9;
    }

    public int getPreferredControlType() {
        return this.zzYoa;
    }

    public boolean getSupportVml() {
        return this.zzYoc;
    }

    public int getWebRequestTimeout() {
        return this.zzYob;
    }

    public void setBlockImportMode(int i) {
        this.zzYoe = i;
    }

    public void setConvertSvgToEmf(boolean z) {
        this.zzYo8 = z;
    }

    public void setIgnoreNoscriptElements(boolean z) {
        this.zzYo9 = z;
    }

    public void setPreferredControlType(int i) {
        this.zzYoa = i;
    }

    public void setSupportVml(boolean z) {
        this.zzYoc = z;
    }

    public void setWebRequestTimeout(int i) {
        this.zzYob = i;
    }

    public final zzZFH zz1r() {
        zzZFH zzzfh = new zzZFH();
        zzzfh.zzYmK = this.zzZr1;
        zzzfh.zzYmG = getConvertSvgToEmf();
        zzzfh.zzYmH = getIgnoreNoscriptElements();
        zzzfh.zzYmI = getMswVersion();
        zzzfh.zzYmJ = getPreferredControlType();
        zzzfh.zzYmL = getSupportVml();
        boolean z = true;
        if (getBlockImportMode() != 1 && !this.zzZr1) {
            z = false;
        }
        zzzfh.zzYmD = z;
        return zzzfh;
    }

    @Override // com.aspose.words.LoadOptions
    public final LoadOptions zz1s() {
        return new HtmlLoadOptions(this);
    }

    public final boolean zzZ0A() {
        return this.zzYod;
    }

    public final void zzZ0B() {
        this.zzZr1 = true;
    }

    public HtmlLoadOptions(String str) {
        super(str);
        this.zzYob = 100000;
    }

    public HtmlLoadOptions(int i, String str, String str2) {
        super(i, str, str2);
        this.zzYob = 100000;
    }

    private HtmlLoadOptions(HtmlLoadOptions htmlLoadOptions) {
        super(htmlLoadOptions);
        this.zzYob = 100000;
        this.zzZr1 = htmlLoadOptions.zzZr1;
        this.zzYo8 = htmlLoadOptions.zzYo8;
        this.zzYo9 = htmlLoadOptions.zzYo9;
        this.zzYoa = htmlLoadOptions.zzYoa;
        this.zzYoc = htmlLoadOptions.zzYoc;
        this.zzYob = htmlLoadOptions.zzYob;
        setBlockImportMode(htmlLoadOptions.getBlockImportMode());
    }

    public HtmlLoadOptions(LoadOptions loadOptions) {
        super(loadOptions);
        this.zzYob = 100000;
    }
}
