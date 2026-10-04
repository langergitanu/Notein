package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY4L {
    private String[] zzX1G;
    private String zzZi;

    public zzY4L(String[] strArr, String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.zzX1G = strArr;
        this.zzZi = str;
    }

    public final String getText() {
        return this.zzZi;
    }

    public final String[] zzXUB() {
        return this.zzX1G;
    }

    public zzY4L(String str, String str2) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        com.aspose.words.internal.zzZYD.zzXk(str2);
        this.zzX1G = new String[]{str};
        this.zzZi = str2;
    }
}
