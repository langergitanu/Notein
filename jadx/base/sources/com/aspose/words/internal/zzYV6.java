package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public enum zzYV6 {
    PKCS7("PKCS7", false),
    ISO10126_2("ISO10126-2", true),
    X923("X9.23", true),
    ISO7816_4("ISO7816-4", false),
    TBC("TBC", false),
    CS1("CS1", false),
    CS2("CS2", false),
    CS3("CS3", false);

    private final boolean zzVZC;
    private final String zzVZF;

    zzYV6(String str, boolean z) {
        this.zzVZF = str;
        this.zzVZC = z;
    }

    public final boolean zzXCL() {
        return this.zzVZC;
    }

    public final String zzXCN() {
        return this.zzVZF;
    }
}
