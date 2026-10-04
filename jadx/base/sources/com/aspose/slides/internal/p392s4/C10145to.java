package com.aspose.slides.internal.p392s4;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.s4.to */
/* JADX INFO: loaded from: classes4.dex */
public class C10145to extends AbstractC3150x6 {

    /* JADX INFO: renamed from: c5 */
    private C10144rv f36502c5;

    /* JADX INFO: renamed from: du */
    private final boolean f36503du;

    /* JADX INFO: renamed from: dy */
    private boolean f36504dy;

    /* JADX INFO: renamed from: h4 */
    private final int f36505h4;

    /* JADX INFO: renamed from: k4 */
    protected int f36506k4 = 8192;

    /* JADX INFO: renamed from: kk */
    protected AbstractC3150x6 f36507kk;

    /* JADX INFO: renamed from: m9 */
    private final boolean f36508m9;

    /* JADX INFO: renamed from: to */
    private C10147x1 f36509to;

    /* JADX INFO: renamed from: x1 */
    protected byte[] f36510x1;

    public C10145to(AbstractC3150x6 abstractC3150x6, int i, boolean z, boolean z2) {
        this.f36507kk = abstractC3150x6;
        this.f36503du = z2;
        this.f36505h4 = i;
        this.f36508m9 = z;
    }

    /* JADX INFO: renamed from: k4 */
    private C10144rv m49914k4() {
        if (this.f36502c5 == null) {
            C10144rv c10144rv = new C10144rv();
            this.f36502c5 = c10144rv;
            c10144rv.f36490ck = 0;
            c10144rv.m49905k4(this.f36505h4, this.f36508m9);
        }
        return this.f36502c5;
    }

    /* JADX INFO: renamed from: kk */
    private void m49915kk() {
        if (this.f36502c5 == null) {
            return;
        }
        while (true) {
            this.f36502c5.f36491du = m49916x1();
            C10144rv c10144rv = this.f36502c5;
            c10144rv.f36494h4 = 0;
            c10144rv.f36498m9 = this.f36510x1.length;
            int iM49906k4 = c10144rv.m49906k4(true);
            if (iM49906k4 != 1 && iM49906k4 != 0) {
                throw new InvalidOperationException(C14113y2.m67402k4("CompressorException: deflating error.", new Object[0]));
            }
            byte[] bArr = this.f36510x1;
            int length = bArr.length;
            int i = this.f36502c5.f36498m9;
            if (length - i > 0) {
                this.f36507kk.write(bArr, 0, bArr.length - i);
            }
            C10144rv c10144rv2 = this.f36502c5;
            if (c10144rv2.f36497kk == 0 && c10144rv2.f36498m9 != 0) {
                flush();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private byte[] m49916x1() {
        if (this.f36510x1 == null) {
            this.f36510x1 = new byte[this.f36506k4];
        }
        return this.f36510x1;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        return this.f36507kk.canRead();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        return this.f36507kk.canSeek();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        return this.f36507kk.canWrite();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void close() {
        if (this.f36507kk == null) {
            return;
        }
        try {
            m49915kk();
        } finally {
            if (m49914k4() != null) {
                this.f36502c5.m49911kk();
            }
            if (!this.f36503du) {
                this.f36507kk.close();
            }
            this.f36507kk = null;
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void dispose(boolean z) {
        if (this.f36504dy) {
            return;
        }
        if (z && this.f36507kk != null) {
            close();
        }
        this.f36504dy = true;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
        this.f36507kk.flush();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        return this.f36507kk.getLength();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long seek(long j, int i) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setLength(long j) {
        this.f36507kk.setLength(j);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setPosition(long j) {
        throw new NotImplementedException();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        C10147x1 c10147x1 = this.f36509to;
        if (c10147x1 != null) {
            c10147x1.m49918k4(bArr, i, i2);
        }
        if (i2 == 0) {
            return;
        }
        m49914k4().f36496k4 = bArr;
        C10144rv c10144rv = this.f36502c5;
        c10144rv.f36501x1 = i;
        c10144rv.f36497kk = i2;
        while (true) {
            this.f36502c5.f36491du = m49916x1();
            C10144rv c10144rv2 = this.f36502c5;
            c10144rv2.f36494h4 = 0;
            c10144rv2.f36498m9 = this.f36510x1.length;
            int iM49906k4 = c10144rv2.m49906k4(false);
            if (iM49906k4 != 0 && iM49906k4 != 1) {
                throw new InvalidOperationException(C14113y2.m67402k4("CompressorException: deflating error.", new Object[0]));
            }
            AbstractC3150x6 abstractC3150x6 = this.f36507kk;
            byte[] bArr2 = this.f36510x1;
            abstractC3150x6.write(bArr2, 0, bArr2.length - this.f36502c5.f36498m9);
            C10144rv c10144rv3 = this.f36502c5;
            if (c10144rv3.f36497kk == 0 && c10144rv3.f36498m9 != 0) {
                return;
            }
        }
    }
}
