package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZU8 implements zzZBS {
    private com.aspose.words.internal.zzZOP zzN5;
    private Document zzZEY;

    public zzZU8(com.aspose.words.internal.zzZOP zzzop, Document document) {
        this.zzN5 = zzzop;
        this.zzZEY = document;
    }

    @Override // com.aspose.words.zzZBS
    public final boolean isEncrypted() {
        return false;
    }

    @Override // com.aspose.words.zzZBS
    public final com.aspose.words.internal.zzZOP zz1x() {
        return null;
    }

    @Override // com.aspose.words.zzZBS
    public final void zzIh() throws Exception {
        new zzZU6(this.zzN5, this.zzZEY).zzIh();
    }
}
