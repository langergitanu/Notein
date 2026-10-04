package com.aspose.slides.internal.p456v5;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p174hz.C4717gi;
import com.aspose.slides.internal.p174hz.C4743qw;
import com.aspose.slides.internal.p174hz.InterfaceC4752ts;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.v5.kk */
/* JADX INFO: loaded from: classes4.dex */
public final class C11608kk implements InterfaceC4752ts {

    /* JADX INFO: renamed from: du */
    private byte[] f39181du;

    /* JADX INFO: renamed from: h4 */
    private byte[] f39182h4;

    /* JADX INFO: renamed from: k4 */
    private final int f39183k4;

    /* JADX INFO: renamed from: kk */
    private final boolean f39184kk;

    /* JADX INFO: renamed from: to */
    private final byte[] f39185to;

    /* JADX INFO: renamed from: x1 */
    private final int f39186x1;

    public C11608kk(byte[] bArr, byte[] bArr2, int i, int i2, boolean z) {
        this.f39185to = bArr;
        this.f39181du = bArr2;
        this.f39183k4 = i;
        this.f39186x1 = i2;
        this.f39184kk = z;
    }

    /* JADX INFO: renamed from: du */
    private void m54677du() {
        this.f39182h4 = null;
    }

    /* JADX INFO: renamed from: kk */
    private void m54680kk(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return;
        }
        int i3 = this.f39183k4;
        if (i3 == 1) {
            this.f39181du = C11611x1.m54711x1(bArr, i, i2, this.f39185to, this.f39181du);
        } else {
            if (i3 != 2) {
                throw new NotSupportedException("The specified cipher mode is not supported.");
            }
            C11611x1.m54710x1(bArr, i, i2, this.f39185to);
        }
    }

    /* JADX INFO: renamed from: to */
    private void m54681to(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new ArgumentNullException("inputBuffer");
        }
        if (i < 0 || i >= bArr.length) {
            throw new ArgumentOutOfRangeException("inputOffset");
        }
        if (i2 < 0 || i + i2 > bArr.length) {
            throw new ArgumentOutOfRangeException("inputCount");
        }
        if (i2 % aq_() != 0) {
            if (!this.f39184kk || this.f39186x1 == 1) {
                throw new CryptographicException("The input data is not a complete block.");
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m54682x1(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return;
        }
        int i3 = this.f39183k4;
        if (i3 == 1) {
            this.f39181du = C11611x1.m54702k4(bArr, i, i2, this.f39185to, this.f39181du);
        } else {
            if (i3 != 2) {
                throw new NotSupportedException("The specified cipher mode is not supported.");
            }
            C11611x1.m54698k4(bArr, i, i2, this.f39185to);
        }
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    public final boolean ap_() {
        return true;
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    public final int aq_() {
        return C11611x1.m54695k4() / 8;
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    public final int ar_() {
        return C11611x1.m54695k4() / 8;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    /* JADX INFO: renamed from: k4 */
    public final int mo19562k4(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        m54683x1(bArr, i, i2, bArr2, i3);
        if (this.f39184kk) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            m54682x1(bArr2, i3, i2);
            return i2;
        }
        int i4 = this.f39186x1;
        if (i4 == 1 || i4 == 3) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            m54680kk(bArr2, i3, i2);
            return i2;
        }
        byte[] bArr3 = this.f39182h4;
        if (bArr3 == null) {
            int iAq_ = i2 - aq_();
            this.f39182h4 = new byte[aq_()];
            System.arraycopy(bArr, i, bArr2, i3, iAq_);
            System.arraycopy(bArr, i + iAq_, this.f39182h4, 0, aq_());
            m54680kk(bArr2, i3, iAq_);
            return iAq_;
        }
        System.arraycopy(bArr3, 0, bArr2, i3, aq_());
        int iAq_2 = i2 - aq_();
        System.arraycopy(bArr, i, bArr2, aq_() + i3, iAq_2);
        System.arraycopy(bArr, i + iAq_2, this.f39182h4, 0, aq_());
        int iAq_3 = aq_() + iAq_2;
        m54680kk(bArr2, i3, iAq_3);
        return iAq_3;
    }

    /* JADX INFO: renamed from: k4 */
    private void m54678k4(byte[] bArr, int i) {
        byte length = (byte) (bArr.length - i);
        int i2 = this.f39186x1;
        if (i2 != 1) {
            if (i2 == 2) {
                while (i < bArr.length) {
                    bArr[i] = length;
                    i++;
                }
                return;
            }
            if (i2 == 3) {
                while (i < bArr.length) {
                    bArr[i] = 0;
                    i++;
                }
                return;
            }
            if (i2 == 4) {
                while (i < bArr.length - 1) {
                    bArr[i] = 0;
                    i++;
                }
                if ((length & 255) > 0) {
                    bArr[bArr.length - 1] = length;
                    return;
                }
                return;
            }
            if (i2 != 5) {
                throw new CryptographicException(C14113y2.m67402k4("The padding mode {0} is not supported.", C14042ak.m66410k4(C4717gi.class, i2)));
            }
            int i3 = length & 255;
            if (i3 > 1) {
                int i4 = i3 - 1;
                byte[] bArr2 = new byte[i4];
                new C4743qw().mo19624k4(bArr2);
                System.arraycopy(bArr2, 0, bArr, i, i4);
            }
            if (i3 > 0) {
                bArr[bArr.length - 1] = length;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m54683x1(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr == null) {
            throw new ArgumentNullException("inputBuffer");
        }
        if (bArr2 == null) {
            throw new ArgumentNullException("outputBuffer");
        }
        if (i < 0 || i >= bArr.length) {
            throw new ArgumentOutOfRangeException("inputOffset");
        }
        if (i2 <= 0 || i2 > bArr.length || i2 % aq_() != 0) {
            throw new ArgumentOutOfRangeException("inputCount");
        }
        if (i2 + i > bArr.length) {
            throw new ArgumentException("The inputOffset or inputCount or both arguments are out of range.");
        }
        if (i3 < 0 || i3 >= bArr2.length) {
            throw new ArgumentOutOfRangeException("outputOffset");
        }
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    /* JADX INFO: renamed from: kk */
    public final boolean mo19566kk() {
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private void m54679k4(byte[][] bArr) {
        int i;
        byte[] bArr2 = bArr[0];
        if (bArr2.length == 0 || (i = this.f39186x1) == 1) {
            return;
        }
        if (i != 2) {
            if (i == 3) {
                return;
            }
            if (i != 4 && i != 5) {
                throw new CryptographicException(C14113y2.m67402k4("The padding mode {0} is not supported.", C14042ak.m66410k4(C4717gi.class, i)));
            }
        }
        int length = bArr2.length - (bArr2[bArr2.length - 1] & 255);
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        bArr[0] = bArr3;
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    /* JADX INFO: renamed from: k4 */
    public final byte[] mo19564k4(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        int i3;
        m54681to(bArr, i, i2);
        if (this.f39184kk) {
            int iAq_ = aq_() * (i2 / aq_());
            if ((this.f39186x1 == 3 && i2 % aq_() != 0) || ((i3 = this.f39186x1) != 3 && i3 != 1)) {
                iAq_ += aq_();
            }
            byte[] bArr3 = new byte[iAq_];
            System.arraycopy(bArr, i, bArr3, 0, i2);
            m54678k4(bArr3, i2);
            m54682x1(bArr3, 0, iAq_);
            m54677du();
            return bArr3;
        }
        if (this.f39182h4 == null) {
            byte[] bArr4 = new byte[i2];
            System.arraycopy(bArr, i, bArr4, 0, i2);
            m54680kk(bArr4, 0, i2);
            byte[][] bArr5 = {bArr4};
            m54679k4(bArr5);
            bArr2 = bArr5[0];
        } else {
            int iAq_2 = aq_() + i2;
            byte[] bArr6 = new byte[iAq_2];
            System.arraycopy(this.f39182h4, 0, bArr6, 0, aq_());
            System.arraycopy(bArr, i, bArr6, aq_(), i2);
            m54680kk(bArr6, 0, iAq_2);
            byte[][] bArr7 = {bArr6};
            m54679k4(bArr7);
            bArr2 = bArr7[0];
        }
        m54677du();
        return bArr2;
    }
}
