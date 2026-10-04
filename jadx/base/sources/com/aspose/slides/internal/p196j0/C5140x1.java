package com.aspose.slides.internal.p196j0;

import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.j0.x1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5140x1 {

    /* JADX INFO: renamed from: k4 */
    private String f14092k4;

    /* JADX INFO: renamed from: kk */
    private ArrayList f14093kk;

    /* JADX INFO: renamed from: to */
    private ArrayList f14094to;

    /* JADX INFO: renamed from: x1 */
    private String f14095x1;

    /* JADX INFO: renamed from: du */
    private static final char[] f14088du = {ControlChar.SPACE_CHAR, '<', '>'};

    /* JADX INFO: renamed from: h4 */
    private static final char[] f14090h4 = {'<', '>'};

    /* JADX INFO: renamed from: m9 */
    private static final char[] f14091m9 = {ControlChar.SPACE_CHAR, '<', '>'};

    /* JADX INFO: renamed from: dy */
    private static final char[] f14089dy = {'\"', '<', '>'};

    /* JADX INFO: renamed from: c5 */
    private static final char[] f14087c5 = {'<', '>', '\"', '\'', '&'};

    /* JADX INFO: renamed from: com.aspose.slides.internal.j0.x1$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        private String f14096k4;

        /* JADX INFO: renamed from: x1 */
        private String f14097x1;

        public k4(String str, String str2) {
            if (!C5140x1.m22011kk(str)) {
                throw new ArgumentException(OooO00o.OooO00o("Invalid XML attribute name: ", str));
            }
            if (!C5140x1.m22012to(str2)) {
                throw new ArgumentException(OooO00o.OooO00o("Invalid XML attribute value: ", str2));
            }
            this.f14096k4 = str;
            this.f14097x1 = C5140x1.m22009jd(str2);
        }

        /* JADX INFO: renamed from: k4 */
        public String m22021k4() {
            return this.f14096k4;
        }

        /* JADX INFO: renamed from: x1 */
        public String m22022x1() {
            return this.f14097x1;
        }
    }

    public C5140x1(String str) {
        this(str, null);
    }

    /* JADX INFO: renamed from: du */
    public static boolean m22007du(String str) {
        return str != null && C14113y2.m67384k4(str, f14088du) == -1;
    }

    /* JADX INFO: renamed from: h4 */
    public static boolean m22008h4(String str) {
        return str != null && C14113y2.m67384k4(str, f14090h4) == -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: jd */
    public static String m22009jd(String str) {
        if (str == null) {
            return null;
        }
        C6765kp c6765kp = new C6765kp(str);
        c6765kp.m26794k4("&lt;", "<");
        c6765kp.m26794k4("&gt;", ">");
        c6765kp.m26794k4("&amp;", "&");
        c6765kp.m26794k4("&quot;", "\"");
        c6765kp.m26794k4("&apos;", "'");
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m22011kk(String str) {
        return str != null && C14113y2.m67384k4(str, f14091m9) == -1;
    }

    /* JADX INFO: renamed from: to */
    public static boolean m22012to(String str) {
        return str != null && C14113y2.m67384k4(str, f14089dy) == -1;
    }

    /* JADX INFO: renamed from: dy */
    public k4 m22014dy(String str) {
        ArrayList<k4> arrayList = this.f14093kk;
        if (arrayList == null) {
            return null;
        }
        for (k4 k4Var : arrayList) {
            if (C14113y2.m67363du(k4Var.m22021k4(), str)) {
                return k4Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public ArrayList m22015k4() {
        return this.f14094to;
    }

    /* JADX INFO: renamed from: m9 */
    public C5140x1 m22019m9(String str) {
        if (str == null) {
            throw new ArgumentNullException("tag");
        }
        if (this.f14094to == null) {
            return null;
        }
        for (int i = 0; i < this.f14094to.size(); i++) {
            C5140x1 c5140x1 = (C5140x1) this.f14094to.get_Item(i);
            if (C14113y2.m67363du(c5140x1.f14095x1, str)) {
                return c5140x1;
            }
        }
        return null;
    }

    public String toString() {
        C6765kp[] c6765kpArr = {new C6765kp()};
        m22010k4(c6765kpArr, 0);
        return c6765kpArr[0].toString();
    }

    /* JADX INFO: renamed from: x1 */
    public String m22020x1() {
        return this.f14095x1;
    }

    public C5140x1(String str, String str2) {
        if (str == null) {
            throw new ArgumentNullException("tag");
        }
        if (!m22007du(str)) {
            throw new ArgumentException("Invalid XML string: ".concat(str));
        }
        this.f14095x1 = str;
        m22017k4(str2);
    }

    /* JADX INFO: renamed from: x1 */
    public static String m22013x1(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        if (C14113y2.m67384k4(str, f14087c5) == -1) {
            return str;
        }
        C6765kp c6765kp = new C6765kp();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\"') {
                str2 = "&quot;";
            } else if (cCharAt == '<') {
                str2 = "&lt;";
            } else if (cCharAt == '>') {
                str2 = "&gt;";
            } else if (cCharAt == '&') {
                str2 = "&amp;";
            } else if (cCharAt != '\'') {
                c6765kp.m26780k4(cCharAt);
            } else {
                str2 = "&apos;";
            }
            c6765kp.m26792k4(str2);
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public void m22016k4(C5140x1 c5140x1) {
        if (c5140x1 == null) {
            throw new ArgumentNullException("child");
        }
        if (this.f14094to == null) {
            this.f14094to = new ArrayList();
        }
        this.f14094to.addItem(c5140x1);
    }

    /* JADX INFO: renamed from: k4 */
    public void m22017k4(String str) {
        if (str != null && !m22008h4(str)) {
            throw new ArgumentException("Invalid XML string: ".concat(str));
        }
        this.f14092k4 = m22009jd(str);
    }

    /* JADX INFO: renamed from: k4 */
    public void m22018k4(String str, String str2) {
        if (str == null) {
            throw new ArgumentNullException("name");
        }
        if (str2 == null) {
            throw new ArgumentNullException("value");
        }
        if (m22014dy(str) != null) {
            throw new ArgumentException(C14113y2.m67408k4("Duplicate attribute : ", str));
        }
        if (this.f14093kk == null) {
            this.f14093kk = new ArrayList();
        }
        this.f14093kk.addItem(new k4(str, str2));
    }

    /* JADX INFO: renamed from: k4 */
    private void m22010k4(C6765kp[] c6765kpArr, int i) {
        ArrayList arrayList;
        C6765kp c6765kpM26792k4;
        c6765kpArr[0].m26792k4("<");
        c6765kpArr[0].m26792k4(this.f14095x1);
        if (this.f14093kk != null) {
            c6765kpArr[0].m26792k4(" ");
            for (int i2 = 0; i2 < this.f14093kk.size(); i2++) {
                k4 k4Var = (k4) this.f14093kk.get_Item(i2);
                c6765kpArr[0].m26792k4(k4Var.m22021k4()).m26792k4("=\"").m26792k4(m22013x1(k4Var.m22022x1())).m26792k4("\"");
                if (i2 != this.f14093kk.size() - 1) {
                    c6765kpArr[0].m26792k4(C14052dq.f47188k4);
                }
            }
        }
        String str = this.f14092k4;
        if ((str == null || C14113y2.m67363du(str, C14113y2.f47374k4)) && ((arrayList = this.f14094to) == null || arrayList.size() == 0)) {
            c6765kpM26792k4 = c6765kpArr[0].m26792k4("/>");
        } else {
            c6765kpArr[0].m26792k4(">").m26792k4(m22013x1(this.f14092k4));
            if (this.f14094to != null) {
                c6765kpArr[0].m26792k4(C14052dq.f47188k4);
                Iterator<E> it = this.f14094to.iterator();
                while (it.hasNext()) {
                    ((C5140x1) it.next()).m22010k4(c6765kpArr, i + 1);
                }
            }
            c6765kpM26792k4 = c6765kpArr[0].m26792k4("</").m26792k4(this.f14095x1).m26792k4(">");
        }
        c6765kpM26792k4.m26792k4(C14052dq.f47188k4);
    }
}
