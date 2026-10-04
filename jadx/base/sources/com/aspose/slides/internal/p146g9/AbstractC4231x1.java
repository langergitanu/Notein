package com.aspose.slides.internal.p146g9;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p086dl.C3180k4;
import com.aspose.slides.internal.p102e8.AbstractC3589to;
import com.aspose.slides.internal.p102e8.C3584du;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p102e8.C3586k4;
import com.aspose.slides.internal.p102e8.C3587kk;
import com.aspose.slides.internal.p124f7.C3878yj;
import com.aspose.slides.internal.p280ms.C6490k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p500xi.C12535to;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.g9.x1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4231x1 extends AbstractC4229kk {

    /* JADX INFO: renamed from: h4 */
    private C3585h4 f11550h4;

    public AbstractC4231x1(C3180k4 c3180k4, C4230to c4230to) {
        super(c3180k4, c4230to);
        C3585h4 c3585h4 = new C3585h4(new C3586k4());
        this.f11550h4 = c3585h4;
        c3585h4.m14507k4(new C3587kk(c3180k4.m13619ck().m47769k4().m25430ck() & 65535));
        this.f11550h4.m14577x6().m14597k4(0L, c3180k4);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo17033k4(C11913yj c11913yj, C3585h4 c3585h4);

    @Override // com.aspose.slides.internal.p146g9.AbstractC4229kk
    /* JADX INFO: renamed from: k4 */
    public void mo17030k4(C12009k4 c12009k4) {
        this.f11550h4.m14515k4(c12009k4);
    }

    @Override // com.aspose.slides.internal.p146g9.AbstractC4229kk
    /* JADX INFO: renamed from: k4 */
    public void mo17031k4(Object obj, C11913yj c11913yj) {
        this.f11550h4.m14508k4(m17040kk());
        this.f11550h4.m14524k4(obj);
        mo17033k4(c11913yj, this.f11550h4);
        IGenericEnumerator<C12535to> it = m17041x1().m58364k4().iterator();
        while (it.hasNext()) {
            try {
                C9723vw c9723vw = (C9723vw) it.next();
                AbstractC3589to abstractC3589toM14473k4 = C3584du.m14473k4(c9723vw.m47767v4());
                if (abstractC3589toM14473k4 == null) {
                    throw new C6490k4(C14113y2.m67408k4("Player for ", C14042ak.m66410k4(C3878yj.class, c9723vw.m47767v4()), " was not found."));
                }
                abstractC3589toM14473k4.m14682k4(c9723vw, this.f11550h4);
                if (c9723vw.m47767v4() == 14) {
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
