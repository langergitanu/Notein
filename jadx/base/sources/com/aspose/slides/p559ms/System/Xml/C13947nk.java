package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.nk */
/* JADX INFO: loaded from: classes5.dex */
public class C13947nk extends AbstractC14007wt {

    /* JADX INFO: renamed from: k4 */
    private String f46672k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC14007wt f46673kk;

    public C13947nk(String str, XmlDocument xmlDocument) {
        super(xmlDocument);
        if (!xmlDocument.isLoading() && str.length() > 0 && str.charAt(0) == '#') {
            throw new ArgumentException(C13968ri.m65818k4("Cannot create an 'EntityReference' node with a name starting with '#'."));
        }
        this.f46672k4 = xmlDocument.getNameTable().mo65266k4(str);
        xmlDocument.fEntRefNodesPresent = true;
    }

    /* JADX INFO: renamed from: k4 */
    private String m65702k4(String str, String str2) {
        if (str == null) {
            return str2;
        }
        int iM67418kk = C14113y2.m67418kk(str, IOUtils.DIR_SEPARATOR_UNIX) + 1;
        if (iM67418kk > 0 && iM67418kk < str.length()) {
            str = C14113y2.m67443x1(str, 0, iM67418kk);
        } else if (iM67418kk == 0) {
            str = C14113y2.m67408k4(str, "\\");
        }
        return C14113y2.m67408k4(str, C14113y2.m67393k4(str2, IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC13901ga cloneNode(boolean z) {
        return getOwnerDocument().createEntityReference(this.f46672k4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getBaseURI() {
        return getOwnerDocument().getBaseURI();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public AbstractC14007wt getLastNode() {
        return this.f46673kk;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getLocalName() {
        return this.f46672k4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getName() {
        return this.f46672k4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public int getNodeType() {
        return 5;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getValue() {
        return null;
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
        return i == 1 || i == 3 || i == 4 || i == 5 || i == 7 || i == 8 || i == 13 || i == 14;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setLastNode(AbstractC14007wt abstractC14007wt) {
        this.f46673kk = abstractC14007wt;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setParent(AbstractC13901ga abstractC13901ga) {
        super.setParent(abstractC13901ga);
        if (getLastNode() != null || abstractC13901ga == null || abstractC13901ga == getOwnerDocument()) {
            return;
        }
        new C13987tw().m66218k4(this);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setParentForLoad(AbstractC13901ga abstractC13901ga) {
        setParent(abstractC13901ga);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setValue(String str) {
        throw new InvalidOperationException(C13968ri.m65818k4("'EntityReference' nodes have no support for setting value."));
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeContentTo(AbstractC13958qb abstractC13958qb) {
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            ((AbstractC13901ga) it.next()).writeTo(abstractC13958qb);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void writeTo(AbstractC13958qb abstractC13958qb) {
        abstractC13958qb.mo21910kk(this.f46672k4);
    }

    /* JADX INFO: renamed from: x1 */
    public final String m65703x1() {
        C13966r7 entityNode = getOwnerDocument().getEntityNode(this.f46672k4);
        return entityNode != null ? (entityNode.m65815k4() == null || entityNode.m65815k4().length() <= 0) ? entityNode.getBaseURI() : m65702k4(entityNode.getBaseURI(), entityNode.m65815k4()) : C14113y2.f47374k4;
    }
}
