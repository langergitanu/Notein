package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZDS {
    private String mName;

    public zzZDS(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.mName = str;
    }

    public final String getName() {
        return this.mName;
    }

    public abstract String getValue();

    public void zzZ(zzZI0 zzzi0) {
        zzzi0.zzX(this.mName, getValue());
    }
}
