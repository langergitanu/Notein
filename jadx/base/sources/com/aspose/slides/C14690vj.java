package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.vj */
/* JADX INFO: loaded from: classes3.dex */
class C14690vj {
    /* JADX INFO: renamed from: k4 */
    public static void m72329k4(Sequence sequence, com.aspose.slides.internal.p332p7.idf idfVar, c0z c0zVar) {
        if (sequence == null) {
            throw new ArgumentNullException("sequence");
        }
        if (idfVar == null) {
            throw new ArgumentNullException("parElement");
        }
        if (idfVar.m34070to() != 0 && idfVar.m34070to() != 1) {
            C1145gi.m6678k4(sequence, idfVar, c0zVar).m1375kk().m7591x1(sequence.m2531x1().m249k4().m386fa());
        }
        List.Enumerator<C7394ca> it = idfVar.m34064fa().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                if ("par".equals(next.m29539k4())) {
                    m72329k4(sequence, (com.aspose.slides.internal.p332p7.idf) next.m29542x1(), c0zVar);
                }
                if ("iterate".equals(next.m29539k4())) {
                    m72330k4(sequence, (com.aspose.slides.internal.p332p7.vbl) next.m29542x1(), c0zVar);
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
    public static void m72330k4(Sequence sequence, com.aspose.slides.internal.p332p7.vbl vblVar, c0z c0zVar) {
        if (sequence == null) {
            throw new ArgumentNullException("sequence");
        }
        if (vblVar == null) {
            throw new ArgumentNullException("iterateElement");
        }
        if (vblVar.m42905to() != 0 && vblVar.m42905to() != 1) {
            C1145gi.m6679k4(sequence, vblVar, c0zVar).m1375kk().m7591x1(sequence.m2531x1().m249k4().m386fa());
        }
        List.Enumerator<C7394ca> it = vblVar.m42897ck().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                if ("par".equals(next.m29539k4())) {
                    m72329k4(sequence, (com.aspose.slides.internal.p332p7.idf) next.m29542x1(), c0zVar);
                }
                if ("iterate".equals(next.m29539k4())) {
                    m72330k4(sequence, (com.aspose.slides.internal.p332p7.vbl) next.m29542x1(), c0zVar);
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
}
