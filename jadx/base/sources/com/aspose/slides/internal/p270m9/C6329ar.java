package com.aspose.slides.internal.p270m9;

import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.InterfaceC5808uz;
import com.aspose.slides.internal.p447up.C11539rv;
import com.aspose.slides.internal.p517y2.InterfaceC12777qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.m9.ar */
/* JADX INFO: loaded from: classes4.dex */
public class C6329ar extends C6357yd {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC12777qq f17995k4;

    public C6329ar(C11539rv c11539rv, InterfaceC12777qq interfaceC12777qq, C6344m9 c6344m9) {
        super(c11539rv, c6344m9);
        this.f17995k4 = interfaceC12777qq;
    }

    @Override // com.aspose.slides.internal.p270m9.AbstractC6355x1
    /* JADX INFO: renamed from: k4 */
    public AbstractC6355x1 mo25907k4(String str) {
        return (AbstractC6355x1) m26040x1().mo26008x1(str, this.f17995k4);
    }

    @Override // com.aspose.slides.internal.p270m9.C6357yd, com.aspose.slides.internal.p270m9.AbstractC6355x1
    /* JADX INFO: renamed from: k4 */
    public void mo25908k4(int i, AbstractC5788h4 abstractC5788h4, boolean z) {
        super.mo25908k4(i, abstractC5788h4, z);
        C11539rv c11539rvMo8439k4 = ((InterfaceC5808uz) this.f17995k4).mo8439k4(null);
        if (c11539rvMo8439k4 != null) {
            c11539rvMo8439k4.m54526k4(i, abstractC5788h4);
            c11539rvMo8439k4.m54527k4(i, z);
            c11539rvMo8439k4.m54531x1(i, false);
        }
    }
}
