package com.aspose.slides;

/* JADX INFO: renamed from: com.aspose.slides.f6 */
/* JADX INFO: loaded from: classes3.dex */
class C0978f6 extends AbstractC14611u0<IHyperlinkContainer, C0978f6> {

    /* JADX INFO: renamed from: k4 */
    public static final C0978f6 f4967k4 = new C0978f6();

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int mo4124k4(IHyperlinkContainer iHyperlinkContainer) {
        return ((r0.m71465x1(iHyperlinkContainer.getHyperlinkClick()) - 324743029) * 486187739) + C0817bh.f4203k4.m71465x1(iHyperlinkContainer.getHyperlinkMouseOver());
    }

    @Override // com.aspose.slides.AbstractC14611u0
    /* JADX INFO: renamed from: k4, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo4125k4(IHyperlinkContainer iHyperlinkContainer, IHyperlinkContainer iHyperlinkContainer2) {
        C0817bh c0817bh = C0817bh.f4203k4;
        return c0817bh.equals(iHyperlinkContainer.getHyperlinkClick(), iHyperlinkContainer2.getHyperlinkClick()) && c0817bh.equals(iHyperlinkContainer.getHyperlinkMouseOver(), iHyperlinkContainer2.getHyperlinkMouseOver());
    }
}
