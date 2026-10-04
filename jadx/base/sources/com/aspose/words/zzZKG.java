package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZKG extends zzZ28 {
    private com.aspose.words.internal.zzZNR zzYty = new com.aspose.words.internal.zzZNR("^[ ]{0,3}([-*_])(?>[ ]{0,2}\\1){2,}[ ]*$", 8);

    @Override // com.aspose.words.zzZ28
    public final int getType() {
        return 6;
    }

    @Override // com.aspose.words.zzZ28
    public final boolean zzZ(zzZ27 zzz27) {
        if (zzz27.zzYIQ().contains(3) || !this.zzYty.zzUV(zzz27.zzYIT())) {
            return false;
        }
        setCount(getCount() + 1);
        return true;
    }

    @Override // com.aspose.words.zzZ28
    public final int zzZjs() {
        return 2;
    }
}
