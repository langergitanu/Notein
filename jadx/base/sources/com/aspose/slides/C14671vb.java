package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7454d2;
import com.aspose.slides.internal.p332p7.C8713ru;
import com.aspose.slides.internal.p464vq.C11791os;

/* JADX INFO: renamed from: com.aspose.slides.vb */
/* JADX INFO: loaded from: classes3.dex */
class C14671vb extends ywb {
    public C14671vb(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final C8713ru m72163k4() {
        mo3469k4(new String[0]);
        C8713ru c8713ru = null;
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "downRevStg".equals(m55443jd().mo65023fa())) {
                c8713ru = new C8713ru(m55443jd());
            }
        }
        mo55330fa();
        return c8713ru;
    }

    public C14671vb(C11791os c11791os, u8s u8sVar) {
        super(c11791os, u8sVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m72164k4(IShape iShape, uz3 uz3Var) {
        String strM5498du;
        mo55332up();
        C8713ru c8713ru = new C8713ru();
        if (uz3Var.m71999bv().m5502k4() != null) {
            c8713ru.m40562k4((C7019kk.m27469x1(iShape, Table.class) || C7019kk.m27469x1(iShape, SmartArt.class) || C7019kk.m27469x1(uz3Var, f5k.class) || C7019kk.m27469x1(uz3Var, q0x.class)) ? uz3Var.m71999bv().m5504to() : uz3Var.m71999bv().m5503kk());
        }
        if (uz3Var.m71999bv().m5505x1() == null) {
            if (C7019kk.m27469x1(iShape, SmartArt.class)) {
                strM5498du = "";
            }
            if (C7019kk.m27469x1(iShape, SmartArt.class)) {
                C7454d2 c7454d2 = new C7454d2();
                c7454d2.m30013k4().m37133k4(0L);
                c7454d2.m30013k4().m37134x1(0L);
                c7454d2.m30016x1().m37133k4(0L);
                c7454d2.m30016x1().m37134x1(0L);
                c7454d2.m30014kk().m37133k4(0L);
                c7454d2.m30014kk().m37134x1(0L);
                c7454d2.m30015to().m37133k4(0L);
                c7454d2.m30015to().m37134x1(0L);
                c8713ru.m40561k4(new C7394ca("preciseEffectOffsets", c7454d2));
            }
            if (iShape != null) {
                Shape shape = (Shape) iShape;
                c8713ru.m40560k4((shape.m2584wp() & 4294967295L) > 0 ? shape.m2584wp() : iShape.getUniqueId());
            }
            if (!C7019kk.m27469x1(iShape, SmartArt.class)) {
                c8713ru.m40559k4((byte) 0);
            }
            c8713ru.m40564x1(1L);
            c8713ru.mo6846k4("a", m55442ck(), "downRevStg");
            mo55333yj();
        }
        strM5498du = uz3Var.m71999bv().m5498du();
        c8713ru.m40565x1(strM5498du);
        if (C7019kk.m27469x1(iShape, SmartArt.class)) {
        }
        if (iShape != null) {
        }
        if (!C7019kk.m27469x1(iShape, SmartArt.class)) {
        }
        c8713ru.m40564x1(1L);
        c8713ru.mo6846k4("a", m55442ck(), "downRevStg");
        mo55333yj();
    }
}
