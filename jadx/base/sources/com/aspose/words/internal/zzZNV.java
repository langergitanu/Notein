package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZNV {
    static zzZNV zzZWa = new zzZNV("", 0, false);
    private String mValue;
    private int zzWz;
    private boolean zzZW9;

    public zzZNV(String str, int i, boolean z) {
        this.mValue = str;
        this.zzWz = i;
        this.zzZW9 = z;
    }

    public final int getIndex() {
        return this.zzWz;
    }

    public final int getLength() {
        return this.mValue.length();
    }

    public final String getValue() {
        return this.mValue;
    }

    public final boolean zzhL() {
        return this.zzZW9;
    }
}
