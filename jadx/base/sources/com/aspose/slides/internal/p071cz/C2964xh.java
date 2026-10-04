package com.aspose.slides.internal.p071cz;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.xh */
/* JADX INFO: loaded from: classes3.dex */
public final class C2964xh implements IGenericCloneable<C2964xh> {

    /* JADX INFO: renamed from: k4 */
    private final List<C2824mu> f8799k4 = new List<>();

    private C2964xh(C2964xh c2964xh) {
        List.Enumerator<C2824mu> it = c2964xh.f8799k4.iterator();
        while (it.hasNext()) {
            try {
                m12596k4(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C2964xh cloneT() {
        return new C2964xh(this);
    }

    /* JADX INFO: renamed from: k4 */
    public void m12596k4(C2824mu c2824mu) {
        if (c2824mu == null) {
            throw new ArgumentNullException("tabStop");
        }
        if (this.f8799k4.size() == 32) {
            throw new C2866q3("Too many tab stops");
        }
        this.f8799k4.addItem(c2824mu.cloneT());
    }
}
