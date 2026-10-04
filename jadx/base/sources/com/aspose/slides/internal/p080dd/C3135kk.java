package com.aspose.slides.internal.p080dd;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: renamed from: com.aspose.slides.internal.dd.kk */
/* JADX INFO: loaded from: classes3.dex */
public final class C3135kk extends AbstractC3150x6 {

    /* JADX INFO: renamed from: du */
    private int f9288du;

    /* JADX INFO: renamed from: h4 */
    private int f9289h4;

    /* JADX INFO: renamed from: k4 */
    private AbstractC3150x6 f9290k4;

    /* JADX INFO: renamed from: kk */
    private int f9291kk;

    /* JADX INFO: renamed from: to */
    private int f9292to;

    /* JADX INFO: renamed from: x1 */
    private byte[] f9293x1;

    private C3135kk() {
    }

    /* JADX INFO: renamed from: du */
    private void m13388du() {
        throw new NotSupportedException("Read not supported");
    }

    /* JADX INFO: renamed from: h4 */
    private void m13389h4() {
        throw new NotSupportedException("Write not supported");
    }

    /* JADX INFO: renamed from: k4 */
    private void m13390k4() {
        if (this.f9291kk - this.f9292to != 0) {
            this.f9290k4.seek(r0 - r1, 1);
        }
        this.f9291kk = 0;
        this.f9292to = 0;
    }

    /* JADX INFO: renamed from: kk */
    private void m13391kk() {
        throw new ObjectDisposedException("stream", "Stream is closed");
    }

    /* JADX INFO: renamed from: to */
    private void m13392to() {
        throw new NotSupportedException("Seek not supported");
    }

    /* JADX INFO: renamed from: x1 */
    private void m13393x1() {
        this.f9290k4.write(this.f9293x1, 0, this.f9288du);
        this.f9288du = 0;
        this.f9290k4.flush();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        AbstractC3150x6 abstractC3150x6 = this.f9290k4;
        if (abstractC3150x6 != null) {
            return abstractC3150x6.canRead();
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        AbstractC3150x6 abstractC3150x6 = this.f9290k4;
        if (abstractC3150x6 != null) {
            return abstractC3150x6.canSeek();
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        AbstractC3150x6 abstractC3150x6 = this.f9290k4;
        if (abstractC3150x6 != null) {
            return abstractC3150x6.canWrite();
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void dispose(boolean z) {
        if (z) {
            try {
                if (this.f9290k4 != null) {
                    try {
                        flush();
                        this.f9290k4.close();
                    } catch (Throwable th) {
                        this.f9290k4.close();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                this.f9290k4 = null;
                this.f9293x1 = null;
                super.dispose(z);
                throw th2;
            }
        }
        this.f9290k4 = null;
        this.f9293x1 = null;
        super.dispose(z);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
        if (this.f9290k4 == null) {
            m13391kk();
        }
        if (this.f9288du > 0) {
            m13393x1();
        } else if (this.f9291kk < this.f9292to && this.f9290k4.canSeek()) {
            m13390k4();
        }
        this.f9291kk = 0;
        this.f9292to = 0;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        if (this.f9290k4 == null) {
            m13391kk();
        }
        if (this.f9288du > 0) {
            m13393x1();
        }
        return this.f9290k4.getLength();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        if (this.f9290k4 == null) {
            m13391kk();
        }
        if (!this.f9290k4.canSeek()) {
            m13392to();
        }
        return this.f9290k4.getPosition() + ((long) ((this.f9291kk - this.f9292to) + this.f9288du));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e A[RETURN] */
    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int read(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null) {
            throw new ArgumentNullException("array");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("offset", "value must be positive");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "value must be positive");
        }
        if (bArr.length - i < i2) {
            throw new ArgumentException("array.Length - offset < count");
        }
        if (this.f9290k4 == null) {
            m13391kk();
        }
        int i4 = this.f9292to - this.f9291kk;
        if (i4 != 0) {
            if (i4 > i2) {
                i4 = i2;
            }
            AbstractC14092to.m67226k4(this.f9293x1, this.f9291kk, bArr, i, i4);
            this.f9291kk += i4;
            if (i4 < i2) {
                return i4;
            }
            i3 = this.f9290k4.read(bArr, i + i4, i2 - i4) + i4;
        } else {
            if (!this.f9290k4.canRead()) {
                m13388du();
            }
            if (this.f9288du > 0) {
                m13393x1();
            }
            int i5 = this.f9289h4;
            if (i2 >= i5) {
                i3 = this.f9290k4.read(bArr, i, i2);
            } else {
                if (this.f9293x1 == null) {
                    this.f9293x1 = new byte[i5];
                }
                i4 = this.f9290k4.read(this.f9293x1, 0, i5);
                if (i4 == 0) {
                    return 0;
                }
                this.f9291kk = 0;
                this.f9292to = i4;
                if (i4 > i2) {
                }
                AbstractC14092to.m67226k4(this.f9293x1, this.f9291kk, bArr, i, i4);
                this.f9291kk += i4;
                if (i4 < i2) {
                }
            }
        }
        this.f9291kk = 0;
        this.f9292to = 0;
        return i3;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int readByte() {
        if (this.f9290k4 == null) {
            m13391kk();
        }
        if (this.f9292to == 0 && !this.f9290k4.canRead()) {
            m13388du();
        }
        if (this.f9291kk == this.f9292to) {
            if (this.f9288du > 0) {
                m13393x1();
            }
            if (this.f9293x1 == null) {
                this.f9293x1 = new byte[this.f9289h4];
            }
            this.f9292to = this.f9290k4.read(this.f9293x1, 0, this.f9289h4);
            this.f9291kk = 0;
        }
        int i = this.f9291kk;
        if (i == this.f9292to) {
            return -1;
        }
        byte[] bArr = this.f9293x1;
        this.f9291kk = i + 1;
        return bArr[i] & 255;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long seek(long j, int i) {
        if (this.f9290k4 == null) {
            m13391kk();
        }
        if (!this.f9290k4.canSeek()) {
            m13392to();
        }
        if (this.f9288du > 0) {
            m13393x1();
        } else if (i == 1) {
            j -= (long) (this.f9292to - this.f9291kk);
        }
        long position = this.f9290k4.getPosition() + ((long) (this.f9291kk - this.f9292to));
        long jSeek = this.f9290k4.seek(j, i);
        int i2 = this.f9292to;
        if (i2 > 0) {
            if (position == jSeek) {
                int i3 = this.f9291kk;
                if (i3 > 0) {
                    byte[] bArr = this.f9293x1;
                    AbstractC14092to.m67226k4(bArr, i3, bArr, 0, i2 - i3);
                    this.f9292to -= this.f9291kk;
                    this.f9291kk = 0;
                }
                int i4 = this.f9292to;
                if (i4 > 0) {
                    this.f9290k4.seek(i4, 1);
                    return jSeek;
                }
            } else {
                int i5 = this.f9291kk;
                if (position - ((long) i5) >= jSeek || jSeek >= (((long) i2) + position) - ((long) i5)) {
                    this.f9291kk = 0;
                    this.f9292to = 0;
                } else {
                    int i6 = (int) (jSeek - position);
                    byte[] bArr2 = this.f9293x1;
                    AbstractC14092to.m67226k4(bArr2, i5 + i6, bArr2, 0, i2 - (i5 + i6));
                    int i7 = this.f9292to - (this.f9291kk + i6);
                    this.f9292to = i7;
                    this.f9291kk = 0;
                    if (i7 > 0) {
                        this.f9290k4.seek(i7, 1);
                        return jSeek;
                    }
                }
            }
        }
        return jSeek;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setLength(long j) {
        if (j < 0) {
            throw new ArgumentOutOfRangeException("value", "value must be positive");
        }
        if (this.f9290k4 == null) {
            m13391kk();
        }
        if (!this.f9290k4.canSeek()) {
            m13392to();
        }
        if (!this.f9290k4.canWrite()) {
            m13389h4();
        }
        if (this.f9288du > 0) {
            m13393x1();
        } else if (this.f9291kk < this.f9292to) {
            m13390k4();
        }
        this.f9291kk = 0;
        this.f9292to = 0;
        this.f9290k4.setLength(j);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setPosition(long j) {
        if (j < 0) {
            throw new ArgumentOutOfRangeException("value", "value must be positive");
        }
        if (this.f9290k4 == null) {
            m13391kk();
        }
        if (!this.f9290k4.canSeek()) {
            m13392to();
        }
        if (this.f9288du > 0) {
            m13393x1();
        }
        this.f9291kk = 0;
        this.f9292to = 0;
        this.f9290k4.seek(j, 0);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new ArgumentNullException("array");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("offset", "value must be positive");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "value must be positive");
        }
        if (bArr.length - i < i2) {
            throw new ArgumentException("array.Length - offset < count");
        }
        if (this.f9290k4 == null) {
            m13391kk();
        }
        if (this.f9288du == 0) {
            if (!this.f9290k4.canWrite()) {
                m13389h4();
            }
            if (this.f9291kk < this.f9292to) {
                m13390k4();
            } else {
                this.f9291kk = 0;
                this.f9292to = 0;
            }
        }
        int i3 = this.f9288du;
        if (i3 > 0) {
            int i4 = this.f9289h4 - i3;
            if (i4 > 0) {
                if (i4 > i2) {
                    i4 = i2;
                }
                AbstractC14092to.m67226k4(bArr, i, this.f9293x1, i3, i4);
                this.f9288du += i4;
                if (i2 == i4) {
                    return;
                }
                i += i4;
                i2 -= i4;
            }
            this.f9290k4.write(this.f9293x1, 0, this.f9288du);
            this.f9288du = 0;
        }
        int i5 = this.f9289h4;
        if (i2 >= i5) {
            this.f9290k4.write(bArr, i, i2);
        } else {
            if (i2 == 0) {
                return;
            }
            if (this.f9293x1 == null) {
                this.f9293x1 = new byte[i5];
            }
            AbstractC14092to.m67226k4(bArr, i, this.f9293x1, 0, i2);
            this.f9288du = i2;
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void writeByte(byte b) {
        if (this.f9290k4 == null) {
            m13391kk();
        }
        if (this.f9288du == 0) {
            if (!this.f9290k4.canWrite()) {
                m13389h4();
            }
            if (this.f9291kk < this.f9292to) {
                m13390k4();
            } else {
                this.f9291kk = 0;
                this.f9292to = 0;
            }
            if (this.f9293x1 == null) {
                this.f9293x1 = new byte[this.f9289h4];
            }
        }
        if (this.f9288du == this.f9289h4) {
            m13393x1();
        }
        byte[] bArr = this.f9293x1;
        int i = this.f9288du;
        this.f9288du = i + 1;
        bArr[i] = b;
    }

    public C3135kk(AbstractC3150x6 abstractC3150x6, int i) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream");
        }
        if (i <= 0) {
            throw new ArgumentOutOfRangeException("bufferSize", "value must be positive");
        }
        this.f9290k4 = abstractC3150x6;
        this.f9289h4 = i;
        if (abstractC3150x6.canRead() || this.f9290k4.canWrite()) {
            return;
        }
        m13391kk();
    }
}
