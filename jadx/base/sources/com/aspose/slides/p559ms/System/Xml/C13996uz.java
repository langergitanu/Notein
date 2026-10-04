package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.uz */
/* JADX INFO: loaded from: classes5.dex */
public class C13996uz extends AbstractC13992um {

    /* JADX INFO: renamed from: k4 */
    protected String f47036k4;

    /* JADX INFO: renamed from: x1 */
    protected String f47037x1;

    public C13996uz(C13945ne c13945ne, String str, String str2) {
        super(c13945ne);
        this.f47036k4 = str;
        this.f47037x1 = str2;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C13996uz(this);
    }

    public C13996uz(C13996uz c13996uz) {
        super(c13996uz);
        this.f47036k4 = c13996uz.f47036k4;
        this.f47037x1 = c13996uz.f47037x1;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13992um
    /* JADX INFO: renamed from: k4 */
    public boolean mo65156k4(AbstractC13901ga abstractC13901ga) {
        return C13851ai.m65152k4(abstractC13901ga.getLocalName(), this.f47036k4) && C13851ai.m65152k4(abstractC13901ga.getNamespaceURI(), this.f47037x1);
    }
}
