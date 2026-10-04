package com.aspose.slides.internal.p104ec;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.qm */
/* JADX INFO: loaded from: classes3.dex */
public class C3634qm extends AbstractC3661y2 {

    /* JADX INFO: renamed from: k4 */
    private final int f10080k4;

    /* JADX INFO: renamed from: kk */
    private String f10081kk;

    /* JADX INFO: renamed from: x1 */
    private long f10082x1;

    public C3634qm(int i) {
        this.f10080k4 = i;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: k4 */
    public int mo14689k4() {
        return 4;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m14784x1() {
        return this.f10081kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14783k4(String str) {
        this.f10081kk = str;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14690x1(C3134k4 c3134k4) {
        long jM13384uz = c3134k4.m13384uz();
        this.f10082x1 = jM13384uz;
        this.f10081kk = C3624kk.m14768k4(c3134k4.m13372dy((int) jM13384uz), this.f10080k4);
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14691x1(C3149x1 c3149x1) {
        C3657x1.m14837x1(c3149x1, this.f10081kk, this.f10080k4);
    }
}
