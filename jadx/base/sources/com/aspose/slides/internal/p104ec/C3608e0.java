package com.aspose.slides.internal.p104ec;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.e0 */
/* JADX INFO: loaded from: classes3.dex */
class C3608e0 extends AbstractC3661y2 {

    /* JADX INFO: renamed from: k4 */
    private long f10023k4;

    /* JADX INFO: renamed from: x1 */
    private long f10024x1;

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: k4 */
    public int mo14689k4() {
        return 8;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14690x1(C3134k4 c3134k4) {
        this.f10023k4 = c3134k4.m13384uz();
        long jM13384uz = c3134k4.m13384uz();
        this.f10024x1 = jM13384uz;
        if ((jM13384uz & 4294967295L) != 0) {
            throw new C3620j5();
        }
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14691x1(C3149x1 c3149x1) {
        c3149x1.m13447k4(4L);
        c3149x1.m13447k4(0L);
    }
}
