package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYRE implements zzYRD {
    private final zzZ5O zzVX0;
    private final char[] zzVX1;

    public zzYRE(char[] cArr, zzZ5O zzz5o) {
        this.zzVX1 = (char[]) cArr.clone();
        this.zzVX0 = zzz5o;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "PBKDF2";
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
