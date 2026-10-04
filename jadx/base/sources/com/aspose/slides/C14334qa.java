package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.qa */
/* JADX INFO: loaded from: classes3.dex */
class C14334qa implements IGenericEnumerable<C0702a3> {

    /* JADX INFO: renamed from: k4 */
    private List<C0702a3> f48274k4 = new List<>();

    @Override // java.lang.Iterable
    public final IGenericEnumerator<C0702a3> iterator() {
        return this.f48274k4.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final C0702a3 m69466k4(bay bayVar, int i) {
        List.Enumerator<C0702a3> it = this.f48274k4.iterator();
        while (it.hasNext()) {
            try {
                C0702a3 next = it.next();
                if (next.m3170k4() == bayVar && next.m3174x1() == i) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return next;
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        C0702a3 c0702a3 = new C0702a3(bayVar, i, bayVar.m4101to(i), bayVar.m4072du(i));
        this.f48274k4.addItem(c0702a3);
        return c0702a3;
    }
}
