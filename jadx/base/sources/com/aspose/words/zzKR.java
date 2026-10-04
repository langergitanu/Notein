package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzKR implements Cloneable {
    private String mName;
    private String mValue;
    private String zzkB;

    public zzKR(String str, String str2, String str3) {
        this.mName = str;
        this.zzkB = str2;
        this.mValue = str3;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String getName() {
        return this.mName;
    }

    public final String getUri() {
        return this.zzkB;
    }

    public final String getValue() {
        return this.mValue;
    }

    public final void setValue(String str) {
        this.mValue = str;
    }

    public final zzKR zzZTL() {
        return (zzKR) memberwiseClone();
    }
}
