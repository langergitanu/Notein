package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC8917u4;
import com.aspose.slides.internal.p332p7.gc6;
import com.aspose.slides.internal.p332p7.hyf;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14091t6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.words.ControlChar;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.u7 */
/* JADX INFO: loaded from: classes3.dex */
class C14618u7 {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f49242k4 = new C7017h4("m", "c", "v", "l", "r", "e", "val", "sum", "prod", "product", "mid", "abs", "min", "max", "if", "mod", "atan", "sin", "cos", "cosatan2", "sinatan2", "sqrt", "tan", "nf", "ns", "x");

    /* JADX INFO: renamed from: com.aspose.slides.u7$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private final String f49243k4;

        /* JADX INFO: renamed from: x1 */
        private final String f49244x1;

        public k4(String str, String str2) {
            this.f49244x1 = C14113y2.m67368h4(str);
            this.f49243k4 = str2;
        }

        /* JADX INFO: renamed from: k4 */
        private long m71512k4(int i, int i2, boolean z) {
            int i3 = i2 - i;
            if (i3 == 0) {
                return 0L;
            }
            long jM65122ks = C13850af.m65122ks(C14113y2.m67443x1(this.f49243k4, i, i3));
            return z ? (-27273042329612L) - jM65122ks : jM65122ks;
        }

        /* JADX INFO: renamed from: x1 */
        public static boolean m71514x1(char c) {
            return c >= 'a' && c <= 'z';
        }

        /* JADX INFO: renamed from: x1 */
        private long[] m71515x1() {
            List list = new List();
            int i = 0;
            boolean z = false;
            for (int i2 = 0; i2 < this.f49243k4.length(); i2++) {
                char cCharAt = this.f49243k4.charAt(i2);
                if (cCharAt == '@') {
                    if (i2 > 0) {
                        list.addItem(Long.valueOf(m71512k4(i, i2, z)));
                    }
                    i = i2 + 1;
                    z = true;
                } else if (cCharAt == ',' || cCharAt == ' ') {
                    list.addItem(Long.valueOf(m71512k4(i, i2, z)));
                    i = i2 + 1;
                    z = false;
                }
            }
            list.addItem(Long.valueOf(m71512k4(i, this.f49243k4.length(), z)));
            return C3085sv.m13068h4(list);
        }

        /* JADX INFO: renamed from: k4 */
        public final String m71516k4() {
            return this.f49244x1;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m71517k4(List<Byte> list, List<Long> list2) {
            long[] jArrM71515x1 = m71515x1();
            int iM27428k4 = C14618u7.f49242k4.m27428k4(this.f49244x1);
            int i = 0;
            if (iM27428k4 == 0) {
                list.addItem((byte) 1);
                list2.addItem(Long.valueOf(jArrM71515x1[0]));
                list2.addItem(Long.valueOf(jArrM71515x1[1]));
                return;
            }
            if (iM27428k4 == 1) {
                while (i < jArrM71515x1.length) {
                    list.addItem((byte) 5);
                    list2.addItem(Long.valueOf(jArrM71515x1[i]));
                    list2.addItem(Long.valueOf(jArrM71515x1[i + 1]));
                    list2.addItem(Long.valueOf(jArrM71515x1[i + 2]));
                    list2.addItem(Long.valueOf(jArrM71515x1[i + 3]));
                    list2.addItem(Long.valueOf(jArrM71515x1[i + 4]));
                    list2.addItem(Long.valueOf(jArrM71515x1[i + 5]));
                    i += 6;
                }
                return;
            }
            if (iM27428k4 != 3) {
                if (iM27428k4 != 25) {
                    return;
                }
                list.addItem((byte) 0);
            } else {
                while (i < jArrM71515x1.length) {
                    list.addItem((byte) 2);
                    list2.addItem(Long.valueOf(jArrM71515x1[i]));
                    list2.addItem(Long.valueOf(jArrM71515x1[i + 1]));
                    i += 2;
                }
            }
        }

        /* JADX INFO: renamed from: k4 */
        public static boolean m71513k4(char c) {
            return c == 'm' || c == 'l' || c == 'c' || c == 'x' || c == 'e' || c == 't' || c == 'r' || c == 'v';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: du */
    private static f7k[] m71496du(AbstractC8917u4 abstractC8917u4) {
        List list = new List();
        String strMo30636ix = abstractC8917u4.mo30636ix();
        if (strMo30636ix == null) {
            strMo30636ix = "";
        }
        String strM67443x1 = null;
        int i = 0;
        int i2 = 0;
        while (i < strMo30636ix.length()) {
            char cCharAt = strMo30636ix.charAt(i);
            if (k4.m71514x1(cCharAt)) {
                if (strM67443x1 != null) {
                    int i3 = i - i2;
                    list.addItem(new k4(strM67443x1, i3 == 0 ? "" : C14113y2.m67443x1(strMo30636ix, i2, i3)));
                }
                if (k4.m71513k4(cCharAt)) {
                    strM67443x1 = C14117yj.m67537ne(cCharAt);
                    i2 = i + 1;
                } else {
                    strM67443x1 = C14113y2.m67443x1(strMo30636ix, i, 2);
                    i2 = i + 2;
                    i++;
                }
            }
            i++;
        }
        if (strM67443x1 != null) {
            list.addItem(new k4(strM67443x1, ""));
        }
        List list2 = new List();
        long[] jArr = {0};
        long[] jArr2 = {0};
        m71505k4(abstractC8917u4, new long[]{0}, new long[]{0}, jArr, jArr2);
        long j = jArr[0];
        long j2 = jArr2[0];
        List<Byte> list3 = new List<>();
        List<Long> list4 = new List<>();
        List.Enumerator it = list.iterator();
        loop1: while (true) {
            byte b = 1;
            boolean z = true;
            while (it.hasNext()) {
                try {
                    k4 k4Var = (k4) it.next();
                    int iM27428k4 = f49242k4.m27428k4(k4Var.m71516k4());
                    if (iM27428k4 != 5) {
                        if (iM27428k4 == 23) {
                            b = 0;
                        } else if (iM27428k4 != 24) {
                            k4Var.m71517k4(list3, list4);
                        } else {
                            z = false;
                        }
                    }
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th;
                }
            }
            list2.addItem(new f7k(C3085sv.m13110x1(list3), C3085sv.m13068h4(list4), j, j2, b, z, true));
            list3.clear();
            list4.clear();
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        return (f7k[]) list2.toArray(new f7k[0]);
    }

    /* JADX INFO: renamed from: k4 */
    private static float m71497k4(float f, float f2, long j, float f3) {
        return ((f - f2) * f3) / j;
    }

    /* JADX INFO: renamed from: kk */
    private static C0899df[] m71508kk(AbstractC8917u4 abstractC8917u4) {
        com.aspose.slides.internal.p332p7.kvj kvjVar = (com.aspose.slides.internal.p332p7.kvj) abstractC8917u4.m42084k4("formulas");
        if (kvjVar == null) {
            return new C0899df[0];
        }
        Dictionary<String, Long> dictionaryM71509to = m71509to(abstractC8917u4);
        com.aspose.slides.internal.p332p7.ik7[] ik7VarArrM35747x1 = kvjVar.m35747x1();
        C0899df[] c0899dfArr = new C0899df[ik7VarArrM35747x1.length];
        for (int i = 0; i < ik7VarArrM35747x1.length; i++) {
            c0899dfArr[i] = m71499k4(i, C14113y2.m67414k4(C14113y2.m67440x1(ik7VarArrM35747x1[i].m34188k4()), ControlChar.SPACE_CHAR), dictionaryM71509to);
        }
        return c0899dfArr;
    }

    /* JADX INFO: renamed from: to */
    private static Dictionary<String, Long> m71509to(AbstractC8917u4 abstractC8917u4) {
        long jValueOf;
        Dictionary<String, Long> dictionary = new Dictionary<>();
        long[] jArrM71506k4 = m71506k4(abstractC8917u4.mo29893kk(), 10000L);
        long j = jArrM71506k4.length == 2 ? jArrM71506k4[0] : 10000L;
        long j2 = jArrM71506k4.length == 2 ? jArrM71506k4[1] : 10000L;
        long[] jArrM71506k42 = m71506k4(abstractC8917u4.mo29901to(), 0L);
        long j3 = jArrM71506k42.length == 2 ? jArrM71506k42[0] : 0L;
        long j4 = jArrM71506k42.length == 2 ? jArrM71506k42[1] : 0L;
        dictionary.addItem("width", Long.valueOf(j));
        dictionary.addItem("height", Long.valueOf(j2));
        long j5 = j / 2;
        dictionary.addItem("xcenter", Long.valueOf(j3 + j5));
        long j6 = j2 / 2;
        dictionary.addItem("ycenter", Long.valueOf(j4 + j6));
        dictionary.addItem("pixellinewidth", 0L);
        dictionary.addItem("pixelwidth", Long.valueOf((j * 72) / 96));
        dictionary.addItem("pixelheight", Long.valueOf((72 * j2) / 96));
        dictionary.addItem("emuwidth", Long.valueOf(j / 12700));
        dictionary.addItem("emuheight", Long.valueOf(j2 / 12700));
        dictionary.addItem("emuwidth2", Long.valueOf(j5 / 12700));
        dictionary.addItem("emuheight2", Long.valueOf(j6 / 12700));
        com.aspose.slides.internal.p332p7.iak iakVar = (com.aspose.slides.internal.p332p7.iak) abstractC8917u4.m42084k4("path");
        if (iakVar != null) {
            long[] jArrM71506k43 = m71506k4(iakVar.m33985k4(), 0L);
            if (jArrM71506k43.length == 2) {
                dictionary.addItem("xlimo", Long.valueOf(jArrM71506k43[0]));
                dictionary.addItem("ylimo", Long.valueOf(jArrM71506k43[2]));
            }
        }
        gc6 gc6Var = (gc6) abstractC8917u4.m42084k4("stroke");
        if (gc6Var != null) {
            dictionary.addItem("linedrawn", Long.valueOf(AbstractC8917u4.m42083k4(gc6Var.m32444k4(), true) ? 1L : 0L));
            jValueOf = Long.valueOf(AbstractC8917u4.m42083k4(gc6Var.m32444k4(), true) ? 1L : 0L);
        } else {
            dictionary.addItem("linedrawn", 0L);
            jValueOf = 0L;
        }
        dictionary.addItem("hasstroke", jValueOf);
        com.aspose.slides.internal.p332p7.q0e q0eVar = (com.aspose.slides.internal.p332p7.q0e) abstractC8917u4.m42084k4("fill");
        dictionary.addItem("hasfill", q0eVar != null ? Long.valueOf(AbstractC8917u4.m42083k4(q0eVar.m39269x1(), true) ? 1L : 0L) : 0L);
        return dictionary;
    }

    /* JADX INFO: renamed from: x1 */
    private static C13791lr[] m71510x1(AbstractC8917u4 abstractC8917u4) {
        long[] jArrM71506k4 = m71506k4(abstractC8917u4.mo30638ne(), 10000L);
        int length = jArrM71506k4.length;
        C13791lr[] c13791lrArr = new C13791lr[length];
        for (int i = 0; i < length; i++) {
            c13791lrArr[i] = new C13791lr(C14113y2.m67408k4("adj", C14057f9.m66591x1(i)), jArrM71506k4[i]);
        }
        return c13791lrArr;
    }

    /* JADX INFO: renamed from: k4 */
    private static long m71498k4(String str, Dictionary<String, Long> dictionary) {
        String strM67368h4 = C14113y2.m67368h4(str);
        return dictionary.containsKey(strM67368h4) ? dictionary.get_Item(strM67368h4).longValue() : strM67368h4.charAt(0) == '#' ? C13850af.m65122ks(C14113y2.m67422kk(strM67368h4, 1)) + 27273042316901L : strM67368h4.charAt(0) == '@' ? (-27273042329612L) - C13850af.m65122ks(C14113y2.m67422kk(strM67368h4, 1)) : C13850af.m65122ks(strM67368h4);
    }

    /* JADX INFO: renamed from: x1 */
    private static String[] m71511x1(String str, int[] iArr) {
        int i = iArr[0];
        if (i < 0 || i >= str.length()) {
            return null;
        }
        while (str.charAt(iArr[0]) == ' ' && iArr[0] < str.length()) {
            iArr[0] = iArr[0] + 1;
        }
        if (iArr[0] >= str.length()) {
            return null;
        }
        int i2 = iArr[0];
        while (str.charAt(iArr[0]) == ',' && iArr[0] < str.length()) {
            iArr[0] = iArr[0] + 1;
        }
        while (str.charAt(iArr[0]) == ' ' && iArr[0] < str.length()) {
            iArr[0] = iArr[0] + 1;
        }
        int i3 = iArr[0];
        while (true) {
            char cCharAt = str.charAt(i3);
            if ((cCharAt < '0' || cCharAt > '9') && cCharAt != '-' && cCharAt != ',' && cCharAt != ' ') {
                break;
            }
            int i4 = iArr[0] + 1;
            iArr[0] = i4;
            if (i4 >= str.length()) {
                break;
            }
            i3 = iArr[0];
        }
        String[] strArrM67414k4 = C14113y2.m67414k4(C14113y2.m67401k4(C14113y2.m67443x1(str, i2, iArr[0] - i2), " ", ""), ',');
        for (int i5 = 0; i5 < strArrM67414k4.length; i5++) {
            if (strArrM67414k4[i5].length() == 0) {
                strArrM67414k4[i5] = "0";
            }
        }
        return strArrM67414k4;
    }

    /* JADX INFO: renamed from: k4 */
    private static C0899df m71499k4(int i, String[] strArr, Dictionary<String, Long> dictionary) {
        switch (f49242k4.m27428k4(strArr[0])) {
            case 6:
                return new C0899df(C14113y2.m67408k4("g_", C14057f9.m66591x1(i)), (byte) 11, 0L, m71498k4(strArr[1], dictionary), 50000L);
            case 7:
                return new C0899df(C14113y2.m67408k4("g_", C14057f9.m66591x1(i)), (byte) 1, m71498k4(strArr[1], dictionary), m71498k4(strArr[2], dictionary), m71498k4(strArr[3], dictionary));
            case 8:
            case 9:
                return new C0899df(C14113y2.m67408k4("g_", C14057f9.m66591x1(i)), (byte) 0, m71498k4(strArr[1], dictionary), m71498k4(strArr[2], dictionary), m71498k4(strArr[3], dictionary));
            case 10:
                return new C0899df(C14113y2.m67408k4("g_", C14057f9.m66591x1(i)), (byte) 2, m71498k4(strArr[1], dictionary), m71498k4(strArr[2], dictionary), 2L);
            case 11:
                return new C0899df(C14113y2.m67408k4("g_", C14057f9.m66591x1(i)), (byte) 4, m71498k4(strArr[1], dictionary), 0L, 0L);
            case 12:
                return new C0899df(C14113y2.m67408k4("g_", C14057f9.m66591x1(i)), (byte) 9, m71498k4(strArr[1], dictionary), m71498k4(strArr[2], dictionary), 0L);
            case 13:
                return new C0899df(C14113y2.m67408k4("g_", C14057f9.m66591x1(i)), (byte) 8, m71498k4(strArr[1], dictionary), m71498k4(strArr[2], dictionary), 0L);
            case 14:
                return new C0899df(C14113y2.m67408k4("g_", C14057f9.m66591x1(i)), (byte) 3, m71498k4(strArr[1], dictionary), m71498k4(strArr[2], dictionary), m71498k4(strArr[3], dictionary));
            case 15:
                return new C0899df(C14113y2.m67408k4("g_", C14057f9.m66591x1(i)), (byte) 10, m71498k4(strArr[1], dictionary), m71498k4(strArr[2], dictionary), m71498k4(strArr[3], dictionary));
            case 16:
                return new C0899df(C14113y2.m67408k4("g_", C14057f9.m66591x1(i)), (byte) 5, m71498k4(strArr[1], dictionary), m71498k4(strArr[2], dictionary), 0L);
            case 17:
                return new C0899df(C14113y2.m67408k4("g_", C14057f9.m66591x1(i)), (byte) 13, m71498k4(strArr[1], dictionary), m71498k4(strArr[2], dictionary), 0L);
            case 18:
                return new C0899df(C14113y2.m67408k4("g_", C14057f9.m66591x1(i)), (byte) 7, m71498k4(strArr[1], dictionary), m71498k4(strArr[2], dictionary), 0L);
            case 19:
                return new C0899df(C14113y2.m67408k4("g_", C14057f9.m66591x1(i)), (byte) 6, m71498k4(strArr[1], dictionary), m71498k4(strArr[2], dictionary), m71498k4(strArr[3], dictionary));
            case 20:
                return new C0899df(C14113y2.m67408k4("g_", C14057f9.m66591x1(i)), (byte) 12, m71498k4(strArr[1], dictionary), m71498k4(strArr[2], dictionary), m71498k4(strArr[3], dictionary));
            case 21:
                return new C0899df(C14113y2.m67408k4("g_", C14057f9.m66591x1(i)), (byte) 14, m71498k4(strArr[1], dictionary), 0L, 0L);
            case 22:
                return new C0899df(C14113y2.m67408k4("g_", C14057f9.m66591x1(i)), (byte) 15, m71498k4(strArr[1], dictionary), m71498k4(strArr[2], dictionary), 0L);
            default:
                throw new PptxException("Can't read Vml geometry formula");
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C13760l2 m71501k4(AbstractC8917u4 abstractC8917u4) {
        long[] jArr = {0};
        long[] jArr2 = {0};
        long[] jArr3 = {0};
        long[] jArr4 = {0};
        m71505k4(abstractC8917u4, jArr, jArr2, jArr3, jArr4);
        long j = jArr[0];
        long j2 = jArr2[0];
        return new C13760l2(m71510x1(abstractC8917u4), m71508kk(abstractC8917u4), null, null, m71496du(abstractC8917u4), new C14843yd(j, j2), new C14843yd(j + jArr3[0], j2 + jArr4[0]));
    }

    /* JADX INFO: renamed from: k4 */
    private static String m71502k4(String str, int[] iArr) {
        int i = iArr[0];
        if (i < 0 || i >= str.length()) {
            return C14113y2.f47374k4;
        }
        while (str.charAt(iArr[0]) == ' ' && iArr[0] < str.length()) {
            iArr[0] = iArr[0] + 1;
        }
        while (str.charAt(iArr[0]) == ',' && iArr[0] < str.length()) {
            iArr[0] = iArr[0] + 1;
        }
        while (str.charAt(iArr[0]) == ' ' && iArr[0] < str.length()) {
            iArr[0] = iArr[0] + 1;
        }
        if (iArr[0] >= str.length()) {
            return C14113y2.f47374k4;
        }
        int i2 = iArr[0];
        char cCharAt = str.charAt(i2);
        if (cCharAt == 'n' || cCharAt == 'a' || cCharAt == 'q' || cCharAt == 'w') {
            int i3 = iArr[0] + 1;
            iArr[0] = i3;
            return C14113y2.m67443x1(str, i2, i3 - i2);
        }
        iArr[0] = iArr[0] + 1;
        return C14117yj.m67537ne(cCharAt);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m71503k4(GeometryShape geometryShape, hyf hyfVar) {
        if (hyfVar == null || geometryShape == null) {
            return;
        }
        try {
            C13760l2 c13760l2M3314k4 = geometryShape.m1591yj().m3314k4();
            c13760l2M3314k4.m64262k4(0);
            C13760l2 c13760l2M71501k4 = m71501k4(hyfVar);
            c13760l2M3314k4.m64267k4(c13760l2M71501k4.m64270k4());
            c13760l2M3314k4.m64265k4(c13760l2M71501k4.m64256du());
            c13760l2M3314k4.m64264k4(c13760l2M71501k4.m64273to());
        } catch (RuntimeException unused) {
            geometryShape.setShapeType(5);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71504k4(GeometryShape geometryShape, AbstractC8917u4 abstractC8917u4, hyf hyfVar) {
        long[] jArrM71506k4 = m71506k4(abstractC8917u4.mo30638ne(), 10000L);
        if (hyfVar != null) {
            geometryShape.setShapeType(f6b.m5902k4(C7019kk.m27462to(Float.valueOf(hyfVar.mo29907yj()), 13)));
            if (geometryShape.getShapeType() == 41 && jArrM71506k4.length > 1) {
                jArrM71506k4[1] = jArrM71506k4[1] / 2;
            }
            int[] iArr = new int[jArrM71506k4.length];
            for (int i = 0; i < jArrM71506k4.length; i++) {
                iArr[i] = (int) jArrM71506k4[i];
            }
            f6b.m5911k4(geometryShape.m1591yj().m3334x1(), geometryShape.getShapeType(), iArr, geometryShape.getRawFrame().getWidth(), geometryShape.getRawFrame().getHeight());
        }
        if (geometryShape.getShapeType() == -1 || geometryShape.getShapeType() == 0) {
            m71503k4(geometryShape, hyfVar);
            for (int i2 = 0; i2 < jArrM71506k4.length && i2 < geometryShape.getAdjustments().size(); i2++) {
                geometryShape.getAdjustments().get_Item(i2).setRawValue(jArrM71506k4[i2]);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m71505k4(AbstractC8917u4 abstractC8917u4, long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4) {
        long[] jArrM71506k4 = m71506k4(abstractC8917u4.mo29893kk(), 10000L);
        jArr3[0] = jArrM71506k4.length == 2 ? jArrM71506k4[0] : 10000L;
        jArr4[0] = jArrM71506k4.length == 2 ? jArrM71506k4[1] : 10000L;
        long[] jArrM71506k42 = m71506k4(abstractC8917u4.mo29901to(), 0L);
        jArr[0] = jArrM71506k42.length == 2 ? jArrM71506k42[0] : 0L;
        jArr2[0] = jArrM71506k42.length == 2 ? jArrM71506k42[1] : 0L;
    }

    /* JADX INFO: renamed from: k4 */
    public static long[] m71506k4(String str, long j) {
        if (C14113y2.m67411k4(str)) {
            return new long[0];
        }
        String[] strArrM67414k4 = C14113y2.m67414k4(C14113y2.m67401k4(str, " ", ""), ',');
        int length = strArrM67414k4.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            long[] jArr2 = {0};
            boolean z = !C14113y2.m67411k4(strArrM67414k4[i]) && C14091t6.m67190k4(strArrM67414k4[i], jArr2);
            long j2 = jArr2[0];
            if (z) {
                jArr[i] = j2;
            } else {
                jArr[i] = j;
            }
        }
        return jArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static C11896dy[] m71507k4(AbstractC8917u4 abstractC8917u4, float f, float f2) {
        long jM65122ks;
        long jM65122ks2;
        long jM65122ks3;
        long jM65122ks4;
        String str;
        List list;
        int[] iArr;
        boolean z;
        C11896dy c11896dy;
        String strMo30636ix = abstractC8917u4.mo30636ix();
        if (strMo30636ix == null || strMo30636ix.length() <= 0) {
            return new C11896dy[0];
        }
        String strMo29901to = abstractC8917u4.mo29901to();
        if (strMo29901to == null || strMo29901to.length() <= 0) {
            jM65122ks = 0;
            jM65122ks2 = 0;
        } else {
            String[] strArrM67414k4 = C14113y2.m67414k4(C14113y2.m67401k4(strMo29901to, " ", ""), ',');
            jM65122ks = C13850af.m65122ks(strArrM67414k4[0]);
            jM65122ks2 = C13850af.m65122ks(strArrM67414k4[1]);
        }
        String strMo29893kk = abstractC8917u4.mo29893kk();
        if (strMo29893kk == null || strMo29893kk.length() <= 0) {
            jM65122ks3 = 1000;
            jM65122ks4 = 1000;
        } else {
            String[] strArrM67414k42 = C14113y2.m67414k4(C14113y2.m67401k4(strMo29893kk, " ", ""), ',');
            jM65122ks3 = C13850af.m65122ks(strArrM67414k42[0]);
            jM65122ks4 = C13850af.m65122ks(strArrM67414k42[1]);
        }
        String strM67368h4 = C14113y2.m67368h4(strMo30636ix);
        int[] iArr2 = {0};
        String strM71502k4 = m71502k4(strM67368h4, iArr2);
        iArr2[0] = iArr2[0];
        String[] strArrM71511x1 = m71511x1(strM67368h4, iArr2);
        int i = iArr2[0];
        List list2 = new List();
        float fM66705k4 = 0.0f;
        C11896dy c11896dy2 = null;
        float fM66705k42 = 0.0f;
        while (strM71502k4.length() > 0) {
            int iM27428k4 = f49242k4.m27428k4(strM71502k4);
            if (iM27428k4 != 0) {
                if (iM27428k4 == 1) {
                    list = list2;
                    iArr = iArr2;
                    c11896dy = c11896dy2;
                    str = strM67368h4;
                    int i2 = 0;
                    float f3 = fM66705k4;
                    float fM66705k43 = fM66705k42;
                    while (i2 < strArrM71511x1.length) {
                        float f4 = jM65122ks;
                        float fM71497k4 = m71497k4(f3, f4, jM65122ks3, f);
                        float f5 = jM65122ks2;
                        float fM71497k42 = m71497k4(fM66705k43, f5, jM65122ks4, f2);
                        float fM71497k43 = m71497k4(C14064he.m66705k4(strArrM71511x1[i2]), f4, jM65122ks3, f);
                        float fM71497k44 = m71497k4(C14064he.m66705k4(strArrM71511x1[i2 + 1]), f5, jM65122ks4, f2);
                        float fM71497k45 = m71497k4(C14064he.m66705k4(strArrM71511x1[i2 + 2]), f4, jM65122ks3, f);
                        float fM71497k46 = m71497k4(C14064he.m66705k4(strArrM71511x1[i2 + 3]), f5, jM65122ks4, f2);
                        int i3 = i2 + 5;
                        float fM66705k44 = C14064he.m66705k4(strArrM71511x1[i2 + 4]);
                        i2 += 6;
                        fM66705k43 = C14064he.m66705k4(strArrM71511x1[i3]);
                        c11896dy.m55536k4(fM71497k4, fM71497k42, fM71497k43, fM71497k44, fM71497k45, fM71497k46, m71497k4(fM66705k44, f4, jM65122ks3, f), m71497k4(fM66705k43, f5, jM65122ks4, f2));
                        f3 = fM66705k44;
                    }
                    fM66705k4 = f3;
                    fM66705k42 = fM66705k43;
                } else if (iM27428k4 == 2) {
                    list = list2;
                    iArr = iArr2;
                    C11896dy c11896dy3 = c11896dy2;
                    str = strM67368h4;
                    int i4 = 0;
                    float f6 = fM66705k4;
                    float f7 = fM66705k42;
                    long j = jM65122ks2;
                    while (i4 < strArrM71511x1.length) {
                        float f8 = jM65122ks;
                        float fM71497k47 = m71497k4(f6, f8, jM65122ks3, f);
                        float f9 = f6;
                        float f10 = j;
                        float fM71497k48 = m71497k4(f7, f10, jM65122ks4, f2);
                        float f11 = f7;
                        float fM71497k49 = m71497k4(C14064he.m66705k4(strArrM71511x1[i4]) + f9, f8, jM65122ks3, f);
                        float fM71497k410 = m71497k4(C14064he.m66705k4(strArrM71511x1[i4 + 1]) + f11, f10, jM65122ks4, f2);
                        float fM71497k411 = m71497k4(C14064he.m66705k4(strArrM71511x1[i4 + 2]) + f9, f8, jM65122ks3, f);
                        float fM71497k412 = m71497k4(C14064he.m66705k4(strArrM71511x1[i4 + 3]) + f11, f10, jM65122ks4, f2);
                        int i5 = i4 + 5;
                        float fM66705k45 = C14064he.m66705k4(strArrM71511x1[i4 + 4]) + f9;
                        int i6 = i4 + 6;
                        float fM66705k46 = C14064he.m66705k4(strArrM71511x1[i5]) + f11;
                        c11896dy3.m55536k4(fM71497k47, fM71497k48, fM71497k49, fM71497k410, fM71497k411, fM71497k412, m71497k4(fM66705k45, f8, jM65122ks3, f), m71497k4(fM66705k46, f10, jM65122ks4, f2));
                        f6 = fM66705k45;
                        f7 = fM66705k46;
                        i4 = i6;
                    }
                    fM66705k4 = f6;
                    c11896dy = c11896dy3;
                    jM65122ks2 = j;
                    fM66705k42 = f7;
                } else if (iM27428k4 == 3) {
                    list = list2;
                    iArr = iArr2;
                    long j2 = jM65122ks2;
                    C11896dy c11896dy4 = c11896dy2;
                    str = strM67368h4;
                    int i7 = 0;
                    float f12 = fM66705k4;
                    float f13 = fM66705k42;
                    while (i7 < strArrM71511x1.length) {
                        float f14 = jM65122ks;
                        float fM71497k413 = m71497k4(f12, f14, jM65122ks3, f);
                        int i8 = i7;
                        float f15 = j2;
                        float fM71497k414 = m71497k4(f13, f15, jM65122ks4, f2);
                        float fM66705k47 = C14064he.m66705k4(strArrM71511x1[i8]);
                        float fM66705k48 = C14064he.m66705k4(strArrM71511x1[i8 + 1]);
                        c11896dy4.m55574x1(fM71497k413, fM71497k414, m71497k4(fM66705k47, f14, jM65122ks3, f), m71497k4(fM66705k48, f15, jM65122ks4, f2));
                        f12 = fM66705k47;
                        f13 = fM66705k48;
                        i7 = i8 + 2;
                    }
                    fM66705k4 = f12;
                    fM66705k42 = f13;
                    c11896dy = c11896dy4;
                    jM65122ks2 = j2;
                } else if (iM27428k4 == 4) {
                    C11896dy c11896dy5 = c11896dy2;
                    str = strM67368h4;
                    list = list2;
                    iArr = iArr2;
                    int i9 = 0;
                    float f16 = fM66705k4;
                    float f17 = fM66705k42;
                    while (i9 < strArrM71511x1.length) {
                        float f18 = jM65122ks;
                        int i10 = i9;
                        float fM71497k415 = m71497k4(f16, f18, jM65122ks3, f);
                        float f19 = f16;
                        float f20 = jM65122ks2;
                        long j3 = jM65122ks2;
                        float fM71497k416 = m71497k4(f17, f20, jM65122ks4, f2);
                        float f21 = f17;
                        float fM66705k49 = C14064he.m66705k4(strArrM71511x1[i10]) + f19;
                        float fM66705k410 = C14064he.m66705k4(strArrM71511x1[i10 + 1]) + f21;
                        c11896dy5.m55574x1(fM71497k415, fM71497k416, m71497k4(fM66705k49, f18, jM65122ks3, f), m71497k4(fM66705k410, f20, jM65122ks4, f2));
                        f16 = fM66705k49;
                        f17 = fM66705k410;
                        i9 = i10 + 2;
                        jM65122ks2 = j3;
                    }
                    c11896dy = c11896dy5;
                    fM66705k4 = f16;
                    fM66705k42 = f17;
                } else if (iM27428k4 != 5) {
                    list = list2;
                    iArr = iArr2;
                    c11896dy = c11896dy2;
                    z = true;
                    str = strM67368h4;
                } else {
                    list2.addItem(c11896dy2);
                    str = strM67368h4;
                    list = list2;
                    iArr = iArr2;
                    c11896dy = null;
                }
                z = true;
            } else {
                str = strM67368h4;
                list = list2;
                iArr = iArr2;
                z = true;
                c11896dy = new C11896dy();
                fM66705k4 = C14064he.m66705k4(strArrM71511x1[0]);
                fM66705k42 = C14064he.m66705k4(strArrM71511x1[1]);
            }
            iArr[0] = i;
            strM67368h4 = str;
            int[] iArr3 = iArr;
            strM71502k4 = m71502k4(strM67368h4, iArr3);
            iArr3[0] = iArr3[0];
            strArrM71511x1 = m71511x1(strM67368h4, iArr3);
            i = iArr3[0];
            iArr2 = iArr3;
            c11896dy2 = c11896dy;
            list2 = list;
        }
        List list3 = list2;
        C11896dy[] c11896dyArr = new C11896dy[list3.size()];
        for (int i11 = 0; i11 < list3.size(); i11++) {
            c11896dyArr[i11] = (C11896dy) list3.get_Item(i11);
        }
        return c11896dyArr;
    }
}
