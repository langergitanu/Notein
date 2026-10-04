package com.aspose.slides.internal.p104ec;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.p559ms.System.C14047bz;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.os */
/* JADX INFO: loaded from: classes3.dex */
public class C3633os extends AbstractC3629m4 {

    /* JADX INFO: renamed from: c5 */
    private long f10068c5;

    /* JADX INFO: renamed from: ck */
    private C14047bz f10069ck = new C14047bz();

    /* JADX INFO: renamed from: du */
    private String f10070du;

    /* JADX INFO: renamed from: dy */
    private long f10071dy;

    /* JADX INFO: renamed from: fa */
    private long f10072fa;

    /* JADX INFO: renamed from: h4 */
    private long f10073h4;

    /* JADX INFO: renamed from: jd */
    private String f10074jd;

    /* JADX INFO: renamed from: k4 */
    private final int f10075k4;

    /* JADX INFO: renamed from: kk */
    private int f10076kk;

    /* JADX INFO: renamed from: m9 */
    private C3609em f10077m9;

    /* JADX INFO: renamed from: to */
    private long f10078to;

    /* JADX INFO: renamed from: x1 */
    private C3665zj f10079x1;

    public C3633os(int i) {
        this.f10075k4 = i;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14692k4(C3134k4 c3134k4) {
        if ((C3623k4.m14763k4(c3134k4) & 65535) == 51) {
            C3665zj c3665zj = new C3665zj();
            this.f10079x1 = c3665zj;
            c3665zj.mo14692k4(c3134k4);
        }
        int iM13382u4 = c3134k4.m13382u4();
        this.f10076kk = iM13382u4;
        if ((iM13382u4 & 65535) != 47) {
            throw new C3620j5();
        }
        this.f10078to = c3134k4.m13384uz();
        long jM13384uz = c3134k4.m13384uz();
        this.f10073h4 = jM13384uz;
        this.f10070du = C3624kk.m14768k4(c3134k4.m13372dy((int) jM13384uz), this.f10075k4);
        if ((c3134k4.m13384uz() & 4294967295L) != 0) {
            throw new C3620j5();
        }
        if ((c3134k4.m13382u4() & 65535) != 0) {
            throw new C3620j5();
        }
        if ((C3623k4.m14763k4(c3134k4) & 65535) == 22) {
            C3609em c3609em = new C3609em(this.f10075k4);
            this.f10077m9 = c3609em;
            c3609em.mo14692k4(c3134k4);
        }
        if ((c3134k4.m13382u4() & 65535) != 48) {
            throw new C3620j5();
        }
        this.f10071dy = c3134k4.m13384uz();
        long jM13384uz2 = c3134k4.m13384uz();
        this.f10068c5 = jM13384uz2;
        this.f10074jd = C3624kk.m14768k4(c3134k4.m13372dy((int) jM13384uz2), this.f10075k4);
        c3134k4.m13384uz();
        c3134k4.m13382u4();
        this.f10069ck = new C14047bz(c3134k4.m13372dy(16));
        this.f10072fa = c3134k4.m13384uz();
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14697k4(C3149x1 c3149x1) {
        C3665zj c3665zj = this.f10079x1;
        if (c3665zj != null) {
            c3665zj.mo14697k4(c3149x1);
        }
        c3149x1.m13446k4(47);
        c3149x1.m13447k4(this.f10078to & 4294967295L);
        C3657x1.m14837x1(c3149x1, this.f10070du, this.f10075k4);
        c3149x1.m13447k4(0L);
        c3149x1.m13446k4(0);
        C3609em c3609em = this.f10077m9;
        if (c3609em != null) {
            c3609em.mo14697k4(c3149x1);
        }
        c3149x1.m13446k4(48);
        c3149x1.m13447k4(this.f10071dy & 4294967295L);
        C3657x1.m14837x1(c3149x1, this.f10074jd, this.f10075k4);
        c3149x1.m13447k4(0L);
        c3149x1.m13446k4(0);
        c3149x1.m13450k4(this.f10069ck.m66539k4());
        c3149x1.m13447k4(this.f10072fa & 4294967295L);
    }
}
