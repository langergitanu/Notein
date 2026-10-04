package com.aspose.words.internal;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZNZ {
    public final String zzZWe;
    public final int zzZWf;
    public final String zzZWg;
    public final String zzZWh;
    public final String zzZWi;
    public final String zzZWj;
    public final int zzZWk;

    public zzZNZ(int i, String str) {
        this(i, str, str, str, str, 1252);
    }

    public final boolean zzhN() {
        return Charset.isSupported(this.zzZWe) || Charset.isSupported(this.zzZWj) || Charset.isSupported(this.zzZWi) || Charset.isSupported(this.zzZWh) || Charset.isSupported(this.zzZWg);
    }

    public zzZNZ(int i, String str, String str2, String str3, String str4, int i2) {
        this(i, str, str2, str3, str4, i2, str);
    }

    public zzZNZ(int i, String str, String str2, String str3, String str4, int i2, String str5) {
        this.zzZWk = i;
        this.zzZWj = str;
        this.zzZWi = str2;
        this.zzZWh = str3;
        this.zzZWg = str4;
        this.zzZWf = i2;
        this.zzZWe = str5 != null ? str5 : str;
    }
}
