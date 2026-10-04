package com.aspose.slides;

import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: loaded from: classes3.dex */
class hmm extends otz {

    /* JADX INFO: renamed from: k4 */
    private z3t f5535k4;

    public hmm(z3t z3tVar) {
        this.f5535k4 = z3tVar;
    }

    @Override // com.aspose.slides.otz
    /* JADX INFO: renamed from: dy */
    public boolean mo6841dy() {
        return false;
    }

    @Override // com.aspose.slides.otz
    /* JADX INFO: renamed from: k4 */
    public void mo6842k4(C11896dy c11896dy) {
        this.f5535k4.m74306k4(false);
        m68830k4((LineFormat) this.f5535k4.m74307kk().getFormat().getLine(), this.f5535k4.m74304k4().m64941c5(), this.f5535k4.m74309x1().Clone(), m68828jd(), new C14093tq<>());
        this.f5535k4.m74306k4(true);
    }

    @Override // com.aspose.slides.otz
    /* JADX INFO: renamed from: m9 */
    public LineFormat mo6843m9() {
        return (LineFormat) this.f5535k4.m74307kk().getFormat().getLine();
    }

    @Override // com.aspose.slides.otz
    /* JADX INFO: renamed from: to */
    public int mo6844to() {
        return m68827ck() ? 2 : 1;
    }
}
