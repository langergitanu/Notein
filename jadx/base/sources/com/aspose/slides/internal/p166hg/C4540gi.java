package com.aspose.slides.internal.p166hg;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hg.gi */
/* JADX INFO: loaded from: classes.dex */
public class C4540gi extends AbstractC3150x6 {

    /* JADX INFO: renamed from: k4 */
    private boolean f12672k4;

    /* JADX INFO: renamed from: kk */
    private C3152yj f12673kk;

    /* JADX INFO: renamed from: to */
    private byte[] f12674to;

    /* JADX INFO: renamed from: x1 */
    private boolean f12675x1;

    public C4540gi() {
        this.f12673kk = new C3152yj(0);
        this.f12672k4 = false;
        this.f12675x1 = true;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        return this.f12672k4;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        return this.f12673kk.canSeek();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        return this.f12675x1;
    }

    /* JADX INFO: renamed from: du */
    public void m18738du() {
        this.f12673kk.setLength(0L);
        this.f12673kk.setPosition(0L);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
        this.f12673kk.flush();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        return this.f12673kk.getLength();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        return this.f12673kk.getPosition();
    }

    /* JADX INFO: renamed from: h4 */
    public byte[] m18739h4() {
        return this.f12673kk.toArray();
    }

    /* JADX INFO: renamed from: k4 */
    public void m18740k4(byte b) {
        if (this.f12674to == null) {
            this.f12674to = new byte[4];
        }
        byte[] bArr = this.f12674to;
        bArr[0] = b;
        write(bArr, 0, 1);
    }

    /* JADX INFO: renamed from: kk */
    public short m18745kk() {
        byte[] bArrM18737to = m18737to(2);
        return C7019kk.m27468x1(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(bArrM18737to[1]), 6) | (C7019kk.m27462to(Byte.valueOf(bArrM18737to[0]), 6) << 8)), 9);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        if (this.f12672k4) {
            return this.f12673kk.read(bArr, i, i2);
        }
        throw new InvalidOperationException("Read operations are not allowed by this stream");
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long seek(long j, int i) {
        return this.f12673kk.seek(j, i);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setLength(long j) {
        this.f12673kk.setLength(j);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setPosition(long j) {
        this.f12673kk.setPosition(j);
    }

    /* JADX INFO: renamed from: to */
    public int m18747to() {
        byte[] bArrM18737to = m18737to(3);
        return C7019kk.m27462to(Byte.valueOf(bArrM18737to[2]), 6) | (C7019kk.m27462to(Byte.valueOf(bArrM18737to[0]), 6) << 16) | (C7019kk.m27462to(Byte.valueOf(bArrM18737to[1]), 6) << 8);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        if (!this.f12675x1) {
            throw new InvalidOperationException("Write operations are not allowed by this stream");
        }
        this.f12673kk.write(bArr, i, i2);
    }

    /* JADX INFO: renamed from: x1 */
    public byte m18748x1() {
        return m18737to(1)[0];
    }

    public C4540gi(byte[] bArr) {
        if (bArr != null) {
            this.f12673kk = new C3152yj(bArr);
        } else {
            this.f12673kk = new C3152yj();
        }
        this.f12672k4 = true;
        this.f12675x1 = false;
    }

    /* JADX INFO: renamed from: to */
    private byte[] m18737to(int i) {
        if (i > 4) {
            throw new ArgumentException("8 bytes maximum");
        }
        if (this.f12674to == null) {
            this.f12674to = new byte[4];
        }
        if (read(this.f12674to, 0, i) == i) {
            return this.f12674to;
        }
        throw new C4545k4(C14113y2.m67402k4("buffer underrun", new Object[0]));
    }

    /* JADX INFO: renamed from: k4 */
    public void m18741k4(short s) {
        if (this.f12674to == null) {
            this.f12674to = new byte[4];
        }
        this.f12674to[0] = C7019kk.m27442k4(Integer.valueOf(s >> 8), 9);
        this.f12674to[1] = C7019kk.m27442k4(Short.valueOf(s), 7);
        write(this.f12674to, 0, 2);
    }

    /* JADX INFO: renamed from: kk */
    public void m18746kk(int i) {
        if (this.f12674to == null) {
            this.f12674to = new byte[4];
        }
        this.f12674to[0] = C7019kk.m27442k4(Integer.valueOf(i >> 24), 9);
        this.f12674to[1] = C7019kk.m27442k4(Integer.valueOf(i >> 16), 9);
        this.f12674to[2] = C7019kk.m27442k4(Integer.valueOf(i >> 8), 9);
        this.f12674to[3] = C7019kk.m27442k4(Integer.valueOf(i), 9);
        write(this.f12674to, 0, 4);
    }

    /* JADX INFO: renamed from: x1 */
    public void m18749x1(int i) {
        if (this.f12674to == null) {
            this.f12674to = new byte[4];
        }
        this.f12674to[0] = C7019kk.m27442k4(Integer.valueOf(i >> 16), 9);
        this.f12674to[1] = C7019kk.m27442k4(Integer.valueOf(i >> 8), 9);
        this.f12674to[2] = C7019kk.m27442k4(Integer.valueOf(i), 9);
        write(this.f12674to, 0, 3);
    }

    /* JADX INFO: renamed from: k4 */
    public void m18742k4(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m18743k4() {
        return getPosition() >= getLength();
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m18744k4(int i) {
        byte[] bArr = new byte[i];
        if (read(bArr, 0, i) == i) {
            return bArr;
        }
        throw new C4545k4("buffer underrun");
    }
}
