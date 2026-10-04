package com.aspose.slides.internal.p174hz;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p525yi.C12825ix;
import com.aspose.slides.internal.p525yi.C12843x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.b1 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC4699b1 implements InterfaceC4752ts {

    /* JADX INFO: renamed from: c5 */
    private boolean f13103c5;

    /* JADX INFO: renamed from: du */
    private byte[] f13104du;

    /* JADX INFO: renamed from: dy */
    private boolean f13105dy = false;

    /* JADX INFO: renamed from: fa */
    protected AbstractC4736my f13106fa;

    /* JADX INFO: renamed from: h4 */
    private int f13107h4;

    /* JADX INFO: renamed from: jd */
    private AbstractC4720he f13108jd;

    /* JADX INFO: renamed from: k4 */
    private int f13109k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f13110kk;

    /* JADX INFO: renamed from: m9 */
    private int f13111m9;

    /* JADX INFO: renamed from: to */
    private byte[] f13112to;

    /* JADX INFO: renamed from: up */
    protected boolean f13113up;

    /* JADX INFO: renamed from: x1 */
    private byte[] f13114x1;

    public AbstractC4699b1(AbstractC4736my abstractC4736my, boolean z, byte[] bArr) {
        this.f13106fa = abstractC4736my;
        this.f13113up = z;
        int iM19683dy = abstractC4736my.m19683dy() >> 3;
        this.f13109k4 = iM19683dy;
        byte[] bArrM59722x1 = bArr == null ? C12843x6.m59722x1(iM19683dy) : (byte[]) bArr.clone();
        int length = bArrM59722x1.length;
        int i = this.f13109k4;
        if (length < i) {
            throw new CryptographicException(C12825ix.m59624k4("IV is too small ({0} bytes), it should be {1} bytes long.", Integer.valueOf(bArrM59722x1.length), Integer.valueOf(this.f13109k4)));
        }
        byte[] bArr2 = new byte[i];
        this.f13114x1 = bArr2;
        C14058fa.m66596k4(bArrM59722x1, 0, bArr2, 0, Math.min(i, bArrM59722x1.length));
        this.f13110kk = new byte[this.f13109k4];
        int iM19680c5 = this.f13106fa.m19680c5() >> 3;
        this.f13107h4 = iM19680c5;
        if (iM19680c5 != 0) {
            this.f13111m9 = this.f13109k4 / iM19680c5;
        }
        int i2 = this.f13109k4;
        this.f13112to = new byte[i2];
        this.f13104du = new byte[i2];
    }

    /* JADX INFO: renamed from: kk */
    private void m19556kk(byte[] bArr, int i, int i2) {
        if (this.f13108jd == null) {
            this.f13108jd = AbstractC4720he.m19622k4();
        }
        byte[] bArr2 = new byte[i2];
        this.f13108jd.mo19624k4(bArr2);
        C14058fa.m66596k4(bArr2, 0, bArr, i, i2);
    }

    /* JADX INFO: renamed from: x1 */
    private int m19558x1(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        int i5;
        int i6 = this.f13109k4;
        if (i2 == i6) {
            i4 = 1;
        } else {
            if (i2 % i6 != 0) {
                throw new CryptographicException("Invalid input block size.");
            }
            i4 = i2 / i6;
        }
        if (m19553du()) {
            i4--;
        }
        if (this.f13103c5) {
            m19565kk(this.f13112to, this.f13104du);
            C14058fa.m66596k4(this.f13104du, 0, bArr2, i3, this.f13109k4);
            i5 = this.f13109k4;
            i3 += i5;
            this.f13103c5 = false;
        } else {
            i5 = 0;
        }
        for (int i7 = 0; i7 < i4; i7++) {
            C14058fa.m66596k4(bArr, i, this.f13112to, 0, this.f13109k4);
            m19565kk(this.f13112to, this.f13104du);
            C14058fa.m66596k4(this.f13104du, 0, bArr2, i3, this.f13109k4);
            int i8 = this.f13109k4;
            i += i8;
            i3 += i8;
            i5 += i8;
        }
        if (m19553du()) {
            C14058fa.m66596k4(bArr, i, this.f13112to, 0, this.f13109k4);
            this.f13103c5 = true;
        }
        return i5;
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    public boolean ap_() {
        return false;
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    public int aq_() {
        return this.f13109k4;
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    public int ar_() {
        return this.f13109k4;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        m19563k4(true);
        C14094ts.m67303k4(this);
    }

    /* JADX INFO: renamed from: du */
    public void m19560du(byte[] bArr, byte[] bArr2) {
        int i;
        if (this.f13113up) {
            for (int i2 = 0; i2 < this.f13111m9; i2++) {
                mo19569x1(this.f13114x1, this.f13110kk);
                int i3 = 0;
                while (true) {
                    i = this.f13107h4;
                    if (i3 < i) {
                        int i4 = i3 + i2;
                        bArr2[i4] = (byte) ((this.f13110kk[i3] & 255) ^ (bArr[i4] & 255));
                        i3++;
                    }
                }
                byte[] bArr3 = this.f13114x1;
                C14058fa.m66596k4(bArr3, i, bArr3, 0, this.f13109k4 - i);
                byte[] bArr4 = this.f13114x1;
                int i5 = this.f13109k4;
                int i6 = this.f13107h4;
                C14058fa.m66596k4(bArr2, i2, bArr4, i5 - i6, i6);
            }
            return;
        }
        for (int i7 = 0; i7 < this.f13111m9; i7++) {
            this.f13113up = true;
            mo19569x1(this.f13114x1, this.f13110kk);
            this.f13113up = false;
            byte[] bArr5 = this.f13114x1;
            int i8 = this.f13107h4;
            C14058fa.m66596k4(bArr5, i8, bArr5, 0, this.f13109k4 - i8);
            byte[] bArr6 = this.f13114x1;
            int i9 = this.f13109k4;
            int i10 = this.f13107h4;
            C14058fa.m66596k4(bArr, i7, bArr6, i9 - i10, i10);
            for (int i11 = 0; i11 < this.f13107h4; i11++) {
                int i12 = i11 + i7;
                bArr2[i12] = (byte) ((this.f13110kk[i11] & 255) ^ (bArr[i12] & 255));
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    public void m19561h4(byte[] bArr, byte[] bArr2) {
        throw new CryptographicException("OFB isn't supported by the framework");
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    /* JADX INFO: renamed from: k4 */
    public int mo19562k4(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (this.f13105dy) {
            throw new ObjectDisposedException("Object is disposed");
        }
        m19559x1(bArr, i, i2);
        if (bArr2 == null) {
            throw new ArgumentNullException("outputBuffer");
        }
        if (i3 < 0) {
            throw new ArgumentOutOfRangeException("outputOffset", "< 0");
        }
        int length = (bArr2.length - i2) - i3;
        if (!this.f13113up && length < 0 && (this.f13106fa.m19694up() == 1 || this.f13106fa.m19694up() == 3)) {
            throw new CryptographicException("outputBuffer", C12825ix.m59623k4("Overflow"));
        }
        if (m19553du()) {
            if (length + this.f13109k4 < 0) {
                throw new CryptographicException("outputBuffer", C12825ix.m59623k4("Overflow"));
            }
        } else if (length < 0) {
            if ((bArr.length - i) - bArr2.length != this.f13109k4) {
                throw new CryptographicException("outputBuffer", C12825ix.m59623k4("Overflow"));
            }
            i2 = bArr2.length - i3;
        }
        return m19558x1(bArr, i, i2, bArr2, i3);
    }

    /* JADX INFO: renamed from: m9 */
    public void m19567m9(byte[] bArr, byte[] bArr2) {
        throw new CryptographicException("CTS isn't supported by the framework");
    }

    /* JADX INFO: renamed from: to */
    public void m19568to(byte[] bArr, byte[] bArr2) {
        if (this.f13113up) {
            for (int i = 0; i < this.f13109k4; i++) {
                byte[] bArr3 = this.f13114x1;
                bArr3[i] = (byte) (bArr3[i] ^ bArr[i]);
            }
            mo19569x1(this.f13114x1, bArr2);
            C14058fa.m66596k4(bArr2, 0, this.f13114x1, 0, this.f13109k4);
            return;
        }
        C14058fa.m66596k4(bArr, 0, this.f13110kk, 0, this.f13109k4);
        mo19569x1(bArr, bArr2);
        int i2 = 0;
        while (true) {
            int i3 = this.f13109k4;
            if (i2 >= i3) {
                C14058fa.m66596k4(this.f13110kk, 0, this.f13114x1, 0, i3);
                return;
            } else {
                bArr2[i2] = (byte) (bArr2[i2] ^ this.f13114x1[i2]);
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public abstract void mo19569x1(byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: du */
    private boolean m19553du() {
        return (this.f13113up || this.f13106fa.m19694up() == 1 || this.f13106fa.m19694up() == 3) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    private void m19555k4(int i, int i2, int i3) {
        String strM67402k4 = C14113y2.m67402k4(C12825ix.m59623k4("Bad {0} padding."), Integer.valueOf(i));
        if (i2 >= 0) {
            strM67402k4 = C14113y2.m67400k4(strM67402k4, C14113y2.m67402k4(C12825ix.m59623k4(" Invalid length {0}."), Integer.valueOf(i2)));
        }
        if (i3 >= 0) {
            strM67402k4 = C14113y2.m67400k4(strM67402k4, C14113y2.m67402k4(C12825ix.m59623k4(" Error found at position {0}."), Integer.valueOf(i3)));
        }
        throw new CryptographicException(strM67402k4);
    }

    /* JADX INFO: renamed from: to */
    private byte[] m19557to(byte[] bArr, int i, int i2) {
        int i3;
        byte[] bArr2;
        int i4;
        int i5;
        int i6 = this.f13109k4;
        int i7 = (i2 / i6) * i6;
        int i8 = i2 - i7;
        int iM19694up = this.f13106fa.m19694up();
        if (iM19694up == 2 || iM19694up == 4 || iM19694up == 5) {
            i3 = i;
            bArr2 = bArr;
            i4 = i7 + this.f13109k4;
        } else {
            if (i2 == 0) {
                return new byte[0];
            }
            if (i8 == 0) {
                i3 = i;
                bArr2 = bArr;
                i4 = i7;
            } else {
                if (this.f13106fa.m19694up() == 1) {
                    throw new CryptographicException("invalid block length");
                }
                int i9 = this.f13109k4 + i7;
                byte[] bArr3 = new byte[i9];
                C14058fa.m66596k4(bArr, i, bArr3, 0, i2);
                i4 = i9;
                i3 = 0;
                bArr2 = bArr3;
            }
        }
        byte[] bArr4 = new byte[i4];
        int i10 = 0;
        int i11 = i3;
        int i12 = i4;
        while (true) {
            i5 = this.f13109k4;
            if (i12 <= i5) {
                break;
            }
            m19558x1(bArr2, i11, i5, bArr4, i10);
            int i13 = this.f13109k4;
            i11 += i13;
            i10 += i13;
            i12 -= i13;
        }
        byte b = (byte) (i5 - i8);
        int iM19694up2 = this.f13106fa.m19694up();
        if (iM19694up2 != 2) {
            if (iM19694up2 == 4) {
                bArr4[i4 - 1] = b;
                C14058fa.m66596k4(bArr2, i11, bArr4, i7, i8);
                m19558x1(bArr4, i7, this.f13109k4, bArr4, i7);
                return bArr4;
            }
            if (iM19694up2 != 5) {
                m19558x1(bArr2, i11, this.f13109k4, bArr4, i10);
                return bArr4;
            }
            int i14 = b & 255;
            m19556kk(bArr4, i4 - i14, i14 - 1);
            bArr4[i4 - 1] = b;
            C14058fa.m66596k4(bArr2, i11, bArr4, i7, i8);
            m19558x1(bArr4, i7, this.f13109k4, bArr4, i7);
            return bArr4;
        }
        byte[] bArr5 = bArr2;
        int i15 = i4;
        while (true) {
            i15--;
            if (i15 < i4 - (b & 255)) {
                C14058fa.m66596k4(bArr5, i11, bArr4, i7, i8);
                m19558x1(bArr4, i7, this.f13109k4, bArr4, i7);
                return bArr4;
            }
            bArr4[i15] = b;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m19559x1(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new ArgumentNullException("inputBuffer");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("inputOffset", "< 0");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("inputCount", "< 0");
        }
        if (i <= bArr.length - i2) {
            return;
        }
        throw new ArgumentException("inputBuffer\r\nParameter name: " + C12825ix.m59623k4("Overflow"));
    }

    /* JADX INFO: renamed from: kk */
    public void m19565kk(byte[] bArr, byte[] bArr2) {
        int iM19684fa = this.f13106fa.m19684fa();
        if (iM19684fa == 1) {
            m19568to(bArr, bArr2);
            return;
        }
        if (iM19684fa == 2) {
            mo19569x1(bArr, bArr2);
            return;
        }
        if (iM19684fa == 3) {
            m19561h4(bArr, bArr2);
            return;
        }
        if (iM19684fa == 4) {
            m19560du(bArr, bArr2);
        } else if (iM19684fa == 5) {
            m19567m9(bArr, bArr2);
        } else {
            throw new NotImplementedException("Unkown CipherMode" + AbstractC14106wy.getName((Class<?>) C4707ck.class, this.f13106fa.m19684fa()));
        }
    }

    /* JADX INFO: renamed from: du */
    private byte[] m19554du(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = this.f13109k4;
        if (i2 % i5 > 0) {
            throw new CryptographicException("Invalid input block size.");
        }
        int i6 = this.f13103c5 ? i5 + i2 : i2;
        byte[] bArr2 = new byte[i6];
        int i7 = i;
        int i8 = 0;
        while (i2 > 0) {
            byte[] bArr3 = bArr;
            int iM19558x1 = m19558x1(bArr3, i7, this.f13109k4, bArr2, i8);
            int i9 = this.f13109k4;
            i7 += i9;
            i8 += iM19558x1;
            i2 -= i9;
            bArr = bArr3;
        }
        if (this.f13103c5) {
            m19565kk(this.f13112to, this.f13104du);
            C14058fa.m66596k4(this.f13104du, 0, bArr2, i8, this.f13109k4);
            this.f13103c5 = false;
        }
        byte b = (byte) (i6 > 0 ? bArr2[i6 - 1] & 255 : 0);
        int iM19694up = this.f13106fa.m19694up();
        if (iM19694up != 2) {
            if (iM19694up == 4) {
                if (b == 0 || (b & 255) > this.f13109k4) {
                    m19555k4(this.f13106fa.m19694up(), b & 255, -1);
                }
                i4 = b & 255;
                for (int i10 = i4 - 1; i10 > 0; i10--) {
                    if (bArr2[(i6 - 1) - i10] != 0) {
                        m19555k4(this.f13106fa.m19694up(), -1, i10);
                    }
                }
            } else if (iM19694up != 5) {
                i3 = i6;
            } else {
                if (b == 0 || (b & 255) > this.f13109k4) {
                    m19555k4(this.f13106fa.m19694up(), b & 255, -1);
                }
                i4 = b & 255;
            }
            i3 = i6 - i4;
        } else {
            if (b == 0 || (b & 255) > this.f13109k4) {
                m19555k4(this.f13106fa.m19694up(), b & 255, -1);
            }
            int i11 = b & 255;
            for (int i12 = i11 - 1; i12 > 0; i12--) {
                if (bArr2[(i6 - 1) - i12] != b) {
                    m19555k4(this.f13106fa.m19694up(), -1, i12);
                }
            }
            i3 = i6 - i11;
        }
        if (i3 <= 0) {
            return new byte[0];
        }
        byte[] bArr4 = new byte[i3];
        C14058fa.m66596k4(bArr2, 0, bArr4, 0, i3);
        AbstractC14092to.m67225k4(bArr2, 0, i6);
        return bArr4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m19563k4(boolean z) {
        if (this.f13105dy) {
            return;
        }
        if (z) {
            AbstractC14092to.m67225k4(this.f13114x1, 0, this.f13109k4);
            this.f13114x1 = null;
            AbstractC14092to.m67225k4(this.f13110kk, 0, this.f13109k4);
            this.f13110kk = null;
        }
        this.f13105dy = true;
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    /* JADX INFO: renamed from: kk */
    public boolean mo19566kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    /* JADX INFO: renamed from: k4 */
    public byte[] mo19564k4(byte[] bArr, int i, int i2) {
        if (this.f13105dy) {
            throw new ObjectDisposedException("Object is disposed");
        }
        m19559x1(bArr, i, i2);
        return this.f13113up ? m19557to(bArr, i, i2) : m19554du(bArr, i, i2);
    }
}
