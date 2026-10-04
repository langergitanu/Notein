package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZRQ extends zzZRR {
    private boolean zzYHU;
    private zzZAF zzYHV;
    private boolean zzZzw;

    public zzZRQ(zzZAF zzzaf, boolean z) {
        this.zzYHV = zzzaf;
        this.zzYHU = z;
    }

    @Override // com.aspose.words.zzZRR
    public final zzZAF zzMp(String str) throws Exception {
        if (!com.aspose.words.internal.zzZYD.zzi(str, this.zzYHV.getTableName())) {
            return null;
        }
        if (!this.zzZzw) {
            this.zzZzw = true;
        } else {
            if (!this.zzYHU) {
                return null;
            }
            this.zzYHV.reset();
        }
        return this.zzYHV;
    }
}
