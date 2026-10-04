package com.aspose.slides.internal.p034b3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p048bv.C1869to;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p111em.C3756dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p393s7.C10159m9;
import com.aspose.slides.internal.p425tq.C11097wl;
import com.aspose.slides.internal.p425tq.InterfaceC11079ck;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p513xw.C12737w6;
import com.aspose.slides.internal.p523yd.C12814to;
import com.aspose.slides.internal.p523yd.C12815x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b3.b3 */
/* JADX INFO: loaded from: classes3.dex */
public class C1579b3 extends C1587h4 {

    /* JADX INFO: renamed from: x1 */
    protected InterfaceC11079ck f6102x1;

    /* JADX INFO: renamed from: kk */
    protected List<C12737w6> f6100kk = new List<>();

    /* JADX INFO: renamed from: to */
    private List<InterfaceC1588ix> f6101to = new List<>();

    /* JADX INFO: renamed from: du */
    private List<InterfaceC1588ix> f6099du = new List<>();

    public C1579b3(C12814to c12814to, String str, C10159m9 c10159m9, AbstractC3150x6 abstractC3150x6) {
        InterfaceC11079ck interfaceC11079ckM53591k4 = c12814to.m59575ne().m53591k4(c12814to, str);
        this.f6102x1 = interfaceC11079ckM53591k4;
        try {
            interfaceC11079ckM53591k4.mo22118k4(c10159m9);
            if (!c10159m9.m49962k4()) {
                throw new C12815x1("No default font defined by OutputConverter");
            }
            this.f6102x1.mo22116k4(abstractC3150x6);
        } catch (IOException e) {
            throw new C12815x1(e.getMessage());
        }
    }

    @Override // com.aspose.slides.internal.p034b3.C1587h4
    /* JADX INFO: renamed from: k4 */
    public void mo8485k4() {
        m8490k4((C12737w6) null, true);
        m8484k4(this.f6101to);
        this.f6101to.clear();
        m8484k4(this.f6099du);
        try {
            this.f6102x1.mo22100c5();
        } catch (IOException e) {
            throw new C3756dy(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m8491kk(C12737w6 c12737w6) {
        if (this.f6102x1.mo53538jd()) {
            this.f6102x1.mo53542k4(c12737w6);
        }
        this.f6100kk.addItem(c12737w6);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m8492x1(C12737w6 c12737w6) {
        this.f6102x1.mo22141x1(c12737w6);
        if (c12737w6.mo8591kk()) {
            return;
        }
        for (String str : c12737w6.mo8592to()) {
            C1591kk.m8589k4(this.f6102x1.mo22134m9().m59580u4()).mo8626x1(this, c12737w6.m59338h4(), str);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m8484k4(List<InterfaceC1588ix> list) {
        List.Enumerator<InterfaceC1588ix> it = list.iterator();
        while (it.hasNext()) {
            try {
                this.f6102x1.mo53539k4(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p034b3.C1587h4
    /* JADX INFO: renamed from: k4 */
    public void mo8486k4(InterfaceC1588ix interfaceC1588ix) {
        int iMo8577k4 = interfaceC1588ix.mo8577k4();
        if (iMo8577k4 == 0) {
            this.f6102x1.mo53539k4(interfaceC1588ix);
        } else if (iMo8577k4 == 1) {
            this.f6101to.addItem(interfaceC1588ix);
        } else {
            if (iMo8577k4 != 2) {
                throw new Exception();
            }
            this.f6099du.addItem(interfaceC1588ix);
        }
    }

    @Override // com.aspose.slides.internal.p034b3.C1587h4
    /* JADX INFO: renamed from: k4 */
    public void mo8487k4(C1603v4 c1603v4) {
        super.mo8487k4(c1603v4);
        if (this.f6102x1.mo53538jd()) {
            this.f6102x1.mo53540k4(m8575x1());
        }
    }

    @Override // com.aspose.slides.internal.p034b3.C1587h4
    /* JADX INFO: renamed from: k4 */
    public void mo8488k4(C11697x1 c11697x1) {
        this.f6102x1.mo53541k4(c11697x1);
    }

    @Override // com.aspose.slides.internal.p034b3.C1587h4
    /* JADX INFO: renamed from: k4 */
    public void mo8489k4(C12737w6 c12737w6) {
        super.mo8489k4(c12737w6);
        if (this.f6102x1.mo53538jd() && c12737w6.mo8591kk()) {
            if (!this.f6102x1.mo53538jd() && c12737w6.m59341k4().m8648x1(c12737w6)) {
                this.f6102x1.mo53540k4(m8575x1());
            }
            try {
                this.f6102x1.mo22141x1(c12737w6);
            } catch (IOException e) {
                C11097wl.m53620k4(this.f6102x1.mo22134m9().m59580u4()).m53617k4(this, e);
            } catch (C12815x1 e2) {
                throw new InvalidOperationException(C14113y2.m67408k4("Fatal error occurred. Cannot continue. ", e2.getType().mo48540du(), ": ", C14113y2.m67408k4("Error while rendering page ", c12737w6.m59338h4())));
            }
            c12737w6.m59336dy();
        } else {
            m8491kk(c12737w6);
        }
        if (m8490k4(c12737w6, false)) {
            m8484k4(this.f6101to);
            this.f6101to.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public final boolean m8490k4(C12737w6 c12737w6, boolean z) {
        C1869to c1869to = new C1869to(this.f6100kk);
        while (c1869to.mo9764x1()) {
            C12737w6 c12737w62 = (C12737w6) c1869to.mo9760kk();
            if (c12737w62.mo8591kk() || z) {
                if (!this.f6102x1.mo53538jd() && c12737w62.m59341k4().m8648x1(c12737w62)) {
                    this.f6102x1.mo53540k4(c12737w62.m59341k4());
                }
                m8492x1(c12737w62);
                c12737w62.m59336dy();
                c1869to.mo9758k4();
            } else if (!this.f6102x1.mo53538jd()) {
                break;
            }
        }
        return this.f6102x1.mo53538jd() || this.f6100kk.size() == 0;
    }
}
