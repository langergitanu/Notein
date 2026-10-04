package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class vht extends AbstractC7361bz {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f31870kk = new C7017h4("style:family", "chart-properties", "graphic-properties", "table-cell-properties", "paragraph-properties", "text-properties", "section-properties", "ruby-properties", "table-properties", "table-column-properties", "table-row-properties", "drawing-page-properties");

    /* JADX INFO: renamed from: k4 */
    private int f31871k4;

    /* JADX INFO: renamed from: x1 */
    private List<C7394ca> f31872x1;

    public vht() {
        m43107to();
    }

    /* JADX INFO: renamed from: to */
    private void m43107to() {
        this.f31871k4 = 0;
        this.f31872x1 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m43108k4() {
        return this.f31871k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C7394ca> m43109x1() {
        return this.f31872x1;
    }

    public vht(final AbstractC13912i5 abstractC13912i5) {
        m43107to();
        AbstractC7361bz.m29289k4(abstractC13912i5, new AbstractC7361bz.k4() { // from class: com.aspose.slides.internal.p7.vht.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.k4
            /* JADX INFO: renamed from: k4 */
            public boolean mo27882k4(String str, String str2) {
                if (vht.f31870kk.m27428k4(str) != 0) {
                    return false;
                }
                vht.this.f31871k4 = hj7.m33486k4(str2);
                return true;
            }
        });
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.vht.2
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (vht.f31870kk.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 1:
                        im9 im9Var = new im9(abstractC13912i5);
                        list = vht.this.f31872x1;
                        c7394ca = new C7394ca("chart-properties", im9Var);
                        break;
                    case 2:
                        rsv rsvVar = new rsv(abstractC13912i5);
                        list = vht.this.f31872x1;
                        c7394ca = new C7394ca("graphic-properties", rsvVar);
                        break;
                    case 3:
                        v9h v9hVar = new v9h(abstractC13912i5);
                        list = vht.this.f31872x1;
                        c7394ca = new C7394ca("table-cell-properties", v9hVar);
                        break;
                    case 4:
                        mdp mdpVar = new mdp(abstractC13912i5);
                        list = vht.this.f31872x1;
                        c7394ca = new C7394ca("paragraph-properties", mdpVar);
                        break;
                    case 5:
                        zob zobVar = new zob(abstractC13912i5);
                        list = vht.this.f31872x1;
                        c7394ca = new C7394ca("text-properties", zobVar);
                        break;
                    case 6:
                        lgn lgnVar = new lgn(abstractC13912i5);
                        list = vht.this.f31872x1;
                        c7394ca = new C7394ca("section-properties", lgnVar);
                        break;
                    case 7:
                        eej eejVar = new eej(abstractC13912i5);
                        list = vht.this.f31872x1;
                        c7394ca = new C7394ca("ruby-properties", eejVar);
                        break;
                    case 8:
                        crt crtVar = new crt(abstractC13912i5);
                        list = vht.this.f31872x1;
                        c7394ca = new C7394ca("table-properties", crtVar);
                        break;
                    case 9:
                        enf enfVar = new enf(abstractC13912i5);
                        list = vht.this.f31872x1;
                        c7394ca = new C7394ca("table-column-properties", enfVar);
                        break;
                    case 10:
                        hj8 hj8Var = new hj8(abstractC13912i5);
                        list = vht.this.f31872x1;
                        c7394ca = new C7394ca("table-row-properties", hj8Var);
                        break;
                    case 11:
                        nk7 nk7Var = new nk7(abstractC13912i5);
                        list = vht.this.f31872x1;
                        c7394ca = new C7394ca("drawing-page-properties", nk7Var);
                        break;
                    default:
                        return false;
                }
                list.addItem(c7394ca);
                return true;
            }
        });
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        c3059ii.m12955x1("style:family", hj7.m33487k4(this.f31871k4));
        List.Enumerator<C7394ca> it = this.f31872x1.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f31870kk.m27428k4(next.m29539k4())) {
                    case 1:
                        ((im9) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                    case 2:
                        ((rsv) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                    case 3:
                        ((v9h) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                    case 4:
                        ((mdp) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                    case 5:
                        ((zob) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                    case 6:
                        ((lgn) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                    case 7:
                        ((eej) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                    case 8:
                        ((crt) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                    case 9:
                        ((enf) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                    case 10:
                        ((hj8) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                    case 11:
                        ((nk7) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
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
