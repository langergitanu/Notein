package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.qz */
/* JADX INFO: loaded from: classes3.dex */
class C14367qz<TObject> extends C14842yc {
    public C14367qz(TemplateContext<TObject> templateContext, AbstractC3124b3 abstractC3124b3) {
        m69964k4((TemplateContext) templateContext);
        this.f50311k4 = abstractC3124b3;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m69962k4(String str) {
        return str;
    }

    /* JADX INFO: renamed from: kk */
    public final TemplateContext<TObject> m69966kk() {
        return m69968x1();
    }

    /* JADX INFO: renamed from: x1 */
    public final TemplateContext<TObject> m69968x1() {
        return (TemplateContext) C7019kk.m27452k4(this.f50312x1, TemplateContext.class);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69963k4(int i) {
        this.f50311k4.mo13316k4(i);
    }

    /* JADX INFO: renamed from: kk */
    public final void m69967kk(String str) {
        this.f50311k4.mo13304k4(str);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m69969x1(String str) {
        this.f50311k4.mo13304k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69964k4(TemplateContext<TObject> templateContext) {
        this.f50312x1 = templateContext;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m69970x1(String str, t8o<String, Integer> t8oVar, t8o<String, Integer> t8oVar2, omh<t8o<String, Integer>, t8o<String, Integer>, Boolean>... omhVarArr) {
        this.f50311k4.mo13304k4(t8oVar.m71032k4());
        for (omh<t8o<String, Integer>, t8o<String, Integer>, Boolean> omhVar : omhVarArr) {
            this.f50311k4.mo13304k4(omhVar.m68690k4().m71032k4());
            this.f50311k4.mo13304k4(omhVar.m68691x1().m71032k4());
        }
        this.f50311k4.mo13304k4(t8oVar2.m71032k4());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69965k4(String str, t8o<String, Integer> t8oVar, t8o<String, Integer> t8oVar2, omh<t8o<String, Integer>, t8o<String, Integer>, Boolean>... omhVarArr) {
        m69970x1(str, t8oVar, t8oVar2, omhVarArr);
    }
}
