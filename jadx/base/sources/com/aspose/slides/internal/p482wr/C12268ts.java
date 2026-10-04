package com.aspose.slides.internal.p482wr;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.wr.ts */
/* JADX INFO: loaded from: classes5.dex */
public class C12268ts extends AbstractC3150x6 implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    public C12252dq f41030k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f41031x1;

    public C12268ts(AbstractC3150x6 abstractC3150x6, int i) {
        this(abstractC3150x6, i, 6, false);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        if (this.f41031x1) {
            throw new ObjectDisposedException("ZlibStream");
        }
        return this.f41030k4.f40831ck.canRead();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        return false;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        if (this.f41031x1) {
            throw new ObjectDisposedException("ZlibStream");
        }
        return this.f41030k4.f40831ck.canWrite();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void close() {
        m57383k4(true);
        C14094ts.m67303k4(this);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6, com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        m57383k4(true);
        C14094ts.m67303k4(this);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
        if (this.f41031x1) {
            throw new ObjectDisposedException("ZlibStream");
        }
        this.f41030k4.flush();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        C12252dq c12252dq = this.f41030k4;
        int i = c12252dq.f40845x1;
        if (i == 0) {
            return c12252dq.f40837k4.f41124dy;
        }
        if (i == 1) {
            return c12252dq.f40837k4.f41132to;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: k4 */
    public void m57383k4(boolean z) {
        C12252dq c12252dq;
        if (this.f41031x1) {
            return;
        }
        if (z && (c12252dq = this.f41030k4) != null) {
            c12252dq.close();
        }
        this.f41031x1 = true;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        if (this.f41031x1) {
            throw new ObjectDisposedException("ZlibStream");
        }
        return this.f41030k4.read(bArr, i, i2);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long seek(long j, int i) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setLength(long j) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setPosition(long j) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        if (this.f41031x1) {
            throw new ObjectDisposedException("ZlibStream");
        }
        this.f41030k4.write(bArr, i, i2);
    }

    public C12268ts(AbstractC3150x6 abstractC3150x6, int i, int i2, boolean z) {
        this.f41030k4 = new C12252dq(abstractC3150x6, i, i2, 1950, z);
    }

    public C12268ts(AbstractC3150x6 abstractC3150x6, int i, boolean z) {
        this(abstractC3150x6, i, 6, z);
    }
}
