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
public class ck8 extends AbstractC7361bz {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f21109x1 = new C7017h4("show-shape", "show-text", "hide-shape", "hide-text", "dim", "play", "animation-group");

    /* JADX INFO: renamed from: k4 */
    private List<C7394ca> f21110k4;

    public ck8() {
        m29649x1();
    }

    /* JADX INFO: renamed from: x1 */
    private void m29649x1() {
        this.f21110k4 = new List<>();
    }

    public ck8(final AbstractC13912i5 abstractC13912i5) {
        m29649x1();
        AbstractC7361bz.m29290k4(abstractC13912i5, new AbstractC7361bz.kk() { // from class: com.aspose.slides.internal.p7.ck8.1
            @Override // com.aspose.slides.internal.p332p7.AbstractC7361bz.kk
            /* JADX INFO: renamed from: k4 */
            public boolean mo27887k4(AbstractC13912i5 abstractC13912i52) {
                List list;
                C7394ca c7394ca;
                switch (ck8.f21109x1.m27428k4(abstractC13912i5.mo65023fa())) {
                    case 0:
                        j6m j6mVar = new j6m(abstractC13912i5);
                        list = ck8.this.f21110k4;
                        c7394ca = new C7394ca("show-shape", j6mVar);
                        break;
                    case 1:
                        shu shuVar = new shu(abstractC13912i5);
                        list = ck8.this.f21110k4;
                        c7394ca = new C7394ca("show-text", shuVar);
                        break;
                    case 2:
                        v7f v7fVar = new v7f(abstractC13912i5);
                        list = ck8.this.f21110k4;
                        c7394ca = new C7394ca("hide-shape", v7fVar);
                        break;
                    case 3:
                        dfx dfxVar = new dfx(abstractC13912i5);
                        list = ck8.this.f21110k4;
                        c7394ca = new C7394ca("hide-text", dfxVar);
                        break;
                    case 4:
                        stb stbVar = new stb(abstractC13912i5);
                        list = ck8.this.f21110k4;
                        c7394ca = new C7394ca("dim", stbVar);
                        break;
                    case 5:
                        eeo eeoVar = new eeo(abstractC13912i5);
                        list = ck8.this.f21110k4;
                        c7394ca = new C7394ca("play", eeoVar);
                        break;
                    case 6:
                        b0t b0tVar = new b0t(abstractC13912i5);
                        list = ck8.this.f21110k4;
                        c7394ca = new C7394ca("animation-group", b0tVar);
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
        List.Enumerator<C7394ca> it = this.f21110k4.iterator();
        while (it.hasNext()) {
            try {
                C7394ca next = it.next();
                switch (f21109x1.m27428k4(next.m29539k4())) {
                    case 0:
                        ((j6m) next.m29541kk()).mo6846k4("presentation", c3059ii, next.m29539k4());
                        break;
                    case 1:
                        ((shu) next.m29541kk()).mo6846k4("presentation", c3059ii, next.m29539k4());
                        break;
                    case 2:
                        ((v7f) next.m29541kk()).mo6846k4("presentation", c3059ii, next.m29539k4());
                        break;
                    case 3:
                        ((dfx) next.m29541kk()).mo6846k4("presentation", c3059ii, next.m29539k4());
                        break;
                    case 4:
                        ((stb) next.m29541kk()).mo6846k4("presentation", c3059ii, next.m29539k4());
                        break;
                    case 5:
                        ((eeo) next.m29541kk()).mo6846k4("presentation", c3059ii, next.m29539k4());
                        break;
                    case 6:
                        ((b0t) next.m29541kk()).mo6846k4("presentation", c3059ii, next.m29539k4());
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
