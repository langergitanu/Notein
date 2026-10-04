package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;

/* JADX INFO: loaded from: classes3.dex */
class ihc implements InterfaceC0901dh {

    /* JADX INFO: renamed from: k4 */
    public final Paragraph f5712k4;

    /* JADX INFO: renamed from: x1 */
    private final InterfaceC1134g7 f5713x1;

    public ihc(Paragraph paragraph) {
        this.f5712k4 = paragraph;
        this.f5713x1 = new jwp((ParagraphFormat) paragraph.getParagraphFormat());
    }

    @Override // com.aspose.slides.InterfaceC0901dh
    /* JADX INFO: renamed from: k4 */
    public final boolean mo5098k4() {
        return this.f5712k4.m2155du();
    }

    @Override // com.aspose.slides.InterfaceC0901dh
    /* JADX INFO: renamed from: kk */
    public final IGenericEnumerable<InterfaceC14342qd> mo5099kk() {
        return ((PortionCollection) this.f5712k4.getPortions()).m2299kk();
    }

    @Override // com.aspose.slides.InterfaceC0901dh
    /* JADX INFO: renamed from: x1 */
    public final InterfaceC1134g7 mo5100x1() {
        return this.f5713x1;
    }
}
