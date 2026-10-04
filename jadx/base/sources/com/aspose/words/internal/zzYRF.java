package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYRF implements zzYRD {
    private final zzZ5O zzVX0;
    private final char[] zzVX1;

    public zzYRF(char[] cArr, zzZ5O zzz5o) {
        char[] cArr2 = new char[cArr.length];
        this.zzVX1 = cArr2;
        this.zzVX0 = zzz5o;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "PBKDF1";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.zzVX0.zzI(this.zzVX1);
    }

    @Override // java.security.Key
    public final String getFormat() {
        return this.zzVX0.getType();
    }
}
