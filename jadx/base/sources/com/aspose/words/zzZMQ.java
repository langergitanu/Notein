package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZMQ extends zzYVI {
    public zzZMQ(zzZYW zzzyw) {
        super(zzzyw);
    }

    @Override // com.aspose.words.zzY9C
    public final int getStoryType() {
        return 2;
    }

    @Override // com.aspose.words.zzYVI
    public final void zzK(zzUZ zzuz) {
        zzuz.zzZ((zzZMW) null);
    }

    @Override // com.aspose.words.zzYVI
    public final zzYVR zzY(zzUZ zzuz, boolean z) throws Exception {
        if (zzuz.zz09() == null && z) {
            zzuz.zzZ(new zzZMW());
            zzYVR[] zzyvrArrZzC = zzC(zzuz);
            zzZ(zzyvrArrZzC[0], zzyvrArrZzC[1], zzuz.zz09(), false);
        }
        return zzuz.zz09();
    }

    @Override // com.aspose.words.zzY9C
    public final boolean zzZZB() {
        return false;
    }
}
