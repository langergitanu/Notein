package com.aspose.slides.p559ms.System;

import androidx.core.content.OooO0OO;
import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.exceptions.ArithmeticException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.internal.p088dn.C3205up;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11683c5;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.gf */
/* JADX INFO: loaded from: classes5.dex */
public class C14060gf extends Number implements Comparable<C14060gf> {

    /* JADX INFO: renamed from: k4 */
    public static C14060gf f47197k4;

    /* JADX INFO: renamed from: kk */
    public static C14060gf f47198kk;

    /* JADX INFO: renamed from: m9 */
    private static boolean f47199m9;

    /* JADX INFO: renamed from: x1 */
    public static C14060gf f47201x1;

    /* JADX INFO: renamed from: dy */
    private Long f47202dy;

    /* JADX INFO: renamed from: to */
    private static final long[] f47200to = new long[37];

    /* JADX INFO: renamed from: du */
    private static final int[] f47195du = new int[37];

    /* JADX INFO: renamed from: h4 */
    private static final int[] f47196h4 = new int[37];

    static {
        for (int i = 2; i <= 36; i++) {
            long j = i;
            f47200to[i] = m66616m9(new C14060gf(-1L), new C14060gf(j)).f47202dy.longValue();
            f47195du[i] = (int) m66605dy(new C14060gf(-1L), new C14060gf(j)).f47202dy.longValue();
            f47196h4[i] = Long.toString(LocationRequestCompat.PASSIVE_INTERVAL, i).length();
        }
        f47199m9 = false;
        f47197k4 = new C14060gf("18446744073709551615");
        f47201x1 = new C14060gf(0L);
        f47198kk = new C14060gf(1L);
    }

    public C14060gf(int i) {
        this.f47202dy = new Long(i);
    }

    /* JADX INFO: renamed from: c5 */
    public static boolean m66602c5(C14060gf c14060gf, C14060gf c14060gf2) {
        return !c14060gf.f47202dy.equals(c14060gf2.f47202dy);
    }

    /* JADX INFO: renamed from: ck */
    public static boolean m66603ck(C14060gf c14060gf, C14060gf c14060gf2) {
        return m66609k4(c14060gf.f47202dy.longValue(), c14060gf2.f47202dy.longValue()) < 0;
    }

    /* JADX INFO: renamed from: du */
    public static C14060gf m66604du(C14060gf c14060gf, C14060gf c14060gf2) {
        if (f47199m9 && m66603ck(c14060gf, c14060gf2)) {
            throw new ArithmeticException("Underflow: op_Subtraction");
        }
        return new C14060gf(c14060gf.f47202dy.longValue() - c14060gf2.f47202dy.longValue());
    }

    /* JADX INFO: renamed from: dy */
    public static C14060gf m66605dy(C14060gf c14060gf, C14060gf c14060gf2) {
        if (c14060gf2.m66621x1(f47201x1)) {
            throw new ArithmeticException("Division by zero");
        }
        long jLongValue = c14060gf.f47202dy.longValue();
        long jLongValue2 = c14060gf2.f47202dy.longValue();
        if (jLongValue2 < 0) {
            return m66609k4(jLongValue, jLongValue2) < 0 ? new C14060gf(jLongValue) : new C14060gf(jLongValue - jLongValue2);
        }
        if (jLongValue >= 0) {
            return new C14060gf(jLongValue % jLongValue2);
        }
        long j = jLongValue - ((((jLongValue >>> 1) / jLongValue2) << 1) * jLongValue2);
        if (m66609k4(j, jLongValue2) < 0) {
            jLongValue2 = 0;
        }
        return new C14060gf(j - jLongValue2);
    }

    /* JADX INFO: renamed from: h4 */
    public static C14060gf m66606h4(C14060gf c14060gf, C14060gf c14060gf2) {
        if (m66609k4(c14060gf.f47202dy.longValue(), f47201x1.f47202dy.longValue()) == 0 || m66609k4(c14060gf2.f47202dy.longValue(), f47201x1.f47202dy.longValue()) == 0) {
            return f47201x1;
        }
        long jLongValue = c14060gf2.f47202dy.longValue() * c14060gf.f47202dy.longValue();
        C14060gf c14060gfM66616m9 = m66616m9(new C14060gf(jLongValue), c14060gf2);
        if (f47199m9 && m66602c5(c14060gf, c14060gfM66616m9)) {
            throw new ArithmeticException("Owerflow: op_Multiply");
        }
        return new C14060gf(jLongValue);
    }

    /* JADX INFO: renamed from: jd */
    public static boolean m66607jd(C14060gf c14060gf, C14060gf c14060gf2) {
        return m66609k4(c14060gf.f47202dy.longValue(), c14060gf2.f47202dy.longValue()) > 0;
    }

    /* JADX INFO: renamed from: k4 */
    private static int m66608k4(char c, int i) {
        if (i != 8) {
            if (i != 10) {
                if (i == 16) {
                }
                return Character.digit(c, i);
            }
            if (c < '0' && c <= '9') {
                return c - '0';
            }
            if (c < 'A' && c <= 'F') {
                return c - '7';
            }
            if (c >= 'a' && c <= 'f') {
                return c - 'W';
            }
            return Character.digit(c, i);
        }
        if (c >= '0' && c <= '7') {
            return c - '0';
        }
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c < '0') {
        }
        if (c < 'A') {
        }
        if (c >= 'a') {
            return c - 'W';
        }
        return Character.digit(c, i);
    }

    /* JADX INFO: renamed from: kk */
    public static C14060gf m66614kk(C14060gf c14060gf) {
        if (f47199m9 && m66607jd(c14060gf, m66604du(f47197k4, f47198kk))) {
            throw new ArithmeticException("Owerflow: op_Increment");
        }
        return new C14060gf(Long.valueOf(c14060gf.f47202dy.longValue() + 1));
    }

    /* JADX INFO: renamed from: m9 */
    public static C14060gf m66616m9(C14060gf c14060gf, C14060gf c14060gf2) {
        if (c14060gf2.m66621x1(f47201x1)) {
            throw new ArithmeticException("Division by zero");
        }
        long jLongValue = c14060gf.f47202dy.longValue();
        long jLongValue2 = c14060gf2.f47202dy.longValue();
        if (jLongValue2 < 0) {
            return m66609k4(jLongValue, jLongValue2) < 0 ? f47201x1 : f47198kk;
        }
        if (jLongValue >= 0) {
            return new C14060gf(jLongValue / jLongValue2);
        }
        long j = ((jLongValue >>> 1) / jLongValue2) << 1;
        return new C14060gf(j + ((long) (m66609k4(jLongValue - (j * jLongValue2), jLongValue2) < 0 ? 0 : 1)));
    }

    /* JADX INFO: renamed from: to */
    public static C14060gf m66617to(C14060gf c14060gf, C14060gf c14060gf2) {
        C14060gf c14060gf3 = new C14060gf(c14060gf2.f47202dy.longValue() + c14060gf.f47202dy.longValue());
        if (f47199m9 && m66607jd(c14060gf, f47201x1) && m66607jd(c14060gf2, f47201x1) && (m66603ck(c14060gf3, c14060gf) || m66603ck(c14060gf3, c14060gf2))) {
            throw new ArithmeticException("Owerflow: op_Addition");
        }
        return c14060gf3;
    }

    /* JADX INFO: renamed from: x1 */
    public static C14060gf m66618x1(C14060gf c14060gf, int i) {
        return new C14060gf(c14060gf.f47202dy.longValue() << i);
    }

    @Override // java.lang.Number
    public byte byteValue() {
        return this.f47202dy.byteValue();
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(toString());
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C7019kk.m27443k4((Class<?>) C14060gf.class)) {
            return false;
        }
        return m66621x1((C14060gf) obj);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(toString());
    }

    public int hashCode() {
        return this.f47202dy.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.f47202dy.intValue();
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.f47202dy.longValue();
    }

    @Override // java.lang.Number
    public short shortValue() {
        return this.f47202dy.shortValue();
    }

    public String toString() {
        return C3205up.m13817k4((String) null, this, C11683c5.m55034jd());
    }

    public C14060gf(long j) {
        this.f47202dy = Long.valueOf(j);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m66609k4(long j, long j2) {
        long j3 = j ^ Long.MIN_VALUE;
        long j4 = j2 ^ Long.MIN_VALUE;
        if (j3 < j4) {
            return -1;
        }
        return j3 > j4 ? 1 : 0;
    }

    /* JADX INFO: renamed from: kk */
    public static C14060gf m66615kk(C14060gf c14060gf, C14060gf c14060gf2) {
        return new C14060gf(c14060gf2.f47202dy.longValue() ^ c14060gf.f47202dy.longValue());
    }

    /* JADX INFO: renamed from: x1 */
    public static C14060gf m66619x1(C14060gf c14060gf, C14060gf c14060gf2) {
        return new C14060gf(c14060gf2.f47202dy.longValue() | c14060gf.f47202dy.longValue());
    }

    public C14060gf(Long l) {
        this.f47202dy = l;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14060gf c14060gf) {
        return m66609k4(this.f47202dy.longValue(), c14060gf.f47202dy.longValue());
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m66621x1(C14060gf c14060gf) {
        if (C14067j2.m66729x1(null, c14060gf)) {
            return false;
        }
        if (C14067j2.m66729x1(this, c14060gf)) {
            return true;
        }
        return this.f47202dy.equals(c14060gf.f47202dy);
    }

    public C14060gf(String str) {
        if (!str.startsWith("0x") && !str.startsWith("0X")) {
            this.f47202dy = Long.valueOf(m66610k4(str, 10));
        } else {
            String strSubstring = str.substring(2);
            this.f47202dy = Long.valueOf(m66610k4(strSubstring.endsWith("L") ? OooO0OO.OooO00o(1, 0, strSubstring) : strSubstring, 16));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static long m66610k4(String str, int i) {
        if (str.length() == 0) {
            throw new OverflowException("empty string");
        }
        int i2 = f47196h4[i] - 1;
        long j = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            int iM66608k4 = m66608k4(str.charAt(i3), i);
            if (iM66608k4 == -1) {
                throw new OverflowException(str);
            }
            if (i3 > i2 && m66613k4(j, iM66608k4, i)) {
                throw new OverflowException("Too large for unsigned long: ".concat(str));
            }
            j = (j * ((long) i)) + ((long) iM66608k4);
        }
        return j;
    }

    /* JADX INFO: renamed from: k4 */
    public static C14060gf m66611k4(C14060gf c14060gf, int i) {
        return new C14060gf(c14060gf.f47202dy.longValue() >>> i);
    }

    /* JADX INFO: renamed from: k4 */
    public static C14060gf m66612k4(C14060gf c14060gf, C14060gf c14060gf2) {
        return new C14060gf(c14060gf2.f47202dy.longValue() & c14060gf.f47202dy.longValue());
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m66613k4(long j, int i, int i2) {
        if (j < 0) {
            return true;
        }
        long j2 = f47200to[i2];
        if (j < j2) {
            return false;
        }
        return j > j2 || i > f47195du[i2];
    }
}
