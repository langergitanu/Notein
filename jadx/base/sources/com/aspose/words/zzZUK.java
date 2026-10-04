package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZUK extends com.aspose.words.internal.zzZO1 {
    private int zzTL = 0;
    private char[] zzZnz;

    public zzZUK(String str) {
        this.zzZnz = str.toCharArray();
    }

    @Override // com.aspose.words.internal.zzZO1
    public final int getRemaining() {
        return this.zzZnz.length - this.zzTL;
    }

    @Override // com.aspose.words.internal.zzZO1
    public final boolean movePrevious() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZO1
    public final char zzFP() {
        int i = this.zzTL;
        char[] cArr = this.zzZnz;
        if (i >= cArr.length) {
            return (char) 0;
        }
        this.zzTL = i + 1;
        return cArr[i];
    }

    @Override // com.aspose.words.internal.zzZO1
    public final boolean zzZ(char c, char c2) {
        this.zzTL = 0;
        return true;
    }

    @Override // com.aspose.words.internal.zzZO1
    public final boolean zzz(char c) {
        this.zzTL = 0;
        return true;
    }
}
