package com.aspose.slides.internal.p416tb;

import com.aspose.slides.internal.p085dk.C3173h4;
import com.aspose.slides.internal.p201j8.C5217to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tb.ks */
/* JADX INFO: loaded from: classes4.dex */
public class C10905ks extends AbstractC10914up {
    public C10905ks(C10898dy c10898dy) {
        super(c10898dy);
    }

    @Override // com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        c10922yj.m52649k4(m52570yj());
        c10922yj.m52676k4(this);
        c10922yj.m52643dy();
        C3173h4 c3173h4M52461m9 = this.f37962x1.m52461m9();
        if (C14113y2.m67411k4(c3173h4M52461m9.m13575x1()) && (this.f37962x1.m52454fa() || this.f37962x1.m52464x1().m52604ck() == 9)) {
            c3173h4M52461m9.m13577x1("Untitled Document");
            if (this.f37962x1.m52464x1().m52629uz() != null) {
                this.f37962x1.m52464x1().m52629uz().mo22246k4(new C5217to("The presentation has no title. It has been saved as \"Untitled Document\""));
            }
        }
        c10922yj.m52670to("/Title", c3173h4M52461m9.m13575x1());
        c10922yj.m52670to("/Author", c3173h4M52461m9.m13567kk());
        c10922yj.m52670to("/Subject", c3173h4M52461m9.m13572to());
        c10922yj.m52670to("/Keywords", c3173h4M52461m9.m13560h4());
        c10922yj.m52670to("/Creator", c3173h4M52461m9.m13555du());
        c10922yj.m52670to("/Producer", c3173h4M52461m9.m13564k4());
        c10922yj.m52655k4("/CreationDate", c3173h4M52461m9.m13559fa().Clone());
        c10922yj.m52655k4("/ModDate", c3173h4M52461m9.m13574up().Clone());
        c10922yj.m52640c5();
        c10922yj.m52678x1();
    }
}
