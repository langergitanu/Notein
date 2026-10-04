package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class ChmLoadOptions extends LoadOptions {
    private String zzZwV;

    public ChmLoadOptions() {
    }

    public String getOriginalFileName() {
        return this.zzZwV;
    }

    public void setOriginalFileName(String str) {
        this.zzZwV = str;
    }

    public final zzZFH zz1r() {
        zzZFH zzzfh = new zzZFH();
        zzzfh.zzYmF = getOriginalFileName();
        return zzzfh;
    }

    @Override // com.aspose.words.LoadOptions
    public final LoadOptions zz1s() {
        return new ChmLoadOptions(this);
    }

    public ChmLoadOptions(LoadOptions loadOptions) {
        super(loadOptions);
    }

    private ChmLoadOptions(ChmLoadOptions chmLoadOptions) {
        super(chmLoadOptions);
        setOriginalFileName(chmLoadOptions.getOriginalFileName());
    }
}
