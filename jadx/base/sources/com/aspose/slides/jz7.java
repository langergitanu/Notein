package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8039ju;
import com.aspose.slides.internal.p332p7.C8864te;
import com.aspose.slides.internal.p332p7.C9085w3;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class jz7 {
    /* JADX INFO: renamed from: k4 */
    public static IMathElement m63584k4(C9085w3 c9085w3, gnb gnbVar) {
        if (c9085w3 == null || c9085w3.m43470x1() == null || c9085w3.m43470x1().size() == 0) {
            return null;
        }
        ulh ulhVar = new ulh(c9085w3.m43470x1().size());
        List.Enumerator<C7394ca> it = c9085w3.m43470x1().iterator();
        while (it.hasNext()) {
            try {
                vdg.m72186k4(it.next(), ulhVar, gnbVar);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (ulhVar.getCount() == 0) {
            return null;
        }
        return ulhVar.getCount() == 1 ? ulhVar.get_Item(0) : new MathBlock(ulhVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static IMathElement m63585k4(C9085w3 c9085w3, C14093tq<Byte>[] c14093tqArr, gnb gnbVar) {
        if (c9085w3.m43467k4() == null || c9085w3.m43467k4().m34966k4() == null) {
            c14093tqArr[0] = new C14093tq<>();
        } else {
            c14093tqArr[0] = new C14093tq<>(Byte.valueOf(c9085w3.m43467k4().m34966k4().m41694k4()));
        }
        return m63584k4(c9085w3, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static C9085w3 m63586k4(IMathElement iMathElement, u8s u8sVar) {
        return m63589k4(ue7.m71677x1(iMathElement), u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static C9085w3 m63587k4(C9085w3 c9085w3, IMathElement iMathElement, u8s u8sVar) {
        return m63588k4(c9085w3, ue7.m71677x1(iMathElement), u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static C9085w3 m63588k4(C9085w3 c9085w3, ue7 ue7Var, u8s u8sVar) {
        if (ue7Var.m71681x1() != null) {
            if (((MathElementBase) ue7Var.m71681x1()).mo1971Y_()) {
                IGenericEnumerator it = ((IGenericEnumerable) C7019kk.m27452k4((Object) ue7Var.m71681x1(), IGenericEnumerable.class)).iterator();
                while (it.hasNext()) {
                    try {
                        c9085w3.m43468k4(vdg.m72185k4((IMathElement) it.next(), u8sVar));
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
            } else {
                c9085w3.m43468k4(vdg.m72185k4(ue7Var.m71681x1(), u8sVar));
            }
            byte bM71678k4 = ue7Var.m71678k4();
            if (bM71678k4 == 0) {
                c9085w3.m43469k4((C8039ju) null);
                return c9085w3;
            }
            C8039ju c8039ju = new C8039ju();
            C8864te c8864te = new C8864te();
            c8864te.m41695k4(bM71678k4);
            c8039ju.m34967k4(c8864te);
            c9085w3.m43469k4(c8039ju);
        }
        return c9085w3;
    }

    /* JADX INFO: renamed from: k4 */
    public static C9085w3 m63589k4(ue7 ue7Var, u8s u8sVar) {
        if (ue7Var == null) {
            return null;
        }
        C9085w3 c9085w3 = new C9085w3();
        m63588k4(c9085w3, ue7Var, u8sVar);
        return c9085w3;
    }
}
