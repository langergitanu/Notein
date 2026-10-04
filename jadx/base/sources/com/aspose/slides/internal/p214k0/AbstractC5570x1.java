package com.aspose.slides.internal.p214k0;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p075d5.C3023to;
import com.aspose.slides.internal.p143g4.AbstractC4205to;
import com.aspose.slides.internal.p143g4.C4200du;
import com.aspose.slides.internal.p143g4.C4201h4;
import com.aspose.slides.internal.p143g4.C4202k4;
import com.aspose.slides.internal.p143g4.C4203kk;
import com.aspose.slides.internal.p183ij.C5061vw;
import com.aspose.slides.internal.p277mm.C6400x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p360qg.C9877yj;
import com.aspose.slides.internal.p374qz.C9966k4;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p501xj.C12537k4;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.k0.x1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5570x1 extends AbstractC5568kk {

    /* JADX INFO: renamed from: h4 */
    private C4201h4 f15346h4;

    public AbstractC5570x1(C9966k4 c9966k4, C5569to c5569to) {
        super(c9966k4, c5569to);
        C4201h4 c4201h4 = new C4201h4(new C4202k4());
        this.f15346h4 = c4201h4;
        c4201h4.m16709k4(new C4203kk(c9966k4.m49083jd().m21562k4().m7841to() & 65535));
        this.f15346h4.m16776x6().m16794k4(0L, c9966k4);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo22886k4(C11913yj c11913yj, C4201h4 c4201h4);

    @Override // com.aspose.slides.internal.p214k0.AbstractC5568kk
    /* JADX INFO: renamed from: k4 */
    public void mo22892k4(C12009k4 c12009k4) {
        this.f15346h4.m16715k4(c12009k4);
    }

    @Override // com.aspose.slides.internal.p214k0.AbstractC5568kk
    /* JADX INFO: renamed from: k4 */
    public <TSurface> void mo22884k4(TSurface tsurface, C11913yj c11913yj) {
        this.f15346h4.m16710k4(m22893kk());
        this.f15346h4.m16723k4(tsurface);
        mo22886k4(c11913yj, this.f15346h4);
        IGenericEnumerator<C3023to> it = m22894x1().m12729k4().iterator();
        while (it.hasNext()) {
            try {
                C5061vw c5061vw = (C5061vw) it.next();
                AbstractC4205to abstractC4205toM16672k4 = C4200du.m16672k4(c5061vw.m21561v4());
                if (abstractC4205toM16672k4 == null) {
                    throw new C12537k4(C14113y2.m67408k4("Player for ", C14042ak.m66410k4(C9877yj.class, c5061vw.m21561v4()), " was not found."));
                }
                abstractC4205toM16672k4.m16875k4(c5061vw, this.f15346h4);
                if (c5061vw.m21561v4() == 14) {
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        C6400x1.m26264k4();
    }
}
