package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZSP {
    private DocSaveOptions zzYJ8;
    private com.aspose.words.internal.zzZOW zzYJ9;

    public zzZSP(com.aspose.words.internal.zzZOW zzzow, DocSaveOptions docSaveOptions) {
        this.zzYJ9 = zzzow;
        this.zzYJ8 = docSaveOptions;
    }

    public final void write(byte[] bArr) throws Exception {
        this.zzYJ9.writeBytes(bArr);
    }

    public final void zzDY(int i) throws Exception {
        this.zzYJ9.zzk(i);
    }

    public final void zzI(short s) throws Exception {
        this.zzYJ9.zzK(s);
    }

    public final com.aspose.words.internal.zzZOW zzZi3() {
        return this.zzYJ9;
    }

    public final DocSaveOptions zzZqQ() {
        return this.zzYJ8;
    }

    public final com.aspose.words.internal.zzZOP zzq() throws Exception {
        return this.zzYJ9.zzq();
    }

    public final void zzr(byte b) throws Exception {
        this.zzYJ9.writeByte(b);
    }

    public final void write(int i) throws Exception {
        this.zzYJ9.zzl(i);
    }

    public final void write(byte[] bArr, int i, int i2) throws Exception {
        this.zzYJ9.zzV(bArr, i, i2);
    }
}
