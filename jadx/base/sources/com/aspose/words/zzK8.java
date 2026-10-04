package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzK8 extends com.aspose.words.internal.zzZO4 {
    private int zzTL = 0;
    private char[] zzZnz;

    public zzK8(String str) {
        this.zzZnz = str.toCharArray();
    }

    @Override // com.aspose.words.internal.zzZO4
    public final int getRemaining() {
        return this.zzZnz.length - this.zzTL;
    }

    @Override // com.aspose.words.internal.zzZO4
    public final char zzFP() {
        int i = this.zzTL;
        char[] cArr = this.zzZnz;
        if (i >= cArr.length) {
            return (char) 0;
        }
        this.zzTL = i + 1;
        return cArr[i];
    }

    @Override // com.aspose.words.internal.zzZO4
    public final boolean zzi6() {
        this.zzTL = 0;
        return true;
    }
}
