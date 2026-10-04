package com.aspose.slides.internal.p221k8;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.AbstractC3151yd;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.microsoft.identity.client.internal.MsalUtils;
import java.util.Stack;

/* JADX INFO: renamed from: com.aspose.slides.internal.k8.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C5648x1 {

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f15454up = new C7017h4("amp", "quot", "apos", TranslateLanguage.LITHUANIAN, "gt");

    /* JADX INFO: renamed from: ck */
    private int f15456ck;

    /* JADX INFO: renamed from: du */
    private String f15457du;

    /* JADX INFO: renamed from: dy */
    private boolean f15458dy;

    /* JADX INFO: renamed from: fa */
    private boolean f15459fa;

    /* JADX INFO: renamed from: k4 */
    private kk f15462k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC3151yd f15466x1;

    /* JADX INFO: renamed from: kk */
    private Stack f15463kk = new Stack();

    /* JADX INFO: renamed from: to */
    private Stack f15465to = new Stack();

    /* JADX INFO: renamed from: h4 */
    private StringBuilder f15460h4 = new StringBuilder(200);

    /* JADX INFO: renamed from: m9 */
    private char[] f15464m9 = new char[30];

    /* JADX INFO: renamed from: c5 */
    private k4 f15455c5 = new k4();

    /* JADX INFO: renamed from: jd */
    private int f15461jd = 1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.k8.x1$k4 */
    public static class k4 implements x1 {

        /* JADX INFO: renamed from: k4 */
        private List<String> f15467k4;

        /* JADX INFO: renamed from: x1 */
        private List<String> f15468x1;

        private k4() {
            this.f15467k4 = new List<>();
            this.f15468x1 = new List<>();
        }

        @Override // com.aspose.slides.internal.p221k8.C5648x1.x1
        /* JADX INFO: renamed from: k4 */
        public int mo23073k4() {
            return this.f15467k4.size();
        }

        @Override // com.aspose.slides.internal.p221k8.C5648x1.x1
        /* JADX INFO: renamed from: x1 */
        public String mo23076x1(int i) {
            return this.f15468x1.get_Item(i);
        }

        @Override // com.aspose.slides.internal.p221k8.C5648x1.x1
        /* JADX INFO: renamed from: k4 */
        public String mo23074k4(int i) {
            return this.f15467k4.get_Item(i);
        }

        /* JADX INFO: renamed from: x1 */
        public void m23077x1() {
            this.f15467k4.clear();
            this.f15468x1.clear();
        }

        /* JADX INFO: renamed from: k4 */
        public void m23075k4(String str, String str2) {
            this.f15467k4.addItem(str);
            this.f15468x1.addItem(str2);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.k8.x1$kk */
    public interface kk {
        /* JADX INFO: renamed from: k4 */
        void mo23043k4(C5648x1 c5648x1);

        /* JADX INFO: renamed from: k4 */
        void mo23045k4(String str, x1 x1Var);

        /* JADX INFO: renamed from: k4 */
        void mo23046k4(String str, String str2);

        /* JADX INFO: renamed from: kk */
        void mo23047kk(String str);

        /* JADX INFO: renamed from: to */
        void mo23048to(String str);

        /* JADX INFO: renamed from: x1 */
        void mo23049x1(C5648x1 c5648x1);

        /* JADX INFO: renamed from: x1 */
        void mo23050x1(String str);
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.k8.x1$x1 */
    public interface x1 {
        /* JADX INFO: renamed from: k4 */
        int mo23073k4();

        /* JADX INFO: renamed from: k4 */
        String mo23074k4(int i);

        /* JADX INFO: renamed from: x1 */
        String mo23076x1(int i);
    }

    /* JADX INFO: renamed from: c5 */
    private void m23051c5() {
        if (this.f15460h4.length() == 0) {
            return;
        }
        if (this.f15458dy) {
            this.f15462k4.mo23050x1(this.f15460h4.toString());
        } else {
            this.f15462k4.mo23048to(this.f15460h4.toString());
        }
        this.f15460h4.setLength(0);
        this.f15458dy = false;
    }

    /* JADX INFO: renamed from: ck */
    private void m23052ck() {
        if (m23056h4() == 35) {
            m23062m9();
            m23055fa();
            return;
        }
        String strM23070kk = m23070kk();
        m23067k4(59);
        int iM27428k4 = f15454up.m27428k4(strM23070kk);
        if (iM27428k4 == 0) {
            this.f15460h4.append('&');
            return;
        }
        if (iM27428k4 == 1) {
            this.f15460h4.append('\"');
            return;
        }
        if (iM27428k4 == 2) {
            this.f15460h4.append('\'');
        } else if (iM27428k4 == 3) {
            this.f15460h4.append('<');
        } else {
            if (iM27428k4 != 4) {
                throw m23059k4("General non-predefined entity reference is not supported in this parser.");
            }
            this.f15460h4.append('>');
        }
    }

    /* JADX INFO: renamed from: du */
    private void m23053du() {
        while (m23065x1(m23056h4())) {
            this.f15460h4.append((char) m23062m9());
        }
        if (m23056h4() == 60 || m23056h4() < 0) {
            return;
        }
        this.f15458dy = false;
    }

    /* JADX INFO: renamed from: dy */
    private void m23054dy() {
        this.f15461jd = 1;
        this.f15456ck = 0;
        this.f15462k4 = null;
        this.f15466x1 = null;
        this.f15463kk.clear();
        this.f15465to.clear();
        this.f15455c5.m23077x1();
        this.f15460h4.setLength(0);
        this.f15457du = null;
        this.f15458dy = false;
    }

    /* JADX INFO: renamed from: fa */
    private int m23055fa() {
        int i;
        int i2 = 0;
        if (m23056h4() != 120) {
            while (true) {
                int iM23056h4 = m23056h4();
                if (iM23056h4 < 0 || 48 > iM23056h4 || iM23056h4 > 57) {
                    break;
                }
                i2 <<= iM23056h4 - 44;
                m23062m9();
            }
            return i2;
        }
        while (true) {
            m23062m9();
            int iM23056h42 = m23056h4();
            if (iM23056h42 < 0) {
                break;
            }
            if (48 <= iM23056h42 && iM23056h42 <= 57) {
                i = iM23056h42 - 44;
            } else if (65 <= iM23056h42 && iM23056h42 <= 70) {
                i = iM23056h42 - 51;
            } else {
                if (97 > iM23056h42 || iM23056h42 > 102) {
                    break;
                }
                i = iM23056h42 - 83;
            }
            i2 <<= i;
        }
        return i2;
    }

    /* JADX INFO: renamed from: h4 */
    private int m23056h4() {
        return this.f15466x1.mo13055du();
    }

    /* JADX INFO: renamed from: jd */
    private void m23057jd() {
        this.f15458dy = false;
        while (true) {
            int iM23056h4 = m23056h4();
            if (iM23056h4 == -1) {
                return;
            }
            if (iM23056h4 == 38) {
                m23062m9();
                m23052ck();
            } else if (iM23056h4 == 60) {
                return;
            } else {
                this.f15460h4.append((char) m23062m9());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private RuntimeException m23058k4() {
        return m23059k4(C14113y2.m67402k4("Unexpected end of stream. Element stack content is {0}", ""));
    }

    /* JADX INFO: renamed from: m9 */
    private int m23062m9() {
        int iMo13056h4 = this.f15466x1.mo13056h4();
        if (iMo13056h4 == 10) {
            this.f15459fa = true;
        }
        if (!this.f15459fa) {
            this.f15456ck++;
            return iMo13056h4;
        }
        this.f15461jd++;
        this.f15459fa = false;
        this.f15456ck = 1;
        return iMo13056h4;
    }

    /* JADX INFO: renamed from: up */
    private void m23063up() {
        while (true) {
            int i = 0;
            while (m23056h4() >= 0) {
                char cM23062m9 = (char) m23062m9();
                if (cM23062m9 == ']') {
                    i++;
                } else if (cM23062m9 == '>' && i > 1) {
                    while (i > 2) {
                        this.f15460h4.append(']');
                        i--;
                    }
                    return;
                } else {
                    for (int i2 = 0; i2 < i; i2++) {
                        this.f15460h4.append(']');
                    }
                    this.f15460h4.append(cM23062m9);
                }
            }
            throw m23058k4();
        }
    }

    /* JADX INFO: renamed from: x1 */
    private String m23064x1(char c, boolean z) {
        while (m23056h4() >= 0) {
            char cM23062m9 = (char) m23062m9();
            if (cM23062m9 == c) {
                String string = this.f15460h4.toString();
                this.f15460h4.setLength(0);
                return string;
            }
            if (z && cM23062m9 == '&') {
                m23052ck();
            } else {
                this.f15460h4.append(cM23062m9);
            }
        }
        throw m23058k4();
    }

    /* JADX INFO: renamed from: yj */
    private void m23066yj() {
        m23067k4(45);
        m23067k4(45);
        while (true) {
            if (m23062m9() == 45 && m23062m9() == 45) {
                break;
            }
        }
        if (m23062m9() != 62) {
            throw m23059k4("'--' is not allowed inside comment markup.");
        }
    }

    /* JADX INFO: renamed from: kk */
    public String m23070kk() {
        if (m23056h4() < 0 || !m23061k4((char) m23056h4(), true)) {
            throw m23059k4("XML name start character is expected.");
        }
        int iM23056h4 = m23056h4();
        int i = 0;
        while (iM23056h4 >= 0) {
            char c = (char) iM23056h4;
            if (!m23061k4(c, false)) {
                break;
            }
            char[] cArr = this.f15464m9;
            if (i == cArr.length) {
                char[] cArr2 = new char[i * 2];
                AbstractC14092to.m67229k4(cArr, 0, cArr2, 0, i);
                this.f15464m9 = cArr2;
            }
            this.f15464m9[i] = c;
            m23062m9();
            iM23056h4 = m23056h4();
            i++;
        }
        if (i != 0) {
            return new String(this.f15464m9, 0, i);
        }
        throw m23059k4("Valid XML name is expected.");
    }

    /* JADX INFO: renamed from: to */
    public void m23071to() {
        if (m23065x1(m23056h4())) {
            if (this.f15460h4.length() == 0) {
                this.f15458dy = true;
            }
            m23053du();
        }
        if (m23056h4() != 60) {
            m23057jd();
            return;
        }
        m23062m9();
        int iM23056h4 = m23056h4();
        if (iM23056h4 == 33) {
            m23062m9();
            if (m23056h4() == 91) {
                m23062m9();
                if (!"CDATA".equals(m23070kk())) {
                    throw m23059k4("Invalid declaration markup");
                }
                m23067k4(91);
                m23063up();
                return;
            }
            if (m23056h4() == 45) {
                m23066yj();
                return;
            } else {
                if (!"DOCTYPE".equals(m23070kk())) {
                    throw m23059k4("Invalid declaration markup.");
                }
                throw m23059k4("This parser does not support document type.");
            }
        }
        if (iM23056h4 == 47) {
            m23051c5();
            if (this.f15463kk.size() == 0) {
                throw m23058k4();
            }
            m23062m9();
            String strM23070kk = m23070kk();
            m23072x1();
            String str = (String) this.f15463kk.pop();
            this.f15465to.pop();
            this.f15457du = this.f15465to.size() > 0 ? (String) this.f15465to.peek() : null;
            if (!C14113y2.m67363du(strM23070kk, str)) {
                throw m23059k4(C14113y2.m67402k4("End tag mismatch: expected {0} but found {1}", str, strM23070kk));
            }
            this.f15462k4.mo23047kk(strM23070kk);
            m23067k4(62);
            return;
        }
        m23051c5();
        if (iM23056h4 == 63) {
            m23062m9();
            String strM23070kk2 = m23070kk();
            m23072x1();
            String strM67400k4 = "";
            if (m23056h4() != 63) {
                while (true) {
                    strM67400k4 = C14113y2.m67400k4(strM67400k4, m23064x1('?', false));
                    if (m23056h4() == 62) {
                        break;
                    } else {
                        strM67400k4 = C14113y2.m67400k4(strM67400k4, MsalUtils.QUERY_STRING_SYMBOL);
                    }
                }
            }
            this.f15462k4.mo23046k4(strM23070kk2, strM67400k4);
            m23067k4(62);
            return;
        }
        String strM23070kk3 = m23070kk();
        while (m23056h4() != 62 && m23056h4() != 47) {
            m23060k4(this.f15455c5);
        }
        this.f15462k4.mo23045k4(strM23070kk3, this.f15455c5);
        this.f15455c5.m23077x1();
        m23072x1();
        if (m23056h4() == 47) {
            m23062m9();
            this.f15462k4.mo23047kk(strM23070kk3);
        } else {
            this.f15463kk.push(strM23070kk3);
            this.f15465to.push(this.f15457du);
        }
        m23067k4(62);
    }

    /* JADX INFO: renamed from: k4 */
    private RuntimeException m23059k4(String str) {
        return new C5647to(str, this.f15461jd, this.f15456ck);
    }

    /* JADX INFO: renamed from: x1 */
    public void m23072x1() {
        m23069k4(false);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m23065x1(int i) {
        return i == 9 || i == 10 || i == 13 || i == 32;
    }

    /* JADX INFO: renamed from: k4 */
    public void m23067k4(int i) {
        int iM23062m9 = m23062m9();
        if (iM23062m9 < 0) {
            throw m23058k4();
        }
        if (iM23062m9 != i) {
            throw m23059k4(C14113y2.m67402k4("Expected '{0}' but got {1}", Character.valueOf((char) i), Character.valueOf((char) iM23062m9)));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m23068k4(AbstractC3151yd abstractC3151yd, kk kkVar) {
        this.f15466x1 = abstractC3151yd;
        this.f15462k4 = kkVar;
        kkVar.mo23043k4(this);
        while (m23056h4() >= 0) {
            m23071to();
        }
        m23051c5();
        if (this.f15463kk.size() > 0) {
            throw m23059k4(C14113y2.m67402k4("Insufficient close tag: {0}", this.f15463kk.peek()));
        }
        kkVar.mo23049x1(this);
        m23054dy();
    }

    /* JADX INFO: renamed from: k4 */
    private void m23060k4(k4 k4Var) {
        m23069k4(true);
        if (m23056h4() == 47 || m23056h4() == 62) {
            return;
        }
        String strM23070kk = m23070kk();
        m23072x1();
        m23067k4(61);
        m23072x1();
        int iM23062m9 = m23062m9();
        char c = '\"';
        if (iM23062m9 != 34) {
            c = '\'';
            if (iM23062m9 != 39) {
                throw m23059k4("Invalid attribute value markup.");
            }
        }
        String strM23064x1 = m23064x1(c, true);
        if ("xml:space".equals(strM23070kk)) {
            this.f15457du = strM23064x1;
        }
        k4Var.m23075k4(strM23070kk, strM23064x1);
    }

    /* JADX INFO: renamed from: k4 */
    public void m23069k4(boolean z) {
        while (true) {
            int iM23056h4 = m23056h4();
            if (iM23056h4 != 9 && iM23056h4 != 10 && iM23056h4 != 13 && iM23056h4 != 32) {
                break;
            }
            m23062m9();
            if (z) {
                z = false;
            }
        }
        if (z) {
            throw m23059k4("Whitespace is expected.");
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m23061k4(char c, boolean z) {
        if (c == '-' || c == '.') {
            return !z;
        }
        if (c == ':' || c == '_' || (c > 256 && (c == 1369 || c == 1765 || c == 1766 || (699 <= c && c <= 705)))) {
            return true;
        }
        switch (Character.getType(c)) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 10:
                return true;
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
                return !z;
            default:
                return false;
        }
    }
}
