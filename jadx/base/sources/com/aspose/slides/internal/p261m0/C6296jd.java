package com.aspose.slides.internal.p261m0;

import com.aspose.slides.internal.p087dm.C3181c5;
import com.aspose.slides.internal.p115eq.C3791ks;
import com.aspose.slides.internal.p138fu.C4123dy;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p248lf.AbstractC6033m9;
import com.aspose.slides.internal.p248lf.C6029du;
import com.aspose.slides.internal.p346pw.C9573kk;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p420th.C10963ks;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.m0.jd */
/* JADX INFO: loaded from: classes4.dex */
public class C6296jd extends AbstractC6033m9 {

    /* JADX INFO: renamed from: k4 */
    private final C10951c5 f17929k4;

    /* JADX INFO: renamed from: x1 */
    private final C3791ks f17930x1;

    public C6296jd(C10951c5 c10951c5, C5659x1 c5659x1, C6029du c6029du, C3791ks c3791ks) {
        super(c5659x1, c6029du);
        this.f17929k4 = c10951c5;
        this.f17930x1 = c3791ks;
    }

    @Override // com.aspose.slides.internal.p248lf.InterfaceC6031k4
    /* JADX INFO: renamed from: k4 */
    public float mo6762k4(C3181c5 c3181c5, char c, float f, float f2, float f3, C12015qq c12015qq) {
        C10963ks c10963ksM25773k4 = m25773k4(C14117yj.m67537ne(c), f, f2);
        if (C14116yg.m67480k4(f3) > 0.0f) {
            if (c10963ksM25773k4.mo52909to() == null) {
                c10963ksM25773k4.m52984k4(new C4317dy(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
            }
            C11913yj c11913yj = new C11913yj();
            c11913yj.m55766k4(f3, new C12025x6(f, f2));
            c10963ksM25773k4.mo52909to().m17341k4(C4123dy.m16494k4(c11913yj), 1);
        }
        m25774k4(c3181c5, c12015qq.Clone(), c10963ksM25773k4);
        this.f17929k4.m52930k4(c10963ksM25773k4);
        return mo24354k4(c);
    }

    /* JADX INFO: renamed from: k4 */
    private C10963ks m25773k4(String str, float f, float f2) {
        C12015qq c12015qqClone = m24359k4().m23126x1(str).Clone();
        C5659x1 c5659x1 = new C5659x1(m24359k4().m23114dy(), m24359k4().m23125x1(), m24359k4().m23120k4());
        int i = m24360x1().f17089k4;
        return i != 1 ? i != 2 ? new C10963ks(c5659x1, C9573kk.m46737k4(m24360x1().f17098up.Clone()), C9573kk.m46737k4(m24360x1().f17098up.Clone()), new C12025x6(f, f2), str, c12015qqClone.Clone(), 0.0f) : new C10963ks(c5659x1, C9573kk.m46737k4(C12003du.f40505to.Clone()), C9573kk.m46737k4(m24360x1().f17098up.Clone()), new C12025x6(f, f2), str, c12015qqClone.Clone(), 0.0f) : new C10963ks(c5659x1, C9573kk.m46737k4(m24360x1().f17098up.Clone()), C9573kk.m46737k4(C12003du.f40505to.Clone()), new C12025x6(f, f2), str, c12015qqClone.Clone(), 0.0f);
    }

    /* JADX INFO: renamed from: k4 */
    private void m25774k4(C3181c5 c3181c5, C12015qq c12015qq, C10963ks c10963ks) {
        if (c3181c5.f9461x1.containsKey("transform")) {
            if (c10963ks.mo52909to() == null) {
                c10963ks.m52984k4(new C4317dy(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
            }
            c10963ks.mo52909to().m17341k4(C4123dy.m16494k4(this.f17930x1.m15149k4(c3181c5.f9461x1.get_Item("transform"), c12015qq.Clone())), 1);
        }
    }
}
