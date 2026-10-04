package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.f9 */
/* JADX INFO: loaded from: classes3.dex */
class C1082f9 {
    /* JADX INFO: renamed from: k4 */
    public static void m6054k4(Sequence sequence, com.aspose.slides.internal.p332p7.lft lftVar, c0z c0zVar) {
        if (sequence == null) {
            throw new ArgumentNullException("sequence");
        }
        if (lftVar == null) {
            throw new ArgumentNullException("seqElement");
        }
        if (lftVar.m36063k4() != 6) {
            throw new InvalidOperationException();
        }
        List.Enumerator<C7394ca> it = lftVar.m36064x1().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                if (!"par".equals(next.m29539k4())) {
                    throw new InvalidOperationException("par node container expected");
                }
                C14690vj.m72329k4(sequence, (com.aspose.slides.internal.p332p7.idf) next.m29542x1(), c0zVar);
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
