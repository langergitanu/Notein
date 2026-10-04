package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p532yu.InterfaceC13298y4;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.tl */
/* JADX INFO: loaded from: classes5.dex */
public class C13981tl extends AbstractC14007wt {

    /* JADX INFO: renamed from: k4 */
    private C14023y6 f46842k4;

    /* JADX INFO: renamed from: kk */
    private C13857b1 f46843kk;

    /* JADX INFO: renamed from: to */
    private AbstractC14007wt f46844to;

    public C13981tl(C14023y6 c14023y6, boolean z, XmlDocument xmlDocument) {
        super(xmlDocument);
        this.parentNode = null;
        if (!xmlDocument.isLoading()) {
            XmlDocument.checkName(c14023y6.m66349jd());
            XmlDocument.checkName(c14023y6.m66347dy());
        }
        if (c14023y6.m66347dy().length() == 0) {
            throw new ArgumentException(C13968ri.m65818k4("The local name for elements or attributes cannot be null or an empty string."));
        }
        this.f46842k4 = c14023y6;
        if (z) {
            this.f46844to = this;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC13901ga appendChildForLoad(AbstractC13901ga abstractC13901ga, XmlDocument xmlDocument) {
        C13979sz insertEventArgsForLoad = xmlDocument.getInsertEventArgsForLoad(abstractC13901ga, this);
        if (insertEventArgsForLoad != null) {
            xmlDocument.beforeEvent(insertEventArgsForLoad);
        }
        AbstractC14007wt abstractC14007wt = (AbstractC14007wt) abstractC13901ga;
        AbstractC14007wt abstractC14007wt2 = this.f46844to;
        if (abstractC14007wt2 != null && abstractC14007wt2 != this) {
            abstractC14007wt.f47053x1 = abstractC14007wt2.f47053x1;
            abstractC14007wt2.f47053x1 = abstractC14007wt;
            this.f46844to = abstractC14007wt;
            if (abstractC14007wt2.isText() && abstractC14007wt.isText()) {
                AbstractC13901ga.nestTextNodes(abstractC14007wt2, abstractC14007wt);
            }
            if (insertEventArgsForLoad != null) {
                xmlDocument.afterEvent(insertEventArgsForLoad);
            }
            return abstractC14007wt;
        }
        abstractC14007wt.f47053x1 = abstractC14007wt;
        this.f46844to = abstractC14007wt;
        abstractC14007wt.setParentForLoad(this);
        if (insertEventArgsForLoad != null) {
        }
        return abstractC14007wt;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m65897c5() {
        return this.f46844to == this;
    }

    /* JADX INFO: renamed from: ck */
    public void m65898ck() {
        if (m65904jd()) {
            this.f46843kk.m65167k4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga cloneNode(boolean z) {
        XmlDocument ownerDocument = getOwnerDocument();
        boolean zIsLoading = ownerDocument.isLoading();
        ownerDocument.setLoading(true);
        C13981tl c13981tlCreateElement = ownerDocument.createElement(getPrefix(), getLocalName(), getNamespaceURI());
        ownerDocument.setLoading(zIsLoading);
        if (c13981tlCreateElement.m65897c5() != m65897c5()) {
            c13981tlCreateElement.m65915x1(m65897c5());
        }
        if (m65904jd()) {
            IEnumerator it = getAttributes().iterator();
            while (it.hasNext()) {
                try {
                    C13940my c13940my = (C13940my) it.next();
                    C13940my c13940my2 = (C13940my) c13940my.cloneNode(true);
                    if (C7019kk.m27469x1(c13940my, C13967r9.class) && !c13940my.mo65622du()) {
                        ((C13967r9) c13940my2).m65817k4(false);
                    }
                    c13981tlCreateElement.getAttributes().m65159dy(c13940my2);
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        ((IDisposable) it).dispose();
                    }
                    throw th;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                ((IDisposable) it).dispose();
            }
        }
        if (z) {
            c13981tlCreateElement.copyChildren(ownerDocument, this, z);
        }
        return c13981tlCreateElement;
    }

    /* JADX INFO: renamed from: du */
    public void m65899du(String str, String str2) {
        m65911m9(str, str2);
    }

    /* JADX INFO: renamed from: dy */
    public final C14023y6 m65900dy() {
        return this.f46842k4;
    }

    /* JADX INFO: renamed from: fa */
    public final void m65902fa() {
        super.removeAll();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public C13857b1 getAttributes() {
        if (this.f46843kk == null) {
            synchronized (getOwnerDocument().objLock) {
                try {
                    if (this.f46843kk == null) {
                        this.f46843kk = new C13857b1(this);
                    }
                } finally {
                }
            }
        }
        return this.f46843kk;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getInnerText() {
        return super.getInnerText();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getInnerXml() {
        return super.getInnerXml();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC14007wt getLastNode() {
        AbstractC14007wt abstractC14007wt = this.f46844to;
        if (abstractC14007wt == this) {
            return null;
        }
        return abstractC14007wt;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getLocalName() {
        return this.f46842k4.m66347dy();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getName() {
        return this.f46842k4.m66348fa();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getNamespaceURI() {
        return this.f46842k4.m66345c5();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC14007wt, com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga getNextSibling() {
        AbstractC13901ga abstractC13901ga = this.parentNode;
        if (abstractC13901ga == null || abstractC13901ga.getLastNode() == this) {
            return null;
        }
        return this.f47053x1;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getNodeType() {
        return 1;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public XmlDocument getOwnerDocument() {
        return this.f46842k4.m66346ck();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga getParentNode() {
        return this.parentNode;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getPrefix() {
        return this.f46842k4.m66349jd();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public InterfaceC13298y4 getSchemaInfo() {
        return this.f46842k4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getXPAttribute(String str, String str2) {
        if (C14113y2.m67363du(str2, getOwnerDocument().strReservedXmlns)) {
            return null;
        }
        C13940my c13940myM65903h4 = m65903h4(str, str2);
        return c13940myM65903h4 != null ? c13940myM65903h4.getValue() : C14113y2.f47374k4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getXPLocalName() {
        return getLocalName();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getXPNodeType() {
        return 1;
    }

    /* JADX INFO: renamed from: h4 */
    public C13940my m65903h4(String str, String str2) {
        if (m65904jd()) {
            return getAttributes().m65166k4(str, str2);
        }
        return null;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public boolean isContainer() {
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public boolean isValidChildType(int i) {
        return i == 1 || i == 3 || i == 4 || i == 5 || i == 7 || i == 8 || i == 13 || i == 14;
    }

    /* JADX INFO: renamed from: jd */
    public boolean m65904jd() {
        C13857b1 c13857b1 = this.f46843kk;
        return c13857b1 != null && c13857b1.m65634x1() > 0;
    }

    /* JADX INFO: renamed from: k4 */
    public C13940my m65905k4(C13940my c13940my) {
        if (c13940my.m65623h4() == null) {
            return (C13940my) getAttributes().mo65163k4((AbstractC13901ga) c13940my);
        }
        throw new InvalidOperationException(C13968ri.m65818k4("The 'Attribute' node cannot be inserted because it is already an attribute of another element."));
    }

    /* JADX INFO: renamed from: kk */
    public AbstractC13911hq m65909kk(String str) {
        return new C13956q3(this, str);
    }

    /* JADX INFO: renamed from: m9 */
    public C13940my m65911m9(String str, String str2) {
        if (!m65904jd()) {
            return null;
        }
        C13940my c13940myM65903h4 = m65903h4(str, str2);
        getAttributes().m65169kk(c13940myM65903h4);
        return c13940myM65903h4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void removeAll() {
        super.removeAll();
        m65898ck();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setInnerText(String str) {
        AbstractC14007wt lastNode = getLastNode();
        if (lastNode != null && lastNode.getNodeType() == 3 && lastNode.f47053x1 == lastNode) {
            lastNode.setValue(str);
        } else {
            m65902fa();
            appendChild(getOwnerDocument().createTextNode(str));
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setInnerXml(String str) {
        m65902fa();
        new C13987tw().m66221k4(this, str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setLastNode(AbstractC14007wt abstractC14007wt) {
        this.f46844to = abstractC14007wt;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setParent(AbstractC13901ga abstractC13901ga) {
        this.parentNode = abstractC13901ga;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setPrefix(String str) {
        this.f46842k4 = this.f46842k4.m66346ck().addXmlName(str, getLocalName(), getNamespaceURI(), getSchemaInfo());
    }

    /* JADX INFO: renamed from: to */
    public String m65912to(String str, String str2) {
        C13940my c13940myM65903h4 = m65903h4(str, str2);
        return c13940myM65903h4 != null ? c13940myM65903h4.getValue() : C14113y2.f47374k4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeContentTo(AbstractC13958qb abstractC13958qb) {
        for (AbstractC13901ga firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            firstChild.writeTo(abstractC13958qb);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeTo(AbstractC13958qb abstractC13958qb) {
        if (C14067j2.m66727k4(this) == C7019kk.m27443k4((Class<?>) C13981tl.class)) {
            m65896k4(abstractC13958qb, this);
            return;
        }
        m65895k4(abstractC13958qb);
        if (m65897c5()) {
            abstractC13958qb.mo21898jd();
        } else {
            writeContentTo(abstractC13958qb);
            abstractC13958qb.mo21892ck();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public C13940my m65914x1(String str) {
        if (m65904jd()) {
            return getAttributes().m65165k4(str);
        }
        return null;
    }

    public C13981tl(String str, String str2, String str3, XmlDocument xmlDocument) {
        this(xmlDocument.addXmlName(str, str2, str3, null), true, xmlDocument);
    }

    /* JADX INFO: renamed from: dy */
    public boolean m65901dy(String str, String str2) {
        return m65903h4(str, str2) != null;
    }

    /* JADX INFO: renamed from: k4 */
    public String m65906k4(String str) {
        C13940my c13940myM65914x1 = m65914x1(str);
        return c13940myM65914x1 != null ? c13940myM65914x1.getValue() : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: kk */
    public void m65910kk(String str, String str2) {
        C13940my c13940myM65914x1 = m65914x1(str);
        if (c13940myM65914x1 != null) {
            c13940myM65914x1.setValue(str2);
            return;
        }
        C13940my c13940myCreateAttribute = getOwnerDocument().createAttribute(str);
        c13940myCreateAttribute.setValue(str2);
        getAttributes().m65159dy(c13940myCreateAttribute);
    }

    /* JADX INFO: renamed from: to */
    public boolean m65913to(String str) {
        return m65914x1(str) != null;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m65915x1(boolean z) {
        if (!z) {
            if (this.f46844to == this) {
                this.f46844to = null;
            }
        } else if (this.f46844to != this) {
            m65902fa();
            this.f46844to = this;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public String m65907k4(String str, String str2, String str3) {
        C13940my c13940myM65903h4 = m65903h4(str, str2);
        if (c13940myM65903h4 != null) {
            c13940myM65903h4.setValue(str3);
            return str3;
        }
        C13940my c13940myCreateAttribute = getOwnerDocument().createAttribute(C14113y2.f47374k4, str, str2);
        c13940myCreateAttribute.setValue(str3);
        getAttributes().m65159dy(c13940myCreateAttribute);
        return str3;
    }

    /* JADX INFO: renamed from: k4 */
    private void m65895k4(AbstractC13958qb abstractC13958qb) {
        abstractC13958qb.mo12953k4(getPrefix(), getLocalName(), getNamespaceURI());
        if (m65904jd()) {
            C13857b1 attributes = getAttributes();
            for (int i = 0; i < attributes.m65634x1(); i++) {
                attributes.m65164k4(i).writeTo(abstractC13958qb);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        r4.mo21892ck();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m65896k4(AbstractC13958qb abstractC13958qb, C13981tl c13981tl) {
        AbstractC13901ga nextSibling = c13981tl;
        while (true) {
            C13981tl c13981tl2 = (C13981tl) C7019kk.m27452k4((Object) nextSibling, C13981tl.class);
            if (c13981tl2 == null || C14067j2.m66727k4(c13981tl2) != C7019kk.m27443k4((Class<?>) C13981tl.class)) {
                nextSibling.writeTo(abstractC13958qb);
                while (nextSibling != c13981tl && nextSibling == nextSibling.getParentNode().getLastChild()) {
                    nextSibling = nextSibling.getParentNode();
                    abstractC13958qb.mo21892ck();
                }
                if (nextSibling != c13981tl) {
                    return;
                } else {
                    nextSibling = nextSibling.getNextSibling();
                }
            } else {
                c13981tl2.m65895k4(abstractC13958qb);
                if (c13981tl2.m65897c5()) {
                    abstractC13958qb.mo21898jd();
                } else {
                    if (c13981tl2.f46844to != null) {
                        nextSibling = c13981tl2.getFirstChild();
                    }
                    abstractC13958qb.mo21892ck();
                }
                while (nextSibling != c13981tl) {
                    nextSibling = nextSibling.getParentNode();
                    abstractC13958qb.mo21892ck();
                }
                if (nextSibling != c13981tl) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65908k4(C14023y6 c14023y6) {
        this.f46842k4 = c14023y6;
    }
}
