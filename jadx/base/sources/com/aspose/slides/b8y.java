package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class b8y {
    /* JADX INFO: renamed from: k4 */
    public static void m4047k4(IPointCollection iPointCollection, com.aspose.slides.internal.p332p7.sx3 sx3Var) {
        if (sx3Var == null) {
            return;
        }
        for (com.aspose.slides.internal.p332p7.uit uitVar : sx3Var.m41427x1()) {
            float fM65132uz = C14113y2.m67411k4(uitVar.m42418x1()) ? 0.0f : uitVar.m42418x1().charAt(uitVar.m42418x1().length() + (-1)) == '%' ? (float) C13850af.m65132uz(C14113y2.m67443x1(uitVar.m42418x1(), 0, uitVar.m42418x1().length() - 1)) : !"indefinite".equals(uitVar.m42418x1()) ? C13850af.m65122ks(uitVar.m42418x1()) / 1000.0f : Float.NaN;
            String strM42416kk = uitVar.m42416kk() == null ? "" : uitVar.m42416kk();
            if (uitVar.m42417to() != null) {
                ((PointCollection) iPointCollection).m2275k4(new Point(fM65132uz, rzi.m70395k4(uitVar.m42417to()), strM42416kk));
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m4048x1(IPointCollection iPointCollection, com.aspose.slides.internal.p332p7.sx3 sx3Var) {
        IGenericEnumerator<IPoint> it = iPointCollection.iterator();
        while (it.hasNext()) {
            try {
                IPoint next = it.next();
                com.aspose.slides.internal.p332p7.uit uitVarM41426k4 = sx3Var.m41426k4();
                if (!C14064he.m66715kk(next.getTime())) {
                    uitVarM41426k4.m42415k4(C13850af.m65103k4(C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(next.getTime() * 1000.0f)), 14)));
                }
                uitVarM41426k4.m42419x1(next.getFormula());
                rzi.m70396k4(next.getValue(), uitVarM41426k4.m42414k4());
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }
}
