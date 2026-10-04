package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY7R {
    private com.aspose.words.internal.zzZL zzX89;
    private boolean zzXu;
    private long zzYV;
    private com.aspose.words.internal.zzH6 zzl7;

    public zzY7R(com.aspose.words.internal.zzZL zzzl, long j, boolean z, com.aspose.words.internal.zzH6 zzh6) {
        this.zzX89 = zzzl;
        this.zzYV = j;
        this.zzXu = z;
        this.zzl7 = zzh6;
    }

    public final long getSize() {
        return this.zzYV;
    }

    public final boolean isVisible() {
        return this.zzXu;
    }

    public final com.aspose.words.internal.zzZL zzY11() {
        return this.zzX89;
    }

    public final void zzZ(com.aspose.words.internal.zzZOP zzzop, int i) throws Exception {
        ImageSaveOptions imageSaveOptions = new ImageSaveOptions(FileFormatUtil.zzC8(i));
        imageSaveOptions.setUseGdiEmfRenderer(false);
        imageSaveOptions.setUseAntiAliasing(true);
        imageSaveOptions.setResolution(72.0f);
        imageSaveOptions.zzV8(false);
        zzYDY.zzZ(this.zzX89, this.zzYV, zzzop, imageSaveOptions, this.zzl7);
    }
}
