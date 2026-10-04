package com.aspose.slides;

import android.content.Context;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.b9 */
/* JADX INFO: loaded from: classes3.dex */
class C0809b9 extends AbstractC14770x9 {

    /* JADX INFO: renamed from: kk */
    private final C13847mr f4143kk;

    /* JADX INFO: renamed from: k4 */
    private final g2y f4142k4 = new g2y();

    /* JADX INFO: renamed from: x1 */
    private final g2y f4144x1 = new g2y();

    public C0809b9(C13847mr c13847mr) {
        this.f4143kk = c13847mr;
    }

    /* JADX INFO: renamed from: dy */
    private azo m4049dy() {
        LineFormat lineFormat = (LineFormat) this.f4143kk.m64945h4().getFormat().getLine();
        if (lineFormat != null && lineFormat.getFillFormat().getFillType() != -1 && lineFormat.getFillFormat().getFillType() != 0) {
            return im9.m7718x1(m4050m9().Clone(), lineFormat, this.f4143kk.m64941c5(), 0.1f);
        }
        return new azo(m4050m9().Clone(), 0.1f);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.pm.PackageManager, com.aspose.slides.internal.wh.du] */
    /* JADX INFO: renamed from: m9 */
    private C12003du m4050m9() {
        im9.m7690k4(this.f4143kk.m64941c5().m69834fa().m506k4((byte) 0).Clone().Clone(), 0.75d);
        return Context.getPackageManager();
    }

    /* JADX INFO: renamed from: du */
    public final g2y m4051du() {
        return this.f4144x1;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73217kk(c14713vw.m72555k4());
        m73222to(c14713vw.m72556x1());
        this.f4142k4.m73210fa(c14713vw);
        this.f4144x1.m73210fa(c14713vw);
    }

    /* JADX INFO: renamed from: to */
    public final g2y m4052to() {
        return this.f4142k4;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        C11896dy c11896dy = new C11896dy();
        try {
            c11896dy.m55547k4(new C12025x6(m73227xk() + this.f4142k4.m73227xk(), m73206c6() + this.f4142k4.m73206c6()), new C12025x6(m73227xk() + this.f4144x1.m73227xk(), m73206c6() + this.f4144x1.m73206c6()));
            this.f4143kk.m64941c5().m69870wy().mo64338k4((C11896dy) c11896dy.deepClone(), m4049dy(), new C0962es(C12003du.f40505to.Clone()));
        } finally {
            c11896dy.dispose();
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }
}
