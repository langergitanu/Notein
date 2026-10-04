package com.aspose.slides.internal.p104ec;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ec.g8 */
/* JADX INFO: loaded from: classes3.dex */
public class C3612g8 extends AbstractC3629m4 {

    /* JADX INFO: renamed from: k4 */
    private final int f10042k4;

    /* JADX INFO: renamed from: x1 */
    private List<C3653w6> f10043x1 = new List<>();

    public C3612g8(int i) {
        this.f10042k4 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C3653w6> m14734k4() {
        return this.f10043x1;
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14692k4(C3134k4 c3134k4) {
        while ((C3623k4.m14763k4(c3134k4) & 65535) != 15) {
            C3653w6 c3653w6 = new C3653w6(this.f10042k4);
            c3653w6.mo14692k4(c3134k4);
            this.f10043x1.addItem(c3653w6);
        }
    }

    @Override // com.aspose.slides.internal.p104ec.AbstractC3629m4
    /* JADX INFO: renamed from: k4 */
    public void mo14697k4(C3149x1 c3149x1) {
        List.Enumerator<C3653w6> it = this.f10043x1.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo14697k4(c3149x1);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
