package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7772gl;
import com.aspose.slides.internal.p332p7.C9299yp;
import com.aspose.slides.internal.p332p7.C9340z3;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class emp {
    /* JADX INFO: renamed from: k4 */
    public static void m5601k4(Ink ink, cow cowVar, C9340z3 c9340z3) {
        if (c9340z3 == null) {
            return;
        }
        cowVar.m4705k4(c9340z3.m45347k4());
        for (C7772gl c7772gl : c9340z3.m45352x1()) {
            qi5 qi5Var = new qi5();
            etp.m5691k4(ink, qi5Var, c7772gl);
            cowVar.m4707x1().addItem(qi5Var);
        }
        if (c9340z3.m45351kk() != null) {
            for (C7772gl c7772gl2 : c9340z3.m45351kk().m45073k4()) {
                qi5 qi5Var2 = new qi5();
                etp.m5691k4(ink, qi5Var2, c7772gl2);
                cowVar.m4706kk().addItem(qi5Var2);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5602k4(cow cowVar, C9340z3 c9340z3) {
        List.Enumerator<qi5> it;
        c9340z3.m45350k4(cowVar.m4704k4());
        if (cowVar.m4707x1() != null && cowVar.m4707x1().size() > 0) {
            it = cowVar.m4707x1().iterator();
            while (it.hasNext()) {
                try {
                    qi5 next = it.next();
                    C7772gl c7772gl = new C7772gl();
                    etp.m5692k4(next, c7772gl);
                    c9340z3.m45348k4(c7772gl);
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        if (cowVar.m4706kk() == null || cowVar.m4706kk().size() <= 0) {
            return;
        }
        C9299yp c9299yp = new C9299yp();
        it = cowVar.m4706kk().iterator();
        while (it.hasNext()) {
            try {
                qi5 next2 = it.next();
                C7772gl c7772gl2 = new C7772gl();
                etp.m5692k4(next2, c7772gl2);
                c9299yp.m45072k4(c7772gl2);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        c9340z3.m45349k4(c9299yp);
    }
}
