package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p205ji.C5449c5;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11691kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12383kk;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.words.ControlChar;
import com.aspose.words.StyleIdentifier;
import com.huawei.hms.network.embedded.C18115b5;
import com.microsoft.identity.client.internal.MsalUtils;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.qc */
/* JADX INFO: loaded from: classes3.dex */
class C14337qc extends AbstractC7020m9<C14337qc> {

    /* JADX INFO: renamed from: k4 */
    static final String f48299k4 = C14113y2.m67408k4("MMM|DD|YYYY|M/|/M|D/|D\\\\|/D|Y/|/Y|-M|M-|-D|D-|-Y|Y-|MM|M/D|D/M|", "M-D|D-M|^D$|\\[H\\]|H:MM|MM:SS|m:ss|", "Дк|ФВ|ИХ|К±|·Ц|Гл");

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f48300kk;

    /* JADX INFO: renamed from: x1 */
    static final List<String> f48301x1;

    static {
        List<String> list = new List<>();
        f48301x1 = list;
        list.addItem("General");
        list.addItem("Yleinen");
        list.addItem("Standard");
        f48300kk = new C7017h4("=", "<", ">", "<=", ">=", "<>");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0045, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int m69513k4(String str, char c) {
        boolean z;
        int length = str.length() - 1;
        int i = 1;
        loop0: while (length >= 0) {
            char cCharAt = str.charAt(length);
            if (cCharAt == '\"') {
                do {
                    length--;
                    if (length >= 0) {
                    }
                } while (str.charAt(length) != '\"');
            } else {
                if (cCharAt == '#' || cCharAt == '0') {
                    return 1;
                }
                if (cCharAt == c) {
                    length--;
                    i = 1000;
                    while (true) {
                        if (length < 0) {
                            break;
                        }
                        char cCharAt2 = str.charAt(length);
                        if (cCharAt2 == '#' || cCharAt2 == '0') {
                            break loop0;
                        }
                        if (cCharAt2 == c) {
                            i *= 1000;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            length++;
                            i = 1;
                            break;
                        }
                        length--;
                    }
                    return i;
                }
                continue;
            }
            length--;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5 A[PHI: r14
      0x00c5: PHI (r14v7 double) = (r14v5 double), (r14v4 double) binds: [B:39:0x00cc, B:36:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String m69524kk(String str, double d) {
        String strM67443x1;
        double d2;
        String strM67422kk = str;
        double d3 = d;
        int iM67429to = C14113y2.m67429to(strM67422kk, ControlChar.SPACE_CHAR);
        double dM67490kk = C14116yg.m67490kk(d3);
        double d4 = d3 - dM67490kk;
        if (iM67429to != -1) {
            strM67443x1 = C14113y2.m67443x1(strM67422kk, 0, iM67429to);
            strM67422kk = C14113y2.m67422kk(strM67422kk, iM67429to + 1);
        } else {
            strM67443x1 = null;
        }
        C6765kp c6765kp = new C6765kp();
        if (dM67490kk == d3) {
            return strM67443x1 != null ? C14044b3.m66433k4(d3, strM67443x1) : C14044b3.m66433k4(d3, "0");
        }
        if (strM67443x1 != null) {
            c6765kp.m26792k4(C14044b3.m66433k4(dM67490kk, strM67443x1));
            c6765kp.m26780k4(ControlChar.SPACE_CHAR);
            d3 = d4;
        }
        String[] strArrM67414k4 = C14113y2.m67414k4(strM67422kk, IOUtils.DIR_SEPARATOR_UNIX);
        if (strArrM67414k4.length == 1) {
            return c6765kp.toString();
        }
        double d5 = 0.5d;
        int i = 14;
        if (C14113y2.m67429to(strArrM67414k4[1], '?') == -1) {
            int iM66582k4 = C14057f9.m66582k4(strArrM67414k4[1]);
            int iOooO00o = C22201OooO0oO.OooO00o(d3 * ((double) iM66582k4), 0.5d, 14);
            if (iOooO00o == iM66582k4) {
                return C14044b3.m66433k4(dM67490kk + 1.0d, strM67443x1);
            }
            if (iOooO00o == 0) {
                return c6765kp.toString();
            }
            c6765kp.m26805kk(iOooO00o);
            c6765kp.m26792k4("/");
            c6765kp.m26792k4(strArrM67414k4[1]);
            return c6765kp.toString();
        }
        int iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67469du(10.0d, strArrM67414k4[1].length())), 14);
        int i2 = 2;
        double d6 = 1.0d;
        int i3 = 2;
        while (true) {
            d2 = d5;
            if (i2 >= iM27462to) {
                break;
            }
            double d7 = ((double) i2) * d4;
            double d8 = d6;
            double dM27462to = d7 - ((double) C7019kk.m27462to(Double.valueOf(d7), i));
            if (dM27462to >= d2) {
                dM27462to = 1.0d - dM27462to;
                if (dM27462to < d8) {
                }
            } else if (dM27462to < d8) {
                i3 = i2;
                d6 = dM27462to;
            } else {
                d6 = d8;
            }
            i2++;
            d5 = d2;
            i = 14;
        }
        int iOooO00o2 = C22201OooO0oO.OooO00o(d3 * ((double) i3), d2, 14);
        if (iOooO00o2 == 0) {
            return "0";
        }
        c6765kp.m26805kk(iOooO00o2);
        c6765kp.m26792k4("/");
        c6765kp.m26805kk(i3);
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    private static String m69526x1(String str) {
        int length = str.length();
        C6765kp c6765kp = new C6765kp(length);
        int i = 0;
        while (i < length) {
            if (str.charAt(i) != '\"') {
                c6765kp.m26780k4(str.charAt(i));
            } else {
                do {
                    i++;
                    if (i < length) {
                    }
                } while (str.charAt(i) != '\"');
            }
            i++;
        }
        return c6765kp.toString();
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C14337qc) {
            return m69530x1((C14337qc) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static C14084qq m69514k4(double d, boolean z) {
        if (d > 2958465.99d) {
            return C14084qq.f47293kk;
        }
        if (z) {
            d += 1462.0d;
        }
        if (d < 60.0d) {
            d += 1.0d;
        }
        return C14084qq.m67111m9(d);
    }

    /* JADX INFO: renamed from: x1 */
    private static String m69527x1(String str, double d) {
        int i = 0;
        if (C14113y2.m67424kk(str, ",") || C14113y2.m67424kk(str, ",)")) {
            int length = str.length();
            int i2 = length - 1;
            if (str.charAt(i2) == ')') {
                i2 = length - 2;
            }
            for (int i3 = i2; i3 >= 0 && str.charAt(i3) == ','; i3--) {
                i++;
            }
            d /= C14116yg.m67469du(1000.0d, i);
            str = C14113y2.m67396k4(str, (i2 - i) + 1, i);
        } else {
            int length2 = str.length() - 1;
            while (length2 >= 0) {
                char cCharAt = str.charAt(length2);
                if (C14117yj.m67539to(cCharAt) || cCharAt == '#' || cCharAt == '.') {
                    break;
                }
                if (cCharAt == ',') {
                    i++;
                }
                length2--;
            }
            if (i > 0) {
                d /= C14116yg.m67469du(1000.0d, i);
                str = length2 < 0 ? C14113y2.m67422kk(str, i) : C14113y2.m67396k4(str, length2 + 1, i);
            }
        }
        if (C14113y2.m67364dy(str, "/?") != -1 || C14113y2.m67364dy(str, "?/") != -1) {
            return m69524kk(str, d);
        }
        if (C14113y2.m67429to(str, '\"') != -1) {
            return C14044b3.m66433k4(d, str);
        }
        if (C14113y2.m67429to(str, 'E') != -1 || C14113y2.m67429to(str, 'e') != -1) {
            return C14044b3.m66433k4(d, str);
        }
        if (C14113y2.m67448x1(str, "\\")) {
            str = C14113y2.m67401k4(str, "\\", (String) null);
        }
        C12385to c12385toOooO00o = C22210OooOo0o.OooO00o("^([a-z|A-Z|(]*)([^a-z|A-Z]+)([a-z|A-Z|)]*)$", str);
        return c12385toOooO00o.mo58006to() ? C14113y2.m67408k4(OooOo.OooO00o(c12385toOooO00o, 1), C14044b3.m66433k4(d, C14113y2.m67401k4(c12385toOooO00o.m58004du().m58000k4(2).mo57995kk(), MsalUtils.QUERY_STRING_SYMBOL, (String) null)), OooOo.OooO00o(c12385toOooO00o, 3)) : C14044b3.m66433k4(d, str);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C14337qc Clone() {
        C14337qc c14337qc = new C14337qc();
        CloneTo(c14337qc);
        return c14337qc;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m69515k4(Object obj, String str, boolean z) {
        if (obj == null) {
            return null;
        }
        if (C7019kk.m27469x1(obj, Boolean.class)) {
            return ((Boolean) C7019kk.m27464to(obj, Boolean.TYPE)).booleanValue() ? "TRUE" : "FALSE";
        }
        if (C7019kk.m27469x1(obj, String.class)) {
            return (String) obj;
        }
        try {
            return C7019kk.m27469x1(obj, Double.class) ? m69517k4(str, ((Double) C7019kk.m27464to(obj, Double.TYPE)).doubleValue()) : C7019kk.m27469x1(obj, Integer.class) ? m69517k4(str, ((Integer) obj).intValue()) : C7019kk.m27469x1(obj, C14084qq.class) ? m69520k4(str, ((C14084qq) C7019kk.m27464to(obj, C14084qq.class)).Clone(), z) : obj.toString();
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
            return obj.toString();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static String m69516k4(String str) {
        int length = str.length();
        C6765kp c6765kp = new C6765kp(length);
        int i = 0;
        while (i < length) {
            char c = 'm';
            if (str.charAt(i) == 'm') {
                int i2 = i + 1;
                while (i2 < length && str.charAt(i2) == 'm') {
                    i2++;
                }
                if ((i <= 0 || !m69521k4(str.charAt(i - 1))) && (i2 >= length || !m69521k4(str.charAt(i2)))) {
                    c = 'M';
                }
                c6765kp.m26783k4(c, i2 - i);
                i = i2;
            } else {
                if (str.charAt(i) == '_') {
                    if (i != length - 1) {
                        i++;
                    }
                } else if (str.charAt(i) != '*') {
                    c6765kp.m26780k4(str.charAt(i) == 'h' ? 'H' : str.charAt(i));
                }
                i++;
            }
        }
        return f48301x1.containsItem(c6765kp.toString()) ? "" : c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private static String m69517k4(String str, double d) {
        if (!C14113y2.m67411k4(str) && !f48301x1.containsItem(str)) {
            if (C14113y2.m67448x1(str, "General")) {
                return C14113y2.m67408k4(C14044b3.m66425h4(d), C14113y2.m67422kk(C14113y2.m67401k4(str, "\\", (String) null), 7));
            }
            return m69518k4(str, d, false);
        }
        String strM66433k4 = C14044b3.m66433k4(d, C14113y2.m67408k4("0.", C14113y2.m67389k4('#', StyleIdentifier.LIST_TABLE_4_ACCENT_2)));
        if (strM66433k4.length() <= 9) {
            return strM66433k4;
        }
        double dM67468du = C14116yg.m67468du(d);
        return (dM67468du != 0.0d && C14044b3.m66425h4(dM67468du).length() <= 9) ? C14044b3.m66425h4(C14116yg.m67477k4(d, 9 - (C14044b3.m66425h4(dM67468du).length() + 1))) : strM66433k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m69518k4(String str, double d, boolean z) {
        String str2;
        String[] strArrM67414k4 = C14113y2.m67414k4(str, ';');
        if (strArrM67414k4.length == 1) {
            return m69528x1(str, d, false);
        }
        if (str.length() > 2 && str.charAt(0) == '[') {
            String str3 = ">";
            switch (str.charAt(1)) {
                case '<':
                    char cCharAt = str.charAt(2);
                    if (cCharAt == '=') {
                        str3 = "<=";
                    } else if (cCharAt != '>') {
                        str3 = "<";
                    }
                    break;
                case '=':
                    str3 = "=";
                    break;
                case '>':
                    if (str.charAt(2) == '=') {
                        str3 = ">=";
                    }
                    break;
                default:
                    str3 = null;
                    break;
            }
            if (str3 != null) {
                String strM67443x1 = C14113y2.m67443x1(str, str3.length() + 1, C14113y2.m67429to(str, ']') - (str3.length() + 1));
                if (m69525kk(strM67443x1)) {
                    try {
                        if (m69523k4(d, C14080ne.m66906fa(strM67443x1, (InterfaceC14073kp) C11697x1.m55250kk()), str3)) {
                            return m69528x1(strArrM67414k4[0], d, false);
                        }
                        if (strArrM67414k4.length <= 1) {
                            return C14113y2.f47374k4;
                        }
                        int length = strArrM67414k4.length - 1;
                        String[] strArr = new String[length];
                        System.arraycopy(strArrM67414k4, 1, strArr, 0, length);
                        return m69518k4(C14113y2.m67403k4(";", strArr), d, false);
                    } catch (RuntimeException e) {
                        C3085sv.m13082k4(e);
                    }
                }
            }
        }
        if (d > 0.0d) {
            str2 = strArrM67414k4[0];
        } else if (d < 0.0d) {
            str2 = strArrM67414k4[1];
            d = C14116yg.m67475k4(d);
        } else {
            str2 = strArrM67414k4.length < 3 ? strArrM67414k4[0] : strArrM67414k4[2];
        }
        return m69528x1(str2, d, false);
    }

    /* JADX INFO: renamed from: kk */
    private static boolean m69525kk(String str) {
        if (str == null || "".equals(str)) {
            return false;
        }
        String strM67440x1 = C14113y2.m67440x1(str);
        if (strM67440x1.length() == 0) {
            return false;
        }
        char cCharAt = C5449c5.m22523k4().m22531h4().m55263fa().m55062ne().charAt(0);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        while (i < strM67440x1.length()) {
            if (strM67440x1.charAt(i) >= '0' && strM67440x1.charAt(i) <= '9') {
                z = true;
            } else if (strM67440x1.charAt(i) == cCharAt || strM67440x1.charAt(i) == '.') {
                i2++;
                if (i2 > 1 || strM67440x1.length() == 1) {
                    return false;
                }
            } else {
                char cCharAt2 = strM67440x1.charAt(i);
                if (cCharAt2 == '+' || cCharAt2 == '-') {
                    if (i != 0 || strM67440x1.length() == 1) {
                        return false;
                    }
                } else if (cCharAt2 != 'E') {
                    if (i2 != 0 || strM67440x1.charAt(i) != C11697x1.m55252to().m55263fa().m55050ix().charAt(0)) {
                        return false;
                    }
                    if ((i4 != -1 && i - i4 <= 3) || i + 3 >= strM67440x1.length()) {
                        return false;
                    }
                    i4 = i;
                } else {
                    if (strM67440x1.length() != 1 && i != 0 && i <= strM67440x1.length() - 3) {
                        i++;
                        if ((strM67440x1.charAt(i) == '+' || strM67440x1.charAt(i) == '-') && (i3 = i3 + 1) <= 1) {
                        }
                    }
                    return false;
                }
            }
            i++;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r5 != '/') goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b5, code lost:
    
        if (r18 != 39) goto L7;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String m69519k4(String str, int i) {
        char cCharAt;
        int length = str.length();
        C6765kp c6765kp = new C6765kp(length);
        int i2 = 0;
        while (i2 < length) {
            char c = 'M';
            switch (str.charAt(i2)) {
                case '\"':
                    c6765kp.m26780k4(str.charAt(i2));
                    do {
                        i2++;
                        if (i2 < length) {
                            c6765kp.m26780k4(str.charAt(i2));
                        }
                        i2++;
                        break;
                    } while (str.charAt(i2) != '\"');
                    i2++;
                    break;
                case '\'':
                    c6765kp.m26792k4("\"'");
                    while (true) {
                        int i3 = i2 + 1;
                        if (i3 >= length) {
                            c6765kp.m26780k4('\"');
                            i2 = i3;
                        } else if (str.charAt(i3) == '\'') {
                            c6765kp.m26780k4('\'');
                            i2 = i3;
                        } else if (str.charAt(i3) == '\\') {
                            i2 += 2;
                            c6765kp.m26780k4(str.charAt(i2));
                        } else {
                            c6765kp.m26780k4('\"');
                        }
                    }
                    i2++;
                    break;
                case '*':
                    i2++;
                    break;
                case 'A':
                case 'a':
                    if (str.length() - i2 >= 3) {
                        int i4 = 1;
                        for (int i5 = i2 + 1; i5 < str.length(); i5++) {
                            if (str.charAt(i5) == 'a') {
                                i4++;
                            }
                        }
                        if (i4 >= 3) {
                            c6765kp.m26792k4(i4 == 3 ? "ddd" : "dddd");
                            i2 += i4 - 1;
                        }
                        i2++;
                        break;
                    }
                    int i6 = i2 + 4;
                    if (str.length() <= i6 || str.charAt(i2 + 1) != 'M' || str.charAt(i2 + 2) != '/' || str.charAt(i2 + 3) != 'P' || str.charAt(i6) != 'M') {
                        c6765kp.m26780k4(i != 39 ? str.charAt(i2) : 'y');
                    } else {
                        if (i != 49 || !C14113y2.m67448x1(str, "[$-F400]")) {
                            c6765kp.m26792k4("tt");
                            c6765kp.m26781k4('H', 'h');
                        }
                        i2 = i6;
                    }
                    i2++;
                    break;
                case 'D':
                case 'd':
                    c6765kp.m26780k4('d');
                    i2++;
                    break;
                case 'G':
                case 'g':
                    break;
                case 'H':
                case 'h':
                    if (i2 == 0 || str.charAt(i2 - 1) != 'h' || (i2 < str.length() - 1 && str.charAt(i2 + 1) == ':')) {
                        c6765kp.m26780k4('H');
                    }
                    i2++;
                    break;
                case 'J':
                    if (i != 49) {
                        cCharAt = 'J';
                        c6765kp.m26780k4(cCharAt);
                        i2++;
                    }
                    c6765kp.m26780k4('y');
                    i2++;
                    break;
                case 'M':
                case 'm':
                    int i7 = i2 + 1;
                    while (i7 < length && str.charAt(i7) == 'm') {
                        i7++;
                    }
                    if ((i2 > 0 && m69521k4(str.charAt(i2 - 1))) || (i7 < length && m69521k4(str.charAt(i7)))) {
                        c = 'm';
                    }
                    c6765kp.m26783k4(c, i7 - i2);
                    i2 = i7;
                    break;
                case 'T':
                    if (i != 49) {
                        cCharAt = 'T';
                        c6765kp.m26780k4(cCharAt);
                        i2++;
                    }
                    c6765kp.m26780k4('d');
                    i2++;
                    break;
                case 'Y':
                case 'y':
                    c6765kp.m26780k4('y');
                    i2++;
                    break;
                case '\\':
                    int i8 = i2 + 1;
                    if (i8 < length) {
                        char cCharAt2 = str.charAt(i8);
                        if (cCharAt2 != ' ') {
                            if (cCharAt2 != '\'') {
                                if (cCharAt2 != '-') {
                                }
                            }
                        }
                    }
                    i2++;
                    break;
                case '_':
                    if (i2 != length - 1) {
                        i2++;
                    }
                    i2++;
                    break;
                default:
                    cCharAt = str.charAt(i2);
                    c6765kp.m26780k4(cCharAt);
                    i2++;
                    break;
            }
        }
        String string = c6765kp.toString();
        return (i == 49 && C14113y2.m67448x1(string, "[$-F800]")) ? C14113y2.m67401k4(string, "MMMM\\ dd\\,", "dd. MMMM") : string;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m69520k4(String str, C14084qq c14084qq, boolean z) {
        String[] strArrM67414k4 = C14113y2.m67414k4(str, ';');
        if (strArrM67414k4.length != 1) {
            str = strArrM67414k4[0];
        }
        return m69529x1(str, c14084qq.Clone(), z);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C14337qc c14337qc) {
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m69521k4(char c) {
        return c == 'h' || c == 's' || c == ':';
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m69522k4(double d, double d2) {
        double dM67475k4 = C14116yg.m67475k4(d - d2);
        if (dM67475k4 < Double.MIN_VALUE) {
            return true;
        }
        return (dM67475k4 >= 1.0E-4d || C14116yg.m67475k4(d) >= C7019kk.m27433c5(C14046bv.f47170x1, 15)) ? d == d2 : C14046bv.m66453dy(C7019kk.m27440jd(Double.valueOf(d), 14), C7019kk.m27440jd(Double.valueOf(d2), 14));
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m69523k4(double d, double d2, String str) {
        int iM27428k4 = f48300kk.m27428k4(str);
        return iM27428k4 != 0 ? iM27428k4 != 1 ? iM27428k4 != 2 ? iM27428k4 != 3 ? iM27428k4 != 4 ? iM27428k4 == 5 && C14116yg.m67475k4(d - d2) > Double.MIN_VALUE : d > d2 || C14116yg.m67475k4(d - d2) <= 1.0E-16d : d < d2 || C14116yg.m67475k4(d - d2) <= 1.0E-16d : !m69522k4(d, d2) && d > d2 : !m69522k4(d, d2) && d < d2 : m69522k4(d, d2) || C14116yg.m67475k4(d - d2) <= 1.0E-16d;
    }

    /* JADX INFO: renamed from: x1 */
    private static String m69528x1(String str, double d, boolean z) {
        int i;
        String strM66433k4;
        boolean z2;
        String strM67422kk;
        double d2 = d;
        if (str == null || "".equals(str)) {
            return "";
        }
        C12385to c12385toM57970k4 = C12380dy.m57970k4(str, "(^\\?+$)|(^\\?+/\\?+$)");
        if (c12385toM57970k4.mo58006to()) {
            return androidx.datastore.preferences.protobuf.o000oOoO.OooO0OO(c12385toM57970k4, 1) ? C14044b3.m66433k4(d2, "0") : C14044b3.m66433k4(d2, str);
        }
        String strM69519k4 = m69519k4(C14113y2.m67401k4(C14113y2.m67401k4(str, "_(", (String) null), "G/", "/"), 1);
        int iM67364dy = C14113y2.m67364dy(strM69519k4, "[");
        if (iM67364dy == -1) {
            if (d2 == 0.0d) {
                strM69519k4 = C14113y2.m67401k4(strM69519k4, MsalUtils.QUERY_STRING_SYMBOL, (String) null);
            }
            if (C12380dy.m57977kk(m69526x1(strM69519k4), f48299k4, 66)) {
                return m69514k4(d2, false).Clone().m67140k4(strM69519k4);
            }
            if ("GENERAL".equals(C14113y2.m67358c5(strM69519k4)) || "@".equals(strM69519k4)) {
                return C14044b3.m66425h4(d2);
            }
            if (C14113y2.m67364dy(strM69519k4, "\"'") != -1) {
                return C14044b3.m66433k4(d2, strM69519k4);
            }
            if (C14113y2.m67364dy(strM69519k4, "\"") == -1) {
                return m69527x1(strM69519k4, d2);
            }
            C6765kp c6765kp = new C6765kp();
            int i2 = 0;
            int i3 = 0;
            while (i2 < strM69519k4.length()) {
                if (strM69519k4.charAt(i2) == '\"') {
                    if (i3 < i2) {
                        c6765kp.m26792k4(m69527x1(C14113y2.m67443x1(strM69519k4, i3, i2 - i3), d2));
                    }
                    while (true) {
                        i2++;
                        if (i2 >= strM69519k4.length()) {
                            break;
                        }
                        if (strM69519k4.charAt(i2) == '\"') {
                            i3 = i2 + 1;
                            break;
                        }
                        c6765kp.m26780k4(strM69519k4.charAt(i2));
                    }
                }
                i2++;
            }
            if (i3 < strM69519k4.length()) {
                if (d2 < 0.0d) {
                    c6765kp.m26808x1(0, '-');
                    strM67422kk = C14113y2.m67422kk(strM69519k4, i3);
                    d2 = -d2;
                } else {
                    strM67422kk = C14113y2.m67422kk(strM69519k4, i3);
                }
                c6765kp.m26792k4(m69527x1(strM67422kk, d2));
            }
            return c6765kp.toString();
        }
        int iM67364dy2 = C14113y2.m67364dy(strM69519k4, "]");
        if (iM67364dy2 == -1) {
            return C14044b3.m66425h4(d2);
        }
        char cCharAt = strM69519k4.charAt(iM67364dy + 1);
        String str2 = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
        if (cCharAt != '$') {
            String strM67440x1 = C14113y2.m67440x1(C14113y2.m67396k4(strM69519k4, iM67364dy, (iM67364dy2 - iM67364dy) + 1));
            int iM67364dy3 = C14113y2.m67364dy(strM67440x1, "[");
            int iM67364dy4 = C14113y2.m67364dy(strM67440x1, "]");
            if (iM67364dy3 == -1 || strM67440x1.charAt(iM67364dy3 + 1) != '$') {
                int iM69513k4 = m69513k4(strM67440x1, ',');
                return C14044b3.m66433k4(iM69513k4 > 1 ? d2 / ((double) iM69513k4) : d2, strM67440x1);
            }
            if (iM67364dy3 == 0) {
                String strM67443x1 = C14113y2.m67443x1(strM67440x1, 2, iM67364dy4 - 2);
                int iM67364dy5 = C14113y2.m67364dy(strM67443x1, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
                if (iM67364dy5 != -1) {
                    strM67443x1 = C14113y2.m67443x1(strM67443x1, 0, iM67364dy5);
                }
                String strM67422kk2 = C14113y2.m67422kk(strM67440x1, iM67364dy4 + 1);
                if (strM67422kk2.charAt(0) == '*') {
                    strM67422kk2 = C14113y2.m67440x1(C14113y2.m67422kk(strM67422kk2, 1));
                }
                if (C14113y2.m67424kk(strM67422kk2, C18115b5.CONNECTOR)) {
                    strM67422kk2 = OooO0OO.OooO00o(1, 0, strM67422kk2, strM67422kk2);
                }
                if (C14113y2.m67382k4("M", strM67422kk2, true) != 0) {
                    String strM66433k42 = C14044b3.m66433k4(d2, strM67422kk2);
                    if (C14113y2.m67424kk(strM66433k42, "_)")) {
                        strM66433k42 = OooO0OO.OooO00o(2, 0, strM66433k42, strM66433k42);
                    }
                    return C14113y2.m67408k4(strM67443x1, strM66433k42);
                }
                int iM67129dy = m69514k4(d2, false).m67129dy();
                if (C14113y2.m67448x1(str, "[DBNum1]")) {
                    switch (iM67129dy) {
                        case 1:
                            return "Т»";
                        case 2:
                            return "¶ю";
                        case 3:
                            return "Иэ";
                        case 4:
                            return "ЛД";
                        case 5:
                            return "Ое";
                        case 6:
                            return "Бщ";
                        case 7:
                            return "ЖЯ";
                        case 8:
                            return "°Л";
                        case 9:
                            return "ѕЕ";
                        case 10:
                            return "К®";
                        case 11:
                            return "К®Т»";
                        case 12:
                            return "К®¶ю";
                    }
                }
                return C14057f9.m66591x1(iM67129dy);
            }
            if (strM67440x1.charAt(0) != '(' || androidx.core.content.OooO0O0.OooO00o(1, strM67440x1) != ')') {
                return C14113y2.m67408k4(C14044b3.m66433k4(d2, C14113y2.m67443x1(strM67440x1, 0, iM67364dy3)), C14113y2.m67443x1(strM67440x1, iM67364dy3 + 2, (iM67364dy4 - iM67364dy3) - 2));
            }
            C12383kk c12383kkM58004du = new C12380dy("([[]\\$\\S*-\\S*[]])([ ]*)(\\S+)\\)", 66).m57989x1(strM67440x1).m58004du();
            if (c12383kkM58004du.m57999k4() == 1) {
                return C14113y2.m67408k4("(", C14044b3.m66433k4(d2, OooO0OO.OooO00o(2, 1, strM67440x1, strM67440x1)), ")");
            }
            String strM67400k4 = "";
            for (int i4 = 1; i4 < c12383kkM58004du.m57999k4(); i4++) {
                String strMo57995kk = c12383kkM58004du.m58000k4(i4).mo57995kk();
                if (C14113y2.m67364dy(strMo57995kk, "$") != -1) {
                    strM67400k4 = (strMo57995kk.length() == 3 || strMo57995kk.charAt(2) == '-') ? C14113y2.m67400k4(strM67400k4, "$") : C14113y2.m67441x1(strM67400k4, strMo57995kk.charAt(2));
                } else {
                    if (!"".equals(C14113y2.m67401k4(strMo57995kk, " ", (String) null))) {
                        strMo57995kk = C14044b3.m66433k4(d2, strMo57995kk);
                    }
                    strM67400k4 = C14113y2.m67400k4(strM67400k4, strMo57995kk);
                }
            }
            return C14113y2.m67408k4("(", strM67400k4, ")");
        }
        if (iM67364dy == 0) {
            String strM67443x12 = C14113y2.m67443x1(strM69519k4, 2, iM67364dy2 - 2);
            C14093tq c14093tq = new C14093tq();
            int iM67364dy6 = C14113y2.m67364dy(strM67443x12, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
            if (iM67364dy6 != -1) {
                int[] iArr = {0};
                boolean zM66589k4 = C14057f9.m66589k4(C14113y2.m67443x1(strM67443x12, iM67364dy6 + 1, (strM67443x12.length() - iM67364dy6) - 1), 515, null, iArr);
                int i5 = iArr[0];
                if (zM66589k4) {
                    c14093tq = new C14093tq(Integer.valueOf(i5));
                }
                i = 0;
                strM67443x12 = C14113y2.m67443x1(strM67443x12, 0, iM67364dy6);
            } else {
                i = 0;
            }
            String strM67422kk3 = C14113y2.m67422kk(strM69519k4, iM67364dy2 + 1);
            if ("general".equals(C14113y2.m67368h4(strM67422kk3))) {
                return C14044b3.m66425h4(d2);
            }
            String strM67401k4 = C14113y2.m67401k4(m69519k4(strM67422kk3, i), MsalUtils.QUERY_STRING_SYMBOL, "");
            int iM69513k42 = m69513k4(strM67401k4, ',');
            if (iM69513k42 > 1) {
                d2 /= (double) iM69513k42;
            }
            C11697x1 c11697x1 = c14093tq.m67302x1() ? new C11697x1(((Integer) c14093tq.m67297k4()).intValue()) : null;
            if (C12380dy.m57977kk(strM67401k4, f48299k4, 66)) {
                strM66433k4 = m69514k4(d2, false).mo66517k4(strM67401k4, c11697x1);
                z2 = false;
            } else {
                boolean z3 = C14116yg.m67472h4(d2) < 0;
                strM66433k4 = C14044b3.m66433k4(C14116yg.m67475k4(d2), strM67401k4);
                z2 = z3;
            }
            if (!z2) {
                str2 = C14113y2.f47374k4;
            }
            return C14113y2.m67402k4("{0}{1}{2}", str2, strM67443x12, strM66433k4);
        }
        if (strM69519k4.charAt(0) == '(') {
            int i6 = 1;
            if (androidx.core.content.OooO0O0.OooO00o(1, strM69519k4) == ')') {
                C12383kk c12383kkM58004du2 = new C12380dy("(\\[\\$\\S*\\-\\S*\\])(\\[ \\]*)(\\S+)\\)", 66).m57989x1(strM69519k4).m58004du();
                if (c12383kkM58004du2.m57999k4() == 1) {
                    return C14113y2.m67408k4("(", C14044b3.m66433k4(d2, OooO0OO.OooO00o(2, 1, strM69519k4, strM69519k4)), ")");
                }
                String strM67400k42 = "";
                int i7 = 1;
                while (i7 < c12383kkM58004du2.m57999k4()) {
                    String strMo57995kk2 = c12383kkM58004du2.m58000k4(i7).mo57995kk();
                    if (i7 != i6 || strMo57995kk2.charAt(i6) != '$') {
                        strM67400k42 = "".equals(C14113y2.m67401k4(strMo57995kk2, " ", (String) null)) ? C14113y2.m67400k4(strM67400k42, strMo57995kk2) : C14113y2.m67400k4(strM67400k42, C14044b3.m66433k4(d2, strMo57995kk2));
                    } else if (strMo57995kk2.length() > 3 && strMo57995kk2.charAt(3) == '-') {
                        strM67400k42 = C14113y2.m67441x1(strM67400k42, strMo57995kk2.charAt(2));
                    }
                    i7++;
                    i6 = 1;
                }
                return C14113y2.m67408k4("(", strM67400k42, ")");
            }
        }
        C6765kp c6765kp2 = new C6765kp();
        Iterator<C12385to> it = C12380dy.m57980x1(strM69519k4, "\\[\\$\\S*\\-\\S*\\]", 66).iterator();
        int i8 = 0;
        while (it.hasNext()) {
            try {
                C12385to next = it.next();
                if (next.mo58006to()) {
                    int iMo57994k4 = next.mo57994k4();
                    int iMo57996x1 = next.mo57996x1() + iMo57994k4;
                    c6765kp2.m26792k4(C14113y2.m67443x1(strM69519k4, i8, iMo57994k4));
                    for (int i9 = iMo57994k4 + 2; i9 < iMo57996x1 && strM69519k4.charAt(i9) != '-'; i9++) {
                        c6765kp2.m26780k4(strM69519k4.charAt(i9));
                    }
                    i8 = iMo57996x1;
                    iM67364dy = iMo57994k4;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        if (i8 != 0) {
            if (i8 < strM69519k4.length() - 1 && strM69519k4.charAt(i8) == '*') {
                i8++;
            }
            int length = strM69519k4.length() - i8;
            if (C14113y2.m67424kk(strM69519k4, "_-")) {
                length -= 2;
            }
            c6765kp2.m26792k4(C14113y2.m67443x1(strM69519k4, i8, length));
        }
        return c6765kp2.m26807x1() != 0 ? C14044b3.m66433k4(d2, c6765kp2.toString()) : C14113y2.m67408k4(C14044b3.m66433k4(d2, C14113y2.m67443x1(strM69519k4, 0, iM67364dy)), C14113y2.m67443x1(strM69519k4, iM67364dy + 2, (iM67364dy2 - iM67364dy) - 2));
    }

    /* JADX INFO: renamed from: x1 */
    private static String m69529x1(String str, C14084qq c14084qq, boolean z) {
        if (str == null || "".equals(str)) {
            return z ? c14084qq.m67139k4((InterfaceC14073kp) C11691kk.m55145um()) : c14084qq.toString();
        }
        String strM67401k4 = C14113y2.m67401k4(m69516k4(C14113y2.m67368h4(str)), "[HH]", "HH");
        int iM67364dy = C14113y2.m67364dy(strM67401k4, "[");
        if (iM67364dy == -1) {
            return z ? c14084qq.mo66517k4(strM67401k4, C11691kk.m55145um()) : c14084qq.m67140k4(strM67401k4);
        }
        int iM67364dy2 = C14113y2.m67364dy(strM67401k4, "]");
        if (iM67364dy2 == -1) {
            return c14084qq.toString();
        }
        String strM67396k4 = C14113y2.m67396k4(strM67401k4, iM67364dy, (iM67364dy2 - iM67364dy) + 1);
        if (z) {
            return c14084qq.mo66517k4(strM67396k4, C11691kk.m55145um());
        }
        String strM67140k4 = c14084qq.m67140k4(strM67396k4);
        return "MMMMM".equals(strM67396k4) ? C14113y2.m67443x1(strM67140k4, 0, 1) : strM67140k4;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m69530x1(C14337qc c14337qc) {
        return true;
    }
}
