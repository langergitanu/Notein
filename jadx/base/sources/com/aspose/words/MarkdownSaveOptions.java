package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class MarkdownSaveOptions extends TxtSaveOptionsBase {
    private int zzY3T;
    private boolean zzY3b;
    private int zzY3c;
    private int zzY3d;
    private String zzYmm;
    private String zzYmn;
    private zzYE0 zzYmr;

    public MarkdownSaveOptions() {
        zzYE0 zzye0 = new zzYE0();
        this.zzYmr = zzye0;
        this.zzYmn = "";
        this.zzYmm = "";
        zzye0.zzXph = 96;
        zzye0.zzXpe = 1.0f;
        zzye0.zzXpg = false;
        zzye0.zzXpi = true;
    }

    public boolean getExportImagesAsBase64() {
        return this.zzYmr.zzXpg;
    }

    public boolean getExportUnderlineFormatting() {
        return this.zzY3b;
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

    public int getListExportMode() {
        return this.zzY3c;
    }

    @Override // com.aspose.words.SaveOptions
    public int getSaveFormat() {
        return 73;
    }

    public int getTableContentAlignment() {
        return this.zzY3d;
    }

    public void setExportImagesAsBase64(boolean z) {
        this.zzYmr.zzXpg = z;
    }

    public void setExportUnderlineFormatting(boolean z) {
        this.zzY3b = z;
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

    public void setListExportMode(int i) {
        this.zzY3c = i;
    }

    @Override // com.aspose.words.SaveOptions
    public void setSaveFormat(int i) {
        if (i != 73) {
            throw new IllegalArgumentException("An invalid SaveFormat for this options type was chosen.");
        }
    }

    public void setTableContentAlignment(int i) {
        this.zzY3d = i;
    }

    public final int zzYHQ() {
        return this.zzY3T;
    }

    public final zzYE0 zzYZ3() {
        this.zzYmr.zzXpd = getUseAntiAliasing();
        return this.zzYmr;
    }
}
