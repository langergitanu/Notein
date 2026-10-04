package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzZN4 {
    public static final zzZN4 zzZV6 = new zzZN4("");
    private final String name;
    private final int zzZV4;
    private String zzZV5;

    public zzZN4(String str) {
        str = str == null ? "" : str;
        this.name = str;
        String str2 = this.zzZV5;
        this.zzZV5 = str2 != null ? str2 : "";
        this.zzZV4 = str.hashCode() ^ this.zzZV5.hashCode();
    }

    public final String getName() {
        return this.name;
    }

    public final String getNamespace() {
        return this.zzZV5;
    }

    public final boolean isEmpty() {
        String str = this.name;
        return str == null || str.trim().length() == 0;
    }

    public String toString() {
        return this.name;
    }

    public zzZN4(String str, String str2) {
        str = str == null ? "" : str;
        this.name = str;
        this.zzZV5 = str2 == null ? "" : str2;
        this.zzZV4 = str.hashCode() ^ this.zzZV5.hashCode();
    }
}
