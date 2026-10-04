package com.aspose.slides.internal.p463vm;

import androidx.core.graphics.OooO0OO;
import com.aspose.slides.Oooo0;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p527yk.C12850k4;
import com.aspose.slides.p559ms.System.C14084qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.vm.du */
/* JADX INFO: loaded from: classes4.dex */
public class C11685du extends AbstractC11694rv {

    /* JADX INFO: renamed from: k4 */
    static final C14084qq f39535k4 = new C14084qq(1583, 1, 1);

    /* JADX INFO: renamed from: kk */
    private static final int[] f39536kk = C12850k4.m59894h4();

    /* JADX INFO: renamed from: h4 */
    private static final int[][] f39534h4 = C12850k4.m59900m9();

    /* JADX INFO: renamed from: x1 */
    static final C14084qq f39537x1 = new C14084qq(new C14084qq(2239, 9, 29, 23, 59, 59, 999).m67130fa() + 9999);

    /* JADX INFO: renamed from: kk */
    public static int m55099kk(int i, int i2) {
        m55097k4(i, i2, "year");
        return f39536kk[OooO0OO.OooO00o(i, 5343, 2, 1)];
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C11685du c11685du = new C11685du();
        c11685du.mo55087k4(mo55082du());
        return c11685du;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: du */
    public int mo55082du() {
        if (this.f39622du == -1) {
            this.f39622du = 5790;
        }
        return this.f39622du;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: h4 */
    public int mo55084h4() {
        return 1;
    }

    /* JADX INFO: renamed from: k4 */
    public int m55104k4(int i, int i2) {
        return !m55106x1(i, i2) ? 12 : 13;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: to */
    public int mo55090to(C14084qq c14084qq) {
        return m55096k4(c14084qq.m67130fa(), 2);
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: x1 */
    public int mo55092x1(C14084qq c14084qq) {
        return ((int) ((c14084qq.m67130fa() / 864000000000L) + 1)) % 7;
    }

    /* JADX INFO: renamed from: x1 */
    private static C14084qq m55100x1(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i - 3760;
        int[] iArr = {0};
        int[] iArr2 = {0};
        int iM55095k4 = m55095k4(i8, new int[]{0}, iArr, iArr2);
        int i9 = iArr[0];
        int i10 = iArr2[0];
        if (i2 == i9 && i3 == i10) {
            return new C14084qq(i8, 1, 1, i4, i5, i6, i7);
        }
        return new C14084qq(AbstractC11694rv.m55228k4(i4, i5, i6, i7) + (((long) m55094k4(iM55095k4, i2, i3, i9, i10)) * 864000000000L) + new C14084qq(i8, 1, 1).m67130fa());
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: du */
    public int mo55083du(C14084qq c14084qq) {
        return m55096k4(c14084qq.m67130fa(), 0);
    }

    /* JADX INFO: renamed from: k4 */
    public int m55105k4(int i, int i2, int i3) {
        m55101x1(i3);
        int iM55099kk = m55099kk(i, i3);
        m55102x1(i, i2, i3);
        int i4 = f39534h4[iM55099kk][i2];
        if (i4 != 0) {
            return i4;
        }
        throw new ArgumentOutOfRangeException("month");
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: kk */
    public int mo55088kk(C14084qq c14084qq) {
        return 1;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: to */
    public C14084qq mo55091to() {
        return f39535k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m55094k4(int i, int i2, int i3, int i4, int i5) {
        if (i2 == i4) {
            return i3 - i5;
        }
        boolean z = i2 > i4;
        if (z) {
            i4 = i2;
            i2 = i4;
            i5 = i3;
            i3 = i5;
        }
        int i6 = f39534h4[i][i2] - i3;
        for (int i7 = i2 + 1; i7 < i4; i7++) {
            i6 += f39534h4[i][i7];
        }
        int i8 = i6 + i5;
        return !z ? -i8 : i8;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m55101x1(int i) {
        if (i != 0 && i != 1) {
            throw new ArgumentOutOfRangeException("era");
        }
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: kk */
    public C14084qq mo55089kk() {
        return f39537x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m55095k4(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        int i2 = i - 1583;
        if (i2 < 0 || i2 > 656) {
            throw new ArgumentOutOfRangeException("gregorianYear");
        }
        int i3 = i2 * 2;
        int[] iArr4 = f39536kk;
        int i4 = iArr4[i3];
        iArr3[0] = i4;
        int i5 = iArr4[i3 + 1];
        if (i4 == 0) {
            iArr2[0] = 5;
            iArr3[0] = 1;
            return i5;
        }
        switch (i4) {
            case 30:
                iArr2[0] = 3;
                return i5;
            case 31:
                iArr2[0] = 5;
                iArr3[0] = 2;
                return i5;
            case 32:
                iArr2[0] = 5;
                iArr3[0] = 3;
                return i5;
            case 33:
                iArr2[0] = 3;
                iArr3[0] = 29;
                return i5;
            default:
                iArr2[0] = 4;
                return i5;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m55102x1(int i, int i2, int i3) {
        int iM55104k4 = m55104k4(i, i3);
        if (i2 < 1 || i2 > iM55104k4) {
            throw new ArgumentOutOfRangeException("month");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static int m55096k4(long j, int i) {
        int i2;
        long j2;
        m55098k4(j);
        C14084qq c14084qq = new C14084qq(j);
        int iM67158yj = c14084qq.m67158yj();
        int iM67129dy = c14084qq.m67129dy();
        int iM67153x1 = c14084qq.m67153x1();
        int[] iArr = {0};
        int[] iArr2 = {0};
        int[] iArr3 = {0};
        iArr[0] = iM67158yj + 3760;
        int iM55095k4 = m55095k4(iM67158yj, iArr, iArr2, iArr3);
        int i3 = iArr[0];
        int i4 = iArr2[0];
        int i5 = iArr3[0];
        long jM59896k4 = C12850k4.m59896k4(iM67158yj, iM67129dy, iM67153x1);
        if (iM67129dy == 1 && iM67153x1 == 1) {
            i2 = i5;
        } else {
            long jM59896k42 = jM59896k4 - C12850k4.m59896k4(iM67158yj, 1, 1);
            int i6 = iArr3[0];
            long j3 = ((long) i6) + jM59896k42;
            int i7 = f39534h4[iM55095k4][iArr2[0]];
            if (j3 <= i7) {
                int i8 = i5 + ((int) jM59896k42);
                if (i == 0) {
                    return i3;
                }
                if (i == 2) {
                    return i4;
                }
                if (i == 3) {
                    return i8;
                }
                throw new InvalidOperationException("InvalidOperation_DateTimeParsing");
            }
            i4++;
            long j4 = jM59896k42 - ((long) (i7 - i6));
            long j5 = 1;
            if (j4 > 1) {
                i3 = i3;
                while (true) {
                    int[] iArr4 = f39534h4[iM55095k4];
                    int i9 = iArr4[i4];
                    j2 = j5;
                    if (j4 <= i9) {
                        break;
                    }
                    i4++;
                    j4 -= (long) i9;
                    if (i4 > 13 || iArr4[i4] == 0) {
                        i3++;
                        iM55095k4 = f39536kk[Oooo0.OooO00o(iM67158yj, -1582, 2, 1)];
                        i4 = 1;
                    }
                    j5 = j2;
                }
                i2 = 1 + ((int) (j4 - j2));
            } else {
                i2 = 1;
                i3 = i3;
            }
        }
        if (i == 0) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        if (i == 3) {
            return i2;
        }
        throw new InvalidOperationException("InvalidOperation_DateTimeParsing");
    }

    /* JADX INFO: renamed from: x1 */
    private void m55103x1(int i, int i2, int i3, int i4) {
        int iM55105k4 = m55105k4(i, i2, i4);
        if (i3 < 1 || i3 > iM55105k4) {
            throw new ArgumentOutOfRangeException("day");
        }
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: k4 */
    public int mo55085k4(C14084qq c14084qq) {
        return m55096k4(c14084qq.m67130fa(), 3);
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m55106x1(int i, int i2) {
        m55097k4(i, i2, "year");
        return ((((long) i) * 7) + 1) % 19 < 7;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: k4 */
    public C14084qq mo55086k4(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        m55097k4(i, i8, "year");
        m55102x1(i, i2, i8);
        m55103x1(i, i2, i3, i8);
        C14084qq c14084qqM55100x1 = m55100x1(i, i2, i3, i4, i5, i6, i7);
        m55098k4(c14084qqM55100x1.m67130fa());
        return c14084qqM55100x1;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: x1 */
    public int[] mo55093x1() {
        return new int[]{1};
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: k4 */
    public void mo55087k4(int i) {
        super.m55232m9();
        if (i != 99) {
            m55097k4(i, 1, "value");
        }
        this.f39622du = i;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m55097k4(int i, int i2, String str) {
        m55101x1(i2);
        if (i < 5343 || i > 5999) {
            throw new ArgumentOutOfRangeException(str);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m55098k4(long j) {
        if (j < f39535k4.m67130fa() || j > f39537x1.m67130fa()) {
            throw new ArgumentOutOfRangeException("time");
        }
    }
}
