package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p314oc.AbstractC7018k4;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.ou */
/* JADX INFO: loaded from: classes5.dex */
class C13953ou extends AbstractC13974sc {

    /* JADX INFO: renamed from: k4 */
    final /* synthetic */ C13856av f46700k4;

    public C13953ou(C13856av c13856av) {
        this.f46700k4 = c13856av;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
    public String getDelegateId() {
        return "System.Xml.XmlDocument.NodeRemovingDelegate";
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13974sc
    /* JADX INFO: renamed from: k4 */
    public void mo65207k4(Object obj, C13979sz c13979sz) {
        Iterator it = ((AbstractC7018k4) this.f46700k4).f19081x1.iterator();
        while (it.hasNext()) {
            ((AbstractC13974sc) it.next()).mo65207k4(obj, c13979sz);
        }
    }
}
