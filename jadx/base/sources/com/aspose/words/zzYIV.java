package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYIV implements com.aspose.words.internal.zzHG {
    static zzYIV zzXxE = new zzYIV(0, new zzYEF());
    private char zzXxF;
    private zzYEF zzZsP;

    public zzYIV(char c, zzYEF zzyef) {
        this.zzXxF = c;
        this.zzZsP = zzyef;
    }

    public final char getCharacter() {
        return this.zzXxF;
    }

    @Override // com.aspose.words.internal.zzHG
    public final com.aspose.words.internal.zzHG zzFK() {
        return zzYkr();
    }

    @Override // com.aspose.words.internal.zzHG
    public final com.aspose.words.internal.zzHG zzFL() {
        return zzYks();
    }

    @Override // com.aspose.words.internal.zzHG
    public final char zzFM() {
        return this.zzXxF;
    }

    public final zzYIU zzYkq() {
        return new zzYIU(this);
    }

    public final zzYIV zzYkr() {
        return new zzYIV(Character.toLowerCase(this.zzXxF), this.zzZsP);
    }

    public final zzYIV zzYks() {
        return new zzYIV(Character.toUpperCase(this.zzXxF), this.zzZsP);
    }

    public final zzYEF zzZYh() {
        return this.zzZsP;
    }
}
