package com.aspose.slides.internal.p104ec;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.qq */
/* JADX INFO: loaded from: classes3.dex */
class C3635qq extends AbstractC3661y2 {

    /* JADX INFO: renamed from: du */
    private String f10083du;

    /* JADX INFO: renamed from: k4 */
    private final int f10084k4;

    /* JADX INFO: renamed from: kk */
    private String f10085kk;

    /* JADX INFO: renamed from: to */
    private long f10086to;

    /* JADX INFO: renamed from: x1 */
    private long f10087x1;

    public C3635qq(int i) {
        this.f10084k4 = i;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: k4 */
    public int mo14689k4() {
        return 26;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m14786x1() {
        return this.f10085kk;
    }

    public C3635qq(int i, String str) {
        this.f10084k4 = i;
        this.f10085kk = str;
        this.f10083du = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14785k4(String str) {
        this.f10085kk = str;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14690x1(C3134k4 c3134k4) {
        long jM13384uz = c3134k4.m13384uz();
        this.f10087x1 = jM13384uz;
        this.f10085kk = C3624kk.m14768k4(c3134k4.m13372dy((int) jM13384uz), this.f10084k4);
        if ((c3134k4.m13382u4() & 65535) != 50) {
            throw new C3620j5();
        }
        long jM13384uz2 = c3134k4.m13384uz();
        this.f10086to = jM13384uz2;
        this.f10083du = C3623k4.m14765k4(c3134k4, (int) jM13384uz2, AbstractC6747ar.m26643rv());
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3661y2
    /* JADX INFO: renamed from: x1 */
    public void mo14691x1(C3149x1 c3149x1) {
        C3657x1.m14837x1(c3149x1, this.f10085kk, this.f10084k4);
        c3149x1.m13446k4(50);
        C3657x1.m14838x1(c3149x1, this.f10083du, AbstractC6747ar.m26643rv());
    }
}
