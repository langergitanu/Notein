package com.aspose.slides.internal.p104ec;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.ar */
/* JADX INFO: loaded from: classes3.dex */
public class C3596ar extends AbstractC3661y2 {

    /* JADX INFO: renamed from: k4 */
    private int f9992k4;

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: k4 */
    public int mo14689k4() {
        return this.f9992k4;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14690x1(C3134k4 c3134k4) {
        if ((c3134k4.m13384uz() & 4294967295L) != 0) {
            throw new C3620j5();
        }
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2, com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14692k4(C3134k4 c3134k4) {
        int iM13382u4 = c3134k4.m13382u4();
        this.f9992k4 = iM13382u4;
        if ((iM13382u4 & 65535) != 33 && (iM13382u4 & 65535) != 34) {
            throw new C3620j5();
        }
        mo14690x1(c3134k4);
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14691x1(C3149x1 c3149x1) {
        c3149x1.m13447k4(0L);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14693k4(boolean z) {
        this.f9992k4 = 33;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m14694x1() {
        return (this.f9992k4 & 65535) == 33;
    }
}
