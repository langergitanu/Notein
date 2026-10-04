package com.aspose.slides.internal.p486wy;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p034b3.C1604wl;
import com.aspose.slides.internal.p034b3.C1606x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.wy.kk */
/* JADX INFO: loaded from: classes5.dex */
public class C12319kk extends C12317jd {

    /* JADX INFO: renamed from: yj */
    private C1604wl f41191yj;

    /* JADX INFO: renamed from: k4 */
    public final void m57598k4(C1604wl c1604wl) {
        this.f41191yj = c1604wl;
    }

    /* JADX INFO: renamed from: u4 */
    public final C1604wl m57599u4() {
        return this.f41191yj;
    }

    @Override // com.aspose.slides.internal.p034b3.C1606x1
    /* JADX INFO: renamed from: x1 */
    public void mo8680x1(C1606x1 c1606x1) {
        super.mo8680x1(c1606x1);
        m57573ks(m57577um() + this.f41184up);
        List.Enumerator<C12314dy> it = ((C12317jd) this).f41182ck.iterator();
        while (it.hasNext()) {
            try {
                C12314dy next = it.next();
                next.m57573ks(next.m57577um() - this.f41184up);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m8670kk(mo57569ar());
    }
}
