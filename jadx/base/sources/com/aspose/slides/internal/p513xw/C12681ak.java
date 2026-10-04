package com.aspose.slides.internal.p513xw;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p048bv.InterfaceC1861h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p462vj.C11675v4;
import com.aspose.slides.internal.p462vj.InterfaceC11646ar;

/* JADX INFO: renamed from: com.aspose.slides.internal.xw.ak */
/* JADX INFO: loaded from: classes5.dex */
public class C12681ak extends AbstractC12725sv {

    /* JADX INFO: renamed from: k4 */
    private boolean f42157k4 = false;

    /* JADX INFO: renamed from: du */
    public final void m58834du() {
        C12688c6 c12688c6 = (C12688c6) m59197jd();
        if (!c12688c6.m59251ks() || (size() >= 4 && m59198k4(size() - 2).mo58932x_() && m59198k4(size() - 3).mo59086y_() && m59198k4(size() - 4).mo58895yj())) {
            m59196ck();
            List<InterfaceC1861h4> list = new List<>();
            boolean zM59251ks = c12688c6.m59251ks();
            list.addItem(c12688c6);
            if (zM59251ks) {
                list.insertItem(0, (C12694e0) m59196ck());
                list.insertItem(0, (C12718qm) m59196ck());
                list.insertItem(0, (C12688c6) m59196ck());
            }
            addRange(((InterfaceC11646ar) c12688c6.m59135wl()).mo54799k4(list));
            C11675v4 c11675v4 = (C11675v4) C7019kk.m27452k4((Object) c12688c6, C11675v4.class);
            if (c11675v4 == null || !c11675v4.m54991ck()) {
                return;
            }
            C11675v4 c11675v42 = (C11675v4) m59197jd();
            c11675v42.m54994k4(c11675v4.m54993jd());
            c11675v42.m54995k4(c11675v4.m54996m9());
        }
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12725sv
    /* JADX INFO: renamed from: dy */
    public boolean mo58835dy() {
        return true;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12725sv
    /* JADX INFO: renamed from: k4 */
    public boolean mo58836k4(AbstractC12725sv abstractC12725sv) {
        return abstractC12725sv.mo58835dy() && !this.f42157k4;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12725sv
    /* JADX INFO: renamed from: m9 */
    public AbstractC12725sv mo55023m9() {
        if (!this.f42157k4) {
            addItem(new C12718qm(0, -1000, false, null, false));
            this.f42157k4 = true;
        }
        return this;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12725sv
    /* JADX INFO: renamed from: x1 */
    public boolean mo58838x1(AbstractC12725sv abstractC12725sv) {
        if (!mo58836k4(abstractC12725sv)) {
            return false;
        }
        AbstractC12723s7 abstractC12723s7M59197jd = m59197jd();
        AbstractC12723s7 abstractC12723s7M59198k4 = abstractC12725sv.m59198k4(0);
        if (abstractC12723s7M59198k4.mo58895yj() && !((AbstractC12729ts) abstractC12723s7M59198k4).m59251ks() && abstractC12723s7M59197jd.mo58895yj() && ((AbstractC12729ts) abstractC12723s7M59197jd).m59252rv() != 0) {
            m58834du();
        }
        addRange(abstractC12725sv);
        return true;
    }

    @Override // com.aspose.slides.internal.p513xw.AbstractC12725sv
    /* JADX INFO: renamed from: k4 */
    public boolean mo58837k4(AbstractC12725sv abstractC12725sv, boolean z, C12722rv c12722rv) {
        return mo58838x1(abstractC12725sv);
    }
}
