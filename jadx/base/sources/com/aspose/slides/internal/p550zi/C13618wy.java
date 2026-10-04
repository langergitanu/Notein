package com.aspose.slides.internal.p550zi;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.wy */
/* JADX INFO: loaded from: classes5.dex */
public class C13618wy extends C13614up {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC3150x6 f45221k4;

    /* JADX INFO: renamed from: kk */
    private final long f45222kk;

    /* JADX INFO: renamed from: x1 */
    private final boolean f45223x1;

    public C13618wy(AbstractC3150x6 abstractC3150x6) {
        this(abstractC3150x6, false);
    }

    /* JADX INFO: renamed from: up */
    private void m62846up() {
        if (this.f45223x1) {
            m62850fa();
            try {
                this.f45221k4.dispose();
            } finally {
                m62848ck();
            }
        }
    }

    /* JADX INFO: renamed from: c5 */
    public int m62847c5() {
        m62823m9();
        return this.f45221k4.readByte();
    }

    /* JADX INFO: renamed from: ck */
    public void m62848ck() {
    }

    /* JADX INFO: renamed from: dy */
    public byte[] m62849dy() {
        m62823m9();
        return m62858k4(0L, m62859kk());
    }

    /* JADX INFO: renamed from: fa */
    public void m62850fa() {
    }

    /* JADX INFO: renamed from: jd */
    public void m62851jd() {
        m62823m9();
        this.f45221k4.seek(this.f45222kk, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public int m62852k4(byte[] bArr, int i, int i2) {
        m62823m9();
        return this.f45221k4.read(bArr, i, i2);
    }

    /* JADX INFO: renamed from: kk */
    public long m62859kk() {
        m62823m9();
        return this.f45221k4.getLength() - this.f45222kk;
    }

    @Override // com.aspose.slides.internal.p550zi.C13614up
    /* JADX INFO: renamed from: to */
    public void mo24306to() {
        try {
            m62846up();
        } finally {
            super.mo24306to();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public int m62860x1(byte[] bArr) {
        m62823m9();
        if (bArr != null) {
            return this.f45221k4.read(bArr, 0, bArr.length);
        }
        throw new ArgumentNullException("bytes");
    }

    public C13618wy(AbstractC3150x6 abstractC3150x6, boolean z) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream");
        }
        this.f45221k4 = abstractC3150x6;
        this.f45223x1 = z;
        this.f45222kk = abstractC3150x6.getPosition();
    }

    /* JADX INFO: renamed from: k4 */
    public long m62853k4() {
        m62823m9();
        return this.f45221k4.getPosition() - this.f45222kk;
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC3150x6 m62861x1() {
        m62823m9();
        return this.f45221k4;
    }

    /* JADX INFO: renamed from: k4 */
    public long m62854k4(long j, int i) {
        m62823m9();
        AbstractC3150x6 abstractC3150x6 = this.f45221k4;
        if (i == 0) {
            j += this.f45222kk;
        }
        abstractC3150x6.seek(j, i);
        return m62853k4();
    }

    /* JADX INFO: renamed from: x1 */
    public void m62862x1(long j) {
        m62823m9();
        this.f45221k4.setLength(j + this.f45222kk);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC3150x6 m62845k4(C13618wy c13618wy) {
        if (c13618wy != null) {
            return c13618wy.f45221k4;
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public void m62863x1(byte[] bArr, int i, int i2) {
        m62823m9();
        this.f45221k4.write(bArr, i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public void m62855k4(byte b) {
        m62823m9();
        this.f45221k4.writeByte(b);
    }

    /* JADX INFO: renamed from: k4 */
    public void m62856k4(long j) {
        m62823m9();
        this.f45221k4.setPosition(j + this.f45222kk);
    }

    /* JADX INFO: renamed from: k4 */
    public void m62857k4(byte[] bArr) {
        m62823m9();
        if (bArr == null) {
            throw new ArgumentNullException("bytes");
        }
        this.f45221k4.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m62858k4(long j, long j2) {
        m62823m9();
        if (j >= m62859kk() || j < 0) {
            throw new ArgumentOutOfRangeException(RequestParameters.POSITION, "The starting position is out of stream bounds.");
        }
        if (j2 > m62859kk()) {
            throw new ArgumentOutOfRangeException("bytesCount", "The stream does not contain so many bytes.");
        }
        if (j2 + j > m62859kk() && j2 > 0) {
            throw new ArgumentException("Reading so many bytes will cause passing the stream end.");
        }
        if (this.f45221k4.canSeek()) {
            m62856k4(j);
        } else if (m62853k4() != j) {
            throw new IllegalStateException("Cannot seek to the desired position. The stream does not support seeking.");
        }
        byte[] bArr = new byte[(int) j2];
        byte[] bArr2 = new byte[4096];
        long j3 = 0;
        while (j2 > 0) {
            int iM67492kk = (int) C14116yg.m67492kk(4096, j2);
            if (this.f45221k4.read(bArr2, 0, iM67492kk) != iM67492kk) {
                throw new IllegalStateException(C14113y2.m67408k4("Copy operation cannot complete. Cannot read ", C14057f9.m66591x1(iM67492kk), " bytes."));
            }
            System.arraycopy(bArr2, 0, bArr, (int) j3, iM67492kk);
            long j4 = iM67492kk;
            j3 += j4;
            j2 -= j4;
        }
        return bArr;
    }
}
