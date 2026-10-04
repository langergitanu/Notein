package com.aspose.slides.internal.p128fc;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p045br.C1844m9;
import com.aspose.slides.internal.p278mq.InterfaceC6407to;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.internal.p329p4.C7191up;
import com.aspose.slides.internal.p341po.InterfaceC9473k4;
import com.aspose.slides.internal.p341po.InterfaceC9477x1;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p506xo.AbstractC12588to;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.fc.to */
/* JADX INFO: loaded from: classes.dex */
public class C3955to extends C3915ai {
    public C3955to(InterfaceC9477x1 interfaceC9477x1, InterfaceC9473k4 interfaceC9473k4, InterfaceC6407to interfaceC6407to) {
        super(interfaceC9477x1, interfaceC9473k4, interfaceC6407to);
    }

    /* JADX INFO: renamed from: k4 */
    private void m15657k4(List<C7185jd> list) {
        C7187kk c7187kk;
        C7191up c7191up;
        if (list.size() < 2 || ((C7182dy) C7019kk.m27452k4((Object) list.get_Item(0), C7182dy.class)) == null || (c7187kk = (C7187kk) C7019kk.m27452k4((Object) list.get_Item(1), C7187kk.class)) == null || this.f10646x1.mo26289x1() == null) {
            return;
        }
        AbstractC12588to abstractC12588toM46622h4 = this.f10644k4.mo46638k4().m46554c5().m46622h4();
        if (abstractC12588toM46622h4 != null && abstractC12588toM46622h4.m58772to() == null) {
            abstractC12588toM46622h4.m58762k4(C1844m9.f6683kk);
        }
        int size = this.f10646x1.mo26283k4().size();
        Dictionary.Enumerator<C7182dy, C7185jd> it = c7187kk.m27812x1().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (next.getKey() == C7182dy.f19640to && (c7191up = (C7191up) C7019kk.m27452k4(next.getValue(), C7191up.class)) != null) {
                    m15631k4(c7191up.m27846k4());
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (this.f10646x1.mo26283k4().size() > size) {
            this.f10646x1.mo26286k4(true);
        }
    }

    @Override // com.aspose.slides.internal.p128fc.C3915ai, com.aspose.slides.internal.p128fc.InterfaceC3941ks
    /* JADX INFO: renamed from: k4 */
    public void mo15630k4(C3958u4 c3958u4, List<C7185jd> list) {
        m15657k4(list);
        if (this.f10646x1.mo26281du()) {
            return;
        }
        this.f10646x1.mo26285k4(new C11913yj());
        this.f10646x1.mo26290x1(new C11913yj());
    }
}
