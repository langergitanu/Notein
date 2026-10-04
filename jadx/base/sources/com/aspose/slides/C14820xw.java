package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.xw */
/* JADX INFO: loaded from: classes3.dex */
class C14820xw {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f50215k4 = new C7017h4("seq");

    /* JADX INFO: renamed from: k4 */
    public static void m73610k4(IAnimationTimeLine iAnimationTimeLine, com.aspose.slides.internal.p332p7.idf idfVar, c0z c0zVar) {
        if (iAnimationTimeLine == null) {
            throw new ArgumentNullException("animationTimeLine");
        }
        if (idfVar == null) {
            throw new ArgumentNullException("parElement");
        }
        if (idfVar.m34067k4() != 5) {
            throw new InvalidOperationException();
        }
        List.Enumerator<C7394ca> it = idfVar.m34064fa().iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                if (f50215k4.m27428k4(next.m29539k4()) == 0) {
                    m73611k4(iAnimationTimeLine, (com.aspose.slides.internal.p332p7.lft) next.m29542x1(), c0zVar);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73611k4(IAnimationTimeLine iAnimationTimeLine, com.aspose.slides.internal.p332p7.lft lftVar, c0z c0zVar) {
        int iM36063k4 = lftVar.m36063k4();
        if (iM36063k4 == 6) {
            C1082f9.m6054k4((Sequence) iAnimationTimeLine.getMainSequence(), lftVar, c0zVar);
        } else {
            if (iM36063k4 != 7) {
                throw new ArgumentOutOfRangeException("seqElement", "Only root sequence types allowed");
            }
            C14436s7.m70456k4((SequenceCollection) iAnimationTimeLine.getInteractiveSequences(), lftVar, c0zVar);
        }
    }
}
