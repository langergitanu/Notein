package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzY87 {
    private com.aspose.words.internal.zzZO0 zzX8J;
    private String zzZR;
    private String zzkB;

    public zzY87(com.aspose.words.internal.zzZO0 zzzo0, String str, String str2) {
        this.zzX8J = zzzo0;
        this.zzZR = str;
        this.zzkB = str2;
    }

    public final String getContentType() {
        return this.zzZR;
    }

    public final String getUri() {
        return this.zzkB;
    }

    public final boolean isText() {
        return this.zzX8J != null;
    }

    public abstract com.aspose.words.internal.zzZOR zz9P() throws Exception;

    public final com.aspose.words.internal.zzZO0 zzY1F() {
        return this.zzX8J;
    }
}
