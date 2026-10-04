package com.aspose.slides.internal.p174hz;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p525yi.C12825ix;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.yj */
/* JADX INFO: loaded from: classes.dex */
public class C4775yj extends AbstractC3150x6 {

    /* JADX INFO: renamed from: c5 */
    private byte[] f13347c5;

    /* JADX INFO: renamed from: ck */
    private byte[] f13348ck;

    /* JADX INFO: renamed from: du */
    private boolean f13349du;

    /* JADX INFO: renamed from: dy */
    private boolean f13350dy;

    /* JADX INFO: renamed from: fa */
    private int f13351fa;

    /* JADX INFO: renamed from: h4 */
    private boolean f13352h4;

    /* JADX INFO: renamed from: jd */
    private int f13353jd;

    /* JADX INFO: renamed from: k4 */
    private AbstractC3150x6 f13354k4;

    /* JADX INFO: renamed from: kk */
    private int f13355kk;

    /* JADX INFO: renamed from: ks */
    private int f13356ks;

    /* JADX INFO: renamed from: m9 */
    private int f13357m9;

    /* JADX INFO: renamed from: to */
    private byte[] f13358to;

    /* JADX INFO: renamed from: up */
    private int f13359up;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC4752ts f13360x1;

    /* JADX INFO: renamed from: yj */
    private byte[] f13361yj;

    public C4775yj(AbstractC3150x6 abstractC3150x6, InterfaceC4752ts interfaceC4752ts, int i) {
        if (i == 0) {
            if (!abstractC3150x6.canRead()) {
                throw new ArgumentException(C12825ix.m59623k4("Can't read on stream"));
            }
        } else {
            if (i != 1) {
                throw new ArgumentException("ArgumentException", "mode");
            }
            if (!abstractC3150x6.canWrite()) {
                throw new ArgumentException(C12825ix.m59623k4("Can't write on stream"));
            }
        }
        this.f13354k4 = abstractC3150x6;
        this.f13360x1 = interfaceC4752ts;
        this.f13355kk = i;
        this.f13349du = false;
        if (interfaceC4752ts != null) {
            this.f13361yj = new byte[interfaceC4752ts.aq_()];
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canRead() {
        return this.f13355kk == 0;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canSeek() {
        return false;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public boolean canWrite() {
        return this.f13355kk == 1;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void dispose(boolean z) {
        if (this.f13349du) {
            return;
        }
        if (z) {
            if (!this.f13352h4) {
                m19834k4();
            }
            AbstractC3150x6 abstractC3150x6 = this.f13354k4;
            if (abstractC3150x6 != null) {
                abstractC3150x6.close();
            }
        }
        this.f13349du = true;
        byte[] bArr = this.f13361yj;
        if (bArr != null) {
            AbstractC14092to.m67225k4(bArr, 0, bArr.length);
        }
        byte[] bArr2 = this.f13358to;
        if (bArr2 != null) {
            AbstractC14092to.m67225k4(bArr2, 0, bArr2.length);
        }
        if (z) {
            this.f13354k4 = null;
            this.f13361yj = null;
            this.f13358to = null;
        }
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void flush() {
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getLength() {
        throw new NotSupportedException("Length");
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long getPosition() {
        throw new NotSupportedException("Position");
    }

    /* JADX INFO: renamed from: k4 */
    public void m19834k4() {
        if (this.f13352h4) {
            throw new NotSupportedException(C12825ix.m59623k4("This method cannot be called twice."));
        }
        if (this.f13349du) {
            throw new NotSupportedException(C12825ix.m59623k4("CryptoStream was disposed."));
        }
        this.f13352h4 = true;
        byte[] bArrMo19564k4 = this.f13360x1.mo19564k4(this.f13361yj, 0, this.f13357m9);
        AbstractC3150x6 abstractC3150x6 = this.f13354k4;
        if (abstractC3150x6 != null && this.f13355kk == 1) {
            abstractC3150x6.write(bArrMo19564k4, 0, bArrMo19564k4.length);
        }
        AbstractC3150x6 abstractC3150x62 = this.f13354k4;
        if (abstractC3150x62 instanceof C4775yj) {
            ((C4775yj) abstractC3150x62).m19834k4();
        } else {
            abstractC3150x62.flush();
        }
        AbstractC14092to.m67225k4(bArrMo19564k4, 0, bArrMo19564k4.length);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public int read(byte[] bArr, int i, int i2) {
        int iMo19562k4;
        if (this.f13355kk != 0) {
            throw new NotSupportedException(C12825ix.m59623k4("not in Read mode"));
        }
        if (i < 0) {
            throw new ArgumentException(C12825ix.m59623k4("negative"), "offset");
        }
        if (i2 < 0) {
            throw new ArgumentException(C12825ix.m59623k4("negative"), C18293o1.f55803f);
        }
        if (i > bArr.length - i2) {
            throw new ArgumentException("(offset+count)\r\nParameter name: " + C12825ix.m59623k4("buffer overflow"));
        }
        if (this.f13361yj == null || i2 == 0 || (this.f13351fa == this.f13359up && this.f13350dy)) {
            return 0;
        }
        if (this.f13347c5 == null) {
            this.f13348ck = new byte[this.f13360x1.ar_() << 2];
            this.f13351fa = 0;
            this.f13359up = 0;
            byte[] bArr2 = new byte[this.f13360x1.aq_()];
            this.f13347c5 = bArr2;
            this.f13353jd = this.f13354k4.read(bArr2, 0, bArr2.length);
        }
        int i3 = 0;
        while (i2 > 0) {
            int i4 = this.f13359up - this.f13351fa;
            if (i4 < this.f13360x1.aq_()) {
                int i5 = this.f13354k4.read(this.f13361yj, 0, this.f13360x1.aq_());
                this.f13356ks = i5;
                boolean z = i5 < this.f13360x1.aq_();
                this.f13350dy = z;
                if (z) {
                    if (this.f13356ks > 0) {
                        InterfaceC4752ts interfaceC4752ts = this.f13360x1;
                        byte[] bArr3 = this.f13347c5;
                        iMo19562k4 = interfaceC4752ts.mo19562k4(bArr3, 0, bArr3.length, this.f13348ck, this.f13359up);
                        C14058fa.m66596k4(this.f13361yj, 0, this.f13347c5, 0, this.f13356ks);
                        this.f13353jd = this.f13356ks;
                        i4 += iMo19562k4;
                        this.f13359up += iMo19562k4;
                    } else {
                        iMo19562k4 = 0;
                    }
                    if (!this.f13352h4) {
                        byte[] bArrMo19564k4 = this.f13360x1.mo19564k4(this.f13347c5, 0, this.f13353jd);
                        int length = bArrMo19564k4.length;
                        C14058fa.m66596k4(bArrMo19564k4, 0, this.f13348ck, this.f13359up, bArrMo19564k4.length);
                        AbstractC14092to.m67225k4(bArrMo19564k4, 0, bArrMo19564k4.length);
                        this.f13352h4 = true;
                        iMo19562k4 = length;
                    }
                } else {
                    InterfaceC4752ts interfaceC4752ts2 = this.f13360x1;
                    byte[] bArr4 = this.f13347c5;
                    iMo19562k4 = interfaceC4752ts2.mo19562k4(bArr4, 0, bArr4.length, this.f13348ck, this.f13359up);
                    C14058fa.m66596k4(this.f13361yj, 0, this.f13347c5, 0, this.f13356ks);
                    this.f13353jd = this.f13356ks;
                }
                i4 += iMo19562k4;
                this.f13359up += iMo19562k4;
            }
            if (this.f13351fa > this.f13360x1.ar_()) {
                byte[] bArr5 = this.f13348ck;
                C14058fa.m66596k4(bArr5, this.f13351fa, bArr5, 0, i4);
                this.f13359up -= this.f13351fa;
                this.f13351fa = 0;
            }
            if (i2 < i4) {
                i4 = i2;
            }
            if (i4 > 0) {
                C14058fa.m66596k4(this.f13348ck, this.f13351fa, bArr, i, i4);
                this.f13351fa += i4;
                i3 += i4;
                i += i4;
                i2 -= i4;
            }
            if ((i4 != this.f13360x1.aq_() && this.f13353jd != this.f13360x1.aq_()) || this.f13350dy) {
                i2 = 0;
            }
        }
        return i3;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public long seek(long j, int i) {
        throw new NotSupportedException("Seek");
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setLength(long j) {
        throw new NotSupportedException("SetLength");
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void setPosition(long j) {
        throw new NotSupportedException("Position");
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        if (this.f13355kk != 1) {
            throw new NotSupportedException(C12825ix.m59623k4("not in Write mode"));
        }
        if (i < 0) {
            throw new ArgumentException(C12825ix.m59623k4("negative"), "offset");
        }
        if (i2 < 0) {
            throw new ArgumentException(C12825ix.m59623k4("negative"), C18293o1.f55803f);
        }
        if (i > bArr.length - i2) {
            throw new ArgumentException("(offset+count)\r\nParameter name: " + C12825ix.m59623k4("buffer overflow"));
        }
        if (this.f13354k4 == null) {
            throw new ArgumentNullException("inner stream was disposed");
        }
        int i5 = this.f13357m9;
        if (i5 <= 0 || i5 == this.f13360x1.aq_()) {
            i3 = i;
            i4 = i2;
        } else {
            int iAq_ = this.f13360x1.aq_();
            int i6 = this.f13357m9;
            int i7 = iAq_ - i6;
            if (i2 < i7) {
                i7 = i2;
            }
            C14058fa.m66596k4(bArr, i, this.f13361yj, i6, i7);
            this.f13357m9 += i7;
            int i8 = i + i7;
            int i9 = i2 - i7;
            i3 = i8;
            i4 = i9;
        }
        int i10 = i3;
        while (i4 > 0) {
            if (this.f13357m9 == this.f13360x1.aq_()) {
                if (this.f13358to == null) {
                    this.f13358to = new byte[this.f13360x1.ar_()];
                }
                this.f13354k4.write(this.f13358to, 0, this.f13360x1.mo19562k4(this.f13361yj, 0, this.f13357m9, this.f13358to, 0));
                this.f13357m9 = 0;
            }
            if (this.f13360x1.mo19566kk()) {
                int i11 = (~(this.f13360x1.aq_() - 1)) & i4;
                int iAq_2 = i4 & (this.f13360x1.aq_() - 1);
                int iAr_ = this.f13360x1.ar_() * ((i11 / this.f13360x1.aq_()) + 1);
                byte[] bArr2 = this.f13361yj;
                if (bArr2.length < iAr_) {
                    AbstractC14092to.m67225k4(bArr2, 0, bArr2.length);
                    this.f13361yj = new byte[iAr_];
                }
                if (i11 > 0) {
                    this.f13354k4.write(this.f13361yj, 0, this.f13360x1.mo19562k4(bArr, i3, i11, this.f13361yj, 0));
                }
                if (iAq_2 > 0) {
                    C14058fa.m66596k4(bArr, i2 - iAq_2, this.f13361yj, 0, iAq_2);
                }
                this.f13357m9 = iAq_2;
                i4 = 0;
            } else {
                int iMin = Math.min(this.f13360x1.aq_() - this.f13357m9, i4);
                C14058fa.m66596k4(bArr, i10, this.f13361yj, this.f13357m9, iMin);
                i10 += iMin;
                this.f13357m9 += iMin;
                i4 -= iMin;
            }
        }
    }
}
