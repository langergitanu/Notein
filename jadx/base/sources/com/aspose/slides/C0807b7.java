package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.b7 */
/* JADX INFO: loaded from: classes3.dex */
class C0807b7 {
    /* JADX INFO: renamed from: k4 */
    public static String m4041k4(IGroupShape iGroupShape, C0950eh c0950eh) {
        C6765kp c6765kp = new C6765kp();
        IGenericEnumerator<IShape> it = iGroupShape.getShapes().iterator();
        while (it.hasNext()) {
            try {
                c6765kp.m26792k4(wl8.m72782k4(it.next(), c0950eh));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m4042k4(cxw cxwVar, InterfaceC14374r4 interfaceC14374r4, ls9 ls9Var) {
        C12009k4 c12009k4 = new C12009k4(C7019kk.m27462to(Float.valueOf(cxwVar.m4869du() - cxwVar.mo4870k4()), 13), C7019kk.m27462to(Float.valueOf(cxwVar.m4876to() - cxwVar.mo4878x1()), 13));
        try {
            c12009k4.m56603k4();
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
            try {
                List.Enumerator<IShape> it = cxwVar.m4874kk().iterator();
                while (it.hasNext()) {
                    try {
                        Shape shape = (Shape) it.next();
                        C12009k4 c12009k4M2549e0 = shape.m2549e0();
                        try {
                            abstractC12008jdM56582k4.mo17504k4((AbstractC12002ck) c12009k4M2549e0, C7019kk.m27462to(Float.valueOf(shape.getX() - cxwVar.mo4870k4()), 13), C7019kk.m27462to(Float.valueOf(shape.getY() - cxwVar.mo4878x1()), 13), C7019kk.m27462to(Float.valueOf(shape.getWidth()), 13), C7019kk.m27462to(Float.valueOf(shape.getHeight()), 13));
                            if (c12009k4M2549e0 != null) {
                                c12009k4M2549e0.dispose();
                            }
                        } catch (Throwable th) {
                            if (c12009k4M2549e0 == null) {
                                throw th;
                            }
                            c12009k4M2549e0.dispose();
                            throw th;
                        }
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                if (abstractC12008jdM56582k4 != null) {
                    abstractC12008jdM56582k4.dispose();
                }
                String strM4264k4 = bls.m4264k4(interfaceC14374r4, ls9Var, interfaceC14374r4.mo64149k4(c12009k4));
                c12009k4.dispose();
                return strM4264k4;
            } finally {
            }
        } catch (Throwable th2) {
            c12009k4.dispose();
            throw th2;
        }
    }
}
