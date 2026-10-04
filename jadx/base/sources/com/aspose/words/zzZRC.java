package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZRC extends zzZ28 {
    private boolean zzYHF;
    private com.aspose.words.internal.zzZNR zzYHE = new com.aspose.words.internal.zzZNR("(^\\s{0,3}(>\\s{0,4})?(([`]{3,}(?!`))|[~]{3,}))", 0);
    private com.aspose.words.internal.zzZNR zzYHD = new com.aspose.words.internal.zzZNR("(^\\s{0,3}(>\\s{0,4})?([`]{3,}|[~]{3,})$)", 0);

    @Override // com.aspose.words.zzZ28
    public final int getType() {
        return 1;
    }

    @Override // com.aspose.words.zzZ28
    public final boolean zzZ(zzZ27 zzz27) throws Exception {
        if (!this.zzYHF) {
            boolean zZzUV = this.zzYHE.zzUV(zzz27.zzYIT());
            this.zzYHF = zZzUV;
            if (zZzUV && zzz27.zzYIR()) {
                setCount(getCount() + 1);
                return true;
            }
        } else if (this.zzYHD.zzUV(zzz27.zzYIT()) || zzz27.zzYIR()) {
            setCount(getCount() + 1);
            this.zzYHF = false;
            return true;
        }
        return false;
    }

    @Override // com.aspose.words.zzZ28
    public final int zzZjs() {
        return 3;
    }
}
