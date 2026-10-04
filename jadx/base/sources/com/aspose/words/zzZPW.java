package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZPW {
    private zzZ47 zzYDc;
    private zzYEF zzYDd;
    private String zzZi;

    public zzZPW(String str, zzYEF zzyef) {
        this.zzZi = str;
        this.zzYDd = zzyef;
    }

    public final String getText() {
        return this.zzZi;
    }

    public final boolean hasText() {
        return com.aspose.words.internal.zzZYD.zzXk(this.zzZi);
    }

    public final zzZ47 zzZcV() {
        return this.zzYDc;
    }

    public final boolean zzZcW() {
        return this.zzYDd != null;
    }

    public final zzYEF zzZcX() {
        return this.zzYDd;
    }

    public zzZPW(String str, zzYEF zzyef, zzZ47 zzz47) {
        this(str, zzyef);
        this.zzYDc = zzz47.zzYO2();
    }
}
