package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZSC implements zzZBG {
    private boolean zzYIX;
    private Document zzZEY;

    public zzZSC(Document document) {
        this.zzZEY = document;
    }

    @Override // com.aspose.words.zzZBG
    public final Class zzZhV() {
        return zzZSC.class;
    }

    @Override // com.aspose.words.zzZBG
    public final void zzZhW() throws Exception {
        if (this.zzYIX) {
            return;
        }
        this.zzZEY.updateListLabels();
        this.zzYIX = true;
    }
}
