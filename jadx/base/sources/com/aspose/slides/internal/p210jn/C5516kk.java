package com.aspose.slides.internal.p210jn;

import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p218k5.AbstractC5612k4;
import com.aspose.slides.internal.p218k5.AbstractC5613kk;
import com.aspose.slides.internal.p349q3.C9638du;
import com.aspose.slides.internal.p372qx.C9962k4;
import com.aspose.slides.internal.p420th.AbstractC10957fa;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p420th.C10970u4;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12023wl;

/* JADX INFO: renamed from: com.aspose.slides.internal.jn.kk */
/* JADX INFO: loaded from: classes.dex */
public class C5516kk extends AbstractC5613kk {
    public C5516kk(AbstractC5612k4 abstractC5612k4) {
        super(abstractC5612k4);
    }

    @Override // com.aspose.slides.internal.p218k5.AbstractC5613kk
    /* JADX INFO: renamed from: k4 */
    public void mo12691k4(C9638du c9638du, C3585h4 c3585h4) throws Throwable {
        C12014ne c12014ne = new C12014ne(c9638du.m47128dy(), c9638du.m47124c5(), c9638du.m47148to(), c9638du.m47130h4());
        C12014ne c12014ne2 = new C12014ne(c9638du.m47152x1(), c9638du.m47142kk(), c9638du.m47148to(), c9638du.m47130h4());
        C12009k4 c12009k4M57639x1 = c9638du.m47155x6() != null ? c9638du.m47155x6().m57639x1(c3585h4.m14482ck()) : null;
        if (c12009k4M57639x1 != null) {
            C3152yj c3152yj = new C3152yj();
            try {
                c12009k4M57639x1.m56333k4(c3152yj, C3977ck.m15681jd());
                byte[] array = c3152yj.toArray();
                c3152yj.dispose();
                C10951c5 c10951c5 = new C10951c5();
                c10951c5.m52930k4(new C10970u4(C12016rv.m56703k4(c12014ne2.m56665du()).Clone(), C12023wl.m56853k4(c12014ne2.m56680m9()).Clone(), array));
                c10951c5.m52904k4(C9962k4.m49061k4(c3585h4.m14561vj()));
                ((AbstractC10957fa) c3585h4.m14502k4()).m52930k4(c10951c5);
            } catch (Throwable th) {
                c3152yj.dispose();
                throw th;
            }
        }
        m9144k4(c9638du.m47146m9(), c12009k4M57639x1, c12014ne.Clone(), c12014ne2.Clone(), C12003du.f40505to.Clone(), c9638du.m47133jd().m25637dy(), c3585h4);
    }
}
