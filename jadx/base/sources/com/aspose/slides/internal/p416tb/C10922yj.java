package com.aspose.slides.internal.p416tb;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p346pw.C9574to;
import com.aspose.slides.internal.p505xn.C12561ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.tb.yj */
/* JADX INFO: loaded from: classes4.dex */
public class C10922yj extends C10921yd {

    /* JADX INFO: renamed from: k4 */
    private final C12561ix f37999k4;

    public C10922yj(AbstractC3150x6 abstractC3150x6) {
        super(abstractC3150x6);
        C12561ix c12561ix = new C12561ix();
        this.f37999k4 = c12561ix;
        c12561ix.m58585k4(0, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m52675k4() {
        return this.f37999k4.m58582k4();
    }

    /* JADX INFO: renamed from: kk */
    public final int m52677kk() {
        int position = (int) m52668to().getPosition();
        m52665kk("xref");
        m52673x1("0 {0}", C9574to.m46742k4(this.f37999k4.m58582k4()));
        m52665kk("0000000000 65535 f");
        for (int i = 1; i < this.f37999k4.m58582k4(); i++) {
            m52673x1("{0} 00000 n", C9574to.m46748x1(((Integer) C7019kk.m27464to(this.f37999k4.m58586kk(i), Integer.TYPE)).intValue()));
        }
        return position;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52678x1() {
        m52667m9();
        m52665kk("endobj");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52676k4(AbstractC10914up abstractC10914up) {
        this.f37999k4.m58585k4(abstractC10914up.m52567dy(), Integer.valueOf((int) m52668to().getPosition()));
        m52673x1("{0} 0 obj", C9574to.m46742k4(abstractC10914up.m52567dy()));
    }
}
