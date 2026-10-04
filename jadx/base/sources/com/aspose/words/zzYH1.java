package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYH1 {
    private boolean zzXv9;
    int zzXvd = -1;
    int zzXvc = -1;
    int zzXvb = -1;
    int zzXva = -1;
    private int zzXv8 = -1;
    private int zzXv7 = -1;
    private int zzXv6 = -1;
    private int zzXv5 = -1;
    private int zzXv4 = -1;
    private int zzXv3 = 1252;

    public final int getLocaleIdBi() {
        if (zzYEO.zznw(this.zzXv5) || zzYEO.zznv(this.zzXv5)) {
            return this.zzXv5;
        }
        return 1025;
    }

    public final void zzYia() {
        this.zzXv9 = true;
    }

    public final boolean zzYib() {
        return this.zzXv9;
    }

    public final int zzYic() {
        return this.zzXv3;
    }

    public final int zzYid() {
        return this.zzXv5;
    }

    public final int zzYie() {
        int i = this.zzXv8;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final void zzoK(int i) {
        this.zzXv3 = i;
    }

    public final void zzoL(int i) {
        this.zzXv4 = i;
        if (zzYEO.zznw(i)) {
            this.zzXv5 = i;
        }
    }

    public final void zzoM(int i) {
        this.zzXv5 = i;
    }

    public final void zzoN(int i) {
        this.zzXv6 = i;
        if (zzYEO.zznw(i)) {
            this.zzXv5 = i;
        }
    }

    public final void zzoO(int i) {
        this.zzXv7 = i;
    }

    public final void zzoP(int i) {
        this.zzXv8 = i;
    }
}
