package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzYRC implements zzYRD {
    private final boolean zzVWZ;
    private final char[] zzVX1;

    public zzYRC(char[] cArr) {
        this(cArr, false);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PKCS12";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return (this.zzVWZ && this.zzVX1.length == 0) ? new byte[2] : zzZ4I.PKCS12.zzI(this.zzVX1);
    }

    @Override // java.security.Key
    public String getFormat() {
        return zzZ4I.PKCS12.getType();
    }

    public char[] getPassword() {
        return this.zzVX1;
    }

    public zzYRC(char[] cArr, boolean z) {
        cArr = cArr == null ? new char[0] : cArr;
        char[] cArr2 = new char[cArr.length];
        this.zzVX1 = cArr2;
        this.zzVWZ = z;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }
}
