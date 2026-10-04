package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class RtfLoadOptions extends LoadOptions {
    private boolean zzXuJ;

    public RtfLoadOptions() {
    }

    public boolean getRecognizeUtf8Text() {
        return this.zzXuJ;
    }

    public void setRecognizeUtf8Text(boolean z) {
        this.zzXuJ = z;
    }

    @Override // com.aspose.words.LoadOptions
    public final LoadOptions zz1s() {
        return new RtfLoadOptions(this);
    }

    public RtfLoadOptions(LoadOptions loadOptions) {
        super(loadOptions);
    }
}
