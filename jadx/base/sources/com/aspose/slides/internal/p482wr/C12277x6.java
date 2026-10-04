package com.aspose.slides.internal.p482wr;

import androidx.core.view.ViewCompat;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.wr.x6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C12277x6 {

    /* JADX INFO: renamed from: jd */
    private static final byte[] f41111jd = {0, 0, -1, -1};

    /* JADX INFO: renamed from: c5 */
    private boolean f41112c5;

    /* JADX INFO: renamed from: du */
    public long f41113du;

    /* JADX INFO: renamed from: dy */
    public C12261ks f41114dy;

    /* JADX INFO: renamed from: h4 */
    public int f41115h4;

    /* JADX INFO: renamed from: k4 */
    public int f41116k4;

    /* JADX INFO: renamed from: kk */
    public int f41117kk;

    /* JADX INFO: renamed from: m9 */
    public int f41118m9;

    /* JADX INFO: renamed from: to */
    public long[] f41119to;

    /* JADX INFO: renamed from: x1 */
    public C12278xk f41120x1;

    public C12277x6() {
        this.f41119to = new long[1];
        this.f41112c5 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m57520k4(int i) {
        C12278xk c12278xk;
        String strM67402k4;
        int i2;
        if (this.f41120x1.f41128k4 == null) {
            throw new C12250c6("InputBuffer is null. ");
        }
        int iM57267k4 = -5;
        int i3 = i == 4 ? -5 : 0;
        while (true) {
            switch (this.f41116k4) {
                case 0:
                    c12278xk = this.f41120x1;
                    int i4 = c12278xk.f41129kk;
                    if (i4 != 0) {
                        c12278xk.f41129kk = i4 - 1;
                        c12278xk.f41132to++;
                        byte[] bArr = c12278xk.f41128k4;
                        int i5 = c12278xk.f41134x1;
                        c12278xk.f41134x1 = i5 + 1;
                        byte b = bArr[i5];
                        int i6 = b & 255;
                        this.f41117kk = i6;
                        if ((b & 15) != 8) {
                            this.f41116k4 = 13;
                            strM67402k4 = C14113y2.m67402k4("unknown compression method (0x{0:X2})", Integer.valueOf(i6));
                        } else if ((i6 >> 4) + 8 <= this.f41118m9) {
                            this.f41116k4 = 1;
                            iM57267k4 = i3;
                        } else {
                            this.f41116k4 = 13;
                            strM67402k4 = C14113y2.m67402k4("invalid window size ({0})", Integer.valueOf((i6 >> 4) + 8));
                        }
                        c12278xk.f41121c5 = strM67402k4;
                        this.f41115h4 = 5;
                        iM57267k4 = i3;
                        break;
                    }
                    break;
                case 1:
                    c12278xk = this.f41120x1;
                    int i7 = c12278xk.f41129kk;
                    if (i7 != 0) {
                        c12278xk.f41129kk = i7 - 1;
                        c12278xk.f41132to++;
                        byte[] bArr2 = c12278xk.f41128k4;
                        int i8 = c12278xk.f41134x1;
                        c12278xk.f41134x1 = i8 + 1;
                        byte b2 = bArr2[i8];
                        if (((this.f41117kk << 8) + (b2 & 255)) % 31 != 0) {
                            this.f41116k4 = 13;
                            strM67402k4 = "incorrect header check";
                            c12278xk.f41121c5 = strM67402k4;
                            this.f41115h4 = 5;
                            iM57267k4 = i3;
                        } else if ((b2 & 32) != 0) {
                            this.f41116k4 = 2;
                            iM57267k4 = i3;
                        } else {
                            i2 = 7;
                            this.f41116k4 = i2;
                            iM57267k4 = i3;
                        }
                    }
                    break;
                case 2:
                    C12278xk c12278xk2 = this.f41120x1;
                    int i9 = c12278xk2.f41129kk;
                    if (i9 != 0) {
                        c12278xk2.f41129kk = i9 - 1;
                        c12278xk2.f41132to++;
                        byte[] bArr3 = c12278xk2.f41128k4;
                        c12278xk2.f41134x1 = c12278xk2.f41134x1 + 1;
                        this.f41113du = ((bArr3[r6] & 255) << 24) & ViewCompat.MEASURED_STATE_MASK;
                        i2 = 3;
                        this.f41116k4 = i2;
                        iM57267k4 = i3;
                    }
                    break;
                case 3:
                    C12278xk c12278xk3 = this.f41120x1;
                    int i10 = c12278xk3.f41129kk;
                    if (i10 != 0) {
                        c12278xk3.f41129kk = i10 - 1;
                        c12278xk3.f41132to++;
                        long j = this.f41113du;
                        byte[] bArr4 = c12278xk3.f41128k4;
                        int i11 = c12278xk3.f41134x1;
                        c12278xk3.f41134x1 = i11 + 1;
                        this.f41113du = j + (((long) ((bArr4[i11] & 255) << 16)) & 16711680);
                        this.f41116k4 = 4;
                        iM57267k4 = i3;
                    }
                    break;
                case 4:
                    C12278xk c12278xk4 = this.f41120x1;
                    int i12 = c12278xk4.f41129kk;
                    if (i12 != 0) {
                        c12278xk4.f41129kk = i12 - 1;
                        c12278xk4.f41132to++;
                        long j2 = this.f41113du;
                        byte[] bArr5 = c12278xk4.f41128k4;
                        int i13 = c12278xk4.f41134x1;
                        c12278xk4.f41134x1 = i13 + 1;
                        this.f41113du = j2 + (((long) ((bArr5[i13] & 255) << 8)) & 65280);
                        this.f41116k4 = 5;
                        iM57267k4 = i3;
                    }
                    break;
                case 5:
                    C12278xk c12278xk5 = this.f41120x1;
                    int i14 = c12278xk5.f41129kk;
                    if (i14 != 0) {
                        c12278xk5.f41129kk = i14 - 1;
                        c12278xk5.f41132to++;
                        long j3 = this.f41113du;
                        byte[] bArr6 = c12278xk5.f41128k4;
                        int i15 = c12278xk5.f41134x1;
                        c12278xk5.f41134x1 = i15 + 1;
                        long j4 = j3 + (((long) (bArr6[i15] & 255)) & 255);
                        this.f41113du = j4;
                        c12278xk5.f41125fa = j4;
                        this.f41116k4 = 6;
                        return 2;
                    }
                    break;
                case 6:
                    this.f41116k4 = 13;
                    this.f41120x1.f41121c5 = "need dictionary";
                    this.f41115h4 = 0;
                    return -2;
                case 7:
                    iM57267k4 = this.f41114dy.m57267k4(iM57267k4);
                    if (iM57267k4 != -3) {
                        if (iM57267k4 == 0) {
                            iM57267k4 = i3;
                        }
                        if (iM57267k4 != 1) {
                            return iM57267k4;
                        }
                        this.f41114dy.m57269k4(this.f41119to);
                        if (m57522k4()) {
                            this.f41116k4 = 8;
                        } else {
                            this.f41116k4 = 12;
                        }
                        iM57267k4 = i3;
                    } else {
                        this.f41116k4 = 13;
                        this.f41115h4 = 0;
                    }
                    break;
                case 8:
                    C12278xk c12278xk6 = this.f41120x1;
                    int i16 = c12278xk6.f41129kk;
                    if (i16 != 0) {
                        c12278xk6.f41129kk = i16 - 1;
                        c12278xk6.f41132to++;
                        byte[] bArr7 = c12278xk6.f41128k4;
                        c12278xk6.f41134x1 = c12278xk6.f41134x1 + 1;
                        this.f41113du = ((bArr7[r6] & 255) << 24) & ViewCompat.MEASURED_STATE_MASK;
                        i2 = 9;
                        this.f41116k4 = i2;
                        iM57267k4 = i3;
                    }
                    break;
                case 9:
                    C12278xk c12278xk7 = this.f41120x1;
                    int i17 = c12278xk7.f41129kk;
                    if (i17 != 0) {
                        c12278xk7.f41129kk = i17 - 1;
                        c12278xk7.f41132to++;
                        long j5 = this.f41113du;
                        byte[] bArr8 = c12278xk7.f41128k4;
                        int i18 = c12278xk7.f41134x1;
                        c12278xk7.f41134x1 = i18 + 1;
                        this.f41113du = j5 + (((long) ((bArr8[i18] & 255) << 16)) & 16711680);
                        i2 = 10;
                        this.f41116k4 = i2;
                        iM57267k4 = i3;
                    }
                    break;
                case 10:
                    C12278xk c12278xk8 = this.f41120x1;
                    int i19 = c12278xk8.f41129kk;
                    if (i19 != 0) {
                        c12278xk8.f41129kk = i19 - 1;
                        c12278xk8.f41132to++;
                        long j6 = this.f41113du;
                        byte[] bArr9 = c12278xk8.f41128k4;
                        int i20 = c12278xk8.f41134x1;
                        c12278xk8.f41134x1 = i20 + 1;
                        this.f41113du = j6 + (((long) ((bArr9[i20] & 255) << 8)) & 65280);
                        i2 = 11;
                        this.f41116k4 = i2;
                        iM57267k4 = i3;
                    }
                    break;
                case 11:
                    c12278xk = this.f41120x1;
                    int i21 = c12278xk.f41129kk;
                    if (i21 != 0) {
                        c12278xk.f41129kk = i21 - 1;
                        c12278xk.f41132to++;
                        long j7 = this.f41113du;
                        byte[] bArr10 = c12278xk.f41128k4;
                        int i22 = c12278xk.f41134x1;
                        c12278xk.f41134x1 = i22 + 1;
                        long j8 = j7 + (((long) (bArr10[i22] & 255)) & 255);
                        this.f41113du = j8;
                        if (j8 != 0 && ((int) this.f41119to[0]) != ((int) j8)) {
                            this.f41116k4 = 13;
                            strM67402k4 = "incorrect data check";
                            c12278xk.f41121c5 = strM67402k4;
                            this.f41115h4 = 5;
                            iM57267k4 = i3;
                        }
                        this.f41116k4 = 12;
                        iM57267k4 = i3;
                        break;
                    }
                    break;
                case 12:
                    return 1;
                case 13:
                    throw new C12250c6(C14113y2.m67402k4("Bad state ({0})", this.f41120x1.f41121c5));
                default:
                    throw new C12250c6("Stream error.");
            }
        }
        return iM57267k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m57523kk() {
        C12261ks c12261ks = this.f41114dy;
        if (c12261ks != null) {
            c12261ks.m57268k4();
        }
        this.f41114dy = null;
        return 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m57524x1() {
        C12278xk c12278xk = this.f41120x1;
        c12278xk.f41124dy = 0L;
        c12278xk.f41132to = 0L;
        c12278xk.f41121c5 = null;
        this.f41116k4 = m57522k4() ? 0 : 7;
        this.f41114dy.m57269k4((long[]) null);
        return 0;
    }

    public C12277x6(boolean z) {
        this.f41119to = new long[1];
        this.f41112c5 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m57521k4(C12278xk c12278xk, int i) {
        this.f41120x1 = c12278xk;
        c12278xk.f41121c5 = null;
        this.f41114dy = null;
        if (i < 8 || i > 15) {
            m57523kk();
            throw new C12250c6("Bad window size.");
        }
        this.f41118m9 = i;
        this.f41114dy = new C12261ks(c12278xk, m57522k4() ? this : null, 1 << i);
        m57524x1();
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m57522k4() {
        return this.f41112c5;
    }
}
