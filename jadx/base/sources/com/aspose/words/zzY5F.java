package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY5F implements Cloneable {
    private String zzX2T;
    private String zzX2U;

    public zzY5F(String str, String str2) {
        this.zzX2U = str;
        this.zzX2T = str2;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String getScript() {
        return this.zzX2U;
    }

    public final String zzXVp() {
        return this.zzX2T;
    }

    public final zzY5F zzXVq() {
        return (zzY5F) memberwiseClone();
    }
}
