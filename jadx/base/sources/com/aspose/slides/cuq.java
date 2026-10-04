package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8404o5;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class cuq extends wsu {

    /* JADX INFO: renamed from: k4 */
    private C13719ka f4444k4;

    /* JADX INFO: renamed from: x1 */
    private cuq f4445x1;

    public cuq(a7l a7lVar, C8404o5 c8404o5) {
        this.f4444k4 = new C13719ka(c8404o5);
    }

    /* JADX INFO: renamed from: to */
    private C8404o5 m4815to() {
        return (C8404o5) m72921ne();
    }

    @Override // com.aspose.slides.wsu
    /* JADX INFO: renamed from: J_ */
    public String mo4816J_() {
        return m4815to().m38007k4();
    }

    @Override // com.aspose.slides.wsu
    /* JADX INFO: renamed from: k4 */
    public void mo4817k4(bay bayVar, C14244on c14244on) {
        cuq cuqVar;
        if (!C14113y2.m67411k4(m4815to().m38011x1())) {
            if (this.f4445x1 == null && (cuqVar = (cuq) C7019kk.m27452k4((Object) m72917k4(m72922rv().m3350k4(), m4815to().m38011x1()), cuq.class)) != null) {
                this.f4445x1 = (cuq) cuqVar.m72916k4(this);
            }
            cuq cuqVar2 = this.f4445x1;
            if (cuqVar2 != null) {
                cuqVar2.mo4817k4(bayVar, c14244on);
                return;
            }
            return;
        }
        List.Enumerator<C14244on> it = c14244on.m68725k4(m4818kk(), true).iterator();
        while (it.hasNext()) {
            try {
                C14244on next = it.next();
                IGenericEnumerator<wsu> it2 = m72920ks().iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().mo4817k4(bayVar, next);
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: kk */
    public final C13719ka m4818kk() {
        return this.f4444k4;
    }
}
