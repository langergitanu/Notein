package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZFQ extends zzYF9 {
    private zzZFQ(zzYF8 zzyf8, String str) {
        super(zzyf8, str);
    }

    private String zzXNJ() {
        zzZQY zzzqyZzlj = zzlj();
        if (zzzqyZzlj == null) {
            return null;
        }
        return zzzqyZzlj.toString();
    }

    public static zzZFQ zzZ(zzYF8 zzyf8) {
        zzZQY zzzqyZzlj = zzyf8.zzlj();
        return zzzqyZzlj == null ? new zzZFQ(zzyf8, zzyf8.getMessage()) : new zzZFQ(zzyf8, zzyf8.getMessage(), zzzqyZzlj);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String strZzXNJ = zzXNJ();
        if (strZzXNJ == null) {
            return super.getMessage();
        }
        String message = zzXyg().getMessage();
        StringBuilder sb = new StringBuilder(strZzXNJ.length() + message.length() + 20);
        sb.append(message);
        zzZDX.zzt(sb);
        sb.append(" at ");
        sb.append(strZzXNJ);
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return zzZFQ.class.getName() + ": " + getMessage();
    }

    private zzZFQ(zzYF8 zzyf8, String str, zzZQY zzzqy) {
        super(zzyf8, str, zzzqy);
    }
}
