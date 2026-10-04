package com.aspose.slides.internal.p138fu;

import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.fu.m9 */
/* JADX INFO: loaded from: classes.dex */
public class C4130m9 implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private boolean f11303k4;

    /* JADX INFO: renamed from: kk */
    private final int f11304kk;

    /* JADX INFO: renamed from: x1 */
    private AbstractC12008jd f11305x1;

    public C4130m9(C4127k4 c4127k4) {
        this(c4127k4.m16534dy());
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        m16572k4(true);
        C14094ts.m67303k4(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16570k4() {
        AbstractC12008jd abstractC12008jd = this.f11305x1;
        if (abstractC12008jd != null) {
            abstractC12008jd.mo17478dy(this.f11304kk);
            this.f11305x1.dispose();
            this.f11305x1 = null;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC12008jd m16573x1() {
        return this.f11305x1;
    }

    public C4130m9(AbstractC12002ck abstractC12002ck) {
        this.f11303k4 = false;
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4(abstractC12002ck);
        this.f11305x1 = abstractC12008jdM56582k4;
        this.f11304kk = abstractC12008jdM56582k4.mo17482ix();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m16571k4(float f, float f2) {
        this.f11305x1.mo17584x1(f, f2);
    }

    /* JADX INFO: renamed from: k4 */
    public void m16572k4(boolean z) {
        if (this.f11303k4) {
            return;
        }
        m16570k4();
        this.f11303k4 = true;
    }
}
