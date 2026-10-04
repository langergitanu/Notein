package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZSD implements zzZBG {
    private boolean zzYIW;
    private boolean zzYIX;
    private Document zzZEY;

    public zzZSD(Document document) {
        this(document, true);
    }

    @Override // com.aspose.words.zzZBG
    public final Class zzZhV() {
        return zzZSD.class;
    }

    @Override // com.aspose.words.zzZBG
    public final void zzZhW() throws Exception {
        if (this.zzYIX) {
            return;
        }
        if (!this.zzZEY.zzZqj() || this.zzYIW) {
            this.zzZEY.updatePageLayout();
        }
        this.zzYIX = true;
    }

    public zzZSD(Document document, boolean z) {
        this.zzZEY = document;
        this.zzYIW = z;
    }
}
