package com.aspose.slides.internal.p104ec;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.y2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3661y2 extends AbstractC3629m4 {
    /* JADX INFO: renamed from: k4 */
    public abstract int mo14689k4();

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14692k4(C3134k4 c3134k4) {
        if ((c3134k4.m13382u4() & 65535) != (65535 & mo14689k4())) {
            throw new C3620j5();
        }
        mo14690x1(c3134k4);
    }

    /* JADX INFO: renamed from: x1 */
    public abstract void mo14690x1(C3134k4 c3134k4);

    /* JADX INFO: renamed from: x1 */
    public abstract void mo14691x1(C3149x1 c3149x1);

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14697k4(C3149x1 c3149x1) {
        c3149x1.m13446k4(mo14689k4() & 65535);
        mo14691x1(c3149x1);
    }
}
