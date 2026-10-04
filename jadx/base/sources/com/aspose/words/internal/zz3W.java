package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zz3W extends zzZOP {
    private zzZOP zzUs;

    public zz3W(zzZOP zzzop) {
        this.zzUs = zzzop;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final boolean canRead() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final boolean canWrite() {
        return true;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void close() {
    }

    @Override // com.aspose.words.internal.zzZOP
    public void flush() throws Exception {
        this.zzUs.flush();
    }

    @Override // com.aspose.words.internal.zzZOP
    public final long getLength() throws Exception {
        return this.zzUs.getLength();
    }

    @Override // com.aspose.words.internal.zzZOP
    public final long getPosition() throws Exception {
        return this.zzUs.getPosition();
    }

    @Override // com.aspose.words.internal.zzZOP
    public final int read(byte[] bArr, int i, int i2) {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void setLength(long j) {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.internal.zzZOP
    public void write(byte[] bArr, int i, int i2) throws Exception {
        this.zzUs.write(bArr, i, i2);
    }

    @Override // com.aspose.words.internal.zzZOP
    public void writeByte(byte b) throws Exception {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.internal.zzZOP
    public final void zzH(long j) {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.internal.zzZOP
    public final boolean zzRG() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZOP
    public final int zzRI() {
        throw new IllegalStateException();
    }

    @Override // com.aspose.words.internal.zzZOP
    public final long zzU(long j, int i) {
        throw new IllegalStateException();
    }

    public final zzZOP zzuy() {
        return this.zzUs;
    }
}
