package com.aspose.slides.internal.p527yk;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p463vm.AbstractC11694rv;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.yk.x1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C12854x1 {

    /* JADX INFO: renamed from: du */
    AbstractC11694rv f43332du;

    /* JADX INFO: renamed from: h4 */
    C12849h4[] f43333h4;

    /* JADX INFO: renamed from: k4 */
    C14084qq f43334k4;

    /* JADX INFO: renamed from: kk */
    int f43335kk;

    /* JADX INFO: renamed from: m9 */
    private final long f43336m9 = 864000000000L;

    /* JADX INFO: renamed from: to */
    int f43337to;

    /* JADX INFO: renamed from: x1 */
    int[] f43338x1;

    public C12854x1(AbstractC11694rv abstractC11694rv, C12849h4[] c12849h4Arr) {
        this.f43337to = 9999;
        this.f43332du = abstractC11694rv;
        this.f43333h4 = c12849h4Arr;
        this.f43334k4 = abstractC11694rv.mo55091to();
        C12849h4 c12849h4 = this.f43333h4[0];
        this.f43337to = c12849h4.f43293x1;
        this.f43335kk = c12849h4.f43291kk;
    }

    /* JADX INFO: renamed from: du */
    public int m59921du(C14084qq c14084qq) {
        long jM67130fa = c14084qq.m67130fa();
        int i = 0;
        int iM59923k4 = m59923k4(jM67130fa, 0);
        while (true) {
            C12849h4[] c12849h4Arr = this.f43333h4;
            if (i >= c12849h4Arr.length) {
                throw new ArgumentException("Argument_NoEra");
            }
            C12849h4 c12849h4 = c12849h4Arr[i];
            if (jM67130fa >= c12849h4.f43292to) {
                return iM59923k4 - c12849h4.f43289du;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public int m59922k4(int i, int i2) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("year");
        }
        if (i2 == 0) {
            i2 = this.f43332du.mo55084h4();
        }
        int i3 = 0;
        while (true) {
            C12849h4[] c12849h4Arr = this.f43333h4;
            if (i3 >= c12849h4Arr.length) {
                throw new ArgumentOutOfRangeException("era");
            }
            C12849h4 c12849h4 = c12849h4Arr[i3];
            if (i2 == c12849h4.f43290k4) {
                if (i < c12849h4.f43291kk || i > c12849h4.f43293x1) {
                    throw new ArgumentOutOfRangeException("year");
                }
                return c12849h4.f43289du + i;
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: kk */
    public int m59928kk(C14084qq c14084qq) {
        long jM67130fa = c14084qq.m67130fa();
        int i = 0;
        while (true) {
            C12849h4[] c12849h4Arr = this.f43333h4;
            if (i >= c12849h4Arr.length) {
                throw new ArgumentOutOfRangeException("ArgumentOutOfRange_Era");
            }
            C12849h4 c12849h4 = c12849h4Arr[i];
            if (jM67130fa >= c12849h4.f43292to) {
                return c12849h4.f43290k4;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: to */
    public int m59929to(C14084qq c14084qq) {
        return m59923k4(c14084qq.m67130fa(), 2);
    }

    /* JADX INFO: renamed from: x1 */
    public int m59930x1() {
        return this.f43337to;
    }

    /* JADX INFO: renamed from: kk */
    public static long m59919kk(int i, int i2, int i3) {
        if (i >= 1 && i <= 9999 && i2 >= 1 && i2 <= 12) {
            int[] iArr = (i % 4 != 0 || (i % 100 == 0 && i % 400 != 0)) ? C12850k4.f43294k4 : C12850k4.f43295x1;
            if (i3 >= 1) {
                if (i3 <= iArr[i2] - iArr[i2 - 1]) {
                    int i4 = i - 1;
                    return ((((i4 / 400) + (((i4 / 4) + (i4 * StyleIdentifier.LIST_TABLE_2_ACCENT_6)) - (i4 / 100))) + r4) + i3) - 1;
                }
            }
        }
        throw new ArgumentOutOfRangeException("ArgumentOutOfRange_BadYearMonthDay");
    }

    /* JADX INFO: renamed from: k4 */
    public int m59923k4(long j, int i) {
        m59926k4(j);
        int i2 = (int) (j / 864000000000L);
        int i3 = i2 / 146097;
        int i4 = i2 - (146097 * i3);
        int i5 = i4 / 36524;
        if (i5 == 4) {
            i5 = 3;
        }
        int i6 = i4 - (36524 * i5);
        int i7 = i6 / 1461;
        int i8 = i6 - (i7 * 1461);
        int i9 = i8 / StyleIdentifier.LIST_TABLE_2_ACCENT_6;
        if (i9 == 4) {
            i9 = 3;
        }
        if (i == 0) {
            return (i7 * 4) + (i5 * 100) + (i3 * 400) + i9 + 1;
        }
        int i10 = i8 - (i9 * StyleIdentifier.LIST_TABLE_2_ACCENT_6);
        if (i == 1) {
            return i10 + 1;
        }
        int[] iArr = (i9 != 3 || (i7 == 24 && i5 != 3)) ? C12850k4.f43294k4 : C12850k4.f43295x1;
        int i11 = i10 >> 6;
        while (i10 >= iArr[i11]) {
            i11++;
        }
        return i == 2 ? i11 : (i10 - iArr[i11 - 1]) + 1;
    }

    /* JADX INFO: renamed from: x1 */
    public int m59931x1(C14084qq c14084qq) {
        m59926k4(c14084qq.m67130fa());
        return (int) (((c14084qq.m67130fa() / 864000000000L) + 1) % 7);
    }

    /* JADX INFO: renamed from: x1 */
    public static long m59920x1(int i, int i2, int i3) {
        return m59919kk(i, i2, i3) * 864000000000L;
    }

    /* JADX INFO: renamed from: k4 */
    public int m59924k4(C14084qq c14084qq) {
        return m59923k4(c14084qq.m67130fa(), 3);
    }

    /* JADX INFO: renamed from: k4 */
    public static long m59917k4(int i, int i2, int i3) {
        long j = (((long) i2) * 60) + (((long) i) * 3600) + ((long) i3);
        if (j > 922337203685L || j < -922337203685L) {
            throw new ArgumentOutOfRangeException("Overflow_TimeSpanTooLong");
        }
        return j * 10000000;
    }

    /* JADX INFO: renamed from: k4 */
    public static long m59918k4(int i, int i2, int i3, int i4) {
        if (i < 0 || i >= 24 || i2 < 0 || i2 >= 60 || i3 < 0 || i3 >= 60) {
            throw new ArgumentOutOfRangeException("ArgumentOutOfRange_BadHourMinuteSecond");
        }
        if (i4 < 0 || i4 >= 1000) {
            throw new ArgumentOutOfRangeException("millisecond");
        }
        return (((long) i4) * 10000) + m59917k4(i, i2, i3);
    }

    /* JADX INFO: renamed from: k4 */
    public C14084qq m59925k4(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        long jM59918k4 = m59918k4(i4, i5, i6, i7) + m59920x1(m59922k4(i, i8), i2, i3);
        m59926k4(jM59918k4);
        return new C14084qq(jM59918k4);
    }

    /* JADX INFO: renamed from: k4 */
    public void m59926k4(long j) {
        C12850k4.m59897k4(j, this.f43332du.mo55091to(), this.f43332du.mo55089kk());
    }

    /* JADX INFO: renamed from: k4 */
    public int[] m59927k4() {
        if (this.f43338x1 == null) {
            this.f43338x1 = new int[this.f43333h4.length];
            int i = 0;
            while (true) {
                C12849h4[] c12849h4Arr = this.f43333h4;
                if (i >= c12849h4Arr.length) {
                    break;
                }
                this.f43338x1[i] = c12849h4Arr[i].f43290k4;
                i++;
            }
        }
        return (int[]) this.f43338x1.clone();
    }
}
