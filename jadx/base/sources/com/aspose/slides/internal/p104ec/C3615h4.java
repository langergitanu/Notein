package com.aspose.slides.internal.p104ec;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.h4 */
/* JADX INFO: loaded from: classes3.dex */
class C3615h4 extends AbstractC3629m4 {

    /* JADX INFO: renamed from: k4 */
    private long f10044k4;

    /* JADX INFO: renamed from: kk */
    private byte f10045kk;

    /* JADX INFO: renamed from: x1 */
    private byte f10046x1;

    /* JADX INFO: renamed from: k4 */
    public final long m14737k4() {
        return this.f10044k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m14740x1() {
        return this.f10045kk;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14738k4(byte b) {
        this.f10046x1 = b;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m14741x1(byte b) {
        this.f10045kk = b;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14739k4(long j) {
        this.f10044k4 = j;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14692k4(C3134k4 c3134k4) {
        int iM13382u4 = c3134k4.m13382u4();
        int i = 65535 & iM13382u4;
        this.f10044k4 = ((long) (iM13382u4 & 4095)) & 4294967295L;
        this.f10046x1 = (byte) ((i >> 12) & 7);
        this.f10045kk = (byte) ((i >> 15) & 1);
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14697k4(C3149x1 c3149x1) {
        c3149x1.m13446k4(((((((int) (this.f10044k4 & C18177fb.f54859s)) & 65535) + (((this.f10046x1 & 255) << 12) & 65535)) & 65535) + (((this.f10045kk & 255) << 15) & 65535)) & 65535);
    }
}
