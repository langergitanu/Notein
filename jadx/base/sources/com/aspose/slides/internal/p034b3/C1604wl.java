package com.aspose.slides.internal.p034b3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p034b3.C1583dq;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p513xw.C12737w6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.b3.wl */
/* JADX INFO: loaded from: classes3.dex */
public class C1604wl implements InterfaceC1599u4 {

    /* JADX INFO: renamed from: kk */
    private C1606x1 f6207kk;

    /* JADX INFO: renamed from: x1 */
    private String f6209x1;

    /* JADX INFO: renamed from: k4 */
    private boolean f6206k4 = false;

    /* JADX INFO: renamed from: to */
    private List<InterfaceC1599u4> f6208to = null;

    public C1604wl(String str, C1606x1 c1606x1) {
        this.f6209x1 = str;
        this.f6207kk = c1606x1;
    }

    /* JADX INFO: renamed from: x1 */
    private void m8649x1(String str, C12737w6 c12737w6) {
        if (this.f6208to != null) {
            List<C12737w6> list = new List<>();
            list.addItem(c12737w6);
            List.Enumerator<InterfaceC1599u4> it = this.f6208to.iterator();
            while (it.hasNext()) {
                try {
                    it.next().mo8590k4(str, list);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8650k4(InterfaceC1599u4 interfaceC1599u4) {
        if (this.f6208to == null) {
            this.f6208to = new List<>();
        }
        this.f6208to.addItem(interfaceC1599u4);
    }

    @Override // com.aspose.slides.internal.p034b3.InterfaceC1599u4
    /* JADX INFO: renamed from: kk */
    public final boolean mo8591kk() {
        return this.f6206k4;
    }

    @Override // com.aspose.slides.internal.p034b3.InterfaceC1599u4
    /* JADX INFO: renamed from: to */
    public final String[] mo8592to() {
        return new String[]{this.f6209x1};
    }

    @Override // com.aspose.slides.internal.p034b3.InterfaceC1599u4
    /* JADX INFO: renamed from: k4 */
    public final void mo8590k4(String str, List<C12737w6> list) {
        m8651k4(str, list.get_Item(0));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8651k4(String str, C12737w6 c12737w6) {
        if (!C14113y2.m67363du(this.f6209x1, str) || c12737w6 == null) {
            return;
        }
        this.f6206k4 = true;
        if (this.f6207kk != null) {
            this.f6207kk.m8667k4(1, new C1583dq.kk(c12737w6.m59349m9(), this.f6209x1));
            this.f6207kk = null;
        }
        m8649x1(str, c12737w6);
    }
}
