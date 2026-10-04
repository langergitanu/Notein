package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzZQS extends Exception {
    protected zzZQY zz3u;
    protected Throwable zz3v;

    public zzZQS() {
    }

    public final zzZQY zzlj() {
        return this.zz3u;
    }

    public zzZQS(String str) {
        super(str);
    }

    public zzZQS(Throwable th) {
        this.zz3v = th;
    }

    public zzZQS(String str, Throwable th) {
        super(str);
        this.zz3v = th;
    }

    public zzZQS(String str, zzZQY zzzqy) {
        StringBuffer stringBuffer = new StringBuffer("ParseError at [row,col]:[");
        stringBuffer.append(zzzqy.getLineNumber());
        stringBuffer.append(",");
        stringBuffer.append(zzzqy.getColumnNumber());
        stringBuffer.append("]\nMessage: ");
        stringBuffer.append(str);
        super(stringBuffer.toString());
        this.zz3u = zzzqy;
    }
}
