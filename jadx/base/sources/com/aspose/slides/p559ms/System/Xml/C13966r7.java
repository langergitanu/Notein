package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.r7 */
/* JADX INFO: loaded from: classes5.dex */
public class C13966r7 extends AbstractC13901ga {

    /* JADX INFO: renamed from: du */
    private String f46794du;

    /* JADX INFO: renamed from: dy */
    private boolean f46795dy;

    /* JADX INFO: renamed from: h4 */
    private String f46796h4;

    /* JADX INFO: renamed from: k4 */
    private String f46797k4;

    /* JADX INFO: renamed from: kk */
    private String f46798kk;

    /* JADX INFO: renamed from: m9 */
    private AbstractC14007wt f46799m9;

    /* JADX INFO: renamed from: to */
    private String f46800to;

    /* JADX INFO: renamed from: x1 */
    private String f46801x1;

    public C13966r7(String str, String str2, String str3, String str4, String str5, XmlDocument xmlDocument) {
        super(xmlDocument);
        this.f46800to = xmlDocument.getNameTable().mo65266k4(str);
        this.f46797k4 = str3;
        this.f46801x1 = str4;
        this.f46798kk = str5;
        this.f46794du = str2;
        this.f46795dy = false;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga cloneNode(boolean z) {
        throw new InvalidOperationException(C13968ri.m65818k4("'Entity' and 'Notation' nodes cannot be cloned."));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getBaseURI() {
        return this.f46796h4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getInnerText() {
        return super.getInnerText();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getInnerXml() {
        return C14113y2.f47374k4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC14007wt getLastNode() {
        if (this.f46799m9 == null && !this.f46795dy) {
            this.f46795dy = true;
            new C13987tw().m66220k4(this);
        }
        return this.f46799m9;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getLocalName() {
        return this.f46800to;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getName() {
        return this.f46800to;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getNodeType() {
        return 6;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getOuterXml() {
        return C14113y2.f47374k4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public boolean isContainer() {
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public boolean isReadOnly() {
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public boolean isValidChildType(int i) {
        return i == 3 || i == 1 || i == 7 || i == 8 || i == 4 || i == 13 || i == 14 || i == 5;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m65815k4() {
        return this.f46801x1;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setInnerText(String str) {
        throw new InvalidOperationException(C13968ri.m65818k4("The 'InnerText' of an 'Entity' node is read-only and cannot be set."));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setInnerXml(String str) {
        throw new InvalidOperationException(C13968ri.m65818k4("Cannot set the 'InnerXml' for the current node because it is either read-only or cannot have children."));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setLastNode(AbstractC14007wt abstractC14007wt) {
        this.f46799m9 = abstractC14007wt;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeContentTo(AbstractC13958qb abstractC13958qb) {
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeTo(AbstractC13958qb abstractC13958qb) {
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65816k4(String str) {
        this.f46796h4 = str;
    }
}
