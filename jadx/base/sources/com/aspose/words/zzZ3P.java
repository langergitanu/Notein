package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ3P extends zzZ3Q {
    private com.aspose.words.internal.zzB9 zzYb1;
    private com.aspose.words.internal.zzB7 zzYb2;

    public zzZ3P(zzZ3T zzz3t, com.aspose.words.internal.zzB8 zzb8) {
        super(zzz3t, zzb8);
    }

    private com.aspose.words.internal.zzBG zzYNi() {
        if (this.zzYb1 == null) {
            com.aspose.words.internal.zzB9 zzb9 = new com.aspose.words.internal.zzB9();
            this.zzYb1 = zzb9;
            this.zzYb3.zzX(zzb9);
        }
        return this.zzYb1;
    }

    private com.aspose.words.internal.zzBG zzYNj() {
        if (this.zzYb2 == null) {
            com.aspose.words.internal.zzB7 zzb7 = new com.aspose.words.internal.zzB7();
            this.zzYb2 = zzb7;
            this.zzYb3.zzY(zzb7);
        }
        return this.zzYb2;
    }

    @Override // com.aspose.words.zzZ3Q
    public final boolean zzG(zzZ6H zzz6h) throws Exception {
        return zzC(zzz6h) || zzH(zzz6h) != zzH(this.zzYb6);
    }

    @Override // com.aspose.words.zzZ3Q
    public final com.aspose.words.internal.zzBG zzH(zzZ6H zzz6h) throws Exception {
        com.aspose.words.internal.zzBB zzbb = this.zzYb5;
        return zzbb != null ? zzbb : zzz6h.zzYRO() ? zzYNj() : zzYNi();
    }

    @Override // com.aspose.words.zzZ3Q
    public final com.aspose.words.internal.zzBG zzYNn() {
        return zzYNi();
    }
}
