package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzHY extends zzZO1 {
    private int zzTL;
    private String zzx7 = "";

    private boolean zzWh(int i) {
        this.zzx7 = "&#x" + zzJB.zzWy(i) + ";";
        this.zzTL = 0;
        return true;
    }

    @Override // com.aspose.words.internal.zzZO1
    public final int getRemaining() {
        return this.zzx7.length() - this.zzTL;
    }

    @Override // com.aspose.words.internal.zzZO1
    public final boolean movePrevious() {
        int i = this.zzTL - 1;
        this.zzTL = i;
        if (i >= 0) {
            return true;
        }
        this.zzTL = 0;
        return false;
    }

    @Override // com.aspose.words.internal.zzZO1
    public final char zzFP() {
        if (this.zzTL >= this.zzx7.length()) {
            return (char) 0;
        }
        char cCharAt = this.zzx7.charAt(this.zzTL);
        this.zzTL++;
        return cCharAt;
    }

    @Override // com.aspose.words.internal.zzZO1
    public final boolean zzZ(char c, char c2) {
        return zzWh(zzZVS.zzW(c, c2));
    }

    @Override // com.aspose.words.internal.zzZO1
    public final boolean zzz(char c) {
        return zzWh(c);
    }
}
