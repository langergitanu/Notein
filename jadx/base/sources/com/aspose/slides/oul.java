package com.aspose.slides;

import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: loaded from: classes3.dex */
class oul extends AbstractC14770x9 {

    /* JADX INFO: renamed from: k4 */
    private C13847mr f47946k4;

    /* JADX INFO: renamed from: x1 */
    private g2y[] f47947x1;

    public oul(int i, C13847mr c13847mr) {
        this.f47946k4 = c13847mr;
        this.f47947x1 = new g2y[i];
        int i2 = 0;
        while (true) {
            g2y[] g2yVarArr = this.f47947x1;
            if (i2 >= g2yVarArr.length) {
                return;
            }
            g2yVarArr[i2] = new g2y();
            m73215k4(this.f47947x1[i2]);
            i2++;
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        m73217kk(c14713vw.m72555k4());
        m73222to(c14713vw.m72556x1());
        for (g2y g2yVar : m68864to()) {
            g2yVar.m73210fa(c14713vw);
        }
    }

    /* JADX INFO: renamed from: to */
    public final g2y[] m68864to() {
        return this.f47947x1;
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3482x1() {
        C12003du c12003duClone = igr.m7634x1(this.f47946k4.m64945h4().m734m9().Clone(), 0.25d).Clone();
        C12003du.m56400k4(255, c12003duClone.Clone()).CloneTo(c12003duClone);
        azo azoVar = new azo(c12003duClone.Clone(), 0.1f);
        azoVar.m3914kk((byte) 2);
        C11896dy c11896dy = new C11896dy();
        for (int i = 1; i < this.f47947x1.length; i++) {
            try {
                int i2 = i - 1;
                c11896dy.m55547k4(new C12025x6(this.f47947x1[i2].m73227xk(), this.f47947x1[i2].m73206c6()), new C12025x6(this.f47947x1[i].m73227xk(), this.f47947x1[i].m73206c6()));
            } catch (Throwable th) {
                c11896dy.dispose();
                throw th;
            }
        }
        this.f47946k4.m64941c5().m69870wy().mo64338k4((C11896dy) c11896dy.deepClone(), azoVar, new C0962es(C12003du.f40505to.Clone()));
        c11896dy.dispose();
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }
}
