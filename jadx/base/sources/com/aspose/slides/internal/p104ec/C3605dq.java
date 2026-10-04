package com.aspose.slides.internal.p104ec;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.dq */
/* JADX INFO: loaded from: classes3.dex */
class C3605dq extends AbstractC3661y2 {

    /* JADX INFO: renamed from: du */
    private String f10011du;

    /* JADX INFO: renamed from: k4 */
    private final int f10012k4;

    /* JADX INFO: renamed from: kk */
    private String f10013kk;

    /* JADX INFO: renamed from: to */
    private long f10014to;

    /* JADX INFO: renamed from: x1 */
    private long f10015x1;

    public C3605dq(int i) {
        this.f10012k4 = i;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: k4 */
    public int mo14689k4() {
        return 6;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14690x1(C3134k4 c3134k4) {
        long jM13384uz = c3134k4.m13384uz();
        this.f10015x1 = jM13384uz;
        this.f10013kk = C3624kk.m14768k4(c3134k4.m13372dy((int) jM13384uz), this.f10012k4);
        if ((c3134k4.m13382u4() & 65535) != 61) {
            throw new C3620j5();
        }
        long jM13384uz2 = c3134k4.m13384uz();
        this.f10014to = jM13384uz2;
        this.f10011du = C3624kk.m14768k4(c3134k4.m13372dy((int) jM13384uz2), this.f10012k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14713k4(String str) {
        this.f10013kk = str;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14691x1(C3149x1 c3149x1) {
        C3657x1.m14837x1(c3149x1, this.f10013kk, this.f10012k4);
        c3149x1.m13446k4(61);
        C3657x1.m14837x1(c3149x1, this.f10011du, this.f10012k4);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m14714x1(String str) {
        this.f10011du = str;
    }
}
