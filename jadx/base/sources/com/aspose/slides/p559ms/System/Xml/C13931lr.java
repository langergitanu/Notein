package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.exceptions.XmlSchemaException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p532yu.C12943dd;
import com.aspose.slides.internal.p532yu.C13061k5;
import com.aspose.slides.internal.p532yu.C13116n3;
import com.aspose.slides.internal.p532yu.C13123nh;
import com.aspose.slides.internal.p532yu.C13125nk;
import com.aspose.slides.internal.p532yu.C13192rv;
import com.aspose.slides.internal.p532yu.C13226tw;
import com.aspose.slides.internal.p532yu.C13313yw;
import com.aspose.slides.internal.p532yu.C13322zd;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.huawei.hms.network.embedded.C18358t1;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.lr */
/* JADX INFO: loaded from: classes5.dex */
public class C13931lr implements InterfaceC13978sv {

    /* JADX INFO: renamed from: ak */
    private Dictionary<String, x1> f46604ak;

    /* JADX INFO: renamed from: ar */
    private boolean f46605ar;

    /* JADX INFO: renamed from: b3 */
    private String f46606b3;

    /* JADX INFO: renamed from: bv */
    private C6765kp f46607bv;

    /* JADX INFO: renamed from: c5 */
    private boolean f46608c5;

    /* JADX INFO: renamed from: ck */
    private boolean f46609ck;

    /* JADX INFO: renamed from: dq */
    private int[] f46610dq;

    /* JADX INFO: renamed from: du */
    private C14022y4 f46611du = C14022y4.m66318k4().Clone();

    /* JADX INFO: renamed from: dy */
    private boolean f46612dy;

    /* JADX INFO: renamed from: fa */
    private char[] f46613fa;

    /* JADX INFO: renamed from: h4 */
    private String f46614h4;

    /* JADX INFO: renamed from: ix */
    private int f46615ix;

    /* JADX INFO: renamed from: jd */
    private boolean f46616jd;

    /* JADX INFO: renamed from: k4 */
    private InterfaceC14006wp f46617k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC13883dt f46618kk;

    /* JADX INFO: renamed from: ks */
    private int f46619ks;

    /* JADX INFO: renamed from: lr */
    private C14000vh f46620lr;

    /* JADX INFO: renamed from: m9 */
    private String f46621m9;

    /* JADX INFO: renamed from: ne */
    private boolean f46622ne;

    /* JADX INFO: renamed from: qq */
    private int f46623qq;

    /* JADX INFO: renamed from: rv */
    private int f46624rv;

    /* JADX INFO: renamed from: to */
    private C13322zd f46625to;

    /* JADX INFO: renamed from: u4 */
    private int f46626u4;

    /* JADX INFO: renamed from: um */
    private boolean f46627um;

    /* JADX INFO: renamed from: up */
    private int f46628up;

    /* JADX INFO: renamed from: uz */
    private C6765kp f46629uz;

    /* JADX INFO: renamed from: v4 */
    private int f46630v4;

    /* JADX INFO: renamed from: wl */
    private int f46631wl;

    /* JADX INFO: renamed from: wy */
    private String f46632wy;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC13927kp f46633x1;

    /* JADX INFO: renamed from: x6 */
    private int f46634x6;

    /* JADX INFO: renamed from: yd */
    private char f46635yd;

    /* JADX INFO: renamed from: yj */
    private int f46636yj;

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.lr$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public int f46637k4;

        /* JADX INFO: renamed from: x1 */
        public int f46638x1 = 9;

        public k4(int i) {
            this.f46637k4 = i;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.lr$x1 */
    public static class x1 {

        /* JADX INFO: renamed from: k4 */
        public String f46639k4;

        /* JADX INFO: renamed from: kk */
        public int f46640kk;

        /* JADX INFO: renamed from: to */
        public x1 f46641to = null;

        /* JADX INFO: renamed from: x1 */
        public int f46642x1;

        public x1(String str, int i, int i2) {
            this.f46639k4 = str;
            this.f46642x1 = i;
            this.f46640kk = i2;
        }
    }

    private C13931lr() {
        String str = C14113y2.f47374k4;
        this.f46614h4 = str;
        this.f46621m9 = str;
        this.f46612dy = true;
        this.f46608c5 = false;
        this.f46616jd = true;
        this.f46609ck = false;
        this.f46629uz = null;
        this.f46631wl = 0;
        this.f46623qq = 0;
        this.f46605ar = false;
        this.f46627um = false;
        this.f46630v4 = 0;
        this.f46620lr = new C14000vh(0, 0);
        this.f46635yd = '\"';
        String str2 = C14113y2.f47374k4;
        this.f46606b3 = str2;
        this.f46632wy = str2;
        this.f46604ak = null;
        this.f46610dq = null;
    }

    /* JADX INFO: renamed from: ai */
    private String m65507ai() {
        if (this.f46607bv.m26807x1() != 0) {
            return this.f46607bv.toString();
        }
        return C14113y2.m67406k4(this.f46613fa, this.f46615ix, (this.f46636yj - r1) - 1);
    }

    /* JADX INFO: renamed from: ak */
    private int m65508ak() {
        this.f46619ks = 31;
        char[] cArr = this.f46613fa;
        int i = this.f46636yj;
        if (cArr[i] != '*' || this.f46622ne) {
            return 9;
        }
        this.f46636yj = i + 1;
        return 39;
    }

    /* JADX INFO: renamed from: ar */
    private int m65509ar() {
        char[] cArr = this.f46613fa;
        int i = this.f46636yj;
        char c = cArr[i];
        if (c == '>') {
            this.f46636yj = i + 1;
            this.f46619ks = 0;
            return 29;
        }
        if (c != '[') {
            m65541k4(i, "Expecting an internal subset or the end of the DOCTYPE declaration.");
            return 9;
        }
        this.f46636yj = i + 1;
        this.f46619ks = 0;
        return 31;
    }

    /* JADX INFO: renamed from: b3 */
    private int m65510b3() {
        char[] cArr = this.f46613fa;
        int i = this.f46636yj;
        char c = cArr[i];
        if (c == ')') {
            this.f46636yj = i + 1;
            this.f46619ks = 9;
            return 28;
        }
        if (c == ',') {
            this.f46636yj = i + 1;
            this.f46619ks = 8;
            return 43;
        }
        if (c == '>') {
            this.f46636yj = i + 1;
            this.f46619ks = 0;
            return 29;
        }
        if (c != '|') {
            m65541k4(i, "Expecting '?', '*', or '+'.");
            return 9;
        }
        this.f46636yj = i + 1;
        this.f46619ks = 8;
        return 30;
    }

    /* JADX INFO: renamed from: bs */
    private void m65511bs() {
        this.f46613fa = this.f46617k4.mo66187to();
        this.f46628up = this.f46617k4.mo66170du();
        this.f46636yj = this.f46617k4.mo66173h4();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0000 A[SYNTHETIC] */
    /* JADX INFO: renamed from: bv */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m65512bv() {
        while (true) {
            char[] cArr = this.f46613fa;
            int i = this.f46636yj;
            char c = cArr[i];
            if (c == '(') {
                this.f46619ks = 7;
                this.f46636yj = i + 1;
                return 27;
            }
            if (c != 'A') {
                if (c == 'E') {
                    if (this.f46628up - i < 5) {
                        if (m65516ca() == 0) {
                            m65541k4(this.f46636yj, "Incomplete DTD content.");
                        }
                    } else if (cArr[i + 1] == 'M' && cArr[i + 2] == 'P' && cArr[i + 3] == 'T' && cArr[i + 4] == 'Y') {
                        this.f46636yj = i + 5;
                        this.f46619ks = 31;
                        return 45;
                    }
                }
                m65541k4(i, "Invalid content model.");
                if (m65516ca() != 0) {
                    m65541k4(this.f46636yj, "Incomplete DTD content.");
                }
            } else if (this.f46628up - i >= 3) {
                if (cArr[i + 1] == 'N' && cArr[i + 2] == 'Y') {
                    this.f46636yj = i + 3;
                    this.f46619ks = 31;
                    return 44;
                }
                m65541k4(i, "Invalid content model.");
                if (m65516ca() != 0) {
                }
            } else if (m65516ca() == 0) {
                m65541k4(this.f46636yj, "Incomplete DTD content.");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00fe, code lost:
    
        m65535k4(0);
        r12.f46619ks = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0104, code lost:
    
        return 35;
     */
    /* JADX INFO: renamed from: bz */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m65513bz() {
        while (true) {
            char[] cArr = this.f46613fa;
            int i = this.f46636yj;
            char c = cArr[i];
            if (c == '\"') {
                break;
            }
            if (c == '#') {
                int i2 = this.f46628up;
                if (i2 - i >= 6) {
                    char c2 = cArr[i + 1];
                    if (c2 == 'F') {
                        if (cArr[i + 2] != 'I' || cArr[i + 3] != 'X' || cArr[i + 4] != 'E' || cArr[i + 5] != 'D') {
                            m65541k4(i, "Expecting an attribute type.");
                        }
                        this.f46636yj += 6;
                        this.f46619ks = 19;
                        return 22;
                    }
                    if (c2 != 'I') {
                        if (c2 == 'R') {
                            if (i2 - i >= 9) {
                                if (cArr[i + 2] != 'E' || cArr[i + 3] != 'Q' || cArr[i + 4] != 'U' || cArr[i + 5] != 'I' || cArr[i + 6] != 'R' || cArr[i + 7] != 'E' || cArr[i + 8] != 'D') {
                                    m65541k4(i, "Expecting an attribute type.");
                                }
                                this.f46636yj += 9;
                                this.f46619ks = 13;
                                return 20;
                            }
                            if (m65516ca() == 0) {
                                m65541k4(this.f46636yj, "Incomplete DTD content.");
                            }
                        }
                    } else {
                        if (i2 - i >= 8) {
                            if (cArr[i + 2] != 'M' || cArr[i + 3] != 'P' || cArr[i + 4] != 'L' || cArr[i + 5] != 'I' || cArr[i + 6] != 'E' || cArr[i + 7] != 'D') {
                                m65541k4(i, "Expecting an attribute type.");
                            }
                            this.f46636yj += 8;
                            this.f46619ks = 13;
                            return 21;
                        }
                        if (m65516ca() == 0) {
                            m65541k4(this.f46636yj, "Incomplete DTD content.");
                        }
                    }
                } else if (m65516ca() == 0) {
                    m65541k4(this.f46636yj, "Incomplete DTD content.");
                }
            } else if (c == '\'') {
                break;
            }
            m65541k4(i, "Expecting an attribute type.");
            if (m65516ca() == 0) {
                m65541k4(this.f46636yj, "Incomplete DTD content.");
            }
        }
    }

    /* JADX INFO: renamed from: c5 */
    private void m65514c5() {
        m65517ck();
    }

    /* JADX INFO: renamed from: c6 */
    private int m65515c6() {
        char[] cArr = this.f46613fa;
        int i = this.f46636yj;
        if (cArr[i] != '(') {
            m65594x1(i, "(");
            return 9;
        }
        this.f46636yj = i + 1;
        this.f46619ks = 1;
        this.f46624rv = 16;
        return 27;
    }

    /* JADX INFO: renamed from: ca */
    private int m65516ca() {
        m65530he();
        int iMo66172fa = this.f46617k4.mo66172fa();
        m65511bs();
        return iMo66172fa;
    }

    /* JADX INFO: renamed from: ck */
    private void m65517ck() {
        while (true) {
            int iM65555kk = m65555kk(false);
            int i = this.f46623qq;
            if (iM65555kk == 32) {
                if (!m65600x1()) {
                    m65541k4(this.f46636yj, "Expected DTD markup was not found.");
                    return;
                }
                if (this.f46630v4 != 0) {
                    m65541k4(this.f46636yj, "There is an unclosed conditional section.");
                }
                if (this.f46629uz != null) {
                    m65593x1(this.f46636yj - 1);
                    this.f46625to.m61897x1(this.f46629uz.toString());
                    this.f46629uz = null;
                }
                if (m65555kk(false) != 29) {
                    m65594x1(this.f46636yj, ">");
                    return;
                }
                return;
            }
            switch (iM65555kk) {
                case 11:
                    m65525fa();
                    break;
                case 12:
                    m65583up();
                    break;
                case 13:
                    m65606yj();
                    break;
                case 14:
                    m65560ks();
                    break;
                case 15:
                    m65571rv();
                    break;
                case 16:
                    m65601x6();
                    break;
                case 17:
                    if (m65600x1()) {
                        m65541k4(this.f46636yj - 3, "A conditional section is not allowed in an internal subset.");
                    }
                    m65565ne();
                    i = this.f46623qq;
                    break;
                case 18:
                    int i2 = this.f46630v4;
                    if (i2 <= 0) {
                        m65541k4(this.f46636yj - 3, "']]>' is not expected.");
                    } else {
                        int i3 = i2 - 1;
                        this.f46630v4 = i3;
                        if (this.f46608c5 && i != this.f46610dq[i3]) {
                            m65538k4(this.f46636yj, 0, "The parameter entity replacement text must nest properly within markup declarations.", C14113y2.f47374k4);
                        }
                    }
                    break;
                case 19:
                    if (m65600x1() && !this.f46605ar) {
                        m65541k4(this.f46636yj, "Incomplete DTD content.");
                    }
                    if (this.f46630v4 != 0) {
                        m65541k4(this.f46636yj, "There is an unclosed conditional section.");
                        return;
                    }
                    return;
            }
            if (this.f46623qq != i) {
                if (this.f46608c5) {
                    m65538k4(this.f46636yj, 0, "The parameter entity replacement text must nest properly within markup declarations.", C14113y2.f47374k4);
                } else if (!this.f46609ck) {
                    m65541k4(this.f46636yj, "The parameter entity replacement text must nest properly within markup declarations.");
                }
            }
        }
    }

    /* JADX INFO: renamed from: dq */
    private int m65518dq() {
        char[] cArr = this.f46613fa;
        int i = this.f46636yj;
        if (cArr[i] == '>') {
            this.f46636yj = i + 1;
            this.f46619ks = 0;
            return 29;
        }
        if (!this.f46622ne) {
            m65595x1(i, "'{0}' is an unexpected token. Expecting white space.", m65576to(i));
        }
        m65569qw();
        this.f46619ks = 14;
        return 23;
    }

    /* JADX INFO: renamed from: du */
    private C13890ei m65519du(boolean z) {
        if (this.f46626u4 == -1) {
            AbstractC13883dt abstractC13883dt = this.f46618kk;
            char[] cArr = this.f46613fa;
            int i = this.f46615ix;
            return new C13890ei(abstractC13883dt.mo65267k4(cArr, i, this.f46636yj - i));
        }
        if (!z) {
            m65595x1(this.f46615ix, "'{0}' is an unqualified name and cannot contain the character ':'.", m65523em());
            return null;
        }
        String strMo65267k4 = this.f46618kk.mo65267k4(this.f46613fa, this.f46626u4 + 1, (this.f46636yj - r2) - 1);
        AbstractC13883dt abstractC13883dt2 = this.f46618kk;
        char[] cArr2 = this.f46613fa;
        int i2 = this.f46615ix;
        return new C13890ei(strMo65267k4, abstractC13883dt2.mo65267k4(cArr2, i2, this.f46626u4 - i2));
    }

    /* JADX INFO: renamed from: dy */
    private void m65521dy() {
        if (this.f46627um) {
            m65511bs();
            m65514c5();
            m65530he();
        }
        String str = this.f46614h4;
        if (str == null || str.length() <= 0) {
            return;
        }
        m65533jd();
    }

    /* JADX INFO: renamed from: e0 */
    private int m65522e0() {
        char[] cArr = this.f46613fa;
        int i = this.f46636yj;
        char c = cArr[i];
        if (c == ')') {
            this.f46636yj = i + 1;
            this.f46619ks = 18;
            return 28;
        }
        if (c != '|') {
            m65556kk(i, ")", "|");
            return 9;
        }
        this.f46636yj = i + 1;
        this.f46619ks = 3;
        this.f46624rv = 17;
        return 30;
    }

    /* JADX INFO: renamed from: em */
    private String m65523em() {
        char[] cArr = this.f46613fa;
        int i = this.f46615ix;
        return C14113y2.m67406k4(cArr, i, this.f46636yj - i);
    }

    /* JADX INFO: renamed from: f9 */
    private int m65524f9() {
        char c = this.f46613fa[this.f46636yj];
        if (c != '\"' && c != '\'') {
            this.f46619ks = this.f46624rv;
            return 9;
        }
        m65535k4(2);
        this.f46619ks = this.f46624rv;
        return 35;
    }

    /* JADX INFO: renamed from: fa */
    private void m65525fa() {
        int iM65555kk;
        if (m65555kk(true) != 23) {
            m65562m2();
            return;
        }
        C13890ei c13890eiM65519du = m65519du(true);
        C13061k5 c13061k5 = null;
        C13125nk[] c13125nkArr = {null};
        boolean zTryGetValue = this.f46625to.m61888m9().tryGetValue(c13890eiM65519du, c13125nkArr);
        C13125nk c13125nk = c13125nkArr[0];
        if (!zTryGetValue) {
            c13125nkArr[0] = c13125nk;
            boolean zTryGetValue2 = this.f46625to.m61871dy().tryGetValue(c13890eiM65519du, c13125nkArr);
            c13125nk = c13125nkArr[0];
            if (!zTryGetValue2) {
                c13125nk = new C13125nk(c13890eiM65519du, c13890eiM65519du.m65284k4());
                this.f46625to.m61871dy().addItem(c13890eiM65519du, c13125nk);
            }
        }
        while (true) {
            iM65555kk = m65555kk(false);
            if (iM65555kk != 23) {
                break;
            }
            C13890ei c13890eiM65519du2 = m65519du(true);
            c13061k5 = new C13061k5(c13890eiM65519du2, c13890eiM65519du2.m65284k4());
            c13061k5.m61438k4(!m65600x1());
            c13061k5.m61051x1(m65534jw());
            c13061k5.m61034k4(m65604y2() - (this.f46636yj - this.f46615ix));
            boolean z = c13125nk.m61283x1(c13061k5.m61443qq()) != null;
            m65545k4(c13061k5, c13125nk, z);
            m65546k4(c13061k5, z);
            if (c13061k5.m61428ar().length() > 0 && C14113y2.m67363du(c13061k5.m61428ar(), "xml")) {
                if ("space".equals(c13061k5.m61443qq().m65289x1())) {
                    if (this.f46609ck) {
                        String strM67440x1 = C14113y2.m67440x1(c13061k5.m61043rv());
                        if (C14113y2.m67363du(strM67440x1, "preserve") || C14113y2.m67363du(strM67440x1, "default")) {
                            c13061k5.m61029h4(1);
                        }
                    } else {
                        c13061k5.m61029h4(1);
                        if (c13061k5.m61052x6() != 9) {
                            m65550k4("Enumeration data type required.", C14113y2.f47374k4, c13061k5.m61047up(), c13061k5.m61028fa());
                        }
                        if (this.f46608c5) {
                            c13061k5.m61036k4(this.f46633x1.mo65506x6());
                        }
                    }
                } else if (CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL.equals(c13061k5.m61443qq().m65289x1())) {
                    c13061k5.m61029h4(2);
                }
            }
            if (!z) {
                c13125nk.m61267k4(c13061k5);
            }
        }
        if (iM65555kk != 29) {
            m65562m2();
            return;
        }
        if (this.f46609ck && c13061k5 != null && c13061k5.m61428ar().length() > 0 && C14113y2.m67363du(c13061k5.m61428ar(), "xml") && "space".equals(c13061k5.m61443qq().m65289x1())) {
            c13061k5.m61029h4(1);
            if (c13061k5.m61429b3().mo60016c5() != 9) {
                m65550k4("Enumeration data type required.", C14113y2.f47374k4, c13061k5.m61047up(), c13061k5.m61028fa());
            }
            if (this.f46608c5) {
                c13061k5.m61036k4(this.f46633x1.mo65506x6());
            }
        }
    }

    /* JADX INFO: renamed from: g8 */
    private C13890ei m65526g8() {
        try {
            m65586vh();
        } catch (XmlException e) {
            m65550k4("An error occurred while parsing EntityName.", C14113y2.f47374k4, e.getLineNumber(), e.getLinePosition());
        }
        char[] cArr = this.f46613fa;
        int i = this.f46636yj;
        if (cArr[i] != ';') {
            m65594x1(i, ";");
        }
        C13890ei c13890eiM65519du = m65519du(false);
        this.f46636yj++;
        return c13890eiM65519du;
    }

    /* JADX INFO: renamed from: gi */
    private int m65527gi() {
        if (this.f46613fa[this.f46636yj] == 'N') {
            do {
                int i = this.f46628up;
                int i2 = this.f46636yj;
                if (i - i2 >= 5) {
                    char[] cArr = this.f46613fa;
                    if (cArr[i2 + 1] == 'D' && cArr[i2 + 2] == 'A' && cArr[i2 + 3] == 'T' && cArr[i2 + 4] == 'A') {
                        this.f46636yj = i2 + 5;
                        this.f46619ks = 1;
                        this.f46624rv = 31;
                        return 37;
                    }
                }
            } while (m65516ca() != 0);
            this.f46619ks = 31;
            return 9;
        }
        this.f46619ks = 31;
        return 9;
    }

    /* JADX INFO: renamed from: h4 */
    private boolean m65528h4() {
        return this.f46616jd;
    }

    /* JADX INFO: renamed from: he */
    private void m65530he() {
        m65593x1(this.f46636yj);
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x0022 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0002 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ix */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m65531ix() {
        while (true) {
            char[] cArr = this.f46613fa;
            int i = this.f46636yj;
            char c = cArr[i];
            if (c == '<') {
                char c2 = cArr[i + 1];
                if (c2 == '!') {
                    char c3 = cArr[i + 2];
                    if (c3 != '-') {
                        if (c3 != 'A') {
                            if (c3 != 'E') {
                                if (c3 != 'N') {
                                    if (c3 == '[') {
                                        this.f46636yj = i + 3;
                                        this.f46619ks = 24;
                                        return 17;
                                    }
                                    if (this.f46628up - i >= 3) {
                                        i += 2;
                                        m65541k4(i, "Expected DTD markup was not found.");
                                        if (m65516ca() != 0) {
                                        }
                                    } else if (m65516ca() == 0) {
                                        m65541k4(this.f46628up, "Incomplete DTD content.");
                                    }
                                } else {
                                    if (this.f46628up - i >= 10) {
                                        if (cArr[i + 3] != 'O' || cArr[i + 4] != 'T' || cArr[i + 5] != 'A' || cArr[i + 6] != 'T' || cArr[i + 7] != 'I' || cArr[i + 8] != 'O' || cArr[i + 9] != 'N') {
                                            m65541k4(i, "Expected DTD markup was not found.");
                                        }
                                        this.f46636yj += 10;
                                        this.f46619ks = 1;
                                        this.f46624rv = 23;
                                        return 14;
                                    }
                                    if (m65516ca() == 0) {
                                        m65541k4(this.f46628up, "Incomplete DTD content.");
                                    }
                                }
                            } else if (cArr[i + 3] == 'L') {
                                if (this.f46628up - i >= 9) {
                                    if (cArr[i + 4] != 'E' || cArr[i + 5] != 'M' || cArr[i + 6] != 'E' || cArr[i + 7] != 'N' || cArr[i + 8] != 'T') {
                                        m65541k4(i, "Expected DTD markup was not found.");
                                    }
                                    this.f46636yj += 9;
                                    this.f46619ks = 2;
                                    this.f46624rv = 6;
                                    return 12;
                                }
                                if (m65516ca() == 0) {
                                    m65541k4(this.f46628up, "Incomplete DTD content.");
                                }
                            } else if (cArr[i + 3] == 'N') {
                                if (this.f46628up - i >= 8) {
                                    if (cArr[i + 4] != 'T' || cArr[i + 5] != 'I' || cArr[i + 6] != 'T' || cArr[i + 7] != 'Y') {
                                        m65541k4(i, "Expected DTD markup was not found.");
                                    }
                                    this.f46636yj += 8;
                                    this.f46619ks = 20;
                                    return 13;
                                }
                                if (m65516ca() == 0) {
                                    m65541k4(this.f46628up, "Incomplete DTD content.");
                                }
                            } else {
                                if (this.f46628up - i >= 4) {
                                    m65541k4(i, "Expected DTD markup was not found.");
                                    return 9;
                                }
                                if (m65516ca() == 0) {
                                    m65541k4(this.f46628up, "Incomplete DTD content.");
                                }
                            }
                        } else {
                            if (this.f46628up - i >= 9) {
                                if (cArr[i + 3] != 'T' || cArr[i + 4] != 'T' || cArr[i + 5] != 'L' || cArr[i + 6] != 'I' || cArr[i + 7] != 'S' || cArr[i + 8] != 'T') {
                                    m65541k4(i, "Expected DTD markup was not found.");
                                }
                                this.f46636yj += 9;
                                this.f46619ks = 2;
                                this.f46624rv = 13;
                                return 11;
                            }
                            if (m65516ca() == 0) {
                                m65541k4(this.f46628up, "Incomplete DTD content.");
                            }
                        }
                    } else {
                        if (cArr[i + 3] == '-') {
                            this.f46636yj = i + 4;
                            return 15;
                        }
                        if (this.f46628up - i >= 4) {
                            m65541k4(i, "Expected DTD markup was not found.");
                            if (m65516ca() != 0) {
                            }
                        } else if (m65516ca() == 0) {
                            m65541k4(this.f46628up, "Incomplete DTD content.");
                        }
                    }
                } else {
                    if (c2 == '?') {
                        this.f46636yj = i + 2;
                        return 16;
                    }
                    if (this.f46628up - i >= 2) {
                        m65541k4(i, "Expected DTD markup was not found.");
                        return 9;
                    }
                    if (m65516ca() == 0) {
                        m65541k4(this.f46628up, "Incomplete DTD content.");
                    }
                }
            } else if (c != ']') {
                if (this.f46628up - i != 0) {
                    m65541k4(i, "Expected DTD markup was not found.");
                    if (m65516ca() != 0) {
                        m65541k4(this.f46628up, "Incomplete DTD content.");
                    }
                } else if (m65516ca() == 0) {
                    m65541k4(this.f46628up, "Incomplete DTD content.");
                }
            } else if (this.f46628up - i >= 2 || this.f46617k4.mo66168c5()) {
                char[] cArr2 = this.f46613fa;
                int i2 = this.f46636yj;
                if (cArr2[i2 + 1] != ']') {
                    this.f46636yj = i2 + 1;
                    this.f46619ks = 31;
                    return 32;
                }
                if (this.f46628up - i2 >= 3 || this.f46617k4.mo66168c5()) {
                    char[] cArr3 = this.f46613fa;
                    int i3 = this.f46636yj;
                    if (cArr3[i3 + 1] == ']' && cArr3[i3 + 2] == '>') {
                        this.f46636yj = i3 + 3;
                        return 18;
                    }
                    if (this.f46628up - i3 != 0) {
                        m65541k4(i3, "Expected DTD markup was not found.");
                        if (m65516ca() != 0) {
                        }
                    } else if (m65516ca() == 0) {
                        m65541k4(this.f46628up, "Incomplete DTD content.");
                    }
                } else if (m65516ca() == 0) {
                    m65541k4(this.f46628up, "Incomplete DTD content.");
                }
            } else if (m65516ca() == 0) {
                m65541k4(this.f46628up, "Incomplete DTD content.");
            }
        }
    }

    /* JADX INFO: renamed from: j2 */
    private void m65532j2() {
        this.f46615ix = this.f46636yj;
        while (true) {
            byte[] bArr = this.f46611du.f47099k4;
            char[] cArr = this.f46613fa;
            int i = this.f46636yj;
            char c = cArr[i];
            if ((bArr[c] & 8) != 0 || c == ':') {
                this.f46636yj = i + 1;
            } else {
                int i2 = this.f46628up;
                if (i < i2) {
                    if (i - this.f46615ix == 0) {
                        m65544k4(i, "The '{0}' character, hexadecimal value {1}, cannot be included in a name.", XmlException.buildCharExceptionArgs(cArr, i2, i));
                        return;
                    }
                    return;
                }
                int i3 = this.f46615ix;
                int i4 = i - i3;
                this.f46636yj = i3;
                if (m65516ca() == 0) {
                    int i5 = this.f46636yj;
                    if (i4 > 0) {
                        this.f46615ix = i5;
                        this.f46636yj = i5 + i4;
                        return;
                    }
                    m65595x1(i5, "Unexpected end of file while parsing {0} has occurred.", "NmToken");
                }
                int i6 = this.f46636yj;
                this.f46615ix = i6;
                this.f46636yj = i6 + i4;
            }
        }
    }

    /* JADX INFO: renamed from: jd */
    private void m65533jd() {
        if (this.f46617k4.mo66182k4(this.f46614h4, this.f46621m9)) {
            C14062gk c14062gkMo66184kk = this.f46617k4.mo66184kk();
            if (c14062gkMo66184kk != null) {
                this.f46632wy = c14062gkMo66184kk.toString();
            }
            this.f46631wl++;
            m65511bs();
            m65517ck();
        }
    }

    /* JADX INFO: renamed from: jw */
    private int m65534jw() {
        return this.f46617k4.mo66186m9();
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m65535k4(int i) {
        int iMo66175k4;
        char c = this.f46613fa[this.f46636yj];
        char c2 = i == 0 ? ' ' : '\n';
        int i2 = this.f46623qq;
        this.f46620lr.m66279k4(m65534jw(), m65604y2());
        int i3 = this.f46636yj + 1;
        this.f46636yj = i3;
        this.f46615ix = i3;
        this.f46607bv.m26801k4(0);
        while (true) {
            byte[] bArr = this.f46611du.f47099k4;
            char[] cArr = this.f46613fa;
            int i4 = this.f46636yj;
            char c3 = cArr[i4];
            if ((bArr[c3] & UnsignedBytes.MAX_POWER_OF_TWO) == 0 || c3 == '%') {
                if (c3 == c && this.f46623qq == i2) {
                    if (this.f46607bv.m26807x1() > 0) {
                        C6765kp c6765kp = this.f46607bv;
                        char[] cArr2 = this.f46613fa;
                        int i5 = this.f46615ix;
                        c6765kp.m26799k4(cArr2, i5, this.f46636yj - i5);
                    }
                    this.f46636yj++;
                    this.f46635yd = c;
                    return 35;
                }
                int i6 = this.f46615ix;
                int i7 = i4 - i6;
                if (i7 > 0) {
                    this.f46607bv.m26799k4(cArr, i6, i7);
                    this.f46615ix = this.f46636yj;
                }
                char[] cArr3 = this.f46613fa;
                i4 = this.f46636yj;
                char c4 = cArr3[i4];
                if (c4 != '\t') {
                    if (c4 == '\n') {
                        this.f46636yj = i4 + 1;
                        if (m65564m9()) {
                        }
                        this.f46617k4.mo66189x1(this.f46636yj);
                    } else if (c4 == '\r') {
                        if (cArr3[i4 + 1] == '\n') {
                            if (m65564m9()) {
                                C6765kp c6765kp2 = this.f46607bv;
                                boolean zMo66169ck = this.f46617k4.mo66169ck();
                                c6765kp2.m26792k4(i == 0 ? zMo66169ck ? "  " : " " : zMo66169ck ? IOUtils.LINE_SEPARATOR_WINDOWS : IOUtils.LINE_SEPARATOR_UNIX);
                                this.f46615ix = this.f46636yj + 2;
                                m65530he();
                                InterfaceC14006wp interfaceC14006wp = this.f46617k4;
                                interfaceC14006wp.mo66178k4(interfaceC14006wp.mo66173h4() + 1);
                            }
                            this.f46636yj += 2;
                        } else if (i4 + 1 == this.f46628up) {
                            if ((this.f46617k4.mo66168c5() || m65516ca() == 0) && (i == 2 || !m65529h4(true))) {
                            }
                            this.f46615ix = this.f46636yj;
                        } else {
                            this.f46636yj = i4 + 1;
                            if (m65564m9()) {
                                this.f46607bv.m26780k4(c2);
                                this.f46615ix = this.f46636yj;
                            }
                        }
                        this.f46617k4.mo66189x1(this.f46636yj);
                    } else if (c4 != '\"') {
                        if (c4 != '<') {
                            if (c4 != '>') {
                                switch (c4) {
                                    case '%':
                                        if (i == 1) {
                                            m65554k4(true, true, i == 0);
                                            this.f46615ix = this.f46636yj;
                                        }
                                        break;
                                    case '&':
                                        if (i != 2) {
                                            if (i4 + 1 != this.f46628up) {
                                                char c5 = cArr3[i4 + 1];
                                                m65530he();
                                                if (c5 != '#') {
                                                    InterfaceC14006wp interfaceC14006wp2 = this.f46617k4;
                                                    if (i != 0) {
                                                        iMo66175k4 = interfaceC14006wp2.mo66176k4(false, (C6765kp) null);
                                                        m65511bs();
                                                        if (iMo66175k4 < 0) {
                                                            this.f46607bv.m26780k4('&');
                                                            int i8 = this.f46636yj + 1;
                                                            this.f46636yj = i8;
                                                            this.f46615ix = i8;
                                                            m65592x1(m65526g8(), false, false, false);
                                                        } else {
                                                            this.f46615ix = this.f46636yj;
                                                            this.f46636yj = iMo66175k4;
                                                        }
                                                        break;
                                                    } else {
                                                        iMo66175k4 = interfaceC14006wp2.mo66176k4(true, m65578to() ? this.f46629uz : null);
                                                        m65511bs();
                                                        if (iMo66175k4 >= 0) {
                                                            C6765kp c6765kp3 = this.f46607bv;
                                                            char[] cArr4 = this.f46613fa;
                                                            int i9 = this.f46636yj;
                                                            c6765kp3.m26799k4(cArr4, i9, iMo66175k4 - i9);
                                                        } else {
                                                            m65554k4(false, true, true);
                                                        }
                                                    }
                                                } else {
                                                    iMo66175k4 = this.f46617k4.mo66175k4(m65578to() ? this.f46629uz : null);
                                                    m65511bs();
                                                    C6765kp c6765kp4 = this.f46607bv;
                                                    char[] cArr5 = this.f46613fa;
                                                    int i10 = this.f46636yj;
                                                    c6765kp4.m26799k4(cArr5, i10, iMo66175k4 - i10);
                                                }
                                                this.f46617k4.mo66178k4(iMo66175k4);
                                                this.f46615ix = iMo66175k4;
                                                this.f46636yj = iMo66175k4;
                                            } else if ((this.f46617k4.mo66168c5() || m65516ca() == 0) && (i == 2 || !m65529h4(true))) {
                                                m65541k4(this.f46636yj, "There is an unclosed literal string.");
                                            }
                                            this.f46615ix = this.f46636yj;
                                            break;
                                        }
                                        break;
                                    case '\'':
                                        break;
                                    default:
                                        if (i4 == this.f46628up) {
                                            if ((this.f46617k4.mo66168c5() || m65516ca() == 0) && (i == 2 || !m65529h4(true))) {
                                            }
                                            this.f46615ix = this.f46636yj;
                                        } else if (C14022y4.m66321k4((int) c4)) {
                                            int i11 = this.f46636yj;
                                            if (i11 + 1 != this.f46628up) {
                                                int i12 = i11 + 1;
                                                this.f46636yj = i12;
                                                if (!C14022y4.m66327x1((int) this.f46613fa[i12])) {
                                                }
                                            } else {
                                                if ((this.f46617k4.mo66168c5() || m65516ca() == 0) && (i == 2 || !m65529h4(true))) {
                                                }
                                                this.f46615ix = this.f46636yj;
                                            }
                                        }
                                        break;
                                }
                            }
                        } else if (i == 0) {
                            m65544k4(i4, "'{0}', hexadecimal value {1}, is an invalid attribute character.", XmlException.buildCharExceptionArgs('<', (char) 0));
                        }
                    }
                } else if (i == 0 && m65564m9()) {
                    this.f46607bv.m26780k4(ControlChar.SPACE_CHAR);
                    this.f46615ix++;
                }
                iMo66175k4 = this.f46636yj + 1;
                this.f46636yj = iMo66175k4;
            }
            this.f46636yj = i4 + 1;
        }
        m65552k4(this.f46613fa, this.f46628up, this.f46636yj);
        return 9;
    }

    /* JADX INFO: renamed from: kk */
    private int m65555kk(boolean z) {
        int i;
        InterfaceC14006wp interfaceC14006wp;
        this.f46622ne = false;
        while (true) {
            char[] cArr = this.f46613fa;
            int i2 = this.f46636yj;
            char c = cArr[i2];
            if (c == 0) {
                int i3 = this.f46628up;
                if (i2 != i3) {
                    m65552k4(cArr, i3, i2);
                    if (this.f46617k4.mo66168c5() || m65516ca() == 0) {
                        if (m65529h4(false)) {
                            continue;
                        } else {
                            if (this.f46619ks == 0) {
                                return 19;
                            }
                            m65541k4(this.f46636yj, "Incomplete DTD content.");
                        }
                    }
                } else if (this.f46617k4.mo66168c5() || m65516ca() == 0) {
                    if (m65529h4(false)) {
                        continue;
                    } else {
                        if (this.f46619ks == 0) {
                            return 19;
                        }
                        m65541k4(this.f46636yj, "Incomplete DTD content.");
                    }
                }
            } else if (c != '\r') {
                if (c != ' ') {
                    if (c == '%') {
                        if (this.f46628up - i2 >= 2) {
                            if (this.f46611du.m66333k4(cArr[i2 + 1])) {
                                if (z && !this.f46622ne && this.f46619ks != 32) {
                                    int i4 = this.f46636yj;
                                    m65595x1(i4, "'{0}' is an unexpected token. Expecting white space.", m65576to(i4));
                                }
                                this.f46615ix = this.f46636yj;
                                while (true) {
                                    switch (this.f46619ks) {
                                        case 0:
                                            return m65531ix();
                                        case 1:
                                            return m65581u4();
                                        case 2:
                                            return m65584uz();
                                        case 3:
                                            return m65589wl();
                                        case 4:
                                            return m65568qq();
                                        case 5:
                                            return m65509ar();
                                        case 6:
                                            return m65512bv();
                                        case 7:
                                            return m65585v4();
                                        case 8:
                                            return m65561lr();
                                        case 9:
                                            return m65605yd();
                                        case 10:
                                            return m65510b3();
                                        case 11:
                                            return m65591wy();
                                        case 12:
                                            return m65508ak();
                                        case 13:
                                            return m65518dq();
                                        case 14:
                                            return m65602xk();
                                        case 15:
                                            return m65515c6();
                                        case 16:
                                            return m65580ts();
                                        case 17:
                                            return m65522e0();
                                        case 18:
                                            return m65513bz();
                                        case 19:
                                            return m65567qm();
                                        case 20:
                                            return m65573ss();
                                        case 21:
                                            return m65559kp();
                                        case 22:
                                            return m65527gi();
                                        case 23:
                                            return m65574sv();
                                        case 24:
                                            return m65575t6();
                                        case 25:
                                            return m65603xw();
                                        case 26:
                                            return m65587vj();
                                        case 27:
                                        default:
                                            return 9;
                                        case 28:
                                            return m65590wp();
                                        case 29:
                                            return m65572s7();
                                        case 30:
                                            return m65524f9();
                                        case 31:
                                            return m65582um();
                                        case 32:
                                            this.f46622ne = true;
                                            this.f46619ks = this.f46634x6;
                                            break;
                                    }
                                }
                            } else if (m65557kk()) {
                                this.f46636yj++;
                            } else {
                                m65554k4(true, false, false);
                            }
                        } else if (this.f46617k4.mo66168c5() || m65516ca() == 0) {
                            if (m65529h4(false)) {
                                continue;
                            } else {
                                if (this.f46619ks == 0) {
                                    return 19;
                                }
                                m65541k4(this.f46636yj, "Incomplete DTD content.");
                            }
                        }
                    } else if (c != '\t') {
                        if (c != '\n') {
                            if (z && !this.f46622ne && this.f46619ks != 32) {
                                m65595x1(i2, "'{0}' is an unexpected token. Expecting white space.", m65576to(i2));
                            }
                            this.f46615ix = this.f46636yj;
                            while (true) {
                                switch (this.f46619ks) {
                                    case 0:
                                        return m65531ix();
                                    case 1:
                                        return m65581u4();
                                    case 2:
                                        return m65584uz();
                                    case 3:
                                        return m65589wl();
                                    case 4:
                                        return m65568qq();
                                    case 5:
                                        return m65509ar();
                                    case 6:
                                        return m65512bv();
                                    case 7:
                                        return m65585v4();
                                    case 8:
                                        return m65561lr();
                                    case 9:
                                        return m65605yd();
                                    case 10:
                                        return m65510b3();
                                    case 11:
                                        return m65591wy();
                                    case 12:
                                        return m65508ak();
                                    case 13:
                                        return m65518dq();
                                    case 14:
                                        return m65602xk();
                                    case 15:
                                        return m65515c6();
                                    case 16:
                                        return m65580ts();
                                    case 17:
                                        return m65522e0();
                                    case 18:
                                        return m65513bz();
                                    case 19:
                                        return m65567qm();
                                    case 20:
                                        return m65573ss();
                                    case 21:
                                        return m65559kp();
                                    case 22:
                                        return m65527gi();
                                    case 23:
                                        return m65574sv();
                                    case 24:
                                        return m65575t6();
                                    case 25:
                                        return m65603xw();
                                    case 26:
                                        return m65587vj();
                                    case 27:
                                    default:
                                        return 9;
                                    case 28:
                                        return m65590wp();
                                    case 29:
                                        return m65572s7();
                                    case 30:
                                        return m65524f9();
                                    case 31:
                                        return m65582um();
                                    case 32:
                                        this.f46622ne = true;
                                        this.f46619ks = this.f46634x6;
                                        break;
                                }
                            }
                        } else {
                            this.f46622ne = true;
                            i = i2 + 1;
                            this.f46636yj = i;
                            interfaceC14006wp = this.f46617k4;
                            interfaceC14006wp.mo66189x1(i);
                        }
                    }
                }
                this.f46622ne = true;
                this.f46636yj = i2 + 1;
            } else {
                this.f46622ne = true;
                if (cArr[i2 + 1] == '\n') {
                    if (m65564m9()) {
                        m65530he();
                        InterfaceC14006wp interfaceC14006wp2 = this.f46617k4;
                        interfaceC14006wp2.mo66178k4(interfaceC14006wp2.mo66173h4() + 1);
                    }
                    this.f46636yj += 2;
                } else if (i2 + 1 < this.f46628up || this.f46617k4.mo66168c5()) {
                    char[] cArr2 = this.f46613fa;
                    int i5 = this.f46636yj;
                    cArr2[i5] = '\n';
                    this.f46636yj = i5 + 1;
                } else if (this.f46617k4.mo66168c5() || m65516ca() == 0) {
                    if (m65529h4(false)) {
                        continue;
                    } else {
                        if (this.f46619ks == 0) {
                            return 19;
                        }
                        m65541k4(this.f46636yj, "Incomplete DTD content.");
                    }
                }
                interfaceC14006wp = this.f46617k4;
                i = this.f46636yj;
                interfaceC14006wp.mo66189x1(i);
            }
        }
    }

    /* JADX INFO: renamed from: kp */
    private int m65559kp() {
        char[] cArr = this.f46613fa;
        int i = this.f46636yj;
        char c = cArr[i];
        if (c == '\"' || c == '\'') {
            m65535k4(1);
            this.f46619ks = 31;
            return 35;
        }
        if (c == 'P') {
            if (!m65588w6()) {
                m65541k4(this.f46636yj, "Expecting external ID, '[' or '>'.");
            }
            this.f46624rv = 22;
            this.f46619ks = 29;
            return 33;
        }
        if (c != 'S') {
            m65541k4(i, "Expecting an external identifier or an entity value.");
            return 9;
        }
        if (!m65566os()) {
            m65541k4(this.f46636yj, "Expecting external ID, '[' or '>'.");
        }
        this.f46624rv = 22;
        this.f46619ks = 28;
        return 34;
    }

    /* JADX INFO: renamed from: ks */
    private void m65560ks() {
        C13226tw c13226tw;
        if (m65555kk(true) != 24) {
            m65562m2();
        }
        C13890ei c13890eiM65519du = m65519du(false);
        if (this.f46625to.m61887ks().containsKey(c13890eiM65519du.m65289x1())) {
            if (this.f46608c5) {
                m65538k4(this.f46636yj - c13890eiM65519du.m65289x1().length(), 0, "The notation '{0}' has already been declared.", c13890eiM65519du.m65289x1());
            }
            c13226tw = null;
        } else {
            Dictionary<String, x1> dictionary = this.f46604ak;
            if (dictionary != null) {
                dictionary.removeItemByKey(c13890eiM65519du.m65289x1());
            }
            c13226tw = new C13226tw(c13890eiM65519du);
            this.f46625to.m61887ks().addItem(c13226tw.m61623k4().m65289x1(), c13226tw);
        }
        int iM65555kk = m65555kk(true);
        if (iM65555kk == 34 || iM65555kk == 33) {
            String[] strArr = {null};
            String[] strArr2 = {null};
            m65539k4(iM65555kk, 8, strArr, strArr2);
            String str = strArr[0];
            String str2 = strArr2[0];
            if (c13226tw != null) {
                c13226tw.m61624k4(str2);
                c13226tw.m61627x1(str);
            }
        } else {
            m65562m2();
        }
        if (m65555kk(false) != 29) {
            m65562m2();
        }
    }

    /* JADX INFO: renamed from: lr */
    private int m65561lr() {
        char[] cArr = this.f46613fa;
        int i = this.f46636yj;
        char c = cArr[i];
        if (c == '(') {
            this.f46636yj = i + 1;
            return 27;
        }
        if (c != '>') {
            m65569qw();
            this.f46619ks = 9;
            return 23;
        }
        this.f46636yj = i + 1;
        this.f46619ks = 0;
        return 29;
    }

    /* JADX INFO: renamed from: m2 */
    private void m65562m2() {
        m65541k4(this.f46636yj, "An internal error has occurred.");
    }

    /* JADX INFO: renamed from: m4 */
    private String m65563m4() {
        C14062gk c14062gkMo66184kk = this.f46617k4.mo66184kk();
        return c14062gkMo66184kk != null ? c14062gkMo66184kk.toString() : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: m9 */
    private boolean m65564m9() {
        return this.f46612dy;
    }

    /* JADX INFO: renamed from: ne */
    private void m65565ne() {
        int i = this.f46623qq;
        int iM65555kk = m65555kk(false);
        if (iM65555kk == 46) {
            if (m65555kk(false) != 31) {
                m65562m2();
                return;
            }
            if (this.f46608c5 && i != this.f46623qq) {
                m65538k4(this.f46636yj, 0, "The parameter entity replacement text must nest properly within markup declarations.", C14113y2.f47374k4);
            }
            if (m65555kk(false) != 18) {
                m65562m2();
                return;
            } else {
                if (!this.f46608c5 || i == this.f46623qq) {
                    return;
                }
                m65538k4(this.f46636yj, 0, "The parameter entity replacement text must nest properly within markup declarations.", C14113y2.f47374k4);
                return;
            }
        }
        if (iM65555kk != 47) {
            m65562m2();
            return;
        }
        if (m65555kk(false) != 31) {
            m65562m2();
            return;
        }
        if (this.f46608c5 && i != this.f46623qq) {
            m65538k4(this.f46636yj, 0, "The parameter entity replacement text must nest properly within markup declarations.", C14113y2.f47374k4);
        }
        if (this.f46608c5) {
            int[] iArr = this.f46610dq;
            if (iArr == null) {
                this.f46610dq = new int[2];
            } else if (iArr.length == this.f46630v4) {
                int[] iArr2 = new int[iArr.length * 2];
                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) iArr), 0, AbstractC14092to.m67208k4((Object) iArr2), 0, this.f46610dq.length);
                this.f46610dq = iArr2;
            }
            this.f46610dq[this.f46630v4] = i;
        }
        this.f46630v4++;
    }

    /* JADX INFO: renamed from: os */
    private boolean m65566os() {
        do {
            int i = this.f46628up;
            int i2 = this.f46636yj;
            if (i - i2 >= 6) {
                char[] cArr = this.f46613fa;
                if (cArr[i2 + 1] != 'Y' || cArr[i2 + 2] != 'S' || cArr[i2 + 3] != 'T' || cArr[i2 + 4] != 'E' || cArr[i2 + 5] != 'M') {
                    return false;
                }
                this.f46636yj = i2 + 6;
                return true;
            }
        } while (m65516ca() != 0);
        return false;
    }

    /* JADX INFO: renamed from: qm */
    private int m65567qm() {
        char[] cArr = this.f46613fa;
        int i = this.f46636yj;
        char c = cArr[i];
        if (c != '\"' && c != '\'') {
            m65556kk(i, "\"", "'");
            return 9;
        }
        m65535k4(0);
        this.f46619ks = 13;
        return 35;
    }

    /* JADX INFO: renamed from: qq */
    private int m65568qq() {
        char[] cArr = this.f46613fa;
        int i = this.f46636yj;
        char c = cArr[i];
        if (c == '>') {
            this.f46636yj = i + 1;
            this.f46619ks = 0;
            return 29;
        }
        if (c == 'P') {
            if (!m65588w6()) {
                m65541k4(this.f46636yj, "Expecting external ID, '[' or '>'.");
            }
            this.f46624rv = 5;
            this.f46619ks = 29;
            return 33;
        }
        if (c == 'S') {
            if (!m65566os()) {
                m65541k4(this.f46636yj, "Expecting external ID, '[' or '>'.");
            }
            this.f46624rv = 5;
            this.f46619ks = 28;
            return 34;
        }
        if (c != '[') {
            m65541k4(i, "Expecting external ID, '[' or '>'.");
            return 9;
        }
        this.f46636yj = i + 1;
        this.f46619ks = 0;
        return 31;
    }

    /* JADX INFO: renamed from: qw */
    private void m65569qw() {
        m65577to(m65528h4());
    }

    /* JADX INFO: renamed from: ri */
    private String m65570ri() {
        String string;
        if (this.f46607bv.m26807x1() == 0) {
            string = C14113y2.m67406k4(this.f46613fa, this.f46615ix, (this.f46636yj - r1) - 1);
        } else {
            string = this.f46607bv.toString();
        }
        return m65537k4(string);
    }

    /* JADX INFO: renamed from: rv */
    private void m65571rv() {
        m65530he();
        try {
            if (m65578to()) {
                this.f46617k4.mo66185kk(this.f46629uz);
                this.f46629uz.m26792k4("-->");
            } else {
                this.f46617k4.mo66185kk(null);
            }
        } catch (XmlException e) {
            if (!"Unexpected end of file while parsing {0} has occurred.".equals(e.getResString()) || this.f46623qq == 0) {
                throw e;
            }
            m65543k4(0, "The parameter entity replacement text must nest properly within markup declarations.", (String) null);
        }
        m65511bs();
    }

    /* JADX INFO: renamed from: s7 */
    private int m65572s7() {
        char[] cArr = this.f46613fa;
        int i = this.f46636yj;
        char c = cArr[i];
        if (c != '\"' && c != '\'') {
            m65556kk(i, "\"", "'");
        }
        m65535k4(2);
        this.f46619ks = 30;
        return 35;
    }

    /* JADX INFO: renamed from: ss */
    private int m65573ss() {
        char[] cArr = this.f46613fa;
        int i = this.f46636yj;
        if (cArr[i] != '%') {
            m65586vh();
            this.f46619ks = 21;
            return 24;
        }
        this.f46636yj = i + 1;
        this.f46624rv = 21;
        this.f46619ks = 1;
        return 38;
    }

    /* JADX INFO: renamed from: sv */
    private int m65574sv() {
        char[] cArr = this.f46613fa;
        int i = this.f46636yj;
        char c = cArr[i];
        if (c == 'P') {
            if (!m65588w6()) {
                m65541k4(this.f46636yj, "Expecting external ID, '[' or '>'.");
            }
            this.f46624rv = 31;
            this.f46619ks = 29;
            return 33;
        }
        if (c != 'S') {
            m65541k4(i, "Expecting a system identifier or a public identifier.");
            return 9;
        }
        if (!m65566os()) {
            m65541k4(this.f46636yj, "Expecting external ID, '[' or '>'.");
        }
        this.f46624rv = 31;
        this.f46619ks = 28;
        return 34;
    }

    /* JADX INFO: renamed from: t6 */
    private int m65575t6() {
        char[] cArr = this.f46613fa;
        int i = this.f46636yj;
        if (cArr[i] != 'I') {
            m65541k4(i, "Conditional sections must specify the keyword 'IGNORE' or 'INCLUDE'.");
        }
        this.f46636yj++;
        while (true) {
            int i2 = this.f46628up;
            int i3 = this.f46636yj;
            if (i2 - i3 >= 5) {
                char[] cArr2 = this.f46613fa;
                char c = cArr2[i3];
                if (c == 'G') {
                    if (cArr2[i3 + 1] != 'N' || cArr2[i3 + 2] != 'O' || cArr2[i3 + 3] != 'R' || cArr2[i3 + 4] != 'E' || this.f46611du.m66339to(cArr2[i3 + 5])) {
                        m65541k4(this.f46636yj - 1, "Conditional sections must specify the keyword 'IGNORE' or 'INCLUDE'.");
                        return 9;
                    }
                    this.f46624rv = 26;
                    this.f46619ks = 25;
                    this.f46636yj += 5;
                    return 46;
                }
                if (c != 'N') {
                    m65541k4(i3 - 1, "Conditional sections must specify the keyword 'IGNORE' or 'INCLUDE'.");
                    return 9;
                }
                if (i2 - i3 >= 6) {
                    if (cArr2[i3 + 1] != 'C' || cArr2[i3 + 2] != 'L' || cArr2[i3 + 3] != 'U' || cArr2[i3 + 4] != 'D' || cArr2[i3 + 5] != 'E' || this.f46611du.m66339to(cArr2[i3 + 6])) {
                        m65541k4(this.f46636yj - 1, "Conditional sections must specify the keyword 'IGNORE' or 'INCLUDE'.");
                        return 9;
                    }
                    this.f46624rv = 0;
                    this.f46619ks = 25;
                    this.f46636yj += 6;
                    return 47;
                }
                if (m65516ca() == 0) {
                    m65541k4(this.f46636yj, "Incomplete DTD content.");
                }
            } else if (m65516ca() == 0) {
                m65541k4(this.f46636yj, "Incomplete DTD content.");
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private String m65576to(int i) {
        if (!this.f46611du.m66342x1(this.f46613fa[i])) {
            return C14113y2.m67406k4(this.f46613fa, i, 1);
        }
        int i2 = i;
        while (this.f46611du.m66342x1(this.f46613fa[i2])) {
            i2++;
        }
        int i3 = i2 - i;
        return C14113y2.m67406k4(this.f46613fa, i, i3 > 0 ? i3 : 1);
    }

    /* JADX INFO: renamed from: tq */
    private boolean m65579tq() {
        int i = this.f46636yj;
        int i2 = this.f46615ix;
        int i3 = i - i2;
        this.f46636yj = i2;
        boolean z = m65516ca() != 0;
        int i4 = this.f46636yj;
        this.f46615ix = i4;
        this.f46636yj = i4 + i3;
        return z;
    }

    /* JADX INFO: renamed from: ts */
    private int m65580ts() {
        char[] cArr = this.f46613fa;
        int i = this.f46636yj;
        char c = cArr[i];
        if (c == ')') {
            this.f46636yj = i + 1;
            this.f46619ks = 18;
            return 28;
        }
        if (c != '|') {
            m65556kk(i, ")", "|");
            return 9;
        }
        this.f46636yj = i + 1;
        this.f46619ks = 1;
        this.f46624rv = 16;
        return 30;
    }

    /* JADX INFO: renamed from: u4 */
    private int m65581u4() {
        m65586vh();
        this.f46619ks = this.f46624rv;
        return 24;
    }

    /* JADX INFO: renamed from: um */
    private int m65582um() {
        char[] cArr = this.f46613fa;
        int i = this.f46636yj;
        if (cArr[i] != '>') {
            m65594x1(i, ">");
        }
        this.f46636yj++;
        this.f46619ks = 0;
        return 29;
    }

    /* JADX INFO: renamed from: up */
    private void m65583up() {
        C13123nh c13123nh;
        C13192rv c13192rvM61251x1;
        if (m65555kk(true) != 23) {
            m65562m2();
            return;
        }
        C13890ei c13890eiM65519du = m65519du(true);
        C13125nk[] c13125nkArr = {null};
        boolean zTryGetValue = this.f46625to.m61888m9().tryGetValue(c13890eiM65519du, c13125nkArr);
        C13125nk c13125nk = c13125nkArr[0];
        if (!zTryGetValue) {
            c13125nkArr[0] = c13125nk;
            boolean zTryGetValue2 = this.f46625to.m61871dy().tryGetValue(c13890eiM65519du, c13125nkArr);
            C13125nk c13125nk2 = c13125nkArr[0];
            if (zTryGetValue2) {
                this.f46625to.m61871dy().removeItemByKey(c13890eiM65519du);
            } else {
                c13125nk2 = new C13125nk(c13890eiM65519du, c13890eiM65519du.m65284k4());
            }
            c13125nk = c13125nk2;
            this.f46625to.m61888m9().addItem(c13890eiM65519du, c13125nk);
        } else if (this.f46608c5) {
            m65538k4(this.f46636yj - c13890eiM65519du.m65289x1().length(), 0, "The '{0}' element has already been declared.", m65523em());
        }
        c13125nk.m61438k4(!m65600x1());
        int iM65555kk = m65555kk(true);
        if (iM65555kk == 27) {
            int i = this.f46623qq;
            int iM65555kk2 = m65555kk(false);
            if (iM65555kk2 == 9) {
                c13123nh = new C13123nh(2);
                c13123nh.m61241du();
                c13123nh.m61244h4();
                m65548k4(c13123nh, i);
            } else {
                if (iM65555kk2 != 42) {
                    m65562m2();
                    return;
                }
                c13123nh = new C13123nh(3);
                c13123nh.m61241du();
                c13123nh.m61244h4();
                m65596x1(c13123nh, i);
            }
            c13192rvM61251x1 = c13123nh.m61251x1(true);
        } else if (iM65555kk == 44) {
            c13192rvM61251x1 = C13192rv.f44274to;
        } else {
            if (iM65555kk != 45) {
                m65562m2();
                return;
            }
            c13192rvM61251x1 = C13192rv.f44272k4;
        }
        c13125nk.m61269k4(c13192rvM61251x1);
        if (m65555kk(false) != 29) {
            m65594x1(this.f46636yj, ">");
        }
    }

    /* JADX INFO: renamed from: uz */
    private int m65584uz() {
        m65569qw();
        this.f46619ks = this.f46624rv;
        return 23;
    }

    /* JADX INFO: renamed from: v4 */
    private int m65585v4() {
        int i;
        if (this.f46613fa[this.f46636yj] == '#') {
            while (true) {
                int i2 = this.f46628up;
                i = this.f46636yj;
                if (i2 - i >= 7) {
                    break;
                }
                if (m65516ca() == 0) {
                    m65541k4(this.f46636yj, "Incomplete DTD content.");
                }
            }
            char[] cArr = this.f46613fa;
            if (cArr[i + 1] == 'P' && cArr[i + 2] == 'C' && cArr[i + 3] == 'D' && cArr[i + 4] == 'A' && cArr[i + 5] == 'T' && cArr[i + 6] == 'A') {
                this.f46636yj = i + 7;
                this.f46619ks = 11;
                return 42;
            }
            m65541k4(i + 1, "Expecting 'PCDATA'.");
        }
        this.f46619ks = 8;
        return 9;
    }

    /* JADX INFO: renamed from: vh */
    private void m65586vh() {
        m65577to(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0097, code lost:
    
        m65552k4(r10.f46613fa, r10.f46628up, r10.f46636yj);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
    
        return 9;
     */
    /* JADX INFO: renamed from: vj */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m65587vj() {
        int i;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f46611du.f47099k4;
            char[] cArr = this.f46613fa;
            int i3 = this.f46636yj;
            char c = cArr[i3];
            if (((bArr[c] & SignedBytes.MAX_POWER_OF_TWO) == 0 || c == ']') && c != '\t') {
                if (c == '\n') {
                    int i4 = i3 + 1;
                    this.f46636yj = i4;
                    this.f46617k4.mo66189x1(i4);
                } else if (c == '\r') {
                    if (cArr[i3 + 1] == '\n') {
                        this.f46636yj = i3 + 2;
                    } else if (i3 + 1 < this.f46628up || this.f46617k4.mo66168c5()) {
                        this.f46636yj++;
                    } else if (!this.f46617k4.mo66168c5() && m65516ca() != 0) {
                        this.f46615ix = this.f46636yj;
                    } else if (!m65529h4(false)) {
                        m65541k4(this.f46636yj, "There is an unclosed conditional section.");
                        this.f46615ix = this.f46636yj;
                    }
                    this.f46617k4.mo66189x1(this.f46636yj);
                } else if (c != '\"') {
                    if (c != '<') {
                        if (c != ']') {
                            if (c != '&' && c != '\'') {
                                if (i3 != this.f46628up) {
                                    if (!C14022y4.m66321k4((int) c)) {
                                        break;
                                    }
                                    int i5 = this.f46636yj;
                                    if (i5 + 1 != this.f46628up) {
                                        int i6 = i5 + 1;
                                        this.f46636yj = i6;
                                        if (!C14022y4.m66327x1((int) this.f46613fa[i6])) {
                                            break;
                                        }
                                        this.f46636yj++;
                                    } else if (!this.f46617k4.mo66168c5() && m65516ca() != 0) {
                                        this.f46615ix = this.f46636yj;
                                    } else if (!m65529h4(false)) {
                                        m65541k4(this.f46636yj, "There is an unclosed conditional section.");
                                        this.f46615ix = this.f46636yj;
                                    }
                                } else if (!this.f46617k4.mo66168c5() && m65516ca() != 0) {
                                    this.f46615ix = this.f46636yj;
                                } else if (!m65529h4(false)) {
                                    m65541k4(this.f46636yj, "There is an unclosed conditional section.");
                                    this.f46615ix = this.f46636yj;
                                }
                            }
                        } else if (this.f46628up - i3 < 3) {
                            if (!this.f46617k4.mo66168c5() && m65516ca() != 0) {
                                this.f46615ix = this.f46636yj;
                            } else if (!m65529h4(false)) {
                                m65541k4(this.f46636yj, "There is an unclosed conditional section.");
                                this.f46615ix = this.f46636yj;
                            }
                        } else if (cArr[i3 + 1] == ']' && cArr[i3 + 2] == '>') {
                            if (i2 <= 0) {
                                this.f46636yj = i3 + 3;
                                this.f46619ks = 0;
                                return 18;
                            }
                            i2--;
                            i = i3 + 3;
                            this.f46636yj = i;
                        }
                    } else if (this.f46628up - i3 < 3) {
                        if (!this.f46617k4.mo66168c5() && m65516ca() != 0) {
                            this.f46615ix = this.f46636yj;
                        } else if (!m65529h4(false)) {
                            m65541k4(this.f46636yj, "There is an unclosed conditional section.");
                            this.f46615ix = this.f46636yj;
                        }
                    } else if (cArr[i3 + 1] == '!' && cArr[i3 + 2] == '[') {
                        i2++;
                        i = i3 + 3;
                        this.f46636yj = i;
                    }
                }
            }
            i = i3 + 1;
            this.f46636yj = i;
        }
    }

    /* JADX INFO: renamed from: w6 */
    private boolean m65588w6() {
        do {
            int i = this.f46628up;
            int i2 = this.f46636yj;
            if (i - i2 >= 6) {
                char[] cArr = this.f46613fa;
                if (cArr[i2 + 1] != 'U' || cArr[i2 + 2] != 'B' || cArr[i2 + 3] != 'L' || cArr[i2 + 4] != 'I' || cArr[i2 + 5] != 'C') {
                    return false;
                }
                this.f46636yj = i2 + 6;
                return true;
            }
        } while (m65516ca() != 0);
        return false;
    }

    /* JADX INFO: renamed from: wl */
    private int m65589wl() {
        m65532j2();
        this.f46619ks = this.f46624rv;
        return 25;
    }

    /* JADX INFO: renamed from: wp */
    private int m65590wp() {
        char[] cArr = this.f46613fa;
        int i = this.f46636yj;
        char c = cArr[i];
        if (c != '\"' && c != '\'') {
            m65556kk(i, "\"", "'");
        }
        m65535k4(2);
        this.f46619ks = this.f46624rv;
        return 35;
    }

    /* JADX INFO: renamed from: wy */
    private int m65591wy() {
        char[] cArr = this.f46613fa;
        int i = this.f46636yj;
        char c = cArr[i];
        if (c == ')') {
            this.f46636yj = i + 1;
            this.f46619ks = 12;
            return 28;
        }
        if (c != '|') {
            m65556kk(i, ")", "|");
            return 9;
        }
        this.f46636yj = i + 1;
        this.f46624rv = 11;
        this.f46619ks = 2;
        return 30;
    }

    /* JADX INFO: renamed from: x1 */
    private C13116n3 m65592x1(C13890ei c13890ei, boolean z, boolean z2, boolean z3) {
        C13116n3 c13116n3;
        String str;
        int length;
        C13116n3[] c13116n3Arr = {null};
        C13322zd c13322zd = this.f46625to;
        if (z) {
            c13322zd.m61874jd().tryGetValue(c13890ei, c13116n3Arr);
            c13116n3 = c13116n3Arr[0];
        } else {
            c13322zd.m61868c5().tryGetValue(c13890ei, c13116n3Arr);
            c13116n3 = c13116n3Arr[0];
        }
        if (c13116n3 != null) {
            if (!c13116n3.m61216ne().m65287kk()) {
                m65595x1((this.f46636yj - c13890ei.m65289x1().length()) - 1, "Reference to unparsed entity '{0}'.", c13890ei.m65289x1());
            }
            if (z3 && c13116n3.m61218rv()) {
                m65595x1((this.f46636yj - c13890ei.m65289x1().length()) - 1, "External entity '{0}' reference cannot appear in the attribute value.", c13890ei.m65289x1());
            }
            return c13116n3;
        }
        if (z) {
            if (this.f46608c5) {
                length = (this.f46636yj - c13890ei.m65289x1().length()) - 1;
                str = "Reference to undeclared parameter entity '{0}'.";
                m65538k4(length, 0, str, c13890ei.m65289x1());
            }
        } else if (z2) {
            str = "Reference to undeclared entity '{0}'.";
            if (m65600x1()) {
                m65595x1((this.f46636yj - c13890ei.m65289x1().length()) - 1, "Reference to undeclared entity '{0}'.", c13890ei.m65289x1());
            } else if (this.f46608c5) {
                length = (this.f46636yj - c13890ei.m65289x1().length()) - 1;
                m65538k4(length, 0, str, c13890ei.m65289x1());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x6 */
    private void m65601x6() {
        m65530he();
        if (m65578to()) {
            this.f46617k4.mo66190x1(this.f46629uz);
            this.f46629uz.m26792k4("?>");
        } else {
            this.f46617k4.mo66190x1((C6765kp) null);
        }
        m65511bs();
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0002 A[SYNTHETIC] */
    /* JADX INFO: renamed from: xk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m65602xk() {
        while (true) {
            char[] cArr = this.f46613fa;
            int i = this.f46636yj;
            char c = cArr[i];
            if (c == '(') {
                this.f46636yj = i + 1;
                this.f46619ks = 3;
                this.f46624rv = 17;
                return 27;
            }
            if (c != 'C') {
                if (c != 'E') {
                    if (c != 'I') {
                        if (c == 'N') {
                            if (this.f46628up - i >= 8 || this.f46617k4.mo66168c5()) {
                                char[] cArr2 = this.f46613fa;
                                i = this.f46636yj;
                                char c2 = cArr2[i + 1];
                                if (c2 == 'M') {
                                    if (cArr2[i + 2] != 'T' || cArr2[i + 3] != 'O' || cArr2[i + 4] != 'K' || cArr2[i + 5] != 'E' || cArr2[i + 6] != 'N') {
                                        m65541k4(i, "'{0}' is an invalid attribute type.");
                                    }
                                    this.f46619ks = 18;
                                    char[] cArr3 = this.f46613fa;
                                    int i2 = this.f46636yj;
                                    if (cArr3[i2 + 7] == 'S') {
                                        this.f46636yj = i2 + 8;
                                        return 7;
                                    }
                                    this.f46636yj = i2 + 7;
                                    return 6;
                                }
                                if (c2 == 'O') {
                                    if (cArr2[i + 2] != 'T' || cArr2[i + 3] != 'A' || cArr2[i + 4] != 'T' || cArr2[i + 5] != 'I' || cArr2[i + 6] != 'O' || cArr2[i + 7] != 'N') {
                                        m65541k4(i, "'{0}' is an invalid attribute type.");
                                    }
                                    this.f46636yj += 8;
                                    this.f46619ks = 15;
                                    return 8;
                                }
                            } else if (m65516ca() == 0) {
                                m65541k4(this.f46636yj, "Incomplete DTD content.");
                            }
                        }
                        m65541k4(i, "'{0}' is an invalid attribute type.");
                        if (m65516ca() != 0) {
                            m65541k4(this.f46636yj, "Incomplete DTD content.");
                        }
                    } else {
                        if (this.f46628up - i >= 6) {
                            this.f46619ks = 18;
                            if (cArr[i + 1] != 'D') {
                                m65541k4(i, "'{0}' is an invalid attribute type.");
                            }
                            char[] cArr4 = this.f46613fa;
                            int i3 = this.f46636yj;
                            if (cArr4[i3 + 2] != 'R') {
                                this.f46636yj = i3 + 2;
                                return 1;
                            }
                            if (cArr4[i3 + 3] != 'E' || cArr4[i3 + 4] != 'F') {
                                m65541k4(i3, "'{0}' is an invalid attribute type.");
                            }
                            char[] cArr5 = this.f46613fa;
                            int i4 = this.f46636yj;
                            if (cArr5[i4 + 5] != 'S') {
                                this.f46636yj = i4 + 5;
                                return 2;
                            }
                            this.f46636yj = i4 + 6;
                            return 3;
                        }
                        if (m65516ca() == 0) {
                            m65541k4(this.f46636yj, "Incomplete DTD content.");
                        }
                    }
                } else if (this.f46628up - i >= 9) {
                    this.f46619ks = 18;
                    if (cArr[i + 1] != 'N' || cArr[i + 2] != 'T' || cArr[i + 3] != 'I' || cArr[i + 4] != 'T') {
                        m65541k4(i, "'{0}' is an invalid attribute type.");
                    }
                    char[] cArr6 = this.f46613fa;
                    i = this.f46636yj;
                    char c3 = cArr6[i + 5];
                    if (c3 == 'I') {
                        if (cArr6[i + 6] != 'E' || cArr6[i + 7] != 'S') {
                            m65541k4(i, "'{0}' is an invalid attribute type.");
                        }
                        this.f46636yj += 8;
                        return 5;
                    }
                    if (c3 == 'Y') {
                        this.f46636yj = i + 6;
                        return 4;
                    }
                    m65541k4(i, "'{0}' is an invalid attribute type.");
                    if (m65516ca() != 0) {
                    }
                } else if (m65516ca() == 0) {
                    m65541k4(this.f46636yj, "Incomplete DTD content.");
                }
            } else {
                if (this.f46628up - i >= 5) {
                    if (cArr[i + 1] != 'D' || cArr[i + 2] != 'A' || cArr[i + 3] != 'T' || cArr[i + 4] != 'A') {
                        m65541k4(i, "Invalid attribute type.");
                    }
                    this.f46636yj += 5;
                    this.f46619ks = 18;
                    return 0;
                }
                if (m65516ca() == 0) {
                    m65541k4(this.f46636yj, "Incomplete DTD content.");
                }
            }
        }
    }

    /* JADX INFO: renamed from: xw */
    private int m65603xw() {
        char[] cArr = this.f46613fa;
        int i = this.f46636yj;
        if (cArr[i] != '[') {
            m65594x1(i, "[");
        }
        this.f46636yj++;
        this.f46619ks = this.f46624rv;
        return 31;
    }

    /* JADX INFO: renamed from: y2 */
    private int m65604y2() {
        return this.f46636yj - this.f46617k4.mo66171dy();
    }

    /* JADX INFO: renamed from: yd */
    private int m65605yd() {
        int i;
        this.f46619ks = 10;
        char[] cArr = this.f46613fa;
        int i2 = this.f46636yj;
        char c = cArr[i2];
        if (c == '*') {
            i = 39;
        } else if (c == '+') {
            i = 41;
        } else {
            if (c != '?') {
                return 9;
            }
            i = 40;
        }
        if (this.f46622ne) {
            m65541k4(i2, "White space not allowed before '?', '*', or '+'.");
        }
        this.f46636yj++;
        return i;
    }

    /* JADX INFO: renamed from: yj */
    private void m65606yj() {
        C13116n3 c13116n3;
        boolean z;
        int iM65555kk = m65555kk(true);
        if (iM65555kk == 24) {
            C13890ei c13890eiM65519du = m65519du(false);
            c13116n3 = new C13116n3(c13890eiM65519du, false);
            c13116n3.m61199du(m65563m4());
            c13116n3.m61204h4(this.f46632wy.length() == 0 ? this.f46606b3 : this.f46632wy);
            if (!this.f46625to.m61868c5().containsKey(c13890eiM65519du)) {
                this.f46625to.m61868c5().addItem(c13890eiM65519du, c13116n3);
            }
            c13116n3.m61227x1(!m65600x1());
            c13116n3.m61212kk(true);
            z = false;
        } else {
            if (iM65555kk != 38) {
                m65562m2();
                return;
            }
            if (m65555kk(true) != 24) {
                m65562m2();
                return;
            }
            C13890ei c13890eiM65519du2 = m65519du(false);
            c13116n3 = new C13116n3(c13890eiM65519du2, true);
            c13116n3.m61199du(m65563m4());
            c13116n3.m61204h4(this.f46632wy.length() == 0 ? this.f46606b3 : this.f46632wy);
            if (!this.f46625to.m61874jd().containsKey(c13890eiM65519du2)) {
                this.f46625to.m61874jd().addItem(c13890eiM65519du2, c13116n3);
            }
            c13116n3.m61227x1(!m65600x1());
            c13116n3.m61212kk(true);
            z = true;
        }
        int iM65555kk2 = m65555kk(true);
        switch (iM65555kk2) {
            case 33:
            case 34:
                String[] strArr = {null};
                String[] strArr2 = {null};
                m65539k4(iM65555kk2, 13, strArr, strArr2);
                String str = strArr[0];
                String str2 = strArr2[0];
                c13116n3.m61210k4(true);
                c13116n3.m61226x1(str2);
                c13116n3.m61211kk(str);
                if (m65555kk(false) == 37) {
                    if (z) {
                        m65594x1(this.f46636yj - 5, ">");
                    }
                    if (!this.f46622ne) {
                        m65595x1(this.f46636yj - 5, "'{0}' is an unexpected token. Expecting white space.", "NDATA");
                    }
                    if (m65555kk(true) != 24) {
                        m65562m2();
                        return;
                    }
                    c13116n3.m61209k4(m65519du(false));
                    String strM65289x1 = c13116n3.m61216ne().m65289x1();
                    if (!this.f46625to.m61887ks().containsKey(strM65289x1)) {
                        m65597x1(strM65289x1);
                    }
                }
                break;
            case 35:
                c13116n3.m61219to(m65507ai());
                c13116n3.m61208k4(this.f46620lr.f47047k4);
                c13116n3.m61225x1(this.f46620lr.f47048x1);
                break;
            default:
                m65562m2();
                return;
        }
        if (m65555kk(false) == 29) {
            c13116n3.m61212kk(false);
        } else {
            m65562m2();
        }
    }

    /* JADX INFO: renamed from: zj */
    private String m65607zj() {
        return m65523em();
    }

    /* JADX INFO: renamed from: du */
    private boolean m65520du() {
        int i = this.f46619ks;
        if (i != 0) {
            return i == 32 && this.f46634x6 == 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: h4 */
    private boolean m65529h4(boolean z) {
        int i;
        m65530he();
        InterfaceC13960qm[] interfaceC13960qmArr = {null};
        int[] iArr = {this.f46623qq};
        boolean zMo66183k4 = this.f46617k4.mo66183k4(interfaceC13960qmArr, iArr);
        InterfaceC13960qm interfaceC13960qm = interfaceC13960qmArr[0];
        this.f46623qq = iArr[0];
        if (!zMo66183k4) {
            return false;
        }
        m65511bs();
        if (interfaceC13960qm == null) {
            if (this.f46619ks == 32) {
                this.f46619ks = this.f46634x6;
            }
            return false;
        }
        if (interfaceC13960qm.mo61228x1()) {
            this.f46631wl--;
        }
        if (!z && (i = this.f46619ks) != 32) {
            this.f46634x6 = i;
            this.f46619ks = 32;
        }
        return true;
    }

    /* JADX INFO: renamed from: kk */
    private void m65556kk(int i, String str, String str2) {
        String strM65576to = m65576to(i);
        if (str2 != null) {
            m65544k4(this.f46636yj, "'{0}' is an unexpected token. The expected token is '{1}' or '{2}'.", new String[]{strM65576to, str, str2});
        } else {
            m65544k4(this.f46636yj, "'{0}' is an unexpected token. The expected token is '{1}'.", new String[]{strM65576to, str});
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r8.f46636yj = r2 + 1;
     */
    /* JADX INFO: renamed from: to */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m65577to(boolean z) {
        this.f46615ix = this.f46636yj;
        while (true) {
            byte[] bArr = this.f46611du.f47099k4;
            char[] cArr = this.f46613fa;
            int i = this.f46636yj;
            char c = cArr[i];
            if ((bArr[c] & 4) == 0 && c != ':') {
                int i2 = i + 1;
                int i3 = this.f46628up;
                if (i2 < i3) {
                    m65544k4(i, "Name cannot begin with the '{0}' character, hexadecimal value {1}.", XmlException.buildCharExceptionArgs(cArr, i3, i));
                    break;
                } else if (!m65579tq()) {
                    m65595x1(this.f46636yj, "Unexpected end of file while parsing {0} has occurred.", "Name");
                    break;
                }
            } else {
                break;
            }
        }
        int i4 = -1;
        while (true) {
            byte[] bArr2 = this.f46611du.f47099k4;
            char[] cArr2 = this.f46613fa;
            int i5 = this.f46636yj;
            char c2 = cArr2[i5];
            if ((bArr2[c2] & 8) == 0) {
                if (c2 == ':') {
                    if (z) {
                        if (i4 != -1) {
                            m65544k4(i5, "The '{0}' character, hexadecimal value {1}, cannot be included in a name.", XmlException.buildCharExceptionArgs(':', (char) 0));
                        }
                        int i6 = this.f46636yj;
                        int i7 = i6 - this.f46615ix;
                        this.f46636yj = i6 + 1;
                        i4 = i7;
                    }
                } else {
                    if (i5 != this.f46628up) {
                        break;
                    }
                    if (!m65579tq()) {
                        int i8 = this.f46615ix;
                        int i9 = this.f46636yj;
                        if (i8 == i9) {
                            m65595x1(i9, "Unexpected end of file while parsing {0} has occurred.", "Name");
                        }
                    }
                }
            }
            this.f46636yj = i5 + 1;
        }
        this.f46626u4 = i4 != -1 ? this.f46615ix + i4 : -1;
    }

    /* JADX INFO: renamed from: x1 */
    private void m65593x1(int i) {
        int iMo66173h4;
        int iMo66173h42;
        if (m65578to() && (iMo66173h42 = i - (iMo66173h4 = this.f46617k4.mo66173h4())) > 0) {
            this.f46629uz.m26799k4(this.f46613fa, iMo66173h4, iMo66173h42);
        }
        this.f46617k4.mo66178k4(this.f46636yj);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13978sv
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC13899g8 mo65608k4(InterfaceC14006wp interfaceC14006wp, boolean z) {
        m65549k4(interfaceC14006wp);
        m65551k4(z);
        return this.f46625to;
    }

    /* JADX INFO: renamed from: kk */
    private boolean m65557kk() {
        return this.f46619ks == 26;
    }

    /* JADX INFO: renamed from: to */
    private boolean m65578to() {
        return this.f46617k4.mo66174jd() == 0 && this.f46629uz != null;
    }

    /* JADX INFO: renamed from: x1 */
    private void m65594x1(int i, String str) {
        m65556kk(i, str, null);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13978sv
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC13899g8 mo65609k4(String str, String str2, String str3, String str4, String str5, InterfaceC14006wp interfaceC14006wp) {
        m65598x1(str, str2, str3, str4, str5, interfaceC14006wp);
        m65551k4(false);
        return this.f46625to;
    }

    /* JADX INFO: renamed from: k4 */
    public static InterfaceC13978sv m65536k4() {
        return new C13931lr();
    }

    /* JADX INFO: renamed from: kk */
    private boolean m65558kk(int i) {
        return i >= 0 && i <= 8;
    }

    /* JADX INFO: renamed from: x1 */
    private void m65595x1(int i, String str, String str2) {
        this.f46636yj = i;
        C14062gk c14062gkMo66184kk = this.f46617k4.mo66184kk();
        this.f46617k4.mo66179k4(new XmlException(str, str2, m65534jw(), m65604y2(), c14062gkMo66184kk == null ? null : c14062gkMo66184kk.toString()));
    }

    /* JADX INFO: renamed from: k4 */
    public static String m65537k4(String str) {
        int length = str.length();
        if (length <= 0) {
            return C14113y2.f47374k4;
        }
        int i = 0;
        while (str.charAt(i) == ' ') {
            i++;
            if (i == length) {
                return " ";
            }
        }
        C6765kp c6765kp = null;
        int i2 = i;
        while (i < length) {
            if (str.charAt(i) == ' ') {
                int i3 = i + 1;
                int i4 = i3;
                while (i4 < length && str.charAt(i4) == ' ') {
                    i4++;
                }
                if (i4 == length) {
                    int i5 = i - i2;
                    if (c6765kp == null) {
                        return C14113y2.m67443x1(str, i2, i5);
                    }
                    c6765kp.m26793k4(str, i2, i5);
                    return c6765kp.toString();
                }
                if (i4 > i3) {
                    if (c6765kp == null) {
                        c6765kp = new C6765kp(length);
                    }
                    c6765kp.m26793k4(str, i2, (i - i2) + 1);
                    i = i4 - 1;
                    i2 = i4;
                }
            }
            i++;
        }
        if (c6765kp == null) {
            return i2 == 0 ? str : C14113y2.m67443x1(str, i2, length - i2);
        }
        if (i > i2) {
            c6765kp.m26793k4(str, i2, i - i2);
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    private void m65596x1(C13123nh c13123nh, int i) {
        int i2 = this.f46623qq;
        int i3 = -1;
        boolean z = false;
        while (true) {
            int iM65555kk = m65555kk(false);
            if (iM65555kk == 28) {
                break;
            }
            if (iM65555kk == 30) {
                if (z) {
                    c13123nh.m61242dy();
                } else {
                    z = true;
                }
                if (this.f46608c5 && i2 < (i3 = this.f46623qq)) {
                    m65538k4(this.f46636yj, 0, "The parameter entity replacement text must nest properly within markup declarations.", C14113y2.f47374k4);
                }
                if (m65555kk(false) == 23) {
                    C13890ei c13890eiM65519du = m65519du(true);
                    if (c13123nh.m61249k4(c13890eiM65519du) && this.f46608c5) {
                        m65543k4(0, "The '{0}' element already exists in the content model.", c13890eiM65519du.toString());
                    }
                    c13123nh.m61247k4(c13890eiM65519du, (Object) null);
                    if (this.f46608c5 && (i2 = this.f46623qq) < i3) {
                        m65538k4(this.f46636yj, 0, "The parameter entity replacement text must nest properly within markup declarations.", C14113y2.f47374k4);
                    }
                }
            }
            m65562m2();
        }
        c13123nh.m61250m9();
        if (this.f46608c5 && this.f46623qq != i) {
            m65538k4(this.f46636yj, 0, "The parameter entity replacement text must nest properly within markup declarations.", C14113y2.f47374k4);
        }
        if (m65555kk(false) == 39 && z) {
            c13123nh.m61245jd();
        } else if (z) {
            m65594x1(this.f46636yj, C18358t1.g.f56183c);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m65538k4(int i, int i2, String str, String str2) {
        m65540k4(i2, new XmlSchemaException(str, str2, m65563m4(), m65534jw(), (i - this.f46636yj) + m65604y2()));
    }

    /* JADX INFO: renamed from: x1 */
    private void m65597x1(String str) {
        if (this.f46604ak == null) {
            this.f46604ak = new Dictionary<>();
        }
        x1 x1Var = new x1(str, m65534jw(), m65604y2() - str.length());
        x1[] x1VarArr = {null};
        boolean zTryGetValue = this.f46604ak.tryGetValue(str, x1VarArr);
        x1 x1Var2 = x1VarArr[0];
        if (!zTryGetValue) {
            this.f46604ak.addItem(str, x1Var);
        } else {
            x1Var.f46641to = x1Var2.f46641to;
            x1Var2.f46641to = x1Var;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m65539k4(int i, int i2, String[] strArr, String[] strArr2) {
        C14000vh c14000vh = new C14000vh(m65534jw(), m65604y2() - 6);
        strArr[0] = null;
        strArr2[0] = null;
        if (m65555kk(true) != 35) {
            m65556kk(this.f46636yj, "\"", "'");
        }
        if (i == 34) {
            String strM65507ai = m65507ai();
            strArr2[0] = strM65507ai;
            if (C14113y2.m67429to(strM65507ai, '#') >= 0) {
                int length = (this.f46636yj - strArr2[0].length()) - 1;
                String str = strArr2[0];
                m65544k4(length, "Fragment identifier '{0}' cannot be part of the system identifier '{1}'.", new String[]{C14113y2.m67422kk(str, C14113y2.m67429to(str, '#')), strArr2[0]});
            }
            if (i2 != 36 || this.f46605ar) {
                return;
            }
            this.f46620lr.f47048x1++;
            this.f46617k4.mo66180k4(strArr2[0], c14000vh.Clone(), this.f46620lr.Clone());
            return;
        }
        String strM65507ai2 = m65507ai();
        strArr[0] = strM65507ai2;
        int iM66338to = this.f46611du.m66338to(strM65507ai2);
        if (iM66338to >= 0) {
            m65542k4(((this.f46636yj - 1) - strArr[0].length()) + iM66338to, strArr[0], iM66338to);
        }
        if (i2 != 36 || this.f46605ar) {
            if (m65555kk(false) != 35) {
                if (i2 != 8) {
                    m65556kk(this.f46636yj, "\"", "'");
                    return;
                }
                return;
            } else {
                if (!this.f46622ne) {
                    String strM67389k4 = C14113y2.m67389k4(this.f46635yd, 1);
                    C14000vh c14000vh2 = this.f46620lr;
                    m65550k4("'{0}' is an unexpected token. Expecting white space.", strM67389k4, c14000vh2.f47047k4, c14000vh2.f47048x1);
                }
                strArr2[0] = m65507ai();
                return;
            }
        }
        this.f46620lr.f47048x1++;
        this.f46617k4.mo66191x1(strArr[0], c14000vh.Clone(), this.f46620lr.Clone());
        if (m65555kk(false) != 35) {
            m65556kk(this.f46636yj, "\"", "'");
            return;
        }
        if (!this.f46622ne) {
            String strM67389k42 = C14113y2.m67389k4(this.f46635yd, 1);
            C14000vh c14000vh3 = this.f46620lr;
            m65550k4("'{0}' is an unexpected token. Expecting white space.", strM67389k42, c14000vh3.f47047k4, c14000vh3.f47048x1);
        }
        String strM65507ai3 = m65507ai();
        strArr2[0] = strM65507ai3;
        this.f46620lr.f47048x1++;
        this.f46617k4.mo66180k4(strM65507ai3, c14000vh.Clone(), this.f46620lr.Clone());
    }

    /* JADX INFO: renamed from: x1 */
    private void m65598x1(String str, String str2, String str3, String str4, String str5, InterfaceC14006wp interfaceC14006wp) {
        m65549k4(interfaceC14006wp);
        if (str2 == null || str2.length() == 0) {
            throw C13850af.m65077k4(str2, "docTypeName");
        }
        C13850af.m65109k4(str2);
        int iM67429to = C14113y2.m67429to(str2, ':');
        if (iM67429to == -1) {
            this.f46625to.m61883k4(new C13890ei(this.f46618kk.mo65266k4(str2)));
        } else {
            this.f46625to.m61883k4(new C13890ei(this.f46618kk.mo65266k4(C14113y2.m67443x1(str2, 0, iM67429to)), this.f46618kk.mo65266k4(C14113y2.m67422kk(str2, iM67429to + 1))));
        }
        if (str4 != null && str4.length() > 0) {
            int iM66335kk = this.f46611du.m66335kk(str4);
            if (iM66335kk >= 0) {
                m65542k4(this.f46636yj, str4, iM66335kk);
            }
            this.f46614h4 = str4;
        }
        if (str3 != null && str3.length() > 0) {
            int iM66338to = this.f46611du.m66338to(str3);
            if (iM66338to >= 0) {
                m65542k4(this.f46636yj, str3, iM66338to);
            }
            this.f46621m9 = str3;
        }
        if (str5 != null && str5.length() > 0) {
            this.f46617k4.mo66192x1(str, str5);
            this.f46627um = true;
        }
        C14062gk c14062gkMo66184kk = this.f46617k4.mo66184kk();
        if (c14062gkMo66184kk != null) {
            this.f46606b3 = c14062gkMo66184kk.toString();
        }
        this.f46605ar = true;
    }

    /* JADX INFO: renamed from: k4 */
    private void m65540k4(int i, XmlSchemaException xmlSchemaException) {
        InterfaceC13972s7 interfaceC13972s7Mo65506x6 = this.f46633x1.mo65506x6();
        if (interfaceC13972s7Mo65506x6 != null) {
            interfaceC13972s7Mo65506x6.mo65063k4(xmlSchemaException, i);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m65599x1(boolean z) {
        m65511bs();
        this.f46619ks = 2;
        this.f46624rv = 4;
        if (m65555kk(false) != 23) {
            m65562m2();
        }
        this.f46625to.m61883k4(m65519du(true));
        int iM65555kk = m65555kk(false);
        if (iM65555kk == 34 || iM65555kk == 33) {
            String[] strArr = {this.f46621m9};
            String[] strArr2 = {this.f46614h4};
            m65539k4(iM65555kk, 36, strArr, strArr2);
            this.f46621m9 = strArr[0];
            this.f46614h4 = strArr2[0];
            iM65555kk = m65555kk(false);
        }
        if (iM65555kk != 29) {
            if (iM65555kk != 31) {
                m65562m2();
            } else {
                if (z) {
                    m65530he();
                    this.f46629uz = new C6765kp();
                }
                m65514c5();
            }
        }
        m65530he();
        String str = this.f46614h4;
        if (str == null || str.length() <= 0) {
            return;
        }
        m65533jd();
    }

    /* JADX INFO: renamed from: k4 */
    private void m65541k4(int i, String str) {
        m65595x1(i, str, C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m65600x1() {
        return this.f46631wl == 0;
    }

    /* JADX INFO: renamed from: k4 */
    private void m65542k4(int i, String str, int i2) {
        m65544k4(i, "'{0}', hexadecimal value {1}, is an invalid character.", XmlException.buildCharExceptionArgs(str, i2));
    }

    /* JADX INFO: renamed from: k4 */
    private void m65543k4(int i, String str, String str2) {
        m65540k4(i, new XmlSchemaException(str, str2, m65563m4(), m65534jw(), m65604y2()));
    }

    /* JADX INFO: renamed from: k4 */
    private void m65544k4(int i, String str, String[] strArr) {
        this.f46636yj = i;
        C14062gk c14062gkMo66184kk = this.f46617k4.mo66184kk();
        this.f46617k4.mo66179k4(new XmlException(str, strArr, m65534jw(), m65604y2(), c14062gkMo66184kk == null ? null : c14062gkMo66184kk.toString()));
    }

    /* JADX INFO: renamed from: k4 */
    private void m65545k4(C13061k5 c13061k5, C13125nk c13125nk, boolean z) {
        C13061k5 c13061k5M61283x1;
        int iM65555kk = m65555kk(true);
        if (iM65555kk != 0) {
            c13125nk.m61271kk(true);
        }
        if (m65558kk(iM65555kk)) {
            c13061k5.m61025du(iM65555kk);
            c13061k5.m61435k4((C12943dd) C12943dd.m60207kk(c13061k5.m61429b3().mo60020fa()));
            if (iM65555kk == 1) {
                if (this.f46608c5 && c13125nk.m61274m9() && (((c13061k5M61283x1 = c13125nk.m61283x1(c13061k5.m61443qq())) == null || c13061k5M61283x1.m61429b3().mo60016c5() != 1) && !z)) {
                    m65543k4(0, "The attribute of type ID is already declared on the '{0}' element.", c13125nk.m61443qq().toString());
                }
                c13125nk.m61285x1(true);
                return;
            }
            if (iM65555kk != 8) {
                return;
            }
            if (this.f46608c5) {
                if (!c13125nk.m61280up() || z) {
                    if (c13125nk.m61276rv() != null && c13125nk.m61276rv().m61460x1() == 1 && !z) {
                        m65538k4(this.f46636yj - 8, 0, "An attribute of type NOTATION must not be declared on an element declared EMPTY.", c13125nk.m61443qq().toString());
                    }
                    c13125nk.m61259h4(true);
                } else {
                    m65538k4(this.f46636yj - 8, 0, "No element type can have more than one NOTATION attribute specified.", c13125nk.m61443qq().toString());
                }
            }
            if (m65555kk(true) != 27) {
                m65562m2();
                return;
            }
            if (m65555kk(false) != 24) {
                m65562m2();
                return;
            }
            do {
                String strM65523em = m65523em();
                if (!this.f46625to.m61887ks().containsKey(strM65523em)) {
                    m65597x1(strM65523em);
                }
                if (this.f46608c5 && !this.f46609ck && c13061k5.m61447wy() != null && c13061k5.m61447wy().containsItem(strM65523em) && !z) {
                    m65540k4(0, new XmlSchemaException("'{0}' is a duplicate notation value.", strM65523em, m65563m4(), m65534jw(), m65604y2()));
                }
                c13061k5.m61439kk(strM65523em);
                int iM65555kk2 = m65555kk(false);
                if (iM65555kk2 == 28) {
                    return;
                }
                if (iM65555kk2 != 30) {
                    m65562m2();
                    return;
                }
            } while (m65555kk(false) == 24);
            m65562m2();
            return;
        }
        if (iM65555kk == 27) {
            c13061k5.m61025du(9);
            c13061k5.m61435k4((C12943dd) C12943dd.m60207kk(c13061k5.m61429b3().mo60020fa()));
            if (m65555kk(false) != 25) {
                m65562m2();
                return;
            }
            c13061k5.m61439kk(m65523em());
            while (true) {
                int iM65555kk3 = m65555kk(false);
                if (iM65555kk3 == 28) {
                    return;
                }
                if (iM65555kk3 != 30) {
                    m65562m2();
                    return;
                }
                if (m65555kk(false) != 25) {
                    m65562m2();
                    return;
                }
                String strM65607zj = m65607zj();
                if (this.f46608c5 && !this.f46609ck && c13061k5.m61447wy() != null && c13061k5.m61447wy().containsItem(strM65607zj) && !z) {
                    m65540k4(0, new XmlSchemaException("'{0}' is a duplicate enumeration value.", strM65607zj, m65563m4(), m65534jw(), m65604y2()));
                }
                c13061k5.m61439kk(strM65607zj);
            }
        } else {
            m65562m2();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m65546k4(C13061k5 c13061k5, boolean z) {
        int iM65555kk = m65555kk(true);
        if (iM65555kk != 35) {
            switch (iM65555kk) {
                case 20:
                    c13061k5.m61442m9(1);
                    return;
                case 21:
                    c13061k5.m61442m9(2);
                    return;
                case 22:
                    c13061k5.m61442m9(3);
                    if (m65555kk(true) != 35) {
                        m65562m2();
                        return;
                    }
                    break;
                default:
                    m65562m2();
                    return;
            }
        }
        if (this.f46608c5 && c13061k5.m61429b3().mo60016c5() == 1 && !z) {
            m65538k4(this.f46636yj, 0, "An attribute of type ID must have a declared default of either #IMPLIED or #REQUIRED.", C14113y2.f47374k4);
        }
        c13061k5.m61037k4(c13061k5.m61052x6() != 0 ? m65570ri() : m65507ai());
        c13061k5.m61045to(this.f46620lr.f47047k4);
        c13061k5.m61039kk(this.f46620lr.f47048x1 + 1);
        C13313yw.m61852k4(c13061k5, this.f46617k4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m65547k4(C13123nh c13123nh) {
        switch (m65555kk(false)) {
            case 39:
                c13123nh.m61245jd();
                break;
            case 40:
                c13123nh.m61243fa();
                break;
            case 41:
                c13123nh.m61240ck();
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m65548k4(C13123nh c13123nh, int i) {
        Stack stack = new Stack();
        k4 k4Var = new k4(i);
        while (true) {
            stack.push(k4Var);
            while (true) {
                int iM65555kk = m65555kk(false);
                if (iM65555kk == 23) {
                    c13123nh.m61247k4(m65519du(true), (Object) null);
                    m65547k4(c13123nh);
                    while (true) {
                        int iM65555kk2 = m65555kk(false);
                        if (iM65555kk2 != 43) {
                            switch (iM65555kk2) {
                                case 28:
                                    c13123nh.m61250m9();
                                    if (this.f46608c5 && this.f46623qq != k4Var.f46637k4) {
                                        m65538k4(this.f46636yj, 0, "The parameter entity replacement text must nest properly within markup declarations.", C14113y2.f47374k4);
                                    }
                                    m65547k4(c13123nh);
                                    stack.pop();
                                    if (stack.size() > 0) {
                                        k4Var = (k4) stack.peek();
                                    }
                                    break;
                                case 29:
                                    m65541k4(this.f46636yj, "Invalid content model.");
                                    stack.pop();
                                    if (stack.size() > 0) {
                                        k4Var = (k4) stack.peek();
                                    }
                                    break;
                                case 30:
                                    if (k4Var.f46638x1 == 43) {
                                        m65541k4(this.f46636yj, "Invalid content model.");
                                    }
                                    c13123nh.m61242dy();
                                    k4Var.f46638x1 = 30;
                                    break;
                                default:
                                    m65562m2();
                                    break;
                            }
                            return;
                        }
                        if (k4Var.f46638x1 == 30) {
                            m65541k4(this.f46636yj, "Invalid content model.");
                        }
                        c13123nh.m61239c5();
                        k4Var.f46638x1 = 43;
                    }
                } else {
                    if (iM65555kk != 27) {
                        if (iM65555kk != 29) {
                            m65562m2();
                            return;
                        }
                        m65541k4(this.f46636yj, "Invalid content model.");
                        stack.pop();
                        if (stack.size() > 0) {
                            m65562m2();
                            return;
                        }
                        return;
                    }
                    c13123nh.m61244h4();
                    k4Var = new k4(this.f46623qq);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m65549k4(InterfaceC14006wp interfaceC14006wp) {
        this.f46617k4 = interfaceC14006wp;
        this.f46633x1 = (InterfaceC13927kp) C7019kk.m27452k4((Object) interfaceC14006wp, InterfaceC13927kp.class);
        this.f46618kk = interfaceC14006wp.mo66177k4();
        InterfaceC13927kp interfaceC13927kp = (InterfaceC13927kp) C7019kk.m27452k4((Object) interfaceC14006wp, InterfaceC13927kp.class);
        if (interfaceC13927kp != null) {
            this.f46608c5 = interfaceC13927kp.mo65505rv();
        }
        InterfaceC13977ss interfaceC13977ss = (InterfaceC13977ss) C7019kk.m27452k4((Object) interfaceC14006wp, InterfaceC13977ss.class);
        if (interfaceC13977ss != null) {
            this.f46609ck = interfaceC13977ss.mo65891up();
            this.f46612dy = interfaceC13977ss.mo65892yj();
            this.f46616jd = interfaceC13977ss.mo65890ks();
        }
        C13322zd c13322zd = new C13322zd();
        this.f46625to = c13322zd;
        c13322zd.m61881k4(1);
        this.f46607bv = new C6765kp();
        C14062gk c14062gkMo66184kk = interfaceC14006wp.mo66184kk();
        if (c14062gkMo66184kk != null) {
            this.f46606b3 = c14062gkMo66184kk.toString();
        }
        this.f46605ar = false;
    }

    /* JADX INFO: renamed from: k4 */
    private void m65550k4(String str, String str2, int i, int i2) {
        C14062gk c14062gkMo66184kk = this.f46617k4.mo66184kk();
        this.f46617k4.mo66179k4(new XmlException(str, str2, i, i2, c14062gkMo66184kk == null ? null : c14062gkMo66184kk.toString()));
    }

    /* JADX INFO: renamed from: k4 */
    private void m65551k4(boolean z) {
        Dictionary<String, x1> dictionary;
        if (this.f46605ar) {
            m65521dy();
        } else {
            m65599x1(z);
        }
        this.f46625to.m61898x6();
        if (!this.f46608c5 || (dictionary = this.f46604ak) == null) {
            return;
        }
        Dictionary.ValueCollection.Enumerator<String, x1> it = dictionary.getValues().iterator();
        while (it.hasNext()) {
            try {
                x1 next = it.next();
                for (x1 x1Var = next; x1Var != null; x1Var = x1Var.f46641to) {
                    m65540k4(0, new XmlSchemaException("The '{0}' notation is not declared.", next.f46639k4, m65563m4(), next.f46642x1, next.f46640kk));
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m65552k4(char[] cArr, int i, int i2) {
        m65544k4(i2, "'{0}', hexadecimal value {1}, is an invalid character.", XmlException.buildCharExceptionArgs(cArr, i, i2));
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m65553k4(C13890ei c13890ei, boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        m65530he();
        if (z && m65600x1() && !m65520du()) {
            m65541k4((this.f46636yj - c13890ei.m65289x1().length()) - 1, "A parameter entity reference is not allowed in internal markup.");
        }
        C13116n3 c13116n3M65592x1 = m65592x1(c13890ei, z, true, z3);
        if (c13116n3M65592x1 == null) {
            return false;
        }
        if (c13116n3M65592x1.m61217qq()) {
            m65595x1((this.f46636yj - c13890ei.m65289x1().length()) - 1, z ? "Parameter entity '{0}' references itself." : "General entity '{0}' references itself.", c13890ei.m65289x1());
        }
        if (c13116n3M65592x1.mo61228x1()) {
            int[] iArr = {0};
            boolean zMo66181k4 = this.f46617k4.mo66181k4(c13116n3M65592x1, iArr);
            i = iArr[0];
            if (!zMo66181k4) {
                return false;
            }
            this.f46631wl++;
        } else {
            if (c13116n3M65592x1.m61205ix().length() == 0) {
                return false;
            }
            int[] iArr2 = {0};
            boolean zMo66181k42 = this.f46617k4.mo66181k4(c13116n3M65592x1, iArr2);
            i = iArr2[0];
            if (!zMo66181k42) {
                return false;
            }
        }
        this.f46623qq = i;
        if (z && !z2 && (i2 = this.f46619ks) != 32) {
            this.f46634x6 = i2;
            this.f46619ks = 32;
        }
        m65511bs();
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m65554k4(boolean z, boolean z2, boolean z3) {
        this.f46636yj++;
        return m65553k4(m65526g8(), z, z2, z3);
    }
}
