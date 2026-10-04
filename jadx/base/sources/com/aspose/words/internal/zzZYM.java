package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZYM {
    private String zzc6;
    private int zzc7;
    private int zzc8;
    private char[] zztx;

    public zzZYM() {
    }

    public final char get(int i) {
        return this.zztx[i];
    }

    public final int getLength() {
        return this.zzc7;
    }

    public final int getStartIndex() {
        return this.zzc8;
    }

    public final String toString() {
        String str = this.zzc6;
        return str != null ? str : new String(this.zztx, this.zzc8, this.zzc7);
    }

    public final char[] zzr5() {
        return this.zztx;
    }

    public zzZYM(char[] cArr, int i, int i2) {
        this.zztx = cArr;
        this.zzc8 = i;
        this.zzc7 = i2;
        this.zzc6 = null;
    }

    public zzZYM(String str) {
        this(str.toCharArray(), 0, str.length());
        this.zzc6 = str;
    }
}
