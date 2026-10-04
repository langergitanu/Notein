package com.aspose.slides.internal.p332p7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3059ii;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class jhr extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f25135x1 = new C7017h4(DrawToolFactory.LASSO_TYPE_RECT, "line", "polyline", "polygon", "regular-polygon", "path", "circle", "ellipse", "g", "page-thumbnail", "frame", "measure", "caption", "connector", "control", "scene", "custom-shape");

    /* JADX INFO: renamed from: k4 */
    private List<C7394ca> f25136k4;

    public jhr() {
        m34705x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m34705x1() {
        this.f25136k4 = new List<>();
    }

    public jhr(final AbstractC13912i5 abstractC13912i5) {
        m34705x1();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.jhr.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (jhr.f25135x1.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        yxk yxkVar = new yxk(abstractC13912i5);
                        list = jhr.this.f25136k4;
                        c7394ca = new C7394ca(DrawToolFactory.LASSO_TYPE_RECT, yxkVar);
                        break;
                    case 1:
                        er2 er2Var = new er2(abstractC13912i5);
                        list = jhr.this.f25136k4;
                        c7394ca = new C7394ca("line", er2Var);
                        break;
                    case 2:
                        rpj rpjVar = new rpj(abstractC13912i5);
                        list = jhr.this.f25136k4;
                        c7394ca = new C7394ca("polyline", rpjVar);
                        break;
                    case 3:
                        z4k z4kVar = new z4k(abstractC13912i5);
                        list = jhr.this.f25136k4;
                        c7394ca = new C7394ca("polygon", z4kVar);
                        break;
                    case 4:
                        em0 em0Var = new em0(abstractC13912i5);
                        list = jhr.this.f25136k4;
                        c7394ca = new C7394ca("regular-polygon", em0Var);
                        break;
                    case 5:
                        tzu tzuVar = new tzu(abstractC13912i5);
                        list = jhr.this.f25136k4;
                        c7394ca = new C7394ca("path", tzuVar);
                        break;
                    case 6:
                        fmt fmtVar = new fmt(abstractC13912i5);
                        list = jhr.this.f25136k4;
                        c7394ca = new C7394ca("circle", fmtVar);
                        break;
                    case 7:
                        sd3 sd3Var = new sd3(abstractC13912i5);
                        list = jhr.this.f25136k4;
                        c7394ca = new C7394ca("ellipse", sd3Var);
                        break;
                    case 8:
                        pnk pnkVar = new pnk(abstractC13912i5);
                        list = jhr.this.f25136k4;
                        c7394ca = new C7394ca("g", pnkVar);
                        break;
                    case 9:
                        klm klmVar = new klm(abstractC13912i5);
                        list = jhr.this.f25136k4;
                        c7394ca = new C7394ca("page-thumbnail", klmVar);
                        break;
                    case 10:
                        vtn vtnVar = new vtn(abstractC13912i5);
                        list = jhr.this.f25136k4;
                        c7394ca = new C7394ca("frame", vtnVar);
                        break;
                    case 11:
                        s0k s0kVar = new s0k(abstractC13912i5);
                        list = jhr.this.f25136k4;
                        c7394ca = new C7394ca("measure", s0kVar);
                        break;
                    case 12:
                        zz0 zz0Var = new zz0(abstractC13912i5);
                        list = jhr.this.f25136k4;
                        c7394ca = new C7394ca("caption", zz0Var);
                        break;
                    case 13:
                        p9u p9uVar = new p9u(abstractC13912i5);
                        list = jhr.this.f25136k4;
                        c7394ca = new C7394ca("connector", p9uVar);
                        break;
                    case 14:
                        suk sukVar = new suk(abstractC13912i5);
                        list = jhr.this.f25136k4;
                        c7394ca = new C7394ca("control", sukVar);
                        break;
                    case 15:
                        hhy hhyVar = new hhy(abstractC13912i5);
                        list = jhr.this.f25136k4;
                        c7394ca = new C7394ca("scene", hhyVar);
                        break;
                    case 16:
                        h7e h7eVar = new h7e(abstractC13912i5);
                        list = jhr.this.f25136k4;
                        c7394ca = new C7394ca("custom-shape", h7eVar);
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
        List.Enumerator<C7394ca> it = this.f25136k4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f25135x1.m27428k4(next.m29539k4())) {
                    case 0:
                        ((yxk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 1:
                        ((er2) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 2:
                        ((rpj) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 3:
                        ((z4k) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 4:
                        ((em0) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 5:
                        ((tzu) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 6:
                        ((fmt) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 7:
                        ((sd3) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 8:
                        ((pnk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 9:
                        ((klm) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 10:
                        ((vtn) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 11:
                        ((s0k) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 12:
                        ((zz0) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 13:
                        ((p9u) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 14:
                        ((suk) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
                        break;
                    case 15:
                        ((hhy) next.m29541kk()).mo6846k4("dr3d", c3059ii, next.m29539k4());
                        break;
                    case 16:
                        ((h7e) next.m29541kk()).mo6846k4("draw", c3059ii, next.m29539k4());
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
