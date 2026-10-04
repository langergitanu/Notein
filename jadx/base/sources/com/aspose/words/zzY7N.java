package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY7N {
    private com.aspose.words.internal.zzPM zzYX;
    private String zzZi;

    public zzY7N(String str, com.aspose.words.internal.zzPM zzpm) {
        this.zzZi = str;
        this.zzYX = zzpm;
    }

    public final void append(String str) {
        this.zzZi = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), this.zzZi, str);
    }

    public final String getText() {
        return this.zzZi;
    }

    public final com.aspose.words.internal.zzPM zzZr() {
        return this.zzYX;
    }
}
