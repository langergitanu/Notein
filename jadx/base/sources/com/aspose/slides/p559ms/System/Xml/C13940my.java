package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p532yu.InterfaceC13298y4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.my */
/* JADX INFO: loaded from: classes5.dex */
public class C13940my extends AbstractC13901ga {

    /* JADX INFO: renamed from: k4 */
    private C14023y6 f46649k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC14007wt f46650x1;

    public C13940my(C14023y6 c14023y6, XmlDocument xmlDocument) {
        super(xmlDocument);
        this.parentNode = null;
        if (!xmlDocument.isLoading()) {
            XmlDocument.checkName(c14023y6.m66349jd());
            XmlDocument.checkName(c14023y6.m66347dy());
        }
        if (c14023y6.m66347dy().length() == 0) {
            throw new ArgumentException(C13968ri.m65818k4("The attribute local name cannot be empty."));
        }
        this.f46649k4 = c14023y6;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga appendChild(AbstractC13901ga abstractC13901ga) {
        if (!m65628to()) {
            return super.appendChild(abstractC13901ga);
        }
        String innerText = getInnerText();
        AbstractC13901ga abstractC13901gaAppendChild = super.appendChild(abstractC13901ga);
        m65625k4(innerText);
        return abstractC13901gaAppendChild;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
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
        AbstractC14007wt abstractC14007wt2 = this.f46650x1;
        if (abstractC14007wt2 != null) {
            abstractC14007wt.f47053x1 = abstractC14007wt2.f47053x1;
            abstractC14007wt2.f47053x1 = abstractC14007wt;
            this.f46650x1 = abstractC14007wt;
            if (abstractC14007wt2.isText() && abstractC14007wt.isText()) {
                AbstractC13901ga.nestTextNodes(abstractC14007wt2, abstractC14007wt);
            }
            if (insertEventArgsForLoad != null) {
                xmlDocument.afterEvent(insertEventArgsForLoad);
            }
            return abstractC14007wt;
        }
        abstractC14007wt.f47053x1 = abstractC14007wt;
        this.f46650x1 = abstractC14007wt;
        abstractC14007wt.setParentForLoad(this);
        if (insertEventArgsForLoad != null) {
        }
        return abstractC14007wt;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga cloneNode(boolean z) {
        XmlDocument ownerDocument = getOwnerDocument();
        C13940my c13940myCreateAttribute = ownerDocument.createAttribute(getPrefix(), getLocalName(), getNamespaceURI());
        c13940myCreateAttribute.copyChildren(ownerDocument, this, true);
        return c13940myCreateAttribute;
    }

    /* JADX INFO: renamed from: du */
    public boolean mo65622du() {
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getBaseURI() {
        return m65623h4() != null ? m65623h4().getBaseURI() : C14113y2.f47374k4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC14007wt getLastNode() {
        return this.f46650x1;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getLocalName() {
        return this.f46649k4.m66347dy();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getName() {
        return this.f46649k4.m66348fa();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getNamespaceURI() {
        return this.f46649k4.m66345c5();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getNodeType() {
        return 2;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public XmlDocument getOwnerDocument() {
        return this.f46649k4.m66346ck();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga getParentNode() {
        return null;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getPrefix() {
        return this.f46649k4.m66349jd();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public InterfaceC13298y4 getSchemaInfo() {
        return this.f46649k4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getValue() {
        return getInnerText();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getXPLocalName() {
        return (this.f46649k4.m66349jd().length() == 0 && "xmlns".equals(this.f46649k4.m66347dy())) ? C14113y2.f47374k4 : this.f46649k4.m66347dy();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getXPNodeType() {
        return m65627m9() ? 3 : 2;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getXmlLang() {
        return m65623h4() != null ? m65623h4().getXmlLang() : C14113y2.f47374k4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getXmlSpace() {
        if (m65623h4() != null) {
            return m65623h4().getXmlSpace();
        }
        return 0;
    }

    /* JADX INFO: renamed from: h4 */
    public C13981tl m65623h4() {
        return (C13981tl) C7019kk.m27452k4((Object) this.parentNode, C13981tl.class);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga insertAfter(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        if (!m65628to()) {
            return super.insertAfter(abstractC13901ga, abstractC13901ga2);
        }
        String innerText = getInnerText();
        AbstractC13901ga abstractC13901gaInsertAfter = super.insertAfter(abstractC13901ga, abstractC13901ga2);
        m65625k4(innerText);
        return abstractC13901gaInsertAfter;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga insertBefore(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        if (!m65628to()) {
            return super.insertBefore(abstractC13901ga, abstractC13901ga2);
        }
        String innerText = getInnerText();
        AbstractC13901ga abstractC13901gaInsertBefore = super.insertBefore(abstractC13901ga, abstractC13901ga2);
        m65625k4(innerText);
        return abstractC13901gaInsertBefore;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public boolean isContainer() {
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public boolean isValidChildType(int i) {
        return i == 3 || i == 5;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65624k4(C14023y6 c14023y6) {
        this.f46649k4 = c14023y6;
    }

    /* JADX INFO: renamed from: kk */
    public final C14023y6 m65626kk() {
        return this.f46649k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m65627m9() {
        return C13851ai.m65152k4(this.f46649k4.m66345c5(), this.f46649k4.m66346ck().strReservedXmlns);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga prependChild(AbstractC13901ga abstractC13901ga) {
        if (!m65628to()) {
            return super.prependChild(abstractC13901ga);
        }
        String innerText = getInnerText();
        AbstractC13901ga abstractC13901gaPrependChild = super.prependChild(abstractC13901ga);
        m65625k4(innerText);
        return abstractC13901gaPrependChild;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga removeChild(AbstractC13901ga abstractC13901ga) {
        if (!m65628to()) {
            return super.removeChild(abstractC13901ga);
        }
        String innerText = getInnerText();
        AbstractC13901ga abstractC13901gaRemoveChild = super.removeChild(abstractC13901ga);
        m65625k4(innerText);
        return abstractC13901gaRemoveChild;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga replaceChild(AbstractC13901ga abstractC13901ga, AbstractC13901ga abstractC13901ga2) {
        if (!m65628to()) {
            return super.replaceChild(abstractC13901ga, abstractC13901ga2);
        }
        String innerText = getInnerText();
        AbstractC13901ga abstractC13901gaReplaceChild = super.replaceChild(abstractC13901ga, abstractC13901ga2);
        m65625k4(innerText);
        return abstractC13901gaReplaceChild;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setInnerText(String str) {
        if (!m65628to()) {
            super.setInnerText(str);
            return;
        }
        String innerText = super.getInnerText();
        super.setInnerText(str);
        m65625k4(innerText);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setInnerXml(String str) {
        removeAll();
        new C13987tw().m66217k4(this, str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setLastNode(AbstractC14007wt abstractC14007wt) {
        this.f46650x1 = abstractC14007wt;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setParent(AbstractC13901ga abstractC13901ga) {
        this.parentNode = abstractC13901ga;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setPrefix(String str) {
        this.f46649k4 = this.f46649k4.m66346ck().addAttrXmlName(str, getLocalName(), getNamespaceURI(), getSchemaInfo());
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setValue(String str) {
        setInnerText(str);
    }

    /* JADX INFO: renamed from: to */
    public final boolean m65628to() {
        C13981tl c13981tlM65623h4;
        if (getOwnerDocument().getDtdSchemaInfo() == null || (c13981tlM65623h4 = m65623h4()) == null) {
            return false;
        }
        return c13981tlM65623h4.getAttributes().m65176x1(getPrefix(), getLocalName());
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeContentTo(AbstractC13958qb abstractC13958qb) {
        for (AbstractC13901ga firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            firstChild.writeTo(abstractC13958qb);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeTo(AbstractC13958qb abstractC13958qb) {
        abstractC13958qb.mo21915to(getPrefix(), getLocalName(), getNamespaceURI());
        writeContentTo(abstractC13958qb);
        abstractC13958qb.mo21917x1();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m65629x1() {
        return this.f46649k4.hashCode();
    }

    public C13940my(String str, String str2, String str3, XmlDocument xmlDocument) {
        this(xmlDocument.addAttrXmlName(str, str2, str3, null), xmlDocument);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65625k4(String str) {
        C13981tl c13981tlM65623h4 = m65623h4();
        if (c13981tlM65623h4 != null) {
            c13981tlM65623h4.getAttributes().m65170kk(str, getInnerText());
        }
    }
}
