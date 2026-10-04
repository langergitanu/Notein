package com.aspose.slides.internal.p104ec;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.yd */
/* JADX INFO: loaded from: classes3.dex */
class C3663yd extends AbstractC3661y2 {

    /* JADX INFO: renamed from: du */
    private String f10156du;

    /* JADX INFO: renamed from: k4 */
    private final int f10157k4;

    /* JADX INFO: renamed from: kk */
    private String f10158kk;

    /* JADX INFO: renamed from: to */
    private long f10159to;

    /* JADX INFO: renamed from: x1 */
    private long f10160x1;

    public C3663yd(int i) {
        this.f10157k4 = i;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: k4 */
    public int mo14689k4() {
        return 12;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14690x1(C3134k4 c3134k4) {
        long jM13384uz = c3134k4.m13384uz();
        this.f10160x1 = jM13384uz;
        if ((4294967295L & jM13384uz) > 1015) {
            throw new C3620j5();
        }
        this.f10158kk = C3624kk.m14768k4(c3134k4.m13372dy((int) jM13384uz), this.f10157k4);
        if ((c3134k4.m13382u4() & 65535) != 60) {
            throw new C3620j5();
        }
        long jM13384uz2 = c3134k4.m13384uz();
        this.f10159to = jM13384uz2;
        this.f10156du = C3623k4.m14765k4(c3134k4, (int) jM13384uz2, AbstractC6747ar.m26643rv());
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14691x1(C3149x1 c3149x1) {
        if ((this.f10160x1 & 4294967295L) > 1015) {
            throw new C3620j5();
        }
        C3657x1.m14837x1(c3149x1, this.f10158kk, this.f10157k4);
        c3149x1.m13446k4(60);
        C3657x1.m14838x1(c3149x1, this.f10156du, AbstractC6747ar.m26643rv());
    }
}
