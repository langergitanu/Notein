package com.aspose.slides;

/* JADX INFO: renamed from: com.aspose.slides.cc */
/* JADX INFO: loaded from: classes3.dex */
class C0849cc extends ixg {
    public C0849cc(C13847mr[] c13847mrArr, AbstractC14763x3 abstractC14763x3, AbstractC14763x3 abstractC14763x32) {
        super(abstractC14763x3, abstractC14763x32);
        for (C13847mr c13847mr : c13847mrArr) {
            C13695jo c13695jo = new C13695jo(this, c13847mr);
            ((ixg) this).f45391k4.addItem(c13695jo);
            m73215k4(c13695jo);
        }
        m63153m9();
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: O_ */
    public int mo3480O_() {
        return 2;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.mo5524U_();
        }
    }
}
