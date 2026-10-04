package com.aspose.slides.internal.p148gb;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p081de.C3153k4;
import com.aspose.slides.internal.p087dm.C3182du;
import com.aspose.slides.internal.p087dm.InterfaceC3186k4;
import com.aspose.slides.internal.p115eq.C3782c5;
import com.aspose.slides.internal.p115eq.C3785dy;
import com.aspose.slides.internal.p115eq.C3786fa;
import com.aspose.slides.internal.p115eq.C3788jd;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p324oq.InterfaceC7137k4;
import com.aspose.slides.internal.p404sp.C10308dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.gb.du */
/* JADX INFO: loaded from: classes.dex */
public class C4250du extends C3182du implements InterfaceC3186k4, InterfaceC7137k4 {
    public C4250du() {
        this.f9456h4 = "polyline";
    }

    /* JADX INFO: renamed from: b3 */
    public final String m17079b3() {
        return this.f9461x1.get_Item("points");
    }

    /* JADX INFO: renamed from: jd */
    public final void m17080jd(String str) {
        this.f9461x1.set_Item("points", str);
    }

    @Override // com.aspose.slides.internal.p087dm.InterfaceC3186k4
    /* JADX INFO: renamed from: k4 */
    public final C12007ix mo13679k4(C3786fa c3786fa, C12015qq c12015qq) {
        return C3153k4.m13468k4(mo17081x1(c3786fa, c12015qq.Clone())).m55523c5();
    }

    @Override // com.aspose.slides.internal.p324oq.InterfaceC7137k4
    /* JADX INFO: renamed from: x1 */
    public final List<C3785dy> mo17081x1(C3786fa c3786fa, C12015qq c12015qq) {
        List<Float> listM15136k4 = C3788jd.m15136k4(m17079b3());
        if (listM15136k4.size() == 0) {
            return new List<>();
        }
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26796k4("M {0} {1}", C10308dy.m50272k4(listM15136k4.get_Item(0).floatValue()), C10308dy.m50272k4(listM15136k4.get_Item(1).floatValue()));
        for (int i = 3; i < listM15136k4.size(); i += 2) {
            c6765kp.m26796k4(" L {0} {1}", C10308dy.m50272k4(listM15136k4.get_Item(i - 1).floatValue()), C10308dy.m50272k4(listM15136k4.get_Item(i).floatValue()));
        }
        return C3782c5.m15111k4(c6765kp.toString(), c3786fa);
    }
}
