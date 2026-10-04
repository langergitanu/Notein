package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class XamlFlowSaveOptions extends SaveOptions {
    private String zzYmm;
    private String zzYmn;
    private zzYE0 zzYmr;
    private int zzZCv;

    public XamlFlowSaveOptions() {
        this(71);
    }

    private void zzGe(int i) {
        if (i != 71 && i != 72) {
            throw new IllegalArgumentException("An invalid SaveFormat for this options type was chosen.");
        }
        this.zzZCv = i;
    }

    public IImageSavingCallback getImageSavingCallback() {
        return this.zzYmr.zzXpf;
    }

    public String getImagesFolder() {
        return this.zzYmn;
    }

    public String getImagesFolderAlias() {
        return this.zzYmm;
    }

    @Override // com.aspose.words.SaveOptions
    public int getSaveFormat() {
        return this.zzZCv;
    }

    public void setImageSavingCallback(IImageSavingCallback iImageSavingCallback) {
        this.zzYmr.zzXpf = iImageSavingCallback;
    }

    public void setImagesFolder(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "ImagesFolder");
        this.zzYmn = str;
    }

    public void setImagesFolderAlias(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "ImagesFolderAlias");
        this.zzYmm = str;
    }

    @Override // com.aspose.words.SaveOptions
    public void setSaveFormat(int i) {
        zzGe(i);
    }

    public final zzYE0 zzYZ3() {
        return this.zzYmr;
    }

    public XamlFlowSaveOptions(int i) {
        this.zzYmn = "";
        this.zzYmm = "";
        zzYE0 zzye0 = new zzYE0();
        this.zzYmr = zzye0;
        zzye0.zzXpj = 0;
        zzye0.zzXpi = false;
        zzye0.zzXph = 96;
        zzye0.zzXpg = false;
        zzye0.zzXpe = 1.0f;
        zzGe(i);
    }
}
