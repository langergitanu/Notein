package com.aspose.slides;

import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.h0 */
/* JADX INFO: loaded from: classes3.dex */
class C1168h0 extends AbstractC14875z7 implements fsr, IDisposable {

    /* JADX INFO: renamed from: kk */
    private final C0834bx f5370kk;

    /* JADX INFO: renamed from: to */
    private AbstractC12002ck f5371to;

    /* JADX INFO: renamed from: x1 */
    private final C12009k4 f5372x1;

    public C1168h0(C12023wl c12023wl, InterfaceC1225hv interfaceC1225hv) {
        super(c12023wl.Clone());
        this.f5372x1 = new C12009k4(c12023wl.m56865x1(), c12023wl.m56862kk());
        this.f5370kk = new C0834bx(c12023wl.Clone(), interfaceC1225hv);
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f5370kk.m4346k4();
        this.f5372x1.dispose();
    }

    @Override // com.aspose.slides.fsr
    /* JADX INFO: renamed from: k4 */
    public final void mo3090k4(float f, AbstractC12008jd abstractC12008jd) {
        this.f5370kk.m4347k4(f);
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) this.f5372x1);
        try {
            abstractC12008jdM56582k4.mo17517k4(C12003du.m56460uz().Clone());
            abstractC12008jdM56582k4.mo17589x1(m6954x1(), 0, 0);
            abstractC12008jdM56582k4.dispose();
            this.f5370kk.m4349k4(this.f5372x1);
            abstractC12008jd.mo17517k4(C12003du.m56460uz().Clone());
            if (m74340k4() != null) {
                abstractC12008jd.mo17589x1(m74340k4(), 0, 0);
            }
            abstractC12008jd.mo17589x1(this.f5372x1, 0, 0);
        } catch (Throwable th) {
            if (abstractC12008jdM56582k4 != null) {
                abstractC12008jdM56582k4.dispose();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC12002ck m6954x1() {
        return this.f5371to;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m6955x1(AbstractC12002ck abstractC12002ck) {
        this.f5371to = abstractC12002ck;
    }
}
