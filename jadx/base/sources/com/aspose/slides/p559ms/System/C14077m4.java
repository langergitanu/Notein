package com.aspose.slides.p559ms.System;

import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.C22213OooOoOO;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.m4 */
/* JADX INFO: loaded from: classes5.dex */
public class C14077m4 extends AbstractC7020m9<C14077m4> implements Comparable<C14077m4> {

    /* JADX INFO: renamed from: to */
    private long f47267to;

    /* JADX INFO: renamed from: k4 */
    public static C14077m4 f47264k4 = new C14077m4(LocationRequestCompat.PASSIVE_INTERVAL);

    /* JADX INFO: renamed from: x1 */
    public static C14077m4 f47266x1 = new C14077m4(Long.MIN_VALUE);

    /* JADX INFO: renamed from: kk */
    public static C14077m4 f47265kk = new C14077m4(0);

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.m4$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private String f47268k4;

        /* JADX INFO: renamed from: kk */
        private int f47269kk;

        /* JADX INFO: renamed from: to */
        private int f47270to;

        /* JADX INFO: renamed from: x1 */
        private int f47271x1 = 0;

        public k4(String str) {
            this.f47268k4 = str;
            this.f47269kk = str.length();
        }

        /* JADX INFO: renamed from: du */
        private long m66827du() {
            long j = 1000000;
            boolean z = false;
            long jCharAt = 0;
            while (j > 0 && !m66835k4() && C14117yj.m67548x1(this.f47268k4, this.f47271x1)) {
                jCharAt += ((long) (this.f47268k4.charAt(this.f47271x1) - '0')) * j;
                this.f47271x1++;
                j /= 10;
                z = true;
            }
            if (!z) {
                m66829k4(1);
            }
            return jCharAt;
        }

        /* JADX INFO: renamed from: k4 */
        private int m66828k4(boolean z) {
            int i = 0;
            if (z && m66835k4()) {
                return 0;
            }
            long jCharAt = 0;
            while (true) {
                if (m66835k4() || !C14117yj.m67548x1(this.f47268k4, this.f47271x1)) {
                    break;
                }
                jCharAt = ((jCharAt * 10) + ((long) this.f47268k4.charAt(this.f47271x1))) - 48;
                if (jCharAt > 2147483647L) {
                    m66829k4(2);
                    break;
                }
                this.f47271x1++;
                i++;
            }
            if (!z && i == 0) {
                m66829k4(1);
            }
            return (int) jCharAt;
        }

        /* JADX INFO: renamed from: kk */
        private boolean m66831kk() {
            if (m66835k4() || this.f47268k4.charAt(this.f47271x1) != '-') {
                return false;
            }
            this.f47271x1++;
            return true;
        }

        /* JADX INFO: renamed from: to */
        private boolean m66832to() {
            if (m66835k4() || this.f47268k4.charAt(this.f47271x1) != '.') {
                return false;
            }
            this.f47271x1++;
            return true;
        }

        /* JADX INFO: renamed from: x1 */
        private void m66833x1() {
            while (!m66835k4() && C14117yj.m67536m9(this.f47268k4, this.f47271x1)) {
                this.f47271x1++;
            }
        }

        /* JADX INFO: renamed from: k4 */
        private void m66829k4(int i) {
            if (this.f47270to != 0) {
                return;
            }
            this.f47270to = i;
        }

        /* JADX INFO: renamed from: x1 */
        private void m66834x1(boolean z) {
            if (m66835k4()) {
                return;
            }
            if (this.f47268k4.charAt(this.f47271x1) == ':') {
                this.f47271x1++;
            } else {
                if (z) {
                    return;
                }
                m66829k4(1);
            }
        }

        /* JADX INFO: renamed from: k4 */
        public boolean m66835k4() {
            return this.f47271x1 >= this.f47269kk;
        }

        /* JADX INFO: renamed from: k4 */
        private boolean m66830k4(int i, int i2, int i3, boolean z) {
            int i4 = this.f47270to;
            if (i4 == 2 || i > 23 || i2 > 59 || i3 > 59) {
                if (z) {
                    return false;
                }
                throw new OverflowException("Invalid time data.");
            }
            if (i4 != 1) {
                return true;
            }
            if (z) {
                return false;
            }
            throw new FormatException("Invalid format for TimeSpan.Parse.");
        }

        /* JADX INFO: renamed from: k4 */
        public boolean m66836k4(boolean z, C14077m4[] c14077m4Arr) {
            int iM66828k4;
            int i;
            int iM66828k42;
            C14077m4.f47265kk.CloneTo(c14077m4Arr[0]);
            m66833x1();
            boolean zM66831kk = m66831kk();
            int iM66828k43 = m66828k4(false);
            if (m66832to()) {
                i = iM66828k43;
                iM66828k4 = m66828k4(true);
            } else if (m66835k4()) {
                iM66828k4 = 0;
                i = iM66828k43;
            } else {
                i = 0;
                iM66828k4 = iM66828k43;
            }
            m66834x1(false);
            int i2 = this.f47271x1;
            int iM66828k44 = m66828k4(true);
            if (i2 < this.f47271x1) {
                m66834x1(true);
                iM66828k42 = m66828k4(true);
            } else {
                iM66828k42 = 0;
            }
            long jM66827du = m66832to() ? m66827du() : 0L;
            m66833x1();
            if (!m66835k4()) {
                m66829k4(1);
            }
            if (!m66830k4(iM66828k4, iM66828k44, iM66828k42, z)) {
                return false;
            }
            long[] jArr = {0};
            boolean zM66802k4 = C14077m4.m66802k4(i, iM66828k4, iM66828k44, iM66828k42, 0, false, jArr);
            long j = jArr[0];
            if (!zM66802k4) {
                return false;
            }
            BigInteger bigIntegerValueOf = BigInteger.valueOf(jM66827du);
            BigInteger bigIntegerValueOf2 = BigInteger.valueOf(j);
            BigInteger bigIntegerSubtract = zM66831kk ? bigIntegerValueOf2.negate().subtract(bigIntegerValueOf) : bigIntegerValueOf2.add(bigIntegerValueOf);
            if (bigIntegerSubtract.compareTo(BigInteger.valueOf(LocationRequestCompat.PASSIVE_INTERVAL)) <= 0 && bigIntegerSubtract.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0) {
                c14077m4Arr[0] = new C14077m4(bigIntegerSubtract.longValue());
                return true;
            }
            if (z) {
                return false;
            }
            throw new OverflowException();
        }
    }

    public C14077m4() {
    }

    /* JADX INFO: renamed from: c5 */
    public double m66811c5() {
        return this.f47267to / 1.0E7d;
    }

    /* JADX INFO: renamed from: ck */
    public C14077m4 m66812ck() {
        long j = this.f47267to;
        if (j != f47266x1.f47267to) {
            return new C14077m4(-j);
        }
        throw new OverflowException("This TimeSpan value is MinValue and cannot be negated.");
    }

    public Object clone() {
        return Clone();
    }

    /* JADX INFO: renamed from: du */
    public long m66813du() {
        return this.f47267to;
    }

    /* JADX INFO: renamed from: dy */
    public double m66814dy() {
        return this.f47267to / 6.0E8d;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C14077m4) && this.f47267to == ((C14077m4) obj).f47267to;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: fa, reason: merged with bridge method [inline-methods] */
    public C14077m4 Clone() {
        C14077m4 c14077m4 = new C14077m4();
        CloneTo(c14077m4);
        return c14077m4;
    }

    /* JADX INFO: renamed from: h4 */
    public double m66816h4() {
        return this.f47267to / 8.64E11d;
    }

    public int hashCode() {
        return C14091t6.m67182k4(this.f47267to);
    }

    /* JADX INFO: renamed from: jd */
    public C14077m4 m66817jd() {
        BigInteger bigIntegerAbs = BigInteger.valueOf(this.f47267to).abs();
        if (bigIntegerAbs.compareTo(BigInteger.valueOf(LocationRequestCompat.PASSIVE_INTERVAL)) > 0 || bigIntegerAbs.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0) {
            throw new OverflowException("This TimeSpan value is MinValue so you cannot get the duration.");
        }
        return new C14077m4(bigIntegerAbs.longValue());
    }

    /* JADX INFO: renamed from: k4 */
    public int m66818k4() {
        return (int) (this.f47267to / 864000000000L);
    }

    /* JADX INFO: renamed from: kk */
    public int m66820kk() {
        return (int) ((this.f47267to % 36000000000L) / 600000000);
    }

    /* JADX INFO: renamed from: m9 */
    public double m66822m9() {
        return this.f47267to / 10000.0d;
    }

    /* JADX INFO: renamed from: to */
    public int m66823to() {
        return (int) ((this.f47267to % 600000000) / 10000000);
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp(14);
        if (this.f47267to < 0) {
            c6765kp.m26780k4('-');
        }
        if (m66818k4() != 0) {
            c6765kp.m26805kk(Math.abs(m66818k4()));
            c6765kp.m26780k4(FilenameUtils.EXTENSION_SEPARATOR);
        }
        c6765kp.m26792k4(C14057f9.m66587k4(Math.abs(m66825x1()), "D2"));
        c6765kp.m26780k4(':');
        c6765kp.m26792k4(C14057f9.m66587k4(Math.abs(m66820kk()), "D2"));
        c6765kp.m26780k4(':');
        c6765kp.m26792k4(C14057f9.m66587k4(Math.abs(m66823to()), "D2"));
        int iAbs = (int) Math.abs(this.f47267to % 10000000);
        if (iAbs != 0) {
            c6765kp.m26780k4(FilenameUtils.EXTENSION_SEPARATOR);
            c6765kp.m26792k4(C14057f9.m66587k4(iAbs, "D7"));
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public int m66825x1() {
        return (int) ((this.f47267to % 864000000000L) / 36000000000L);
    }

    public C14077m4(int i, int i2, int i3) {
        long[] jArr = {this.f47267to};
        m66802k4(0, i, i2, i3, 0, true, jArr);
        this.f47267to = jArr[0];
    }

    /* JADX INFO: renamed from: du */
    public static long m66793du(C14077m4 c14077m4) {
        if (c14077m4 == null) {
            return 0L;
        }
        return c14077m4.f47267to;
    }

    /* JADX INFO: renamed from: h4 */
    public static double m66796h4(C14077m4 c14077m4) {
        if (c14077m4 == null) {
            return 0.0d;
        }
        return c14077m4.m66822m9();
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66798k4(C14077m4 c14077m4, C14077m4 c14077m42) {
        long j = c14077m4.f47267to;
        long j2 = c14077m42.f47267to;
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    /* JADX INFO: renamed from: kk */
    public static C14077m4 m66804kk(double d) {
        return m66800k4(d, 600000000L);
    }

    /* JADX INFO: renamed from: to */
    public static C14077m4 m66806to(double d) {
        return m66800k4(d, 10000000L);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14077m4 c14077m4) {
        if (c14077m4 == null) {
            return 1;
        }
        return m66798k4(Clone(), c14077m4.Clone());
    }

    public C14077m4(int i, int i2, int i3, int i4) {
        long[] jArr = {this.f47267to};
        m66802k4(i, i2, i3, i4, 0, true, jArr);
        this.f47267to = jArr[0];
    }

    /* JADX INFO: renamed from: du */
    public static C14077m4 m66794du(double d) {
        return m66800k4(d, 10000L);
    }

    /* JADX INFO: renamed from: h4 */
    public static boolean m66797h4(C14077m4 c14077m4, C14077m4 c14077m42) {
        return (c14077m4 == null || c14077m42 == null || c14077m4.f47267to >= c14077m42.f47267to) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public static C14077m4 m66799k4(double d) {
        return m66800k4(d, 864000000000L);
    }

    /* JADX INFO: renamed from: kk */
    public static C14077m4 m66805kk(C14077m4 c14077m4, C14077m4 c14077m42) {
        if (c14077m4 == null || c14077m42 == null) {
            return null;
        }
        return c14077m4.m66819k4(c14077m42.Clone());
    }

    /* JADX INFO: renamed from: x1 */
    public static C14077m4 m66808x1(double d) {
        return m66800k4(d, 36000000000L);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: to, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C14077m4 c14077m4) {
        c14077m4.f47267to = this.f47267to;
    }

    public C14077m4(long j) {
        this.f47267to = j;
    }

    /* JADX INFO: renamed from: du */
    public static boolean m66795du(C14077m4 c14077m4, C14077m4 c14077m42) {
        return c14077m4.f47267to != c14077m42.f47267to;
    }

    /* JADX INFO: renamed from: k4 */
    private static C14077m4 m66800k4(double d, long j) {
        if (C14044b3.m66437kk(d)) {
            throw new ArgumentException("Value cannot be NaN.", "value");
        }
        if (C14044b3.m66438to(d) || C14044b3.m66424du(d) || d < f47266x1.m66813du() || d > f47264k4.m66813du()) {
            throw new OverflowException("Outside range [MinValue,MaxValue]");
        }
        BigDecimal bigDecimalMultiply = BigDecimal.valueOf(d * (j / 10000)).setScale(0, 4).multiply(BigDecimal.valueOf(10000L));
        if (bigDecimalMultiply.compareTo(BigDecimal.valueOf(LocationRequestCompat.PASSIVE_INTERVAL)) > 0 || bigDecimalMultiply.compareTo(BigDecimal.valueOf(Long.MIN_VALUE)) < 0) {
            throw new OverflowException("Resulting timespan is too big.");
        }
        return new C14077m4(bigDecimalMultiply.longValue());
    }

    /* JADX INFO: renamed from: to */
    public static boolean m66807to(C14077m4 c14077m4, C14077m4 c14077m42) {
        return (c14077m4 == null || c14077m42 == null || c14077m4.f47267to <= c14077m42.f47267to) ? false : true;
    }

    /* JADX INFO: renamed from: x1 */
    public static C14077m4 m66809x1(long j) {
        return new C14077m4(j);
    }

    /* JADX INFO: renamed from: kk */
    public boolean m66821kk(C14077m4 c14077m4) {
        return c14077m4 != null && c14077m4.f47267to == this.f47267to;
    }

    /* JADX INFO: renamed from: k4 */
    public static C14077m4 m66801k4(long j) {
        return new C14077m4(j);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m66810x1(C14077m4 c14077m4, C14077m4 c14077m42) {
        return c14077m4.f47267to == c14077m42.f47267to;
    }

    /* JADX INFO: renamed from: k4 */
    public C14077m4 m66819k4(C14077m4 c14077m4) {
        BigInteger bigIntegerAdd = BigInteger.valueOf(c14077m4.m66813du()).add(BigInteger.valueOf(this.f47267to));
        if (bigIntegerAdd.compareTo(BigInteger.valueOf(LocationRequestCompat.PASSIVE_INTERVAL)) <= 0) {
            return new C14077m4(bigIntegerAdd.longValue());
        }
        throw new OverflowException("Resulting timespan is too big.");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[PHI: r7
      0x002f: PHI (r7v9 long) = (r7v7 long), (r7v13 long) binds: [B:16:0x003c, B:10:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[PHI: r4
      0x0044: PHI (r4v3 long) = (r4v2 long), (r4v8 long) binds: [B:19:0x0042, B:7:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046 A[PHI: r4
      0x0046: PHI (r4v5 long) = (r4v2 long), (r4v8 long) binds: [B:19:0x0042, B:7:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m66802k4(int i, int i2, int i3, int i4, int i5, boolean z, long[] jArr) {
        long j;
        boolean z2;
        long jOooO0O0 = ((((long) C22213OooOoOO.OooO0O0(i3, 60, i2 * 3600, i4)) * 1000) + ((long) i5)) * 10000;
        jArr[0] = 0;
        if (i > 0) {
            long j2 = ((long) i) * 864000000000L;
            if (jOooO0O0 < 0) {
                j = j2 + jOooO0O0;
                z2 = jOooO0O0 > j;
                jOooO0O0 = j;
            } else {
                jOooO0O0 += j2;
                z2 = jOooO0O0 < 0;
            }
        } else {
            if (i < 0) {
                long j3 = ((long) i) * 864000000000L;
                if (jOooO0O0 <= 0) {
                    jOooO0O0 += j3;
                    if (jOooO0O0 > 0) {
                    }
                } else {
                    j = j3 + jOooO0O0;
                    if (j > jOooO0O0) {
                    }
                    jOooO0O0 = j;
                }
            }
        }
        if (!z2) {
            jArr[0] = jOooO0O0;
            return true;
        }
        if (z) {
            throw new ArgumentOutOfRangeException("The timespan is too big or too small.");
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66803k4(String str, C14077m4[] c14077m4Arr) {
        if (str != null) {
            return new k4(str).m66836k4(true, c14077m4Arr);
        }
        f47265kk.CloneTo(c14077m4Arr[0]);
        return false;
    }
}
