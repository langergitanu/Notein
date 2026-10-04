package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.ar */
/* JADX INFO: loaded from: classes5.dex */
public class C13855ar extends AbstractC13992um {

    /* JADX INFO: renamed from: k4 */
    private String f46346k4;

    public C13855ar(C13855ar c13855ar) {
        super(c13855ar);
        this.f46346k4 = c13855ar.f46346k4;
    }

    @Override // com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C13855ar(this);
    }

    public C13855ar(C13945ne c13945ne, String str) {
        super(c13945ne);
        this.f46346k4 = str;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13992um
    /* JADX INFO: renamed from: k4 */
    public boolean mo65156k4(AbstractC13901ga abstractC13901ga) {
        return C13851ai.m65152k4(abstractC13901ga.getNamespaceURI(), this.f46346k4);
    }
}
