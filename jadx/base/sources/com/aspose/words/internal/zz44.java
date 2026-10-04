package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz44 extends zz45 {
    private zzEG zzM;
    private int zzVz;

    public zz44(int i, zzEG zzeg) {
        this.zzVz = i;
        this.zzM = zzeg;
    }

    private int zzuA() {
        int i = this.zzVz;
        if (i == 7) {
            return 0;
        }
        if (i == 8) {
            return -1;
        }
        throw new IllegalStateException("Unexpected compression.");
    }

    @Override // com.aspose.words.internal.zz45
    public final zzZOP zz4(zzZOP zzzop) {
        return new zz3V(zzzop, this.zzVz == 7 ? 3 : 4, (float) this.zzM.getVerticalResolution(), this.zzM.getWidth());
    }

    @Override // com.aspose.words.internal.zz45
    public final void zzG(zzFY zzfy) throws Exception {
        zzfy.zzFd();
        zzfy.zzM("/K", zzuA());
        zzfy.zzM("/Columns", this.zzM.getWidth());
        zzfy.zzM("/Rows", this.zzM.getHeight());
        zzfy.zzFc();
    }

    @Override // com.aspose.words.internal.zz45
    public final boolean zzuB() {
        return true;
    }

    @Override // com.aspose.words.internal.zz45
    public final String zzwE() {
        return "/CCITTFaxDecode";
    }
}
