package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzY9P extends zzYAU {
    private int zzXcQ;

    public zzY9P(int i) {
        this.zzXcQ = i;
    }

    @Override // com.aspose.words.zzYAU, com.aspose.words.zzYMD
    public final int getContentHeight() throws Exception {
        zzZZJ().getContentHeight();
        return Math.min(zzZZJ().getContentHeight(), 13050);
    }

    @Override // com.aspose.words.zzYAU, com.aspose.words.zzYMD
    public final int getHeight() throws Exception {
        return getContentHeight();
    }

    @Override // com.aspose.words.zzYAU
    public final int getLength() {
        return 1;
    }

    @Override // com.aspose.words.zzYAU, com.aspose.words.zzYMD
    public final int getY() throws Exception {
        return Math.max(0, ((zzZ55) zzZZJ()).getBaseline() - ((getContentHeight() * 82) / 100));
    }

    @Override // com.aspose.words.zzYAU
    public final int zzZo6() {
        return this.zzXcQ;
    }
}
