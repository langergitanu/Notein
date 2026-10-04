package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZDF {
    private String zzYJR;
    private String zzYJS;
    private String zzYL;

    private zzZDF() {
    }

    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzl(2);
        zzzow.zzl((com.aspose.words.internal.zzZYD.zzXk(this.zzYL) ? 128 : 0) | (com.aspose.words.internal.zzZYD.zzXk(this.zzYJS) ? 3 : 0) | (com.aspose.words.internal.zzZYD.zzXk(this.zzYJR) ? 8 : 0));
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzYL)) {
            zzZZQ.zzY(this.zzYL, zzzow);
        }
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzYJS)) {
            zzY3Q zzy3q = new zzY3Q(this.zzYJS);
            zzzow.writeBytes(zzy3q.zzZ9R().toByteArray());
            zzy3q.zzZ(zzzow);
        }
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzYJR)) {
            zzZZQ.zzY(this.zzYJR, zzzow);
        }
    }

    public zzZDF(String str, String str2, String str3) {
        this.zzYJS = str;
        this.zzYJR = str2;
        this.zzYL = str3;
    }
}
