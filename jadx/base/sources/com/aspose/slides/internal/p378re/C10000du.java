package com.aspose.slides.internal.p378re;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ApplicationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.aspose.slides.p559ms.System.Xml.C13906gx;
import com.aspose.slides.p559ms.System.Xml.C13929li;
import com.aspose.slides.p559ms.System.Xml.C13938ms;
import com.aspose.slides.p559ms.System.Xml.C13940my;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.aspose.words.ControlChar;

/* JADX INFO: renamed from: com.aspose.slides.internal.re.du */
/* JADX INFO: loaded from: classes4.dex */
public class C10000du {

    /* JADX INFO: renamed from: du */
    private C10005x1 f36000du;

    /* JADX INFO: renamed from: k4 */
    public float f36001k4 = 0.0f;

    /* JADX INFO: renamed from: kk */
    private final C10001h4 f36002kk;

    /* JADX INFO: renamed from: to */
    private final C10002k4 f36003to;

    /* JADX INFO: renamed from: x1 */
    private final C10001h4 f36004x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.re.du$k4 */
    public static class k4 extends ApplicationException {
        public k4(C10003kk c10003kk) {
            super(c10003kk.toString());
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.re.du$x1 */
    public static class x1 {

        /* JADX INFO: renamed from: k4 */
        public final AbstractC13912i5 f36005k4;

        /* JADX INFO: renamed from: x1 */
        public boolean f36007x1 = false;

        /* JADX INFO: renamed from: kk */
        public boolean f36006kk = false;

        public x1(AbstractC13912i5 abstractC13912i5) {
            this.f36005k4 = abstractC13912i5;
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m49112k4() {
            boolean zMo65048u4;
            boolean zMo65026h4 = this.f36005k4.mo65026h4();
            this.f36007x1 = zMo65026h4;
            if (zMo65026h4) {
                int iMo65028jd = this.f36005k4.mo65028jd();
                if (iMo65028jd == 1) {
                    zMo65048u4 = this.f36005k4.mo65048u4();
                } else if (iMo65028jd == 15) {
                    zMo65048u4 = false;
                }
                this.f36006kk = zMo65048u4;
            }
            return this.f36007x1;
        }
    }

    public C10000du(C10001h4 c10001h4, C10001h4 c10001h42, C10002k4 c10002k4) {
        this.f36003to = c10002k4;
        this.f36004x1 = c10001h4;
        this.f36002kk = c10001h42;
    }

    /* JADX INFO: renamed from: du */
    private void m49089du(C10005x1 c10005x1, x1 x1Var, x1 x1Var2) {
        if (x1Var.f36006kk) {
            if (x1Var2.f36006kk) {
                return;
            }
            m49098k4(x1Var2, c10005x1);
        } else if (x1Var2.f36006kk) {
            m49098k4(x1Var, c10005x1);
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m49106kk(C10005x1 c10005x1, x1 x1Var, x1 x1Var2) {
        if (!C14113y2.m67363du(x1Var.f36005k4.mo65019ck(), x1Var2.f36005k4.mo65019ck())) {
            m49097k4(10, c10005x1);
            return;
        }
        C13940my[] c13940myArrM49105k4 = m49105k4(x1Var);
        C13940my[] c13940myArrM49105k42 = m49105k4(x1Var2);
        if (c13940myArrM49105k4.length != c13940myArrM49105k42.length) {
            m49097k4(11, c10005x1);
        }
        m49102k4(c10005x1, c13940myArrM49105k4, c13940myArrM49105k42);
    }

    /* JADX INFO: renamed from: to */
    private void m49107to(C10005x1 c10005x1, x1 x1Var, x1 x1Var2) {
        if (C14113y2.m67363du(x1Var.f36005k4.mo65042rv(), x1Var2.f36005k4.mo65042rv())) {
            return;
        }
        m49097k4(14, c10005x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final C10005x1 m49110k4() throws Throwable {
        AbstractC13912i5 abstractC13912i5M49090k4;
        if (this.f36000du == null) {
            this.f36000du = new C10005x1();
            AbstractC13912i5 abstractC13912i5M49090k42 = null;
            try {
                abstractC13912i5M49090k4 = m49090k4(this.f36004x1);
                try {
                    abstractC13912i5M49090k42 = m49090k4(this.f36002kk);
                    if (!this.f36004x1.equals(this.f36002kk)) {
                        m49101k4(this.f36000du, abstractC13912i5M49090k4, abstractC13912i5M49090k42);
                    }
                    if (abstractC13912i5M49090k42 != null) {
                        try {
                            abstractC13912i5M49090k42.mo65049um();
                        } finally {
                        }
                    }
                    if (abstractC13912i5M49090k4 != null) {
                        abstractC13912i5M49090k4.mo65049um();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (abstractC13912i5M49090k42 != null) {
                        try {
                            abstractC13912i5M49090k42.mo65049um();
                        } finally {
                        }
                    }
                    if (abstractC13912i5M49090k4 != null) {
                        abstractC13912i5M49090k4.mo65049um();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                abstractC13912i5M49090k4 = null;
            }
        }
        return this.f36000du;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m49111x1() {
        return this.f36003to.m49119k4();
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC13912i5 m49090k4(C10001h4 c10001h4) {
        AbstractC13912i5 abstractC13912i5M65469k4 = AbstractC13912i5.m65469k4(c10001h4.m49117k4(), new C13906gx());
        C13938ms c13938ms = (C13938ms) C7019kk.m27452k4((Object) abstractC13912i5M65469k4, C13938ms.class);
        if (c13938ms != null) {
            c13938ms.m65614h4(this.f36003to.m49120kk());
        }
        if (this.f36003to.m49122x1() && abstractC13912i5M65469k4.mo65029k4() != null) {
            abstractC13912i5M65469k4.mo65029k4().m65376h4(4);
        }
        return abstractC13912i5M65469k4;
    }

    /* JADX INFO: renamed from: x1 */
    private void m49108x1(C10005x1 c10005x1, x1 x1Var, x1 x1Var2) {
        int iMo65028jd = x1Var.f36005k4.mo65028jd();
        int iMo65028jd2 = x1Var2.f36005k4.mo65028jd();
        if (!C14042ak.m66412k4(C13929li.class, iMo65028jd, C13929li.class, iMo65028jd2)) {
            m49096k4(iMo65028jd, iMo65028jd2, c10005x1, x1Var, x1Var2);
        } else if (iMo65028jd == 1) {
            m49106kk(c10005x1, x1Var, x1Var2);
        } else if (iMo65028jd == 3) {
            m49107to(c10005x1, x1Var, x1Var2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C13940my m49091k4(C13940my[] c13940myArr, String str) {
        for (C13940my c13940my : c13940myArr) {
            if (C14113y2.m67363du(m49093k4((AbstractC13901ga) c13940my), str)) {
                return c13940my;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m49109x1(AbstractC13901ga abstractC13901ga) {
        String namespaceURI = abstractC13901ga.getNamespaceURI();
        return namespaceURI != null && namespaceURI.length() > 0;
    }

    /* JADX INFO: renamed from: k4 */
    private static C13940my m49092k4(C13940my[] c13940myArr, String str, String str2) {
        for (C13940my c13940my : c13940myArr) {
            if (C14113y2.m67363du(m49093k4((AbstractC13901ga) c13940my), str) && C14113y2.m67363du(c13940my.getNamespaceURI(), str2)) {
                return c13940my;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m49093k4(AbstractC13901ga abstractC13901ga) {
        return m49094k4(abstractC13901ga, m49109x1(abstractC13901ga));
    }

    /* JADX INFO: renamed from: k4 */
    private static String m49094k4(AbstractC13901ga abstractC13901ga, boolean z) {
        return z ? abstractC13901ga.getLocalName() : abstractC13901ga.getName();
    }

    /* JADX INFO: renamed from: k4 */
    private void m49095k4(int i, int i2, int i3, C10005x1 c10005x1) {
        m49099k4(new C10003kk(i, i2, i3), c10005x1);
    }

    /* JADX INFO: renamed from: k4 */
    private void m49096k4(int i, int i2, C10005x1 c10005x1, x1 x1Var, x1 x1Var2) {
        x1 x1Var3 = C14042ak.m66412k4(C13929li.class, (long) i, C13929li.class, 17L) ? x1Var : C14042ak.m66412k4(C13929li.class, (long) i2, C13929li.class, 17L) ? x1Var2 : null;
        if (x1Var3 == null) {
            m49095k4(17, i, i2, c10005x1);
            return;
        }
        m49095k4(22, i, i2, c10005x1);
        x1Var3.m49112k4();
        m49108x1(c10005x1, x1Var, x1Var2);
    }

    /* JADX INFO: renamed from: k4 */
    private void m49097k4(int i, C10005x1 c10005x1) {
        m49099k4(new C10003kk(i), c10005x1);
    }

    /* JADX INFO: renamed from: k4 */
    private void m49098k4(x1 x1Var, C10005x1 c10005x1) {
        if (x1Var.m49112k4() && x1Var.f36005k4.mo65028jd() == 15) {
            return;
        }
        m49097k4(19, c10005x1);
    }

    /* JADX INFO: renamed from: k4 */
    private void m49099k4(C10003kk c10003kk, C10005x1 c10005x1) {
        c10005x1.m49125k4(this, c10003kk);
        if (!m49103k4(c10003kk)) {
            throw new k4(c10003kk);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m49100k4(C10005x1 c10005x1, x1 x1Var, x1 x1Var2) {
        if (x1Var.f36007x1) {
            if (!x1Var2.f36007x1) {
                m49097k4(19, c10005x1);
            } else {
                m49108x1(c10005x1, x1Var, x1Var2);
                m49089du(c10005x1, x1Var, x1Var2);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m49101k4(C10005x1 c10005x1, AbstractC13912i5 abstractC13912i5, AbstractC13912i5 abstractC13912i52) {
        try {
            x1 x1Var = new x1(abstractC13912i5);
            x1 x1Var2 = new x1(abstractC13912i52);
            do {
                x1Var.m49112k4();
                x1Var2.m49112k4();
                m49100k4(c10005x1, x1Var, x1Var2);
                if (!x1Var.f36007x1) {
                    return;
                }
            } while (x1Var2.f36007x1);
        } catch (k4 unused) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m49102k4(C10005x1 c10005x1, C13940my[] c13940myArr, C13940my[] c13940myArr2) {
        float fM66907h4;
        List list = new List();
        list.addRange(AbstractC14092to.m67204k4((Object[]) c13940myArr2));
        int i = 0;
        while (i < c13940myArr.length) {
            boolean zM49109x1 = m49109x1(c13940myArr[i]);
            String strM49093k4 = m49093k4((AbstractC13901ga) c13940myArr[i]);
            C13940my c13940myM49091k4 = !zM49109x1 ? m49091k4(c13940myArr2, strM49093k4) : m49092k4(c13940myArr2, strM49093k4, c13940myArr[i].getNamespaceURI());
            if (c13940myM49091k4 != null) {
                list.removeItem(c13940myM49091k4);
                if (!this.f36003to.m49121to() && c13940myM49091k4 != c13940myArr2[i]) {
                    m49097k4(4, c10005x1);
                }
                if (!C14113y2.m67363du(c13940myArr[i].getValue(), c13940myM49091k4.getValue())) {
                    String value = c13940myArr[i].getValue();
                    String value2 = c13940myM49091k4.getValue();
                    if ("OriginX".equals(c13940myArr[i].getLocalName()) || "OriginY".equals(c13940myArr[i].getLocalName())) {
                        fM66907h4 = C14080ne.m66907h4(value);
                    } else if ("RenderTransform".equals(c13940myArr[i].getLocalName())) {
                        fM66907h4 = C14080ne.m66907h4(C14113y2.m67414k4(value, ',')[4]);
                        value2 = C14113y2.m67414k4(value2, ',')[4];
                    } else if ("Data".equals(c13940myArr[i].getLocalName())) {
                        String[] strArrM67414k4 = C14113y2.m67414k4(value, ControlChar.SPACE_CHAR);
                        String[] strArrM67414k42 = C14113y2.m67414k4(value2, ControlChar.SPACE_CHAR);
                        while (i < strArrM67414k4.length - 1) {
                            this.f36001k4 = C14116yg.m67481k4(this.f36001k4, C14116yg.m67480k4(C14080ne.m66907h4(C14113y2.m67431to(C14113y2.m67414k4(strArrM67414k4[0], ',')[0], 'M', 'L')) - C14080ne.m66907h4(C14113y2.m67431to(C14113y2.m67414k4(strArrM67414k42[0], ',')[0], 'M', 'L'))));
                            this.f36001k4 = C14116yg.m67481k4(this.f36001k4, C14116yg.m67480k4(C14080ne.m66907h4(C14113y2.m67414k4(strArrM67414k4[0], ',')[1]) - C14080ne.m66907h4(C14113y2.m67414k4(strArrM67414k42[0], ',')[1])));
                            i++;
                        }
                    } else {
                        m49097k4(3, c10005x1);
                    }
                    this.f36001k4 = C14116yg.m67481k4(this.f36001k4, C14116yg.m67480k4(fM66907h4 - C14080ne.m66907h4(value2)));
                }
            } else {
                m49097k4(2, c10005x1);
            }
            i++;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            m49097k4(2, c10005x1);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m49103k4(C10003kk c10003kk) {
        return !c10003kk.m49123k4();
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m49104k4(C13940my c13940my) {
        return "xmlns".equals(c13940my.getPrefix()) || "xmlns".equals(c13940my.getName());
    }

    /* JADX INFO: renamed from: k4 */
    private static C13940my[] m49105k4(x1 x1Var) {
        List list = new List();
        int iMo65041qq = x1Var.f36005k4.mo65041qq();
        if (iMo65041qq > 0) {
            XmlDocument xmlDocument = new XmlDocument();
            x1Var.f36005k4.mo65035kk();
            for (int i = 0; i < iMo65041qq; i++) {
                C13940my c13940myCreateAttribute = xmlDocument.createAttribute(x1Var.f36005k4.mo65019ck(), x1Var.f36005k4.mo65050up());
                if (!m49104k4(c13940myCreateAttribute)) {
                    c13940myCreateAttribute.setValue(x1Var.f36005k4.mo65042rv());
                    list.addItem(c13940myCreateAttribute);
                }
                x1Var.f36005k4.mo65047to();
            }
        }
        return (C13940my[]) list.toArray(new C13940my[0]);
    }
}
