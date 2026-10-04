package com.aspose.slides;

import android.content.pm.PackageManager;
import com.aspose.slides.internal.p151gj.C4329x6;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;

/* JADX INFO: loaded from: classes3.dex */
class etr implements fsr {

    /* JADX INFO: renamed from: k4 */
    private AbstractC12002ck f4874k4;

    /* JADX INFO: renamed from: kk */
    private C4329x6 f4875kk = new C4329x6();

    /* JADX INFO: renamed from: x1 */
    private AbstractC12002ck f4876x1;

    /* JADX INFO: renamed from: k4 */
    public final AbstractC12002ck m5695k4() {
        return this.f4874k4;
    }

    /* JADX INFO: renamed from: kk */
    public final C4329x6 m5698kk() {
        return this.f4875kk.Clone();
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC12002ck m5699x1() {
        return this.f4876x1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [float, int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.content.pm.PackageInfo, int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [float, int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.content.pm.PackageInfo, int] */
    @Override // com.aspose.slides.fsr
    /* JADX INFO: renamed from: k4 */
    public final void mo3090k4(float f, AbstractC12008jd abstractC12008jd) throws PackageManager.NameNotFoundException {
        abstractC12008jd.mo17517k4(C12003du.m56460uz().Clone());
        abstractC12008jd.mo17589x1(m5695k4(), 0, 0);
        if (m5699x1() != null) {
            abstractC12008jd.mo17589x1(m5699x1(), (int) PackageManager.getPackageInfo((String) f, (int) m5698kk().f11827kk), (int) PackageManager.getPackageInfo((String) f, (int) m5698kk().f11828to));
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m5700x1(AbstractC12002ck abstractC12002ck) {
        this.f4876x1 = abstractC12002ck;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5696k4(C4329x6 c4329x6) {
        this.f4875kk = c4329x6.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5697k4(AbstractC12002ck abstractC12002ck) {
        this.f4874k4 = abstractC12002ck;
    }
}
