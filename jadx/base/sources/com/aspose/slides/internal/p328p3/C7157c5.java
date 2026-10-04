package com.aspose.slides.internal.p328p3;

import com.aspose.slides.internal.p069cw.C2638du;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p109ei.AbstractC3733jd;
import com.aspose.slides.internal.p109ei.AbstractC3734k4;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p146g9.AbstractC4229kk;
import com.aspose.slides.internal.p251li.C6086up;
import com.aspose.slides.internal.p298nh.AbstractC6888dy;
import com.aspose.slides.internal.p298nh.C6895to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p372qx.C9962k4;
import com.aspose.slides.internal.p420th.AbstractC10957fa;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p420th.C10970u4;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.p3.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C7157c5 extends AbstractC3733jd {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC3734k4 f19303k4 = new C7165k4(this);

    @Override // com.aspose.slides.internal.p109ei.AbstractC3746x1
    /* JADX INFO: renamed from: k4 */
    public AbstractC3734k4 mo15042k4() {
        return this.f19303k4;
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.aspose.slides.internal.p109ei.AbstractC3733jd
    /* JADX INFO: renamed from: k4 */
    public void mo15021k4(C6086up c6086up, C2638du c2638du) {
        C3152yj c3152yj;
        byte[] array;
        AbstractC6888dy abstractC6888dyM12081yj = c2638du.m12081yj();
        C12007ix c12007ixClone = c6086up.m24644c5().mo19058k4().Clone();
        C10951c5 c10951c5 = new C10951c5();
        if (C7019kk.m27469x1(abstractC6888dyM12081yj, C6895to.class)) {
            c3152yj = new C3152yj();
            try {
                ((C6895to) abstractC6888dyM12081yj).m27022k4().m56333k4(c3152yj, C3977ck.m15681jd());
                array = c3152yj.toArray();
            } finally {
            }
        } else {
            C12009k4 c12009k4 = new C12009k4(C7019kk.m27462to(Float.valueOf(c12007ixClone.m56550c5()), 13), C7019kk.m27462to(Float.valueOf(c12007ixClone.m56575x1()), 13));
            try {
                AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
                try {
                    AbstractC4229kk abstractC4229kkM17034k4 = AbstractC4229kk.m17034k4((AbstractC12536x1) abstractC6888dyM12081yj);
                    abstractC4229kkM17034k4.mo17030k4(c2638du.m12073u4());
                    abstractC4229kkM17034k4.m17039k4(abstractC12008jdM56582k4);
                    if (abstractC12008jdM56582k4 != null) {
                        abstractC12008jdM56582k4.dispose();
                    }
                    c3152yj = new C3152yj();
                    try {
                        c12009k4.m56333k4(c3152yj, C3977ck.m15681jd());
                        byte[] array2 = c3152yj.toArray();
                        c3152yj.dispose();
                        c12009k4.dispose();
                        array = array2;
                    } finally {
                    }
                } catch (Throwable th) {
                    if (abstractC12008jdM56582k4 != null) {
                        abstractC12008jdM56582k4.dispose();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                c12009k4.dispose();
                throw th2;
            }
        }
        c10951c5.m52930k4(new C10970u4(c12007ixClone.m56552du().Clone(), c12007ixClone.m56570m9().Clone(), array));
        c10951c5.m52904k4(C9962k4.m49061k4(c2638du.m12070rv()));
        ((AbstractC10957fa) c2638du.m12052k4()).m52930k4(c10951c5);
    }
}
