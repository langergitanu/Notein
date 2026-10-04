package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class MarkdownLoadOptions extends LoadOptions {
    private boolean zzY3H;

    public MarkdownLoadOptions() {
        setLoadFormat(63);
    }

    public boolean getPreserveEmptyLines() {
        return this.zzY3H;
    }

    public void setPreserveEmptyLines(boolean z) {
        this.zzY3H = z;
    }

    public MarkdownLoadOptions(LoadOptions loadOptions) {
        super(loadOptions);
        setLoadFormat(63);
    }
}
