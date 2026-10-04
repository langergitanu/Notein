package com.aspose.slides.internal.p080dd;

/* JADX INFO: renamed from: com.aspose.slides.internal.dd.v4 */
/* JADX INFO: loaded from: classes3.dex */
class C3147v4 extends AbstractC3150x6 {

    /* JADX INFO: renamed from: k4 */
    private AbstractC3150x6 f9324k4;

    /* JADX INFO: renamed from: x1 */
    private final Object f9325x1 = new Object();

    public C3147v4(AbstractC3150x6 abstractC3150x6) {
        this.f9324k4 = abstractC3150x6;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        boolean zCanRead;
        synchronized (this.f9325x1) {
            zCanRead = this.f9324k4.canRead();
        }
        return zCanRead;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        boolean zCanSeek;
        synchronized (this.f9325x1) {
            zCanSeek = this.f9324k4.canSeek();
        }
        return zCanSeek;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        boolean zCanWrite;
        synchronized (this.f9325x1) {
            zCanWrite = this.f9324k4.canWrite();
        }
        return zCanWrite;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
        synchronized (this.f9325x1) {
            this.f9324k4.flush();
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        long length;
        synchronized (this.f9325x1) {
            length = this.f9324k4.getLength();
        }
        return length;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        long position;
        synchronized (this.f9325x1) {
            position = this.f9324k4.getPosition();
        }
        return position;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        int i3;
        synchronized (this.f9325x1) {
            i3 = this.f9324k4.read(bArr, i, i2);
        }
        return i3;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int readByte() {
        int i;
        synchronized (this.f9325x1) {
            i = this.f9324k4.readByte();
        }
        return i;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long seek(long j, int i) {
        long jSeek;
        synchronized (this.f9325x1) {
            jSeek = this.f9324k4.seek(j, i);
        }
        return jSeek;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setLength(long j) {
        synchronized (this.f9325x1) {
            this.f9324k4.setLength(j);
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setPosition(long j) {
        synchronized (this.f9325x1) {
            this.f9324k4.setPosition(j);
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        synchronized (this.f9325x1) {
            this.f9324k4.write(bArr, i, i2);
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void writeByte(byte b) {
        synchronized (this.f9325x1) {
            this.f9324k4.writeByte(b);
        }
    }
}
