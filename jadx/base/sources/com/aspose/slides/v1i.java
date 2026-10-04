package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;

/* JADX INFO: loaded from: classes3.dex */
class v1i<TModel> extends OutputFile {

    /* JADX INFO: renamed from: k4 */
    private TemplateContext<TModel> f49454k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC3150x6 f49455kk;

    /* JADX INFO: renamed from: to */
    private final ITemplateEngine f49456to;

    /* JADX INFO: renamed from: x1 */
    private String f49457x1;

    public v1i(ITemplateEngine iTemplateEngine) {
        this.f49456to = iTemplateEngine;
    }

    /* JADX INFO: renamed from: k4 */
    public final TemplateContext<TModel> m72050k4() {
        return this.f49454k4;
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC3150x6 m72053kk() {
        return this.f49455kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m72054x1() {
        return this.f49457x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72051k4(TemplateContext<TModel> templateContext) {
        this.f49454k4 = templateContext;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m72055x1(AbstractC3150x6 abstractC3150x6) {
        this.f49455kk = abstractC3150x6;
    }

    @Override // com.aspose.slides.OutputFile
    /* JADX INFO: renamed from: k4 */
    public void mo2108k4(AbstractC3150x6 abstractC3150x6) {
        byte[] bArrMo26677to = AbstractC6747ar.m26635ix().mo26677to(this.f49456to.compile(m72054x1(), m72050k4()));
        abstractC3150x6.write(bArrMo26677to, 0, bArrMo26677to.length);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72052k4(String str) {
        this.f49457x1 = str;
    }
}
