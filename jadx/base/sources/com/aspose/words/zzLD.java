package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzLD {
    private int zzZnA;
    private String zzZnB;
    private char[] zzZnz = new char[5];
    private int zzZny = 1;

    public zzLD(String str) {
        this.zzZnB = str;
        int i = 1 + 1;
        while (true) {
            char[] cArr = this.zzZnz;
            if (i >= cArr.length) {
                return;
            }
            cArr[i] = zzZTR();
            i++;
        }
    }

    private char zzZTR() {
        if (this.zzZnA >= this.zzZnB.length()) {
            return (char) 0;
        }
        char cCharAt = this.zzZnB.charAt(this.zzZnA);
        int i = this.zzZnA + 1;
        this.zzZnA = i;
        if (cCharAt == 0) {
            return (char) 65533;
        }
        if (cCharAt != '\f') {
            if (cCharAt != '\r') {
                return cCharAt;
            }
            if (i < this.zzZnB.length() && this.zzZnB.charAt(this.zzZnA) == '\n') {
                this.zzZnA++;
            }
        }
        return '\n';
    }

    public final char zzFI() {
        return this.zzZnz[this.zzZny];
    }

    public final char zzZTS() {
        return this.zzZnz[this.zzZny + 3];
    }

    public final char zzZTT() {
        return this.zzZnz[this.zzZny + 2];
    }

    public final char zzZTU() {
        return this.zzZnz[this.zzZny + 1];
    }

    public final boolean zzZTV() {
        return zzZTU() == 0;
    }

    public final void zzZTW() {
        int i = this.zzZny;
        if (i <= 0) {
            throw new IllegalStateException("Tried to reconsume too many characters.");
        }
        this.zzZny = i - 1;
    }

    public final boolean zzZTX() {
        char[] cArr;
        int i = this.zzZny;
        if (i <= 0) {
            this.zzZny = i + 1;
        } else {
            int i2 = 1;
            while (true) {
                cArr = this.zzZnz;
                if (i2 >= cArr.length) {
                    break;
                }
                cArr[i2 - 1] = cArr[i2];
                i2++;
            }
            cArr[cArr.length - 1] = zzZTR();
        }
        return this.zzZnz[this.zzZny] != 0;
    }
}
