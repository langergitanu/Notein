package com.aspose.slides.internal.p104ec;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.v4 */
/* JADX INFO: loaded from: classes3.dex */
class C3650v4 extends AbstractC3661y2 {

    /* JADX INFO: renamed from: k4 */
    private long f10117k4;

    /* JADX INFO: renamed from: x1 */
    private int f10118x1;

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: k4 */
    public int mo14689k4() {
        return 3;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m14815x1() {
        return this.f10118x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14814k4(int i) {
        this.f10118x1 = i;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14690x1(C3134k4 c3134k4) {
        this.f10117k4 = c3134k4.m13384uz();
        this.f10118x1 = c3134k4.m13382u4();
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14691x1(C3149x1 c3149x1) {
        c3149x1.m13447k4(2L);
        c3149x1.m13446k4(this.f10118x1 & 65535);
    }
}
