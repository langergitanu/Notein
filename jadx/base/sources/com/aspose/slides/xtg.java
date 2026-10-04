package com.aspose.slides;

import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: loaded from: classes3.dex */
class xtg<TLayout> implements InterfaceC1182h2<TLayout> {

    /* JADX INFO: renamed from: k4 */
    private final hhv f50202k4;

    /* JADX INFO: renamed from: x1 */
    private TLayout f50203x1;

    public xtg(TLayout tlayout, hhv hhvVar) {
        hhv hhvVar2 = new hhv();
        this.f50202k4 = hhvVar2;
        m73605k4(tlayout);
        hhvVar.CloneTo(hhvVar2);
    }

    @Override // com.aspose.slides.InterfaceC1182h2
    /* JADX INFO: renamed from: k4 */
    public final TLayout mo6969k4() {
        return this.f50203x1;
    }

    @Override // com.aspose.slides.InterfaceC1251ih
    /* JADX INFO: renamed from: k4 */
    public final void mo7635k4(AbstractC14897zn abstractC14897zn, AbstractC12024x1 abstractC12024x1) {
        hhv hhvVar = this.f50202k4;
        abstractC14897zn.mo64338k4(odu.m68469k4(hhvVar.f5506k4, AbstractC14092to.m67204k4((Object[]) hhvVar.f5507x1)), (azo) null, new C0962es(((C11999ar) abstractC12024x1).m56305h4().Clone()));
    }

    /* JADX INFO: renamed from: k4 */
    private void m73605k4(TLayout tlayout) {
        this.f50203x1 = tlayout;
    }
}
