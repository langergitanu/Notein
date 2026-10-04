package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8251mb;
import com.aspose.slides.internal.p332p7.C9306yr;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class fp3 extends wsu {

    /* JADX INFO: renamed from: kk */
    private o5n f5078kk;

    /* JADX INFO: renamed from: k4 */
    private List<C14481t0> f5077k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    private List<o5n> f5079x1 = new List<>();

    public fp3(a7l a7lVar, C9306yr c9306yr) {
        List.Enumerator<C7394ca> it;
        C8251mb[] c8251mbArrM45107x1 = c9306yr.m45107x1();
        int length = c8251mbArrM45107x1.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            C8251mb c8251mb = c8251mbArrM45107x1[i];
            this.f5077k4.addItem(new C14481t0(c8251mb, this));
            o5n o5nVar = new o5n();
            it = c8251mb.m36766ck().iterator();
            while (it.hasNext()) {
                try {
                    wsu wsuVarM72915k4 = wsu.m72915k4(a7lVar, it.next().m29542x1(), this);
                    if (wsuVarM72915k4 != null) {
                        o5nVar.m68340k4(wsuVarM72915k4);
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
            this.f5079x1.addItem(o5nVar);
            i++;
        }
        this.f5078kk = new o5n();
        it = c9306yr.m45106kk().m35052k4().iterator();
        while (it.hasNext()) {
            try {
                wsu wsuVarM72915k42 = wsu.m72915k4(a7lVar, it.next().m29542x1(), this);
                if (wsuVarM72915k42 != null) {
                    this.f5078kk.m68340k4(wsuVarM72915k42);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    @Override // com.aspose.slides.wsu
    /* JADX INFO: renamed from: J_ */
    public String mo4816J_() {
        return ((C9306yr) m72921ne()).m45105k4();
    }

    @Override // com.aspose.slides.wsu
    /* JADX INFO: renamed from: K_ */
    public boolean mo6244K_() {
        return true;
    }

    @Override // com.aspose.slides.wsu
    /* JADX INFO: renamed from: k4 */
    public o5n mo6245k4(C14244on c14244on, bay bayVar) {
        for (int i = 0; i < this.f5079x1.size(); i++) {
            if (this.f5077k4.get_Item(i).m70916k4(c14244on, bayVar)) {
                return this.f5079x1.get_Item(i);
            }
        }
        return this.f5078kk;
    }

    @Override // com.aspose.slides.wsu
    /* JADX INFO: renamed from: k4 */
    public void mo4817k4(bay bayVar, C14244on c14244on) {
        o5n o5nVarMo6245k4 = mo6245k4(c14244on, bayVar);
        if (o5nVarMo6245k4 != null) {
            IGenericEnumerator<wsu> it = o5nVarMo6245k4.iterator();
            while (it.hasNext()) {
                try {
                    it.next().mo4817k4(bayVar, c14244on);
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
    }
}
