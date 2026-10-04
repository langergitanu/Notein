package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7975j4;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class s0k extends wsu {

    /* JADX INFO: renamed from: k4 */
    private List<bay> f48737k4 = new List<>();

    /* JADX INFO: renamed from: kk */
    private fwr[] f48738kk;

    /* JADX INFO: renamed from: x1 */
    private fwr[] f48739x1;

    public s0k(C7975j4 c7975j4) {
    }

    @Override // com.aspose.slides.wsu
    /* JADX INFO: renamed from: k4 */
    public void mo4817k4(bay bayVar, C14244on c14244on) {
        this.f48737k4.addItem(bayVar);
        bayVar.m4091k4(this);
    }

    /* JADX INFO: renamed from: kk */
    public final fwr[] m70407kk() {
        if (this.f48738kk == null) {
            List list = new List();
            IGenericEnumerator<wsu> it = m72920ks().iterator();
            while (it.hasNext()) {
                try {
                    fwr fwrVar = (fwr) it.next();
                    if (!C14044b3.m66437kk(fwrVar.m6346h4())) {
                        list.addItem(fwrVar);
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            this.f48738kk = (fwr[]) list.toArray(new fwr[0]);
        }
        return this.f48738kk;
    }

    /* JADX INFO: renamed from: to */
    public final fwr[] m70408to() {
        if (this.f48739x1 == null) {
            List list = new List();
            IGenericEnumerator<wsu> it = m72920ks().iterator();
            while (true) {
                try {
                    int i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    fwr fwrVar = (fwr) it.next();
                    if (!C14044b3.m66437kk(fwrVar.m6345dy())) {
                        while (true) {
                            if (i >= list.size()) {
                                list.addItem(fwrVar);
                                break;
                            }
                            fwr fwrVar2 = (fwr) list.get_Item(i);
                            if (fwrVar2.m6348kk() != fwrVar.m6348kk() || !C14113y2.m67363du(fwrVar2.m6349to(), fwrVar.m6349to()) || fwrVar2.m6344du() != fwrVar.m6344du()) {
                                i++;
                            } else if (fwrVar.m6345dy() < fwrVar2.m6345dy()) {
                                list.set_Item(i, fwrVar);
                            }
                        }
                    }
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            this.f48739x1 = (fwr[]) list.toArray(new fwr[0]);
        }
        return this.f48739x1;
    }
}
