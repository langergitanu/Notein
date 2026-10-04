package com.aspose.slides.internal.p328p3;

import com.aspose.slides.internal.p052c0.C1937to;
import com.aspose.slides.internal.p069cw.C2638du;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p109ei.AbstractC3734k4;
import com.aspose.slides.internal.p109ei.AbstractC3746x1;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p251li.C6045bz;
import com.aspose.slides.internal.p372qx.C9962k4;
import com.aspose.slides.internal.p420th.AbstractC10957fa;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p420th.C10970u4;
import com.aspose.slides.internal.p420th.C10971um;
import com.aspose.slides.internal.p460vf.C11638k4;
import com.aspose.slides.internal.p460vf.C11639kk;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.p3.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C7165k4 extends AbstractC3734k4 {
    public C7165k4(AbstractC3746x1 abstractC3746x1) {
        super(abstractC3746x1);
    }

    @Override // com.aspose.slides.internal.p109ei.AbstractC3734k4
    /* JADX INFO: renamed from: k4 */
    public void mo15023k4(C6045bz c6045bz, C2638du c2638du) {
        this.f10264k4.mo15028k4(c6045bz, c2638du);
    }

    @Override // com.aspose.slides.internal.p109ei.AbstractC3734k4
    /* JADX INFO: renamed from: k4 */
    public void mo15025k4(AbstractC12002ck abstractC12002ck, C12025x6[] c12025x6Arr, C12007ix c12007ix, int i, C3976c5 c3976c5, C2638du c2638du) {
        C12014ne c12014neClone = C9962k4.m49068k4(c12007ix.Clone()).Clone();
        C3152yj c3152yj = new C3152yj();
        try {
            C12009k4 c12009k4 = new C12009k4(abstractC12002ck);
            try {
                C12009k4 c12009k4M56602k4 = c12009k4.m56602k4(c12014neClone.Clone(), c12009k4.mo15753jd());
                try {
                    c12009k4M56602k4.m56333k4(c3152yj, C3977ck.m15681jd());
                    byte[] array = c3152yj.toArray();
                    c12009k4M56602k4.dispose();
                    c3152yj.dispose();
                    C10951c5 c10951c5 = new C10951c5();
                    c10951c5.m52904k4(C9962k4.m49061k4(c2638du.m12070rv()));
                    C10951c5 c10951c52 = new C10951c5();
                    c10951c52.m52904k4(C9962k4.m49061k4(c2638du.m12070rv()));
                    C12025x6 c12025x6Clone = c12025x6Arr[0].Clone();
                    c10951c52.m52930k4(new C10970u4(c12025x6Clone.Clone(), new C12015qq(c12025x6Arr[1].m56897x1() - c12025x6Clone.m56897x1(), c12025x6Arr[2].m56895kk() - c12025x6Clone.m56895kk()).Clone(), array));
                    c10951c5.m52930k4(c10951c52);
                    ((AbstractC10957fa) c2638du.m12052k4()).m52930k4(c10951c52);
                } catch (Throwable th) {
                    if (c12009k4M56602k4 != null) {
                        c12009k4M56602k4.dispose();
                    }
                    throw th;
                }
            } finally {
                c12009k4.dispose();
            }
        } catch (Throwable th2) {
            c3152yj.dispose();
            throw th2;
        }
    }

    @Override // com.aspose.slides.internal.p109ei.AbstractC3734k4
    /* JADX INFO: renamed from: k4 */
    public void mo15026k4(C12007ix c12007ix, C11913yj c11913yj, int i, C2638du c2638du) {
        C10951c5 c10951c5 = new C10951c5();
        c10951c5.m52907k4(C10971um.m53087k4(c12007ix.Clone()));
        c10951c5.m52904k4(C9962k4.m49061k4(c2638du.m12070rv()));
        ((AbstractC10957fa) c2638du.m12052k4()).m52930k4(c10951c5);
        c2638du.m12063k4(c10951c5);
    }

    @Override // com.aspose.slides.internal.p109ei.AbstractC3734k4
    /* JADX INFO: renamed from: k4 */
    public void mo15027k4(AbstractC12536x1 abstractC12536x1, C12025x6[] c12025x6Arr, C11913yj c11913yj, C12007ix c12007ix, C2638du c2638du) {
        C3152yj c3152yj = new C3152yj();
        try {
            abstractC12536x1.mo13499a_(c3152yj);
            c3152yj.seek(0L, 0);
            C1937to c1937to = new C1937to(c3152yj);
            C10951c5 c10951c5M54724k4 = C11638k4.m54724k4(c1937to, C9962k4.m49067k4(abstractC12536x1.mo13623kk().Clone()).Clone().m56570m9().Clone(), c12007ix.Clone(), new C11639kk(), new C12007ix(C12025x6.f40591k4.Clone(), c1937to.m9993ne().Clone()));
            c10951c5M54724k4.m52904k4(C9962k4.m49061k4(c11913yj));
            C10951c5 c10951c5 = (C10951c5) c2638du.m12052k4();
            c10951c5.m52930k4(c10951c5M54724k4);
            c2638du.m12063k4(c10951c5.m53116um());
        } finally {
            c3152yj.dispose();
        }
    }
}
