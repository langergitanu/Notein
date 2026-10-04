package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzK extends zzL {
    private String zzZR;
    private String zzZS;
    private byte[] zzZT;

    public zzK(zzZQ4 zzzq4, byte[] bArr, String str, String str2) {
        super(zzzq4);
        this.zzZS = str;
        this.zzZR = str2;
        this.zzZT = bArr;
    }

    public final String getContentType() {
        return this.zzZR;
    }

    public final String getFileName() {
        return this.zzZS;
    }

    @Override // com.aspose.words.internal.zzL
    public final int getType() {
        return 2;
    }

    @Override // com.aspose.words.internal.zzL
    public final zzL zz0() {
        zzK zzk = new zzK(zzZZ(), this.zzZT, this.zzZS, this.zzZR);
        zzk.zzO(zzZY());
        return zzk;
    }

    public final byte[] zzZX() {
        return this.zzZT;
    }
}
