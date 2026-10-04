package com.aspose.slides.internal.p104ec;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.ix */
/* JADX INFO: loaded from: classes3.dex */
class C3618ix extends AbstractC3661y2 {

    /* JADX INFO: renamed from: k4 */
    private final int f10052k4;

    /* JADX INFO: renamed from: kk */
    private String f10053kk;

    /* JADX INFO: renamed from: x1 */
    private long f10054x1;

    public C3618ix(int i) {
        this.f10052k4 = i;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: k4 */
    public int mo14689k4() {
        return 71;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14690x1(C3134k4 c3134k4) {
        long jM13384uz = c3134k4.m13384uz();
        this.f10054x1 = jM13384uz;
        this.f10053kk = C3623k4.m14765k4(c3134k4, (int) jM13384uz, AbstractC6747ar.m26643rv());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14760k4(String str) {
        this.f10053kk = str;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14691x1(C3149x1 c3149x1) {
        C3657x1.m14838x1(c3149x1, this.f10053kk, AbstractC6747ar.m26643rv());
    }
}
