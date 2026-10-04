package com.aspose.slides.p559ms.System;

import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.DivideByZeroException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.InvalidCastException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.internal.p088dn.C3205up;
import com.aspose.slides.internal.p088dn.C3206x1;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.google.common.primitives.UnsignedBytes;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.bv */
/* JADX INFO: loaded from: classes5.dex */
public class C14046bv extends AbstractC7020m9<C14046bv> implements InterfaceC14061gi, InterfaceC14090sv, Comparable<C14046bv> {

    /* JADX INFO: renamed from: du */
    public static final C14046bv f47165du;

    /* JADX INFO: renamed from: h4 */
    private static C14046bv f47166h4;

    /* JADX INFO: renamed from: k4 */
    public static final C14046bv f47167k4 = new C14046bv("-79228162514264337593543950335");

    /* JADX INFO: renamed from: kk */
    public static final C14046bv f47168kk;

    /* JADX INFO: renamed from: to */
    public static final C14046bv f47169to;

    /* JADX INFO: renamed from: x1 */
    public static final C14046bv f47170x1;

    /* JADX INFO: renamed from: m9 */
    private BigDecimal f47171m9;

    static {
        C14046bv c14046bv = new C14046bv("79228162514264337593543950335");
        f47170x1 = c14046bv;
        f47168kk = m66465k4(-1);
        f47169to = m66465k4(1);
        f47165du = m66465k4(0);
        f47166h4 = m66458h4(c14046bv, m66465k4(10));
    }

    public C14046bv() {
        this.f47171m9 = BigDecimal.ZERO;
    }

    /* JADX INFO: renamed from: du */
    public static char m66449du(C14046bv c14046bv) {
        if (m66447c5(c14046bv, m66465k4(65535)) || m66448ck(c14046bv, m66500x1(0L))) {
            throw new OverflowException("Value was either too large or too small for an Char.");
        }
        return (char) m66494wl(c14046bv);
    }

    /* JADX INFO: renamed from: fa */
    public static byte m66454fa(C14046bv c14046bv) {
        if (m66447c5(c14046bv, m66465k4(255)) || m66448ck(c14046bv, f47165du)) {
            throw new OverflowException("Value is greater than Byte.MaxValue or less than Byte.MinValue");
        }
        return (byte) (m66446c5(c14046bv).f47171m9.byteValue() & 255);
    }

    /* JADX INFO: renamed from: ix */
    public static long m66459ix(C14046bv c14046bv) {
        if (m66447c5(c14046bv, new C14046bv("18446744073709551615")) || m66448ck(c14046bv, m66478kk(0L))) {
            throw new OverflowException("Value is greater than UInt64.MaxValue or less than UInt64.MinValue");
        }
        return m66446c5(c14046bv).f47171m9.longValue();
    }

    /* JADX INFO: renamed from: k4 */
    public static C14046bv m66461k4(byte b) {
        return m66465k4(b & 255);
    }

    /* JADX INFO: renamed from: ks */
    public static int m66481ks(C14046bv c14046bv) {
        if (m66447c5(c14046bv, m66465k4(65535)) || m66448ck(c14046bv, m66465k4(0))) {
            throw new OverflowException("Value is greater than UInt16.MaxValue or less than UInt16.MinValue");
        }
        return m66446c5(c14046bv).f47171m9.shortValue() & 65535;
    }

    /* JADX INFO: renamed from: m9 */
    public static double m66483m9(C14046bv c14046bv) {
        return c14046bv.f47171m9.doubleValue();
    }

    /* JADX INFO: renamed from: ne */
    public static long m66485ne(C14046bv c14046bv) {
        if (m66447c5(c14046bv, m66500x1(LocationRequestCompat.PASSIVE_INTERVAL)) || m66448ck(c14046bv, m66500x1(Long.MIN_VALUE))) {
            throw new OverflowException("Value is greater than Int64.MaxValue or less than Int64.MinValue");
        }
        return m66446c5(c14046bv).f47171m9.longValue();
    }

    /* JADX INFO: renamed from: rv */
    public static int m66486rv(C14046bv c14046bv) {
        if (m66447c5(c14046bv, m66465k4(Integer.MAX_VALUE)) || m66448ck(c14046bv, m66465k4(Integer.MIN_VALUE))) {
            throw new OverflowException("Value is greater than Int32.MaxValue or less than Int32.MinValue");
        }
        return m66446c5(c14046bv).f47171m9.intValue();
    }

    /* JADX INFO: renamed from: to */
    public static C14046bv m66488to(long j) {
        return m66466k4(j);
    }

    /* JADX INFO: renamed from: u4 */
    public static float m66491u4(C14046bv c14046bv) {
        return C14080ne.m66852ck(c14046bv);
    }

    /* JADX INFO: renamed from: up */
    public static double m66492up(C14046bv c14046bv) {
        return c14046bv.f47171m9.doubleValue();
    }

    /* JADX INFO: renamed from: wl */
    private static long m66494wl(C14046bv c14046bv) {
        return c14046bv.f47171m9.longValue();
    }

    /* JADX INFO: renamed from: x6 */
    public static long m66504x6(C14046bv c14046bv) {
        if (m66447c5(c14046bv, m66466k4(4294967295L)) || m66448ck(c14046bv, m66466k4(0L))) {
            throw new OverflowException("Value is greater than Int32.MaxValue or less than Int32.MinValue");
        }
        return 4294967295L & ((long) m66446c5(c14046bv).f47171m9.intValue());
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14090sv
    /* JADX INFO: renamed from: c5 */
    public long mo66508c5(InterfaceC14073kp interfaceC14073kp) {
        return C14080ne.m66838c5(this);
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14090sv
    /* JADX INFO: renamed from: ck */
    public float mo66509ck(InterfaceC14073kp interfaceC14073kp) {
        return C14080ne.m66852ck(this);
    }

    public Object clone() {
        return Clone();
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14090sv
    /* JADX INFO: renamed from: dy */
    public int mo66512dy(InterfaceC14073kp interfaceC14073kp) {
        return C14080ne.m66989m9(this);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C14046bv) {
            return m66493up((C14046bv) obj, this);
        }
        if (obj instanceof Integer) {
            return m66510ck(m66465k4(C14080ne.m66998m9(obj)));
        }
        if (obj instanceof Long) {
            return m66510ck(m66500x1(C14080ne.m66847c5(obj)));
        }
        if (obj instanceof Double) {
            return m66510ck(m66463k4(C14080ne.m66903fa(obj)));
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14090sv
    /* JADX INFO: renamed from: h4 */
    public double mo66514h4(InterfaceC14073kp interfaceC14073kp) {
        return C14080ne.m66894fa(this);
    }

    public int hashCode() {
        return this.f47171m9.hashCode();
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14090sv
    /* JADX INFO: renamed from: jd */
    public byte mo66515jd(InterfaceC14073kp interfaceC14073kp) {
        return C14080ne.m66970kk(this);
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14090sv
    /* JADX INFO: renamed from: kk */
    public char mo66520kk(InterfaceC14073kp interfaceC14073kp) {
        throw new InvalidCastException();
    }

    public String toString() {
        return mo66517k4("G", (InterfaceC14073kp) null);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: uz, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C14046bv c14046bv) {
        c14046bv.f47171m9 = this.f47171m9;
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14090sv
    /* JADX INFO: renamed from: x1 */
    public byte mo66526x1(InterfaceC14073kp interfaceC14073kp) {
        return C14080ne.m67002to(this);
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14090sv
    /* JADX INFO: renamed from: yj */
    public long mo66528yj(InterfaceC14073kp interfaceC14073kp) {
        return C14080ne.m66921jd(this);
    }

    public C14046bv(String str) {
        this.f47171m9 = new BigDecimal(str);
    }

    /* JADX INFO: renamed from: c5 */
    public static C14046bv m66446c5(C14046bv c14046bv) {
        return m66447c5(c14046bv, f47165du) ? m66452dy(c14046bv) : m66479kk(m66452dy(m66479kk(c14046bv)));
    }

    /* JADX INFO: renamed from: du */
    public static C14046bv m66450du(long j) {
        return m66500x1(j);
    }

    /* JADX INFO: renamed from: dy */
    public static C14046bv m66452dy(C14046bv c14046bv) {
        return new C14046bv(c14046bv.f47171m9.divide(BigDecimal.valueOf(1L), 0, 3));
    }

    /* JADX INFO: renamed from: h4 */
    public static float m66456h4(C14046bv c14046bv) {
        return c14046bv.f47171m9.floatValue();
    }

    /* JADX INFO: renamed from: k4 */
    public static C14046bv m66462k4(char c) {
        return m66465k4((int) c);
    }

    /* JADX INFO: renamed from: kk */
    public static C14046bv m66477kk(int i) {
        return m66465k4(i);
    }

    /* JADX INFO: renamed from: ks */
    public static C14046bv m66482ks(C14046bv c14046bv, C14046bv c14046bv2) {
        if (c14046bv == null || c14046bv2 == null) {
            return null;
        }
        if (c14046bv2.m66518k4()) {
            throw new DivideByZeroException();
        }
        if (c14046bv.m66518k4()) {
            return f47165du;
        }
        BigDecimal bigDecimalDivide = c14046bv.f47171m9.divide(c14046bv2.f47171m9, 28, 4);
        BigDecimal bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        if (bigDecimal.scale() < 0) {
            bigDecimal = bigDecimal.setScale(0, 4);
        }
        return m66471k4(bigDecimal);
    }

    /* JADX INFO: renamed from: rv */
    public static int m66487rv(C14046bv c14046bv, C14046bv c14046bv2) {
        return c14046bv.f47171m9.compareTo(c14046bv2.f47171m9);
    }

    /* JADX INFO: renamed from: to */
    public static C14046bv m66489to(C14046bv c14046bv) {
        c14046bv.f47171m9 = m66471k4(c14046bv.f47171m9.add(BigDecimal.ONE)).f47171m9;
        return c14046bv.Clone();
    }

    /* JADX INFO: renamed from: x1 */
    private static int m66495x1(BigDecimal bigDecimal) {
        BigInteger bigIntegerUnscaledValue = bigDecimal.unscaledValue();
        boolean z = bigIntegerUnscaledValue.signum() == -1;
        int length = bigIntegerUnscaledValue.toString().length();
        return z ? length - 1 : length;
    }

    /* JADX INFO: renamed from: x6 */
    private static boolean m66505x6(C14046bv c14046bv, C14046bv c14046bv2) {
        int[] iArrM66476k4 = m66476k4(c14046bv);
        int[] iArrM66476k42 = m66476k4(c14046bv2);
        return iArrM66476k4[0] == iArrM66476k42[0] && iArrM66476k4[1] == iArrM66476k42[1] && iArrM66476k4[2] == iArrM66476k42[2] && iArrM66476k4[3] == iArrM66476k42[3];
    }

    /* JADX INFO: renamed from: yj */
    public static C14046bv m66506yj(C14046bv c14046bv, C14046bv c14046bv2) {
        if (c14046bv == null || c14046bv2 == null) {
            return null;
        }
        if (c14046bv.m66518k4() || c14046bv2.m66518k4()) {
            return f47165du;
        }
        BigDecimal bigDecimalMultiply = c14046bv.f47171m9.multiply(c14046bv2.f47171m9);
        BigDecimal bigDecimal = bigDecimalMultiply.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalMultiply.stripTrailingZeros();
        if (bigDecimal.scale() < 0) {
            bigDecimal = bigDecimal.setScale(0, 4);
        }
        return m66471k4(bigDecimal);
    }

    /* JADX INFO: renamed from: ck */
    public boolean m66510ck(C14046bv c14046bv) {
        return m66493up(c14046bv, this);
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14090sv
    /* JADX INFO: renamed from: fa */
    public int mo66513fa(InterfaceC14073kp interfaceC14073kp) {
        return C14080ne.m66908h4(this);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: jd, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14046bv c14046bv) {
        return m66487rv(this, c14046bv);
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14090sv
    /* JADX INFO: renamed from: m9 */
    public short mo66522m9(InterfaceC14073kp interfaceC14073kp) {
        return C14080ne.m66867du(this);
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14090sv
    /* JADX INFO: renamed from: up */
    public long mo66524up(InterfaceC14073kp interfaceC14073kp) {
        return C14080ne.m66880dy(this);
    }

    public C14046bv(BigDecimal bigDecimal) {
        if (bigDecimal.compareTo(f47170x1.f47171m9) > 0 || bigDecimal.compareTo(f47167k4.f47171m9) < 0) {
            throw new OverflowException();
        }
        this.f47171m9 = bigDecimal;
    }

    /* JADX INFO: renamed from: c5 */
    public static boolean m66447c5(C14046bv c14046bv, C14046bv c14046bv2) {
        return (c14046bv == null || c14046bv2 == null || m66487rv(c14046bv, c14046bv2) <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: ck */
    public static boolean m66448ck(C14046bv c14046bv, C14046bv c14046bv2) {
        return (c14046bv == null || c14046bv2 == null || m66487rv(c14046bv, c14046bv2) >= 0) ? false : true;
    }

    /* JADX INFO: renamed from: du */
    public static C14046bv m66451du(C14046bv c14046bv, C14046bv c14046bv2) {
        return m66506yj(c14046bv, c14046bv2);
    }

    /* JADX INFO: renamed from: dy */
    public static boolean m66453dy(C14046bv c14046bv, C14046bv c14046bv2) {
        if (c14046bv == null || c14046bv2 == null) {
            return false;
        }
        return m66493up(c14046bv, c14046bv2);
    }

    /* JADX INFO: renamed from: fa */
    public static boolean m66455fa(C14046bv c14046bv, C14046bv c14046bv2) {
        return (c14046bv == null || c14046bv2 == null || m66487rv(c14046bv, c14046bv2) > 0) ? false : true;
    }

    /* JADX INFO: renamed from: h4 */
    public static C14046bv m66457h4(long j) {
        return m66478kk(j);
    }

    /* JADX INFO: renamed from: jd */
    public static boolean m66460jd(C14046bv c14046bv, C14046bv c14046bv2) {
        return (c14046bv == null || c14046bv2 == null || m66487rv(c14046bv, c14046bv2) < 0) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    public static C14046bv m66463k4(double d) {
        if (Double.isNaN(d) || C14044b3.m66438to(d) || C14044b3.m66424du(d) || d > Double.MAX_VALUE || d < -1.7976931348623157E308d) {
            throw new OverflowException(C14113y2.m67402k4("Value {0} is greater than Decimal.MaxValue or less than Decimal.MinValue", Double.valueOf(d)));
        }
        BigDecimal bigDecimal = new BigDecimal(d);
        if (bigDecimal.scale() > m66495x1(bigDecimal)) {
            if (m66495x1(bigDecimal) > 29) {
                bigDecimal = bigDecimal.setScale(15 - (m66495x1(bigDecimal) - bigDecimal.scale()), 4);
                if (bigDecimal.scale() > 28) {
                    bigDecimal = bigDecimal.setScale(28, 4);
                }
            }
        } else if (m66495x1(bigDecimal) > 15) {
            bigDecimal = bigDecimal.setScale(15 - (m66495x1(bigDecimal) - bigDecimal.scale()), 4);
        }
        if (bigDecimal.compareTo(f47170x1.f47171m9) > 0 || bigDecimal.compareTo(f47167k4.f47171m9) < 0) {
            throw new OverflowException();
        }
        return m66501x1(new C14046bv(bigDecimal));
    }

    /* JADX INFO: renamed from: kk */
    public static C14046bv m66478kk(long j) {
        BigDecimal bigDecimal = new BigDecimal(j);
        if (bigDecimal.scale() > 20) {
            bigDecimal = bigDecimal.setScale(20, 4);
        }
        return new C14046bv(bigDecimal);
    }

    /* JADX INFO: renamed from: m9 */
    public static boolean m66484m9(C14046bv c14046bv, C14046bv c14046bv2) {
        return !m66453dy(c14046bv, c14046bv2);
    }

    /* JADX INFO: renamed from: to */
    public static C14046bv m66490to(C14046bv c14046bv, C14046bv c14046bv2) {
        return m66502x1(c14046bv, c14046bv2);
    }

    /* JADX INFO: renamed from: up */
    public static boolean m66493up(C14046bv c14046bv, C14046bv c14046bv2) {
        return m66487rv(c14046bv, c14046bv2) == 0 || m66505x6(c14046bv, c14046bv2);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public C14046bv Clone() {
        C14046bv c14046bv = new C14046bv();
        CloneTo(c14046bv);
        return c14046bv;
    }

    /* JADX INFO: renamed from: h4 */
    public static C14046bv m66458h4(C14046bv c14046bv, C14046bv c14046bv2) {
        return m66482ks(c14046bv, c14046bv2);
    }

    /* JADX INFO: renamed from: k4 */
    public static C14046bv m66464k4(float f) {
        if (f >= Float.MAX_VALUE || f < -3.4028235E38f || Float.isNaN(f) || C14064he.m66716to(f) || C14064he.m66703du(f)) {
            throw new OverflowException(C14113y2.m67402k4("Value {0} is greater than Decimal.MaxValue or less than Decimal.MinValue", Float.valueOf(f)));
        }
        BigDecimal bigDecimal = new BigDecimal(f);
        if (bigDecimal.scale() > m66495x1(bigDecimal)) {
            if (m66495x1(bigDecimal) > 29) {
                bigDecimal = bigDecimal.setScale(7 - (m66495x1(bigDecimal) - bigDecimal.scale()), 4);
                if (bigDecimal.scale() > 28) {
                    bigDecimal = bigDecimal.setScale(28, 4);
                }
            }
        } else if (m66495x1(bigDecimal) > 7) {
            bigDecimal = bigDecimal.setScale(7 - (m66495x1(bigDecimal) - bigDecimal.scale()), 4);
        }
        return m66501x1(new C14046bv(bigDecimal));
    }

    /* JADX INFO: renamed from: kk */
    public static C14046bv m66479kk(C14046bv c14046bv) {
        return new C14046bv(c14046bv.f47171m9.negate());
    }

    /* JADX INFO: renamed from: x1 */
    public static C14046bv m66496x1(byte b) {
        return m66465k4((int) b);
    }

    /* JADX INFO: renamed from: yj */
    public static short m66507yj(C14046bv c14046bv) {
        if (m66447c5(c14046bv, m66465k4(32767)) || m66448ck(c14046bv, m66465k4(-32768))) {
            throw new OverflowException("Value is greater than Int16.MaxValue or less than Int16.MinValue");
        }
        return m66446c5(c14046bv).f47171m9.shortValue();
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14090sv
    /* JADX INFO: renamed from: du */
    public C14046bv mo66511du(InterfaceC14073kp interfaceC14073kp) {
        return this;
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14090sv
    /* JADX INFO: renamed from: ks */
    public String mo66521ks(InterfaceC14073kp interfaceC14073kp) {
        return mo66517k4("G", interfaceC14073kp);
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14090sv
    /* JADX INFO: renamed from: to */
    public C14084qq mo66523to(InterfaceC14073kp interfaceC14073kp) {
        throw new InvalidCastException();
    }

    /* JADX INFO: renamed from: k4 */
    public static C14046bv m66465k4(int i) {
        BigDecimal bigDecimal = new BigDecimal(i);
        if (bigDecimal.scale() > 10) {
            bigDecimal = bigDecimal.setScale(10, 4);
        }
        return new C14046bv(bigDecimal);
    }

    /* JADX INFO: renamed from: kk */
    public static C14046bv m66480kk(C14046bv c14046bv, C14046bv c14046bv2) {
        return m66468k4(c14046bv, c14046bv2);
    }

    /* JADX INFO: renamed from: x1 */
    public static C14046bv m66497x1(double d) {
        return m66463k4(d);
    }

    /* JADX INFO: renamed from: k4 */
    public static C14046bv m66466k4(long j) {
        BigDecimal bigDecimal = new BigDecimal(j);
        if (bigDecimal.scale() > 10) {
            bigDecimal = bigDecimal.setScale(10, 4);
        }
        return new C14046bv(bigDecimal);
    }

    /* JADX INFO: renamed from: x1 */
    public static C14046bv m66498x1(float f) {
        return m66464k4(f);
    }

    /* JADX INFO: renamed from: k4 */
    public static C14046bv m66467k4(C14046bv c14046bv, int i, short s) {
        if (s != 0 && s != 1) {
            throw new ArgumentException(C14113y2.m67408k4("The value '", AbstractC14106wy.getName((Class<?>) C14102vj.class, s), "' is not valid for this usage of the type MidpointRounding."), "mode");
        }
        if (i < 0 || i > 28) {
            throw new ArgumentOutOfRangeException("decimals", "[0,28]");
        }
        boolean z = c14046bv.f47171m9.signum() < 0;
        if (z) {
            c14046bv = m66479kk(c14046bv);
        }
        C14046bv c14046bvM66463k4 = m66463k4(C14116yg.m67469du(10.0d, i));
        C14046bv c14046bvM66452dy = m66452dy(c14046bv);
        C14046bv c14046bvM66480kk = m66480kk(c14046bvM66452dy, m66482ks(C14116yg.m67488k4(m66482ks(m66452dy(m66506yj(m66490to(c14046bv, c14046bvM66452dy), new C14046bv("10000000000000000000000000000"))), m66458h4(new C14046bv("10000000000000000000000000000"), c14046bvM66463k4)), s), c14046bvM66463k4));
        c14046bvM66480kk.f47171m9 = c14046bvM66480kk.f47171m9.setScale(i, s == 1 ? 4 : 6);
        return z ? m66479kk(c14046bvM66480kk) : c14046bvM66480kk;
    }

    /* JADX INFO: renamed from: x1 */
    public static C14046bv m66499x1(int i) {
        return m66465k4(i & 65535);
    }

    /* JADX INFO: renamed from: k4 */
    public static C14046bv m66468k4(C14046bv c14046bv, C14046bv c14046bv2) {
        if (c14046bv == null || c14046bv2 == null) {
            return null;
        }
        return m66471k4(c14046bv.f47171m9.add(c14046bv2.f47171m9));
    }

    /* JADX INFO: renamed from: x1 */
    public static C14046bv m66500x1(long j) {
        BigDecimal bigDecimal = new BigDecimal(j);
        if (bigDecimal.scale() > 19) {
            bigDecimal = bigDecimal.setScale(19, 4);
        }
        return new C14046bv(bigDecimal);
    }

    /* JADX INFO: renamed from: k4 */
    public static C14046bv m66469k4(String str) {
        return m66470k4(str, 111, (InterfaceC14073kp) null);
    }

    /* JADX INFO: renamed from: x1 */
    public static C14046bv m66501x1(C14046bv c14046bv) {
        BigDecimal scale = c14046bv.f47171m9;
        String plainString = scale.toPlainString();
        String strM55062ne = C11697x1.m55252to().m55263fa().m55062ne();
        while (plainString.endsWith("0") && plainString.indexOf(strM55062ne) != -1) {
            scale = scale.setScale(scale.scale() - 1);
            plainString = scale.toPlainString();
        }
        return new C14046bv(scale);
    }

    /* JADX INFO: renamed from: k4 */
    public static C14046bv m66470k4(String str, int i, InterfaceC14073kp interfaceC14073kp) {
        if (str == null) {
            throw new ArgumentNullException("s");
        }
        if ((i & 512) != 0) {
            throw new ArgumentException("Decimal.TryParse does not accept AllowHexSpecifier", "style");
        }
        C14046bv[] c14046bvArr = {null};
        m66474k4(str, i, interfaceC14073kp, c14046bvArr, true);
        return c14046bvArr[0];
    }

    /* JADX INFO: renamed from: x1 */
    public static C14046bv m66502x1(C14046bv c14046bv, C14046bv c14046bv2) {
        if (c14046bv == null || c14046bv2 == null) {
            return null;
        }
        return m66471k4(c14046bv.f47171m9.subtract(c14046bv2.f47171m9));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C14046bv m66471k4(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return new C14046bv();
        }
        if (m66495x1(bigDecimal) <= 0 || m66495x1(bigDecimal) == bigDecimal.scale()) {
            bigDecimal = bigDecimal.setScale(28, 4);
        } else if (m66495x1(bigDecimal) > 29 && bigDecimal.scale() >= m66495x1(bigDecimal) - 29) {
            bigDecimal = bigDecimal.setScale(29 - (m66495x1(bigDecimal) - bigDecimal.scale()), 4);
        } else if (bigDecimal.scale() > 28) {
        }
        return new C14046bv(bigDecimal);
    }

    /* JADX INFO: renamed from: x1 */
    public static C14046bv m66503x1(String str, InterfaceC14073kp interfaceC14073kp) {
        return m66470k4(str, 111, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static C14046bv m66472k4(short s) {
        return m66465k4((int) s);
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14061gi
    /* JADX INFO: renamed from: k4 */
    public String mo66517k4(String str, InterfaceC14073kp interfaceC14073kp) {
        return C3205up.m13816k4(str, this, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m66518k4() {
        return m66510ck(f47165du);
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14090sv
    /* JADX INFO: renamed from: k4 */
    public boolean mo66519k4(InterfaceC14073kp interfaceC14073kp) {
        return C14080ne.m66956k4(this);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66473k4(String str, int i, InterfaceC14073kp interfaceC14073kp, C14046bv[] c14046bvArr) {
        if (str == null || (i & 512) != 0) {
            c14046bvArr[0] = f47165du;
            return false;
        }
        try {
            return m66474k4(str, i, interfaceC14073kp, c14046bvArr, false);
        } catch (Exception unused) {
            c14046bvArr[0] = f47165du;
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0081 A[PHI: r5
      0x0081: PHI (r5v17 java.lang.String) = (r5v2 java.lang.String), (r5v19 java.lang.String), (r5v24 java.lang.String) binds: [B:39:0x00d4, B:36:0x00c9, B:26:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m66474k4(String str, int i, InterfaceC14073kp interfaceC14073kp, C14046bv[] c14046bvArr, boolean z) {
        C11683c5 c11683c5M55033ck = interfaceC14073kp == null ? C11683c5.m55033ck() : C11683c5.m55035k4(interfaceC14073kp);
        if (C14113y2.m67359c5(str, "\u0000")) {
            str = C14113y2.m67401k4(str, "\u0000", "");
        }
        String strM67440x1 = C14113y2.m67440x1(str);
        if (i == 7) {
            if (C14113y2.m67364dy(strM67440x1, c11683c5M55033ck.m55050ix()) != -1) {
                strM67440x1 = C14113y2.m67401k4(strM67440x1, c11683c5M55033ck.m55050ix(), "");
            }
        } else if (i == 111) {
            if (strM67440x1.startsWith("(") && strM67440x1.endsWith(")")) {
                strM67440x1 = c11683c5M55033ck.m55064rv() + C14113y2.m67440x1(C14113y2.m67443x1(strM67440x1, 1, strM67440x1.length() - 2));
            }
            if (C14113y2.m67364dy(strM67440x1, c11683c5M55033ck.m55050ix()) != -1 && c11683c5M55033ck.m55050ix() != c11683c5M55033ck.m55062ne()) {
            }
        } else if (i != 167) {
            if (i == 383) {
                if (C14113y2.m67364dy(strM67440x1, c11683c5M55033ck.m55040c5()) != -1) {
                    strM67440x1 = C14113y2.m67440x1(C14113y2.m67401k4(strM67440x1, c11683c5M55033ck.m55040c5(), ""));
                }
                if (strM67440x1.startsWith("(") && strM67440x1.endsWith(")")) {
                    strM67440x1 = c11683c5M55033ck.m55064rv() + C14113y2.m67440x1(C14113y2.m67443x1(strM67440x1, 1, strM67440x1.length() - 2));
                }
                if (C14113y2.m67364dy(strM67440x1, c11683c5M55033ck.m55050ix()) != -1) {
                }
            }
        }
        int i2 = i & 32;
        int i3 = i & 256;
        try {
            if (i2 == 0) {
                if (C14113y2.m67359c5(strM67440x1, i3 != 0 ? c11683c5M55033ck.m55056kk() : c11683c5M55033ck.m55062ne())) {
                    throw new FormatException();
                }
            } else {
                String strM55056kk = i3 != 0 ? c11683c5M55033ck.m55056kk() : c11683c5M55033ck.m55062ne();
                if (C14113y2.m67364dy(strM67440x1, strM55056kk) != -1) {
                    strM67440x1 = C14113y2.m67401k4(strM67440x1, strM55056kk, ".");
                }
            }
            BigDecimal bigDecimal = new BigDecimal(strM67440x1);
            if (bigDecimal.compareTo(f47170x1.f47171m9) > 0 || bigDecimal.compareTo(f47167k4.f47171m9) < 0) {
                throw new OverflowException();
            }
            c14046bvArr[0] = m66471k4(bigDecimal);
            return true;
        } catch (NumberFormatException e) {
            throw new FormatException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66475k4(String str, C14046bv[] c14046bvArr) {
        if (str == null) {
            c14046bvArr[0] = f47165du;
            return false;
        }
        try {
            return m66474k4(str, 111, null, c14046bvArr, false);
        } catch (Exception unused) {
            c14046bvArr[0] = f47165du;
            return false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static int[] m66476k4(C14046bv c14046bv) {
        boolean z;
        if (m66448ck(c14046bv, f47165du)) {
            c14046bv = m66479kk(c14046bv);
            z = true;
        } else {
            z = false;
        }
        BigDecimal scale = c14046bv.f47171m9;
        int iScale = scale.scale();
        if (iScale < 0) {
            scale = scale.setScale(0);
            iScale = 0;
        }
        byte[] byteArray = scale.unscaledValue().toByteArray();
        byte[] bArr = new byte[12];
        int length = byteArray.length - 1;
        int i = 11;
        while (i >= 0) {
            int i2 = length - 1;
            bArr[i] = byteArray[length];
            if (i2 < 0) {
                break;
            }
            i--;
            length = i2;
        }
        byte[] bArr2 = new byte[4];
        if (iScale > 0) {
            bArr2[1] = (byte) iScale;
        }
        if (z) {
            bArr2[0] = UnsignedBytes.MAX_POWER_OF_TWO;
        }
        return new int[]{C3206x1.m13894x1(new byte[]{bArr[8], bArr[9], bArr[10], bArr[11]}, 0, false), C3206x1.m13894x1(new byte[]{bArr[4], bArr[5], bArr[6], bArr[7]}, 0, false), C3206x1.m13894x1(new byte[]{bArr[0], bArr[1], bArr[2], bArr[3]}, 0, false), C3206x1.m13894x1(bArr2, 0, false)};
    }
}
