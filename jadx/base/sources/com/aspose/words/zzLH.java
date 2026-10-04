package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzLH {
    static zzLH zzZo4 = new zzLH(24);
    private int zzL4;

    public zzLH(int i) {
        this.zzL4 = i;
    }

    public final int getType() {
        return this.zzL4;
    }

    public final boolean isWhitespace() {
        return this.zzL4 == 12;
    }

    public final boolean zzYC() {
        return this.zzL4 == 24;
    }

    public final boolean zzZe(char c) {
        return this.zzL4 == 8 && ((zzPO) this).zzqe() == c;
    }
}
