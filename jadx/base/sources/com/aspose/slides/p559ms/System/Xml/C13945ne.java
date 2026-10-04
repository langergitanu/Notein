package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p418tf.AbstractC10925du;
import com.aspose.slides.internal.p418tf.AbstractC10929m9;
import com.aspose.slides.internal.p532yu.InterfaceC13298y4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.ne */
/* JADX INFO: loaded from: classes5.dex */
public final class C13945ne extends AbstractC10925du implements InterfaceC13903gi {

    /* JADX INFO: renamed from: du */
    private XmlDocument f46667du;

    /* JADX INFO: renamed from: dy */
    private C13981tl f46668dy;

    /* JADX INFO: renamed from: h4 */
    private AbstractC13901ga f46669h4;

    /* JADX INFO: renamed from: m9 */
    private int f46670m9;

    public C13945ne(XmlDocument xmlDocument, AbstractC13901ga abstractC13901ga) {
        this.f46667du = xmlDocument;
        m65700k4(abstractC13901ga);
    }

    /* JADX INFO: renamed from: b3 */
    private void m65676b3() {
        AbstractC13901ga abstractC13901gaM65677c5 = this.f46669h4;
        while (true) {
            abstractC13901gaM65677c5 = m65677c5(abstractC13901gaM65677c5);
            if (abstractC13901gaM65677c5 == null) {
                return;
            } else {
                m65700k4(abstractC13901gaM65677c5);
            }
        }
    }

    /* JADX INFO: renamed from: c5 */
    private AbstractC13901ga m65677c5(AbstractC13901ga abstractC13901ga) {
        AbstractC13901ga previousText = abstractC13901ga.getPreviousText();
        return !this.f46667du.hasEntityReferences() ? previousText : m65690kk(abstractC13901ga, previousText);
    }

    /* JADX INFO: renamed from: du */
    private AbstractC13901ga m65678du(AbstractC13901ga abstractC13901ga) {
        while (abstractC13901ga != null && abstractC13901ga.getNodeType() == 5) {
            abstractC13901ga = abstractC13901ga.getParentNode();
        }
        return abstractC13901ga;
    }

    /* JADX INFO: renamed from: dy */
    private AbstractC13901ga m65680dy(AbstractC13901ga abstractC13901ga) {
        AbstractC13901ga nextSibling = abstractC13901ga.getNextSibling();
        return !this.f46667du.hasEntityReferences() ? nextSibling : m65696x1(abstractC13901ga, nextSibling);
    }

    /* JADX INFO: renamed from: h4 */
    private AbstractC13901ga m65681h4(AbstractC13901ga abstractC13901ga) {
        AbstractC13901ga firstChild = abstractC13901ga.getFirstChild();
        return !this.f46667du.hasEntityReferences() ? firstChild : m65692m9(firstChild);
    }

    /* JADX INFO: renamed from: jd */
    private AbstractC13901ga m65682jd(AbstractC13901ga abstractC13901ga) {
        while (true) {
            AbstractC13901ga abstractC13901gaM65680dy = m65680dy(abstractC13901ga);
            if (abstractC13901gaM65680dy == null || !abstractC13901gaM65680dy.isText()) {
                break;
            }
            abstractC13901ga = abstractC13901gaM65680dy;
        }
        return abstractC13901ga;
    }

    /* JADX INFO: renamed from: k4 */
    private int m65683k4(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        if (abstractC13901ga.getXPNodeType() != 2) {
            if (abstractC13901ga2.getXPNodeType() == 2) {
                return 1;
            }
            do {
                abstractC13901ga = abstractC13901ga.getNextSibling();
                if (abstractC13901ga == null) {
                    break;
                }
            } while (abstractC13901ga != abstractC13901ga2);
            return abstractC13901ga == null ? 1 : 0;
        }
        if (abstractC13901ga2.getXPNodeType() != 2) {
            return 0;
        }
        C13981tl c13981tlM65623h4 = ((C13940my) abstractC13901ga).m65623h4();
        if (!c13981tlM65623h4.m65904jd()) {
            return 3;
        }
        C13857b1 attributes = c13981tlM65623h4.getAttributes();
        for (int i = 0; i < attributes.m65634x1(); i++) {
            C13940my c13940myM65164k4 = attributes.m65164k4(i);
            if (c13940myM65164k4 == abstractC13901ga) {
                return 0;
            }
            if (c13940myM65164k4 == abstractC13901ga2) {
                return 1;
            }
        }
        return 3;
    }

    /* JADX INFO: renamed from: lr */
    private String m65691lr() {
        C13981tl documentElement = this.f46667du.getDocumentElement();
        return documentElement != null ? documentElement.getInnerText() : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: m9 */
    private AbstractC13901ga m65692m9(AbstractC13901ga abstractC13901ga) {
        while (abstractC13901ga != null && abstractC13901ga.getNodeType() == 5) {
            abstractC13901ga = abstractC13901ga.getFirstChild();
        }
        return abstractC13901ga;
    }

    /* JADX INFO: renamed from: yd */
    private String m65699yd() {
        m65676b3();
        String value = this.f46669h4.getValue();
        AbstractC13901ga abstractC13901gaM65680dy = m65680dy(this.f46669h4);
        if (abstractC13901gaM65680dy == null || !abstractC13901gaM65680dy.isText()) {
            return value;
        }
        C6765kp c6765kp = new C6765kp(value);
        do {
            c6765kp.m26792k4(abstractC13901gaM65680dy.getValue());
            abstractC13901gaM65680dy = m65680dy(abstractC13901gaM65680dy);
            if (abstractC13901gaM65680dy == null) {
                break;
            }
        } while (abstractC13901gaM65680dy.isText());
        return c6765kp.toString();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: ck */
    public String mo52687ck() {
        return this.f46669h4.getXmlLang();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: fa */
    public Object mo21844fa() {
        m65676b3();
        return this.f46669h4;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: ix */
    public void mo21848ix() {
        while (true) {
            AbstractC13901ga parentNode = this.f46669h4.getParentNode();
            if (parentNode == null) {
                C13940my c13940my = (C13940my) C7019kk.m27452k4((Object) this.f46669h4, C13940my.class);
                if (c13940my == null) {
                    break;
                }
                parentNode = c13940my.m65627m9() ? this.f46668dy : c13940my.m65623h4();
                if (parentNode == null) {
                    break;
                }
            }
            this.f46669h4 = parentNode;
        }
        this.f46668dy = null;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: kk */
    public int mo21857kk() {
        m65676b3();
        return this.f46669h4.getXPNodeType();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: ks */
    public boolean mo21861ks() {
        C13940my c13940my = (C13940my) C7019kk.m27452k4((Object) this.f46669h4, C13940my.class);
        if (c13940my != null && !c13940my.m65627m9()) {
            C13857b1[] c13857b1Arr = {null};
            int[] iArr = {this.f46670m9};
            boolean z = (m65686k4(c13940my, c13857b1Arr, iArr[0]) || m65685k4(c13940my, c13857b1Arr[0], iArr)) ? false : true;
            C13857b1 c13857b1 = c13857b1Arr[0];
            int i = iArr[0];
            this.f46670m9 = i;
            if (z) {
                return false;
            }
            for (int i2 = i + 1; i2 < c13857b1.m65634x1(); i2++) {
                C13940my c13940myM65164k4 = c13857b1.m65164k4(i2);
                if (!c13940myM65164k4.m65627m9()) {
                    this.f46669h4 = c13940myM65164k4;
                    this.f46670m9 = i2;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: ne */
    public boolean mo21864ne() {
        AbstractC13901ga abstractC13901gaM65693to = m65693to(this.f46669h4);
        if (abstractC13901gaM65693to != null) {
            this.f46669h4 = abstractC13901gaM65693to;
            return true;
        }
        C13940my c13940my = (C13940my) C7019kk.m27452k4((Object) this.f46669h4, C13940my.class);
        if (c13940my == null) {
            return false;
        }
        C13981tl c13981tlM65623h4 = c13940my.m65627m9() ? this.f46668dy : c13940my.m65623h4();
        if (c13981tlM65623h4 == null) {
            return false;
        }
        this.f46669h4 = c13981tlM65623h4;
        this.f46668dy = null;
        return true;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: rv */
    public boolean mo21865rv() {
        AbstractC13901ga abstractC13901gaM65680dy = m65680dy(this.f46669h4);
        if (abstractC13901gaM65680dy == null) {
            return false;
        }
        if (abstractC13901gaM65680dy.isText() && this.f46669h4.isText() && (abstractC13901gaM65680dy = m65680dy(m65682jd(abstractC13901gaM65680dy))) == null) {
            return false;
        }
        AbstractC13901ga abstractC13901gaM65693to = m65693to(abstractC13901gaM65680dy);
        while (!m65679du(abstractC13901gaM65693to, abstractC13901gaM65680dy)) {
            abstractC13901gaM65680dy = m65680dy(abstractC13901gaM65680dy);
            if (abstractC13901gaM65680dy == null) {
                return false;
            }
        }
        this.f46669h4 = abstractC13901gaM65680dy;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0078 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0081 -> B:30:0x0055). Please report as a decompilation issue!!! */
    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: to */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo21866to(AbstractC10925du abstractC10925du) {
        C13945ne c13945ne = (C13945ne) C7019kk.m27452k4((Object) abstractC10925du, C13945ne.class);
        if (c13945ne == null) {
            return 3;
        }
        m65676b3();
        c13945ne.m65676b3();
        AbstractC13901ga abstractC13901gaM65695x1 = this.f46669h4;
        AbstractC13901ga abstractC13901gaM65695x12 = c13945ne.f46669h4;
        if (abstractC13901gaM65695x1 == abstractC13901gaM65695x12 && this.f46668dy == c13945ne.f46668dy) {
            return 2;
        }
        if (this.f46668dy != null || c13945ne.f46668dy != null) {
            return super.mo21866to(abstractC10925du);
        }
        AbstractC13901ga abstractC13901gaM65695x13 = m65695x1(abstractC13901gaM65695x1);
        AbstractC13901ga abstractC13901gaM65695x14 = m65695x1(abstractC13901gaM65695x12);
        if (abstractC13901gaM65695x13 == abstractC13901gaM65695x14) {
            if (abstractC13901gaM65695x13 == null) {
                return 3;
            }
            return m65683k4(abstractC13901gaM65695x1, abstractC13901gaM65695x12);
        }
        int iM65689kk = m65689kk(abstractC13901gaM65695x1);
        int iM65689kk2 = m65689kk(abstractC13901gaM65695x12);
        if (iM65689kk2 <= iM65689kk) {
            if (iM65689kk > iM65689kk2) {
                while (abstractC13901gaM65695x1 != null && iM65689kk > iM65689kk2) {
                    abstractC13901gaM65695x1 = m65695x1(abstractC13901gaM65695x1);
                    iM65689kk--;
                }
                if (abstractC13901gaM65695x1 == abstractC13901gaM65695x12) {
                    return 1;
                }
                abstractC13901gaM65695x13 = m65695x1(abstractC13901gaM65695x1);
            }
            AbstractC13901ga abstractC13901ga = abstractC13901gaM65695x1;
            abstractC13901gaM65695x1 = abstractC13901gaM65695x13;
            AbstractC13901ga abstractC13901ga2 = abstractC13901gaM65695x12;
            abstractC13901gaM65695x12 = abstractC13901gaM65695x14;
            if (abstractC13901gaM65695x1 != null) {
            }
            return 3;
        }
        while (abstractC13901gaM65695x12 != null && iM65689kk2 > iM65689kk) {
            abstractC13901gaM65695x12 = m65695x1(abstractC13901gaM65695x12);
            iM65689kk2--;
        }
        if (abstractC13901gaM65695x1 == abstractC13901gaM65695x12) {
            return 0;
        }
        abstractC13901gaM65695x14 = m65695x1(abstractC13901gaM65695x12);
        AbstractC13901ga abstractC13901ga3 = abstractC13901gaM65695x1;
        abstractC13901gaM65695x1 = abstractC13901gaM65695x13;
        AbstractC13901ga abstractC13901ga22 = abstractC13901gaM65695x12;
        abstractC13901gaM65695x12 = abstractC13901gaM65695x14;
        if (abstractC13901gaM65695x1 != null || abstractC13901gaM65695x12 == null) {
            return 3;
        }
        if (abstractC13901gaM65695x1 == abstractC13901gaM65695x12) {
            return m65683k4(abstractC13901ga3, abstractC13901ga22);
        }
        abstractC13901gaM65695x13 = m65695x1(abstractC13901gaM65695x1);
        abstractC13901gaM65695x14 = m65695x1(abstractC13901gaM65695x12);
        AbstractC13901ga abstractC13901ga32 = abstractC13901gaM65695x1;
        abstractC13901gaM65695x1 = abstractC13901gaM65695x13;
        AbstractC13901ga abstractC13901ga222 = abstractC13901gaM65695x12;
        abstractC13901gaM65695x12 = abstractC13901gaM65695x14;
        if (abstractC13901gaM65695x1 != null) {
        }
        return 3;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: u4 */
    public boolean mo21871u4() {
        AbstractC13901ga abstractC13901gaM65681h4;
        int nodeType = this.f46669h4.getNodeType();
        if (nodeType == 1) {
            return m65681h4(this.f46669h4) != null;
        }
        if ((nodeType != 9 && nodeType != 11) || (abstractC13901gaM65681h4 = m65681h4(this.f46669h4)) == null) {
            return false;
        }
        while (!m65679du(this.f46669h4, abstractC13901gaM65681h4)) {
            abstractC13901gaM65681h4 = m65680dy(abstractC13901gaM65681h4);
            if (abstractC13901gaM65681h4 == null) {
                return false;
            }
        }
        return true;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: up */
    public boolean mo21872up() {
        C13981tl c13981tl = (C13981tl) C7019kk.m27452k4((Object) this.f46669h4, C13981tl.class);
        if (c13981tl != null && c13981tl.m65904jd()) {
            C13857b1 attributes = c13981tl.getAttributes();
            for (int i = 0; i < attributes.m65634x1(); i++) {
                if (!attributes.m65164k4(i).m65627m9()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: uz */
    public InterfaceC13298y4 mo52698uz() {
        return this.f46669h4.getSchemaInfo();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.InterfaceC13903gi
    /* JADX INFO: renamed from: wl */
    public final AbstractC13901ga mo65354wl() {
        return this.f46669h4;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: x1 */
    public AbstractC13883dt mo21874x1() {
        return this.f46667du.getNameTable();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: x6 */
    public boolean mo21878x6() {
        AbstractC13901ga abstractC13901gaM65681h4;
        int nodeType = this.f46669h4.getNodeType();
        if (nodeType == 1) {
            abstractC13901gaM65681h4 = m65681h4(this.f46669h4);
            if (abstractC13901gaM65681h4 == null) {
                return false;
            }
        } else {
            if ((nodeType != 9 && nodeType != 11) || (abstractC13901gaM65681h4 = m65681h4(this.f46669h4)) == null) {
                return false;
            }
            while (!m65679du(this.f46669h4, abstractC13901gaM65681h4)) {
                abstractC13901gaM65681h4 = m65680dy(abstractC13901gaM65681h4);
                if (abstractC13901gaM65681h4 == null) {
                    return false;
                }
            }
        }
        this.f46669h4 = abstractC13901gaM65681h4;
        return true;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: yj */
    public boolean mo21879yj() {
        C13981tl c13981tl = (C13981tl) C7019kk.m27452k4((Object) this.f46669h4, C13981tl.class);
        if (c13981tl != null && c13981tl.m65904jd()) {
            C13857b1 attributes = c13981tl.getAttributes();
            for (int i = 0; i < attributes.m65634x1(); i++) {
                C13940my c13940myM65164k4 = attributes.m65164k4(i);
                if (!c13940myM65164k4.m65627m9()) {
                    this.f46669h4 = c13940myM65164k4;
                    this.f46670m9 = i;
                    return true;
                }
            }
        }
        return false;
    }

    public C13945ne(C13945ne c13945ne) {
        this.f46667du = c13945ne.f46667du;
        this.f46669h4 = c13945ne.f46669h4;
        this.f46670m9 = c13945ne.f46670m9;
        this.f46668dy = c13945ne.f46668dy;
    }

    /* JADX INFO: renamed from: kk */
    private static int m65689kk(AbstractC13901ga abstractC13901ga) {
        int i = 0;
        for (AbstractC13901ga abstractC13901gaM65695x1 = m65695x1(abstractC13901ga); abstractC13901gaM65695x1 != null; abstractC13901gaM65695x1 = m65695x1(abstractC13901gaM65695x1)) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: to */
    private AbstractC13901ga m65693to(AbstractC13901ga abstractC13901ga) {
        AbstractC13901ga parentNode = abstractC13901ga.getParentNode();
        return !this.f46667du.hasEntityReferences() ? parentNode : m65678du(parentNode);
    }

    /* JADX INFO: renamed from: x1 */
    private static AbstractC13901ga m65695x1(AbstractC13901ga abstractC13901ga) {
        AbstractC13901ga parentNode = abstractC13901ga.getParentNode();
        if (parentNode != null) {
            return parentNode;
        }
        C13940my c13940my = (C13940my) C7019kk.m27452k4((Object) abstractC13901ga, C13940my.class);
        if (c13940my != null) {
            return c13940my.m65623h4();
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: c5 */
    public String mo21839c5() {
        return this.f46669h4.getBaseURI();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: du */
    public String mo21841du() {
        C13940my c13940my = (C13940my) C7019kk.m27452k4((Object) this.f46669h4, C13940my.class);
        return (c13940my == null || !c13940my.m65627m9()) ? this.f46669h4.getNamespaceURI() : C14113y2.f47374k4;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10930to
    /* JADX INFO: renamed from: dy */
    public String mo21843dy() {
        int nodeType = this.f46669h4.getNodeType();
        if (nodeType != 1) {
            if (nodeType == 9) {
                return m65691lr();
            }
            if (nodeType != 11) {
                return (nodeType == 3 || nodeType == 4 || nodeType == 13 || nodeType == 14) ? m65699yd() : this.f46669h4.getValue();
            }
        }
        return this.f46669h4.getInnerText();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: h4 */
    public String mo21846h4() {
        int nodeType = this.f46669h4.getNodeType();
        if (nodeType != 1) {
            if (nodeType != 2) {
                if (nodeType != 7) {
                    return C14113y2.f47374k4;
                }
            } else if (((C13940my) this.f46669h4).m65627m9()) {
                String localName = this.f46669h4.getLocalName();
                return C13851ai.m65152k4(localName, this.f46667du.strXmlns) ? C14113y2.f47374k4 : localName;
            }
        }
        return this.f46669h4.getName();
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: jd */
    public boolean mo21849jd() {
        C13981tl c13981tl = (C13981tl) C7019kk.m27452k4((Object) this.f46669h4, C13981tl.class);
        if (c13981tl != null) {
            return c13981tl.m65897c5();
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10925du deepClone() {
        return new C13945ne(this);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: m9 */
    public String mo21863m9() {
        C13940my c13940my = (C13940my) C7019kk.m27452k4((Object) this.f46669h4, C13940my.class);
        return (c13940my == null || !c13940my.m65627m9()) ? this.f46669h4.getPrefix() : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: kk */
    private AbstractC13901ga m65690kk(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        if (abstractC13901ga2 != null) {
            return abstractC13901ga2;
        }
        if (!abstractC13901ga.isText()) {
            return null;
        }
        do {
            AbstractC13901ga previousSibling = abstractC13901ga.getPreviousSibling();
            if (previousSibling != null) {
                while (previousSibling != null) {
                    int nodeType = previousSibling.getNodeType();
                    if (nodeType != 3 && nodeType != 4) {
                        if (nodeType == 5) {
                            previousSibling = previousSibling.getLastChild();
                        } else if (nodeType != 13 && nodeType != 14) {
                            return null;
                        }
                    }
                    return previousSibling;
                }
                return null;
            }
            abstractC13901ga = abstractC13901ga.getParentNode();
            if (abstractC13901ga == null) {
                break;
            }
        } while (abstractC13901ga.getNodeType() == 5);
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    private AbstractC13901ga m65696x1(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        while (abstractC13901ga2 == null) {
            abstractC13901ga = abstractC13901ga.getParentNode();
            if (abstractC13901ga == null || abstractC13901ga.getNodeType() != 5) {
                return null;
            }
            abstractC13901ga2 = abstractC13901ga.getNextSibling();
        }
        while (abstractC13901ga2 != null && abstractC13901ga2.getNodeType() == 5) {
            abstractC13901ga2 = abstractC13901ga2.getFirstChild();
        }
        return abstractC13901ga2;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: du */
    public boolean mo21842du(int i) {
        int iM52684m9;
        AbstractC13901ga abstractC13901gaM65680dy = m65680dy(this.f46669h4);
        if (abstractC13901gaM65680dy == null) {
            return false;
        }
        if ((abstractC13901gaM65680dy.isText() && this.f46669h4.isText() && (abstractC13901gaM65680dy = m65680dy(m65682jd(abstractC13901gaM65680dy))) == null) || (iM52684m9 = AbstractC10925du.m52684m9(i)) == 0) {
            return false;
        }
        while (((1 << abstractC13901gaM65680dy.getXPNodeType()) & iM52684m9) == 0) {
            abstractC13901gaM65680dy = m65680dy(abstractC13901gaM65680dy);
            if (abstractC13901gaM65680dy == null) {
                return false;
            }
        }
        this.f46669h4 = abstractC13901gaM65680dy;
        return true;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 mo21852k4(int i, boolean z) {
        if (i != 1) {
            return super.mo21852k4(i, z);
        }
        int nodeType = this.f46669h4.getNodeType();
        return (nodeType == 9 || nodeType == 1) ? z ? new C13989u4(this) : new C13915ix(this) : new C13865bv(this);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: to */
    public String mo21867to() {
        return this.f46669h4.getXPLocalName();
    }

    /* JADX INFO: renamed from: du */
    private static boolean m65679du(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        int nodeType = abstractC13901ga.getNodeType();
        if (nodeType != 1) {
            if (nodeType != 9) {
                if (nodeType != 11) {
                    return false;
                }
                int nodeType2 = abstractC13901ga2.getNodeType();
                return nodeType2 == 1 || nodeType2 == 3 || nodeType2 == 4 || nodeType2 == 7 || nodeType2 == 8 || nodeType2 == 13 || nodeType2 == 14;
            }
            int nodeType3 = abstractC13901ga2.getNodeType();
            if (nodeType3 != 1 && nodeType3 != 7 && nodeType3 != 8) {
                return false;
            }
        }
        return true;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 mo21853k4(String str, String str2, boolean z) {
        String strMo65268x1 = this.f46667du.getNameTable().mo65268x1(str2);
        if (strMo65268x1 == null || this.f46669h4.getNodeType() == 2) {
            return new C13865bv(this);
        }
        String strMo65268x12 = this.f46667du.getNameTable().mo65268x1(str);
        return strMo65268x12 == null ? new C13865bv(this) : strMo65268x12.length() == 0 ? z ? new C13962qq(this, strMo65268x1) : new C13855ar(this, strMo65268x1) : z ? new C14005wl(this, strMo65268x12, strMo65268x1) : new C13996uz(this, strMo65268x12, strMo65268x1);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: kk */
    public boolean mo21858kk(int i) {
        C13940my c13940myM65164k4;
        C13940my c13940my = (C13940my) C7019kk.m27452k4((Object) this.f46669h4, C13940my.class);
        if (c13940my == null || !c13940my.m65627m9()) {
            return false;
        }
        int i2 = this.f46670m9;
        C13857b1[] c13857b1Arr = {null};
        int[] iArr = {i2};
        boolean z = (m65686k4(c13940my, c13857b1Arr, i2) || m65685k4(c13940my, c13857b1Arr[0], iArr)) ? false : true;
        C13857b1 c13857b1 = c13857b1Arr[0];
        int i3 = iArr[0];
        if (z) {
            return false;
        }
        if (i == 0) {
            do {
                c13857b1Arr[0] = c13857b1;
                iArr[0] = i3;
                boolean zM65698x1 = m65698x1(c13857b1Arr, iArr);
                c13857b1 = c13857b1Arr[0];
                i3 = iArr[0];
                if (!zM65698x1) {
                    if (m65687k4((C13981tl) null, this.f46668dy, this.f46667du.strXml)) {
                        return false;
                    }
                    this.f46669h4 = this.f46667du.getNamespaceXml();
                    return true;
                }
                c13940myM65164k4 = c13857b1.m65164k4(i3);
            } while (m65687k4(c13940myM65164k4.m65623h4(), this.f46668dy, c13940myM65164k4.getLocalName()));
        } else if (i == 1) {
            while (true) {
                c13857b1Arr[0] = c13857b1;
                iArr[0] = i3;
                boolean zM65698x12 = m65698x1(c13857b1Arr, iArr);
                c13857b1 = c13857b1Arr[0];
                i3 = iArr[0];
                if (!zM65698x12) {
                    return false;
                }
                c13940myM65164k4 = c13857b1.m65164k4(i3);
                String localName = c13940myM65164k4.getLocalName();
                if (!m65687k4(c13940myM65164k4.m65623h4(), this.f46668dy, localName) && !C13851ai.m65152k4(localName, this.f46667du.strXml)) {
                    break;
                }
            }
        } else {
            if (i != 2 || c13940my.m65623h4() != this.f46668dy) {
                return false;
            }
            iArr[0] = i3;
            boolean zM65697x1 = m65697x1(c13857b1, iArr);
            int i4 = iArr[0];
            if (!zM65697x1) {
                return false;
            }
            this.f46669h4 = c13857b1.m65164k4(i4);
            this.f46670m9 = i4;
            return true;
        }
        this.f46669h4 = c13940myM65164k4;
        this.f46670m9 = i3;
        return true;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: to */
    public boolean mo21868to(int i) {
        AbstractC13901ga abstractC13901gaM65681h4;
        int iM52684m9;
        if (this.f46669h4.getNodeType() == 2 || (abstractC13901gaM65681h4 = m65681h4(this.f46669h4)) == null || (iM52684m9 = AbstractC10925du.m52684m9(i)) == 0) {
            return false;
        }
        while (((1 << abstractC13901gaM65681h4.getXPNodeType()) & iM52684m9) == 0) {
            abstractC13901gaM65681h4 = m65680dy(abstractC13901gaM65681h4);
            if (abstractC13901gaM65681h4 == null) {
                return false;
            }
        }
        this.f46669h4 = abstractC13901gaM65681h4;
        return true;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: x1 */
    public boolean mo21875x1(int i) {
        boolean zM65698x1;
        C13981tl c13981tl = (C13981tl) C7019kk.m27452k4((Object) this.f46669h4, C13981tl.class);
        if (c13981tl == null) {
            return false;
        }
        if (i == 0) {
            C13857b1[] c13857b1Arr = {c13981tl.getAttributes()};
            int[] iArr = {Integer.MAX_VALUE};
            boolean zM65688k4 = m65688k4(c13857b1Arr, iArr);
            C13857b1 c13857b1 = c13857b1Arr[0];
            int i2 = iArr[0];
            if (zM65688k4) {
                this.f46669h4 = c13857b1.m65164k4(i2);
                this.f46670m9 = i2;
            } else {
                this.f46669h4 = this.f46667du.getNamespaceXml();
            }
        } else {
            if (i == 1) {
                C13857b1[] c13857b1Arr2 = {c13981tl.getAttributes()};
                int[] iArr2 = {Integer.MAX_VALUE};
                boolean zM65688k42 = m65688k4(c13857b1Arr2, iArr2);
                C13857b1 c13857b12 = c13857b1Arr2[0];
                int i3 = iArr2[0];
                if (!zM65688k42) {
                    return false;
                }
                do {
                    C13940my c13940myM65164k4 = c13857b12.m65164k4(i3);
                    if (C13851ai.m65152k4(c13940myM65164k4.getLocalName(), this.f46667du.strXml)) {
                        c13857b1Arr2[0] = c13857b12;
                        iArr2[0] = i3;
                        zM65698x1 = m65698x1(c13857b1Arr2, iArr2);
                        c13857b12 = c13857b1Arr2[0];
                        i3 = iArr2[0];
                    } else {
                        this.f46669h4 = c13940myM65164k4;
                        this.f46670m9 = i3;
                    }
                } while (zM65698x1);
                return false;
            }
            if (i != 2 || !c13981tl.m65904jd()) {
                return false;
            }
            C13857b1 attributes = c13981tl.getAttributes();
            int[] iArr3 = {Integer.MAX_VALUE};
            boolean zM65684k4 = m65684k4(attributes, iArr3);
            int i4 = iArr3[0];
            if (!zM65684k4) {
                return false;
            }
            this.f46669h4 = attributes.m65164k4(i4);
            this.f46670m9 = i4;
        }
        this.f46668dy = c13981tl;
        return true;
    }

    /* JADX INFO: renamed from: to */
    private static boolean m65694to(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        do {
            AbstractC13901ga parentNode = abstractC13901ga2.getParentNode();
            if (parentNode == null) {
                C13940my c13940my = (C13940my) C7019kk.m27452k4((Object) abstractC13901ga2, C13940my.class);
                if (c13940my == null || (abstractC13901ga2 = c13940my.m65623h4()) == null) {
                    return false;
                }
            } else {
                abstractC13901ga2 = parentNode;
            }
        } while (abstractC13901ga != abstractC13901ga2);
        return true;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du, com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6
    /* JADX INFO: renamed from: k4 */
    public String mo13292k4(String str) {
        String strMo13292k4 = super.mo13292k4(str);
        return strMo13292k4 != null ? mo21874x1().mo65266k4(strMo13292k4) : strMo13292k4;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: kk */
    public boolean mo21859kk(AbstractC10925du abstractC10925du) {
        C13945ne c13945ne = (C13945ne) C7019kk.m27452k4((Object) abstractC10925du, C13945ne.class);
        if (c13945ne != null) {
            return m65694to(this.f46669h4, c13945ne.f46669h4);
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: x1 */
    public boolean mo21876x1(AbstractC10925du abstractC10925du) {
        C13945ne c13945ne = (C13945ne) C7019kk.m27452k4((Object) abstractC10925du, C13945ne.class);
        if (c13945ne != null) {
            m65676b3();
            c13945ne.m65676b3();
            if (this.f46669h4 == c13945ne.f46669h4 && this.f46668dy == c13945ne.f46668dy) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m65697x1(C13857b1 c13857b1, int[] iArr) {
        for (int i = iArr[0] - 1; i >= 0; i--) {
            if (c13857b1.m65164k4(i).m65627m9()) {
                iArr[0] = i;
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: k4 */
    public String mo52694k4(String str, String str2) {
        return this.f46669h4.getXPAttribute(str, str2);
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: kk */
    public boolean mo52695kk(String str) {
        C13981tl c13981tl;
        if (!C14113y2.m67363du(str, this.f46667du.strXmlns) && (c13981tl = (C13981tl) C7019kk.m27452k4((Object) this.f46669h4, C13981tl.class)) != null) {
            String str2 = (str == null || str.length() == 0) ? this.f46667du.strXmlns : str;
            String str3 = this.f46667du.strReservedXmlns;
            do {
                C13940my c13940myM65903h4 = c13981tl.m65903h4(str2, str3);
                if (c13940myM65903h4 != null) {
                    this.f46668dy = (C13981tl) this.f46669h4;
                    this.f46669h4 = c13940myM65903h4;
                    return true;
                }
                c13981tl = (C13981tl) C7019kk.m27452k4((Object) c13981tl.getParentNode(), C13981tl.class);
            } while (c13981tl != null);
            if (C14113y2.m67363du(str, this.f46667du.strXml)) {
                this.f46668dy = (C13981tl) this.f46669h4;
                this.f46669h4 = this.f46667du.getNamespaceXml();
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: to */
    public boolean mo21869to(String str) {
        C13981tl elementById = this.f46667du.getElementById(str);
        if (elementById == null) {
            return false;
        }
        this.f46669h4 = elementById;
        this.f46668dy = null;
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65700k4(AbstractC13901ga abstractC13901ga) {
        C13981tl c13981tlM65623h4;
        this.f46669h4 = abstractC13901ga;
        C13940my c13940my = (C13940my) C7019kk.m27452k4((Object) abstractC13901ga, C13940my.class);
        if (c13940my == null || (c13981tlM65623h4 = c13940my.m65623h4()) == null) {
            return;
        }
        int[] iArr = {this.f46670m9};
        m65685k4(c13940my, c13981tlM65623h4.getAttributes(), iArr);
        this.f46670m9 = iArr[0];
        if (c13940my.m65627m9()) {
            this.f46668dy = c13981tlM65623h4;
        }
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: kk */
    public boolean mo21860kk(String str, String str2) {
        AbstractC13901ga abstractC13901gaM65681h4;
        if (this.f46669h4.getNodeType() != 2 && (abstractC13901gaM65681h4 = m65681h4(this.f46669h4)) != null) {
            do {
                if (abstractC13901gaM65681h4.getNodeType() == 1 && C14113y2.m67363du(abstractC13901gaM65681h4.getLocalName(), str) && C14113y2.m67363du(abstractC13901gaM65681h4.getNamespaceURI(), str2)) {
                    this.f46669h4 = abstractC13901gaM65681h4;
                    return true;
                }
                abstractC13901gaM65681h4 = m65680dy(abstractC13901gaM65681h4);
            } while (abstractC13901gaM65681h4 != null);
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: to */
    public boolean mo21870to(String str, String str2) {
        AbstractC13901ga abstractC13901gaM65680dy = m65680dy(this.f46669h4);
        if (abstractC13901gaM65680dy == null) {
            return false;
        }
        do {
            if (abstractC13901gaM65680dy.getNodeType() == 1 && C14113y2.m67363du(abstractC13901gaM65680dy.getLocalName(), str) && C14113y2.m67363du(abstractC13901gaM65680dy.getNamespaceURI(), str2)) {
                this.f46669h4 = abstractC13901gaM65680dy;
                return true;
            }
            abstractC13901gaM65680dy = m65680dy(abstractC13901gaM65680dy);
        } while (abstractC13901gaM65680dy != null);
        return false;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: x1 */
    public boolean mo21877x1(String str, String str2) {
        C13981tl c13981tl = (C13981tl) C7019kk.m27452k4((Object) this.f46669h4, C13981tl.class);
        if (c13981tl != null && c13981tl.m65904jd()) {
            C13857b1 attributes = c13981tl.getAttributes();
            for (int i = 0; i < attributes.m65634x1(); i++) {
                C13940my c13940myM65164k4 = attributes.m65164k4(i);
                if (C14113y2.m67363du(c13940myM65164k4.getLocalName(), str) && C14113y2.m67363du(c13940myM65164k4.getNamespaceURI(), str2)) {
                    if (c13940myM65164k4.m65627m9()) {
                        return false;
                    }
                    this.f46669h4 = c13940myM65164k4;
                    this.f46670m9 = i;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m65698x1(C13857b1[] c13857b1Arr, int[] iArr) {
        if (m65697x1(c13857b1Arr[0], iArr)) {
            return true;
        }
        AbstractC13901ga parentNode = c13857b1Arr[0].f46651k4.getParentNode();
        while (true) {
            C13981tl c13981tl = (C13981tl) C7019kk.m27452k4((Object) parentNode, C13981tl.class);
            if (c13981tl == null) {
                return false;
            }
            if (c13981tl.m65904jd()) {
                C13857b1 attributes = c13981tl.getAttributes();
                c13857b1Arr[0] = attributes;
                if (m65684k4(attributes, iArr)) {
                    return true;
                }
            }
            parentNode = c13981tl.getParentNode();
        }
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: k4 */
    public boolean mo21854k4(int i, AbstractC10925du abstractC10925du) {
        AbstractC13901ga abstractC13901ga;
        C13945ne c13945ne = (C13945ne) C7019kk.m27452k4((Object) abstractC10925du, C13945ne.class);
        if (c13945ne == null) {
            abstractC13901ga = null;
        } else {
            if (this.f46667du != c13945ne.f46667du) {
                return false;
            }
            if (c13945ne.f46669h4.getNodeType() == 2) {
                c13945ne = (C13945ne) c13945ne.deepClone();
                if (!c13945ne.m52697um()) {
                    return false;
                }
            }
            abstractC13901ga = c13945ne.f46669h4;
        }
        int iM52684m9 = AbstractC10925du.m52684m9(i);
        if (iM52684m9 == 0) {
            return false;
        }
        AbstractC13901ga abstractC13901gaM65623h4 = this.f46669h4;
        int nodeType = abstractC13901gaM65623h4.getNodeType();
        if (nodeType == 2) {
            abstractC13901gaM65623h4 = ((C13940my) abstractC13901gaM65623h4).m65623h4();
            if (abstractC13901gaM65623h4 == null) {
                return false;
            }
        } else if (nodeType == 3 || nodeType == 4 || nodeType == 13 || nodeType == 14) {
            abstractC13901gaM65623h4 = m65682jd(abstractC13901gaM65623h4);
        }
        do {
            AbstractC13901ga firstChild = abstractC13901gaM65623h4.getFirstChild();
            if (firstChild == null) {
                do {
                    firstChild = abstractC13901gaM65623h4.getNextSibling();
                    if (firstChild == null) {
                        abstractC13901gaM65623h4 = abstractC13901gaM65623h4.getParentNode();
                    }
                } while (abstractC13901gaM65623h4 != null);
                return false;
            }
            abstractC13901gaM65623h4 = firstChild;
            if (abstractC13901gaM65623h4 == abstractC13901ga) {
                return false;
            }
        } while (((1 << abstractC13901gaM65623h4.getXPNodeType()) & iM52684m9) == 0);
        this.f46669h4 = abstractC13901gaM65623h4;
        return true;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: k4 */
    public boolean mo21855k4(AbstractC10925du abstractC10925du) {
        C13945ne c13945ne = (C13945ne) C7019kk.m27452k4((Object) abstractC10925du, C13945ne.class);
        if (c13945ne == null || this.f46667du != c13945ne.f46667du) {
            return false;
        }
        this.f46669h4 = c13945ne.f46669h4;
        this.f46670m9 = c13945ne.f46670m9;
        this.f46668dy = c13945ne.f46668dy;
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m65684k4(C13857b1 c13857b1, int[] iArr) {
        for (int iM65634x1 = c13857b1.m65634x1() - 1; iM65634x1 >= 0; iM65634x1--) {
            if (c13857b1.m65164k4(iM65634x1).m65627m9()) {
                iArr[0] = iM65634x1;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m65685k4(C13940my c13940my, C13857b1 c13857b1, int[] iArr) {
        if (c13857b1 != null) {
            for (int i = 0; i < c13857b1.m65634x1(); i++) {
                if (c13940my == c13857b1.m65164k4(i)) {
                    iArr[0] = i;
                    return true;
                }
            }
        }
        iArr[0] = 0;
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m65686k4(C13940my c13940my, C13857b1[] c13857b1Arr, int i) {
        C13981tl c13981tlM65623h4 = c13940my.m65623h4();
        if (c13981tlM65623h4 != null) {
            C13857b1 attributes = c13981tlM65623h4.getAttributes();
            c13857b1Arr[0] = attributes;
            if (i >= 0 && i < attributes.m65634x1() && c13940my == c13857b1Arr[0].m65164k4(i)) {
                return true;
            }
        } else {
            c13857b1Arr[0] = null;
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m65687k4(C13981tl c13981tl, C13981tl c13981tl2, String str) {
        String str2 = this.f46667du.strReservedXmlns;
        while (c13981tl2 != null && c13981tl2 != c13981tl) {
            if (c13981tl2.m65903h4(str, str2) != null) {
                return true;
            }
            c13981tl2 = (C13981tl) C7019kk.m27452k4((Object) c13981tl2.getParentNode(), C13981tl.class);
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10925du
    /* JADX INFO: renamed from: k4 */
    public boolean mo21856k4(String str, String str2, AbstractC10925du abstractC10925du) {
        AbstractC13901ga abstractC13901ga;
        C13945ne c13945ne = (C13945ne) C7019kk.m27452k4((Object) abstractC10925du, C13945ne.class);
        if (c13945ne == null) {
            abstractC13901ga = null;
        } else {
            if (this.f46667du != c13945ne.f46667du) {
                return false;
            }
            if (c13945ne.f46669h4.getNodeType() == 2) {
                c13945ne = (C13945ne) c13945ne.deepClone();
                if (!c13945ne.m52697um()) {
                    return false;
                }
            }
            abstractC13901ga = c13945ne.f46669h4;
        }
        AbstractC13901ga parentNode = this.f46669h4;
        if (parentNode.getNodeType() == 2 && (parentNode = ((C13940my) parentNode).m65623h4()) == null) {
            return false;
        }
        while (true) {
            AbstractC13901ga firstChild = parentNode.getFirstChild();
            if (firstChild == null) {
                do {
                    firstChild = parentNode.getNextSibling();
                    if (firstChild == null) {
                        parentNode = parentNode.getParentNode();
                    }
                } while (parentNode != null);
                return false;
            }
            parentNode = firstChild;
            if (parentNode == abstractC13901ga) {
                return false;
            }
            if (parentNode.getNodeType() == 1 && C14113y2.m67363du(parentNode.getLocalName(), str) && C14113y2.m67363du(parentNode.getNamespaceURI(), str2)) {
                this.f46669h4 = parentNode;
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m65688k4(C13857b1[] c13857b1Arr, int[] iArr) {
        if (m65684k4(c13857b1Arr[0], iArr)) {
            return true;
        }
        AbstractC13901ga parentNode = c13857b1Arr[0].f46651k4.getParentNode();
        while (true) {
            C13981tl c13981tl = (C13981tl) C7019kk.m27452k4((Object) parentNode, C13981tl.class);
            if (c13981tl == null) {
                return false;
            }
            if (c13981tl.m65904jd()) {
                C13857b1 attributes = c13981tl.getAttributes();
                c13857b1Arr[0] = attributes;
                if (m65684k4(attributes, iArr)) {
                    return true;
                }
            }
            parentNode = c13981tl.getParentNode();
        }
    }
}
