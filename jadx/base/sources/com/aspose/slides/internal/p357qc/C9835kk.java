package com.aspose.slides.internal.p357qc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p416tb.C10894bv;
import com.aspose.slides.internal.p416tb.C10898dy;
import com.aspose.slides.internal.p416tb.C10922yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.qc.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C9835kk extends C10894bv {

    /* JADX INFO: renamed from: k4 */
    private List<String> f35632k4;

    public C9835kk(C10898dy c10898dy) {
        super(c10898dy);
        this.f35632k4 = new List<>();
    }

    /* JADX INFO: renamed from: du */
    public final int m48507du() {
        return this.f35632k4.size();
    }

    @Override // com.aspose.slides.internal.p416tb.C10894bv, com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        c10922yj.m52676k4(this);
        c10922yj.m52650k4("[");
        for (int i = 0; i < this.f35632k4.size(); i++) {
            c10922yj.m52650k4(this.f35632k4.get_Item(i));
            c10922yj.m52644h4();
        }
        c10922yj.m52650k4("]");
        c10922yj.m52678x1();
    }

    /* JADX INFO: renamed from: du */
    public final int m48508du(String str) {
        this.f35632k4.addItem(str);
        return this.f35632k4.size() - 1;
    }
}
