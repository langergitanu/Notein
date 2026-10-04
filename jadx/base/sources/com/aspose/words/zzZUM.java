package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZUM extends com.aspose.words.internal.zzZO1 {
    private boolean zzNo;

    @Override // com.aspose.words.internal.zzZO1
    public final int getRemaining() {
        return 0;
    }

    public final boolean isError() {
        return this.zzNo;
    }

    @Override // com.aspose.words.internal.zzZO1
    public final boolean movePrevious() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZO1
    public final char zzFP() {
        return (char) 0;
    }

    @Override // com.aspose.words.internal.zzZO1
    public final boolean zzZ(char c, char c2) {
        this.zzNo = true;
        return false;
    }

    @Override // com.aspose.words.internal.zzZO1
    public final boolean zzz(char c) {
        this.zzNo = true;
        return false;
    }
}
