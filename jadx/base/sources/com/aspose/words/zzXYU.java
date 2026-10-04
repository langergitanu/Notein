package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzXYU implements Cloneable {
    private String zzWS4;
    private String zzWS5;
    private String zzWS6;
    private String zzkB;

    public zzXYU(String str, String str2, String str3, String str4) {
        com.aspose.words.internal.zzZ4.zzU(str, "uri");
        this.zzkB = str;
        this.zzWS6 = str2;
        this.zzWS5 = str3;
        this.zzWS4 = str4;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final zzXYU zzXQB() {
        return (zzXYU) memberwiseClone();
    }
}
