package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYG6 {
    private String name;
    private String value;

    private static boolean zzXm(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    private static int zzw9(String str) {
        if (str == null) {
            return 1;
        }
        return str.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzYG6)) {
            return false;
        }
        zzYG6 zzyg6 = (zzYG6) obj;
        if (zzyg6 != this) {
            return zzXm(this.name, zzyg6.name) && zzXm(this.value, zzyg6.value);
        }
        return true;
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        return (zzw9(this.value) * 31) + zzw9(this.name);
    }
}
