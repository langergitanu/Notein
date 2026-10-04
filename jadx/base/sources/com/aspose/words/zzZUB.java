package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZUB extends zzYVI {
    public zzZUB(zzZYW zzzyw) {
        super(zzzyw);
    }

    @Override // com.aspose.words.zzY9C
    public final int getStoryType() {
        return 3;
    }

    @Override // com.aspose.words.zzYVI
    public final void zzK(zzUZ zzuz) {
        zzuz.zzZ((zzZUE) null);
    }

    @Override // com.aspose.words.zzYVI
    public final zzYVR zzY(zzUZ zzuz, boolean z) throws Exception {
        if (zzuz.zz08() == null && z) {
            zzuz.zzZ(new zzZUE());
            zzYVR[] zzyvrArrZzC = zzC(zzuz);
            zzZ(zzyvrArrZzC[0], zzyvrArrZzC[1], zzuz.zz08(), false);
        }
        return zzuz.zz08();
    }

    @Override // com.aspose.words.zzY9C
    public final boolean zzZZB() {
        return false;
    }
}
