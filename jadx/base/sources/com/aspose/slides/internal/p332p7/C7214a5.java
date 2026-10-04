package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.a5 */
/* JADX INFO: loaded from: classes4.dex */
public class C7214a5 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f19840x1 = new C7017h4("brush", "canvas", "canvasTransform", "context", "inkSource", "mapping", "timestamp", "trace", "traceFormat", "traceGroup", "traceView");

    /* JADX INFO: renamed from: k4 */
    private List<C7394ca> f19841k4;

    public C7214a5() {
        m27941kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m27941kk() {
        this.f19841k4 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C7394ca> m27943k4() {
        return this.f19841k4;
    }

    public C7214a5(final AbstractC13912i5 abstractC13912i5) {
        m27941kk();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.a5.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (C7214a5.f19840x1.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        C7218a7 c7218a7 = new C7218a7(abstractC13912i5);
                        list = C7214a5.this.f19841k4;
                        c7394ca = new C7394ca("brush", c7218a7);
                        break;
                    case 1:
                        C7508ds c7508ds = new C7508ds(abstractC13912i5);
                        list = C7214a5.this.f19841k4;
                        c7394ca = new C7394ca("canvas", c7508ds);
                        break;
                    case 2:
                        C8153l2 c8153l2 = new C8153l2(abstractC13912i5);
                        list = C7214a5.this.f19841k4;
                        c7394ca = new C7394ca("canvasTransform", c8153l2);
                        break;
                    case 3:
                        C8512pc c8512pc = new C8512pc(abstractC13912i5);
                        list = C7214a5.this.f19841k4;
                        c7394ca = new C7394ca("context", c8512pc);
                        break;
                    case 4:
                        C7355bw c7355bw = new C7355bw(abstractC13912i5);
                        list = C7214a5.this.f19841k4;
                        c7394ca = new C7394ca("inkSource", c7355bw);
                        break;
                    case 5:
                        C8743s6 c8743s6 = new C8743s6(abstractC13912i5);
                        list = C7214a5.this.f19841k4;
                        c7394ca = new C7394ca("mapping", c8743s6);
                        break;
                    case 6:
                        C8925u7 c8925u7 = new C8925u7(abstractC13912i5);
                        list = C7214a5.this.f19841k4;
                        c7394ca = new C7394ca("timestamp", c8925u7);
                        break;
                    case 7:
                        C8961uk c8961uk = new C8961uk(abstractC13912i5);
                        list = C7214a5.this.f19841k4;
                        c7394ca = new C7394ca("trace", c8961uk);
                        break;
                    case 8:
                        C9340z3 c9340z3 = new C9340z3(abstractC13912i5);
                        list = C7214a5.this.f19841k4;
                        c7394ca = new C7394ca("traceFormat", c9340z3);
                        break;
                    case 9:
                        C7909i6 c7909i6 = new C7909i6(abstractC13912i5);
                        list = C7214a5.this.f19841k4;
                        c7394ca = new C7394ca("traceGroup", c7909i6);
                        break;
                    case 10:
                        C7644f8 c7644f8 = new C7644f8(abstractC13912i5);
                        list = C7214a5.this.f19841k4;
                        c7394ca = new C7394ca("traceView", c7644f8);
                        break;
                    default:
                        return false;
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27944k4(C7394ca c7394ca) {
        this.f19841k4.addItem(c7394ca);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7394ca> it = this.f19841k4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f19840x1.m27428k4(next.m29539k4())) {
                    case 0:
                        ((C7218a7) next.m29541kk()).mo6846k4("inkml", c3059ii, next.m29539k4());
                        break;
                    case 1:
                        ((C7508ds) next.m29541kk()).mo6846k4("inkml", c3059ii, next.m29539k4());
                        break;
                    case 2:
                        ((C8153l2) next.m29541kk()).mo6846k4("inkml", c3059ii, next.m29539k4());
                        break;
                    case 3:
                        ((C8512pc) next.m29541kk()).mo6846k4("inkml", c3059ii, next.m29539k4());
                        break;
                    case 4:
                        ((C7355bw) next.m29541kk()).mo6846k4("inkml", c3059ii, next.m29539k4());
                        break;
                    case 5:
                        ((C8743s6) next.m29541kk()).mo6846k4("inkml", c3059ii, next.m29539k4());
                        break;
                    case 6:
                        ((C8925u7) next.m29541kk()).mo6846k4("inkml", c3059ii, next.m29539k4());
                        break;
                    case 7:
                        ((C8961uk) next.m29541kk()).mo6846k4("inkml", c3059ii, next.m29539k4());
                        break;
                    case 8:
                        ((C9340z3) next.m29541kk()).mo6846k4("inkml", c3059ii, next.m29539k4());
                        break;
                    case 9:
                        ((C7909i6) next.m29541kk()).mo6846k4("inkml", c3059ii, next.m29539k4());
                        break;
                    case 10:
                        ((C7644f8) next.m29541kk()).mo6846k4("inkml", c3059ii, next.m29539k4());
                        break;
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
        c3059ii.mo21898jd();
    }
}
