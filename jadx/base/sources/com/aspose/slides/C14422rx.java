package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3068ks;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p492x4.AbstractC12384m9;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.aspose.words.ControlChar;
import com.facebook.common.callercontext.ContextChain;
import com.huawei.hms.network.embedded.C18358t1;
import com.microsoft.identity.client.internal.MsalUtils;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.miui.penengine.p596e.C18773h;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.rx */
/* JADX INFO: loaded from: classes3.dex */
class C14422rx {

    /* JADX INFO: renamed from: ck */
    private final String f48716ck;

    /* JADX INFO: renamed from: fa */
    private final C12007ix f48719fa;

    /* JADX INFO: renamed from: kk */
    private final String[] f48722kk;

    /* JADX INFO: renamed from: up */
    private String[] f48725up;

    /* JADX INFO: renamed from: x1 */
    private final C14676vg f48726x1;

    /* JADX INFO: renamed from: yj */
    private int f48727yj;

    /* JADX INFO: renamed from: ks */
    private static final C14424rz f48708ks = new C14424rz("-5 0 1");

    /* JADX INFO: renamed from: rv */
    private static final C14424rz f48710rv = new C14424rz("");

    /* JADX INFO: renamed from: x6 */
    private static final C14424rz f48714x6 = new C14424rz("-5 0 1");

    /* JADX INFO: renamed from: ne */
    private static final C14666v7 f48709ne = new C14666v7("");

    /* JADX INFO: renamed from: ix */
    private static final C1161gt f48706ix = new C1161gt("3.5cm -3.5cm 25cm");

    /* JADX INFO: renamed from: k4 */
    static final String[] f48707k4 = {"c", "w", C18773h.f57233c, "ss", "ls", "hc", "vc", "l", "t", "r", "b"};

    /* JADX INFO: renamed from: u4 */
    private static final C3068ks f48711u4 = new C3068ks("*/", "+-", "+/", "?:", "abs", "at2", "cat2", "cos", "max", "min", "mod", "pin", "sat2", "sin", "sqrt", "tan", "val");

    /* JADX INFO: renamed from: uz */
    private static final int[] f48712uz = {3, 3, 3, 3, 1, 2, 3, 2, 2, 2, 3, 3, 3, 2, 1, 2, 1};

    /* JADX INFO: renamed from: wl */
    private static final C7017h4 f48713wl = new C7017h4(C18358t1.g.f56183c, "/", "+", CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, "abs[", "sqrt[", "sin[", "cos[", "tan[", "atan[", "min[", "max[", "atan2[", "if[");

    /* JADX INFO: renamed from: to */
    private final Dictionary<String, String> f48724to = new Dictionary<>();

    /* JADX INFO: renamed from: du */
    private final Dictionary<String, String> f48717du = new Dictionary<>();

    /* JADX INFO: renamed from: h4 */
    private final Dictionary<String, C1139gc> f48720h4 = new Dictionary<>();

    /* JADX INFO: renamed from: m9 */
    private final Dictionary<String, String> f48723m9 = new Dictionary<>();

    /* JADX INFO: renamed from: dy */
    private final Dictionary<String, String> f48718dy = new Dictionary<>();

    /* JADX INFO: renamed from: c5 */
    private final List<String> f48715c5 = new List<>();

    /* JADX INFO: renamed from: jd */
    private final Dictionary<String, Integer> f48721jd = new Dictionary<>();

    public C14422rx(com.aspose.slides.internal.p332p7.vyd vydVar, C12007ix c12007ix, boolean z) {
        C12007ix c12007ix2 = new C12007ix();
        this.f48719fa = c12007ix2;
        String strM43422m9 = vydVar.m43422m9();
        this.f48716ck = strM43422m9;
        c12007ix.CloneTo(c12007ix2);
        if (C14113y2.m67411k4(strM43422m9) || !C14113y2.m67359c5(strM43422m9, MsalUtils.QUERY_STRING_SYMBOL)) {
            this.f48722kk = new String[0];
        } else {
            this.f48722kk = new String[vydVar.m43425up().length];
        }
        for (int i = 0; i < this.f48722kk.length; i++) {
            com.aspose.slides.internal.p332p7.gh7 gh7Var = vydVar.m43425up()[i];
            this.f48724to.addItem(gh7Var.m32533k4(), gh7Var.m32535x1());
            this.f48722kk[i] = gh7Var.m32533k4();
        }
        int[] iArr = {0};
        int[] iArr2 = {0};
        int[] iArr3 = {0};
        int[] iArr4 = {0};
        wgi.m72726k4(vydVar.m43420kk(), iArr, iArr2, iArr3, iArr4);
        int i2 = iArr[0];
        int i3 = iArr2[0];
        int iM27462to = iArr3[0];
        int iM27462to2 = iArr4[0];
        if (z && c12007ix.m56550c5() > 0.0f && c12007ix.m56575x1() > 0.0f) {
            int iM67482k4 = C14116yg.m67482k4(iM27462to - i2);
            int iM67482k42 = C14116yg.m67482k4(iM27462to2 - i3);
            if (iM67482k4 == 21600 && iM67482k42 == iM67482k4) {
                if (c12007ix.m56550c5() > c12007ix.m56575x1()) {
                    iM27462to = C7019kk.m27462to(Double.valueOf(C14116yg.m67497to((c12007ix.m56550c5() * iM67482k42) / c12007ix.m56575x1())), 14) + i2;
                } else {
                    iM27462to2 = C7019kk.m27462to(Double.valueOf(C14116yg.m67497to((c12007ix.m56575x1() * iM67482k4) / c12007ix.m56550c5())), 14) + i3;
                }
            }
        } else if (iM27462to == 0 && iM27462to2 == 0 && wgi.m72731kk(vydVar.m43416h4())) {
            iArr3[0] = iM27462to;
            iArr4[0] = iM27462to2;
            wgi.m72725k4(vydVar.m43416h4(), iArr3, iArr4);
            iM27462to = iArr3[0];
            iM27462to2 = iArr4[0];
        }
        this.f48726x1 = new C14676vg(i2, i3, iM27462to, iM27462to2);
        this.f48725up = new String[]{"0", "0", "w", C18773h.f57233c};
    }

    /* JADX INFO: renamed from: kk */
    public static int m70364kk(String str, String[] strArr) {
        int length = strArr.length + 1;
        int length2 = str.length();
        for (int i = 0; i < strArr.length; i++) {
            int iM67364dy = C14113y2.m67364dy(str, strArr[i]);
            if (iM67364dy < length2 && iM67364dy > -1 && i < length) {
                length = i;
                length2 = iM67364dy;
            }
        }
        return length;
    }

    /* JADX INFO: renamed from: du */
    public final C14676vg m70369du() {
        return this.f48726x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final String[] m70370h4() {
        return this.f48725up;
    }

    /* JADX INFO: renamed from: k4 */
    public final double m70371k4(String str) {
        double dM70379x1;
        double dM70379x12;
        double dM67470dy;
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) != ' ') {
            i++;
        }
        int iM12963k4 = f48711u4.m12963k4(C14113y2.m67443x1(str, 0, i));
        byte b = (byte) iM12963k4;
        int i2 = f48712uz[iM12963k4];
        String[] strArrM67414k4 = C14113y2.m67414k4(C14113y2.m67440x1(C14113y2.m67422kk(str, i)), ControlChar.SPACE_CHAR);
        double dM70379x13 = m70379x1(strArrM67414k4[0]);
        if (i2 > 1) {
            dM70379x1 = m70379x1(strArrM67414k4[1]);
            dM70379x12 = (i2 <= 2 || strArrM67414k4.length <= 2) ? 0.0d : m70379x1(strArrM67414k4[2]);
        } else {
            dM70379x1 = 0.0d;
            dM70379x12 = 0.0d;
        }
        switch (b) {
            case 0:
                if (dM70379x12 == 0.0d) {
                    dM70379x12 = 1.0d;
                }
                return (dM70379x13 * dM70379x1) / dM70379x12;
            case 1:
                return (dM70379x13 + dM70379x1) - dM70379x12;
            case 2:
            case 6:
            case 10:
            case 11:
            case 12:
            default:
                return 0.0d;
            case 3:
                return dM70379x13 > 0.0d ? dM70379x1 : dM70379x12;
            case 4:
                return C14116yg.m67475k4(dM70379x13);
            case 5:
                return C14116yg.m67498to(dM70379x1, dM70379x13);
            case 7:
                dM67470dy = C14116yg.m67470dy(dM70379x1);
                break;
            case 8:
                return C14116yg.m67502x1(dM70379x13, dM70379x1);
            case 9:
                return C14116yg.m67491kk(dM70379x13, dM70379x1);
            case 13:
                dM67470dy = C14116yg.m67495m9(dM70379x1);
                break;
            case 14:
                return C14116yg.m67496rv(C14116yg.m67475k4(dM70379x13));
            case 15:
                dM67470dy = C14116yg.m67466c5(dM70379x1);
                break;
            case 16:
                return dM70379x13;
        }
        return dM67470dy * dM70379x13;
    }

    /* JADX INFO: renamed from: m9 */
    public final Dictionary<String, Double> m70377m9() {
        Dictionary<String, Double> dictionary = new Dictionary<>();
        Dictionary.Enumerator<String, C1139gc> it = this.f48720h4.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (!C14113y2.m67411k4(((C1139gc) next.getValue()).m6492x1())) {
                    dictionary.addItem(((C1139gc) next.getValue()).m6492x1(), Double.valueOf(((C1139gc) next.getValue()).m6491k4()));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return dictionary;
    }

    /* JADX INFO: renamed from: to */
    public final Dictionary<String, Integer> m70378to() {
        return this.f48721jd;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m70379x1(String str) {
        int i;
        if ("".equals(str)) {
            return 9.223372036854776E18d;
        }
        int length = str.length();
        int i2 = 0;
        while (i2 < length && str.charAt(i2) == ' ') {
            i2++;
        }
        if (str.charAt(i2) == '-') {
            do {
                i2++;
                if (i2 >= length) {
                    break;
                }
            } while (str.charAt(i2) == ' ');
            i = -1;
        } else {
            if (str.charAt(i2) == '+') {
                do {
                    i2++;
                    if (i2 >= length) {
                        break;
                    }
                } while (str.charAt(i2) == ' ');
            }
            i = 1;
        }
        long j = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < '0' || cCharAt > '9') {
                return this.f48720h4.get_Item(str).m6491k4();
            }
            j = (j * 10) + ((long) (cCharAt - '0'));
            i2++;
        }
        return ((double) i) * j;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m70360k4(int i, String str, String[] strArr) {
        int i2 = -1;
        for (String str2 : strArr) {
            int iM67364dy = C14113y2.m67364dy(str, str2);
            if (iM67364dy > -1 && iM67364dy > i2 && iM67364dy < i) {
                i2 = iM67364dy;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: to */
    public static String m70366to(String str, String[] strArr) {
        C6765kp c6765kp = new C6765kp(str);
        for (int i = 0; i < strArr.length; i++) {
            int iM67364dy = C14113y2.m67364dy(str, C14113y2.m67407k4(strArr[i], '('));
            int length = strArr[i].length() + iM67364dy;
            if (iM67364dy > -1) {
                int iM70361k4 = m70361k4(str, length, '(', ')');
                c6765kp.m26802k4(length, '[');
                c6765kp.m26802k4(iM70361k4, ']');
            }
            str = c6765kp.toString();
        }
        return str;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m70367x1(int i, String str, String[] strArr) {
        int length = str.length();
        for (String str2 : strArr) {
            int iM67364dy = C14113y2.m67364dy(str, str2);
            if (iM67364dy > -1 && iM67364dy < length && iM67364dy > i) {
                length = iM67364dy;
            }
        }
        return length;
    }

    /* JADX INFO: renamed from: kk */
    public final Dictionary<String, String> m70376kk() {
        return this.f48717du;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m70361k4(String str, int i, char c, char c2) {
        int i2 = 0;
        for (int i3 = i + 1; i3 < str.length(); i3++) {
            if (str.charAt(i3) == c) {
                i2++;
            }
            if (str.charAt(i3) == c2) {
                if (i2 == 0) {
                    return i3;
                }
                i2--;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: kk */
    public static String m70365kk(String str) {
        return C14113y2.m67448x1(str, MsalUtils.QUERY_STRING_SYMBOL) ? OooO0OO.OooO00o(1, 1, str, str) : str;
    }

    /* JADX INFO: renamed from: x1 */
    public final Dictionary<String, String> m70380x1() {
        return this.f48718dy;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m70368x1(String str, String[] strArr) {
        int i = 0;
        for (String str2 : strArr) {
            if (C14113y2.m67364dy(str, str2) > -1) {
                i++;
            }
            if (i > 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final List<String> m70372k4() {
        return this.f48715c5;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m70362k4(String str, List<KeyValuePair<String, Double>> list) {
        List.Enumerator<KeyValuePair<String, Double>> it = list.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair<String, Double> next = it.next();
                str = C14113y2.m67401k4(str, next.getKey(), C14044b3.m66432k4(next.getValue().doubleValue(), (InterfaceC14073kp) C11697x1.m55250kk()));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m70363k4(String str, String[] strArr) {
        String strM67408k4;
        String strM67440x1 = C14113y2.m67440x1(str);
        Dictionary dictionary = new Dictionary();
        dictionary.addItem(C18358t1.g.f56183c, "*/");
        dictionary.addItem("/", "*/");
        dictionary.addItem("+", "+-");
        dictionary.addItem(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, "+-");
        dictionary.addItem("abs[", "abs");
        dictionary.addItem("sqrt[", "sqrt");
        dictionary.addItem("sin[", "sin");
        dictionary.addItem("cos[", "cos");
        dictionary.addItem("tan[", "tan");
        dictionary.addItem("atan[", "at2");
        dictionary.addItem("min[", "min");
        dictionary.addItem("max[", "max");
        dictionary.addItem("atan2[", "at2");
        dictionary.addItem("if[", "?:");
        int i = -1;
        String str2 = "";
        int i2 = -1;
        int i3 = 1;
        while (i3 < strArr.length) {
            int iM67364dy = C14113y2.m67364dy(strM67440x1, strArr[i3]);
            if (iM67364dy > i) {
                switch (f48713wl.m27428k4(strArr[i3])) {
                    case 0:
                        strM67408k4 = C14113y2.m67408k4((String) dictionary.get_Item(strArr[i3]), " ", C14113y2.m67440x1(C14113y2.m67443x1(strM67440x1, 0, iM67364dy)), " ", C14113y2.m67440x1(C14113y2.m67443x1(strM67440x1, iM67364dy + 1, (strM67440x1.length() - iM67364dy) - 1)), " 1");
                        break;
                    case 1:
                        strM67408k4 = C14113y2.m67408k4((String) dictionary.get_Item(strArr[i3]), " ", C14113y2.m67440x1(C14113y2.m67443x1(strM67440x1, 0, iM67364dy)), " 1 ", C14113y2.m67440x1(C14113y2.m67443x1(strM67440x1, iM67364dy + 1, (strM67440x1.length() - iM67364dy) - 1)));
                        break;
                    case 2:
                        strM67408k4 = C14113y2.m67408k4((String) dictionary.get_Item(strArr[i3]), " ", C14113y2.m67440x1(C14113y2.m67443x1(strM67440x1, 0, iM67364dy)), " ", C14113y2.m67440x1(C14113y2.m67443x1(strM67440x1, iM67364dy + 1, (strM67440x1.length() - iM67364dy) - 1)), " 0");
                        break;
                    case 3:
                        if (iM67364dy == 0) {
                            int iM67364dy2 = C14113y2.m67364dy(C14113y2.m67422kk(strM67440x1, 1), strArr[i3]);
                            strM67408k4 = iM67364dy2 <= -1 ? (!"f".equals(C14113y2.m67443x1(strM67440x1, 1, 1)) && !"m".equals(C14113y2.m67443x1(strM67440x1, 1, 1))) ? C14113y2.m67408k4("val ", C14113y2.m67440x1(strM67440x1)) : C14113y2.m67408k4((String) dictionary.get_Item(strArr[i3]), " ", "0 0 ", C14113y2.m67440x1(C14113y2.m67443x1(strM67440x1, iM67364dy + 1, (strM67440x1.length() - iM67364dy) - 1))) : C14113y2.m67408k4((String) dictionary.get_Item(strArr[i3]), " ", C14113y2.m67440x1(C14113y2.m67443x1(strM67440x1, 0, iM67364dy2 + 1)), " 0 ", C14113y2.m67440x1(C14113y2.m67443x1(strM67440x1, iM67364dy2 + 2, (strM67440x1.length() - iM67364dy2) - 2)));
                        } else {
                            strM67408k4 = C14113y2.m67408k4((String) dictionary.get_Item(strArr[i3]), " ", C14113y2.m67440x1(C14113y2.m67443x1(strM67440x1, 0, iM67364dy)), " 0 ", C14113y2.m67440x1(C14113y2.m67443x1(strM67440x1, iM67364dy + 1, (strM67440x1.length() - iM67364dy) - 1)));
                        }
                        break;
                    case 4:
                        strM67408k4 = C14113y2.m67408k4((String) dictionary.get_Item(strArr[i3]), " ", C14113y2.m67440x1(C14113y2.m67443x1(strM67440x1, 4, strM67440x1.length() - 5)));
                        break;
                    case 5:
                        strM67408k4 = C14113y2.m67408k4((String) dictionary.get_Item(strArr[i3]), " ", C14113y2.m67440x1(C14113y2.m67443x1(strM67440x1, 5, strM67440x1.length() - 6)));
                        break;
                    case 6:
                        strM67408k4 = C14113y2.m67408k4((String) dictionary.get_Item(strArr[i3]), " 1 ", C14113y2.m67440x1(C14113y2.m67443x1(strM67440x1, 4, strM67440x1.length() - 5)));
                        break;
                    case 7:
                        strM67408k4 = C14113y2.m67408k4((String) dictionary.get_Item(strArr[i3]), " 1 ", C14113y2.m67440x1(C14113y2.m67443x1(strM67440x1, 4, strM67440x1.length() - 5)));
                        break;
                    case 8:
                        strM67408k4 = C14113y2.m67408k4((String) dictionary.get_Item(strArr[i3]), " 1 ", C14113y2.m67440x1(C14113y2.m67443x1(strM67440x1, 4, strM67440x1.length() - 5)));
                        break;
                    case 9:
                        strM67408k4 = C14113y2.m67408k4((String) dictionary.get_Item(strArr[i3]), " ", C14113y2.m67440x1(C14113y2.m67443x1(strM67440x1, 4, strM67440x1.length() - 6)), " 1");
                        break;
                    case 10:
                    case 11:
                        String[] strArrM67414k4 = C14113y2.m67414k4(C14113y2.m67396k4(C14113y2.m67396k4(strM67440x1, 0, 4), C14113y2.m67396k4(strM67440x1, 0, 4).length() - 1, 1), ',');
                        strM67408k4 = C14113y2.m67408k4((String) dictionary.get_Item(strArr[i3]), " ", C14113y2.m67440x1(strArrM67414k4[0]), " ", C14113y2.m67440x1(strArrM67414k4[1]));
                        break;
                    case 12:
                        String[] strArrM67414k42 = C14113y2.m67414k4(C14113y2.m67396k4(C14113y2.m67396k4(strM67440x1, 0, 6), C14113y2.m67396k4(strM67440x1, 0, 6).length() - 1, 1), ',');
                        strM67408k4 = C14113y2.m67408k4((String) dictionary.get_Item(strArr[i3]), " ", C14113y2.m67440x1(strArrM67414k42[0]), " ", C14113y2.m67440x1(strArrM67414k42[1]));
                        break;
                    case 13:
                        String[] strArrM67414k43 = C14113y2.m67414k4(C14113y2.m67396k4(C14113y2.m67396k4(strM67440x1, 0, 3), C14113y2.m67396k4(strM67440x1, 0, 3).length() - 1, 1), ',');
                        strM67408k4 = C14113y2.m67408k4((String) dictionary.get_Item(strArr[i3]), " ", C14113y2.m67440x1(strArrM67414k43[0]), " ", C14113y2.m67440x1(strArrM67414k43[1]), " ", C14113y2.m67440x1(strArrM67414k43[2]));
                        break;
                    default:
                        i2 = i3;
                        continue;
                }
                str2 = strM67408k4;
                i2 = i3;
                continue;
            }
            i3++;
            i = -1;
        }
        return i2 == i ? C14113y2.m67408k4("val ", C14113y2.m67440x1(strM67440x1)) : str2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70373k4(Dictionary<String, String> dictionary, String str) {
        int iIndexOf;
        String[] strArrM67414k4 = C14113y2.m67414k4(dictionary.get_Item(str), ControlChar.SPACE_CHAR);
        int iIndexOf2 = this.f48715c5.indexOf(str);
        for (int i = 1; i < strArrM67414k4.length; i++) {
            if (this.f48715c5.indexOf(strArrM67414k4[i]) > -1 && (iIndexOf = this.f48715c5.indexOf(strArrM67414k4[i])) > iIndexOf2) {
                this.f48715c5.removeAt(iIndexOf);
                this.f48715c5.insertItem(iIndexOf2, strArrM67414k4[i]);
                m70373k4(dictionary, strArrM67414k4[i]);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: k4 */
    public final void m70374k4(com.aspose.slides.internal.p332p7.vyd vydVar) {
        String[] strArr = {"(", "sin[", "abs[", "sqrt[", "cos[", "tan[", "atan[", "min[", "max[", "atan2[", "if[", C18358t1.g.f56183c, "/", CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, "+"};
        String[] strArr2 = {"abs", "sqrt", "sin", "cos", "atan2", "atan", "tan", "min", "max", "if"};
        double[] dArrM72211du = this.f48726x1.m72211du();
        int[] iArrM72744yj = wgi.m72744yj(vydVar.m43415fa());
        double dM43414dy = vydVar.m43414dy();
        double dM43411c5 = vydVar.m43411c5();
        double dM67475k4 = C14116yg.m67475k4(dArrM72211du[2] - dArrM72211du[0]);
        double dM67475k42 = C14116yg.m67475k4(dArrM72211du[3] - dArrM72211du[1]);
        List list = new List();
        list.addItem(new KeyValuePair("left", Double.valueOf(C14116yg.m67477k4(dArrM72211du[0], 0))));
        list.addItem(new KeyValuePair("top", Double.valueOf(C14116yg.m67477k4(dArrM72211du[1], 0))));
        list.addItem(new KeyValuePair("right", Double.valueOf(C14116yg.m67477k4(dArrM72211du[2], 0))));
        list.addItem(new KeyValuePair("bottom", Double.valueOf(C14116yg.m67477k4(dArrM72211du[3], 0))));
        list.addItem(new KeyValuePair("xstretch", Double.valueOf(C14116yg.m67477k4(dM43414dy, 0))));
        list.addItem(new KeyValuePair("ystretch", Double.valueOf(C14116yg.m67477k4(dM43411c5, 0))));
        Double dValueOf = Double.valueOf(1.0d);
        list.addItem(new KeyValuePair("hasstroke", dValueOf));
        list.addItem(new KeyValuePair("hasfill", dValueOf));
        list.addItem(new KeyValuePair("logwidth", Double.valueOf(C14116yg.m67477k4(dM67475k4 / 100.0d, 0))));
        list.addItem(new KeyValuePair("logheight", Double.valueOf(C14116yg.m67477k4(dM67475k42 / 100.0d, 0))));
        list.addItem(new KeyValuePair("width", Double.valueOf(C14116yg.m67477k4(dM67475k4, 0))));
        list.addItem(new KeyValuePair("height", Double.valueOf(C14116yg.m67477k4(dM67475k42, 0))));
        list.addItem(new KeyValuePair("pi/180", Double.valueOf(60000.0d)));
        list.addItem(new KeyValuePair(ContextChain.TAG_PRODUCT_AND_INFRA, Double.valueOf(3.0d)));
        Dictionary dictionary = new Dictionary(this.f48724to);
        final Dictionary dictionary2 = new Dictionary(iArrM72744yj.length + this.f48722kk.length);
        for (int i = 0; i < iArrM72744yj.length; i++) {
            String strM67408k4 = C14113y2.m67408k4("m", C14057f9.m66591x1(this.f48718dy.size()));
            this.f48718dy.addItem(strM67408k4, C14057f9.m66586k4(iArrM72744yj[i], (InterfaceC14073kp) C11697x1.m55250kk()));
            dictionary2.set_Item(C14113y2.m67407k4('$', C14057f9.m66586k4(i, (InterfaceC14073kp) C11697x1.m55250kk())), strM67408k4);
        }
        this.f48727yj = this.f48722kk.length;
        int i2 = 0;
        while (true) {
            String[] strArr3 = this.f48722kk;
            if (i2 >= strArr3.length) {
                break;
            }
            String str = strArr3[i2];
            String strM70362k4 = m70362k4(m70366to((String) dictionary.get_Item(str), strArr2), (List<KeyValuePair<String, Double>>) list);
            this.f48717du.addItem(str, strM70362k4);
            this.f48715c5.addItem(str);
            m70375k4(str, strM70362k4, this.f48717du, strArr, strArr2);
            dictionary2.set_Item(C14113y2.m67408k4(MsalUtils.QUERY_STRING_SYMBOL, str), str);
            this.f48723m9.addItem(str, str);
            i2++;
        }
        if (this.f48717du.size() > 0) {
            C6765kp c6765kp = new C6765kp();
            Dictionary.Enumerator it = dictionary2.iterator();
            while (it.hasNext()) {
                try {
                    String strM67408k42 = C14113y2.m67408k4(C12380dy.m57967du((String) it.next().getKey()), "\\b");
                    if (c6765kp.m26807x1() > 0) {
                        c6765kp.m26780k4('|');
                    }
                    c6765kp.m26792k4(strM67408k42);
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th;
                }
            }
            C12380dy c12380dy = new C12380dy(c6765kp.toString());
            AbstractC12384m9 abstractC12384m9 = new AbstractC12384m9() { // from class: com.aspose.slides.rx.1
                @Override // com.aspose.slides.internal.p492x4.AbstractC12384m9
                /* JADX INFO: renamed from: k4 */
                public String mo24906k4(C12385to c12385to) {
                    return (String) dictionary2.get_Item(c12385to.mo57995kk());
                }
            };
            List.Enumerator it2 = new List(this.f48717du.getKeys()).iterator();
            while (it2.hasNext()) {
                try {
                    String str2 = (String) it2.next();
                    this.f48717du.set_Item(str2, m70363k4(c12380dy.m57982k4(this.f48717du.get_Item(str2), abstractC12384m9), strArr));
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                it2.dispose();
            }
        }
        List.Enumerator it3 = new List(this.f48718dy.getKeys()).iterator();
        while (it3.hasNext()) {
            try {
                String str3 = (String) it3.next();
                Dictionary<String, String> dictionary3 = this.f48718dy;
                dictionary3.set_Item(str3, m70363k4(dictionary3.get_Item(str3), strArr));
            } finally {
                if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                    it3.dispose();
                }
            }
        }
        List list2 = new List(this.f48715c5);
        for (int i3 = 0; i3 < list2.size(); i3++) {
            m70373k4(this.f48717du, (String) list2.get_Item(i3));
        }
        Dictionary.Enumerator<String, String> it4 = this.f48718dy.iterator();
        int i4 = 0;
        while (it4.hasNext()) {
            try {
                KeyValuePair next = it4.next();
                i4++;
                this.f48721jd.addItem((String) next.getKey(), Integer.valueOf(i4));
                this.f48720h4.set_Item((String) next.getKey(), new C1139gc(m70371k4((String) next.getValue()), null));
            } finally {
                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                    it4.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
            it4.dispose();
        }
        String[] strArr4 = f48707k4;
        int length = strArr4.length;
        int i5 = 1;
        int i6 = 0;
        while (i6 < length) {
            this.f48721jd.addItem(strArr4[i6], Integer.valueOf(-i5));
            i6++;
            i5++;
        }
        for (int i7 = 0; i7 < this.f48715c5.size(); i7++) {
            this.f48721jd.addItem(this.f48715c5.get_Item(i7), Integer.valueOf(-(i7 + 12)));
            String str4 = m70372k4().get_Item(i7);
            String str5 = this.f48717du.get_Item(str4);
            String[] strArr5 = {null};
            this.f48723m9.tryGetValue(str4, strArr5);
            this.f48720h4.set_Item(str4, new C1139gc(m70371k4(str5), strArr5[0]));
        }
        if (wgi.m72731kk(vydVar.m43417jd())) {
            String[] strArrM67414k4 = C14113y2.m67414k4(C14113y2.m67401k4(vydVar.m43417jd(), MsalUtils.QUERY_STRING_SYMBOL, ""), ControlChar.SPACE_CHAR);
            if (strArrM67414k4.length <= 3 || dM67475k4 <= 0.0d || dM67475k42 <= 0.0d) {
                return;
            }
            for (String str6 : strArrM67414k4) {
                if ((str6.charAt(0) < '0' || str6.charAt(0) > '9') && !this.f48720h4.containsKey(str6)) {
                    return;
                }
            }
            double dM56550c5 = dM67475k4 > 0.0d ? ((double) (this.f48719fa.m56550c5() * 12700.0f)) / dM67475k4 : 1.0d;
            double dM56575x1 = dM67475k42 > 0.0d ? ((double) (this.f48719fa.m56575x1() * 12700.0f)) / dM67475k42 : 1.0d;
            String str7 = strArrM67414k4[0];
            this.f48725up[0] = C14057f9.m66591x1(C7019kk.m27462to(Double.valueOf((((str7.charAt(0) < '0' || str7.charAt(0) > '9') && this.f48720h4.containsKey(str7)) ? this.f48720h4.get_Item(str7).m6491k4() : C14080ne.m67015to(str7)) * dM56550c5), 14));
            String str8 = strArrM67414k4[1];
            this.f48725up[1] = C14057f9.m66591x1(C7019kk.m27462to(Double.valueOf((((str8.charAt(0) < '0' || str8.charAt(0) > '9') && this.f48720h4.containsKey(str8)) ? this.f48720h4.get_Item(str8).m6491k4() : C14080ne.m67015to(str8)) * dM56575x1), 14));
            String str9 = strArrM67414k4[2];
            this.f48725up[2] = C14057f9.m66591x1(C7019kk.m27462to(Double.valueOf((((str9.charAt(0) < '0' || str9.charAt(0) > '9') && this.f48720h4.containsKey(str9)) ? this.f48720h4.get_Item(str9).m6491k4() : C14080ne.m67015to(str9)) * dM56550c5), 14));
            String str10 = strArrM67414k4[3];
            this.f48725up[3] = C14057f9.m66591x1(C7019kk.m27462to(Double.valueOf((((str10.charAt(0) < '0' || str10.charAt(0) > '9') && this.f48720h4.containsKey(str10)) ? this.f48720h4.get_Item(str10).m6491k4() : C14080ne.m67015to(str10)) * dM56575x1), 14));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m70375k4(String str, String str2, Dictionary<String, String> dictionary, String[] strArr, String[] strArr2) {
        if (m70368x1(str2, strArr)) {
            int iM70364kk = m70364kk(str2, strArr);
            int iM67364dy = C14113y2.m67364dy(str2, strArr[iM70364kk]);
            int i = 1;
            if ("(".equals(strArr[iM70364kk])) {
                int iM70361k4 = m70361k4(str2, iM67364dy, '(', ')');
                int i2 = this.f48727yj;
                this.f48727yj = i2 + 1;
                String strM67408k4 = C14113y2.m67408k4("f", C14057f9.m66591x1(i2));
                int i3 = iM70361k4 - iM67364dy;
                String strM67443x1 = C14113y2.m67443x1(str2, iM67364dy + 1, i3 - 1);
                this.f48715c5.addItem(strM67408k4);
                dictionary.set_Item(strM67408k4, strM67443x1);
                String strM67397k4 = C14113y2.m67397k4(C14113y2.m67396k4(str2, iM67364dy, i3 + 1), iM67364dy, strM67408k4);
                dictionary.set_Item(str, strM67397k4);
                m70375k4(str, strM67397k4, dictionary, strArr, strArr2);
                m70375k4(strM67408k4, strM67443x1, dictionary, strArr, strArr2);
                return;
            }
            String str3 = strArr[iM70364kk];
            String[] strArr3 = strArr2;
            if (AbstractC14092to.m67201k4(strArr3, OooO0OO.OooO00o(1, 0, str3, str3)) <= -1) {
                int iM70360k4 = m70360k4(iM67364dy, str2, strArr);
                int iM70367x1 = m70367x1(iM67364dy, str2, strArr);
                int i4 = this.f48727yj;
                this.f48727yj = i4 + 1;
                String strM67408k42 = C14113y2.m67408k4("f", C14057f9.m66591x1(i4));
                int i5 = (iM70367x1 - iM70360k4) - 1;
                String strM67443x12 = C14113y2.m67443x1(str2, iM70360k4 == -1 ? 0 : iM70360k4 + 1, i5);
                this.f48715c5.addItem(strM67408k42);
                dictionary.set_Item(strM67408k42, strM67443x12);
                String strM67397k42 = C14113y2.m67397k4(C14113y2.m67396k4(str2, iM70360k4 != -1 ? iM70360k4 + 1 : 0, i5), iM70360k4 + 1, strM67408k42);
                dictionary.set_Item(str, strM67397k42);
                m70375k4(str, strM67397k42, dictionary, strArr, strArr2);
                m70375k4(strM67408k42, strM67443x12, dictionary, strArr, strArr2);
                return;
            }
            int length = strArr[iM70364kk].length() + iM67364dy;
            int i6 = length - 1;
            int iM70361k42 = m70361k4(str2, i6, '[', ']');
            String[] strArrM67414k4 = C14113y2.m67414k4(C14113y2.m67443x1(str2, length, (iM70361k42 - i6) - 1), ',');
            String str4 = "";
            int i7 = 0;
            while (i7 < strArrM67414k4.length) {
                int i8 = this.f48727yj;
                this.f48727yj = i8 + 1;
                String strM67408k43 = C14113y2.m67408k4("f", C14057f9.m66591x1(i8));
                String str5 = strArrM67414k4[i7];
                String strM67400k4 = C14113y2.m67400k4(str4, C14113y2.m67408k4(strM67408k43, ","));
                this.f48715c5.addItem(strM67408k43);
                dictionary.set_Item(strM67408k43, str5);
                m70375k4(strM67408k43, str5, dictionary, strArr, strArr3);
                i7++;
                strArr3 = strArr2;
                str4 = strM67400k4;
                i = 1;
            }
            String strOooO00o = OooO0OO.OooO00o(i, 0, str4, str4);
            int i9 = this.f48727yj;
            this.f48727yj = i9 + 1;
            String strM67408k44 = C14113y2.m67408k4("f", C14057f9.m66591x1(i9));
            String strM67408k45 = C14113y2.m67408k4(strArr[iM70364kk], strOooO00o, "]");
            this.f48715c5.addItem(strM67408k44);
            dictionary.set_Item(strM67408k44, strM67408k45);
            m70375k4(strM67408k44, strM67408k45, dictionary, strArr, strArr2);
            String strM67397k43 = C14113y2.m67397k4(C14113y2.m67396k4(str2, iM67364dy, (iM70361k42 - iM67364dy) + 1), iM67364dy, strM67408k44);
            dictionary.set_Item(str, strM67397k43);
            m70375k4(str, strM67397k43, dictionary, strArr, strArr2);
        }
    }
}
