package com.aspose.slides.internal.p161h5;

import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.WarningType;

/* JADX INFO: renamed from: com.aspose.slides.internal.h5.ks */
/* JADX INFO: loaded from: classes.dex */
final class C4501ks {

    /* JADX INFO: renamed from: jd */
    private static byte[] f12463jd = {0, 0, -1, -1};

    /* JADX INFO: renamed from: c5 */
    private boolean f12464c5;

    /* JADX INFO: renamed from: du */
    int f12465du;

    /* JADX INFO: renamed from: dy */
    private int f12466dy;

    /* JADX INFO: renamed from: h4 */
    int f12467h4;

    /* JADX INFO: renamed from: k4 */
    C4505to f12468k4;

    /* JADX INFO: renamed from: kk */
    long f12469kk;

    /* JADX INFO: renamed from: m9 */
    C4507up f12470m9;

    /* JADX INFO: renamed from: to */
    long f12471to;

    /* JADX INFO: renamed from: x1 */
    int f12472x1;

    public C4501ks() {
        this.f12464c5 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public int m18561k4(int i) {
        C4505to c4505to;
        String strM67402k4;
        int i2;
        if (this.f12468k4.f12508k4 == null) {
            throw new C4493du("InputBuffer is null. ");
        }
        int iM18590k4 = -5;
        while (true) {
            int i3 = 1;
            switch (this.f12466dy) {
                case 0:
                    c4505to = this.f12468k4;
                    int i4 = c4505to.f12509kk;
                    if (i4 != 0) {
                        c4505to.f12509kk = i4 - 1;
                        c4505to.f12512to++;
                        byte[] bArr = c4505to.f12508k4;
                        int i5 = c4505to.f12514x1;
                        c4505to.f12514x1 = i5 + 1;
                        byte b = bArr[i5];
                        int i6 = b & 255;
                        this.f12472x1 = i6;
                        if ((b & 15) == 8) {
                            if ((i6 >> 4) + 8 > this.f12467h4) {
                                this.f12466dy = 13;
                                strM67402k4 = C14113y2.m67402k4("invalid window size ({0})", Integer.valueOf((i6 >> 4) + 8));
                            }
                            this.f12466dy = i3;
                            iM18590k4 = 0;
                        } else {
                            this.f12466dy = 13;
                            strM67402k4 = C14113y2.m67402k4("unknown compression method (0x{0:X2})", Integer.valueOf(i6));
                        }
                        c4505to.f12501c5 = strM67402k4;
                        this.f12465du = 5;
                        iM18590k4 = 0;
                        break;
                    }
                    break;
                case 1:
                    c4505to = this.f12468k4;
                    int i7 = c4505to.f12509kk;
                    if (i7 != 0) {
                        c4505to.f12509kk = i7 - 1;
                        c4505to.f12512to++;
                        byte[] bArr2 = c4505to.f12508k4;
                        int i8 = c4505to.f12514x1;
                        c4505to.f12514x1 = i8 + 1;
                        byte b2 = bArr2[i8];
                        if (((this.f12472x1 << 8) + (b2 & 255)) % 31 == 0) {
                            i3 = (b2 & 32) == 0 ? 7 : 2;
                            this.f12466dy = i3;
                            iM18590k4 = 0;
                        } else {
                            this.f12466dy = 13;
                            strM67402k4 = "incorrect header check";
                            c4505to.f12501c5 = strM67402k4;
                            this.f12465du = 5;
                            iM18590k4 = 0;
                        }
                    }
                    break;
                case 2:
                    C4505to c4505to2 = this.f12468k4;
                    int i9 = c4505to2.f12509kk;
                    if (i9 != 0) {
                        c4505to2.f12509kk = i9 - 1;
                        c4505to2.f12512to++;
                        byte[] bArr3 = c4505to2.f12508k4;
                        int i10 = c4505to2.f12514x1;
                        c4505to2.f12514x1 = i10 + 1;
                        this.f12471to = ((long) ((bArr3[i10] & 255) << 24)) & 4278190080L;
                        i2 = 3;
                        this.f12466dy = i2;
                        iM18590k4 = 0;
                    }
                    break;
                case 3:
                    C4505to c4505to3 = this.f12468k4;
                    int i11 = c4505to3.f12509kk;
                    if (i11 != 0) {
                        c4505to3.f12509kk = i11 - 1;
                        c4505to3.f12512to++;
                        long j = this.f12471to & 4294967295L;
                        byte[] bArr4 = c4505to3.f12508k4;
                        int i12 = c4505to3.f12514x1;
                        c4505to3.f12514x1 = i12 + 1;
                        this.f12471to = j + (((long) (((bArr4[i12] & 255) << 16) & WarningType.MINOR_FORMATTING_LOSS_CATEGORY)) & 4294967295L);
                        i2 = 4;
                        this.f12466dy = i2;
                        iM18590k4 = 0;
                    }
                    break;
                case 4:
                    C4505to c4505to4 = this.f12468k4;
                    int i13 = c4505to4.f12509kk;
                    if (i13 != 0) {
                        c4505to4.f12509kk = i13 - 1;
                        c4505to4.f12512to++;
                        long j2 = this.f12471to & 4294967295L;
                        byte[] bArr5 = c4505to4.f12508k4;
                        int i14 = c4505to4.f12514x1;
                        c4505to4.f12514x1 = i14 + 1;
                        this.f12471to = j2 + (((long) (((bArr5[i14] & 255) << 8) & 65280)) & 4294967295L);
                        this.f12466dy = 5;
                        iM18590k4 = 0;
                    }
                    break;
                case 5:
                    C4505to c4505to5 = this.f12468k4;
                    int i15 = c4505to5.f12509kk;
                    if (i15 != 0) {
                        c4505to5.f12509kk = i15 - 1;
                        c4505to5.f12512to++;
                        long j3 = this.f12471to & 4294967295L;
                        byte[] bArr6 = c4505to5.f12508k4;
                        int i16 = c4505to5.f12514x1;
                        c4505to5.f12514x1 = i16 + 1;
                        long j4 = j3 + (((long) (bArr6[i16] & 255)) & 4294967295L);
                        this.f12471to = j4;
                        c4505to5.f12505fa = j4;
                        this.f12466dy = 6;
                        return 2;
                    }
                    break;
                case 6:
                    this.f12466dy = 13;
                    this.f12468k4.f12501c5 = "need dictionary";
                    this.f12465du = 0;
                    return -2;
                case 7:
                    iM18590k4 = this.f12470m9.m18590k4(iM18590k4);
                    if (iM18590k4 != -3) {
                        if (iM18590k4 == 0) {
                            iM18590k4 = 0;
                        }
                        if (iM18590k4 != 1) {
                            return iM18590k4;
                        }
                        this.f12469kk = this.f12470m9.m18591k4();
                        if (!m18563k4()) {
                            this.f12466dy = 12;
                            return 1;
                        }
                        this.f12466dy = 8;
                        iM18590k4 = 0;
                    } else {
                        this.f12466dy = 13;
                        this.f12465du = 0;
                    }
                    break;
                case 8:
                    C4505to c4505to6 = this.f12468k4;
                    int i17 = c4505to6.f12509kk;
                    if (i17 != 0) {
                        c4505to6.f12509kk = i17 - 1;
                        c4505to6.f12512to++;
                        byte[] bArr7 = c4505to6.f12508k4;
                        int i18 = c4505to6.f12514x1;
                        c4505to6.f12514x1 = i18 + 1;
                        this.f12471to = ((long) ((bArr7[i18] & 255) << 24)) & 4278190080L;
                        i2 = 9;
                        this.f12466dy = i2;
                        iM18590k4 = 0;
                    }
                    break;
                case 9:
                    C4505to c4505to7 = this.f12468k4;
                    int i19 = c4505to7.f12509kk;
                    if (i19 != 0) {
                        c4505to7.f12509kk = i19 - 1;
                        c4505to7.f12512to++;
                        long j5 = this.f12471to & 4294967295L;
                        byte[] bArr8 = c4505to7.f12508k4;
                        int i20 = c4505to7.f12514x1;
                        c4505to7.f12514x1 = i20 + 1;
                        this.f12471to = j5 + (((long) (((bArr8[i20] & 255) << 16) & WarningType.MINOR_FORMATTING_LOSS_CATEGORY)) & 4294967295L);
                        i2 = 10;
                        this.f12466dy = i2;
                        iM18590k4 = 0;
                    }
                    break;
                case 10:
                    C4505to c4505to8 = this.f12468k4;
                    int i21 = c4505to8.f12509kk;
                    if (i21 != 0) {
                        c4505to8.f12509kk = i21 - 1;
                        c4505to8.f12512to++;
                        long j6 = this.f12471to & 4294967295L;
                        byte[] bArr9 = c4505to8.f12508k4;
                        int i22 = c4505to8.f12514x1;
                        c4505to8.f12514x1 = i22 + 1;
                        this.f12471to = j6 + (((long) (((bArr9[i22] & 255) << 8) & 65280)) & 4294967295L);
                        i2 = 11;
                        this.f12466dy = i2;
                        iM18590k4 = 0;
                    }
                    break;
                case 11:
                    c4505to = this.f12468k4;
                    int i23 = c4505to.f12509kk;
                    if (i23 != 0) {
                        c4505to.f12509kk = i23 - 1;
                        c4505to.f12512to++;
                        long j7 = this.f12471to & 4294967295L;
                        byte[] bArr10 = c4505to.f12508k4;
                        int i24 = c4505to.f12514x1;
                        c4505to.f12514x1 = i24 + 1;
                        long j8 = j7 + (((long) (bArr10[i24] & 255)) & 4294967295L);
                        this.f12471to = j8;
                        if (this.f12469kk == j8) {
                            this.f12466dy = 12;
                            return 1;
                        }
                        this.f12466dy = 13;
                        strM67402k4 = "incorrect data check";
                        c4505to.f12501c5 = strM67402k4;
                        this.f12465du = 5;
                        iM18590k4 = 0;
                    }
                    break;
                case 12:
                    return 1;
                case 13:
                    throw new C4493du(C14113y2.m67402k4("Bad state ({0})", this.f12468k4.f12501c5));
                default:
                    throw new C4493du("Stream error.");
            }
        }
        return iM18590k4;
    }

    /* JADX INFO: renamed from: kk */
    public int m18564kk() {
        C4507up c4507up = this.f12470m9;
        if (c4507up != null) {
            c4507up.m18593x1();
        }
        this.f12470m9 = null;
        return 0;
    }

    /* JADX INFO: renamed from: x1 */
    public int m18565x1() {
        C4505to c4505to = this.f12468k4;
        c4505to.f12504dy = 0L;
        c4505to.f12512to = 0L;
        c4505to.f12501c5 = null;
        this.f12466dy = m18563k4() ? 0 : 7;
        this.f12470m9.m18591k4();
        return 0;
    }

    public C4501ks(boolean z) {
        this.f12464c5 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public int m18562k4(C4505to c4505to, int i) {
        this.f12468k4 = c4505to;
        c4505to.f12501c5 = null;
        this.f12470m9 = null;
        if (i < 8 || i > 15) {
            m18564kk();
            throw new C4493du("Bad window size.");
        }
        this.f12467h4 = i;
        this.f12470m9 = new C4507up(c4505to, m18563k4() ? this : null, 1 << i);
        m18565x1();
        return 0;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m18563k4() {
        return this.f12464c5;
    }
}
