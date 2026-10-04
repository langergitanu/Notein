package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYVJ extends zzY9C {
    private int zzYQi;
    private zzYMD zzZA6;
    private zzYMD zzZA7;

    public zzYVJ(zzZYW zzzyw, int i) {
        super(zzzyw);
        this.zzYQi = i;
    }

    @Override // com.aspose.words.zzY9C
    public final int getStoryType() {
        return this.zzYQi;
    }

    @Override // com.aspose.words.zzZ6T
    public final zzYMD zz6w() {
        return this.zzZA6;
    }

    @Override // com.aspose.words.zzZ6T
    public final zzYMD zz6x() {
        return this.zzZA7;
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzY(zzYMD zzymd) {
        this.zzZA6 = zzymd;
    }

    public final zzYVM zzYzi() throws Exception {
        if (this.zzZA7 == null) {
            zzZ(null, null, new zzYVM(), false);
        }
        return (zzYVM) this.zzZA7;
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzZ(zzYMD zzymd) {
        this.zzZA7 = zzymd;
    }

    @Override // com.aspose.words.zzY9C
    public final boolean zzZZB() {
        return false;
    }

    @Override // com.aspose.words.zzY9C
    public final zzYMM zzZ(zzYAS zzyas) throws Exception {
        return zzU(zzyas);
    }
}
