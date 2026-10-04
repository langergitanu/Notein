package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZOJ {
    private String mName;
    private int zzYAb;
    private int zzZCz;

    public zzZOJ(String str, int i, int i2) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "name");
        this.mName = str;
        this.zzYAb = i;
        this.zzZCz = i2;
    }

    public final int getFlags() {
        return this.zzZCz;
    }

    public final String getName() {
        return this.mName;
    }

    public final void zzCo(int i) {
        this.zzYAb = i;
    }

    public final int zzZaq() {
        return this.zzYAb;
    }
}
