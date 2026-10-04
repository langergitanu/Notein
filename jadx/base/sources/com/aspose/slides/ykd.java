package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.AbstractC11819tq;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11788nx;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class ykd {
    /* JADX INFO: renamed from: k4 */
    public static void m73921k4(C11791os c11791os, mhp mhpVar, List<coq> list) {
        List.Enumerator<coq> it = list.iterator();
        while (it.hasNext()) {
            try {
                coq next = it.next();
                ipw ipwVarM64892k4 = mhpVar.m64892k4(next.m4701kk());
                if (ipwVarM64892k4 != null) {
                    m73922k4(c11791os.m55379yj(), ipwVarM64892k4);
                    if (next.m4699du()) {
                        c11791os.m55379yj().m55390dy().m55311x1(c11791os.m55379yj().m55392h4(ipwVarM64892k4.m63028k4()));
                    } else {
                        c11791os.m55377up().m55306k4(next.m4700k4(), next.m4703x1(), next.m4701kk(), next.m4702to());
                    }
                }
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

    /* JADX INFO: renamed from: k4 */
    public static void m73922k4(AbstractC11819tq abstractC11819tq, ipw ipwVar) {
        if (abstractC11819tq.m55392h4(ipwVar.m63028k4()) == null) {
            C11791os c11791osM55395k4 = abstractC11819tq.m55395k4(ipwVar.m63028k4(), null, new C11788nx(ipwVar.m63030kk(), ipwVar.m63031to()), ipwVar.m63032x1());
            abstractC11819tq.m55404m9(c11791osM55395k4.m55427x1());
            if (ipwVar.m63027du() != null) {
                IGenericEnumerator<C11709bg> it = ipwVar.m63027du().iterator();
                while (it.hasNext()) {
                    try {
                        C11709bg next = it.next();
                        if (c11791osM55395k4.m55377up() == null) {
                            c11791osM55395k4.m55376ks();
                        }
                        c11791osM55395k4.m55377up().m55306k4(next.m55289du(), next.m55291h4(), next.m55292k4(), next.m55294m9());
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
    }
}
