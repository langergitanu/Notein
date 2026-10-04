package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZJE {
    private boolean zzYsA;
    private String zzYsB;
    private boolean zzYsC;
    private String zzZi;
    private int zzp8;

    public zzZJE(String str, boolean z) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.zzZi = str;
        this.zzYsC = z;
    }

    private boolean zzzV(int i) {
        if (this.zzZi.charAt(i) != ' ') {
            return false;
        }
        int i2 = i + 1;
        if (i2 < this.zzZi.length() && this.zzZi.charAt(i2) == ' ') {
            return true;
        }
        int i3 = i - 1;
        return i3 >= 0 ? this.zzZi.charAt(i3) == ' ' : this.zzYsC;
    }

    public final boolean moveNext() {
        if (this.zzp8 >= this.zzZi.length()) {
            this.zzYsB = null;
            this.zzYsA = false;
            return false;
        }
        int i = this.zzp8;
        this.zzYsA = zzzV(i);
        do {
            int i2 = this.zzp8 + 1;
            this.zzp8 = i2;
            if (i2 >= this.zzZi.length()) {
                break;
            }
        } while (zzzV(this.zzp8) == this.zzYsA);
        this.zzYsB = this.zzZi.substring(i, (this.zzp8 - i) + i);
        return true;
    }

    public final boolean zzZ3O() {
        return this.zzYsA;
    }

    public final String zzZ3P() {
        return this.zzYsB;
    }
}
