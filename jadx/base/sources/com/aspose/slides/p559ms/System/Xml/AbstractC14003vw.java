package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.vw */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14003vw extends AbstractC14007wt {

    /* JADX INFO: renamed from: k4 */
    private String f47052k4;

    public AbstractC14003vw(String str, XmlDocument xmlDocument) {
        super(xmlDocument);
        this.f47052k4 = str;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getInnerText() {
        return getValue();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public String getValue() {
        return m66283kk();
    }

    /* JADX INFO: renamed from: k4 */
    public void m66281k4(String str) {
        AbstractC13901ga parentNode = getParentNode();
        C13979sz eventArgs = getEventArgs(this, parentNode, parentNode, this.f47052k4, str, 2);
        if (eventArgs != null) {
            beforeEvent(eventArgs);
        }
        this.f47052k4 = str;
        if (eventArgs != null) {
            afterEvent(eventArgs);
        }
    }

    /* JADX INFO: renamed from: kk */
    public String m66283kk() {
        String str = this.f47052k4;
        return str != null ? str : C14113y2.f47374k4;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setInnerText(String str) {
        setValue(str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13901ga
    public void setValue(String str) {
        m66281k4(str);
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m66284x1(String str) {
        return C14022y4.m66318k4().m66334k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m66282k4(AbstractC13901ga abstractC13901ga, int[] iArr) {
        while (abstractC13901ga != null) {
            int nodeType = abstractC13901ga.getNodeType();
            if (nodeType == 3 || nodeType == 4) {
                iArr[0] = 4;
                return false;
            }
            if (nodeType != 5) {
                if (nodeType == 13) {
                    continue;
                } else {
                    if (nodeType != 14) {
                        return false;
                    }
                    iArr[0] = 5;
                }
            } else if (!m66282k4(abstractC13901ga.getFirstChild(), iArr)) {
                return false;
            }
            abstractC13901ga = abstractC13901ga.getNextSibling();
        }
        return true;
    }
}
