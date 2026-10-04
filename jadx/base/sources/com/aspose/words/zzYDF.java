package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYDF extends zzYDG {
    private boolean zzXof;
    private String zzXoi = "";
    private com.aspose.words.internal.zzZQ9 zzXoh = com.aspose.words.internal.zzZQ9.zz35;
    private int zzZjI = 0;
    private int zzXXc = -1;
    private int zzXog = 1;

    public final int getCalendarType() {
        return this.zzZjI;
    }

    @Override // com.aspose.words.zzYDG
    public final int getType() {
        return 6;
    }

    public final void setCalendarType(int i) {
        this.zzZjI = i;
    }

    public final void zz2(com.aspose.words.internal.zzZQ9 zzzq9) {
        if (!com.aspose.words.internal.zzZQ9.zzZ(this.zzXoh, zzzq9)) {
            this.zzXof = true;
        }
        this.zzXoh = zzzq9;
    }

    public final void zzBl(String str) {
        if (!com.aspose.words.internal.zzZKN.equals(this.zzXoi, str)) {
            this.zzXof = true;
        }
        this.zzXoi = str;
    }

    public final void zzR4(boolean z) {
        this.zzXof = false;
    }

    public final boolean zzYcP() {
        return this.zzXof;
    }

    public final int zzYcQ() {
        return this.zzXog;
    }

    public final com.aspose.words.internal.zzZQ9 zzYcR() {
        return this.zzXoh;
    }

    public final String zzYcS() {
        return this.zzXoi;
    }

    public final int zzYcT() {
        return this.zzXXc;
    }

    public final void zzmC(int i) {
        this.zzXog = i;
    }

    public final void zzmD(int i) {
        if (this.zzXXc != i) {
            this.zzXof = true;
        }
        this.zzXXc = i;
    }
}
