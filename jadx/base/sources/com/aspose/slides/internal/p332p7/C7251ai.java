package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.p7.ai */
/* JADX INFO: loaded from: classes4.dex */
public class C7251ai extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f20074kk = new C7017h4("documentID", "definitions", "context", "trace", "traceGroup", "traceView", "annotation", "annotationXML");

    /* JADX INFO: renamed from: k4 */
    private String f20075k4;

    /* JADX INFO: renamed from: x1 */
    private List<C7394ca> f20076x1;

    public C7251ai() {
        m28259kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m28259kk() {
        this.f20076x1 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C7394ca> m28261k4() {
        return this.f20076x1;
    }

    public C7251ai(final AbstractC13912i5 abstractC13912i5) {
        m28259kk();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.ai.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (C7251ai.f20074kk.m27428k4(str) != 0) {
                    return false;
                }
                C7251ai.this.f20075k4 = str2;
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ai.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (C7251ai.f20074kk.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 1:
                        C7214a5 c7214a5 = new C7214a5(abstractC13912i5);
                        list = C7251ai.this.f20076x1;
                        c7394ca = new C7394ca("definitions", c7214a5);
                        break;
                    case 2:
                        C8512pc c8512pc = new C8512pc(abstractC13912i5);
                        list = C7251ai.this.f20076x1;
                        c7394ca = new C7394ca("context", c8512pc);
                        break;
                    case 3:
                        C8961uk c8961uk = new C8961uk(abstractC13912i5);
                        list = C7251ai.this.f20076x1;
                        c7394ca = new C7394ca("trace", c8961uk);
                        break;
                    case 4:
                        C7909i6 c7909i6 = new C7909i6(abstractC13912i5);
                        list = C7251ai.this.f20076x1;
                        c7394ca = new C7394ca("traceGroup", c7909i6);
                        break;
                    case 5:
                        C7644f8 c7644f8 = new C7644f8(abstractC13912i5);
                        list = C7251ai.this.f20076x1;
                        c7394ca = new C7394ca("traceView", c7644f8);
                        break;
                    case 6:
                        C9063vs c9063vs = new C9063vs(abstractC13912i5);
                        list = C7251ai.this.f20076x1;
                        c7394ca = new C7394ca("annotation", c9063vs);
                        break;
                    case 7:
                        C8210lt c8210lt = new C8210lt(abstractC13912i5);
                        list = C7251ai.this.f20076x1;
                        c7394ca = new C7394ca("annotationXML", c8210lt);
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
    public final void m28262k4(C7394ca c7394ca) {
        this.f20076x1.addItem(c7394ca);
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4("inkml", str2, "http://www.w3.org/2003/InkML");
        String str3 = this.f20075k4;
        if (str3 != null) {
            c3059ii.m12955x1("documentID", str3);
        }
        List.Enumerator<C7394ca> it = this.f20076x1.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f20074kk.m27428k4(next.m29539k4())) {
                    case 1:
                        ((C7214a5) next.m29541kk()).mo6846k4("inkml", c3059ii, next.m29539k4());
                        break;
                    case 2:
                        ((C8512pc) next.m29541kk()).mo6846k4("inkml", c3059ii, next.m29539k4());
                        break;
                    case 3:
                        ((C8961uk) next.m29541kk()).mo6846k4("inkml", c3059ii, next.m29539k4());
                        break;
                    case 4:
                        ((C7909i6) next.m29541kk()).mo6846k4("inkml", c3059ii, next.m29539k4());
                        break;
                    case 5:
                        ((C7644f8) next.m29541kk()).mo6846k4("inkml", c3059ii, next.m29539k4());
                        break;
                    case 6:
                        ((C9063vs) next.m29541kk()).mo6846k4("inkml", c3059ii, next.m29539k4());
                        break;
                    case 7:
                        ((C8210lt) next.m29541kk()).mo6846k4("inkml", c3059ii, next.m29539k4());
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
