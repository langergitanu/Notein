package com.aspose.words.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZHI {
    public static final Comparator<zzZHI> zzZGK = new Comparator<zzZHI>() { // from class: com.aspose.words.internal.zzZHI.1
        private static int zzZ(zzZHI zzzhi, zzZHI zzzhi2) {
            return zzzhi.getName().compareTo(zzzhi2.getName());
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(zzZHI zzzhi, zzZHI zzzhi2) {
            return zzZ(zzzhi, zzzhi2);
        }
    };
    private final String name;
    private final String value;
    private final boolean zzZGJ;
    private final String zzZUD;

    public zzZHI(String str, String str2) {
        this(null, str, str2);
    }

    public final String getName() {
        return this.name;
    }

    public final String getNamespace() {
        return this.zzZUD;
    }

    public final String getValue() {
        return this.value;
    }

    public final String toString() {
        return "ns=" + this.zzZUD + ", name=" + this.name + ", value=" + this.value;
    }

    public final boolean zzc8() {
        return this.zzZGJ;
    }

    public zzZHI(String str, String str2, String str3) {
        this.zzZUD = str;
        this.name = str2;
        this.value = str3;
        this.zzZGJ = str != null;
    }
}
