package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY97 {
    private com.aspose.words.internal.zzZQC<Integer> zzE8 = new com.aspose.words.internal.zzZQC<>();
    private boolean zzXaE;
    private boolean zzXaF;

    private static boolean zzFK(int i) {
        return i == 6 || i == 10 || i == 7;
    }

    private void zzZd(int i, boolean z) {
        if (!z ? this.zzXaF : !this.zzXaF) {
            if (zzFK(i)) {
                this.zzXaF = z;
                return;
            }
        }
        if (z) {
            if (this.zzXaE) {
                return;
            }
        } else if (!this.zzXaE) {
            return;
        }
        if (zzlh(i)) {
            this.zzXaE = z;
        }
    }

    private static boolean zzlh(int i) {
        return i == 8 || i == 11 || i == 9;
    }

    public final void zzVF(int i) {
        this.zzE8.push(Integer.valueOf(i));
        zzZd(i, true);
    }

    public final boolean zzY42() {
        return this.zzXaE;
    }

    public final boolean zzY43() {
        return this.zzXaF;
    }

    public final boolean zzY44() {
        return this.zzXaF || this.zzXaE;
    }

    public final int zzY45() {
        return this.zzE8.peek().intValue();
    }

    public final void zzli(int i) {
        zzY45();
        this.zzE8.pop();
        zzZd(i, false);
    }
}
