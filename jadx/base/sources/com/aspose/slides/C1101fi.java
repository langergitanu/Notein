package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8124kr;
import com.aspose.slides.internal.p332p7.C8488p1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.fi */
/* JADX INFO: loaded from: classes3.dex */
class C1101fi implements IGenericEnumerable<C14648us> {

    /* JADX INFO: renamed from: k4 */
    private final C8124kr f5050k4;

    /* JADX INFO: renamed from: x1 */
    private final List<C14648us> f5051x1;

    public C1101fi(C8124kr c8124kr, SmartArt smartArt, gnb gnbVar) {
        this.f5050k4 = c8124kr;
        C8488p1[] c8488p1ArrM35648k4 = c8124kr.m35648k4();
        this.f5051x1 = new List<>(c8488p1ArrM35648k4.length);
        for (C8488p1 c8488p1 : c8488p1ArrM35648k4) {
            this.f5051x1.addItem(new C14648us(c8488p1, smartArt, gnbVar));
        }
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<C14648us> iterator() {
        return this.f5051x1.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final C14648us m6183k4(String str, int i) {
        List.Enumerator<C14648us> it = this.f5051x1.iterator();
        while (it.hasNext()) {
            try {
                C14648us next = it.next();
                if (next.m71865du() == i || i == 0) {
                    if (str == null || C14113y2.m67363du(next.m71876to(), str)) {
                        return next;
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C14648us m6184k4(String str, String str2) {
        List.Enumerator<C14648us> it = this.f5051x1.iterator();
        while (it.hasNext()) {
            try {
                C14648us next = it.next();
                if (C14113y2.m67363du(next.m71873kk().m28388x1(), str) && C14113y2.m67363du(next.m71873kk().m28370kk(), str2)) {
                    return next;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6185k4(C14648us c14648us) {
        this.f5051x1.addItem(c14648us);
        this.f5050k4.m35647k4(C14648us.m71861k4(c14648us));
    }
}
