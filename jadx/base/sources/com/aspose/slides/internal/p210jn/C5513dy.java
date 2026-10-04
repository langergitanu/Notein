package com.aspose.slides.internal.p210jn;

import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p218k5.AbstractC5610dy;
import com.aspose.slides.internal.p218k5.AbstractC5612k4;
import com.aspose.slides.internal.p349q3.C9649ga;
import com.aspose.slides.internal.p372qx.C9962k4;
import com.aspose.slides.internal.p420th.AbstractC10957fa;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p420th.C10970u4;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.jn.dy */
/* JADX INFO: loaded from: classes.dex */
public class C5513dy extends AbstractC5610dy {
    public C5513dy(AbstractC5612k4 abstractC5612k4) {
        super(abstractC5612k4);
    }

    @Override // com.aspose.slides.internal.p218k5.AbstractC5610dy
    /* JADX INFO: renamed from: k4 */
    public void mo12689k4(C9649ga c9649ga, C3585h4 c3585h4) {
        int i;
        C12009k4 c12009k4M57639x1 = c9649ga.m47239x6() != null ? c9649ga.m47239x6().m57639x1(c3585h4.m14482ck()) : null;
        new C11913yj();
        int iM47229m9 = c9649ga.m47229m9();
        int iM47212dy = c9649ga.m47212dy();
        int iM47228ks = c9649ga.m47228ks();
        int iM47231rv = c9649ga.m47231rv();
        if (c12009k4M57639x1 != null) {
            boolean z = C14116yg.m67506x1(iM47229m9) != C14116yg.m67506x1(iM47228ks);
            boolean z2 = C14116yg.m67506x1(iM47212dy) != C14116yg.m67506x1(iM47231rv);
            if (z) {
                i = z2 ? 2 : 4;
            } else if (z2) {
                i = 6;
            }
            c12009k4M57639x1.m56342to(i);
        }
        m22996k4(c9649ga.m47232to(), c9649ga.m47215h4(), iM47229m9, iM47212dy).Clone();
        C12014ne c12014neClone = m22996k4(c9649ga.m47236x1(), c9649ga.m47225kk(), iM47228ks, iM47231rv).Clone();
        c9649ga.m47240yj();
        C3152yj c3152yj = new C3152yj();
        try {
            c12009k4M57639x1.m56333k4(c3152yj, C3977ck.m15681jd());
            byte[] array = c3152yj.toArray();
            c3152yj.dispose();
            C10951c5 c10951c5 = new C10951c5();
            c10951c5.m52930k4(new C10970u4(C12016rv.m56703k4(c12014neClone.m56665du()).Clone(), C12023wl.m56853k4(c12014neClone.m56680m9()).Clone(), array));
            c10951c5.m52904k4(C9962k4.m49061k4(c3585h4.m14561vj()));
            ((AbstractC10957fa) c3585h4.m14502k4()).m52930k4(c10951c5);
        } catch (Throwable th) {
            c3152yj.dispose();
            throw th;
        }
    }
}
