package com.aspose.slides.internal.p104ec;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.zj */
/* JADX INFO: loaded from: classes3.dex */
class C3665zj extends AbstractC3661y2 {

    /* JADX INFO: renamed from: k4 */
    private long f10173k4;

    /* JADX INFO: renamed from: x1 */
    private byte[] f10174x1;

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: k4 */
    public int mo14689k4() {
        return 51;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14690x1(C3134k4 c3134k4) {
        long jM13384uz = c3134k4.m13384uz();
        this.f10173k4 = jM13384uz;
        this.f10174x1 = c3134k4.m13372dy((int) jM13384uz);
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14691x1(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f10173k4 & 4294967295L);
        c3149x1.m13450k4(this.f10174x1);
    }
}
