package com.aspose.slides;

import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.xv */
/* JADX INFO: loaded from: classes3.dex */
final class C14819xv {

    /* JADX INFO: renamed from: kk */
    private C12025x6[] f50209kk;

    /* JADX INFO: renamed from: x1 */
    public final int f50211x1;

    /* JADX INFO: renamed from: to */
    private oju f50210to = new oju();

    /* JADX INFO: renamed from: du */
    private oju f50206du = new oju();

    /* JADX INFO: renamed from: h4 */
    private oju f50207h4 = new oju();

    /* JADX INFO: renamed from: k4 */
    public final C11896dy f50208k4 = new C11896dy();

    public C14819xv(int i) {
        this.f50211x1 = i;
        if (i == 3) {
            this.f50209kk = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 12);
        } else if (i == 1) {
            this.f50209kk = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73608k4(float f) {
        oju ojuVarClone = oju.m68617k4(this.f50210to, f).Clone();
        oju ojuVarClone2 = oju.m68618k4(ojuVarClone, 2).Clone();
        this.f50208k4.m55527fa();
        oju ojuVarClone3 = oju.m68622x1(this.f50206du, ojuVarClone2).Clone();
        int i = this.f50211x1;
        if (i == 0) {
            this.f50208k4.m55534k4(ojuVarClone3.f47836k4, ojuVarClone3.f47837x1, ojuVarClone.f47836k4, ojuVarClone.f47837x1);
            return;
        }
        if (i == 1) {
            oju ojuVarClone4 = oju.m68619k4(this.f50206du, ojuVarClone2).Clone();
            this.f50209kk[0] = new C12025x6(this.f50206du.f47836k4, ojuVarClone3.f47837x1);
            this.f50209kk[1] = new C12025x6(ojuVarClone4.f47836k4, this.f50206du.f47837x1);
            this.f50209kk[2] = new C12025x6(this.f50206du.f47836k4, ojuVarClone4.f47837x1);
            this.f50209kk[3] = new C12025x6(ojuVarClone3.f47836k4, this.f50206du.f47837x1);
            this.f50208k4.m55564kk(this.f50209kk);
            return;
        }
        if (i == 2) {
            this.f50208k4.m55578x1(new C12007ix(ojuVarClone3.f47836k4, ojuVarClone3.f47837x1, ojuVarClone.f47836k4, ojuVarClone.f47837x1));
            return;
        }
        if (i == 3) {
            oju ojuVarClone5 = oju.m68619k4(this.f50206du, ojuVarClone2).Clone();
            this.f50209kk[0] = new C12025x6(this.f50207h4.f47836k4, ojuVarClone3.f47837x1);
            this.f50209kk[1] = new C12025x6(ojuVarClone3.f47836k4, ojuVarClone3.f47837x1);
            this.f50209kk[2] = new C12025x6(ojuVarClone3.f47836k4, this.f50207h4.f47837x1);
            this.f50209kk[3] = new C12025x6(ojuVarClone5.f47836k4, this.f50207h4.f47837x1);
            this.f50209kk[4] = new C12025x6(ojuVarClone5.f47836k4, ojuVarClone3.f47837x1);
            this.f50209kk[5] = new C12025x6(this.f50207h4.f47836k4 + this.f50210to.f47836k4, ojuVarClone3.f47837x1);
            this.f50209kk[6] = new C12025x6(this.f50207h4.f47836k4 + this.f50210to.f47836k4, ojuVarClone5.f47837x1);
            this.f50209kk[7] = new C12025x6(ojuVarClone5.f47836k4, ojuVarClone5.f47837x1);
            this.f50209kk[8] = new C12025x6(ojuVarClone5.f47836k4, this.f50207h4.f47837x1 + this.f50210to.f47837x1);
            this.f50209kk[9] = new C12025x6(ojuVarClone3.f47836k4, this.f50207h4.f47837x1 + this.f50210to.f47837x1);
            this.f50209kk[10] = new C12025x6(ojuVarClone3.f47836k4, ojuVarClone5.f47837x1);
            this.f50209kk[11] = new C12025x6(this.f50207h4.f47836k4, ojuVarClone5.f47837x1);
            this.f50208k4.m55564kk(this.f50209kk);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73609k4(oju ojuVar, oju ojuVar2) {
        float fM67496rv;
        int i = this.f50211x1;
        if (i != 0) {
            if (i == 1) {
                fM67496rv = 2.0f;
            }
            ojuVar2.CloneTo(this.f50210to);
            ojuVar.CloneTo(this.f50206du);
            oju.m68622x1(this.f50206du, oju.m68618k4(this.f50210to, 2)).CloneTo(this.f50207h4);
        }
        fM67496rv = (float) C14116yg.m67496rv(2.0d);
        ojuVar2 = oju.m68617k4(ojuVar2, fM67496rv);
        ojuVar2.CloneTo(this.f50210to);
        ojuVar.CloneTo(this.f50206du);
        oju.m68622x1(this.f50206du, oju.m68618k4(this.f50210to, 2)).CloneTo(this.f50207h4);
    }
}
