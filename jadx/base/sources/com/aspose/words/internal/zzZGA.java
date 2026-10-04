package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZGA {
    public final String toString() {
        return toString(", ");
    }

    public abstract void zzQ(StringBuilder sb, String str);

    public abstract boolean zzX(zzZDZ zzzdz);

    public abstract boolean zzXO0();

    public final String toString(String str) {
        StringBuilder sb = new StringBuilder();
        zzQ(sb, str);
        return sb.toString();
    }
}
