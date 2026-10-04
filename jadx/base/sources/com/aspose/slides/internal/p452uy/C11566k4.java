package com.aspose.slides.internal.p452uy;

import com.aspose.slides.internal.p205ji.AbstractC5470v4;
import com.aspose.slides.internal.p205ji.C5458kk;
import com.aspose.slides.internal.p395sa.AbstractC10169x1;
import com.aspose.slides.p559ms.System.AbstractC14078m9;
import com.aspose.slides.p559ms.System.InterfaceC14083qm;

/* JADX INFO: renamed from: com.aspose.slides.internal.uy.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11566k4 implements InterfaceC14083qm {

    /* JADX INFO: renamed from: du */
    private Object f39072du;

    /* JADX INFO: renamed from: k4 */
    private AbstractC14078m9 f39073k4;

    /* JADX INFO: renamed from: kk */
    private C5458kk f39074kk;

    /* JADX INFO: renamed from: to */
    private boolean f39075to;

    /* JADX INFO: renamed from: x1 */
    private Object f39076x1;

    public C11566k4(AbstractC10169x1 abstractC10169x1) {
        this.f39073k4 = abstractC10169x1.getCallback();
        this.f39076x1 = abstractC10169x1.getState();
        this.f39072du = abstractC10169x1.getDelegate();
    }

    /* JADX INFO: renamed from: du */
    private void m54568du() {
        synchronized (this) {
            try {
                if (this.f39074kk == null) {
                    this.f39074kk = new C5458kk(this.f39075to);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14083qm
    /* JADX INFO: renamed from: k4 */
    public Object mo18725k4() {
        return this.f39076x1;
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14083qm
    /* JADX INFO: renamed from: kk */
    public boolean mo18728kk() {
        return this.f39075to;
    }

    /* JADX INFO: renamed from: to */
    public void m54569to() {
        synchronized (this) {
            try {
                this.f39075to = true;
                C5458kk c5458kk = this.f39074kk;
                if (c5458kk != null) {
                    c5458kk.mo22555x1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC14078m9 abstractC14078m9 = this.f39073k4;
        if (abstractC14078m9 != null) {
            abstractC14078m9.mo18688k4(this);
        }
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14083qm
    /* JADX INFO: renamed from: x1 */
    public AbstractC5470v4 mo18731x1() {
        m54568du();
        return this.f39074kk;
    }
}
