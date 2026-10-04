package com.aspose.slides.internal.p504xm;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.xm.x1 */
/* JADX INFO: loaded from: classes5.dex */
public class C12554x1 {

    /* JADX INFO: renamed from: c5 */
    public int f42055c5;

    /* JADX INFO: renamed from: ck */
    public long f42056ck;

    /* JADX INFO: renamed from: du */
    public int f42057du;

    /* JADX INFO: renamed from: dy */
    public long f42058dy;

    /* JADX INFO: renamed from: fa */
    public long f42059fa;

    /* JADX INFO: renamed from: h4 */
    public int f42060h4;

    /* JADX INFO: renamed from: jd */
    public int f42061jd;

    /* JADX INFO: renamed from: kk */
    public int f42063kk;

    /* JADX INFO: renamed from: m9 */
    public long f42064m9;

    /* JADX INFO: renamed from: to */
    public int f42065to;

    /* JADX INFO: renamed from: k4 */
    public boolean f42062k4 = false;

    /* JADX INFO: renamed from: x1 */
    public int f42066x1 = 40;

    /* JADX INFO: renamed from: k4 */
    public final int m58548k4() {
        int i = this.f42060h4;
        if ((i & 65535) == 32) {
            return (this.f42064m9 & 4294967295L) == 3 ? 12 : 0;
        }
        if ((i & 65535) == 24) {
            return 0;
        }
        long j = this.f42056ck;
        return ((j & 4294967295L) != 0 ? (int) j : 1 << (i & 65535)) * 4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58549k4(C3134k4 c3134k4) {
        int iM13386x6 = c3134k4.m13386x6();
        this.f42066x1 = iM13386x6;
        if (iM13386x6 == 12) {
            this.f42066x1 = 40;
            this.f42063kk = c3134k4.m13382u4() & 65535;
            this.f42065to = c3134k4.m13382u4() & 65535;
            this.f42057du = c3134k4.m13382u4();
            this.f42060h4 = c3134k4.m13382u4();
            return;
        }
        if (iM13386x6 != 19) {
            this.f42063kk = c3134k4.m13386x6();
            this.f42065to = c3134k4.m13386x6();
            this.f42057du = c3134k4.m13382u4();
            this.f42060h4 = c3134k4.m13382u4();
            this.f42064m9 = c3134k4.m13384uz();
            this.f42058dy = c3134k4.m13384uz();
            this.f42055c5 = c3134k4.m13386x6();
            this.f42061jd = c3134k4.m13386x6();
            this.f42056ck = c3134k4.m13384uz();
            this.f42059fa = c3134k4.m13384uz();
            return;
        }
        c3134k4.m13386x6();
        c3134k4.m13386x6();
        c3134k4.m13382u4();
        c3134k4.m13382u4();
        c3134k4.m13384uz();
        c3134k4.m13384uz();
        c3134k4.m13386x6();
        c3134k4.m13386x6();
        c3134k4.m13384uz();
        c3134k4.m13384uz();
        this.f42062k4 = true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58550k4(C3149x1 c3149x1) {
        c3149x1.m13455x1(this.f42066x1);
        c3149x1.m13455x1(this.f42063kk);
        c3149x1.m13455x1(this.f42065to);
        c3149x1.m13448k4((short) this.f42057du);
        c3149x1.m13448k4((short) this.f42060h4);
        c3149x1.m13455x1((int) this.f42064m9);
        c3149x1.m13455x1((int) this.f42058dy);
        c3149x1.m13455x1(this.f42055c5);
        c3149x1.m13455x1(this.f42061jd);
        c3149x1.m13455x1((int) this.f42056ck);
        c3149x1.m13455x1((int) this.f42059fa);
    }
}
