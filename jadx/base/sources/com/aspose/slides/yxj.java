package com.aspose.slides;

import android.content.pm.PackageManager;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12023wl;

/* JADX INFO: loaded from: classes3.dex */
class yxj implements fsr {

    /* JADX INFO: renamed from: k4 */
    private AbstractC12002ck f50419k4;

    /* JADX INFO: renamed from: kk */
    private C12023wl f50420kk = new C12023wl();

    /* JADX INFO: renamed from: to */
    private boolean f50421to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC12002ck f50422x1;

    /* JADX INFO: renamed from: k4 */
    public final AbstractC12002ck m74133k4() {
        return this.f50419k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C12023wl m74137kk() {
        return this.f50420kk.Clone();
    }

    /* JADX INFO: renamed from: to */
    public final boolean m74138to() {
        return this.f50421to;
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC12002ck m74139x1() {
        return this.f50422x1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [float, int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [float, int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.content.pm.PackageInfo, int] */
    @Override // com.aspose.slides.fsr
    /* JADX INFO: renamed from: k4 */
    public final void mo3090k4(float f, AbstractC12008jd abstractC12008jd) {
        abstractC12008jd.mo17517k4(C12003du.m56460uz().Clone());
        C12016rv c12016rv = new C12016rv(0, 0);
        c12016rv.m56709k4(-PackageManager.getPackageInfo((String) f, (int) m74137kk().m56865x1()));
        c12016rv.m56714x1(-PackageManager.getPackageInfo((String) f, (int) m74137kk().m56862kk()));
        if (m74133k4() != null) {
            if (m74138to()) {
                abstractC12008jd.mo17589x1(m74133k4(), 0, 0);
            } else {
                abstractC12008jd.mo17589x1(m74133k4(), c12016rv.m56708k4(), c12016rv.m56713x1());
            }
        }
        abstractC12008jd.mo17589x1(m74139x1(), m74137kk().m56865x1() + c12016rv.m56708k4(), m74137kk().m56862kk() + c12016rv.m56713x1());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74140x1(AbstractC12002ck abstractC12002ck) {
        this.f50422x1 = abstractC12002ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74134k4(AbstractC12002ck abstractC12002ck) {
        this.f50419k4 = abstractC12002ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74135k4(C12023wl c12023wl) {
        this.f50420kk = c12023wl.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74136k4(boolean z) {
        this.f50421to = z;
    }
}
