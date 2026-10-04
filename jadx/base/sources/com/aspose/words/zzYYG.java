package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYYG {
    private com.aspose.words.internal.zzXZ zzXYi;
    private com.aspose.words.internal.zzZOR zzkX;

    public zzYYG() {
        try {
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
            this.zzkX = zzzor;
            this.zzXYi = new com.aspose.words.internal.zzXZ(zzzor);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public final int getLength() throws Exception {
        return (int) this.zzkX.getLength();
    }

    public final void zzO(com.aspose.words.internal.zzXZ zzxz) throws Exception {
        zzxz.zzW(this.zzkX.zziA(), getLength());
    }

    public final void zzY(zzYYG zzyyg) throws Exception {
        zzyyg.zzXYi.zzW(this.zzkX.zziA(), getLength());
    }

    public final com.aspose.words.internal.zzXZ zzYCU() {
        return this.zzXYi;
    }

    public final void zzYCV() throws Exception {
        zzYXM.zzQ(this.zzXYi, getLength());
    }
}
