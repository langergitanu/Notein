package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class CsvDataLoadOptions {
    static com.aspose.words.internal.zzRZ zzZk7 = new CsvDataLoadOptions().zzZTM();
    private boolean zzNU;
    private char zzNT = ',';
    private char zzNS = '\"';
    private char zzNR = '#';

    public CsvDataLoadOptions() {
    }

    public char getCommentChar() {
        return this.zzNR;
    }

    public char getDelimiter() {
        return this.zzNT;
    }

    public char getQuoteChar() {
        return this.zzNS;
    }

    public boolean hasHeaders() {
        return this.zzNU;
    }

    public void setCommentChar(char c) {
        this.zzNR = c;
    }

    public void setDelimiter(char c) {
        this.zzNT = c;
    }

    public void setQuoteChar(char c) {
        this.zzNS = c;
    }

    public final com.aspose.words.internal.zzRZ zzZTM() {
        return new com.aspose.words.internal.zzRZ(this.zzNU, this.zzNT, this.zzNS, this.zzNR);
    }

    public void hasHeaders(boolean z) {
        this.zzNU = z;
    }

    public CsvDataLoadOptions(boolean z) {
        hasHeaders(z);
    }
}
