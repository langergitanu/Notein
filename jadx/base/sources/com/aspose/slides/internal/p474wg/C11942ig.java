package com.aspose.slides.internal.p474wg;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.p559ms.System.AbstractC14078m9;
import com.aspose.slides.p559ms.System.InterfaceC14083qm;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.ig */
/* JADX INFO: loaded from: classes5.dex */
class C11942ig extends AbstractC14078m9 {

    /* JADX INFO: renamed from: k4 */
    final /* synthetic */ C11971tq f40255k4;

    /* JADX INFO: renamed from: x1 */
    final /* synthetic */ C11953m2 f40256x1;

    public C11942ig(C11953m2 c11953m2, C11971tq c11971tq) {
        this.f40256x1 = c11953m2;
        this.f40255k4 = c11971tq;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14078m9
    /* JADX INFO: renamed from: k4 */
    public void mo18688k4(InterfaceC14083qm interfaceC14083qm) {
        try {
            this.f40256x1.f40289du.m55857k4(this.f40256x1.f40292h4, true, interfaceC14083qm);
            if (!this.f40256x1.f40304um) {
                this.f40256x1.f40304um = true;
                C11917ai.m55839k4((Object) this.f40256x1.f40289du);
            }
            long jMo56202du = this.f40256x1.f40292h4.mo56202du();
            if (!this.f40256x1.f40299ne && jMo56202du == 0) {
                this.f40256x1.f40303u4 = true;
            }
            this.f40255k4.m56122k4(false);
        } catch (C11997yo e) {
            this.f40255k4.m56123k4(false, (Exception) e);
        } catch (Exception e2) {
            this.f40255k4.m56123k4(false, (Exception) new C11997yo("Error writing headers", e2, 4));
        }
    }
}
