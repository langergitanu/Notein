package com.aspose.slides.internal.p463vm;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p527yk.C12850k4;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.vm.ks */
/* JADX INFO: loaded from: classes4.dex */
public class C11692ks extends AbstractC11694rv {

    /* JADX INFO: renamed from: kk */
    private static final int[][] f39617kk = C12850k4.m59898k4();

    /* JADX INFO: renamed from: k4 */
    static C14084qq f39616k4 = new C14084qq(1900, 4, 30);

    /* JADX INFO: renamed from: x1 */
    static C14084qq f39618x1 = new C14084qq(new C14084qq(2029, 5, 13, 23, 59, 59, 999).m67130fa() + 9999);

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C11692ks c11692ks = new C11692ks();
        c11692ks.mo55087k4(mo55082du());
        return c11692ks;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: du */
    public int mo55082du() {
        if (this.f39622du == -1) {
            this.f39622du = 1451;
        }
        return this.f39622du;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: h4 */
    public int mo55084h4() {
        return 1;
    }

    /* JADX INFO: renamed from: k4 */
    public int m55226k4(int i, int i2, int i3) {
        m55225x1(i, i2, i3);
        return (f39617kk[i + (-1318)][0] & (1 << (i2 - 1))) == 0 ? 29 : 30;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: kk */
    public int mo55088kk(C14084qq c14084qq) {
        m55221k4(c14084qq.m67130fa());
        return 1;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: to */
    public int mo55090to(C14084qq c14084qq) {
        return m55227k4(c14084qq, 2);
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: x1 */
    public int mo55092x1(C14084qq c14084qq) {
        return ((int) ((c14084qq.m67130fa() / 864000000000L) + 1)) % 7;
    }

    /* JADX INFO: renamed from: to */
    private static long m55223to(int i, int i2, int i3) {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        m55220k4(i, i2, i3, iArr, iArr2, iArr3);
        return C12850k4.m59896k4(iArr[0], iArr2[0], iArr3[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m55224x1(int i) {
        if (i < 0 || i > 1) {
            throw new ArgumentOutOfRangeException("era");
        }
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: du */
    public int mo55083du(C14084qq c14084qq) {
        return m55227k4(c14084qq, 0);
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: k4 */
    public int mo55085k4(C14084qq c14084qq) {
        return m55227k4(c14084qq, 3);
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: kk */
    public C14084qq mo55089kk() {
        return f39618x1;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m55225x1(int i, int i2, int i3) {
        m55219k4(i, i3);
        if (i2 < 1 || i2 > 12) {
            throw new ArgumentOutOfRangeException("month");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public int m55227k4(C14084qq c14084qq, int i) {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        m55221k4(c14084qq.m67130fa());
        m55222k4(c14084qq, iArr, iArr2, iArr3);
        int i2 = iArr[0];
        int i3 = iArr2[0];
        int i4 = iArr3[0];
        if (i == 0) {
            return i2;
        }
        if (i == 2) {
            return i3;
        }
        if (i == 3) {
            return i4;
        }
        if (i == 1) {
            return (int) ((m55223to(i2, i3, i4) - m55223to(i2, 1, 1)) + 1);
        }
        throw new InvalidOperationException("InvalidOperation_DateTimeParsing");
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: to */
    public C14084qq mo55091to() {
        return f39616k4;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: k4 */
    public C14084qq mo55086k4(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 < 1 || i3 > 29) {
            int iM55226k4 = m55226k4(i, i2, i8);
            if (i3 < 1 || i3 > iM55226k4) {
                throw new ArgumentOutOfRangeException("day");
            }
        } else {
            m55225x1(i, i2, i8);
        }
        long jM55223to = m55223to(i, i2, i3);
        if (jM55223to < 0) {
            throw new ArgumentOutOfRangeException("ArgumentOutOfRange_BadYearMonthDay");
        }
        return new C14084qq(AbstractC11694rv.m55228k4(i4, i5, i6, i7) + (jM55223to * 864000000000L));
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: x1 */
    public int[] mo55093x1() {
        return new int[]{1};
    }

    /* JADX INFO: renamed from: k4 */
    private static C14084qq m55218k4(int[] iArr) {
        return new C14084qq(iArr[1], iArr[2], iArr[3]);
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: k4 */
    public void mo55087k4(int i) {
        if (i != 99 && (i < 1318 || i > 1450)) {
            throw new ArgumentOutOfRangeException("value");
        }
        super.m55232m9();
        this.f39622du = i;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m55219k4(int i, int i2) {
        m55224x1(i2);
        if (i < 1318 || i > 1450) {
            throw new ArgumentOutOfRangeException("year");
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m55220k4(int i, int i2, int i3, int[] iArr, int[] iArr2, int[] iArr3) {
        int i4 = i3 - 1;
        int i5 = i - 1318;
        int[][] iArr4 = f39617kk;
        C14084qq c14084qqM55218k4 = m55218k4(iArr4[i5]);
        int i6 = iArr4[i5][0];
        for (int i7 = 1; i7 < i2; i7++) {
            i4 = i4 + 29 + (i6 & 1);
            i6 >>= 1;
        }
        C14084qq c14084qqM67135k4 = c14084qqM55218k4.m67135k4(i4);
        iArr[0] = c14084qqM67135k4.m67158yj();
        iArr2[0] = c14084qqM67135k4.m67129dy();
        iArr3[0] = c14084qqM67135k4.m67153x1();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m55221k4(long j) {
        if (f39618x1.m67130fa() < j || f39616k4.m67130fa() > j) {
            throw new ArgumentOutOfRangeException("time");
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m55222k4(C14084qq c14084qq, int[] iArr, int[] iArr2, int[] iArr3) {
        int[][] iArr4;
        int i;
        int iM67130fa = ((int) ((c14084qq.m67130fa() - f39616k4.m67130fa()) / 864000000000L)) / StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_4;
        while (true) {
            iArr4 = f39617kk;
            i = iM67130fa + 1;
            if (c14084qq.compareTo(m55218k4(iArr4[i])) <= 0) {
                break;
            } else {
                iM67130fa = i;
            }
        }
        if (c14084qq.compareTo(m55218k4(iArr4[i])) == 0) {
            iM67130fa = i;
        }
        C14077m4 c14077m4M67154x1 = c14084qq.m67154x1(m55218k4(iArr4[iM67130fa]));
        iArr[0] = iM67130fa + 1318;
        iArr2[0] = 1;
        iArr3[0] = 1;
        double dM66816h4 = c14077m4M67154x1.m66816h4();
        int i2 = iArr4[iM67130fa][0];
        int i3 = (i2 & 1) + 29;
        while (true) {
            double d = i3;
            if (dM66816h4 < d) {
                iArr3[0] = iArr3[0] + ((int) dM66816h4);
                return;
            }
            dM66816h4 -= d;
            i2 >>= 1;
            i3 = (i2 & 1) + 29;
            iArr2[0] = iArr2[0] + 1;
        }
    }
}
