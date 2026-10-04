package com.aspose.slides.p559ms.System.Xml;

import androidx.core.content.OooO0O0;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11691kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p532yu.C12888a3;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14045bs;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14065ig;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14081nv;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14088s7;
import com.aspose.slides.p559ms.System.C14091t6;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.words.ControlChar;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.af */
/* JADX INFO: loaded from: classes5.dex */
public class C13850af {

    /* JADX INFO: renamed from: kk */
    private static C14022y4 f46340kk = C14022y4.m66318k4().Clone();

    /* JADX INFO: renamed from: k4 */
    public static char[] f46339k4 = {'\n', ControlChar.PARAGRAPH_BREAK_CHAR, '\t'};

    /* JADX INFO: renamed from: x1 */
    public static final char[] f46341x1 = {ControlChar.SPACE_CHAR, '\t', '\n', ControlChar.PARAGRAPH_BREAK_CHAR};

    /* JADX INFO: renamed from: ar */
    public static String m65066ar(String str) {
        return C14113y2.m67423kk(str, f46341x1);
    }

    /* JADX INFO: renamed from: bv */
    public static String m65067bv(String str) {
        return C14113y2.m67362du(str, f46341x1);
    }

    /* JADX INFO: renamed from: c5 */
    public static boolean m65068c5(String str) {
        String strM65066ar = m65066ar(str);
        if ("1".equals(strM65066ar) || TelemetryEventStrings.Value.TRUE.equals(strM65066ar)) {
            return true;
        }
        if ("0".equals(strM65066ar) || TelemetryEventStrings.Value.FALSE.equals(strM65066ar)) {
            return false;
        }
        throw new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM65066ar, "Boolean"));
    }

    /* JADX INFO: renamed from: ck */
    public static C14046bv m65069ck(String str) {
        return C14046bv.m66470k4(str, 39, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: du */
    public static String m65070du(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        if (str.charAt(0) == ' ' || OooO0O0.OooO00o(1, str) == ' ' || C14113y2.m67384k4(str, f46339k4) != -1 || C14113y2.m67367h4(str, "  ", (short) 4) != -1) {
            throw new XmlException("line-feed (#xA) or tab (#x9) characters, leading or trailing spaces and sequences of one or more spaces (#x20) are not allowed in 'xs:token'.", str);
        }
        return str;
    }

    /* JADX INFO: renamed from: dy */
    public static Exception m65071dy(String str) {
        if (C14113y2.m67384k4(str, f46339k4) != -1) {
            return new XmlSchemaException("Carriage return (#xD), line feed (#xA), and tab (#x9) characters are not allowed in xs:normalizedString.", str);
        }
        return null;
    }

    /* JADX INFO: renamed from: fa */
    public static C14046bv m65072fa(String str) {
        return C14046bv.m66470k4(str, 7, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: h4 */
    public static Exception m65073h4(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.charAt(0) == ' ' || OooO0O0.OooO00o(1, str) == ' ' || C14113y2.m67384k4(str, f46339k4) != -1 || C14113y2.m67367h4(str, "  ", (short) 4) != -1) {
            return new XmlException("line-feed (#xA) or tab (#x9) characters, leading or trailing spaces and sequences of one or more spaces (#x20) are not allowed in 'xs:token'.", str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ix */
    public static long m65074ix(String str) {
        return C14065ig.m66721k4(str, 3, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: jd */
    public static char m65075jd(String str) {
        if (str == null) {
            throw new ArgumentNullException("s");
        }
        if (str.length() == 1) {
            return str.charAt(0);
        }
        throw new FormatException(C13968ri.m65818k4("String must be exactly one character long."));
    }

    /* JADX INFO: renamed from: k4 */
    public static double m65076k4(Object obj) {
        String str = (String) C7019kk.m27452k4(obj, String.class);
        if (str == null) {
            if (C7019kk.m27469x1(obj, Double.class)) {
                return ((Double) C7019kk.m27464to(obj, Double.TYPE)).doubleValue();
            }
            if (C7019kk.m27469x1(obj, Boolean.class)) {
                return ((Boolean) C7019kk.m27464to(obj, Boolean.TYPE)).booleanValue() ? 1.0d : 0.0d;
            }
            try {
                return C14080ne.m66904fa(obj, C11697x1.m55250kk());
            } catch (ArgumentNullException | FormatException | OverflowException unused) {
                return Double.NaN;
            }
        }
        String strM65066ar = m65066ar(str);
        if (strM65066ar.length() != 0 && strM65066ar.charAt(0) != '+') {
            double[] dArr = {0.0d};
            boolean zM66435k4 = C14044b3.m66435k4(strM65066ar, 38, C11697x1.m55250kk(), dArr);
            double d = dArr[0];
            if (zM66435k4) {
                return d;
            }
        }
        return Double.NaN;
    }

    /* JADX INFO: renamed from: kk */
    public static Exception m65117kk(String str, int i, int i2) {
        return m65095k4(i == 0 ? "Name cannot begin with the '{0}' character, hexadecimal value {1}." : "The '{0}' character, hexadecimal value {1}, cannot be included in a name.", XmlException.buildCharExceptionArgs(str, i), i2, 0, i + 1);
    }

    /* JADX INFO: renamed from: ks */
    public static long m65122ks(String str) {
        return C14091t6.m67185k4(str, 7, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: m9 */
    public static Exception m65123m9(String str) {
        if (str == null || str.length() == 0) {
            return new XmlException("The empty string '' is not a valid name.", C14113y2.f47374k4);
        }
        int iM66232x1 = C13988u1.m66232x1(str, 0);
        if (iM66232x1 != str.length()) {
            return new XmlException("The '{0}' character, hexadecimal value {1}, cannot be included in a name.", XmlException.buildCharExceptionArgs(str, iM66232x1));
        }
        return null;
    }

    /* JADX INFO: renamed from: ne */
    public static long m65124ne(String str) {
        return C14114y9.m67458k4(str, 3, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: qq */
    public static C14062gk m65125qq(String str) {
        if (str != null && str.length() > 0) {
            str = m65066ar(str);
            if (str.length() == 0 || C14113y2.m67367h4(str, "##", (short) 4) != -1) {
                throw new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", str, "Uri"));
            }
        }
        C14062gk[] c14062gkArr = {null};
        boolean zM66650k4 = C14062gk.m66650k4(str, 0, c14062gkArr);
        C14062gk c14062gk = c14062gkArr[0];
        if (zM66650k4) {
            return c14062gk;
        }
        throw new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", str, "Uri"));
    }

    /* JADX INFO: renamed from: rv */
    public static byte m65126rv(String str) {
        return C14098up.m67315k4(str, 3, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: to */
    private static long m65127to(double d) {
        return C14069jd.m66783x1(d);
    }

    /* JADX INFO: renamed from: u4 */
    public static float m65129u4(String str) {
        String strM65066ar = m65066ar(str);
        if ("-INF".equals(strM65066ar)) {
            return Float.NEGATIVE_INFINITY;
        }
        if ("INF".equals(strM65066ar)) {
            return Float.POSITIVE_INFINITY;
        }
        float fM66706k4 = C14064he.m66706k4(strM65066ar, 164, C11697x1.m55250kk());
        if (fM66706k4 == 0.0f && strM65066ar.charAt(0) == '-') {
            return -0.0f;
        }
        return fM66706k4;
    }

    /* JADX INFO: renamed from: um */
    public static String m65130um(String str) {
        return C14113y2.m67431to(str, f46341x1);
    }

    /* JADX INFO: renamed from: up */
    public static byte m65131up(String str) {
        return C14045bs.m66441k4(str, 7, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: uz */
    public static double m65132uz(String str) {
        String strM65066ar = m65066ar(str);
        if ("-INF".equals(strM65066ar)) {
            return Double.NEGATIVE_INFINITY;
        }
        if ("INF".equals(strM65066ar)) {
            return Double.POSITIVE_INFINITY;
        }
        double dM66427k4 = C14044b3.m66427k4(strM65066ar, 167, C11697x1.m55250kk());
        if (dM66427k4 == 0.0d && strM65066ar.charAt(0) == '-') {
            return -0.0d;
        }
        return dM66427k4;
    }

    /* JADX INFO: renamed from: v4 */
    public static String[] m65133v4(String str) {
        return C14113y2.m67416k4(str, f46341x1, (short) 1);
    }

    /* JADX INFO: renamed from: wl */
    public static C14047bz m65134wl(String str) {
        return new C14047bz(str);
    }

    /* JADX INFO: renamed from: x1 */
    public static double m65135x1(double d) {
        double dM67497to = C14116yg.m67497to(d);
        return d - dM67497to == 0.5d ? dM67497to + 1.0d : dM67497to;
    }

    /* JADX INFO: renamed from: x6 */
    public static int m65150x6(String str) {
        return C14081nv.m67065k4(str, 3, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: yj */
    public static int m65151yj(String str) {
        return C14057f9.m66584k4(str, 7, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static ArgumentException m65077k4(String str, String str2) {
        return str == null ? new ArgumentNullException(str2) : new ArgumentException(C13968ri.m65818k4("The empty string '' is not a valid name."), str2);
    }

    /* JADX INFO: renamed from: kk */
    public static Exception m65118kk(String str, long[] jArr) {
        if (C14065ig.m66725k4(str, 3, C11697x1.m55250kk(), jArr)) {
            return null;
        }
        return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", str, "UInt64"));
    }

    /* JADX INFO: renamed from: to */
    public static Exception m65128to(String str) {
        int iM66231x1 = C13988u1.m66231x1(str);
        if (iM66231x1 == 0 || iM66231x1 != str.length()) {
            return C13988u1.m66233x1(str, 0, iM66231x1);
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public static Exception m65136x1(char c) {
        return m65081k4(c, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public static Exception m65078k4(char c, char c2) {
        return m65079k4(c, c2, 0);
    }

    /* JADX INFO: renamed from: kk */
    public static String m65119kk(long j) {
        return C14065ig.m66723k4(j, (String) null, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: x1 */
    public static Exception m65137x1(char c, char c2) {
        return m65138x1(c, c2, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public static Exception m65079k4(char c, char c2, int i) {
        return m65080k4(c, c2, i, 0, 0);
    }

    /* JADX INFO: renamed from: kk */
    public static String m65120kk(String str) {
        return m65149x1(str, 1);
    }

    /* JADX INFO: renamed from: x1 */
    public static Exception m65138x1(char c, char c2, int i) {
        return m65094k4("'{0}', hexadecimal value {1}, is an invalid character.", XmlException.buildCharExceptionArgs(c, c2), i);
    }

    /* JADX INFO: renamed from: k4 */
    public static Exception m65080k4(char c, char c2, int i, int i2, int i3) {
        return m65095k4("The surrogate pair (0x{0}, 0x{1}) is invalid. A high surrogate character (0xD800 - 0xDBFF) must always be paired with a low surrogate character (0xDC00 - 0xDFFF).", new String[]{C14114y9.m67461k4(c2, "X", C11697x1.m55250kk()), C14114y9.m67461k4(c, "X", C11697x1.m55250kk())}, i, i2, i3);
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m65121kk(double d) {
        return d == 0.0d && m65127to(d) == m65127to(-0.0d);
    }

    /* JADX INFO: renamed from: x1 */
    public static Exception m65139x1(String str) {
        if (str == null || str.length() == 0) {
            return new XmlException("The empty string '' is not a valid name.", C14113y2.f47374k4);
        }
        int iM66228kk = C13988u1.m66228kk(str, 0);
        if (iM66228kk != str.length()) {
            return new XmlException(iM66228kk == 0 ? "Name cannot begin with the '{0}' character, hexadecimal value {1}." : "The '{0}' character, hexadecimal value {1}, cannot be included in a name.", XmlException.buildCharExceptionArgs(str, iM66228kk));
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public static Exception m65081k4(char c, int i) {
        return m65082k4(c, i, 0, 0);
    }

    /* JADX INFO: renamed from: x1 */
    public static Exception m65140x1(String str, int i, int i2) {
        return m65095k4("'{0}', hexadecimal value {1}, is an invalid character.", XmlException.buildCharExceptionArgs(str, i), i2, 0, i + 1);
    }

    /* JADX INFO: renamed from: k4 */
    public static Exception m65082k4(char c, int i, int i2, int i3) {
        return m65084k4("Invalid high surrogate character (0x{0}). A high surrogate character must have a value from range (0xD800 - 0xDBFF).", C14114y9.m67461k4(c, "X", C11697x1.m55250kk()), i, i2, i3);
    }

    /* JADX INFO: renamed from: x1 */
    public static Exception m65141x1(String str, byte[] bArr) {
        if (C14098up.m67322k4(str, 3, C11697x1.m55250kk(), bArr)) {
            return null;
        }
        return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", str, "Byte"));
    }

    /* JADX INFO: renamed from: k4 */
    public static Exception m65083k4(String str, int i, int i2, int i3) {
        return i != 0 ? new XmlException(str, C14113y2.f47374k4, i2, i3) : new ArgumentException(C13968ri.m65818k4(str));
    }

    /* JADX INFO: renamed from: x1 */
    public static Exception m65142x1(String str, int[] iArr) {
        if (C14081nv.m67068k4(str, 3, C11697x1.m55250kk(), iArr)) {
            return null;
        }
        return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", str, "UInt16"));
    }

    /* JADX INFO: renamed from: k4 */
    public static Exception m65084k4(String str, String str2, int i, int i2, int i3) {
        return i != 0 ? new XmlException(str, str2, i2, i3) : new ArgumentException(C13968ri.m65819k4(str, str2));
    }

    /* JADX INFO: renamed from: x1 */
    public static Exception m65143x1(String str, long[] jArr) {
        if (C14114y9.m67462k4(str, 3, C11697x1.m55250kk(), jArr)) {
            return null;
        }
        return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", str, "UInt32"));
    }

    /* JADX INFO: renamed from: k4 */
    public static Exception m65085k4(String str, byte[] bArr) {
        if (C14045bs.m66445k4(str, 7, C11697x1.m55250kk(), bArr)) {
            return null;
        }
        return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", str, "SByte"));
    }

    /* JADX INFO: renamed from: x1 */
    public static Exception m65144x1(String str, C14046bv[] c14046bvArr) {
        if (C14046bv.m66473k4(str, 7, C11697x1.m55250kk(), c14046bvArr)) {
            return null;
        }
        return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", str, "Integer"));
    }

    /* JADX INFO: renamed from: k4 */
    public static Exception m65086k4(String str, char[] cArr) {
        if (C14117yj.m67530k4(str, cArr)) {
            return null;
        }
        return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", str, "Char"));
    }

    /* JADX INFO: renamed from: x1 */
    public static String m65145x1(byte b) {
        return C14098up.m67321k4(b, (String) null, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static Exception m65087k4(String str, double[] dArr) {
        String strM65066ar = m65066ar(str);
        if ("-INF".equals(strM65066ar)) {
            dArr[0] = Double.NEGATIVE_INFINITY;
            return null;
        }
        if ("INF".equals(strM65066ar)) {
            dArr[0] = Double.POSITIVE_INFINITY;
            return null;
        }
        if (!C14044b3.m66435k4(strM65066ar, 164, C11697x1.m55250kk(), dArr)) {
            return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM65066ar, "Double"));
        }
        if (dArr[0] == 0.0d && strM65066ar.charAt(0) == '-') {
            dArr[0] = -0.0d;
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public static String m65146x1(int i) {
        return C14081nv.m67067k4(i, (String) null, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static Exception m65088k4(String str, float[] fArr) {
        String strM65066ar = m65066ar(str);
        if ("-INF".equals(strM65066ar)) {
            fArr[0] = Float.NEGATIVE_INFINITY;
            return null;
        }
        if ("INF".equals(strM65066ar)) {
            fArr[0] = Float.POSITIVE_INFINITY;
            return null;
        }
        if (!C14064he.m66713k4(strM65066ar, 164, C11697x1.m55250kk(), fArr)) {
            return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM65066ar, "Single"));
        }
        if (fArr[0] == 0.0f && strM65066ar.charAt(0) == '-') {
            fArr[0] = -0.0f;
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    public static String m65147x1(long j) {
        return C14114y9.m67461k4(j, (String) null, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static Exception m65089k4(String str, int[] iArr) {
        if (C14057f9.m66589k4(str, 7, C11697x1.m55250kk(), iArr)) {
            return null;
        }
        return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", str, "Int32"));
    }

    /* JADX INFO: renamed from: x1 */
    public static String m65148x1(Object obj) {
        String str = (String) C7019kk.m27452k4(obj, String.class);
        return str != null ? str : C7019kk.m27469x1(obj, Double.class) ? C14044b3.m66434k4(((Double) C7019kk.m27464to(obj, Double.TYPE)).doubleValue(), "R", C11697x1.m55250kk()) : C7019kk.m27469x1(obj, Boolean.class) ? ((Boolean) C7019kk.m27464to(obj, Boolean.TYPE)).booleanValue() ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE : C14080ne.m66987ks(obj, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static Exception m65090k4(String str, long[] jArr) {
        if (C14091t6.m67189k4(str, 7, C11697x1.m55250kk(), jArr)) {
            return null;
        }
        return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", str, "Int64"));
    }

    /* JADX INFO: renamed from: x1 */
    public static String m65149x1(String str, int i) {
        if (str == null) {
            throw new ArgumentNullException("name");
        }
        if (str.length() == 0) {
            throw new ArgumentNullException("name", C13968ri.m65818k4("The empty string '' is not a valid local name."));
        }
        int iM66230to = C13988u1.m66230to(str, 0);
        if (iM66230to == str.length()) {
            return str;
        }
        throw m65117kk(str, iM66230to, i);
    }

    /* JADX INFO: renamed from: k4 */
    public static Exception m65091k4(String str, C14046bv[] c14046bvArr) {
        if (C14046bv.m66473k4(str, 39, C11697x1.m55250kk(), c14046bvArr)) {
            return null;
        }
        return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", str, "Decimal"));
    }

    /* JADX INFO: renamed from: k4 */
    public static Exception m65092k4(String str, C14047bz[] c14047bzArr) {
        C14047bz.f47172k4.CloneTo(c14047bzArr[0]);
        try {
            c14047bzArr[0] = new C14047bz(str);
            return null;
        } catch (ArgumentException unused) {
            return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", str, "Guid"));
        } catch (FormatException unused2) {
            return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", str, "Guid"));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static Exception m65093k4(String str, C14062gk[] c14062gkArr) {
        c14062gkArr[0] = null;
        if (str != null && str.length() > 0) {
            str = m65066ar(str);
            if (str.length() == 0 || C14113y2.m67367h4(str, "##", (short) 4) != -1) {
                return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", str, "Uri"));
            }
        }
        if (C14062gk.m66650k4(str, 0, c14062gkArr)) {
            return null;
        }
        return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", str, "Uri"));
    }

    /* JADX INFO: renamed from: k4 */
    public static Exception m65094k4(String str, String[] strArr, int i) {
        return m65095k4(str, strArr, i, 0, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public static Exception m65095k4(String str, String[] strArr, int i, int i2, int i3) {
        return i != 0 ? new XmlException(str, strArr, i2, i3) : new ArgumentException(C13968ri.m65819k4(str, strArr));
    }

    /* JADX INFO: renamed from: k4 */
    public static Exception m65096k4(String str, short[] sArr) {
        if (C14088s7.m67178k4(str, 7, C11697x1.m55250kk(), sArr)) {
            return null;
        }
        return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", str, "Int16"));
    }

    /* JADX INFO: renamed from: k4 */
    public static Exception m65097k4(String str, boolean[] zArr) {
        String strM65066ar = m65066ar(str);
        if ("0".equals(strM65066ar) || TelemetryEventStrings.Value.FALSE.equals(strM65066ar)) {
            zArr[0] = false;
            return null;
        }
        if ("1".equals(strM65066ar) || TelemetryEventStrings.Value.TRUE.equals(strM65066ar)) {
            zArr[0] = true;
            return null;
        }
        zArr[0] = false;
        return new FormatException(C13968ri.m65819k4("The string '{0}' is not a valid {1} value.", strM65066ar, "Boolean"));
    }

    /* JADX INFO: renamed from: k4 */
    public static RuntimeException m65098k4(String str, C14077m4[] c14077m4Arr) {
        C12888a3 c12888a3 = new C12888a3();
        C12888a3[] c12888a3Arr = {c12888a3};
        RuntimeException runtimeExceptionM59990k4 = C12888a3.m59990k4(str, c12888a3Arr);
        c12888a3Arr[0].CloneTo(c12888a3);
        if (runtimeExceptionM59990k4 == null) {
            return c12888a3.m59999k4(c14077m4Arr);
        }
        C14077m4.f47266x1.CloneTo(c14077m4Arr[0]);
        return runtimeExceptionM59990k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m65099k4(byte b) {
        return C14045bs.m66444k4(b, (String) null, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m65100k4(char c) {
        return C14117yj.m67528k4(c, (InterfaceC14073kp) null);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m65101k4(double d) {
        return C14044b3.m66438to(d) ? "-INF" : C14044b3.m66424du(d) ? "INF" : m65121kk(d) ? "-0" : C14044b3.m66434k4(d, "R", C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m65102k4(float f) {
        return C14064he.m66716to(f) ? "-INF" : C14064he.m66703du(f) ? "INF" : m65121kk((double) f) ? "-0" : C14064he.m66712k4(f, "R", C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m65103k4(int i) {
        return C14057f9.m66588k4(i, (String) null, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m65104k4(long j) {
        return C14091t6.m67188k4(j, (String) null, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m65105k4(C14046bv c14046bv) {
        return c14046bv.mo66517k4((String) null, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m65106k4(C14047bz c14047bz) {
        return c14047bz.toString();
    }

    @Deprecated
    /* JADX INFO: renamed from: k4 */
    public static String m65107k4(C14084qq c14084qq) {
        return m65108k4(c14084qq.Clone(), "yyyy-MM-ddTHH:mm:ss.fffffffzzzzzz");
    }

    /* JADX INFO: renamed from: k4 */
    public static String m65108k4(C14084qq c14084qq, String str) {
        return c14084qq.mo66517k4(str, C11691kk.m55145um());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m65109k4(String str) {
        if (str == null) {
            throw new ArgumentNullException("name");
        }
        if (str.length() == 0) {
            throw new ArgumentNullException("name", C13968ri.m65818k4("The empty string '' is not a valid name."));
        }
        int iM66228kk = C13988u1.m66228kk(str, 0);
        if (iM66228kk == str.length()) {
            return str;
        }
        throw m65117kk(str, iM66228kk, 1);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m65110k4(String str, int i) {
        if (str == null || str.length() == 0) {
            throw new ArgumentNullException("name");
        }
        int iM66223k4 = C13988u1.m66223k4(str, 0, new int[]{-1});
        if (iM66223k4 == str.length()) {
            return str;
        }
        throw m65095k4("The '{0}' character, hexadecimal value {1}, cannot be included in a name.", XmlException.buildCharExceptionArgs(str, iM66223k4), i, 0, iM66223k4 + 1);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m65111k4(short s) {
        return C14088s7.m67176k4(s, (String) null, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static String m65112k4(boolean z) {
        return z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m65113k4(byte[] bArr) {
        if (bArr != null) {
            return C13982to.m65917k4(bArr, 0, bArr.length);
        }
        throw new ArgumentNullException("inArray");
    }

    /* JADX INFO: renamed from: k4 */
    public static void m65114k4(String str, int i, int i2) {
        if (str == null || str.length() == 0) {
            return;
        }
        int length = str.length();
        int i3 = 0;
        while (true) {
            if (i3 < length && (f46340kk.f47099k4[str.charAt(i3)] & 16) != 0) {
                i3++;
            } else {
                if (i3 == length) {
                    return;
                }
                if (!C14022y4.m66321k4((int) str.charAt(i3))) {
                    throw m65140x1(str, i3, i);
                }
                int i4 = i3 + 1;
                if (i4 == length) {
                    throw m65083k4("The surrogate pair is invalid. Missing a low surrogate character.", i2, 0, i4);
                }
                if (!C14022y4.m66327x1((int) str.charAt(i4))) {
                    throw m65080k4(str.charAt(i4), str.charAt(i3), i2, 0, i4);
                }
                i3 += 2;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m65115k4(char[] cArr, int i, int i2, String str) {
        if (i2 != str.length()) {
            return false;
        }
        int i3 = 0;
        while (i3 < i2 && cArr[i + i3] == str.charAt(i3)) {
            i3++;
        }
        return i3 == i2;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m65116k4(String str, boolean z) {
        if (str != null) {
            return C13926kk.m65502k4(C14113y2.m67365dy(str), z);
        }
        throw new ArgumentNullException("s");
    }
}
