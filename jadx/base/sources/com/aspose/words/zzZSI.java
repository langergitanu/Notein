package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZSI {
    private String zzYJ6;
    private int zzp8;

    public zzZSI(String str) {
        this.zzYJ6 = str;
    }

    public final String getExpression() {
        return this.zzYJ6;
    }

    public final int getPosition() {
        return this.zzp8;
    }

    public final char zzIw() {
        return this.zzYJ6.charAt(this.zzp8);
    }

    public final boolean zzMv(String str) {
        if (com.aspose.words.internal.zzZKN.zzZ(this.zzYJ6, this.zzp8, str, str.length(), com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8) != 0) {
            return false;
        }
        this.zzp8 = str.length() + this.zzp8;
        return true;
    }

    public final boolean zzQ(char[] cArr) {
        int iZzZ = com.aspose.words.internal.zzZKN.zzZ(this.zzYJ6, cArr, this.zzp8);
        this.zzp8 = iZzZ;
        if (iZzZ >= 0) {
            return true;
        }
        this.zzp8 = this.zzYJ6.length();
        return false;
    }

    public final boolean zzYC() {
        String str = this.zzYJ6;
        return str == null || this.zzp8 >= str.length();
    }

    public final void zzZUY() {
        while (!zzYC() && com.aspose.words.internal.zzZKU.zzG(zzIw())) {
            zzZi0();
        }
    }

    public final void zzZi0() {
        this.zzp8++;
    }
}
