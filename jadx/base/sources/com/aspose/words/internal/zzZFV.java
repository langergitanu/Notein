package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzZFV extends zzZQS {
    protected final String zzWMU;

    public zzZFV(String str) {
        super(str);
        this.zzWMU = str;
    }

    private String zzXNJ() {
        zzZQY zzzqyZzlj = zzlj();
        if (zzzqyZzlj == null) {
            return null;
        }
        return zzzqyZzlj.toString();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String strZzXNJ = zzXNJ();
        if (strZzXNJ == null) {
            return super.getMessage();
        }
        StringBuilder sb = new StringBuilder(strZzXNJ.length() + this.zzWMU.length() + 20);
        sb.append(this.zzWMU);
        zzZDX.zzt(sb);
        sb.append(" at ");
        sb.append(strZzXNJ);
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    public zzZFV(Throwable th) {
        super(th.getMessage(), th);
        this.zzWMU = th.getMessage();
    }

    public zzZFV(String str, zzZQY zzzqy) {
        super(str, zzzqy);
        this.zzWMU = str;
    }
}
