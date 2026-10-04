package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYM extends zzY87 {
    private int mLength;
    private byte[] zzTZ;
    private int zzUt;

    public zzYM(String str, String str2, byte[] bArr) {
        this(null, str, str2, bArr, 0, bArr.length);
    }

    @Override // com.aspose.words.zzY87
    public final com.aspose.words.internal.zzZOR zz9P() throws Exception {
        return new com.aspose.words.internal.zzZOR(this.zzTZ, this.zzUt, this.mLength, false, true);
    }

    public zzYM(String str, String str2, com.aspose.words.internal.zzZOR zzzor) throws Exception {
        this(null, str, str2, zzzor);
    }

    public zzYM(String str, String str2, byte[] bArr, int i, int i2) {
        this(null, str, str2, bArr, i, i2);
    }

    public zzYM(com.aspose.words.internal.zzZO0 zzzo0, String str, String str2, com.aspose.words.internal.zzZOR zzzor) throws Exception {
        this(zzzo0, str, str2, zzzor.zziA(), 0, zzzor.getLength());
    }

    public zzYM(com.aspose.words.internal.zzZO0 zzzo0, String str, String str2, byte[] bArr, int i, long j) {
        super(zzzo0, str, str2);
        this.zzTZ = bArr;
        this.zzUt = i;
        this.mLength = (int) j;
    }
}
