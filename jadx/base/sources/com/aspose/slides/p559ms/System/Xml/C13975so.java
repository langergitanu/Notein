package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p532yu.InterfaceC13298y4;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.converter.tagsoup.HTMLWriter;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.so */
/* JADX INFO: loaded from: classes5.dex */
public class C13975so {

    /* JADX INFO: renamed from: c5 */
    private XmlDocument f46814c5;

    /* JADX INFO: renamed from: ck */
    private int f46815ck;

    /* JADX INFO: renamed from: du */
    private AbstractC13901ga f46816du;

    /* JADX INFO: renamed from: dy */
    private AbstractC13883dt f46817dy;

    /* JADX INFO: renamed from: fa */
    private int f46818fa;

    /* JADX INFO: renamed from: h4 */
    private int f46819h4;

    /* JADX INFO: renamed from: jd */
    private int f46820jd;

    /* JADX INFO: renamed from: kk */
    private AbstractC13901ga f46822kk;

    /* JADX INFO: renamed from: ks */
    private boolean f46823ks;

    /* JADX INFO: renamed from: m9 */
    private int f46824m9;

    /* JADX INFO: renamed from: rv */
    private boolean f46825rv;

    /* JADX INFO: renamed from: to */
    private AbstractC13901ga f46826to;

    /* JADX INFO: renamed from: up */
    private int f46827up;

    /* JADX INFO: renamed from: x6 */
    private boolean f46829x6;

    /* JADX INFO: renamed from: yj */
    private int f46830yj;

    /* JADX INFO: renamed from: k4 */
    public k4[] f46821k4 = {new k4(null, null), new k4(null, null), new k4(null, null)};

    /* JADX INFO: renamed from: x1 */
    public k4[] f46828x1 = {new k4(null, null), new k4(null, null)};

    /* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.so$k4 */
    public static class k4 extends AbstractC7020m9<k4> {

        /* JADX INFO: renamed from: k4 */
        public String f46831k4;

        /* JADX INFO: renamed from: x1 */
        public String f46832x1;

        public k4() {
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m65880x1(k4 k4Var) {
            return C14067j2.m66728k4(k4Var.f46831k4, this.f46831k4) && C14067j2.m66728k4(k4Var.f46832x1, this.f46832x1);
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
            if (obj instanceof k4) {
                return m65880x1((k4) obj);
            }
            return false;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public k4 Clone() {
            k4 k4Var = new k4();
            CloneTo(k4Var);
            return k4Var;
        }

        public k4(String str, String str2) {
            this.f46831k4 = str;
            this.f46832x1 = str2;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(k4 k4Var) {
            if (k4Var == null) {
                k4Var = new k4();
            }
            k4Var.f46831k4 = this.f46831k4;
            k4Var.f46832x1 = this.f46832x1;
        }
    }

    public C13975so(AbstractC13901ga abstractC13901ga) {
        this.f46822kk = abstractC13901ga;
        this.f46816du = abstractC13901ga;
        int nodeType = abstractC13901ga.getNodeType();
        if (nodeType == 2) {
            this.f46826to = null;
            this.f46819h4 = -1;
            this.f46825rv = true;
        } else {
            this.f46826to = abstractC13901ga;
            this.f46819h4 = -1;
            this.f46825rv = false;
        }
        this.f46814c5 = nodeType == 9 ? (XmlDocument) this.f46822kk : abstractC13901ga.getOwnerDocument();
        this.f46817dy = this.f46814c5.getNameTable();
        this.f46820jd = -1;
        this.f46815ck = -1;
        this.f46818fa = -1;
        this.f46829x6 = false;
        this.f46823ks = false;
    }

    /* JADX INFO: renamed from: qq */
    private boolean m65837qq() {
        int nodeType = this.f46822kk.getNodeType();
        return nodeType == 17 || nodeType == 10;
    }

    /* JADX INFO: renamed from: uz */
    private void m65838uz() {
        String version = this.f46814c5.getVersion();
        int i = 0;
        if (version != null && version.length() != 0) {
            k4 k4Var = this.f46821k4[0];
            k4Var.f46831k4 = "version";
            k4Var.f46832x1 = version;
            i = 1;
        }
        String encoding = this.f46814c5.getEncoding();
        if (encoding != null && encoding.length() != 0) {
            k4 k4Var2 = this.f46821k4[i];
            k4Var2.f46831k4 = "encoding";
            k4Var2.f46832x1 = encoding;
            i++;
        }
        String standalone = this.f46814c5.getStandalone();
        if (standalone != null && standalone.length() != 0) {
            k4 k4Var3 = this.f46821k4[i];
            k4Var3.f46831k4 = HTMLWriter.STANDALONE;
            k4Var3.f46832x1 = standalone;
            i++;
        }
        this.f46815ck = i;
    }

    /* JADX INFO: renamed from: wl */
    private void m65839wl() {
        C13957q6 documentType = this.f46814c5.getDocumentType();
        int i = 0;
        if (documentType == null) {
            this.f46818fa = 0;
            return;
        }
        String strM65794kk = documentType.m65794kk();
        if (strM65794kk != null) {
            k4 k4Var = this.f46828x1[0];
            k4Var.f46831k4 = "PUBLIC";
            k4Var.f46832x1 = strM65794kk;
            i = 1;
        }
        String strM65796to = documentType.m65796to();
        if (strM65796to != null) {
            k4 k4Var2 = this.f46828x1[i];
            k4Var2.f46831k4 = "SYSTEM";
            k4Var2.f46832x1 = strM65796to;
            i++;
        }
        this.f46818fa = i;
    }

    /* JADX INFO: renamed from: c5 */
    public final String m65840c5() {
        return this.f46822kk.getBaseURI();
    }

    /* JADX INFO: renamed from: ck */
    public final boolean m65841ck() {
        if (this.f46822kk.getNodeType() == 1) {
            return ((C13981tl) this.f46822kk).m65897c5();
        }
        return false;
    }

    /* JADX INFO: renamed from: du */
    public final String m65842du(String str) {
        C13940my c13940myM65914x1;
        AbstractC13883dt abstractC13883dt;
        String str2;
        if (this.f46825rv) {
            return null;
        }
        if ("xmlns".equals(str)) {
            abstractC13883dt = this.f46817dy;
            str2 = "http://www.w3.org/2000/xmlns/";
        } else {
            if (!"xml".equals(str)) {
                if (str == null) {
                    str = C14113y2.f47374k4;
                }
                String strM67408k4 = str.length() != 0 ? C14113y2.m67408k4("xmlns:", str) : "xmlns";
                AbstractC13901ga parentNode = this.f46822kk;
                while (parentNode != null) {
                    if (parentNode.getNodeType() == 1) {
                        C13981tl c13981tl = (C13981tl) parentNode;
                        if (c13981tl.m65904jd() && (c13940myM65914x1 = c13981tl.m65914x1(strM67408k4)) != null) {
                            return c13940myM65914x1.getValue();
                        }
                    } else if (parentNode.getNodeType() == 2) {
                        parentNode = ((C13940my) parentNode).m65623h4();
                    }
                    parentNode = parentNode.getParentNode();
                }
                if (str.length() == 0) {
                    return C14113y2.f47374k4;
                }
                return null;
            }
            abstractC13883dt = this.f46817dy;
            str2 = "http://www.w3.org/XML/1998/namespace";
        }
        return abstractC13883dt.mo65266k4(str2);
    }

    /* JADX INFO: renamed from: dy */
    public final String m65845dy() {
        String value;
        int nodeType = this.f46822kk.getNodeType();
        if (this.f46820jd != -1) {
            return (this.f46822kk.getNodeType() == 17 ? this.f46821k4[this.f46820jd] : this.f46828x1[this.f46820jd]).f46832x1;
        }
        if (nodeType == 10) {
            value = ((C13957q6) this.f46822kk).m65790du();
        } else if (nodeType == 17) {
            C6765kp c6765kp = new C6765kp(C14113y2.f47374k4);
            if (this.f46815ck == -1) {
                m65838uz();
            }
            for (int i = 0; i < this.f46815ck; i++) {
                k4 k4Var = this.f46821k4[i];
                c6765kp.m26792k4(C14113y2.m67408k4(k4Var.f46831k4, "=\"", k4Var.f46832x1, "\""));
                if (i != this.f46815ck - 1) {
                    c6765kp.m26792k4(" ");
                }
            }
            value = c6765kp.toString();
        } else {
            value = this.f46822kk.getValue();
        }
        return value == null ? C14113y2.f47374k4 : value;
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m65846fa() {
        if (this.f46822kk.getNodeType() == 2) {
            return !((C13940my) this.f46822kk).mo65622du();
        }
        return false;
    }

    /* JADX INFO: renamed from: h4 */
    public final IGenericDictionary<String, String> m65847h4(int i) {
        String strMo65266k4;
        Dictionary dictionary = new Dictionary();
        if (!this.f46825rv) {
            AbstractC13901ga parentNode = this.f46822kk;
            while (parentNode != null) {
                if (parentNode.getNodeType() == 1) {
                    C13981tl c13981tl = (C13981tl) parentNode;
                    if (c13981tl.m65904jd()) {
                        C13857b1 attributes = c13981tl.getAttributes();
                        for (int i2 = 0; i2 < attributes.m65634x1(); i2++) {
                            C13940my c13940myM65164k4 = attributes.m65164k4(i2);
                            if ("xmlns".equals(c13940myM65164k4.getLocalName()) && c13940myM65164k4.getPrefix().length() == 0) {
                                if (!dictionary.containsKey(C14113y2.f47374k4)) {
                                    strMo65266k4 = this.f46817dy.mo65266k4(C14113y2.f47374k4);
                                    dictionary.addItem(strMo65266k4, this.f46817dy.mo65266k4(c13940myM65164k4.getValue()));
                                }
                            } else if ("xmlns".equals(c13940myM65164k4.getPrefix())) {
                                String localName = c13940myM65164k4.getLocalName();
                                if (!dictionary.containsKey(localName)) {
                                    strMo65266k4 = this.f46817dy.mo65266k4(localName);
                                    dictionary.addItem(strMo65266k4, this.f46817dy.mo65266k4(c13940myM65164k4.getValue()));
                                }
                            }
                        }
                    }
                    if (i == 2) {
                        break;
                    }
                } else if (parentNode.getNodeType() == 2) {
                    parentNode = ((C13940my) parentNode).m65623h4();
                }
                parentNode = parentNode.getParentNode();
            }
            if (i != 2) {
                if (dictionary.containsKey(C14113y2.f47374k4) && C14113y2.m67363du((String) dictionary.get_Item(C14113y2.f47374k4), C14113y2.f47374k4)) {
                    dictionary.removeItemByKey(C14113y2.f47374k4);
                }
                if (i == 0) {
                    dictionary.addItem(this.f46817dy.mo65266k4("xml"), this.f46817dy.mo65266k4("http://www.w3.org/XML/1998/namespace"));
                }
            }
        }
        return dictionary;
    }

    /* JADX INFO: renamed from: ix */
    public final boolean m65850ix() {
        if (this.f46825rv) {
            return false;
        }
        int nodeType = this.f46822kk.getNodeType();
        if (nodeType == 2) {
            AbstractC13901ga abstractC13901ga = this.f46826to;
            if (abstractC13901ga != null) {
                this.f46822kk = abstractC13901ga;
                this.f46819h4 = -1;
                return true;
            }
        } else if ((nodeType == 10 || nodeType == 17) && this.f46820jd != -1) {
            this.f46820jd = -1;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: jd */
    public final int m65851jd() {
        return this.f46822kk.getXmlSpace();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m65852k4() {
        return this.f46820jd != -1 ? this.f46829x6 ? 3 : 2 : this.f46822kk.getNodeType();
    }

    /* JADX INFO: renamed from: kk */
    public final String m65861kk() {
        return this.f46820jd != -1 ? this.f46829x6 ? C14113y2.f47374k4 : this.f46822kk.getNodeType() == 17 ? this.f46821k4[this.f46820jd].f46831k4 : this.f46828x1[this.f46820jd].f46831k4 : m65836m9(this.f46822kk.getNodeType()) ? C14113y2.f47374k4 : this.f46822kk.getName();
    }

    /* JADX INFO: renamed from: ks */
    public final int m65865ks() {
        if (this.f46825rv) {
            return 0;
        }
        int nodeType = this.f46822kk.getNodeType();
        if (nodeType == 1) {
            return ((C13981tl) this.f46822kk).getAttributes().m65634x1();
        }
        if (nodeType == 2 || !(!this.f46829x6 || nodeType == 17 || nodeType == 10)) {
            return this.f46826to.getAttributes().m65634x1();
        }
        if (nodeType == 17) {
            int i = this.f46815ck;
            if (i != -1) {
                return i;
            }
            m65838uz();
            return this.f46815ck;
        }
        if (nodeType != 10) {
            return 0;
        }
        int i2 = this.f46818fa;
        if (i2 != -1) {
            return i2;
        }
        m65839wl();
        return this.f46818fa;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m65866m9() {
        return (this.f46820jd == -1 && this.f46822kk.getValue() == null && this.f46822kk.getNodeType() != 10) ? false : true;
    }

    /* JADX INFO: renamed from: ne */
    public final boolean m65867ne() {
        return m65834k4(this.f46822kk.getNodeType() != 2 ? this.f46822kk : this.f46826to);
    }

    /* JADX INFO: renamed from: rv */
    public final boolean m65868rv() {
        AbstractC13901ga parentNode = this.f46822kk.getParentNode();
        if (parentNode == null) {
            return false;
        }
        this.f46822kk = parentNode;
        if (this.f46829x6) {
            return true;
        }
        this.f46819h4 = 0;
        return true;
    }

    /* JADX INFO: renamed from: to */
    public final String m65869to() {
        return this.f46820jd != -1 ? m65861kk() : m65836m9(this.f46822kk.getNodeType()) ? C14113y2.f47374k4 : this.f46822kk.getLocalName();
    }

    /* JADX INFO: renamed from: u4 */
    public final XmlDocument m65872u4() {
        return this.f46814c5;
    }

    /* JADX INFO: renamed from: up */
    public final InterfaceC13298y4 m65873up() {
        return this.f46822kk.getSchemaInfo();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m65874x1(String str) {
        if (this.f46818fa == -1) {
            m65839wl();
        }
        for (int i = 0; i < this.f46818fa; i++) {
            if (C14113y2.m67363du(this.f46828x1[i].f46831k4, str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: x6 */
    public final boolean m65878x6() {
        AbstractC13901ga firstChild = this.f46822kk.getFirstChild();
        if (firstChild == null) {
            return false;
        }
        this.f46822kk = firstChild;
        if (this.f46829x6) {
            return true;
        }
        this.f46819h4 = -1;
        return true;
    }

    /* JADX INFO: renamed from: yj */
    public final AbstractC13883dt m65879yj() {
        return this.f46817dy;
    }

    /* JADX INFO: renamed from: dy */
    private void m65832dy(int i) {
        if (i < 0 || i >= m65865ks()) {
            throw new ArgumentOutOfRangeException("attributeIndex");
        }
    }

    /* JADX INFO: renamed from: m9 */
    private boolean m65836m9(int i) {
        return (i == 1 || i == 2 || i == 5 || i == 6 || i == 7 || i == 10 || i == 12 || i == 17) ? false : true;
    }

    /* JADX INFO: renamed from: du */
    public final void m65843du(int i) {
        if (this.f46825rv) {
            return;
        }
        int nodeType = this.f46822kk.getNodeType();
        if (nodeType == 1) {
            m65832dy(i);
            C13940my c13940myM65164k4 = ((C13981tl) this.f46822kk).getAttributes().m65164k4(i);
            if (c13940myM65164k4 != null) {
                this.f46826to = this.f46822kk;
                this.f46822kk = c13940myM65164k4;
                this.f46819h4 = i;
                return;
            }
            return;
        }
        if (nodeType != 2) {
            if (nodeType == 10 || nodeType == 17) {
                m65832dy(i);
                this.f46820jd = i;
                return;
            }
            return;
        }
        m65832dy(i);
        C13940my c13940myM65164k42 = ((C13981tl) this.f46826to).getAttributes().m65164k4(i);
        if (c13940myM65164k42 != null) {
            this.f46822kk = c13940myM65164k42;
            this.f46819h4 = i;
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final String m65848h4() {
        return this.f46822kk.getPrefix();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m65853k4(String str) {
        if (this.f46815ck == -1) {
            m65838uz();
        }
        for (int i = 0; i < this.f46815ck; i++) {
            if (C14113y2.m67363du(this.f46821k4[i].f46831k4, str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: kk */
    public final String m65862kk(int i) {
        if (this.f46825rv) {
            return null;
        }
        int nodeType = this.f46822kk.getNodeType();
        if (nodeType == 1) {
            m65832dy(i);
            return ((C13981tl) this.f46822kk).getAttributes().m65164k4(i).getValue();
        }
        if (nodeType == 2) {
            m65832dy(i);
            return ((C13981tl) this.f46826to).getAttributes().m65164k4(i).getValue();
        }
        if (nodeType == 10) {
            m65832dy(i);
            return m65876x1(i);
        }
        if (nodeType != 17) {
            throw new ArgumentOutOfRangeException("attributeIndex");
        }
        m65832dy(i);
        return m65854k4(i);
    }

    /* JADX INFO: renamed from: to */
    public final void m65870to(int i) {
        this.f46816du = this.f46822kk;
        this.f46827up = i;
        this.f46830yj = this.f46820jd;
        this.f46824m9 = this.f46819h4;
        this.f46823ks = this.f46829x6;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m65875x1() {
        return this.f46822kk.getNamespaceURI();
    }

    /* JADX INFO: renamed from: du */
    public final boolean m65844du() {
        return this.f46825rv;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m65849h4(String str) {
        if (!this.f46825rv && str != null) {
            if ("http://www.w3.org/2000/xmlns/".equals(str)) {
                return this.f46817dy.mo65266k4("xmlns");
            }
            if ("http://www.w3.org/XML/1998/namespace".equals(str)) {
                return this.f46817dy.mo65266k4("xml");
            }
            if (C14113y2.m67363du(str, C14113y2.f47374k4)) {
                return C14113y2.f47374k4;
            }
            AbstractC13901ga parentNode = this.f46822kk;
            while (parentNode != null) {
                if (parentNode.getNodeType() == 1) {
                    C13981tl c13981tl = (C13981tl) parentNode;
                    if (c13981tl.m65904jd()) {
                        C13857b1 attributes = c13981tl.getAttributes();
                        for (int i = 0; i < attributes.m65634x1(); i++) {
                            C13940my c13940myM65164k4 = attributes.m65164k4(i);
                            if (C14113y2.m67363du(c13940myM65164k4.getValue(), str)) {
                                if (c13940myM65164k4.getPrefix().length() == 0 && "xmlns".equals(c13940myM65164k4.getLocalName())) {
                                    if (C14113y2.m67363du(m65842du(C14113y2.f47374k4), str)) {
                                        return C14113y2.f47374k4;
                                    }
                                } else if ("xmlns".equals(c13940myM65164k4.getPrefix())) {
                                    String localName = c13940myM65164k4.getLocalName();
                                    if (C14113y2.m67363du(m65842du(localName), str)) {
                                        return this.f46817dy.mo65266k4(localName);
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                } else if (parentNode.getNodeType() == 2) {
                    parentNode = ((C13940my) parentNode).m65623h4();
                }
                parentNode = parentNode.getParentNode();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m65854k4(int i) {
        if (this.f46815ck == -1) {
            m65838uz();
        }
        return this.f46821k4[i].f46832x1;
    }

    /* JADX INFO: renamed from: kk */
    public final String m65863kk(String str) {
        if (this.f46825rv) {
            return null;
        }
        int nodeType = this.f46822kk.getNodeType();
        if (nodeType == 1) {
            return m65833k4((C13981tl) this.f46822kk, str);
        }
        if (nodeType == 2) {
            return m65833k4((C13981tl) this.f46826to, str);
        }
        if (nodeType == 10) {
            return m65855k4((C13957q6) this.f46822kk, str);
        }
        if (nodeType != 17) {
            return null;
        }
        return m65856k4((C13976sq) this.f46822kk, str);
    }

    /* JADX INFO: renamed from: to */
    public final boolean m65871to(String str) {
        return m65859k4(str, C14113y2.f47374k4);
    }

    /* JADX INFO: renamed from: x1 */
    public final String m65876x1(int i) {
        if (this.f46818fa == -1) {
            m65839wl();
        }
        return this.f46828x1[i].f46832x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m65855k4(C13957q6 c13957q6, String str) {
        if ("PUBLIC".equals(str)) {
            return c13957q6.m65794kk();
        }
        if ("SYSTEM".equals(str)) {
            return c13957q6.m65796to();
        }
        return null;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m65864kk(int[] iArr) {
        int i;
        if (this.f46825rv) {
            return false;
        }
        int nodeType = this.f46822kk.getNodeType();
        if (nodeType == 2) {
            if (this.f46819h4 >= this.f46826to.getAttributes().m65634x1() - 1) {
                return false;
            }
            C13857b1 attributes = this.f46826to.getAttributes();
            int i2 = this.f46819h4 + 1;
            this.f46819h4 = i2;
            this.f46822kk = attributes.m65164k4(i2);
            return true;
        }
        if (nodeType != 1) {
            if (nodeType == 17) {
                if (this.f46815ck == -1) {
                    m65838uz();
                }
                i = this.f46820jd;
                int i3 = i + 1;
                this.f46820jd = i3;
                if (i3 < this.f46815ck) {
                    if (i3 == 0) {
                        iArr[0] = iArr[0] + 1;
                    }
                    this.f46829x6 = false;
                    return true;
                }
            } else if (nodeType == 10) {
                if (this.f46818fa == -1) {
                    m65839wl();
                }
                i = this.f46820jd;
                int i4 = i + 1;
                this.f46820jd = i4;
                if (i4 < this.f46818fa) {
                    if (i4 == 0) {
                        iArr[0] = iArr[0] + 1;
                    }
                    this.f46829x6 = false;
                    return true;
                }
            }
            this.f46820jd = i;
        } else if (this.f46822kk.getAttributes().m65634x1() > 0) {
            iArr[0] = iArr[0] + 1;
            AbstractC13901ga abstractC13901ga = this.f46822kk;
            this.f46826to = abstractC13901ga;
            this.f46822kk = abstractC13901ga.getAttributes().m65164k4(0);
            this.f46819h4 = 0;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m65877x1(int[] iArr) {
        if (!this.f46825rv && this.f46829x6) {
            if (!m65837qq()) {
                while (this.f46822kk.getNodeType() != 2) {
                    AbstractC13901ga parentNode = this.f46822kk.getParentNode();
                    this.f46822kk = parentNode;
                    if (parentNode == null) {
                        break;
                    } else {
                        iArr[0] = iArr[0] - 1;
                    }
                }
            } else {
                iArr[0] = iArr[0] - 2;
            }
            this.f46829x6 = false;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final String m65856k4(C13976sq c13976sq, String str) {
        if ("version".equals(str)) {
            return c13976sq.m65884k4();
        }
        if ("encoding".equals(str)) {
            return c13976sq.m65888x1();
        }
        if (HTMLWriter.STANDALONE.equals(str)) {
            return c13976sq.m65886kk();
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private String m65833k4(C13981tl c13981tl, String str) {
        C13940my c13940myM65914x1 = c13981tl.m65914x1(str);
        if (c13940myM65914x1 != null) {
            return c13940myM65914x1.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65857k4(int[] iArr) {
        this.f46822kk = this.f46816du;
        iArr[0] = this.f46827up;
        this.f46820jd = this.f46830yj;
        this.f46819h4 = this.f46824m9;
        this.f46829x6 = this.f46823ks;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65858k4(int[] iArr, int[] iArr2) {
        m65870to(iArr[0]);
        if (this.f46825rv) {
            return;
        }
        int i = this.f46820jd;
        if (i != -1) {
            if (this.f46829x6) {
                iArr[0] = iArr[0] - 1;
                this.f46829x6 = false;
            }
            this.f46830yj = i;
            iArr[0] = iArr[0] - 1;
            this.f46820jd = -1;
            iArr2[0] = this.f46822kk.getNodeType();
            return;
        }
        if (this.f46829x6 && this.f46822kk.getNodeType() != 2) {
            m65877x1(iArr);
        }
        if (this.f46822kk.getNodeType() == 2) {
            this.f46822kk = ((C13940my) this.f46822kk).m65623h4();
            this.f46819h4 = -1;
            iArr[0] = iArr[0] - 1;
            iArr2[0] = 1;
        }
        if (this.f46822kk.getNodeType() == 1) {
            this.f46826to = this.f46822kk;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m65834k4(AbstractC13901ga abstractC13901ga) {
        AbstractC13901ga nextSibling = abstractC13901ga.getNextSibling();
        if (nextSibling == null) {
            return false;
        }
        this.f46822kk = nextSibling;
        if (this.f46829x6) {
            return true;
        }
        this.f46819h4 = -1;
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m65835k4(C13981tl c13981tl, String str, String str2) {
        C13940my c13940myM65914x1 = str2.length() == 0 ? c13981tl.m65914x1(str) : c13981tl.m65903h4(str, str2);
        if (c13940myM65914x1 != null) {
            this.f46829x6 = false;
            this.f46826to = c13981tl;
            this.f46822kk = c13940myM65914x1;
            int iM65161k4 = c13981tl.getAttributes().m65161k4(c13940myM65914x1);
            this.f46819h4 = iM65161k4;
            if (iM65161k4 != -1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m65859k4(String str, String str2) {
        AbstractC13901ga abstractC13901ga;
        if (this.f46825rv) {
            return false;
        }
        int nodeType = this.f46822kk.getNodeType();
        if (nodeType == 1) {
            abstractC13901ga = this.f46822kk;
        } else {
            if (nodeType != 2) {
                if (nodeType == 17 && str2.length() == 0) {
                    int iM65853k4 = m65853k4(str);
                    this.f46820jd = iM65853k4;
                    if (iM65853k4 != -1) {
                        this.f46829x6 = false;
                        return true;
                    }
                } else if (nodeType == 10 && str2.length() == 0) {
                    int iM65874x1 = m65874x1(str);
                    this.f46820jd = iM65874x1;
                    if (iM65874x1 != -1) {
                        this.f46829x6 = false;
                        return true;
                    }
                }
                return false;
            }
            abstractC13901ga = this.f46826to;
        }
        return m65835k4((C13981tl) abstractC13901ga, str, str2);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m65860k4(int[] iArr, boolean[] zArr, int[] iArr2) {
        AbstractC13901ga parentNode;
        if (this.f46820jd != -1) {
            if (this.f46829x6) {
                return false;
            }
            this.f46829x6 = true;
            iArr[0] = iArr[0] + 1;
            iArr2[0] = 3;
            return true;
        }
        if (this.f46822kk.getNodeType() == 2) {
            AbstractC13901ga firstChild = this.f46822kk.getFirstChild();
            if (firstChild != null) {
                this.f46822kk = firstChild;
                iArr2[0] = firstChild.getNodeType();
                iArr[0] = iArr[0] + 1;
                this.f46829x6 = true;
                return true;
            }
        } else if (this.f46829x6) {
            if (this.f46822kk.getNodeType() == 5 && zArr[0]) {
                AbstractC13901ga firstChild2 = this.f46822kk.getFirstChild();
                this.f46822kk = firstChild2;
                iArr2[0] = firstChild2.getNodeType();
                iArr[0] = iArr[0] + 1;
                zArr[0] = false;
                return true;
            }
            AbstractC13901ga nextSibling = this.f46822kk.getNextSibling();
            if (nextSibling == null && (parentNode = this.f46822kk.getParentNode()) != null && parentNode.getNodeType() == 5) {
                this.f46822kk = parentNode;
                iArr2[0] = 16;
                iArr[0] = iArr[0] - 1;
                return true;
            }
            if (nextSibling != null) {
                this.f46822kk = nextSibling;
                iArr2[0] = nextSibling.getNodeType();
                return true;
            }
        }
        return false;
    }
}
