package com.aspose.slides.internal.p104ec;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.w6 */
/* JADX INFO: loaded from: classes3.dex */
public class C3653w6 extends AbstractC3629m4 {

    /* JADX INFO: renamed from: k4 */
    private final int f10127k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC3629m4 f10128kk;

    /* JADX INFO: renamed from: x1 */
    private C3609em f10129x1;

    public C3653w6(int i) {
        this.f10127k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final C3609em m14828k4() {
        return this.f10129x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC3629m4 m14831x1() {
        return this.f10128kk;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14692k4(C3134k4 c3134k4) {
        AbstractC3629m4 c3637ri;
        if ((C3623k4.m14763k4(c3134k4) & 65535) == 22) {
            C3609em c3609em = new C3609em(this.f10127k4);
            this.f10129x1 = c3609em;
            c3609em.mo14692k4(c3134k4);
        }
        int iM14763k4 = C3623k4.m14763k4(c3134k4);
        if (iM14763k4 == 13) {
            c3637ri = new C3637ri(this.f10127k4);
        } else if (iM14763k4 == 14) {
            c3637ri = new C3594ai();
        } else {
            if (iM14763k4 != 47 && iM14763k4 != 51) {
                throw new InvalidOperationException();
            }
            c3637ri = new C3633os(this.f10127k4);
        }
        this.f10128kk = c3637ri;
        this.f10128kk.mo14692k4(c3134k4);
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14697k4(C3149x1 c3149x1) {
        C3609em c3609em = this.f10129x1;
        if (c3609em != null) {
            c3609em.mo14697k4(c3149x1);
        }
        this.f10128kk.mo14697k4(c3149x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14829k4(C3609em c3609em) {
        this.f10129x1 = c3609em;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m14830k4(AbstractC3629m4 abstractC3629m4) {
        this.f10128kk = abstractC3629m4;
    }
}
