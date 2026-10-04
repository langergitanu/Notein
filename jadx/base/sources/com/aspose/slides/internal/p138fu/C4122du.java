package com.aspose.slides.internal.p138fu;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p151gj.C4327up;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p504xm.C12549du;
import com.aspose.slides.internal.p505xn.C12567ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.fu.du */
/* JADX INFO: loaded from: classes.dex */
public class C4122du extends C4127k4 {
    public C4122du(C4327up c4327up) {
        super(c4327up);
    }

    /* JADX INFO: renamed from: up */
    private C12009k4 m16488up() {
        return this.f11302m9 ? m16537jd() : this.f11299du;
    }

    @Override // com.aspose.slides.internal.p138fu.C4127k4
    /* JADX INFO: renamed from: k4 */
    public void mo16489k4(AbstractC3150x6 abstractC3150x6) {
        C4134x1 c4134x1 = new C4134x1(this.f11299du, m16488up());
        try {
            C4127k4.m16520k4(this.f11299du, abstractC3150x6, C12567ne.m58657k4(c4134x1.m16582k4()), C12567ne.m58660x1(c4134x1.m16582k4()));
        } finally {
            c4134x1.dispose();
        }
    }

    @Override // com.aspose.slides.internal.p138fu.C4127k4
    /* JADX INFO: renamed from: kk */
    public void mo16491kk(AbstractC3150x6 abstractC3150x6, int i) {
        C4134x1 c4134x1 = new C4134x1(this.f11299du, m16488up());
        try {
            C4133up c4133up = new C4133up();
            try {
                c4133up.m16580k4(c4134x1.m16582k4(), abstractC3150x6, i, false);
            } finally {
                c4133up.dispose();
            }
        } finally {
            c4134x1.dispose();
        }
    }

    @Override // com.aspose.slides.internal.p138fu.C4127k4
    /* JADX INFO: renamed from: x1 */
    public void mo16492x1(AbstractC3150x6 abstractC3150x6) {
        C4134x1 c4134x1 = new C4134x1(this.f11299du, m16488up());
        try {
            C4127k4.m16528x1(c4134x1.m16582k4(), abstractC3150x6);
        } finally {
            c4134x1.dispose();
        }
    }

    public C4122du(C12009k4 c12009k4, byte[] bArr) {
        m16544k4(c12009k4);
        this.f11302m9 = C12549du.m58492ix(bArr).m58546to();
    }

    @Override // com.aspose.slides.internal.p138fu.C4127k4
    /* JADX INFO: renamed from: k4 */
    public void mo16490k4(boolean z) {
    }

    @Override // com.aspose.slides.internal.p138fu.C4127k4
    /* JADX INFO: renamed from: x1 */
    public void mo16493x1(AbstractC3150x6 abstractC3150x6, int i) {
        C4134x1 c4134x1 = new C4134x1(this.f11299du, m16488up());
        try {
            if (this.f11299du.mo15753jd() == 8207) {
                c4134x1.m16583k4(m16535fa());
            }
            C4127k4.m16521k4(c4134x1.m16582k4(), abstractC3150x6, i);
            c4134x1.dispose();
        } catch (Throwable th) {
            c4134x1.dispose();
            throw th;
        }
    }
}
