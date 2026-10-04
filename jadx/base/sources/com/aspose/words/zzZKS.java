package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZKS extends zzZ28 {
    private com.aspose.words.internal.zzZNR zzYtJ = new com.aspose.words.internal.zzZNR("^[ >]*(=+|-+)\\s*$", 0);
    private com.aspose.words.internal.zzZNR zzYtI = new com.aspose.words.internal.zzZNR("^[ >]*\\#{1,6}\\s.*$", 0);

    @Override // com.aspose.words.zzZ28
    public final int getType() {
        return 3;
    }

    @Override // com.aspose.words.zzZ28
    public final boolean zzZ(zzZ27 zzz27) {
        if (this.zzYtI.zzUV(zzz27.zzYIT())) {
            setCount(getCount() + 1);
            return true;
        }
        if (zzz27.zzYIS() || !this.zzYtJ.zzUV(zzz27.zzYIT())) {
            return false;
        }
        setCount(getCount() + 1);
        return true;
    }

    @Override // com.aspose.words.zzZ28
    public final int zzZjs() {
        return 1;
    }
}
