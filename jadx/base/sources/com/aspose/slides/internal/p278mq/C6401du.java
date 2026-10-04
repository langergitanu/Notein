package com.aspose.slides.internal.p278mq;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p271mc.C6360ck;
import com.aspose.slides.internal.p271mc.C6368m9;
import com.aspose.slides.internal.p401sl.AbstractC10240to;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.mq.du */
/* JADX INFO: loaded from: classes4.dex */
public class C6401du implements InterfaceC6404k4 {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC6408x1 f18191k4;

    /* JADX INFO: renamed from: x1 */
    private List<C6368m9> f18192x1;

    public C6401du(InterfaceC6408x1 interfaceC6408x1) {
        if (interfaceC6408x1 == null) {
            throw new ArgumentNullException("IOrderer instance can not be null.");
        }
        this.f18191k4 = interfaceC6408x1;
        m26267k4(new List<>());
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6404k4
    /* JADX INFO: renamed from: k4 */
    public final List<C6368m9> mo26268k4() {
        return this.f18192x1;
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6404k4
    /* JADX INFO: renamed from: x1 */
    public final void mo26270x1() {
        mo26268k4().clear();
    }

    /* JADX INFO: renamed from: k4 */
    private void m26267k4(List<C6368m9> list) {
        this.f18192x1 = list;
    }

    @Override // com.aspose.slides.internal.p278mq.InterfaceC6404k4
    /* JADX INFO: renamed from: k4 */
    public final void mo26269k4(String str, AbstractC10240to abstractC10240to, C12007ix c12007ix, float f, C6360ck c6360ck, boolean z, boolean z2) {
        C6368m9 c6368m9 = new C6368m9(str, abstractC10240to, c12007ix.Clone(), this.f18191k4.mo26291k4(), c6360ck);
        c6368m9.m26168k4(f);
        c6368m9.m26169k4(z);
        c6368m9.m26173x1(z2);
        mo26268k4().addItem(c6368m9);
    }
}
