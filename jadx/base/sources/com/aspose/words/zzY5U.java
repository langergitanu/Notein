package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY5U implements zzZB9 {
    private int zzTL = -1;
    private String zzX4u;

    public zzY5U(String str) {
        this.zzX4u = str;
        zzSC();
    }

    @Override // com.aspose.words.zzZB9
    public final Node getCurrentNode() {
        return null;
    }

    @Override // com.aspose.words.zzZB9
    public final char zzIw() {
        return this.zzX4u.charAt(this.zzTL);
    }

    @Override // com.aspose.words.zzZB9
    public final boolean zzSC() {
        this.zzTL++;
        return !zzYC();
    }

    @Override // com.aspose.words.zzZB9
    public final boolean zzYC() {
        return this.zzTL >= this.zzX4u.length();
    }

    @Override // com.aspose.words.zzZB9
    public final String zzYWm() {
        return null;
    }

    @Override // com.aspose.words.zzZB9
    public final boolean zzYWn() {
        return false;
    }

    @Override // com.aspose.words.zzZB9
    public final int zzYWo() {
        return 1024;
    }

    @Override // com.aspose.words.zzZB9
    public final int zzYWp() {
        return 1024;
    }

    @Override // com.aspose.words.zzZB9
    public final int zzYWq() {
        return 1024;
    }

    @Override // com.aspose.words.zzZB9
    public final boolean zzYWr() {
        return false;
    }

    @Override // com.aspose.words.zzZB9
    public final int zzYWs() {
        return 0;
    }

    @Override // com.aspose.words.zzZB9
    public final zzZYT zzYWt() {
        return zzZYT.zzYR7;
    }
}
