package com.aspose.slides.internal.p104ec;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.ne */
/* JADX INFO: loaded from: classes3.dex */
class C3631ne extends AbstractC3661y2 {

    /* JADX INFO: renamed from: k4 */
    private final int f10065k4;

    /* JADX INFO: renamed from: kk */
    private String f10066kk;

    /* JADX INFO: renamed from: x1 */
    private long f10067x1;

    public C3631ne(int i) {
        this.f10065k4 = i;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: k4 */
    public int mo14689k4() {
        return 25;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14690x1(C3134k4 c3134k4) {
        long jM13384uz = c3134k4.m13384uz();
        this.f10067x1 = jM13384uz;
        this.f10066kk = C3624kk.m14768k4(c3134k4.m13372dy((int) jM13384uz), this.f10065k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14782k4(String str) {
        this.f10066kk = str;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14691x1(C3149x1 c3149x1) {
        C3657x1.m14837x1(c3149x1, this.f10066kk, this.f10065k4);
    }
}
