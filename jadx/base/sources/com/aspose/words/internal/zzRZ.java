package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzRZ {
    private char zzNR;
    private char zzNS;
    private char zzNT;
    private boolean zzNU;

    public zzRZ(boolean z, char c, char c2, char c3) {
        this.zzNU = z;
        this.zzNT = c;
        this.zzNS = c2;
        this.zzNR = c3;
    }

    public final char getCommentChar() {
        return this.zzNR;
    }

    public final char getDelimiter() {
        return this.zzNT;
    }

    public final char getQuoteChar() {
        return this.zzNS;
    }

    public final boolean hasHeaders() {
        return this.zzNU;
    }
}
