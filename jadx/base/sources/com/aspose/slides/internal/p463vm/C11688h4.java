package com.aspose.slides.internal.p463vm;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.vm.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11688h4 extends AbstractC11694rv {

    /* JADX INFO: renamed from: h4 */
    private int f39548h4 = 0;

    /* JADX INFO: renamed from: k4 */
    static final C14084qq f39545k4 = C14084qq.f47293kk.Clone();

    /* JADX INFO: renamed from: x1 */
    static final C14084qq f39547x1 = new C14084qq(622, 7, 18);

    /* JADX INFO: renamed from: kk */
    static final int[] f39546kk = {0, 30, 59, 89, 118, 148, 177, 207, 236, StyleIdentifier.TOC_HEADING, StyleIdentifier.GRID_TABLE_2_ACCENT_3, StyleIdentifier.LIST_TABLE_4, StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_4};

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C11688h4 c11688h4 = new C11688h4();
        c11688h4.m55118x1(m55115k4());
        c11688h4.mo55087k4(mo55082du());
        return c11688h4;
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
    public int m55115k4() {
        return this.f39548h4;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: kk */
    public int mo55088kk(C14084qq c14084qq) {
        m55109k4(c14084qq.m67130fa());
        return 1;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: to */
    public int mo55090to(C14084qq c14084qq) {
        return m55108k4(c14084qq.m67130fa(), 2);
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: x1 */
    public int mo55092x1(C14084qq c14084qq) {
        return ((int) ((c14084qq.m67130fa() / 864000000000L) + 1)) % 7;
    }

    /* JADX INFO: renamed from: to */
    private long m55112to(int i) {
        int i2 = ((i - 1) / 30) * 30;
        long j = ((((long) i2) * 10631) / 30) + 227013;
        for (int i3 = (i - i2) - 1; i3 > 0; i3--) {
            j += (long) ((m55119x1(i3, 0) ? 1 : 0) + StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_4);
        }
        return j;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: du */
    public int mo55083du(C14084qq c14084qq) {
        return m55108k4(c14084qq.m67130fa(), 0);
    }

    /* JADX INFO: renamed from: k4 */
    public int m55116k4(int i, int i2) {
        m55111kk(i, i2);
        return !m55119x1(i, 0) ? StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_4 : StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_4;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: kk */
    public C14084qq mo55089kk() {
        return f39545k4;
    }

    /* JADX INFO: renamed from: x1 */
    public void m55118x1(int i) {
        if (i < -2 || i > 2) {
            throw new ArgumentOutOfRangeException("HijriAdjustment");
        }
        super.m55232m9();
        this.f39548h4 = i;
    }

    /* JADX INFO: renamed from: kk */
    private static void m55110kk(int i) {
        if (i != 0 && i != 1) {
            throw new ArgumentOutOfRangeException("era");
        }
    }

    /* JADX INFO: renamed from: to */
    private long m55113to(int i, int i2, int i3) {
        return (((m55112to(i) + ((long) f39546kk[i2 - 1])) + ((long) i3)) - 1) - ((long) m55115k4());
    }

    /* JADX INFO: renamed from: x1 */
    private static void m55114x1(int i, int i2, int i3) {
        m55111kk(i, i3);
        if (i == 9666 && i2 > 4) {
            throw new ArgumentOutOfRangeException("month");
        }
        if (i2 < 1 || i2 > 12) {
            throw new ArgumentOutOfRangeException("month");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public int m55117k4(int i, int i2, int i3) {
        m55114x1(i, i2, i3);
        return i2 == 12 ? !m55119x1(i, 0) ? 29 : 30 : i2 % 2 != 1 ? 29 : 30;
    }

    /* JADX INFO: renamed from: k4 */
    private int m55108k4(long j, int i) {
        m55109k4(j);
        long jM55115k4 = (j / 864000000000L) + 1 + ((long) m55115k4());
        int i2 = (int) (((jM55115k4 - 227013) * 30) / 10631);
        int i3 = i2 + 1;
        long jM55112to = m55112to(i3);
        long jM55116k4 = m55116k4(i3, 0);
        if (jM55115k4 < jM55112to) {
            jM55112to -= jM55116k4;
        } else if (jM55115k4 == jM55112to) {
            jM55112to -= (long) m55116k4(i2, 0);
        } else {
            long j2 = jM55116k4 + jM55112to;
            if (jM55115k4 > j2) {
                i2 += 2;
                jM55112to = j2;
            } else {
                i2 = i3;
            }
        }
        if (i == 0) {
            return i2;
        }
        long j3 = jM55115k4 - jM55112to;
        int i4 = 1;
        if (i == 1) {
            return (int) j3;
        }
        while (i4 <= 12 && j3 > f39546kk[i4 - 1]) {
            i4++;
        }
        int i5 = i4 - 1;
        if (i == 2) {
            return i5;
        }
        int i6 = ((int) j3) - f39546kk[i4 - 2];
        if (i == 3) {
            return i6;
        }
        throw new InvalidOperationException("InvalidOperation_DateTimeParsing");
    }

    /* JADX INFO: renamed from: kk */
    private static void m55111kk(int i, int i2) {
        m55110kk(i2);
        if (i < 1 || i > 9666) {
            throw new ArgumentOutOfRangeException("year");
        }
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: to */
    public C14084qq mo55091to() {
        return f39547x1;
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m55119x1(int i, int i2) {
        m55111kk(i, i2);
        return ((i * 11) + 14) % 30 < 11;
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: k4 */
    public int mo55085k4(C14084qq c14084qq) {
        return m55108k4(c14084qq.m67130fa(), 3);
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: x1 */
    public int[] mo55093x1() {
        return new int[]{1};
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: k4 */
    public C14084qq mo55086k4(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int iM55117k4 = m55117k4(i, i2, i8);
        if (i3 < 1 || i3 > iM55117k4) {
            throw new ArgumentOutOfRangeException("day");
        }
        long jM55113to = m55113to(i, i2, i3);
        if (jM55113to < 0) {
            throw new ArgumentOutOfRangeException(null);
        }
        return new C14084qq(AbstractC11694rv.m55228k4(i4, i5, i6, i7) + (jM55113to * 864000000000L));
    }

    @Override // com.aspose.slides.internal.p463vm.AbstractC11694rv
    /* JADX INFO: renamed from: k4 */
    public void mo55087k4(int i) {
        super.m55232m9();
        if (i < 99 || i > 9666) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f39622du = i;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m55109k4(long j) {
        if (j < f39547x1.m67130fa() || j > f39545k4.m67130fa()) {
            throw new ArgumentOutOfRangeException("time");
        }
    }
}
