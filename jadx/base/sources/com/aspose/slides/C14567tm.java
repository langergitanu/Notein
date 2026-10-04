package com.aspose.slides;

import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.tm */
/* JADX INFO: loaded from: classes3.dex */
class C14567tm {

    /* JADX INFO: renamed from: k4 */
    private C12003du f49163k4 = new C12003du();

    /* JADX INFO: renamed from: kk */
    private C12025x6 f49164kk = new C12025x6();

    /* JADX INFO: renamed from: to */
    private IErrorBarsFormat f49165to;

    /* JADX INFO: renamed from: x1 */
    private C0886d8 f49166x1;

    public C14567tm(boolean z, C0886d8 c0886d8) {
        this.f49165to = z ? c0886d8.m5012up().m64945h4().getErrorBarsYFormat() : c0886d8.m5012up().m64945h4().getErrorBarsXFormat();
        this.f49166x1 = c0886d8;
        C14365qy c14365qyM64941c5 = c0886d8.m5012up().m64941c5();
        c14365qyM64941c5.m69834fa().m506k4(c14365qyM64941c5.m69834fa().getStyle() + 1 <= 40 ? (byte) 0 : (byte) 1).CloneTo(this.f49163k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final IErrorBarsFormat m71247k4() {
        return this.f49165to;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71248k4(float f, float f2, float f3, float f4) {
        C14365qy c14365qyM64941c5 = this.f49166x1.m5012up().m64941c5();
        azo azoVarM7718x1 = im9.m7718x1(this.f49163k4.Clone(), (LineFormat) m71247k4().getFormat().getLine(), c14365qyM64941c5, 1.0f);
        azoVarM7718x1.m3914kk((byte) 2);
        C11896dy c11896dy = new C11896dy();
        try {
            c11896dy.m55547k4(new C12025x6(f, f2), new C12025x6(f3, f4));
            c14365qyM64941c5.m69870wy().mo64338k4((C11896dy) c11896dy.deepClone(), azoVarM7718x1, new C0962es(C12003du.f40505to.Clone()));
        } finally {
            c11896dy.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71249k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        m71248k4(c12025x6.m56897x1(), c12025x6.m56895kk(), c12025x62.m56897x1(), c12025x62.m56895kk());
    }
}
