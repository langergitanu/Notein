package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class TxtListIndentation {
    private char zzXxF;
    private int zzZF;

    private boolean zzXUK() {
        return this.zzZF > 0 && this.zzXxF != 0;
    }

    public char getCharacter() {
        return this.zzXxF;
    }

    public int getCount() {
        return this.zzZF;
    }

    public void setCharacter(char c) {
        this.zzXxF = c;
    }

    public void setCount(int i) {
        com.aspose.words.internal.zzZ4.zzY(i, "Count");
        this.zzZF = i;
    }

    public final String zzrI(int i) {
        return (!zzXUK() || i <= 0) ? "" : com.aspose.words.internal.zzZKN.zzS(this.zzXxF, this.zzZF * i);
    }
}
