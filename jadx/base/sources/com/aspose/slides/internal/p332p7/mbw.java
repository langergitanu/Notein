package com.aspose.slides.internal.p332p7;

import com.alibaba.sdk.android.oss.common.RequestParameters;
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
public class mbw extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f26743x1 = new C7017h4("style", "list-style", "number-style", "currency-style", "percentage-style", "date-style", "time-style", "boolean-style", "text-style", "default-style", "outline-style", "notes-configuration", "bibliography-configuration", "linenumbering-configuration", "gradient", "linearGradient", "radialGradient", "hatch", "fill-image", RequestParameters.MARKER, "stroke-dash", "opacity", "presentation-page-layout", "table-template");

    /* JADX INFO: renamed from: k4 */
    private List<C7394ca> f26744k4;

    public mbw() {
        m36784kk();
    }

    /* JADX INFO: renamed from: kk */
    private void m36784kk() {
        this.f26744k4 = new List<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final List<C7394ca> m36786k4() {
        return this.f26744k4;
    }

    public mbw(final AbstractC13912i5 abstractC13912i5) {
        m36784kk();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.mbw.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (mbw.f26743x1.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        lzc lzcVar = new lzc(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca("style", lzcVar);
                        break;
                    case 1:
                        w7y w7yVar = new w7y(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca("list-style", w7yVar);
                        break;
                    case 2:
                        duw duwVar = new duw(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca("number-style", duwVar);
                        break;
                    case 3:
                        ka1 ka1Var = new ka1(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca("currency-style", ka1Var);
                        break;
                    case 4:
                        hy0 hy0Var = new hy0(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca("percentage-style", hy0Var);
                        break;
                    case 5:
                        wun wunVar = new wun(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca("date-style", wunVar);
                        break;
                    case 6:
                        oup oupVar = new oup(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca("time-style", oupVar);
                        break;
                    case 7:
                        g4c g4cVar = new g4c(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca("boolean-style", g4cVar);
                        break;
                    case 8:
                        uf9 uf9Var = new uf9(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca("text-style", uf9Var);
                        break;
                    case 9:
                        vht vhtVar = new vht(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca("default-style", vhtVar);
                        break;
                    case 10:
                        zy7 zy7Var = new zy7(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca("outline-style", zy7Var);
                        break;
                    case 11:
                        r5t r5tVar = new r5t(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca("notes-configuration", r5tVar);
                        break;
                    case 12:
                        g9n g9nVar = new g9n(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca("bibliography-configuration", g9nVar);
                        break;
                    case 13:
                        bay bayVar = new bay(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca("linenumbering-configuration", bayVar);
                        break;
                    case 14:
                        fp3 fp3Var = new fp3(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca("gradient", fp3Var);
                        break;
                    case 15:
                        kjw kjwVar = new kjw(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca("linearGradient", kjwVar);
                        break;
                    case 16:
                        ihc ihcVar = new ihc(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca("radialGradient", ihcVar);
                        break;
                    case 17:
                        rmh rmhVar = new rmh(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca("hatch", rmhVar);
                        break;
                    case 18:
                        ktl ktlVar = new ktl(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca("fill-image", ktlVar);
                        break;
                    case 19:
                        fwr fwrVar = new fwr(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca(RequestParameters.MARKER, fwrVar);
                        break;
                    case 20:
                        ry2 ry2Var = new ry2(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca("stroke-dash", ry2Var);
                        break;
                    case 21:
                        rrr rrrVar = new rrr(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca("opacity", rrrVar);
                        break;
                    case 22:
                        pkv pkvVar = new pkv(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca("presentation-page-layout", pkvVar);
                        break;
                    case 23:
                        xvt xvtVar = new xvt(abstractC13912i5);
                        list = mbw.this.f26744k4;
                        c7394ca = new C7394ca("table-template", xvtVar);
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
    public final C7394ca m36787k4(String str) {
        C7394ca c7394ca;
        switch (f26743x1.m27428k4(str)) {
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
                c7394ca = new C7394ca("default-style", new vht());
                break;
            case 10:
                c7394ca = new C7394ca("outline-style", new zy7());
                break;
            case 11:
                c7394ca = new C7394ca("notes-configuration", new r5t());
                break;
            case 12:
                c7394ca = new C7394ca("bibliography-configuration", new g9n());
                break;
            case 13:
                c7394ca = new C7394ca("linenumbering-configuration", new bay());
                break;
            case 14:
                c7394ca = new C7394ca("gradient", new fp3());
                break;
            case 15:
                c7394ca = new C7394ca("linearGradient", new kjw());
                break;
            case 16:
                c7394ca = new C7394ca("radialGradient", new ihc());
                break;
            case 17:
                c7394ca = new C7394ca("hatch", new rmh());
                break;
            case 18:
                c7394ca = new C7394ca("fill-image", new ktl());
                break;
            case 19:
                c7394ca = new C7394ca(RequestParameters.MARKER, new fwr());
                break;
            case 20:
                c7394ca = new C7394ca("stroke-dash", new ry2());
                break;
            case 21:
                c7394ca = new C7394ca("opacity", new rrr());
                break;
            case 22:
                c7394ca = new C7394ca("presentation-page-layout", new pkv());
                break;
            case 23:
                c7394ca = new C7394ca("table-template", new xvt());
                break;
            default:
                throw new Exception(C14113y2.m67408k4("Wrong element: ", str));
        }
        this.f26744k4.addItem(c7394ca);
        return c7394ca;
    }

    @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz
    /* JADX INFO: renamed from: k4 */
    public void mo6846k4(String str, C3059ii c3059ii, String str2) {
        c3059ii.mo12953k4(str, str2, (String) null);
        List.Enumerator<C7394ca> it = this.f26744k4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f26743x1.m27428k4(next.m29539k4())) {
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
                        ((vht) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                    case 10:
                        ((zy7) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        break;
                    case 11:
                        ((r5t) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        break;
                    case 12:
                        ((g9n) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        break;
                    case 13:
                        ((bay) next.m29541kk()).mo6846k4("text", c3059ii, next.m29539k4());
                        break;
                    case 14:
                        ((fp3) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 15:
                        ((kjw) next.m29541kk()).mo6846k4("svg", c3059ii, next.m29539k4());
                        break;
                    case 16:
                        ((ihc) next.m29541kk()).mo6846k4("svg", c3059ii, next.m29539k4());
                        break;
                    case 17:
                        ((rmh) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 18:
                        ((ktl) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 19:
                        ((fwr) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 20:
                        ((ry2) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 21:
                        ((rrr) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 22:
                        ((pkv) next.m29541kk()).mo6846k4("style", c3059ii, next.m29539k4());
                        break;
                    case 23:
                        ((xvt) next.m29541kk()).mo6846k4("table", c3059ii, next.m29539k4());
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
