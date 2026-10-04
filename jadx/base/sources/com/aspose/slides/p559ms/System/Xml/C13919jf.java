package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.jf */
/* JADX INFO: loaded from: classes5.dex */
class C13919jf extends AbstractC13974sc {

    /* JADX INFO: renamed from: k4 */
    final /* synthetic */ C13868c4 f46585k4;

    public C13919jf(C13868c4 c13868c4) {
        this.f46585k4 = c13868c4;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
    public String getDelegateId() {
        return "System.Xml.XmlDocument.NodeInsertedDelegate";
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13974sc
    /* JADX INFO: renamed from: k4 */
    public void mo65207k4(Object obj, C13979sz c13979sz) {
        Iterator it = ((AbstractC7018k4) this.f46585k4).f19081x1.iterator();
        while (it.hasNext()) {
            ((AbstractC13974sc) it.next()).mo65207k4(obj, c13979sz);
        }
    }
}
