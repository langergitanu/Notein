package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class j4l extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f25012x1 = new C7017h4("style", "list-style", "number-style", "currency-style", "percentage-style", "date-style", "time-style", "boolean-style", "text-style", "page-layout");

    /* JADX INFO: renamed from: k4 */
    private List<C7394ca> f25013k4;

    public j4l() {
        m34557kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m34557kk() {
        this.f25013k4 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C7394ca> m34559k4() {
        return this.f25013k4;
    }

    public j4l(final AbstractC13912i5 abstractC13912i5) {
        m34557kk();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.j4l.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (j4l.f25012x1.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        lzc lzcVar = new lzc(abstractC13912i5);
                        list = j4l.this.f25013k4;
                        c7394ca = new C7394ca("style", lzcVar);
                        break;
                    case 1:
                        w7y w7yVar = new w7y(abstractC13912i5);
                        list = j4l.this.f25013k4;
                        c7394ca = new C7394ca("list-style", w7yVar);
                        break;
                    case 2:
                        duw duwVar = new duw(abstractC13912i5);
                        list = j4l.this.f25013k4;
                        c7394ca = new C7394ca("number-style", duwVar);
                        break;
                    case 3:
                        ka1 ka1Var = new ka1(abstractC13912i5);
                        list = j4l.this.f25013k4;
                        c7394ca = new C7394ca("currency-style", ka1Var);
                        break;
                    case 4:
                        hy0 hy0Var = new hy0(abstractC13912i5);
                        list = j4l.this.f25013k4;
                        c7394ca = new C7394ca("percentage-style", hy0Var);
                        break;
                    case 5:
                        wun wunVar = new wun(abstractC13912i5);
                        list = j4l.this.f25013k4;
                        c7394ca = new C7394ca("date-style", wunVar);
                        break;
                    case 6:
                        oup oupVar = new oup(abstractC13912i5);
                        list = j4l.this.f25013k4;
                        c7394ca = new C7394ca("time-style", oupVar);
                        break;
                    case 7:
                        g4c g4cVar = new g4c(abstractC13912i5);
                        list = j4l.this.f25013k4;
                        c7394ca = new C7394ca("boolean-style", g4cVar);
                        break;
                    case 8:
                        uf9 uf9Var = new uf9(abstractC13912i5);
                        list = j4l.this.f25013k4;
                        c7394ca = new C7394ca("text-style", uf9Var);
                        break;
                    case 9:
                        jlf jlfVar = new jlf(abstractC13912i5);
                        list = j4l.this.f25013k4;
                        c7394ca = new C7394ca("page-layout", jlfVar);
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
    public final C7394ca m34560k4(String str) {
        C7394ca c7394ca;
        switch (f25012x1.m27428k4(str)) {
            case 0:
                c7394ca = new C7394ca("style", new lzc());
                break;
            case 1:
                c7394ca = new C7394ca("list-style", new w7y());
                break;
            case 2:
                c7394ca = new C7394ca("number-style", new duw());
                break;
            case 3:
                c7394ca = new C7394ca("currency-style", new ka1());
                break;
            case 4:
                c7394ca = new C7394ca("percentage-style", new hy0());
                break;
            case 5:
                c7394ca = new C7394ca("date-style", new wun());
                break;
            case 6:
                c7394ca = new C7394ca("time-style", new oup());
                break;
            case 7:
                c7394ca = new C7394ca("boolean-style", new g4c());
                break;
            case 8:
                c7394ca = new C7394ca("text-style", new uf9());
                break;
            case 9:
                c7394ca = new C7394ca("page-layout", new jlf());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f25013k4.addItem(c7394ca);
        return c7394ca;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7394ca> it = this.f25013k4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f25012x1.m27428k4(next.m29539k4())) {
                    case 0:
                        ((lzc) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                    case 1:
                        ((w7y) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        break;
                    case 2:
                        ((duw) next.m29541kk()).mo6846k4("number", c3059ii, next.m29539k4());
                        break;
                    case 3:
                        ((ka1) next.m29541kk()).mo6846k4("number", c3059ii, next.m29539k4());
                        break;
                    case 4:
                        ((hy0) next.m29541kk()).mo6846k4("number", c3059ii, next.m29539k4());
                        break;
                    case 5:
                        ((wun) next.m29541kk()).mo6846k4("number", c3059ii, next.m29539k4());
                        break;
                    case 6:
                        ((oup) next.m29541kk()).mo6846k4("number", c3059ii, next.m29539k4());
                        break;
                    case 7:
                        ((g4c) next.m29541kk()).mo6846k4("number", c3059ii, next.m29539k4());
                        break;
                    case 8:
                        ((uf9) next.m29541kk()).mo6846k4("number", c3059ii, next.m29539k4());
                        break;
                    case 9:
                        ((jlf) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
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
