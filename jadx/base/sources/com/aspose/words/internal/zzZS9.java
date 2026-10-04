package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZS9 {
    private zzEG zz5D;
    private byte[] zzP;
    private String zzkB;

    public zzZS9(String str, zzEG zzeg, byte[] bArr) {
        this.zzkB = str;
        this.zz5D = zzeg;
        this.zzP = bArr;
    }

    public final byte[] getImageBytes() {
        return this.zzP;
    }

    public final String getUri() {
        return this.zzkB;
    }

    public final zzEG zzm4() {
        return this.zz5D;
    }
}
