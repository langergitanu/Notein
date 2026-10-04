package com.aspose.slides.p559ms.System;

import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.InvalidCastException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.internal.p088dn.C3201m9;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.huawei.hms.network.embedded.C18177fb;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.ne */
/* JADX INFO: loaded from: classes5.dex */
public class C14080ne {

    /* JADX INFO: renamed from: k4 */
    public static byte[] f47272k4 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, PatternStyle.Wave, PatternStyle.Horizontal, PatternStyle.Vertical, PatternStyle.Cross, PatternStyle.DownwardDiagonal, PatternStyle.UpwardDiagonal, PatternStyle.DiagonalCross, 55, 56, 57, PatternStyle.Sphere, PatternStyle.Shingle};

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.ne$k4 */
    public enum k4 {
        BooleanClass(Boolean.class),
        CharClass(Character.class),
        ByteClass(Byte.class),
        ShortClass(Short.class),
        IntClass(Integer.class),
        LongClass(Long.class),
        FloatClass(Float.class),
        DoubleClass(Double.class),
        DecimalClass(C14046bv.class),
        StringClass(String.class),
        DateTimeClass(C14084qq.class),
        ObjectClass(Object.class);


        /* JADX INFO: renamed from: up */
        private final Class<?> f47286up;

        k4(Class cls) {
            this.f47286up = cls;
        }
    }

    /* JADX INFO: renamed from: c5 */
    public static long m66838c5(C14046bv c14046bv) {
        if (c14046bv == null) {
            return 0L;
        }
        if (C14046bv.m66487rv(c14046bv, C14046bv.m66500x1(LocationRequestCompat.PASSIVE_INTERVAL)) > 0 || C14046bv.m66487rv(c14046bv, C14046bv.m66500x1(Long.MIN_VALUE)) < 0) {
            throw new OverflowException();
        }
        return m66843c5(Double.valueOf(C14046bv.m66483m9(c14046bv)));
    }

    /* JADX INFO: renamed from: ck */
    public static float m66852ck(C14046bv c14046bv) {
        return C14046bv.m66456h4(c14046bv);
    }

    /* JADX INFO: renamed from: du */
    private static int m66865du(String str, int i) {
        if (str.startsWith("+")) {
            str = str.substring(1);
        }
        return Integer.parseInt(str, i);
    }

    /* JADX INFO: renamed from: dy */
    public static long m66880dy(C14046bv c14046bv) {
        return m66885dy(Double.valueOf(C14046bv.m66483m9(c14046bv)));
    }

    /* JADX INFO: renamed from: fa */
    public static double m66894fa(C14046bv c14046bv) {
        return C14046bv.m66483m9(c14046bv);
    }

    /* JADX INFO: renamed from: h4 */
    public static float m66907h4(String str) {
        return m66864ck(str, (InterfaceC14073kp) C11697x1.m55252to());
    }

    /* JADX INFO: renamed from: jd */
    public static long m66921jd(C14046bv c14046bv) {
        if (C14046bv.m66487rv(c14046bv, C14046bv.f47165du) >= 0) {
            return m66838c5(c14046bv);
        }
        throw new OverflowException();
    }

    /* JADX INFO: renamed from: k4 */
    public static byte m66935k4(String str, int i) {
        if (str == null) {
            return (byte) 0;
        }
        String[] strArr = {str};
        m66955k4(strArr, i);
        try {
            int iM66865du = m66865du(strArr[0], i);
            if (iM66865du < 0 || iM66865du > 255) {
                throw new OverflowException("Value was either too large or too small for an unsigned byte.");
            }
            return (byte) iM66865du;
        } catch (NumberFormatException e) {
            throw new FormatException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: kk */
    public static byte m66970kk(C14046bv c14046bv) {
        return m66977kk(Integer.valueOf(m66989m9(c14046bv)));
    }

    /* JADX INFO: renamed from: ks */
    private static k4 m66985ks(Object obj) {
        for (k4 k4Var : k4.values()) {
            if (k4Var.f47286up.equals(obj.getClass())) {
                return k4Var;
            }
        }
        return k4.ObjectClass;
    }

    /* JADX INFO: renamed from: m9 */
    public static double m66988m9(String str) {
        if (str == null) {
            return 0.0d;
        }
        return C14044b3.m66428k4(str, C11697x1.m55252to());
    }

    /* JADX INFO: renamed from: to */
    public static byte m67002to(C14046bv c14046bv) {
        return m67009to(Integer.valueOf(m66989m9(c14046bv)));
    }

    /* JADX INFO: renamed from: up */
    public static C14046bv m67017up(C14046bv c14046bv) {
        return c14046bv;
    }

    /* JADX INFO: renamed from: x1 */
    public static char m67030x1(C14046bv c14046bv) {
        throw new InvalidCastException("Invalid cast from 'Decimal' to 'Char'.");
    }

    /* JADX INFO: renamed from: yj */
    public static int m67046yj(Object obj) {
        if (obj == null) {
            throw new ArgumentNullException("value");
        }
        switch (C14066ix.f47252k4[m66985ks(obj).ordinal()]) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 6;
            case 4:
                return 7;
            case 5:
                return 9;
            case 6:
                return 11;
            case 7:
                return 13;
            case 8:
                return 14;
            case 9:
                return 15;
            case 10:
                return 16;
            case 11:
                return 18;
            case 12:
                return 1;
            default:
                throw new NotImplementedException();
        }
    }

    /* JADX INFO: renamed from: c5 */
    public static long m66839c5(C14084qq c14084qq) {
        throw new InvalidCastException("Invalid cast from 'DateTime' to 'Int64'.");
    }

    /* JADX INFO: renamed from: ck */
    public static float m66853ck(C14084qq c14084qq) {
        throw new InvalidCastException("Invalid cast from 'DateTime' to 'Single'.");
    }

    /* JADX INFO: renamed from: du */
    public static long m66866du(String str) {
        if (str == null) {
            return 0L;
        }
        C14046bv c14046bvM66469k4 = C14046bv.m66469k4(str);
        if (C14046bv.m66487rv(c14046bvM66469k4, C14046bv.m66500x1(LocationRequestCompat.PASSIVE_INTERVAL)) > 0 || C14046bv.m66487rv(c14046bvM66469k4, C14046bv.m66500x1(Long.MIN_VALUE)) < 0) {
            throw new OverflowException();
        }
        return m66850c5(str, (InterfaceC14073kp) C11697x1.m55252to());
    }

    /* JADX INFO: renamed from: dy */
    public static long m66881dy(C14084qq c14084qq) {
        throw new InvalidCastException("Invalid cast from 'DateTime' to 'UInt32'.");
    }

    /* JADX INFO: renamed from: fa */
    public static double m66895fa(C14084qq c14084qq) {
        throw new InvalidCastException("Invalid cast from 'DateTime' to 'Double'.");
    }

    /* JADX INFO: renamed from: h4 */
    public static int m66908h4(C14046bv c14046bv) {
        return m66915h4(Integer.valueOf(m66989m9(c14046bv)));
    }

    /* JADX INFO: renamed from: jd */
    public static long m66922jd(C14084qq c14084qq) {
        throw new InvalidCastException("Invalid cast from 'DateTime' to 'UInt64'.");
    }

    /* JADX INFO: renamed from: k4 */
    public static int m66936k4(byte[] bArr, int i, int i2, char[] cArr, int i3) {
        throw new NotImplementedException();
    }

    /* JADX INFO: renamed from: kk */
    public static byte m66971kk(C14084qq c14084qq) {
        throw new InvalidCastException("Invalid cast from 'DateTime' to 'SByte'.");
    }

    /* JADX INFO: renamed from: ks */
    public static String m66986ks(Character ch) {
        return Character.toString(ch.charValue());
    }

    /* JADX INFO: renamed from: m9 */
    public static int m66989m9(C14046bv c14046bv) {
        return m66994m9(Double.valueOf(C14046bv.m66483m9(c14046bv)));
    }

    /* JADX INFO: renamed from: to */
    public static byte m67003to(C14084qq c14084qq) {
        throw new InvalidCastException("Invalid cast from 'DateTime' to 'Byte'.");
    }

    /* JADX INFO: renamed from: up */
    public static C14046bv m67018up(C14084qq c14084qq) {
        throw new InvalidCastException("Invalid cast from 'DateTime' to 'Decimal'.");
    }

    /* JADX INFO: renamed from: x1 */
    public static char m67031x1(C14084qq c14084qq) {
        throw new InvalidCastException("Invalid cast from 'DateTime' to 'Char'.");
    }

    /* JADX INFO: renamed from: yj */
    public static C14084qq m67047yj(C14046bv c14046bv) {
        throw new InvalidCastException("Invalid cast from 'Decimal' to 'DateTime'.");
    }

    /* JADX INFO: renamed from: c5 */
    public static long m66840c5(Boolean bool) {
        return bool.booleanValue() ? 1L : 0L;
    }

    /* JADX INFO: renamed from: ck */
    public static float m66854ck(Boolean bool) {
        return bool.booleanValue() ? 1.0f : 0.0f;
    }

    /* JADX INFO: renamed from: du */
    public static short m66867du(C14046bv c14046bv) {
        return m66874du(Integer.valueOf(m66989m9(c14046bv)));
    }

    /* JADX INFO: renamed from: dy */
    public static long m66882dy(Boolean bool) {
        return bool.booleanValue() ? 1L : 0L;
    }

    /* JADX INFO: renamed from: fa */
    public static double m66896fa(Boolean bool) {
        return bool.booleanValue() ? 1.0d : 0.0d;
    }

    /* JADX INFO: renamed from: h4 */
    public static int m66909h4(C14084qq c14084qq) {
        throw new InvalidCastException("Invalid cast from 'DateTime' to 'UInt16'.");
    }

    /* JADX INFO: renamed from: jd */
    public static long m66923jd(Boolean bool) {
        return m66840c5(bool);
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC14068j5 m66937k4(int i) {
        Class cls;
        switch (i) {
            case 0:
            case 17:
                return null;
            case 1:
                cls = Object.class;
                break;
            case 2:
                cls = C14104wl.class;
                break;
            case 3:
                cls = Boolean.class;
                break;
            case 4:
                cls = C14117yj.class;
                break;
            case 5:
            case 6:
                cls = Byte.class;
                break;
            case 7:
            case 8:
                cls = Short.class;
                break;
            case 9:
            case 10:
                cls = Integer.class;
                break;
            case 11:
            case 12:
                cls = Long.class;
                break;
            case 13:
                cls = Float.class;
                break;
            case 14:
                cls = Double.class;
                break;
            case 15:
                cls = C14046bv.class;
                break;
            case 16:
                cls = C14084qq.class;
                break;
            case 18:
                cls = String.class;
                break;
            default:
                throw new ArgumentException("typeCode");
        }
        return C7019kk.m27443k4((Class<?>) cls);
    }

    /* JADX INFO: renamed from: kk */
    public static byte m66972kk(Boolean bool) {
        return bool.booleanValue() ? (byte) 1 : (byte) 0;
    }

    /* JADX INFO: renamed from: ks */
    public static String m66987ks(Object obj, InterfaceC14073kp interfaceC14073kp) {
        if (obj == null) {
            return C14113y2.f47374k4;
        }
        switch (C14066ix.f47252k4[m66985ks(obj).ordinal()]) {
            case 1:
                return m66943k4((Boolean) obj, interfaceC14073kp);
            case 2:
                return m66945k4((Character) obj, interfaceC14073kp);
            case 3:
                return m66944k4((Byte) obj, interfaceC14073kp);
            case 4:
                return m66950k4((Short) obj, interfaceC14073kp);
            case 5:
                return m66948k4((Integer) obj, interfaceC14073kp);
            case 6:
                return m66949k4((Long) obj, interfaceC14073kp);
            case 7:
                return m66947k4((Float) obj, interfaceC14073kp);
            case 8:
                return m66946k4((Double) obj, interfaceC14073kp);
            case 9:
                return m66941k4((C14046bv) obj, interfaceC14073kp);
            case 10:
                return m66942k4((C14084qq) obj, interfaceC14073kp);
            case 11:
                return m67058yj((String) obj, interfaceC14073kp);
            default:
                InterfaceC14090sv interfaceC14090sv = (InterfaceC14090sv) C7019kk.m27452k4(obj, InterfaceC14090sv.class);
                if (interfaceC14090sv != null) {
                    return interfaceC14090sv.mo66521ks(interfaceC14073kp);
                }
                InterfaceC14061gi interfaceC14061gi = (InterfaceC14061gi) C7019kk.m27452k4(obj, InterfaceC14061gi.class);
                return interfaceC14061gi != null ? interfaceC14061gi.mo66517k4(null, interfaceC14073kp) : obj.toString();
        }
    }

    /* JADX INFO: renamed from: m9 */
    public static int m66990m9(C14084qq c14084qq) {
        throw new InvalidCastException("Invalid cast from 'DateTime' to 'Int32'.");
    }

    /* JADX INFO: renamed from: to */
    public static byte m67004to(Boolean bool) {
        return bool.booleanValue() ? (byte) 1 : (byte) 0;
    }

    /* JADX INFO: renamed from: up */
    public static C14046bv m67019up(Boolean bool) {
        return C14046bv.m66477kk(bool.booleanValue() ? 1 : 0);
    }

    /* JADX INFO: renamed from: x1 */
    public static char m67032x1(Boolean bool) {
        throw new InvalidCastException("Invalid cast from 'Boolean' to 'Char'.");
    }

    /* JADX INFO: renamed from: yj */
    public static C14084qq m67048yj(C14084qq c14084qq) {
        return c14084qq;
    }

    /* JADX INFO: renamed from: c5 */
    public static long m66841c5(Byte b) {
        return b.byteValue() & 255;
    }

    /* JADX INFO: renamed from: ck */
    public static float m66855ck(Byte b) {
        return b.byteValue() & 255;
    }

    /* JADX INFO: renamed from: du */
    public static short m66868du(C14084qq c14084qq) {
        throw new InvalidCastException("Invalid cast from 'DateTime' to 'Int16'.");
    }

    /* JADX INFO: renamed from: dy */
    public static long m66883dy(Byte b) {
        return b.byteValue() & 255;
    }

    /* JADX INFO: renamed from: fa */
    public static double m66897fa(Byte b) {
        return b.byteValue() & 255;
    }

    /* JADX INFO: renamed from: h4 */
    public static int m66910h4(Boolean bool) {
        return bool.booleanValue() ? 1 : 0;
    }

    /* JADX INFO: renamed from: jd */
    public static long m66924jd(Byte b) {
        return m66845c5(Integer.valueOf(b.byteValue() & 255));
    }

    /* JADX INFO: renamed from: k4 */
    public static Object m66938k4(Object obj, int i, InterfaceC14073kp interfaceC14073kp) {
        return m66939k4(obj, m66937k4(i), interfaceC14073kp, true);
    }

    /* JADX INFO: renamed from: kk */
    public static byte m66973kk(Byte b) {
        return b.byteValue();
    }

    /* JADX INFO: renamed from: m9 */
    public static int m66991m9(Boolean bool) {
        return bool.booleanValue() ? 1 : 0;
    }

    /* JADX INFO: renamed from: to */
    public static byte m67005to(Byte b) {
        return b.byteValue();
    }

    /* JADX INFO: renamed from: up */
    public static C14046bv m67020up(Byte b) {
        return C14046bv.m66461k4(b.byteValue());
    }

    /* JADX INFO: renamed from: x1 */
    public static char m67033x1(Byte b) {
        return (char) (b.byteValue() & 255);
    }

    /* JADX INFO: renamed from: yj */
    public static C14084qq m67049yj(Boolean bool) {
        throw new InvalidCastException("Invalid cast from 'Boolean' to 'DateTime'.");
    }

    /* JADX INFO: renamed from: c5 */
    public static long m66842c5(Character ch) {
        return ch.charValue();
    }

    /* JADX INFO: renamed from: ck */
    public static float m66856ck(Character ch) {
        throw new InvalidCastException("Invalid cast from 'Character' to 'Single'.");
    }

    /* JADX INFO: renamed from: du */
    public static short m66869du(Boolean bool) {
        return bool.booleanValue() ? (short) 1 : (short) 0;
    }

    /* JADX INFO: renamed from: dy */
    public static long m66884dy(Character ch) {
        return ch.charValue();
    }

    /* JADX INFO: renamed from: fa */
    public static double m66898fa(Character ch) {
        throw new InvalidCastException("Invalid cast from 'Character' to 'Double'.");
    }

    /* JADX INFO: renamed from: h4 */
    public static int m66911h4(Byte b) {
        return b.byteValue() & 255;
    }

    /* JADX INFO: renamed from: jd */
    public static long m66925jd(Character ch) {
        return m66842c5(ch);
    }

    /* JADX INFO: renamed from: k4 */
    private static Object m66939k4(Object obj, AbstractC14068j5 abstractC14068j5, InterfaceC14073kp interfaceC14073kp, boolean z) {
        if (obj == null) {
            if (abstractC14068j5 == null || !abstractC14068j5.m66758v4()) {
                return null;
            }
            throw new InvalidCastException("Null object can not be converted to a value type.");
        }
        if (abstractC14068j5 == null) {
            throw new InvalidCastException("Cannot cast to destination type.");
        }
        if (C7019kk.m27443k4(obj.getClass()) != abstractC14068j5 && abstractC14068j5 != m66937k4(1)) {
            if (abstractC14068j5 == m66937k4(2)) {
                throw new InvalidCastException("Cannot cast to DBNull, it's not IConvertible");
            }
            if (abstractC14068j5 == m66937k4(3)) {
                return Boolean.valueOf(m66966k4(obj, interfaceC14073kp));
            }
            if (abstractC14068j5 == m66937k4(4)) {
                return Character.valueOf(m67040x1(obj, interfaceC14073kp));
            }
            if (abstractC14068j5 == m66937k4(5)) {
                return Byte.valueOf(m66980kk(obj, interfaceC14073kp));
            }
            if (abstractC14068j5 == m66937k4(6)) {
                return Byte.valueOf(m67012to(obj, interfaceC14073kp));
            }
            if (abstractC14068j5 == m66937k4(7)) {
                return Short.valueOf(m66877du(obj, interfaceC14073kp));
            }
            if (abstractC14068j5 == m66937k4(8)) {
                return Integer.valueOf(m66918h4(obj, interfaceC14073kp));
            }
            if (abstractC14068j5 == m66937k4(9)) {
                return Integer.valueOf(m66999m9(obj, interfaceC14073kp));
            }
            if (abstractC14068j5 == m66937k4(10)) {
                return Long.valueOf(m66890dy(obj, interfaceC14073kp));
            }
            if (abstractC14068j5 == m66937k4(11)) {
                return Long.valueOf(m66848c5(obj, interfaceC14073kp));
            }
            if (abstractC14068j5 == m66937k4(12)) {
                return Long.valueOf(m66931jd(obj, interfaceC14073kp));
            }
            if (abstractC14068j5 == m66937k4(13)) {
                return Float.valueOf(m66862ck(obj, interfaceC14073kp));
            }
            if (abstractC14068j5 == m66937k4(14)) {
                return Double.valueOf(m66904fa(obj, interfaceC14073kp));
            }
            if (abstractC14068j5 == m66937k4(15)) {
                return m67026up(obj, interfaceC14073kp);
            }
            if (abstractC14068j5 == m66937k4(16)) {
                return m67056yj(obj, interfaceC14073kp);
            }
            if (abstractC14068j5 == m66937k4(18)) {
                return m66987ks(obj, interfaceC14073kp);
            }
            if (!z) {
                throw new InvalidCastException("Value is not a convertible object: " + C7019kk.m27443k4(obj.getClass()).toString() + " to " + abstractC14068j5.mo48629x6());
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: kk */
    public static byte m66974kk(Character ch) {
        if (ch.charValue() <= 127) {
            return (byte) ch.charValue();
        }
        throw new OverflowException("Value was either too large or too small for a signed byte.");
    }

    /* JADX INFO: renamed from: m9 */
    public static int m66992m9(Byte b) {
        return b.byteValue() & 255;
    }

    /* JADX INFO: renamed from: to */
    public static byte m67006to(Character ch) {
        if (ch.charValue() <= 255) {
            return (byte) (ch.charValue() & 255);
        }
        throw new OverflowException("Value was either too large or too small for an unsigned byte.");
    }

    /* JADX INFO: renamed from: up */
    public static C14046bv m67021up(Character ch) {
        throw new InvalidCastException("Invalid cast from 'Character' to 'Decimal'.");
    }

    /* JADX INFO: renamed from: x1 */
    public static char m67034x1(Character ch) {
        return ch.charValue();
    }

    /* JADX INFO: renamed from: yj */
    public static C14084qq m67050yj(Byte b) {
        throw new InvalidCastException("Invalid cast from 'Byte' to 'DateTime'.");
    }

    /* JADX INFO: renamed from: c5 */
    public static long m66843c5(Double d) {
        if (d.doubleValue() > 9.223372036854776E18d || d.doubleValue() < -9.223372036854776E18d) {
            throw new OverflowException();
        }
        return Double.valueOf(C14116yg.m67497to(d.doubleValue())).longValue();
    }

    /* JADX INFO: renamed from: ck */
    public static float m66857ck(Double d) {
        return d.floatValue();
    }

    /* JADX INFO: renamed from: du */
    public static short m66870du(Byte b) {
        return (short) (b.byteValue() & 255);
    }

    /* JADX INFO: renamed from: dy */
    public static long m66885dy(Double d) {
        if (d.doubleValue() < -0.5d || d.doubleValue() >= 4.2949672955E9d) {
            throw new OverflowException("Value was either too large or too small for a UInt32.");
        }
        long jLongValue = d.longValue();
        double dDoubleValue = d.doubleValue() - (4294967295L & jLongValue);
        return (dDoubleValue > 0.5d || (dDoubleValue == 0.5d && (jLongValue & 1) != 0)) ? jLongValue + 1 : jLongValue;
    }

    /* JADX INFO: renamed from: fa */
    public static double m66899fa(Double d) {
        return d.doubleValue();
    }

    /* JADX INFO: renamed from: h4 */
    public static int m66912h4(Character ch) {
        return ch.charValue();
    }

    /* JADX INFO: renamed from: jd */
    public static long m66926jd(Double d) {
        if (d.doubleValue() >= 0.0d) {
            return m66843c5(d);
        }
        throw new OverflowException();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66940k4(int i, int i2) {
        if (i2 != 2 && i2 != 8 && i2 != 10 && i2 != 16) {
            throw new ArgumentException("Invalid Base.");
        }
        String string = Integer.toString(i, i2);
        return (i2 == 10 || !string.startsWith(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR)) ? string : string.substring(1);
    }

    /* JADX INFO: renamed from: kk */
    public static byte m66975kk(Double d) {
        return m66977kk(Integer.valueOf(m66994m9(d)));
    }

    /* JADX INFO: renamed from: m9 */
    public static int m66993m9(Character ch) {
        return ch.charValue();
    }

    /* JADX INFO: renamed from: to */
    public static byte m67007to(Double d) {
        return m67009to(Integer.valueOf(m66994m9(d)));
    }

    /* JADX INFO: renamed from: up */
    public static C14046bv m67022up(Double d) {
        return C14046bv.m66497x1(d.doubleValue());
    }

    /* JADX INFO: renamed from: x1 */
    public static char m67035x1(Double d) {
        throw new InvalidCastException("Invalid cast from 'Double' to 'Char'.");
    }

    /* JADX INFO: renamed from: yj */
    public static C14084qq m67051yj(Character ch) {
        throw new InvalidCastException("Invalid cast from 'Character' to 'DateTime'.");
    }

    /* JADX INFO: renamed from: c5 */
    public static long m66844c5(Float f) {
        return m66843c5(Double.valueOf(f.floatValue()));
    }

    /* JADX INFO: renamed from: ck */
    public static float m66858ck(Float f) {
        return f.floatValue();
    }

    /* JADX INFO: renamed from: du */
    public static short m66871du(Character ch) {
        if (ch.charValue() <= 32767) {
            return (short) ch.charValue();
        }
        throw new OverflowException("Value was either too large or too small for an Int16.");
    }

    /* JADX INFO: renamed from: dy */
    public static long m66886dy(Float f) {
        return m66885dy(Double.valueOf(f.floatValue()));
    }

    /* JADX INFO: renamed from: fa */
    public static double m66900fa(Float f) {
        return f.floatValue();
    }

    /* JADX INFO: renamed from: h4 */
    public static int m66913h4(Double d) {
        return m66915h4(Integer.valueOf(m66994m9(d)));
    }

    /* JADX INFO: renamed from: jd */
    public static long m66927jd(Float f) {
        return m66926jd(Double.valueOf(f.floatValue()));
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66941k4(C14046bv c14046bv, InterfaceC14073kp interfaceC14073kp) {
        return c14046bv.mo66517k4((String) null, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: kk */
    public static byte m66976kk(Float f) {
        return m66975kk(Double.valueOf(f.floatValue()));
    }

    /* JADX INFO: renamed from: m9 */
    public static int m66994m9(Double d) {
        if (d.doubleValue() >= 0.0d) {
            if (d.doubleValue() < 2.1474836475E9d) {
                int iIntValue = d.intValue();
                double dDoubleValue = d.doubleValue() - ((double) iIntValue);
                return (dDoubleValue > 0.5d || (dDoubleValue == 0.5d && (iIntValue & 1) != 0)) ? iIntValue + 1 : iIntValue;
            }
        } else if (d.doubleValue() >= -2.1474836485E9d) {
            int iIntValue2 = d.intValue();
            double dDoubleValue2 = d.doubleValue() - ((double) iIntValue2);
            return (dDoubleValue2 < -0.5d || (dDoubleValue2 == -0.5d && (iIntValue2 & 1) != 0)) ? iIntValue2 - 1 : iIntValue2;
        }
        throw new OverflowException("Value was either too large or too small for an Int32.");
    }

    /* JADX INFO: renamed from: to */
    public static byte m67008to(Float f) {
        return m67007to(Double.valueOf(f.floatValue()));
    }

    /* JADX INFO: renamed from: up */
    public static C14046bv m67023up(Float f) {
        return C14046bv.m66498x1(f.floatValue());
    }

    /* JADX INFO: renamed from: x1 */
    public static char m67036x1(Float f) {
        throw new InvalidCastException("Invalid cast from 'Float' to 'Char'.");
    }

    /* JADX INFO: renamed from: yj */
    public static C14084qq m67052yj(Double d) {
        throw new InvalidCastException("Invalid cast from 'Double' to 'DateTime'.");
    }

    /* JADX INFO: renamed from: c5 */
    public static long m66845c5(Integer num) {
        return num.intValue();
    }

    /* JADX INFO: renamed from: ck */
    public static float m66859ck(Integer num) {
        return num.intValue();
    }

    /* JADX INFO: renamed from: du */
    public static short m66872du(Double d) {
        return m66874du(Integer.valueOf(m66994m9(d)));
    }

    /* JADX INFO: renamed from: dy */
    public static long m66887dy(Integer num) {
        if (num.intValue() >= 0) {
            return num.intValue();
        }
        throw new OverflowException("Value was either too large or too small for a UInt32.");
    }

    /* JADX INFO: renamed from: fa */
    public static double m66901fa(Integer num) {
        return num.intValue();
    }

    /* JADX INFO: renamed from: h4 */
    public static int m66914h4(Float f) {
        return m66913h4(Double.valueOf(f.floatValue()));
    }

    /* JADX INFO: renamed from: jd */
    public static long m66928jd(Integer num) {
        if (num.intValue() >= 0) {
            return m66845c5(num);
        }
        throw new OverflowException();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66942k4(C14084qq c14084qq, InterfaceC14073kp interfaceC14073kp) {
        return c14084qq.mo66517k4((String) null, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: kk */
    public static byte m66977kk(Integer num) {
        if (num.intValue() < -128 || num.intValue() > 127) {
            throw new OverflowException("Value was either too large or too small for a signed byte.");
        }
        return num.byteValue();
    }

    /* JADX INFO: renamed from: m9 */
    public static int m66995m9(Float f) {
        return m66994m9(Double.valueOf(f.floatValue()));
    }

    /* JADX INFO: renamed from: to */
    public static byte m67009to(Integer num) {
        if (num.intValue() < 0 || num.intValue() > 255) {
            throw new OverflowException("Value was either too large or too small for an unsigned byte.");
        }
        return (byte) (num.intValue() & 255);
    }

    /* JADX INFO: renamed from: up */
    public static C14046bv m67024up(Integer num) {
        return C14046bv.m66477kk(num.intValue());
    }

    /* JADX INFO: renamed from: x1 */
    public static char m67037x1(Integer num) {
        if (num.intValue() < 0 || num.intValue() > 65535) {
            throw new OverflowException("Value was either too large or too small for a character.");
        }
        return (char) num.intValue();
    }

    /* JADX INFO: renamed from: yj */
    public static C14084qq m67053yj(Float f) {
        throw new InvalidCastException("Invalid cast from 'Float' to 'DateTime'.");
    }

    /* JADX INFO: renamed from: c5 */
    public static long m66846c5(Long l) {
        return l.longValue();
    }

    /* JADX INFO: renamed from: ck */
    public static float m66860ck(Long l) {
        return l.longValue();
    }

    /* JADX INFO: renamed from: du */
    public static short m66873du(Float f) {
        return m66872du(Double.valueOf(f.floatValue()));
    }

    /* JADX INFO: renamed from: dy */
    public static long m66888dy(Long l) {
        if (l.longValue() < 0 || l.longValue() > 4294967295L) {
            throw new OverflowException("Value was either too large or too small for a UInt32.");
        }
        return l.longValue();
    }

    /* JADX INFO: renamed from: fa */
    public static double m66902fa(Long l) {
        return l.longValue();
    }

    /* JADX INFO: renamed from: h4 */
    public static int m66915h4(Integer num) {
        if (num.intValue() < 0 || num.intValue() > 65535) {
            throw new OverflowException("Value was either too large or too small for a UInt16.");
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: jd */
    public static long m66929jd(Long l) {
        if (l.longValue() >= 0) {
            return m66846c5(l);
        }
        throw new OverflowException();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66943k4(Boolean bool, InterfaceC14073kp interfaceC14073kp) {
        return C14051ck.m66557x1(bool.booleanValue());
    }

    /* JADX INFO: renamed from: kk */
    public static byte m66978kk(Long l) {
        if (l.longValue() < -128 || l.longValue() > 127) {
            throw new OverflowException("Value was either too large or too small for a signed byte.");
        }
        return l.byteValue();
    }

    /* JADX INFO: renamed from: m9 */
    public static int m66996m9(Integer num) {
        return num.intValue();
    }

    /* JADX INFO: renamed from: to */
    public static byte m67010to(Long l) {
        if (l.longValue() < 0 || l.longValue() > 255) {
            throw new OverflowException("Value was either too large or too small for an unsigned byte.");
        }
        return (byte) (l.longValue() & 255);
    }

    /* JADX INFO: renamed from: up */
    public static C14046bv m67025up(Long l) {
        return C14046bv.m66450du(l.longValue());
    }

    /* JADX INFO: renamed from: x1 */
    public static char m67038x1(Long l) {
        if (l.longValue() < 0 || l.longValue() > C18177fb.f54859s) {
            throw new OverflowException("Value was either too large or too small for a character.");
        }
        return (char) l.longValue();
    }

    /* JADX INFO: renamed from: yj */
    public static C14084qq m67054yj(Integer num) {
        throw new InvalidCastException("Invalid cast from 'Integer' to 'DateTime'.");
    }

    /* JADX INFO: renamed from: c5 */
    public static long m66847c5(Object obj) {
        return m66848c5(obj, C11697x1.m55252to());
    }

    /* JADX INFO: renamed from: ck */
    public static float m66861ck(Object obj) {
        return m66862ck(obj, C11697x1.m55252to());
    }

    /* JADX INFO: renamed from: du */
    public static short m66874du(Integer num) {
        if (num.intValue() < -32768 || num.intValue() > 32767) {
            throw new OverflowException("Value was either too large or too small for an Int16.");
        }
        return num.shortValue();
    }

    /* JADX INFO: renamed from: dy */
    public static long m66889dy(Object obj) {
        return m66890dy(obj, C11697x1.m55252to());
    }

    /* JADX INFO: renamed from: fa */
    public static double m66903fa(Object obj) {
        return m66904fa(obj, C11697x1.m55252to());
    }

    /* JADX INFO: renamed from: h4 */
    public static int m66916h4(Long l) {
        if (l.longValue() < 0 || l.longValue() > C18177fb.f54859s) {
            throw new OverflowException("Value was either too large or too small for a UInt16.");
        }
        return l.intValue();
    }

    /* JADX INFO: renamed from: jd */
    public static long m66930jd(Object obj) {
        return m66931jd(obj, C11697x1.m55252to());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66944k4(Byte b, InterfaceC14073kp interfaceC14073kp) {
        return C14098up.m67319k4(b.byteValue(), interfaceC14073kp);
    }

    /* JADX INFO: renamed from: kk */
    public static byte m66979kk(Object obj) {
        return m67012to(obj, C11697x1.m55252to());
    }

    /* JADX INFO: renamed from: m9 */
    public static int m66997m9(Long l) {
        if (l.longValue() < -2147483648L || l.longValue() > 2147483647L) {
            throw new OverflowException("Value was either too large or too small for an Int32.");
        }
        return l.intValue();
    }

    /* JADX INFO: renamed from: to */
    public static byte m67011to(Object obj) {
        return m66980kk(obj, C11697x1.m55252to());
    }

    /* JADX INFO: renamed from: up */
    public static C14046bv m67026up(Object obj, InterfaceC14073kp interfaceC14073kp) {
        if (obj == null) {
            return C14046bv.f47165du;
        }
        switch (C14066ix.f47252k4[m66985ks(obj).ordinal()]) {
            case 1:
                return m67019up((Boolean) obj);
            case 2:
                return m67021up((Character) obj);
            case 3:
                return m67020up((Byte) obj);
            case 4:
                return m67027up((Short) obj);
            case 5:
                return m67024up((Integer) obj);
            case 6:
                return m67025up((Long) obj);
            case 7:
                return m67023up((Float) obj);
            case 8:
                return m67022up((Double) obj);
            case 9:
                return m67017up((C14046bv) obj);
            case 10:
                return m67018up((C14084qq) obj);
            case 11:
                return m67028up((String) obj, interfaceC14073kp);
            default:
                return ((InterfaceC14090sv) obj).mo66511du(interfaceC14073kp);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static char m67039x1(Object obj) {
        if (obj == null) {
            return (char) 0;
        }
        return m67040x1(obj, C11697x1.m55252to());
    }

    /* JADX INFO: renamed from: yj */
    public static C14084qq m67055yj(Long l) {
        throw new InvalidCastException("Invalid cast from 'Long' to 'DateTime'.");
    }

    /* JADX INFO: renamed from: c5 */
    public static long m66848c5(Object obj, InterfaceC14073kp interfaceC14073kp) {
        if (obj == null) {
            return 0L;
        }
        switch (C14066ix.f47252k4[m66985ks(obj).ordinal()]) {
            case 1:
                return m66840c5((Boolean) obj);
            case 2:
                return m66842c5((Character) obj);
            case 3:
                return m66841c5((Byte) obj);
            case 4:
                return m66849c5((Short) obj);
            case 5:
                return m66845c5((Integer) obj);
            case 6:
                return m66846c5((Long) obj);
            case 7:
                return m66844c5((Float) obj);
            case 8:
                return m66843c5((Double) obj);
            case 9:
                return m66838c5((C14046bv) obj);
            case 10:
                return m66839c5((C14084qq) obj);
            case 11:
                return m66850c5((String) obj, interfaceC14073kp);
            default:
                return ((InterfaceC14090sv) obj).mo66508c5(interfaceC14073kp);
        }
    }

    /* JADX INFO: renamed from: ck */
    public static float m66862ck(Object obj, InterfaceC14073kp interfaceC14073kp) {
        if (obj == null) {
            return 0.0f;
        }
        switch (C14066ix.f47252k4[m66985ks(obj).ordinal()]) {
            case 1:
                return m66854ck((Boolean) obj);
            case 2:
                return m66856ck((Character) obj);
            case 3:
                return m66855ck((Byte) obj);
            case 4:
                return m66863ck((Short) obj);
            case 5:
                return m66859ck((Integer) obj);
            case 6:
                return m66860ck((Long) obj);
            case 7:
                return m66858ck((Float) obj);
            case 8:
                return m66857ck((Double) obj);
            case 9:
                return m66852ck((C14046bv) obj);
            case 10:
                return m66853ck((C14084qq) obj);
            case 11:
                return m66864ck((String) obj, interfaceC14073kp);
            default:
                return ((InterfaceC14090sv) obj).mo66509ck(interfaceC14073kp);
        }
    }

    /* JADX INFO: renamed from: du */
    public static short m66875du(Long l) {
        if (l.longValue() < -32768 || l.longValue() > 32767) {
            throw new OverflowException("Value was either too large or too small for an Int16.");
        }
        return l.shortValue();
    }

    /* JADX INFO: renamed from: dy */
    public static long m66890dy(Object obj, InterfaceC14073kp interfaceC14073kp) {
        if (obj == null) {
            return 0L;
        }
        switch (C14066ix.f47252k4[m66985ks(obj).ordinal()]) {
            case 1:
                return m66882dy((Boolean) obj);
            case 2:
                return m66884dy((Character) obj);
            case 3:
                return m66883dy((Byte) obj);
            case 4:
                return m66891dy((Short) obj);
            case 5:
                return m66887dy((Integer) obj);
            case 6:
                return m66888dy((Long) obj);
            case 7:
                return m66886dy((Float) obj);
            case 8:
                return m66885dy((Double) obj);
            case 9:
                return m66880dy((C14046bv) obj);
            case 10:
                return m66881dy((C14084qq) obj);
            case 11:
                return m66892dy((String) obj, interfaceC14073kp);
            default:
                return ((InterfaceC14090sv) obj).mo66524up(interfaceC14073kp);
        }
    }

    /* JADX INFO: renamed from: fa */
    public static double m66904fa(Object obj, InterfaceC14073kp interfaceC14073kp) {
        if (obj == null) {
            return 0.0d;
        }
        switch (C14066ix.f47252k4[m66985ks(obj).ordinal()]) {
            case 1:
                return m66896fa((Boolean) obj);
            case 2:
                return m66898fa((Character) obj);
            case 3:
                return m66897fa((Byte) obj);
            case 4:
                return m66905fa((Short) obj);
            case 5:
                return m66901fa((Integer) obj);
            case 6:
                return m66902fa((Long) obj);
            case 7:
                return m66900fa((Float) obj);
            case 8:
                return m66899fa((Double) obj);
            case 9:
                return m66894fa((C14046bv) obj);
            case 10:
                return m66895fa((C14084qq) obj);
            case 11:
                return m66906fa((String) obj, interfaceC14073kp);
            default:
                return ((InterfaceC14090sv) obj).mo66514h4(interfaceC14073kp);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public static int m66917h4(Object obj) {
        return m66918h4(obj, C11697x1.m55252to());
    }

    /* JADX INFO: renamed from: jd */
    public static long m66931jd(Object obj, InterfaceC14073kp interfaceC14073kp) {
        if (obj == null) {
            return 0L;
        }
        switch (C14066ix.f47252k4[m66985ks(obj).ordinal()]) {
            case 1:
                return m66923jd((Boolean) obj);
            case 2:
                return m66925jd((Character) obj);
            case 3:
                return m66924jd((Byte) obj);
            case 4:
                return m66932jd((Short) obj);
            case 5:
                return m66928jd((Integer) obj);
            case 6:
                return m66929jd((Long) obj);
            case 7:
                return m66927jd((Float) obj);
            case 8:
                return m66926jd((Double) obj);
            case 9:
                return m66921jd((C14046bv) obj);
            case 10:
                return m66922jd((C14084qq) obj);
            case 11:
                return m66933jd((String) obj, interfaceC14073kp);
            default:
                return ((InterfaceC14090sv) obj).mo66528yj(interfaceC14073kp);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66945k4(Character ch, InterfaceC14073kp interfaceC14073kp) {
        return Character.toString(ch.charValue());
    }

    /* JADX INFO: renamed from: kk */
    public static byte m66980kk(Object obj, InterfaceC14073kp interfaceC14073kp) {
        if (obj == null) {
            return (byte) 0;
        }
        switch (C14066ix.f47252k4[m66985ks(obj).ordinal()]) {
            case 1:
                return m66972kk((Boolean) obj);
            case 2:
                return m66974kk((Character) obj);
            case 3:
                return m66973kk((Byte) obj);
            case 4:
                return m66981kk((Short) obj);
            case 5:
                return m66977kk((Integer) obj);
            case 6:
                return m66978kk((Long) obj);
            case 7:
                return m66976kk((Float) obj);
            case 8:
                return m66975kk((Double) obj);
            case 9:
                return m66970kk((C14046bv) obj);
            case 10:
                return m66971kk((C14084qq) obj);
            case 11:
                return m66983kk((String) obj, interfaceC14073kp);
            default:
                return ((InterfaceC14090sv) obj).mo66515jd(interfaceC14073kp);
        }
    }

    /* JADX INFO: renamed from: m9 */
    public static int m66998m9(Object obj) {
        return m66999m9(obj, C11697x1.m55252to());
    }

    /* JADX INFO: renamed from: to */
    public static byte m67012to(Object obj, InterfaceC14073kp interfaceC14073kp) {
        if (obj == null) {
            return (byte) 0;
        }
        switch (C14066ix.f47252k4[m66985ks(obj).ordinal()]) {
            case 1:
                return m67004to((Boolean) obj);
            case 2:
                return m67006to((Character) obj);
            case 3:
                return m67005to((Byte) obj);
            case 4:
                return m67013to((Short) obj);
            case 5:
                return m67009to((Integer) obj);
            case 6:
                return m67010to((Long) obj);
            case 7:
                return m67008to((Float) obj);
            case 8:
                return m67007to((Double) obj);
            case 9:
                return m67002to((C14046bv) obj);
            case 10:
                return m67003to((C14084qq) obj);
            case 11:
                return m67014to((String) obj, interfaceC14073kp);
            default:
                return ((InterfaceC14090sv) obj).mo66526x1(interfaceC14073kp);
        }
    }

    /* JADX INFO: renamed from: up */
    public static C14046bv m67027up(Short sh) {
        return C14046bv.m66472k4(sh.shortValue());
    }

    /* JADX INFO: renamed from: x1 */
    public static char m67040x1(Object obj, InterfaceC14073kp interfaceC14073kp) {
        if (obj == null) {
            return (char) 0;
        }
        switch (C14066ix.f47252k4[m66985ks(obj).ordinal()]) {
            case 1:
                return m67032x1((Boolean) obj);
            case 2:
                return m67034x1((Character) obj);
            case 3:
                return m67033x1((Byte) obj);
            case 4:
                return m67041x1((Short) obj);
            case 5:
                return m67037x1((Integer) obj);
            case 6:
                return m67038x1((Long) obj);
            case 7:
                return m67036x1((Float) obj);
            case 8:
                return m67035x1((Double) obj);
            case 9:
                return m67030x1((C14046bv) obj);
            case 10:
                return m67031x1((C14084qq) obj);
            case 11:
                return m67043x1((String) obj, interfaceC14073kp);
            default:
                return ((InterfaceC14090sv) obj).mo66520kk(interfaceC14073kp);
        }
    }

    /* JADX INFO: renamed from: yj */
    public static C14084qq m67056yj(Object obj, InterfaceC14073kp interfaceC14073kp) {
        if (obj == null) {
            return C14084qq.f47299x1.Clone();
        }
        switch (C14066ix.f47252k4[m66985ks(obj).ordinal()]) {
            case 1:
                return m67049yj((Boolean) obj);
            case 2:
                return m67051yj((Character) obj);
            case 3:
                return m67050yj((Byte) obj);
            case 4:
                return m67057yj((Short) obj);
            case 5:
                return m67054yj((Integer) obj);
            case 6:
                return m67055yj((Long) obj);
            case 7:
                return m67053yj((Float) obj);
            case 8:
                return m67052yj((Double) obj);
            case 9:
                return m67047yj((C14046bv) obj);
            case 10:
                return m67048yj((C14084qq) obj);
            case 11:
                return m66893dy((String) obj);
            default:
                return ((InterfaceC14090sv) obj).mo66523to(interfaceC14073kp);
        }
    }

    /* JADX INFO: renamed from: c5 */
    public static long m66849c5(Short sh) {
        return sh.shortValue();
    }

    /* JADX INFO: renamed from: ck */
    public static float m66863ck(Short sh) {
        return sh.shortValue();
    }

    /* JADX INFO: renamed from: du */
    public static short m66876du(Object obj) {
        return m66877du(obj, C11697x1.m55252to());
    }

    /* JADX INFO: renamed from: dy */
    public static long m66891dy(Short sh) {
        if (sh.shortValue() >= 0) {
            return sh.shortValue();
        }
        throw new OverflowException("Value was either too large or too small for a UInt32.");
    }

    /* JADX INFO: renamed from: fa */
    public static double m66905fa(Short sh) {
        return sh.shortValue();
    }

    /* JADX INFO: renamed from: h4 */
    public static int m66918h4(Object obj, InterfaceC14073kp interfaceC14073kp) {
        if (obj == null) {
            return 0;
        }
        switch (C14066ix.f47252k4[m66985ks(obj).ordinal()]) {
            case 1:
                return m66910h4((Boolean) obj);
            case 2:
                return m66912h4((Character) obj);
            case 3:
                return m66911h4((Byte) obj);
            case 4:
                return m66919h4((Short) obj);
            case 5:
                return m66915h4((Integer) obj);
            case 6:
                return m66916h4((Long) obj);
            case 7:
                return m66914h4((Float) obj);
            case 8:
                return m66913h4((Double) obj);
            case 9:
                return m66908h4((C14046bv) obj);
            case 10:
                return m66909h4((C14084qq) obj);
            case 11:
                return m66920h4((String) obj, interfaceC14073kp);
            default:
                return ((InterfaceC14090sv) obj).mo66513fa(interfaceC14073kp);
        }
    }

    /* JADX INFO: renamed from: jd */
    public static long m66932jd(Short sh) {
        if (sh.shortValue() >= 0) {
            return m66849c5(sh);
        }
        throw new OverflowException();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66946k4(Double d, InterfaceC14073kp interfaceC14073kp) {
        return C14044b3.m66432k4(d.doubleValue(), interfaceC14073kp);
    }

    /* JADX INFO: renamed from: kk */
    public static byte m66981kk(Short sh) {
        if (sh.shortValue() < -128 || sh.shortValue() > 127) {
            throw new OverflowException("Value was either too large or too small for a signed byte.");
        }
        return sh.byteValue();
    }

    /* JADX INFO: renamed from: m9 */
    public static int m66999m9(Object obj, InterfaceC14073kp interfaceC14073kp) {
        if (obj == null) {
            return 0;
        }
        switch (C14066ix.f47252k4[m66985ks(obj).ordinal()]) {
            case 1:
                return m66991m9((Boolean) obj);
            case 2:
                return m66993m9((Character) obj);
            case 3:
                return m66992m9((Byte) obj);
            case 4:
                return m67000m9((Short) obj);
            case 5:
                return m66996m9((Integer) obj);
            case 6:
                return m66997m9((Long) obj);
            case 7:
                return m66995m9((Float) obj);
            case 8:
                return m66994m9((Double) obj);
            case 9:
                return m66989m9((C14046bv) obj);
            case 10:
                return m66990m9((C14084qq) obj);
            case 11:
                return m67001m9((String) obj, interfaceC14073kp);
            default:
                return ((InterfaceC14090sv) obj).mo66512dy(interfaceC14073kp);
        }
    }

    /* JADX INFO: renamed from: to */
    public static byte m67013to(Short sh) {
        if (sh.shortValue() < 0 || sh.shortValue() > 255) {
            throw new OverflowException("Value was either too large or too small for an unsigned byte.");
        }
        return (byte) (sh.shortValue() & 255);
    }

    /* JADX INFO: renamed from: up */
    public static C14046bv m67028up(String str, InterfaceC14073kp interfaceC14073kp) {
        return str == null ? C14046bv.f47165du : C14046bv.m66470k4(str, 111, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: x1 */
    public static char m67041x1(Short sh) {
        if (sh.shortValue() >= 0) {
            return (char) sh.shortValue();
        }
        throw new OverflowException("Value was either too large or too small for a character.");
    }

    /* JADX INFO: renamed from: yj */
    public static C14084qq m67057yj(Short sh) {
        throw new InvalidCastException("Invalid cast from 'Short' to 'DateTime'.");
    }

    /* JADX INFO: renamed from: c5 */
    public static long m66850c5(String str, InterfaceC14073kp interfaceC14073kp) {
        if (str == null) {
            return 0L;
        }
        C14046bv c14046bvM66469k4 = C14046bv.m66469k4(str);
        if (C14046bv.m66487rv(c14046bvM66469k4, C14046bv.m66500x1(LocationRequestCompat.PASSIVE_INTERVAL)) > 0 || C14046bv.m66487rv(c14046bvM66469k4, C14046bv.m66500x1(Long.MIN_VALUE)) < 0) {
            throw new OverflowException();
        }
        return C14091t6.m67185k4(str, 7, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: ck */
    public static float m66864ck(String str, InterfaceC14073kp interfaceC14073kp) {
        if (str == null) {
            return 0.0f;
        }
        return C14064he.m66706k4(str, 231, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: du */
    public static short m66877du(Object obj, InterfaceC14073kp interfaceC14073kp) {
        if (obj == null) {
            return (short) 0;
        }
        switch (C14066ix.f47252k4[m66985ks(obj).ordinal()]) {
            case 1:
                return m66869du((Boolean) obj);
            case 2:
                return m66871du((Character) obj);
            case 3:
                return m66870du((Byte) obj);
            case 4:
                return m66878du((Short) obj);
            case 5:
                return m66874du((Integer) obj);
            case 6:
                return m66875du((Long) obj);
            case 7:
                return m66873du((Float) obj);
            case 8:
                return m66872du((Double) obj);
            case 9:
                return m66867du((C14046bv) obj);
            case 10:
                return m66868du((C14084qq) obj);
            case 11:
                return m66879du((String) obj, interfaceC14073kp);
            default:
                return ((InterfaceC14090sv) obj).mo66522m9(interfaceC14073kp);
        }
    }

    /* JADX INFO: renamed from: dy */
    public static long m66892dy(String str, InterfaceC14073kp interfaceC14073kp) {
        if (str == null) {
            return 0L;
        }
        return C14114y9.m67458k4(str, 7, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: fa */
    public static double m66906fa(String str, InterfaceC14073kp interfaceC14073kp) {
        if (str == null) {
            return 0.0d;
        }
        return C14044b3.m66427k4(str, 231, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: h4 */
    public static int m66919h4(Short sh) {
        if (sh.shortValue() >= 0) {
            return sh.shortValue();
        }
        throw new OverflowException("Value was either too large or too small for a UInt16.");
    }

    /* JADX INFO: renamed from: jd */
    public static long m66933jd(String str, InterfaceC14073kp interfaceC14073kp) {
        if (str == null) {
            return 0L;
        }
        return C14065ig.m66721k4(str, 7, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66947k4(Float f, InterfaceC14073kp interfaceC14073kp) {
        return m66946k4(Double.valueOf(f.doubleValue()), interfaceC14073kp);
    }

    /* JADX INFO: renamed from: kk */
    public static byte m66982kk(String str) {
        return m67014to(str, (InterfaceC14073kp) C11697x1.m55252to());
    }

    /* JADX INFO: renamed from: m9 */
    public static int m67000m9(Short sh) {
        return sh.shortValue();
    }

    /* JADX INFO: renamed from: to */
    public static byte m67014to(String str, InterfaceC14073kp interfaceC14073kp) {
        if (str == null) {
            return (byte) 0;
        }
        return (byte) (C14098up.m67316k4(str, interfaceC14073kp) & 255);
    }

    /* JADX INFO: renamed from: up */
    public static String m67029up(Object obj) {
        return m66987ks(obj, null);
    }

    /* JADX INFO: renamed from: x1 */
    public static char m67042x1(String str) {
        if (str == null) {
            throw new ArgumentNullException("value");
        }
        if (str.length() == 1) {
            return str.charAt(0);
        }
        throw new FormatException();
    }

    /* JADX INFO: renamed from: yj */
    public static String m67058yj(String str, InterfaceC14073kp interfaceC14073kp) {
        return str;
    }

    /* JADX INFO: renamed from: c5 */
    public static String m66851c5(String str) {
        return str;
    }

    /* JADX INFO: renamed from: du */
    public static short m66878du(Short sh) {
        return sh.shortValue();
    }

    /* JADX INFO: renamed from: dy */
    public static C14084qq m66893dy(String str) {
        return str == null ? new C14084qq(0L) : C14084qq.m67123x1(str, C11697x1.m55252to());
    }

    /* JADX INFO: renamed from: h4 */
    public static int m66920h4(String str, InterfaceC14073kp interfaceC14073kp) {
        if (str == null) {
            return 0;
        }
        return C14081nv.m67065k4(str, 7, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: jd */
    public static byte[] m66934jd(String str) throws FormatException {
        byte[] bArrM13781k4 = C3201m9.m13781k4(str);
        if (bArrM13781k4 != null) {
            return bArrM13781k4;
        }
        throw new FormatException("The string contains invalid characters");
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66948k4(Integer num, InterfaceC14073kp interfaceC14073kp) {
        return C14057f9.m66586k4(num.intValue(), interfaceC14073kp);
    }

    /* JADX INFO: renamed from: kk */
    public static byte m66983kk(String str, InterfaceC14073kp interfaceC14073kp) {
        if (str != null) {
            return C14045bs.m66441k4(str, 7, interfaceC14073kp);
        }
        throw new ArgumentNullException("value");
    }

    /* JADX INFO: renamed from: m9 */
    public static int m67001m9(String str, InterfaceC14073kp interfaceC14073kp) {
        if (str == null) {
            return 0;
        }
        return C14057f9.m66584k4(str, 7, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: to */
    public static int m67015to(String str) {
        return m67001m9(str, (InterfaceC14073kp) C11697x1.m55252to());
    }

    /* JADX INFO: renamed from: x1 */
    public static char m67043x1(String str, InterfaceC14073kp interfaceC14073kp) {
        if (str == null) {
            throw new ArgumentNullException("value");
        }
        if (str.length() == 1) {
            return str.charAt(0);
        }
        throw new FormatException("String must be exactly one character long.");
    }

    /* JADX INFO: renamed from: du */
    public static short m66879du(String str, InterfaceC14073kp interfaceC14073kp) {
        if (str == null) {
            return (short) 0;
        }
        return C14088s7.m67177k4(str, 7, interfaceC14073kp);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66949k4(Long l, InterfaceC14073kp interfaceC14073kp) {
        return C14091t6.m67186k4(l.longValue(), interfaceC14073kp);
    }

    /* JADX INFO: renamed from: kk */
    public static long m66984kk(String str, int i) {
        if (str == null) {
            return 0L;
        }
        String[] strArr = {str};
        m66955k4(strArr, i);
        String strSubstring = strArr[0];
        if (strSubstring.startsWith(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR)) {
            throw new OverflowException();
        }
        try {
            if (strSubstring.startsWith("+")) {
                strSubstring = strSubstring.substring(1);
            }
            return Long.parseLong(strSubstring, i);
        } catch (NumberFormatException e) {
            throw new FormatException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: to */
    public static long m67016to(String str, int i) {
        if (str == null) {
            return 0L;
        }
        String[] strArr = {str};
        m66955k4(strArr, i);
        String str2 = strArr[0];
        try {
            return Long.parseLong(str2, i);
        } catch (NumberFormatException e) {
            if (str2.equals("8000000000000000") && i == 16) {
                return Long.MIN_VALUE;
            }
            throw new FormatException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static int m67044x1(String str, int i) {
        if (str == null) {
            return 0;
        }
        String[] strArr = {str};
        m66955k4(strArr, i);
        String str2 = strArr[0];
        try {
            return i == 16 ? C14057f9.m66583k4(str2, 515) : m66865du(str2, i);
        } catch (NumberFormatException e) {
            throw new FormatException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66950k4(Short sh, InterfaceC14073kp interfaceC14073kp) {
        return C14088s7.m67175k4(sh.shortValue(), interfaceC14073kp);
    }

    /* JADX INFO: renamed from: x1 */
    public static byte[] m67045x1(byte[] bArr, int i, int i2) {
        int i3 = i2 / 3;
        int i4 = i2 % 3;
        byte[] bArr2 = new byte[i2 != 0 ? ((i2 + 2) / 3) * 4 : 0];
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            m66954k4(bArr, i, 3, bArr2, i5);
            i += 3;
            i5 += 4;
        }
        byte[] bArr3 = f47272k4;
        if (i4 == 1) {
            int i7 = bArr[i] & 255;
            bArr2[i5] = bArr3[i7 >> 2];
            bArr2[i5 + 1] = bArr3[(i7 << 4) & 48];
            bArr2[i5 + 2] = 61;
            bArr2[i5 + 3] = 61;
            return bArr2;
        }
        if (i4 != 2) {
            return bArr2;
        }
        int i8 = bArr[i] & 255;
        int i9 = bArr[i + 1] & 255;
        bArr2[i5] = bArr3[i8 >> 2];
        bArr2[i5 + 1] = bArr3[((i8 << 4) & 48) | (i9 >> 4)];
        bArr2[i5 + 2] = bArr3[(i9 << 2) & 60];
        bArr2[i5 + 3] = 61;
        return bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66951k4(short s, int i) {
        if (i != 2 && i != 8 && i != 10 && i != 16) {
            throw new ArgumentException("Invalid Base.");
        }
        String string = Integer.toString(s, i);
        return (i == 10 || !string.startsWith(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR)) ? string : string.substring(1);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66952k4(byte[] bArr) {
        if (bArr != null) {
            return m66953k4(bArr, 0, bArr.length);
        }
        throw new ArgumentNullException("inArray");
    }

    /* JADX INFO: renamed from: k4 */
    public static String m66953k4(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new ArgumentNullException("inArray");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException("offset < 0 || length < 0");
        }
        if (i > bArr.length - i2) {
            throw new ArgumentOutOfRangeException("offset + length > array.Length");
        }
        return AbstractC6747ar.m26650yj().m26681x1(m67045x1(bArr, i, i2));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m66954k4(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArr3 = f47272k4;
        int i4 = bArr[i] & 255;
        int i5 = bArr[i + 1] & 255;
        byte b = bArr[i + 2];
        bArr2[i3] = bArr3[i4 >> 2];
        bArr2[i3 + 1] = bArr3[((i4 << 4) & 48) | (i5 >> 4)];
        bArr2[i3 + 2] = bArr3[((b & 255) >> 6) | ((i5 << 2) & 60)];
        bArr2[i3 + 3] = bArr3[b & 63];
    }

    /* JADX INFO: renamed from: k4 */
    private static void m66955k4(String[] strArr, int i) {
        if (i != 2 && i != 8 && i != 10 && i != 16) {
            throw new ArgumentException("Invalid Base.");
        }
        if (strArr[0].equals("")) {
            throw new ArgumentOutOfRangeException("value");
        }
        if (i != 10 && strArr[0].startsWith(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR)) {
            throw new ArgumentException("value");
        }
        if (i == 16) {
            if (strArr[0].startsWith("+")) {
                strArr[0] = strArr[0].substring(1);
            }
            if (strArr[0].startsWith("0X") || strArr[0].startsWith("0x")) {
                strArr[0] = strArr[0].substring(2);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66956k4(C14046bv c14046bv) {
        return !c14046bv.m66510ck(C14046bv.f47165du);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66957k4(C14084qq c14084qq) {
        throw new InvalidCastException("Invalid cast from 'DateTime' to 'Boolean'.");
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66958k4(Boolean bool) {
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66959k4(Byte b) {
        return b.byteValue() != 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66960k4(Character ch) {
        throw new InvalidCastException("Invalid cast from 'Character' to 'Boolean'.");
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66961k4(Double d) {
        return d.doubleValue() != 0.0d;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66962k4(Float f) {
        return f.floatValue() != 0.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66963k4(Integer num) {
        return num.intValue() != 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66964k4(Long l) {
        return l.longValue() != 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66965k4(Object obj) {
        return m66966k4(obj, C11697x1.m55252to());
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66966k4(Object obj, InterfaceC14073kp interfaceC14073kp) {
        if (obj == null) {
            return false;
        }
        switch (C14066ix.f47252k4[m66985ks(obj).ordinal()]) {
            case 1:
                return m66958k4((Boolean) obj);
            case 2:
                return m66960k4((Character) obj);
            case 3:
                return m66959k4((Byte) obj);
            case 4:
                return m66967k4((Short) obj);
            case 5:
                return m66963k4((Integer) obj);
            case 6:
                return m66964k4((Long) obj);
            case 7:
                return m66962k4((Float) obj);
            case 8:
                return m66961k4((Double) obj);
            case 9:
                return m66956k4((C14046bv) obj);
            case 10:
                return m66957k4((C14084qq) obj);
            case 11:
                return m66969k4((String) obj, interfaceC14073kp);
            default:
                return ((InterfaceC14090sv) obj).mo66519k4(interfaceC14073kp);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66967k4(Short sh) {
        return sh.shortValue() != 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66968k4(String str) {
        if (str == null) {
            return false;
        }
        return C14051ck.m66555k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m66969k4(String str, InterfaceC14073kp interfaceC14073kp) {
        if (str == null) {
            return false;
        }
        return C14051ck.m66555k4(str);
    }
}
