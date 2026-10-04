package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.p559ms.System.AbstractC14078m9;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.InterfaceC14083qm;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.v6 */
/* JADX INFO: loaded from: classes5.dex */
public class C13999v6 extends AbstractC3150x6 {

    /* JADX INFO: renamed from: k4 */
    protected AbstractC3150x6 f47044k4;

    /* JADX INFO: renamed from: kk */
    private String f47045kk;

    /* JADX INFO: renamed from: x1 */
    private C13885dw f47046x1;

    public C13999v6(AbstractC3150x6 abstractC3150x6, C13885dw c13885dw, String str) {
        this.f47044k4 = abstractC3150x6;
        this.f47046x1 = c13885dw;
        this.f47045kk = str;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public InterfaceC14083qm beginRead(byte[] bArr, int i, int i2, AbstractC14078m9 abstractC14078m9, Object obj) {
        return this.f47044k4.beginRead(bArr, i, i2, abstractC14078m9, obj);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public InterfaceC14083qm beginWrite(byte[] bArr, int i, int i2, AbstractC14078m9 abstractC14078m9, Object obj) {
        return this.f47044k4.beginWrite(bArr, i, i2, abstractC14078m9, obj);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        return this.f47044k4.canRead();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        return this.f47044k4.canSeek();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        return this.f47044k4.canWrite();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void dispose(boolean z) {
        if (z) {
            try {
                if (this.f47044k4 != null) {
                    C13885dw c13885dw = this.f47046x1;
                    if (c13885dw != null) {
                        c13885dw.m65272k4(this.f47045kk);
                    }
                    this.f47044k4.close();
                }
            } catch (Throwable th) {
                super.dispose(z);
                throw th;
            }
        }
        this.f47044k4 = null;
        C14094ts.m67303k4(this);
        super.dispose(z);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int endRead(InterfaceC14083qm interfaceC14083qm) {
        return this.f47044k4.endRead(interfaceC14083qm);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void endWrite(InterfaceC14083qm interfaceC14083qm) {
        this.f47044k4.endWrite(interfaceC14083qm);
    }

    public void finalize() throws Throwable {
        try {
            C13885dw c13885dw = this.f47046x1;
            if (c13885dw != null) {
                c13885dw.m65272k4(this.f47045kk);
            }
            this.f47044k4 = null;
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
        this.f47044k4.flush();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        return this.f47044k4.getLength();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        return this.f47044k4.getPosition();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        return this.f47044k4.read(bArr, i, i2);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int readByte() {
        return this.f47044k4.readByte();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long seek(long j, int i) {
        return this.f47044k4.seek(j, i);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setLength(long j) {
        this.f47044k4.setLength(j);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setPosition(long j) {
        this.f47044k4.setPosition(j);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        this.f47044k4.write(bArr, i, i2);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void writeByte(byte b) {
        this.f47044k4.writeByte(b);
    }
}
