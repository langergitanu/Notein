package com.aspose.slides.internal.p482wr;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p536z0.C13348k4;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.wr.c5 */
/* JADX INFO: loaded from: classes5.dex */
public class C12249c5 extends AbstractC3150x6 implements IDisposable {

    /* JADX INFO: renamed from: du */
    private long f40822du;

    /* JADX INFO: renamed from: k4 */
    private AbstractC3150x6 f40823k4;

    /* JADX INFO: renamed from: kk */
    private long f40824kk;

    /* JADX INFO: renamed from: to */
    private boolean f40825to;

    /* JADX INFO: renamed from: x1 */
    private C12263m9 f40826x1;

    public C12249c5(AbstractC3150x6 abstractC3150x6) {
        this(true, -99L, abstractC3150x6);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        return this.f40823k4.canRead();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        return this.f40823k4.canSeek();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        return this.f40823k4.canWrite();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void close() {
        super.close();
        if (this.f40825to) {
            return;
        }
        this.f40823k4.close();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6, com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        close();
        dispose(true);
        C14094ts.m67303k4(this);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
        this.f40823k4.flush();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        long j = this.f40824kk;
        return j == -99 ? this.f40823k4.getLength() : j;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        return this.f40826x1.m57376k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final long m57204k4() {
        return this.f40826x1.m57376k4();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        if (this.f40824kk != -99) {
            long jM57376k4 = this.f40826x1.m57376k4();
            long j = this.f40824kk;
            if (jM57376k4 >= j) {
                return 0;
            }
            long jM57376k42 = j - this.f40826x1.m57376k4();
            if (jM57376k42 < i2) {
                i2 = (int) jM57376k42;
            }
        }
        long j2 = this.f40822du;
        boolean z = j2 >= 0;
        if (z) {
            this.f40823k4.setPosition(j2);
        }
        int i3 = this.f40823k4.read(bArr, i, i2);
        if (i3 > 0) {
            this.f40826x1.m57377k4(bArr, i, i3);
        }
        if (z) {
            this.f40822du = this.f40823k4.getPosition();
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
        if (i2 > 0) {
            this.f40826x1.m57377k4(bArr, i, i2);
        }
        this.f40823k4.write(bArr, i, i2);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m57205x1() {
        return this.f40826x1.m57378x1();
    }

    public C12249c5(AbstractC3150x6 abstractC3150x6, long j) {
        this(true, j, abstractC3150x6);
        if (j < 0) {
            throw new ArgumentException("length");
        }
    }

    private C12249c5(boolean z, long j, AbstractC3150x6 abstractC3150x6) {
        this.f40824kk = -99L;
        this.f40823k4 = abstractC3150x6;
        this.f40826x1 = new C12263m9();
        this.f40824kk = j;
        this.f40825to = z;
        this.f40822du = C7019kk.m27469x1(abstractC3150x6, C13348k4.class) ? abstractC3150x6.getPosition() : -1L;
    }
}
