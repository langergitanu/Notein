package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.Collections.IEnumerator;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.qn */
/* JADX INFO: loaded from: classes5.dex */
public class C13961qn extends AbstractC13911hq {

    /* JADX INFO: renamed from: k4 */
    private AbstractC13901ga f46783k4;

    public C13961qn(AbstractC13901ga abstractC13901ga) {
        this.f46783k4 = abstractC13901ga;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13911hq, java.lang.Iterable
    public IEnumerator iterator() {
        return this.f46783k4.getFirstChild() == null ? XmlDocument.EmptyEnumerator : new C14002vt(this.f46783k4);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13911hq
    /* JADX INFO: renamed from: k4 */
    public int mo23932k4() {
        int i = 0;
        for (AbstractC13901ga firstChild = this.f46783k4.getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
            i++;
        }
        return i;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13911hq
    /* JADX INFO: renamed from: k4 */
    public AbstractC13901ga mo23933k4(int i) {
        if (i < 0) {
            return null;
        }
        AbstractC13901ga firstChild = this.f46783k4.getFirstChild();
        while (firstChild != null) {
            if (i == 0) {
                return firstChild;
            }
            firstChild = firstChild.getNextSibling();
            i--;
        }
        return null;
    }
}
