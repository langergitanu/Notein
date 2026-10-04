package com.aspose.slides.internal.p104ec;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.to */
/* JADX INFO: loaded from: classes3.dex */
class C3643to extends AbstractC3629m4 {

    /* JADX INFO: renamed from: k4 */
    private C3615h4 f10105k4;

    /* JADX INFO: renamed from: x1 */
    private C3606du f10106x1;

    /* JADX INFO: renamed from: k4 */
    public final C3615h4 m14800k4() {
        return this.f10105k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final C3606du m14803x1() {
        return this.f10106x1;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14692k4(C3134k4 c3134k4) {
        C3615h4 c3615h4 = new C3615h4();
        this.f10105k4 = c3615h4;
        c3615h4.mo14692k4(c3134k4);
        C3606du c3606du = new C3606du(((this.f10105k4.m14737k4() & 4294967295L) + 3) & 4294967295L, (this.f10105k4.m14740x1() & 255) == 1);
        this.f10106x1 = c3606du;
        c3606du.mo14692k4(c3134k4);
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14697k4(C3149x1 c3149x1) {
        this.f10105k4.mo14697k4(c3149x1);
        this.f10106x1.mo14697k4(c3149x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14801k4(C3606du c3606du) {
        this.f10106x1 = c3606du;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14802k4(C3615h4 c3615h4) {
        this.f10105k4 = c3615h4;
    }
}
