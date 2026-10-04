package com.aspose.slides.internal.p104ec;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.dy */
/* JADX INFO: loaded from: classes3.dex */
class C3607dy extends AbstractC3598bs {

    /* JADX INFO: renamed from: k4 */
    private int f10020k4;

    /* JADX INFO: renamed from: kk */
    private int f10021kk;

    /* JADX INFO: renamed from: x1 */
    private int f10022x1;

    /* JADX INFO: renamed from: k4 */
    private int m14719k4(int i) {
        return (C14080ne.m66994m9(Double.valueOf(C14116yg.m67469du(2.0d, 16.0d - ((double) i)))) - 1) << i;
    }

    /* JADX INFO: renamed from: x1 */
    private int m14721x1(int i) {
        return C14080ne.m66994m9(Double.valueOf(C14116yg.m67469du(2.0d, 16.0d - ((double) i)))) - 1;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m14722k4(int i, int i2, int i3) {
        this.f10022x1 = i2 - 1;
        int iM14720k4 = m14720k4(i3);
        int iM67507x1 = C14116yg.m67507x1(i - 3, 65535 >> iM14720k4);
        this.f10021kk = iM67507x1;
        this.f10020k4 = ((iM67507x1 & 65535) | ((this.f10022x1 << (16 - iM14720k4)) & 65535)) & 65535;
        return iM67507x1 + 3;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3598bs
    /* JADX INFO: renamed from: x1 */
    public void mo14695x1(C3149x1 c3149x1) {
        C3152yj c3152yj = (C3152yj) C7019kk.m27452k4((Object) c3149x1.m13442k4(), C3152yj.class);
        int iM14720k4 = m14720k4(c3149x1.m13442k4().getPosition());
        int i = 16 - iM14720k4;
        this.f10022x1 = ((m14719k4(i) & (this.f10020k4 & 65535)) >> i) + 1;
        this.f10021kk = (m14721x1(iM14720k4) & this.f10020k4 & 65535) + 3;
        for (int i2 = 0; i2 < this.f10021kk; i2++) {
            c3149x1.m13443k4(c3152yj.getBuffer()[(int) (c3149x1.m13442k4().getPosition() - ((long) this.f10022x1))]);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private int m14720k4(long j) {
        int iM66994m9 = C14080ne.m66994m9(Double.valueOf(C14116yg.m67501x1(C14116yg.m67476k4(j, 2.0d))));
        if (iM66994m9 < 4) {
            return 4;
        }
        return iM66994m9;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14692k4(C3134k4 c3134k4) {
        this.f10020k4 = (((c3134k4.m13387yj() & 255) << 8) + (c3134k4.m13387yj() & 255)) & 65535;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14697k4(C3149x1 c3149x1) {
        c3149x1.m13446k4(this.f10020k4 & 65535);
    }
}
