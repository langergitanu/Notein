package com.aspose.slides.internal.p540z5;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p105ee.C3670k4;
import com.aspose.slides.internal.p291n4.C6740x1;
import com.aspose.slides.internal.p299ni.InterfaceC6906k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p383rp.AbstractC10036kk;
import com.aspose.slides.internal.p439ug.C11305dy;
import com.aspose.slides.internal.p439ug.C11308kk;
import com.aspose.slides.internal.p439ug.C11311x1;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.z5.kk */
/* JADX INFO: loaded from: classes5.dex */
public class C13436kk extends AbstractC10036kk {

    /* JADX INFO: renamed from: c5 */
    private int f44956c5;

    /* JADX INFO: renamed from: du */
    private int f44957du;

    /* JADX INFO: renamed from: dy */
    private int f44958dy;

    /* JADX INFO: renamed from: h4 */
    private int f44959h4;

    /* JADX INFO: renamed from: jd */
    private C11305dy f44960jd;

    /* JADX INFO: renamed from: k4 */
    private final C11308kk f44961k4;

    /* JADX INFO: renamed from: kk */
    private int[] f44962kk;

    /* JADX INFO: renamed from: m9 */
    private int f44963m9;

    /* JADX INFO: renamed from: to */
    private int f44964to;

    /* JADX INFO: renamed from: x1 */
    private int[] f44965x1;

    public C13436kk(C6740x1 c6740x1, int i, int i2) {
        super(c6740x1, i, i2);
        this.f44961k4 = new C11308kk(m49325k4(), m49327kk().m26568jd() == 0);
    }

    /* JADX INFO: renamed from: k4 */
    private int m62521k4(int[] iArr, int i, int i2, int i3, C11305dy c11305dy, int[] iArr2, int i4) {
        int iM54315k4 = this.f44961k4.m54315k4();
        int i5 = this.f44958dy;
        for (int i6 = i; i6 < i2; i6++) {
            int i7 = iArr[i6];
            if (C14116yg.m67482k4((((i7 & 255) * 11) + ((((i7 >> 8) & 255) * 59) + (((i7 >> 16) & 255) * 30))) - iM54315k4) > 12750) {
                if (iArr2 != null) {
                    iArr2[i4] = i5;
                    i4++;
                }
                m62523k4(c11305dy, this.f44961k4.m54316kk(), i5);
                this.f44961k4.m54314h4();
                iM54315k4 = this.f44961k4.m54315k4();
                i5 = 0;
            }
            i5++;
            int i8 = this.f44963m9 + 1;
            this.f44963m9 = i8;
            if (i8 == i3) {
                if (iArr2 != null) {
                    iArr2[i4] = i5;
                    i4++;
                }
                m62523k4(c11305dy, this.f44961k4.m54316kk(), i5);
                c11305dy.m54301to();
                c11305dy.m54299du();
                this.f44961k4.m54313du();
                iM54315k4 = this.f44961k4.m54315k4();
                this.f44963m9 = 0;
                i5 = 0;
            }
        }
        this.f44958dy = i5;
        return i2 - i;
    }

    /* JADX INFO: renamed from: k4 */
    private int m62522k4(int[] iArr, int i, int i2, int i3, C11305dy c11305dy, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, boolean z, boolean z2) {
        boolean zM62526k4;
        int iM54315k4 = this.f44961k4.m54315k4();
        int i4 = this.f44958dy;
        boolean z3 = false;
        int i5 = 0;
        for (int i6 = i; i6 < i2; i6++) {
            int i7 = iArr[i6];
            if (C14116yg.m67482k4((((i7 & 255) * 11) + ((((i7 >> 8) & 255) * 59) + (((i7 >> 16) & 255) * 30))) - iM54315k4) > 12750) {
                if (iArr4 != null) {
                    int i8 = iArr5[0];
                    iArr5[0] = i8 + 1;
                    iArr4[i8] = i4;
                }
                if (z3) {
                    m62525k4(c11305dy, this.f44961k4, i5, i4);
                    z3 = false;
                } else {
                    int[] iArr6 = {i4};
                    int[] iArr7 = {this.f44956c5};
                    boolean zM62526k42 = m62526k4(this.f44963m9 - iArr6[0], iArr6, iArr7, iArr2, iArr3, c11305dy);
                    int i9 = iArr6[0];
                    this.f44956c5 = iArr7[0];
                    z3 = zM62526k42;
                    if (zM62526k42) {
                        i5 = i9;
                    }
                }
                this.f44961k4.m54314h4();
                iM54315k4 = this.f44961k4.m54315k4();
                i4 = 0;
            }
            i4++;
            int i10 = this.f44963m9 + 1;
            this.f44963m9 = i10;
            if (i10 == i3) {
                if (iArr4 != null) {
                    int i11 = iArr5[0];
                    iArr5[0] = i11 + 1;
                    iArr4[i11] = i4;
                }
                if (z3) {
                    m62525k4(c11305dy, this.f44961k4, i5, i4);
                    zM62526k4 = false;
                } else {
                    int[] iArr8 = {i4};
                    int[] iArr9 = {this.f44956c5};
                    zM62526k4 = m62526k4(i10 - iArr8[0], iArr8, iArr9, iArr2, iArr3, c11305dy);
                    int i12 = iArr8[0];
                    this.f44956c5 = iArr9[0];
                    if (zM62526k4) {
                        this.f44961k4.m54314h4();
                        m62525k4(c11305dy, this.f44961k4, i12, 0);
                    }
                }
                this.f44961k4.m54313du();
                int iM54315k42 = this.f44961k4.m54315k4();
                if (z) {
                    c11305dy.m54301to();
                }
                c11305dy.m54299du();
                this.f44963m9 = 0;
                this.f44956c5 = 0;
                z3 = zM62526k4;
                iM54315k4 = iM54315k42;
                i4 = 0;
            }
        }
        this.f44958dy = i4;
        return i2 - i;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m62523k4(C11305dy c11305dy, int i, int i2) {
        int[] iArrM14867k4 = i == 0 ? C3670k4.m14867k4() : C3670k4.m14871x1();
        C11311x1 c11311x1M54332k4 = C11311x1.m54332k4(C3670k4.m14868kk(), 12);
        while (i2 >= c11311x1M54332k4.m54335du()) {
            i2 -= c11311x1M54332k4.m54335du();
            c11305dy.m54300k4(c11311x1M54332k4);
        }
        if (i2 >= C11311x1.m54332k4(C3670k4.m14868kk(), 0).m54335du()) {
            C11311x1 c11311x1M54332k42 = C11311x1.m54332k4(C3670k4.m14868kk(), (i2 >> 6) - 28);
            c11305dy.m54300k4(c11311x1M54332k42);
            i2 -= c11311x1M54332k42.m54335du();
        }
        if (i2 >= C11311x1.m54332k4(iArrM14867k4, 64).m54335du()) {
            C11311x1 c11311x1M54332k43 = C11311x1.m54332k4(iArrM14867k4, (i2 >> 6) + 63);
            c11305dy.m54300k4(c11311x1M54332k43);
            i2 -= c11311x1M54332k43.m54335du();
        }
        c11305dy.m54300k4(C11311x1.m54332k4(iArrM14867k4, i2));
    }

    /* JADX INFO: renamed from: k4 */
    private void m62524k4(C11305dy c11305dy, long j, int i, int i2) {
        C11311x1 c11311x1 = new C11311x1();
        c11311x1.m54340x1(1);
        c11311x1.m54336k4(12);
        if ((j & 1) == 1) {
            c11311x1.m54340x1(c11311x1.m54339to() * 2);
            if (i2 % i == 0) {
                c11311x1.m54340x1(c11311x1.m54339to() + 1);
            }
            c11311x1.m54336k4(c11311x1.m54337kk() + 1);
        }
        c11305dy.m54300k4(c11311x1);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m62525k4(C11305dy c11305dy, C11308kk c11308kk, int i, int i2) {
        c11305dy.m54300k4(C11311x1.m54331k4());
        m62523k4(c11305dy, c11308kk.m54318x1(), i);
        m62523k4(c11305dy, c11308kk.m54316kk(), i2);
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10036kk
    /* JADX INFO: renamed from: k4 */
    public void mo49347k4(int[] iArr, C12014ne c12014ne, InterfaceC6906k4 interfaceC6906k4) {
        int iM49324du;
        long j;
        int i;
        int i2;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (this.f44960jd == null) {
            this.f44960jd = new C11305dy(interfaceC6906k4, m49325k4());
        }
        int iM49328to = m49328to();
        if (iM49328to == 2) {
            m62521k4(iArr4, 0, iArr4.length, m49325k4(), this.f44960jd, null, 0);
            return;
        }
        if (iM49328to != 3) {
            if (iM49328to == 4) {
                int iM49324du2 = m49324du();
                int iM49325k4 = 0;
                while (iM49325k4 < iArr4.length) {
                    if (this.f44959h4 % m49325k4() == 0) {
                        this.f44957du = 0;
                    }
                    int iM67507x1 = C14116yg.m67507x1(iArr4.length, m49325k4() + iM49325k4);
                    if (this.f44959h4 % (m49325k4() * iM49324du2) == 0) {
                        this.f44965x1 = new int[]{m49325k4()};
                    }
                    if (this.f44959h4 >= m49325k4() * (m49329x1() - 1) || this.f44959h4 % (m49325k4() * iM49324du2) >= (iM49324du2 - 1) * m49325k4()) {
                        int[] iArr5 = {this.f44957du};
                        int[] iArr6 = {this.f44964to};
                        iArr3 = iArr;
                        this.f44959h4 += m62522k4(iArr, iM49325k4, iM67507x1, m49325k4(), this.f44960jd, this.f44965x1, iArr5, null, iArr6, true, true);
                        this.f44957du = iArr5[0];
                        this.f44964to = iArr6[0];
                    } else {
                        if (this.f44959h4 % m49325k4() == 0) {
                            this.f44962kk = new int[m49325k4() + 1];
                            this.f44964to = 0;
                        }
                        int[] iArr7 = {this.f44957du};
                        int[] iArr8 = {this.f44964to};
                        this.f44959h4 += m62522k4(iArr4, iM49325k4, iM67507x1, m49325k4(), this.f44960jd, this.f44965x1, iArr7, this.f44962kk, iArr8, false, false);
                        this.f44957du = iArr7[0];
                        this.f44964to = iArr8[0];
                        this.f44965x1 = this.f44962kk;
                        iArr3 = iArr;
                    }
                    iM49325k4 += m49325k4();
                    iArr4 = iArr3;
                }
                return;
            }
            throw new ArgumentOutOfRangeException(C14113y2.m67402k4("Compression {0} is not supported", C7019kk.m27466x1(m49328to())));
        }
        int[] iArr9 = iArr4;
        long jM26582ne = m49327kk().m26582ne();
        boolean z = (jM26582ne & 4) == 4;
        if ((jM26582ne & 1) == 1) {
            iM49324du = m49324du();
        } else {
            if ((jM26582ne & 2) == 2) {
                throw new NotSupportedException("The Uncompressed options are not supported by CCITT codec at the moment.");
            }
            iM49324du = 1;
        }
        int iM49325k42 = 0;
        while (iM49325k42 < iArr9.length) {
            int iM67507x12 = C14116yg.m67507x1(iArr9.length, m49325k4() + iM49325k42);
            if (this.f44959h4 % m49325k4() == 0) {
                if (z) {
                    int iMo54293k4 = this.f44960jd.mo54293k4() % 8;
                    int i3 = iMo54293k4 - 4;
                    if (i3 < 0) {
                        i3 = iMo54293k4 + 4;
                    }
                    C11311x1 c11311x1 = new C11311x1();
                    c11311x1.m54340x1(0);
                    c11311x1.m54336k4(i3);
                    this.f44960jd.m54300k4(c11311x1);
                }
                m62524k4(this.f44960jd, jM26582ne, iM49324du, this.f44959h4 / m49325k4());
                j = jM26582ne;
                i = iM49324du;
                this.f44957du = 0;
            } else {
                j = jM26582ne;
                i = iM49324du;
            }
            if (this.f44959h4 % (m49325k4() * i) < m49325k4()) {
                if (this.f44959h4 % m49325k4() == 0) {
                    this.f44965x1 = new int[m49325k4() + 1];
                }
                i2 = iM49325k42;
                iArr2 = iArr;
                this.f44959h4 += m62521k4(iArr2, i2, iM67507x12, m49325k4(), this.f44960jd, this.f44965x1, this.f44957du);
            } else {
                i2 = iM49325k42;
                if (this.f44959h4 % (m49325k4() * i) < (i - 1) * m49325k4()) {
                    if (this.f44959h4 % m49325k4() == 0) {
                        this.f44962kk = new int[m49325k4() + 1];
                        this.f44964to = 0;
                    }
                    int[] iArr10 = {this.f44957du};
                    int[] iArr11 = {this.f44964to};
                    this.f44959h4 += m62522k4(iArr, i2, iM67507x12, m49325k4(), this.f44960jd, this.f44965x1, iArr10, this.f44962kk, iArr11, true, false);
                    this.f44957du = iArr10[0];
                    this.f44964to = iArr11[0];
                    this.f44965x1 = this.f44962kk;
                    iArr2 = iArr;
                } else {
                    int[] iArr12 = {this.f44957du};
                    int[] iArr13 = {this.f44964to};
                    iArr2 = iArr;
                    this.f44959h4 += m62522k4(iArr2, i2, iM67507x12, m49325k4(), this.f44960jd, this.f44965x1, iArr12, null, iArr13, true, true);
                    this.f44957du = iArr12[0];
                    this.f44964to = iArr13[0];
                }
            }
            iM49325k42 = m49325k4() + i2;
            iArr9 = iArr2;
            jM26582ne = j;
            iM49324du = i;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m62526k4(int i, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, C11305dy c11305dy) {
        int i2;
        int i3;
        int i4;
        int i5 = iArr[0] + i;
        loop0: while (true) {
            for (boolean z = true; z; z = false) {
                int i6 = iArr4[0];
                if (i6 < iArr3.length) {
                    int i7 = iArr2[0];
                    iArr4[0] = i6 + 1;
                    iArr2[0] = i7 + iArr3[i6];
                }
                while (true) {
                    int i8 = iArr2[0];
                    if (i8 <= i || (i4 = iArr4[0]) <= 2 || (i8 - iArr3[i4 - 1]) - iArr3[i4 - 2] <= i) {
                        break;
                    }
                    iArr2[0] = i8 - (iArr3[i4 - 1] + iArr3[i4 - 2]);
                    iArr4[0] = iArr4[0] - 2;
                }
                while (i > 0) {
                    int i9 = iArr2[0];
                    if (i9 > i || (i3 = iArr4[0]) >= iArr3.length - 1) {
                        break;
                    }
                    iArr4[0] = i3 + 1;
                    int i10 = i9 + iArr3[i3];
                    iArr2[0] = i10;
                    int i11 = iArr4[0];
                    iArr4[0] = i11 + 1;
                    iArr2[0] = i10 + iArr3[i11];
                }
                i2 = iArr2[0];
                int i12 = iArr4[0];
                if (i12 < iArr3.length) {
                    i2 += iArr3[i12];
                }
                if (i2 < i5) {
                    break;
                }
            }
            c11305dy.m54300k4(C11311x1.m54334x1());
            iArr[0] = iArr[0] - (i2 - i);
            iArr2[0] = i2;
            iArr4[0] = iArr4[0] + 1;
            i = i2;
        }
        int i13 = iArr2[0];
        int i14 = i13 - i5;
        if (i14 < -3 || i14 > 3) {
            int i15 = iArr4[0] - 1;
            iArr4[0] = i15;
            iArr2[0] = i13 - iArr3[i15];
            return true;
        }
        c11305dy.m54300k4(C11311x1.m54333to(i14));
        return false;
    }
}
