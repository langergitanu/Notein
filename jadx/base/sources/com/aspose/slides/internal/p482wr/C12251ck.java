package com.aspose.slides.internal.p482wr;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.wr.ck */
/* JADX INFO: loaded from: classes5.dex */
public class C12251ck extends AbstractC3150x6 implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    public C12252dq f40827k4;

    /* JADX INFO: renamed from: kk */
    private long f40828kk;

    /* JADX INFO: renamed from: x1 */
    private boolean f40829x1;

    public C12251ck(AbstractC3150x6 abstractC3150x6, int i, int i2, boolean z) {
        this.f40827k4 = new C12252dq(abstractC3150x6, i, i2, 1951, z);
        this.f40828kk = (abstractC3150x6 == null || !abstractC3150x6.canSeek()) ? -1L : abstractC3150x6.getPosition();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        if (this.f40829x1) {
            throw new ObjectDisposedException("DeflateStream");
        }
        return this.f40827k4.f40831ck.canRead();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        return false;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        if (this.f40829x1) {
            throw new ObjectDisposedException("DeflateStream");
        }
        return this.f40827k4.f40831ck.canWrite();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void close() {
        m57207k4(true);
        C14094ts.m67303k4(this);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6, com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        m57207k4(true);
        C14094ts.m67303k4(this);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
        if (this.f40829x1) {
            throw new ObjectDisposedException("DeflateStream");
        }
        this.f40827k4.flush();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        C12252dq c12252dq = this.f40827k4;
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
    public final void m57206k4(int i) {
        if (this.f40829x1) {
            throw new ObjectDisposedException("DeflateStream");
        }
        C12252dq c12252dq = this.f40827k4;
        if (c12252dq.f40833dy != null) {
            throw new C12250c6("The working buffer is already set.");
        }
        if (i < 128) {
            throw new C12250c6(C14113y2.m67402k4("Don't be silly. {0} bytes?? Use a bigger buffer.", Integer.valueOf(i)));
        }
        c12252dq.f40830c5 = i;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        if (this.f40829x1) {
            throw new ObjectDisposedException("DeflateStream");
        }
        long j = this.f40828kk;
        if (j >= 0) {
            this.f40827k4.setPosition(j);
        }
        int i3 = this.f40827k4.read(bArr, i, i2);
        if (this.f40828kk >= 0) {
            this.f40828kk = this.f40827k4.getPosition();
        }
        return i3;
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
        if (this.f40829x1) {
            throw new ObjectDisposedException("DeflateStream");
        }
        this.f40827k4.write(bArr, i, i2);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m57208x1(int i) {
        if (this.f40829x1) {
            throw new ObjectDisposedException("DeflateStream");
        }
        this.f40827k4.f40834fa = i;
    }

    public C12251ck(AbstractC3150x6 abstractC3150x6, int i, boolean z) {
        this(abstractC3150x6, i, 6, z);
    }

    /* JADX INFO: renamed from: k4 */
    public void m57207k4(boolean z) {
        C12252dq c12252dq;
        if (this.f40829x1) {
            return;
        }
        if (z && (c12252dq = this.f40827k4) != null) {
            c12252dq.close();
        }
        this.f40829x1 = true;
    }
}
