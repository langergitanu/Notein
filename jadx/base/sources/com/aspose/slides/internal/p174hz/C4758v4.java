package com.aspose.slides.internal.p174hz;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.internal.p525yi.C12825ix;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.v4 */
/* JADX INFO: loaded from: classes.dex */
public class C4758v4 implements InterfaceC4752ts {

    /* JADX INFO: renamed from: du */
    private byte[] f13290du;

    /* JADX INFO: renamed from: k4 */
    private int f13291k4;

    /* JADX INFO: renamed from: kk */
    private int f13292kk;

    /* JADX INFO: renamed from: to */
    private boolean f13293to;

    /* JADX INFO: renamed from: x1 */
    private byte[] f13294x1;

    public C4758v4() {
        this(0);
    }

    /* JADX INFO: renamed from: k4 */
    private byte m19766k4(byte b) {
        int i = b & 255;
        byte[] bArr = this.f13290du;
        if (i >= bArr.length) {
            throw new FormatException(C12825ix.m59623k4("Invalid character in a Base-64 string."));
        }
        byte b2 = bArr[i];
        if (b2 != -1) {
            return b2;
        }
        throw new FormatException(C12825ix.m59623k4("Invalid character in a Base-64 string."));
    }

    /* JADX INFO: renamed from: x1 */
    private void m19768x1(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new ArgumentNullException("inputBuffer");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("inputOffset", "< 0");
        }
        if (i2 > bArr.length) {
            throw new OutOfMemoryException("inputCount " + C12825ix.m59623k4("Overflow"));
        }
        if (i <= bArr.length - i2) {
            if (i2 < 0) {
                throw new OverflowException("inputCount < 0");
            }
        } else {
            throw new ArgumentException("inputOffset\r\nParameter name: " + C12825ix.m59623k4("Overflow"));
        }
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    public boolean ap_() {
        return true;
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    public int aq_() {
        return 1;
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    public int ar_() {
        return 3;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        m19769k4(true);
        C14094ts.m67303k4(this);
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    /* JADX INFO: renamed from: kk */
    public boolean mo19566kk() {
        return false;
    }

    public C4758v4(int i) {
        this.f13291k4 = i;
        this.f13294x1 = new byte[4];
        this.f13292kk = 0;
        this.f13293to = false;
    }

    /* JADX INFO: renamed from: k4 */
    private int m19767k4(byte[] bArr, int i) {
        byte[] bArr2 = this.f13294x1;
        int i2 = bArr2[3] == 61 ? 1 : 0;
        if (bArr2[2] == 61) {
            i2++;
        }
        this.f13290du = C4726jd.f13175x1;
        if (i2 == 0) {
            int iM19766k4 = m19766k4(bArr2[0]) & 255;
            int iM19766k42 = m19766k4(this.f13294x1[1]) & 255;
            int iM19766k43 = m19766k4(this.f13294x1[2]) & 255;
            int iM19766k44 = m19766k4(this.f13294x1[3]) & 255;
            bArr[i] = (byte) ((iM19766k4 << 2) | (iM19766k42 >> 4));
            bArr[i + 1] = (byte) ((iM19766k42 << 4) | (iM19766k43 >> 2));
            bArr[i + 2] = (byte) ((iM19766k43 << 6) | iM19766k44);
        } else if (i2 == 1) {
            int iM19766k45 = m19766k4(bArr2[0]) & 255;
            int iM19766k46 = m19766k4(this.f13294x1[1]) & 255;
            int iM19766k47 = m19766k4(this.f13294x1[2]) & 255;
            bArr[i] = (byte) ((iM19766k45 << 2) | (iM19766k46 >> 4));
            bArr[i + 1] = (byte) ((iM19766k46 << 4) | (iM19766k47 >> 2));
        } else if (i2 == 2) {
            bArr[i] = (byte) (((m19766k4(bArr2[0]) & 255) << 2) | ((m19766k4(this.f13294x1[1]) & 255) >> 4));
        }
        return 3 - i2;
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    /* JADX INFO: renamed from: k4 */
    public int mo19562k4(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (this.f13293to) {
            throw new ObjectDisposedException("FromBase64Transform");
        }
        m19768x1(bArr, i, i2);
        if (bArr2 == null || i3 < 0) {
            throw new FormatException("outputBuffer");
        }
        int iM19767k4 = 0;
        while (i2 > 0) {
            int i4 = this.f13292kk;
            if (i4 < 4) {
                int i5 = i + 1;
                byte b = bArr[i];
                if (this.f13291k4 != 0) {
                    byte[] bArr3 = this.f13294x1;
                    this.f13292kk = i4 + 1;
                    bArr3[i4] = b;
                } else if (!C14117yj.m67534ks((char) (b & 255))) {
                    byte[] bArr4 = this.f13294x1;
                    int i6 = this.f13292kk;
                    this.f13292kk = i6 + 1;
                    bArr4[i6] = b;
                }
                i = i5;
            }
            if (this.f13292kk == 4) {
                iM19767k4 += m19767k4(bArr2, i3);
                i3 += 3;
                this.f13292kk = 0;
            }
            i2--;
        }
        return iM19767k4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m19769k4(boolean z) {
        if (this.f13293to) {
            return;
        }
        byte[] bArr = this.f13294x1;
        if (bArr != null) {
            AbstractC14092to.m67225k4(bArr, 0, bArr.length);
        }
        if (z) {
            this.f13294x1 = null;
        }
        this.f13293to = true;
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    /* JADX INFO: renamed from: k4 */
    public byte[] mo19564k4(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        if (this.f13293to) {
            throw new ObjectDisposedException("FromBase64Transform");
        }
        m19768x1(bArr, i, i2);
        if (this.f13291k4 == 0) {
            int i5 = i;
            i4 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                if (C14117yj.m67534ks((char) (bArr[i5] & 255))) {
                    i4++;
                }
                i5++;
            }
            if (i4 == i2) {
                return new byte[0];
            }
            int i7 = (i + i2) - 1;
            int iMin = Math.min(2, i2);
            i3 = 0;
            while (iMin > 0) {
                int i8 = i7 - 1;
                char c = (char) (bArr[i7] & 255);
                if (c != '=') {
                    if (!C14117yj.m67534ks(c)) {
                        break;
                    }
                } else {
                    i3++;
                    iMin--;
                }
                i7 = i8;
            }
        } else {
            int i9 = i + i2;
            i3 = bArr[i9 + (-1)] == 61 ? 1 : 0;
            if (bArr[i9 - 2] == 61) {
                i3++;
            }
            i4 = 0;
        }
        if (i2 < 4 && i3 < 2) {
            int i10 = this.f13292kk;
            if (i10 > 2 && this.f13294x1[3] == 61) {
                i3++;
            }
            if (i10 > 1 && this.f13294x1[2] == 61) {
                i3++;
            }
        }
        int i11 = ((((this.f13292kk + i2) - i4) >> 2) * 3) - i3;
        if (i11 <= 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[i11];
        mo19562k4(bArr, i, i2, bArr2, 0);
        return bArr2;
    }
}
