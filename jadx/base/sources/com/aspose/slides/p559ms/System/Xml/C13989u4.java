package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.internal.p418tf.AbstractC10929m9;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.u4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13989u4 extends C13915ix {
    public C13989u4(C13945ne c13945ne) {
        super(c13945ne);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.C13915ix, com.aspose.slides.internal.p418tf.AbstractC10929m9, com.aspose.slides.p559ms.System.InterfaceC14059g8
    /* JADX INFO: renamed from: k4 */
    public AbstractC10929m9 deepClone() {
        return new C13989u4(this);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13992um, com.aspose.slides.internal.p418tf.AbstractC10929m9
    /* JADX INFO: renamed from: x1 */
    public boolean mo21770x1() {
        if (mo21835to() == 0) {
            AbstractC13901ga abstractC13901ga = (AbstractC13901ga) ((C13945ne) mo21834kk()).mo21844fa();
            if (abstractC13901ga.getNodeType() == 1 && mo65156k4(abstractC13901ga)) {
                m66271k4(1);
                return true;
            }
        }
        return super.mo21770x1();
    }

    public C13989u4(C13989u4 c13989u4) {
        super(c13989u4);
    }
}
